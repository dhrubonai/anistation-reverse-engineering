package com.anistation.model.library;

import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.h11;
import defpackage.qx1;
import defpackage.uz5;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class WatchProgress {
    private final int anilistId;
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WatchProgress(java.lang.String r19, java.lang.String r20, int r21, int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, long r28, long r30, boolean r32, long r33, int r35, defpackage.q71 r36) {
        /*
            r18 = this;
            r0 = r35 & 2
            if (r0 == 0) goto L21
            r0 = 0
            r3 = r0
        L6:
            r1 = r18
            r2 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r13 = r30
            r15 = r32
            r16 = r33
            goto L24
        L21:
            r3 = r20
            goto L6
        L24:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anistation.model.library.WatchProgress.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, long, boolean, long, int, q71):void");
    }

    public static /* synthetic */ WatchProgress copy$default(WatchProgress watchProgress, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, int i3, long j, long j2, boolean z, long j3, int i4, Object obj) {
        String str7;
        String str8;
        int i5;
        int i6;
        String str9;
        String str10;
        String str11;
        String str12;
        int i7;
        long j4;
        long j5;
        boolean z2;
        long j6;
        String str13;
        if ((i4 & 1) != 0) {
            str7 = watchProgress.id;
        } else {
            str7 = str;
        }
        if ((i4 & 2) != 0) {
            str8 = watchProgress.anistationId;
        } else {
            str8 = str2;
        }
        if ((i4 & 4) != 0) {
            i5 = watchProgress.anilistId;
        } else {
            i5 = i;
        }
        if ((i4 & 8) != 0) {
            i6 = watchProgress.malId;
        } else {
            i6 = i2;
        }
        if ((i4 & 16) != 0) {
            str9 = watchProgress.animeTitle;
        } else {
            str9 = str3;
        }
        if ((i4 & 32) != 0) {
            str10 = watchProgress.episodeTitle;
        } else {
            str10 = str4;
        }
        if ((i4 & 64) != 0) {
            str11 = watchProgress.coverImage;
        } else {
            str11 = str5;
        }
        if ((i4 & 128) != 0) {
            str12 = watchProgress.thumbnailImage;
        } else {
            str12 = str6;
        }
        if ((i4 & 256) != 0) {
            i7 = watchProgress.episodeNumber;
        } else {
            i7 = i3;
        }
        if ((i4 & 512) != 0) {
            j4 = watchProgress.positionMs;
        } else {
            j4 = j;
        }
        if ((i4 & 1024) != 0) {
            j5 = watchProgress.durationMs;
        } else {
            j5 = j2;
        }
        if ((i4 & 2048) != 0) {
            z2 = watchProgress.completed;
        } else {
            z2 = z;
        }
        if ((i4 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            str13 = str7;
            j6 = watchProgress.updatedAt;
        } else {
            j6 = j3;
            str13 = str7;
        }
        return watchProgress.copy(str13, str8, i5, i6, str9, str10, str11, str12, i7, j4, j5, z2, j6);
    }

    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.positionMs;
    }

    public final long component11() {
        return this.durationMs;
    }

    public final boolean component12() {
        return this.completed;
    }

    public final long component13() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.anistationId;
    }

    public final int component3() {
        return this.anilistId;
    }

    public final int component4() {
        return this.malId;
    }

    public final String component5() {
        return this.animeTitle;
    }

    public final String component6() {
        return this.episodeTitle;
    }

    public final String component7() {
        return this.coverImage;
    }

    public final String component8() {
        return this.thumbnailImage;
    }

    public final int component9() {
        return this.episodeNumber;
    }

    public final WatchProgress copy(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, int i3, long j, long j2, boolean z, long j3) {
        str.getClass();
        str4.getClass();
        return new WatchProgress(str, str2, i, i2, str3, str4, str5, str6, i3, j, j2, z, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchProgress)) {
            return false;
        }
        WatchProgress watchProgress = (WatchProgress) obj;
        if (a34.i(this.id, watchProgress.id) && a34.i(this.anistationId, watchProgress.anistationId) && this.anilistId == watchProgress.anilistId && this.malId == watchProgress.malId && a34.i(this.animeTitle, watchProgress.animeTitle) && a34.i(this.episodeTitle, watchProgress.episodeTitle) && a34.i(this.coverImage, watchProgress.coverImage) && a34.i(this.thumbnailImage, watchProgress.thumbnailImage) && this.episodeNumber == watchProgress.episodeNumber && this.positionMs == watchProgress.positionMs && this.durationMs == watchProgress.durationMs && this.completed == watchProgress.completed && this.updatedAt == watchProgress.updatedAt) {
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
        int hashCode4 = this.id.hashCode() * 31;
        String str = this.anistationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.malId, qx1.c(this.anilistId, (hashCode4 + hashCode) * 31, 31), 31);
        String str2 = this.animeTitle;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = zo5.i(this.episodeTitle, (c + hashCode2) * 31, 31);
        String str3 = this.coverImage;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.thumbnailImage;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return Long.hashCode(this.updatedAt) + zo5.g(qx1.d(qx1.d(qx1.c(this.episodeNumber, (i3 + i) * 31, 31), this.positionMs, 31), this.durationMs, 31), 31, this.completed);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.anistationId;
        int i = this.anilistId;
        int i2 = this.malId;
        String str3 = this.animeTitle;
        String str4 = this.episodeTitle;
        String str5 = this.coverImage;
        String str6 = this.thumbnailImage;
        int i3 = this.episodeNumber;
        long j = this.positionMs;
        long j2 = this.durationMs;
        boolean z = this.completed;
        long j3 = this.updatedAt;
        StringBuilder o = h11.o("WatchProgress(id=", str, ", anistationId=", str2, ", anilistId=");
        h11.y(o, i, ", malId=", i2, ", animeTitle=");
        qx1.x(o, str3, ", episodeTitle=", str4, ", coverImage=");
        qx1.x(o, str5, ", thumbnailImage=", str6, ", episodeNumber=");
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

    public WatchProgress(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, int i3, long j, long j2, boolean z, long j3) {
        str.getClass();
        str4.getClass();
        this.id = str;
        this.anistationId = str2;
        this.anilistId = i;
        this.malId = i2;
        this.animeTitle = str3;
        this.episodeTitle = str4;
        this.coverImage = str5;
        this.thumbnailImage = str6;
        this.episodeNumber = i3;
        this.positionMs = j;
        this.durationMs = j2;
        this.completed = z;
        this.updatedAt = j3;
    }
}
