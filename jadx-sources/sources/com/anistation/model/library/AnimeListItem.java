package com.anistation.model.library;

import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.anistation.model.animelist.WatchStatus;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.h11;
import defpackage.qx1;
import defpackage.uz5;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AnimeListItem {
    private final int anilistId;
    private final String anistationId;
    private final String bannerImage;
    private final String coverImage;
    private final long createdAt;
    private final int currentAiredEpisodes;
    private final MediaFormat format;
    private final int importedProgress;
    private final Integer malId;
    private final MediaStatus mediaStatus;
    private final String notes;
    private final int score;
    private final String title;
    private final Integer totalEpisodes;
    private final long updatedAt;
    private final WatchStatus watchStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AnimeListItem(java.lang.String r23, int r24, java.lang.Integer r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, int r30, com.anistation.model.MediaStatus r31, com.anistation.model.animelist.WatchStatus r32, int r33, int r34, com.anistation.model.MediaFormat r35, java.lang.String r36, long r37, long r39, int r41, defpackage.q71 r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r23
        Lb:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L13
            com.anistation.model.animelist.WatchStatus r1 = com.anistation.model.animelist.WatchStatus.PLAN_TO_WATCH
            r13 = r1
            goto L15
        L13:
            r13 = r32
        L15:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r1 == 0) goto L1c
            r14 = r3
            goto L1e
        L1c:
            r14 = r33
        L1e:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L24
            r15 = r3
            goto L26
        L24:
            r15 = r34
        L26:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L45
            r17 = r2
        L2c:
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r16 = r35
            r18 = r37
            r20 = r39
            goto L48
        L45:
            r17 = r36
            goto L2c
        L48:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anistation.model.library.AnimeListItem.<init>(java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, com.anistation.model.MediaStatus, com.anistation.model.animelist.WatchStatus, int, int, com.anistation.model.MediaFormat, java.lang.String, long, long, int, q71):void");
    }

    public static /* synthetic */ AnimeListItem copy$default(AnimeListItem animeListItem, String str, int i, Integer num, String str2, String str3, String str4, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, int i4, MediaFormat mediaFormat, String str5, long j, long j2, int i5, Object obj) {
        String str6;
        int i6;
        Integer num3;
        String str7;
        String str8;
        String str9;
        Integer num4;
        int i7;
        MediaStatus mediaStatus2;
        WatchStatus watchStatus2;
        int i8;
        int i9;
        MediaFormat mediaFormat2;
        String str10;
        long j3;
        long j4;
        long j5;
        String str11;
        AnimeListItem animeListItem2;
        int i10;
        Integer num5;
        String str12;
        String str13;
        String str14;
        Integer num6;
        int i11;
        MediaStatus mediaStatus3;
        WatchStatus watchStatus3;
        int i12;
        int i13;
        MediaFormat mediaFormat3;
        String str15;
        if ((i5 & 1) != 0) {
            str6 = animeListItem.anistationId;
        } else {
            str6 = str;
        }
        if ((i5 & 2) != 0) {
            i6 = animeListItem.anilistId;
        } else {
            i6 = i;
        }
        if ((i5 & 4) != 0) {
            num3 = animeListItem.malId;
        } else {
            num3 = num;
        }
        if ((i5 & 8) != 0) {
            str7 = animeListItem.title;
        } else {
            str7 = str2;
        }
        if ((i5 & 16) != 0) {
            str8 = animeListItem.coverImage;
        } else {
            str8 = str3;
        }
        if ((i5 & 32) != 0) {
            str9 = animeListItem.bannerImage;
        } else {
            str9 = str4;
        }
        if ((i5 & 64) != 0) {
            num4 = animeListItem.totalEpisodes;
        } else {
            num4 = num2;
        }
        if ((i5 & 128) != 0) {
            i7 = animeListItem.currentAiredEpisodes;
        } else {
            i7 = i2;
        }
        if ((i5 & 256) != 0) {
            mediaStatus2 = animeListItem.mediaStatus;
        } else {
            mediaStatus2 = mediaStatus;
        }
        if ((i5 & 512) != 0) {
            watchStatus2 = animeListItem.watchStatus;
        } else {
            watchStatus2 = watchStatus;
        }
        if ((i5 & 1024) != 0) {
            i8 = animeListItem.importedProgress;
        } else {
            i8 = i3;
        }
        if ((i5 & 2048) != 0) {
            i9 = animeListItem.score;
        } else {
            i9 = i4;
        }
        if ((i5 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            mediaFormat2 = animeListItem.format;
        } else {
            mediaFormat2 = mediaFormat;
        }
        if ((i5 & 8192) != 0) {
            str10 = animeListItem.notes;
        } else {
            str10 = str5;
        }
        String str16 = str6;
        if ((i5 & 16384) != 0) {
            j3 = animeListItem.createdAt;
        } else {
            j3 = j;
        }
        if ((i5 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            j5 = j3;
            j4 = animeListItem.updatedAt;
            i10 = i6;
            num5 = num3;
            str12 = str7;
            str13 = str8;
            str14 = str9;
            num6 = num4;
            i11 = i7;
            mediaStatus3 = mediaStatus2;
            watchStatus3 = watchStatus2;
            i12 = i8;
            i13 = i9;
            mediaFormat3 = mediaFormat2;
            str15 = str10;
            str11 = str16;
            animeListItem2 = animeListItem;
        } else {
            j4 = j2;
            j5 = j3;
            str11 = str16;
            animeListItem2 = animeListItem;
            i10 = i6;
            num5 = num3;
            str12 = str7;
            str13 = str8;
            str14 = str9;
            num6 = num4;
            i11 = i7;
            mediaStatus3 = mediaStatus2;
            watchStatus3 = watchStatus2;
            i12 = i8;
            i13 = i9;
            mediaFormat3 = mediaFormat2;
            str15 = str10;
        }
        return animeListItem2.copy(str11, i10, num5, str12, str13, str14, num6, i11, mediaStatus3, watchStatus3, i12, i13, mediaFormat3, str15, j5, j4);
    }

    public final String component1() {
        return this.anistationId;
    }

    public final WatchStatus component10() {
        return this.watchStatus;
    }

    public final int component11() {
        return this.importedProgress;
    }

    public final int component12() {
        return this.score;
    }

    public final MediaFormat component13() {
        return this.format;
    }

    public final String component14() {
        return this.notes;
    }

    public final long component15() {
        return this.createdAt;
    }

    public final long component16() {
        return this.updatedAt;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final Integer component3() {
        return this.malId;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.coverImage;
    }

    public final String component6() {
        return this.bannerImage;
    }

    public final Integer component7() {
        return this.totalEpisodes;
    }

    public final int component8() {
        return this.currentAiredEpisodes;
    }

    public final MediaStatus component9() {
        return this.mediaStatus;
    }

    public final AnimeListItem copy(String str, int i, Integer num, String str2, String str3, String str4, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, int i4, MediaFormat mediaFormat, String str5, long j, long j2) {
        str2.getClass();
        watchStatus.getClass();
        return new AnimeListItem(str, i, num, str2, str3, str4, num2, i2, mediaStatus, watchStatus, i3, i4, mediaFormat, str5, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimeListItem)) {
            return false;
        }
        AnimeListItem animeListItem = (AnimeListItem) obj;
        if (a34.i(this.anistationId, animeListItem.anistationId) && this.anilistId == animeListItem.anilistId && a34.i(this.malId, animeListItem.malId) && a34.i(this.title, animeListItem.title) && a34.i(this.coverImage, animeListItem.coverImage) && a34.i(this.bannerImage, animeListItem.bannerImage) && a34.i(this.totalEpisodes, animeListItem.totalEpisodes) && this.currentAiredEpisodes == animeListItem.currentAiredEpisodes && this.mediaStatus == animeListItem.mediaStatus && this.watchStatus == animeListItem.watchStatus && this.importedProgress == animeListItem.importedProgress && this.score == animeListItem.score && this.format == animeListItem.format && a34.i(this.notes, animeListItem.notes) && this.createdAt == animeListItem.createdAt && this.updatedAt == animeListItem.updatedAt) {
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

    public final String getAnistationId() {
        return this.anistationId;
    }

    public final String getBannerImage() {
        return this.bannerImage;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getCurrentAiredEpisodes() {
        return this.currentAiredEpisodes;
    }

    public final MediaFormat getFormat() {
        return this.format;
    }

    public final int getImportedProgress() {
        return this.importedProgress;
    }

    public final Integer getMalId() {
        return this.malId;
    }

    public final MediaStatus getMediaStatus() {
        return this.mediaStatus;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final int getScore() {
        return this.score;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotalEpisodes() {
        return this.totalEpisodes;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final WatchStatus getWatchStatus() {
        return this.watchStatus;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.anistationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.anilistId, hashCode * 31, 31);
        Integer num = this.malId;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = zo5.i(this.title, (c + hashCode2) * 31, 31);
        String str2 = this.coverImage;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str3 = this.bannerImage;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Integer num2 = this.totalEpisodes;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int c2 = qx1.c(this.currentAiredEpisodes, (i4 + hashCode5) * 31, 31);
        MediaStatus mediaStatus = this.mediaStatus;
        if (mediaStatus == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = mediaStatus.hashCode();
        }
        int c3 = qx1.c(this.score, qx1.c(this.importedProgress, (this.watchStatus.hashCode() + ((c2 + hashCode6) * 31)) * 31, 31), 31);
        MediaFormat mediaFormat = this.format;
        if (mediaFormat == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = mediaFormat.hashCode();
        }
        int i5 = (c3 + hashCode7) * 31;
        String str4 = this.notes;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return Long.hashCode(this.updatedAt) + qx1.d((i5 + i) * 31, this.createdAt, 31);
    }

    public String toString() {
        String str = this.anistationId;
        int i = this.anilistId;
        Integer num = this.malId;
        String str2 = this.title;
        String str3 = this.coverImage;
        String str4 = this.bannerImage;
        Integer num2 = this.totalEpisodes;
        int i2 = this.currentAiredEpisodes;
        MediaStatus mediaStatus = this.mediaStatus;
        WatchStatus watchStatus = this.watchStatus;
        int i3 = this.importedProgress;
        int i4 = this.score;
        MediaFormat mediaFormat = this.format;
        String str5 = this.notes;
        long j = this.createdAt;
        long j2 = this.updatedAt;
        StringBuilder m = h11.m(i, "AnimeListItem(anistationId=", str, ", anilistId=", ", malId=");
        m.append(num);
        m.append(", title=");
        m.append(str2);
        m.append(", coverImage=");
        qx1.x(m, str3, ", bannerImage=", str4, ", totalEpisodes=");
        m.append(num2);
        m.append(", currentAiredEpisodes=");
        m.append(i2);
        m.append(", mediaStatus=");
        m.append(mediaStatus);
        m.append(", watchStatus=");
        m.append(watchStatus);
        m.append(", importedProgress=");
        h11.y(m, i3, ", score=", i4, ", format=");
        m.append(mediaFormat);
        m.append(", notes=");
        m.append(str5);
        m.append(", createdAt=");
        m.append(j);
        m.append(", updatedAt=");
        m.append(j2);
        m.append(")");
        return m.toString();
    }

    public AnimeListItem(String str, int i, Integer num, String str2, String str3, String str4, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, int i4, MediaFormat mediaFormat, String str5, long j, long j2) {
        str2.getClass();
        watchStatus.getClass();
        this.anistationId = str;
        this.anilistId = i;
        this.malId = num;
        this.title = str2;
        this.coverImage = str3;
        this.bannerImage = str4;
        this.totalEpisodes = num2;
        this.currentAiredEpisodes = i2;
        this.mediaStatus = mediaStatus;
        this.watchStatus = watchStatus;
        this.importedProgress = i3;
        this.score = i4;
        this.format = mediaFormat;
        this.notes = str5;
        this.createdAt = j;
        this.updatedAt = j2;
    }
}
