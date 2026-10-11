package com.anistation.model.download;

import defpackage.a34;
import defpackage.h11;
import defpackage.q71;
import defpackage.qx1;
import defpackage.uz5;
import defpackage.zo5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DownloadAnimeGroup {
    private final int anilistId;
    private final String animeTitle;
    private final String anistationId;
    private final String bannerImage;
    private final String coverImage;
    private final List<EpisodeDownload> downloads;

    public DownloadAnimeGroup(String str, int i, String str2, String str3, String str4, List<EpisodeDownload> list) {
        str2.getClass();
        list.getClass();
        this.anistationId = str;
        this.anilistId = i;
        this.animeTitle = str2;
        this.coverImage = str3;
        this.bannerImage = str4;
        this.downloads = list;
    }

    public static /* synthetic */ DownloadAnimeGroup copy$default(DownloadAnimeGroup downloadAnimeGroup, String str, int i, String str2, String str3, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = downloadAnimeGroup.anistationId;
        }
        if ((i2 & 2) != 0) {
            i = downloadAnimeGroup.anilistId;
        }
        if ((i2 & 4) != 0) {
            str2 = downloadAnimeGroup.animeTitle;
        }
        if ((i2 & 8) != 0) {
            str3 = downloadAnimeGroup.coverImage;
        }
        if ((i2 & 16) != 0) {
            str4 = downloadAnimeGroup.bannerImage;
        }
        if ((i2 & 32) != 0) {
            list = downloadAnimeGroup.downloads;
        }
        String str5 = str4;
        List list2 = list;
        return downloadAnimeGroup.copy(str, i, str2, str3, str5, list2);
    }

    public final String component1() {
        return this.anistationId;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final String component3() {
        return this.animeTitle;
    }

    public final String component4() {
        return this.coverImage;
    }

    public final String component5() {
        return this.bannerImage;
    }

    public final List<EpisodeDownload> component6() {
        return this.downloads;
    }

    public final DownloadAnimeGroup copy(String str, int i, String str2, String str3, String str4, List<EpisodeDownload> list) {
        str2.getClass();
        list.getClass();
        return new DownloadAnimeGroup(str, i, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadAnimeGroup)) {
            return false;
        }
        DownloadAnimeGroup downloadAnimeGroup = (DownloadAnimeGroup) obj;
        if (a34.i(this.anistationId, downloadAnimeGroup.anistationId) && this.anilistId == downloadAnimeGroup.anilistId && a34.i(this.animeTitle, downloadAnimeGroup.animeTitle) && a34.i(this.coverImage, downloadAnimeGroup.coverImage) && a34.i(this.bannerImage, downloadAnimeGroup.bannerImage) && a34.i(this.downloads, downloadAnimeGroup.downloads)) {
            return true;
        }
        return false;
    }

    public final int getAnilistId() {
        return this.anilistId;
    }

    public final String getAnimeId() {
        String obj;
        String str = this.anistationId;
        if (str != null && (obj = uz5.w0(str).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return String.valueOf(this.anilistId);
    }

    public final String getAnimeTitle() {
        return this.animeTitle;
    }

    public final String getAnistationId() {
        return this.anistationId;
    }

    public final String getBannerImage() {
        return this.bannerImage;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final List<EpisodeDownload> getDownloads() {
        return this.downloads;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.anistationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = zo5.i(this.animeTitle, qx1.c(this.anilistId, hashCode * 31, 31), 31);
        String str2 = this.coverImage;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.bannerImage;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.downloads.hashCode() + ((i3 + i) * 31);
    }

    public String toString() {
        String str = this.anistationId;
        int i = this.anilistId;
        String str2 = this.animeTitle;
        String str3 = this.coverImage;
        String str4 = this.bannerImage;
        List<EpisodeDownload> list = this.downloads;
        StringBuilder m = h11.m(i, "DownloadAnimeGroup(anistationId=", str, ", anilistId=", ", animeTitle=");
        qx1.x(m, str2, ", coverImage=", str3, ", bannerImage=");
        m.append(str4);
        m.append(", downloads=");
        m.append(list);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ DownloadAnimeGroup(String str, int i, String str2, String str3, String str4, List list, int i2, q71 q71Var) {
        this((i2 & 1) != 0 ? null : str, i, str2, str3, (i2 & 16) != 0 ? null : str4, list);
    }
}
