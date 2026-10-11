package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.download.DownloadAnimeGroup;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.OfflineDownloadMetadataKt;
import com.anistation.model.watch.WatchSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fj1 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ tm1 y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ fj1(tm1 tm1Var, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = tm1Var;
        this.z = ub2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        WatchSession watchSession = null;
        ub2 ub2Var = this.z;
        tm1 tm1Var = this.y;
        switch (b) {
            case 0:
                DownloadAnimeGroup downloadAnimeGroup = (DownloadAnimeGroup) obj;
                downloadAnimeGroup.getClass();
                tm1Var.e(downloadAnimeGroup.getAnimeId(), null);
                ub2Var.invoke(downloadAnimeGroup);
                return pn6Var;
            default:
                String str = (String) obj;
                str.getClass();
                tm1Var.getClass();
                Iterator it = ((pm1) tm1Var.d.getValue()).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        List<EpisodeDownload> downloads = ((DownloadAnimeGroup) obj2).getDownloads();
                        if (downloads == null || !downloads.isEmpty()) {
                            Iterator<T> it2 = downloads.iterator();
                            while (it2.hasNext()) {
                                if (a34.i(((EpisodeDownload) it2.next()).getId(), str)) {
                                }
                            }
                        }
                    } else {
                        obj2 = null;
                    }
                }
                DownloadAnimeGroup downloadAnimeGroup2 = (DownloadAnimeGroup) obj2;
                if (downloadAnimeGroup2 != null) {
                    Iterator<T> it3 = downloadAnimeGroup2.getDownloads().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            EpisodeDownload episodeDownload = (EpisodeDownload) obj3;
                            if (!a34.i(episodeDownload.getId(), str) || !episodeDownload.isCompleted()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    EpisodeDownload episodeDownload2 = (EpisodeDownload) obj3;
                    if (episodeDownload2 != null) {
                        List<EpisodeDownload> downloads2 = downloadAnimeGroup2.getDownloads();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : downloads2) {
                            EpisodeDownload episodeDownload3 = (EpisodeDownload) obj4;
                            if (episodeDownload3.isCompleted() && a34.i(OfflineDownloadMetadataKt.getAudioTrackKey(episodeDownload3.getMetadata()), OfflineDownloadMetadataKt.getAudioTrackKey(episodeDownload2.getMetadata()))) {
                                arrayList.add(obj4);
                            }
                        }
                        List<EpisodeDownload> C0 = yo0.C0(arrayList, new k82((byte) 17));
                        ArrayList arrayList2 = new ArrayList(zo0.V(C0, 10));
                        for (EpisodeDownload episodeDownload4 : C0) {
                            String str2 = episodeDownload4.getMetadata().getAnimeId() + "-" + episodeDownload4.getMetadata().getEpisodeNumber();
                            int episodeNumber = episodeDownload4.getMetadata().getEpisodeNumber();
                            String episodeTitle = episodeDownload4.getMetadata().getEpisodeTitle();
                            String thumbnailImage = episodeDownload4.getMetadata().getThumbnailImage();
                            if (thumbnailImage == null) {
                                thumbnailImage = episodeDownload4.getMetadata().getCoverImage();
                            }
                            arrayList2.add(new Episode(str2, episodeNumber, episodeTitle, thumbnailImage, episodeDownload4.getMetadata().getFiller(), episodeDownload4.getMetadata().getDescription(), episodeDownload4.getMetadata().getLength(), episodeDownload4.getMetadata().getAiredAt(), ""));
                        }
                        int anilistId = episodeDownload2.getMetadata().getAnilistId();
                        String anistationId = downloadAnimeGroup2.getAnistationId();
                        if (anistationId == null) {
                            anistationId = episodeDownload2.getMetadata().getAnistationId();
                        }
                        watchSession = new WatchSession(anistationId, anilistId, episodeDownload2.getMetadata().getMalId(), episodeDownload2.getMetadata().getEpisodeTitle(), arrayList2, episodeDownload2.getMetadata().getEpisodeNumber(), episodeDownload2.getMetadata().getSourceType(), OfflineDownloadMetadataKt.getAudioTrackKey(episodeDownload2.getMetadata()));
                    }
                }
                if (watchSession != null) {
                    ub2Var.invoke(watchSession);
                }
                return pn6Var;
        }
    }
}
