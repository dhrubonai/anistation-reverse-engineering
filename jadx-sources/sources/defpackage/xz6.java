package defpackage;

import com.anistation.model.Info;
import com.anistation.model.MediaStatus;
import com.anistation.model.NextAiringEpisode;
import com.anistation.model.Resource;
import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.library.AnimeListItem;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xz6 extends t36 implements ic2 {
    public final /* synthetic */ v27 x;
    public final /* synthetic */ w44 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz6(v27 v27Var, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = v27Var;
        this.y = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new xz6(this.x, this.y, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        xz6 xz6Var = (xz6) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        xz6Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Resource.Success success;
        Info info;
        Integer num;
        WatchStatus watchStatus;
        MediaStatus mediaStatus;
        Integer num2;
        WatchStatus watchStatus2;
        Resource.Success success2;
        Info info2;
        Integer episodeNumber;
        m37.N(obj);
        tw5 tw5Var = s07.a;
        w44 w44Var = this.y;
        boolean z = ((ym6) w44Var.getValue()).D;
        pn6 pn6Var = pn6.a;
        if (z) {
            Resource resource = ((ym6) w44Var.getValue()).u;
            if (resource instanceof Resource.Success) {
                success = (Resource.Success) resource;
            } else {
                success = null;
            }
            if (success != null && (info = (Info) success.getData()) != null) {
                AnimeListItem animeListItem = ((ym6) w44Var.getValue()).C;
                NextAiringEpisode nextAiringEpisode = info.getNextAiringEpisode();
                boolean z2 = true;
                if (nextAiringEpisode != null && (episodeNumber = nextAiringEpisode.getEpisodeNumber()) != null) {
                    num = new Integer(episodeNumber.intValue() - 1);
                } else {
                    num = null;
                }
                int size = ((ym6) w44Var.getValue()).c.size();
                if (animeListItem != null) {
                    watchStatus = animeListItem.getWatchStatus();
                } else {
                    watchStatus = null;
                }
                int i = 0;
                if (watchStatus != WatchStatus.PLAN_TO_WATCH) {
                    z2 = false;
                }
                if (animeListItem != null) {
                    mediaStatus = animeListItem.getMediaStatus();
                } else {
                    mediaStatus = null;
                }
                if (mediaStatus != info.getStatus() || (num != null && animeListItem.getCurrentAiredEpisodes() != num.intValue())) {
                    Integer totalEpisodes = info.getTotalEpisodes();
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        Integer totalEpisodes2 = info.getTotalEpisodes();
                        if (totalEpisodes2 != null) {
                            i = totalEpisodes2.intValue();
                        } else {
                            if (animeListItem != null) {
                                num2 = new Integer(animeListItem.getCurrentAiredEpisodes());
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                i = num2.intValue();
                            }
                        }
                    }
                    int i2 = i;
                    if (z2 || animeListItem == null) {
                        watchStatus2 = null;
                    } else {
                        watchStatus2 = animeListItem.getWatchStatus();
                    }
                    v27 v27Var = this.x;
                    Resource resource2 = ((ym6) v27Var.n.getValue()).u;
                    if (resource2 instanceof Resource.Success) {
                        success2 = (Resource.Success) resource2;
                    } else {
                        success2 = null;
                    }
                    if (success2 != null && (info2 = (Info) success2.getData()) != null) {
                        tl7.z(zz.J(v27Var), null, null, new of1(v27Var, info2, totalEpisodes, i2, size, watchStatus2, null, (byte) 1), 3);
                    }
                }
            }
        }
        return pn6Var;
    }
}
