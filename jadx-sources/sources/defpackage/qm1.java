package defpackage;

import com.anistation.model.download.DownloadAnimeGroup;
import com.anistation.model.download.DownloadAnimeGroupKt;
import com.anistation.model.download.DownloadSettings;
import com.anistation.model.download.DownloadStorageUsage;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.EpisodeDownloadState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qm1 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ tm1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm1(tm1 tm1Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = tm1Var;
    }

    public static final String i(List list, pm1 pm1Var, String str) {
        Object obj;
        LinkedHashSet linkedHashSet;
        Object obj2;
        String str2;
        DownloadAnimeGroup findDownloadGroup;
        String animeId;
        Set set;
        List<EpisodeDownload> downloads;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (a34.i(((DownloadAnimeGroup) obj).getAnimeId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        DownloadAnimeGroup downloadAnimeGroup = (DownloadAnimeGroup) obj;
        if (downloadAnimeGroup != null) {
            return downloadAnimeGroup.getAnimeId();
        }
        DownloadAnimeGroup findDownloadGroup$default = DownloadAnimeGroupKt.findDownloadGroup$default(pm1Var.a, str, null, 2, null);
        if (findDownloadGroup$default != null && (downloads = findDownloadGroup$default.getDownloads()) != null) {
            linkedHashSet = new LinkedHashSet();
            Iterator<T> it2 = downloads.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(((EpisodeDownload) it2.next()).getId());
            }
        } else {
            linkedHashSet = null;
        }
        Iterator it3 = list.iterator();
        loop2: while (true) {
            if (it3.hasNext()) {
                obj2 = it3.next();
                List<EpisodeDownload> downloads2 = ((DownloadAnimeGroup) obj2).getDownloads();
                if (downloads2 == null || !downloads2.isEmpty()) {
                    for (EpisodeDownload episodeDownload : downloads2) {
                        if (linkedHashSet == null) {
                            set = tt1.x;
                        } else {
                            set = linkedHashSet;
                        }
                        if (set.contains(episodeDownload.getId())) {
                            break loop2;
                        }
                    }
                }
            } else {
                obj2 = null;
                break;
            }
        }
        DownloadAnimeGroup downloadAnimeGroup2 = (DownloadAnimeGroup) obj2;
        if (downloadAnimeGroup2 != null && (animeId = downloadAnimeGroup2.getAnimeId()) != null) {
            return animeId;
        }
        if (findDownloadGroup$default != null && (findDownloadGroup = DownloadAnimeGroupKt.findDownloadGroup(list, str, Integer.valueOf(findDownloadGroup$default.getAnilistId()))) != null) {
            str2 = findDownloadGroup.getAnimeId();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            DownloadAnimeGroup findDownloadGroup$default2 = DownloadAnimeGroupKt.findDownloadGroup$default(list, str, null, 2, null);
            if (findDownloadGroup$default2 == null) {
                return null;
            }
            return findDownloadGroup$default2.getAnimeId();
        }
        return str2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        tm1 tm1Var = this.z;
        switch (b) {
            case 0:
                qm1 qm1Var = new qm1(tm1Var, vz0Var, (byte) 0);
                qm1Var.y = obj;
                return qm1Var;
            case 1:
                qm1 qm1Var2 = new qm1(tm1Var, vz0Var, (byte) 1);
                qm1Var2.y = obj;
                return qm1Var2;
            case 2:
                qm1 qm1Var3 = new qm1(tm1Var, vz0Var, (byte) 2);
                qm1Var3.y = obj;
                return qm1Var3;
            default:
                qm1 qm1Var4 = new qm1(tm1Var, vz0Var, (byte) 3);
                qm1Var4.y = obj;
                return qm1Var4;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((qm1) create((List) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((qm1) create((DownloadSettings) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                ((qm1) create((DownloadStorageUsage) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((qm1) create((List) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        pm1 pm1Var;
        String str;
        String str2;
        LinkedHashSet linkedHashSet;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        tm1 tm1Var = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    if (((EpisodeDownload) obj3).getState() != EpisodeDownloadState.REMOVING) {
                        arrayList.add(obj3);
                    }
                }
                List<DownloadAnimeGroup> groupEpisodeDownloads = DownloadAnimeGroupKt.groupEpisodeDownloads(arrayList);
                sx5 sx5Var = tm1Var.d;
                do {
                    value = sx5Var.getValue();
                    pm1Var = (pm1) value;
                    String str3 = pm1Var.b;
                    if (str3 != null) {
                        str = i(groupEpisodeDownloads, pm1Var, str3);
                    } else {
                        str = null;
                    }
                    str2 = str;
                    Set set = pm1Var.d;
                    linkedHashSet = new LinkedHashSet();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        String i = i(groupEpisodeDownloads, pm1Var, (String) it.next());
                        if (i != null) {
                            linkedHashSet.add(i);
                        }
                    }
                } while (!sx5Var.j(value, pm1.a(pm1Var, groupEpisodeDownloads, str2, false, linkedHashSet, null, null, null, false, 116)));
                return pn6Var;
            case 1:
                DownloadSettings downloadSettings = (DownloadSettings) obj2;
                m37.N(obj);
                sx5 sx5Var2 = tm1Var.d;
                do {
                    value2 = sx5Var2.getValue();
                } while (!sx5Var2.j(value2, pm1.a((pm1) value2, null, null, false, null, null, downloadSettings, null, false, 223)));
                return pn6Var;
            case 2:
                DownloadStorageUsage downloadStorageUsage = (DownloadStorageUsage) obj2;
                m37.N(obj);
                sx5 sx5Var3 = tm1Var.d;
                do {
                    value3 = sx5Var3.getValue();
                } while (!sx5Var3.j(value3, pm1.a((pm1) value3, null, null, false, null, null, null, downloadStorageUsage, false, 191)));
                return pn6Var;
            default:
                List list = (List) obj2;
                m37.N(obj);
                sx5 sx5Var4 = tm1Var.d;
                do {
                    value4 = sx5Var4.getValue();
                } while (!sx5Var4.j(value4, pm1.a((pm1) value4, null, null, false, null, list, null, null, false, 239)));
                return pn6Var;
        }
    }
}
