package com.anistation.local.entity;

import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.h11;
import defpackage.q71;
import defpackage.qx1;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WatchProgress {
    private final int anilistId;
    private final String animeId;
    private final String animeTitle;
    private final String anistationId;
    private final boolean completed;
    private final String coverImage;
    private final long durationMs;
    private final int episodeNumber;
    private final String episodeTitle;
    private final String id;
    private final int malId;
    private final long positionMs;
    private final String thumbnailImage;
    private final long updatedAt;

    public WatchProgress(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, int i3, long j, long j2, boolean z, long j3) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        this.id = str;
        this.animeId = str2;
        this.anistationId = str3;
        this.anilistId = i;
        this.malId = i2;
        this.animeTitle = str4;
        this.episodeTitle = str5;
        this.coverImage = str6;
        this.thumbnailImage = str7;
        this.episodeNumber = i3;
        this.positionMs = j;
        this.durationMs = j2;
        this.completed = z;
        this.updatedAt = j3;
    }

    public static /* synthetic */ WatchProgress copy$default(WatchProgress watchProgress, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, int i3, long j, long j2, boolean z, long j3, int i4, Object obj) {
        String str8;
        String str9;
        String str10;
        int i5;
        int i6;
        String str11;
        String str12;
        String str13;
        String str14;
        int i7;
        long j4;
        long j5;
        boolean z2;
        long j6;
        boolean z3;
        String str15;
        WatchProgress watchProgress2;
        String str16;
        String str17;
        int i8;
        int i9;
        String str18;
        String str19;
        String str20;
        String str21;
        int i10;
        long j7;
        long j8;
        if ((i4 & 1) != 0) {
            str8 = watchProgress.id;
        } else {
            str8 = str;
        }
        if ((i4 & 2) != 0) {
            str9 = watchProgress.animeId;
        } else {
            str9 = str2;
        }
        if ((i4 & 4) != 0) {
            str10 = watchProgress.anistationId;
        } else {
            str10 = str3;
        }
        if ((i4 & 8) != 0) {
            i5 = watchProgress.anilistId;
        } else {
            i5 = i;
        }
        if ((i4 & 16) != 0) {
            i6 = watchProgress.malId;
        } else {
            i6 = i2;
        }
        if ((i4 & 32) != 0) {
            str11 = watchProgress.animeTitle;
        } else {
            str11 = str4;
        }
        if ((i4 & 64) != 0) {
            str12 = watchProgress.episodeTitle;
        } else {
            str12 = str5;
        }
        if ((i4 & 128) != 0) {
            str13 = watchProgress.coverImage;
        } else {
            str13 = str6;
        }
        if ((i4 & 256) != 0) {
            str14 = watchProgress.thumbnailImage;
        } else {
            str14 = str7;
        }
        if ((i4 & 512) != 0) {
            i7 = watchProgress.episodeNumber;
        } else {
            i7 = i3;
        }
        if ((i4 & 1024) != 0) {
            j4 = watchProgress.positionMs;
        } else {
            j4 = j;
        }
        if ((i4 & 2048) != 0) {
            j5 = watchProgress.durationMs;
        } else {
            j5 = j2;
        }
        String str22 = str8;
        if ((i4 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            z2 = watchProgress.completed;
        } else {
            z2 = z;
        }
        if ((i4 & 8192) != 0) {
            z3 = z2;
            j6 = watchProgress.updatedAt;
            str16 = str9;
            str17 = str10;
            i8 = i5;
            i9 = i6;
            str18 = str11;
            str19 = str12;
            str20 = str13;
            str21 = str14;
            i10 = i7;
            j7 = j4;
            j8 = j5;
            str15 = str22;
            watchProgress2 = watchProgress;
        } else {
            j6 = j3;
            z3 = z2;
            str15 = str22;
            watchProgress2 = watchProgress;
            str16 = str9;
            str17 = str10;
            i8 = i5;
            i9 = i6;
            str18 = str11;
            str19 = str12;
            str20 = str13;
            str21 = str14;
            i10 = i7;
            j7 = j4;
            j8 = j5;
        }
        return watchProgress2.copy(str15, str16, str17, i8, i9, str18, str19, str20, str21, i10, j7, j8, z3, j6);
    }

    public final String component1() {
        return this.id;
    }

    public final int component10() {
        return this.episodeNumber;
    }

    public final long component11() {
        return this.positionMs;
    }

    public final long component12() {
        return this.durationMs;
    }

    public final boolean component13() {
        return this.completed;
    }

    public final long component14() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.animeId;
    }

    public final String component3() {
        return this.anistationId;
    }

    public final int component4() {
        return this.anilistId;
    }

    public final int component5() {
        return this.malId;
    }

    public final String component6() {
        return this.animeTitle;
    }

    public final String component7() {
        return this.episodeTitle;
    }

    public final String component8() {
        return this.coverImage;
    }

    public final String component9() {
        return this.thumbnailImage;
    }

    public final WatchProgress copy(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, int i3, long j, long j2, boolean z, long j3) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        return new WatchProgress(str, str2, str3, i, i2, str4, str5, str6, str7, i3, j, j2, z, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchProgress)) {
            return false;
        }
        WatchProgress watchProgress = (WatchProgress) obj;
        if (a34.i(this.id, watchProgress.id) && a34.i(this.animeId, watchProgress.animeId) && a34.i(this.anistationId, watchProgress.anistationId) && this.anilistId == watchProgress.anilistId && this.malId == watchProgress.malId && a34.i(this.animeTitle, watchProgress.animeTitle) && a34.i(this.episodeTitle, watchProgress.episodeTitle) && a34.i(this.coverImage, watchProgress.coverImage) && a34.i(this.thumbnailImage, watchProgress.thumbnailImage) && this.episodeNumber == watchProgress.episodeNumber && this.positionMs == watchProgress.positionMs && this.durationMs == watchProgress.durationMs && this.completed == watchProgress.completed && this.updatedAt == watchProgress.updatedAt) {
            return true;
        }
        return false;
    }

    public final int getAnilistId() {
        return this.anilistId;
    }

    public final String getAnimeId() {
        return this.animeId;
    }

    public final String getAnimeTitle() {
        return this.animeTitle;
    }

    public final String getAnistationId() {
        return this.anistationId;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final String getEpisodeTitle() {
        return this.episodeTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMalId() {
        return this.malId;
    }

    public final long getPositionMs() {
        return this.positionMs;
    }

    public final String getThumbnailImage() {
        return this.thumbnailImage;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = zo5.i(this.animeId, this.id.hashCode() * 31, 31);
        String str = this.anistationId;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.malId, qx1.c(this.anilistId, (i + hashCode) * 31, 31), 31);
        String str2 = this.animeTitle;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = zo5.i(this.episodeTitle, (c + hashCode2) * 31, 31);
        String str3 = this.coverImage;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.thumbnailImage;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return Long.hashCode(this.updatedAt) + zo5.g(qx1.d(qx1.d(qx1.c(this.episodeNumber, (i4 + i2) * 31, 31), this.positionMs, 31), this.durationMs, 31), 31, this.completed);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.animeId;
        String str3 = this.anistationId;
        int i = this.anilistId;
        int i2 = this.malId;
        String str4 = this.animeTitle;
        String str5 = this.episodeTitle;
        String str6 = this.coverImage;
        String str7 = this.thumbnailImage;
        int i3 = this.episodeNumber;
        long j = this.positionMs;
        long j2 = this.durationMs;
        boolean z = this.completed;
        long j3 = this.updatedAt;
        StringBuilder o = h11.o("WatchProgress(id=", str, ", animeId=", str2, ", anistationId=");
        o.append(str3);
        o.append(", anilistId=");
        o.append(i);
        o.append(", malId=");
        o.append(i2);
        o.append(", animeTitle=");
        o.append(str4);
        o.append(", episodeTitle=");
        qx1.x(o, str5, ", coverImage=", str6, ", thumbnailImage=");
        o.append(str7);
        o.append(", episodeNumber=");
        o.append(i3);
        o.append(", positionMs=");
        o.append(j);
        qx1.w(o, ", durationMs=", j2, ", completed=");
        o.append(z);
        o.append(", updatedAt=");
        o.append(j3);
        o.append(")");
        return o.toString();
    }

    public /* synthetic */ WatchProgress(String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, int i3, long j, long j2, boolean z, long j3, int i4, q71 q71Var) {
        this(str, str2, (i4 & 4) != 0 ? null : str3, i, i2, str4, str5, str6, str7, i3, j, j2, z, j3);
    }
}
