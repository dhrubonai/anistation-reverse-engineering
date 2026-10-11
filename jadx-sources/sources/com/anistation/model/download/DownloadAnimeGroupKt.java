package com.anistation.model.download;

import defpackage.a34;
import defpackage.b06;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DownloadAnimeGroupKt {
    public static final DownloadAnimeGroup findDownloadGroup(List<DownloadAnimeGroup> list, String str, Integer num) {
        Object obj;
        Object obj2;
        list.getClass();
        str.getClass();
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (a34.i(((DownloadAnimeGroup) obj2).getAnimeId(), str)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        DownloadAnimeGroup downloadAnimeGroup = (DownloadAnimeGroup) obj2;
        if (downloadAnimeGroup != null) {
            return downloadAnimeGroup;
        }
        if (num == null) {
            num = b06.J(10, str);
        }
        if (num == null) {
            return null;
        }
        if (num.intValue() <= 0) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        Iterator<T> it2 = list.iterator();
        boolean z = false;
        Object obj3 = null;
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                if (((DownloadAnimeGroup) next).getAnilistId() == intValue) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj3 = next;
                }
            } else if (z) {
                obj = obj3;
            }
        }
        return (DownloadAnimeGroup) obj;
    }

    public static /* synthetic */ DownloadAnimeGroup findDownloadGroup$default(List list, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return findDownloadGroup(list, str, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0101, code lost:
    
        if (r5 == null) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.anistation.model.download.DownloadAnimeGroup> groupEpisodeDownloads(java.util.List<com.anistation.model.download.EpisodeDownload> r12) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anistation.model.download.DownloadAnimeGroupKt.groupEpisodeDownloads(java.util.List):java.util.List");
    }
}
