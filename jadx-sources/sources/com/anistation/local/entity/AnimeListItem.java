package com.anistation.local.entity;

import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.anistation.model.animelist.WatchStatus;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.h11;
import defpackage.qx1;
import defpackage.zo5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AnimeListItem {
    private final int anilistId;
    private final String animeId;
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
    public /* synthetic */ AnimeListItem(java.lang.String r24, java.lang.String r25, int r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.Integer r31, int r32, com.anistation.model.MediaStatus r33, com.anistation.model.animelist.WatchStatus r34, int r35, int r36, com.anistation.model.MediaFormat r37, java.lang.String r38, long r39, long r41, int r43, defpackage.q71 r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r25
        Lb:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L13
            com.anistation.model.animelist.WatchStatus r1 = com.anistation.model.animelist.WatchStatus.PLAN_TO_WATCH
            r14 = r1
            goto L15
        L13:
            r14 = r34
        L15:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r3 = 0
            if (r1 == 0) goto L1c
            r15 = r3
            goto L1e
        L1c:
            r15 = r35
        L1e:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L25
            r16 = r3
            goto L27
        L25:
            r16 = r36
        L27:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L48
            r18 = r2
        L2d:
            r3 = r23
            r4 = r24
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r17 = r37
            r19 = r39
            r21 = r41
            goto L4b
        L48:
            r18 = r38
            goto L2d
        L4b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anistation.local.entity.AnimeListItem.<init>(java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, com.anistation.model.MediaStatus, com.anistation.model.animelist.WatchStatus, int, int, com.anistation.model.MediaFormat, java.lang.String, long, long, int, q71):void");
    }

    public static /* synthetic */ AnimeListItem copy$default(AnimeListItem animeListItem, String str, String str2, int i, Integer num, String str3, String str4, String str5, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, int i4, MediaFormat mediaFormat, String str6, long j, long j2, int i5, Object obj) {
        String str7;
        String str8;
        int i6;
        Integer num3;
        String str9;
        String str10;
        String str11;
        Integer num4;
        int i7;
        MediaStatus mediaStatus2;
        WatchStatus watchStatus2;
        int i8;
        int i9;
        MediaFormat mediaFormat2;
        String str12;
        long j3;
        long j4;
        long j5;
        if ((i5 & 1) != 0) {
            str7 = animeListItem.animeId;
        } else {
            str7 = str;
        }
        if ((i5 & 2) != 0) {
            str8 = animeListItem.anistationId;
        } else {
            str8 = str2;
        }
        if ((i5 & 4) != 0) {
            i6 = animeListItem.anilistId;
        } else {
            i6 = i;
        }
        if ((i5 & 8) != 0) {
            num3 = animeListItem.malId;
        } else {
            num3 = num;
        }
        if ((i5 & 16) != 0) {
            str9 = animeListItem.title;
        } else {
            str9 = str3;
        }
        if ((i5 & 32) != 0) {
            str10 = animeListItem.coverImage;
        } else {
            str10 = str4;
        }
        if ((i5 & 64) != 0) {
            str11 = animeListItem.bannerImage;
        } else {
            str11 = str5;
        }
        if ((i5 & 128) != 0) {
            num4 = animeListItem.totalEpisodes;
        } else {
            num4 = num2;
        }
        if ((i5 & 256) != 0) {
            i7 = animeListItem.currentAiredEpisodes;
        } else {
            i7 = i2;
        }
        if ((i5 & 512) != 0) {
            mediaStatus2 = animeListItem.mediaStatus;
        } else {
            mediaStatus2 = mediaStatus;
        }
        if ((i5 & 1024) != 0) {
            watchStatus2 = animeListItem.watchStatus;
        } else {
            watchStatus2 = watchStatus;
        }
        if ((i5 & 2048) != 0) {
            i8 = animeListItem.importedProgress;
        } else {
            i8 = i3;
        }
        if ((i5 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            i9 = animeListItem.score;
        } else {
            i9 = i4;
        }
        if ((i5 & 8192) != 0) {
            mediaFormat2 = animeListItem.format;
        } else {
            mediaFormat2 = mediaFormat;
        }
        String str13 = str7;
        if ((i5 & 16384) != 0) {
            str12 = animeListItem.notes;
        } else {
            str12 = str6;
        }
        String str14 = str12;
        if ((i5 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            j3 = animeListItem.createdAt;
        } else {
            j3 = j;
        }
        if ((i5 & 65536) != 0) {
            j5 = j3;
            j4 = animeListItem.updatedAt;
        } else {
            j4 = j2;
            j5 = j3;
        }
        return animeListItem.copy(str13, str8, i6, num3, str9, str10, str11, num4, i7, mediaStatus2, watchStatus2, i8, i9, mediaFormat2, str14, j5, j4);
    }

    public final String component1() {
        return this.animeId;
    }

    public final MediaStatus component10() {
        return this.mediaStatus;
    }

    public final WatchStatus component11() {
        return this.watchStatus;
    }

    public final int component12() {
        return this.importedProgress;
    }

    public final int component13() {
        return this.score;
    }

    public final MediaFormat component14() {
        return this.format;
    }

    public final String component15() {
        return this.notes;
    }

    public final long component16() {
        return this.createdAt;
    }

    public final long component17() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.anistationId;
    }

    public final int component3() {
        return this.anilistId;
    }

    public final Integer component4() {
        return this.malId;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.coverImage;
    }

    public final String component7() {
        return this.bannerImage;
    }

    public final Integer component8() {
        return this.totalEpisodes;
    }

    public final int component9() {
        return this.currentAiredEpisodes;
    }

    public final AnimeListItem copy(String str, String str2, int i, Integer num, String str3, String str4, String str5, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, int i4, MediaFormat mediaFormat, String str6, long j, long j2) {
        str.getClass();
        str3.getClass();
        watchStatus.getClass();
        return new AnimeListItem(str, str2, i, num, str3, str4, str5, num2, i2, mediaStatus, watchStatus, i3, i4, mediaFormat, str6, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimeListItem)) {
            return false;
        }
        AnimeListItem animeListItem = (AnimeListItem) obj;
        if (a34.i(this.animeId, animeListItem.animeId) && a34.i(this.anistationId, animeListItem.anistationId) && this.anilistId == animeListItem.anilistId && a34.i(this.malId, animeListItem.malId) && a34.i(this.title, animeListItem.title) && a34.i(this.coverImage, animeListItem.coverImage) && a34.i(this.bannerImage, animeListItem.bannerImage) && a34.i(this.totalEpisodes, animeListItem.totalEpisodes) && this.currentAiredEpisodes == animeListItem.currentAiredEpisodes && this.mediaStatus == animeListItem.mediaStatus && this.watchStatus == animeListItem.watchStatus && this.importedProgress == animeListItem.importedProgress && this.score == animeListItem.score && this.format == animeListItem.format && a34.i(this.notes, animeListItem.notes) && this.createdAt == animeListItem.createdAt && this.updatedAt == animeListItem.updatedAt) {
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
        int hashCode8 = this.animeId.hashCode() * 31;
        String str = this.anistationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.anilistId, (hashCode8 + hashCode) * 31, 31);
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
        String str = this.animeId;
        String str2 = this.anistationId;
        int i = this.anilistId;
        Integer num = this.malId;
        String str3 = this.title;
        String str4 = this.coverImage;
        String str5 = this.bannerImage;
        Integer num2 = this.totalEpisodes;
        int i2 = this.currentAiredEpisodes;
        MediaStatus mediaStatus = this.mediaStatus;
        WatchStatus watchStatus = this.watchStatus;
        int i3 = this.importedProgress;
        int i4 = this.score;
        MediaFormat mediaFormat = this.format;
        String str6 = this.notes;
        long j = this.createdAt;
        long j2 = this.updatedAt;
        StringBuilder o = h11.o("AnimeListItem(animeId=", str, ", anistationId=", str2, ", anilistId=");
        o.append(i);
        o.append(", malId=");
        o.append(num);
        o.append(", title=");
        qx1.x(o, str3, ", coverImage=", str4, ", bannerImage=");
        o.append(str5);
        o.append(", totalEpisodes=");
        o.append(num2);
        o.append(", currentAiredEpisodes=");
        o.append(i2);
        o.append(", mediaStatus=");
        o.append(mediaStatus);
        o.append(", watchStatus=");
        o.append(watchStatus);
        o.append(", importedProgress=");
        o.append(i3);
        o.append(", score=");
        o.append(i4);
        o.append(", format=");
        o.append(mediaFormat);
        o.append(", notes=");
        o.append(str6);
        o.append(", createdAt=");
        o.append(j);
        o.append(", updatedAt=");
        o.append(j2);
        o.append(")");
        return o.toString();
    }

    public AnimeListItem(String str, String str2, int i, Integer num, String str3, String str4, String str5, Integer num2, int i2, MediaStatus mediaStatus, WatchStatus watchStatus, int i3, int i4, MediaFormat mediaFormat, String str6, long j, long j2) {
        str.getClass();
        str3.getClass();
        watchStatus.getClass();
        this.animeId = str;
        this.anistationId = str2;
        this.anilistId = i;
        this.malId = num;
        this.title = str3;
        this.coverImage = str4;
        this.bannerImage = str5;
        this.totalEpisodes = num2;
        this.currentAiredEpisodes = i2;
        this.mediaStatus = mediaStatus;
        this.watchStatus = watchStatus;
        this.importedProgress = i3;
        this.score = i4;
        this.format = mediaFormat;
        this.notes = str6;
        this.createdAt = j;
        this.updatedAt = j2;
    }
}
