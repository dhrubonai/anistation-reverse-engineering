package com.anistation.model.download;

import com.anistation.model.MediaFormat;
import com.anistation.model.watch.Skips;
import com.anistation.model.watch.Skips$$serializer;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.hu0;
import defpackage.i13;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.l70;
import defpackage.mj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.qa4;
import defpackage.qx1;
import defpackage.rb3;
import defpackage.uv1;
import defpackage.uz5;
import defpackage.v0;
import defpackage.x73;
import defpackage.yj2;
import defpackage.zo5;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class OfflineDownloadMetadata {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final String airedAt;
    private final int anilistId;
    private final String animeTitle;
    private final String anistationId;
    private final String audioLabel;
    private final String audioLanguage;
    private final String bannerImage;
    private final String coverImage;
    private final long createdAt;
    private final String description;
    private final int episodeNumber;
    private final String episodeTitle;
    private final Boolean filler;
    private final MediaFormat format;
    private final Map<String, String> headers;
    private final Integer length;
    private final Integer malId;
    private final String quality;
    private final Integer seasonYear;
    private final String server;
    private final Skips skips;
    private final String sourceMimeType;
    private final String sourceType;
    private final String sourceUrl;
    private final DownloadStorageType storageType;
    private final OfflineSubtitleMetadata subtitle;
    private final String thumbnailImage;
    private final int version;

    static {
        qa4 qa4Var = new qa4((byte) 1);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, bx7.B(jf3Var, qa4Var), null, null, bx7.B(jf3Var, new qa4((byte) 2)), null, null, null, bx7.B(jf3Var, new qa4((byte) 3)), null, null, null, null, null, null};
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ OfflineDownloadMetadata(int r33, java.lang.String r34, int r35, java.lang.Integer r36, java.lang.String r37, java.lang.String r38, int r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.Boolean r43, java.lang.String r44, java.lang.Integer r45, java.lang.Integer r46, com.anistation.model.MediaFormat r47, java.lang.String r48, java.lang.String r49, com.anistation.model.download.DownloadStorageType r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.util.Map r54, com.anistation.model.download.OfflineSubtitleMetadata r55, com.anistation.model.watch.Skips r56, java.lang.String r57, long r58, java.lang.String r60, java.lang.String r61, int r62, defpackage.q71 r63) {
        /*
            r32 = this;
            r0 = r62
            r1 = r0 & 1
            if (r1 == 0) goto L9
            r1 = 1
            r3 = r1
            goto Lb
        L9:
            r3 = r33
        Lb:
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L12
            r4 = r2
            goto L14
        L12:
            r4 = r34
        L14:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L1a
            r12 = r2
            goto L1c
        L1a:
            r12 = r42
        L1c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L26
            com.anistation.model.download.DownloadStorageType r1 = com.anistation.model.download.DownloadStorageType.INTERNAL
            r20 = r1
            goto L28
        L26:
            r20 = r50
        L28:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L30
            r30 = r2
            goto L32
        L30:
            r30 = r60
        L32:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L68
            r31 = r2
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r13 = r43
            r14 = r44
            r15 = r45
            r16 = r46
            r17 = r47
            r18 = r48
            r19 = r49
            r21 = r51
            r22 = r52
            r23 = r53
            r24 = r54
            r25 = r55
            r26 = r56
            r27 = r57
            r28 = r58
            r2 = r32
            goto L98
        L68:
            r31 = r61
            r2 = r32
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r13 = r43
            r14 = r44
            r15 = r45
            r16 = r46
            r17 = r47
            r18 = r48
            r19 = r49
            r21 = r51
            r22 = r52
            r23 = r53
            r24 = r54
            r25 = r55
            r26 = r56
            r27 = r57
            r28 = r58
        L98:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anistation.model.download.OfflineDownloadMetadata.<init>(int, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Integer, com.anistation.model.MediaFormat, java.lang.String, java.lang.String, com.anistation.model.download.DownloadStorageType, java.lang.String, java.lang.String, java.lang.String, java.util.Map, com.anistation.model.download.OfflineSubtitleMetadata, com.anistation.model.watch.Skips, java.lang.String, long, java.lang.String, java.lang.String, int, q71):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x73 _childSerializers$_anonymous_() {
        MediaFormat[] values = MediaFormat.values();
        values.getClass();
        return new uv1("com.anistation.model.MediaFormat", values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ x73 _childSerializers$_anonymous_$0() {
        return DownloadStorageType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ x73 _childSerializers$_anonymous_$1() {
        mz5 mz5Var = mz5.a;
        return new yj2(mz5Var, mz5Var, (byte) 1);
    }

    public static /* synthetic */ OfflineDownloadMetadata copy$default(OfflineDownloadMetadata offlineDownloadMetadata, int i, String str, int i2, Integer num, String str2, String str3, int i3, String str4, String str5, String str6, Boolean bool, String str7, Integer num2, Integer num3, MediaFormat mediaFormat, String str8, String str9, DownloadStorageType downloadStorageType, String str10, String str11, String str12, Map map, OfflineSubtitleMetadata offlineSubtitleMetadata, Skips skips, String str13, long j, String str14, String str15, int i4, Object obj) {
        int i5 = (i4 & 1) != 0 ? offlineDownloadMetadata.version : i;
        return offlineDownloadMetadata.copy(i5, (i4 & 2) != 0 ? offlineDownloadMetadata.anistationId : str, (i4 & 4) != 0 ? offlineDownloadMetadata.anilistId : i2, (i4 & 8) != 0 ? offlineDownloadMetadata.malId : num, (i4 & 16) != 0 ? offlineDownloadMetadata.animeTitle : str2, (i4 & 32) != 0 ? offlineDownloadMetadata.episodeTitle : str3, (i4 & 64) != 0 ? offlineDownloadMetadata.episodeNumber : i3, (i4 & 128) != 0 ? offlineDownloadMetadata.coverImage : str4, (i4 & 256) != 0 ? offlineDownloadMetadata.thumbnailImage : str5, (i4 & 512) != 0 ? offlineDownloadMetadata.bannerImage : str6, (i4 & 1024) != 0 ? offlineDownloadMetadata.filler : bool, (i4 & 2048) != 0 ? offlineDownloadMetadata.description : str7, (i4 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? offlineDownloadMetadata.length : num2, (i4 & 8192) != 0 ? offlineDownloadMetadata.seasonYear : num3, (i4 & 16384) != 0 ? offlineDownloadMetadata.format : mediaFormat, (i4 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? offlineDownloadMetadata.server : str8, (i4 & 65536) != 0 ? offlineDownloadMetadata.sourceType : str9, (i4 & 131072) != 0 ? offlineDownloadMetadata.storageType : downloadStorageType, (i4 & 262144) != 0 ? offlineDownloadMetadata.quality : str10, (i4 & 524288) != 0 ? offlineDownloadMetadata.sourceUrl : str11, (i4 & 1048576) != 0 ? offlineDownloadMetadata.sourceMimeType : str12, (i4 & 2097152) != 0 ? offlineDownloadMetadata.headers : map, (i4 & 4194304) != 0 ? offlineDownloadMetadata.subtitle : offlineSubtitleMetadata, (i4 & 8388608) != 0 ? offlineDownloadMetadata.skips : skips, (i4 & 16777216) != 0 ? offlineDownloadMetadata.airedAt : str13, (i4 & 33554432) != 0 ? offlineDownloadMetadata.createdAt : j, (i4 & 67108864) != 0 ? offlineDownloadMetadata.audioLanguage : str14, (i4 & 134217728) != 0 ? offlineDownloadMetadata.audioLabel : str15);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(OfflineDownloadMetadata offlineDownloadMetadata, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || offlineDownloadMetadata.version != 1) {
            ((v0) hu0Var).t(0, offlineDownloadMetadata.version, aj5Var);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 1) || offlineDownloadMetadata.anistationId != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 1, mz5.a, offlineDownloadMetadata.anistationId);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.t(2, offlineDownloadMetadata.anilistId, aj5Var);
        i13 i13Var = i13.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 3, i13Var, offlineDownloadMetadata.malId);
        v0Var.w(aj5Var, 4, offlineDownloadMetadata.animeTitle);
        v0Var.w(aj5Var, 5, offlineDownloadMetadata.episodeTitle);
        v0Var.t(6, offlineDownloadMetadata.episodeNumber, aj5Var);
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 7, mz5Var, offlineDownloadMetadata.coverImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 8, mz5Var, offlineDownloadMetadata.thumbnailImage);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 9) || offlineDownloadMetadata.bannerImage != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 9, mz5Var, offlineDownloadMetadata.bannerImage);
        }
        hu0Var.encodeNullableSerializableElement(aj5Var, 10, l70.a, offlineDownloadMetadata.filler);
        hu0Var.encodeNullableSerializableElement(aj5Var, 11, mz5Var, offlineDownloadMetadata.description);
        hu0Var.encodeNullableSerializableElement(aj5Var, 12, i13Var, offlineDownloadMetadata.length);
        hu0Var.encodeNullableSerializableElement(aj5Var, 13, i13Var, offlineDownloadMetadata.seasonYear);
        hu0Var.encodeNullableSerializableElement(aj5Var, 14, (mj5) rb3VarArr[14].getValue(), offlineDownloadMetadata.format);
        v0Var.w(aj5Var, 15, offlineDownloadMetadata.server);
        v0Var.w(aj5Var, 16, offlineDownloadMetadata.sourceType);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 17) || offlineDownloadMetadata.storageType != DownloadStorageType.INTERNAL) {
            v0Var.v(aj5Var, 17, (mj5) rb3VarArr[17].getValue(), offlineDownloadMetadata.storageType);
        }
        v0Var.w(aj5Var, 18, offlineDownloadMetadata.quality);
        v0Var.w(aj5Var, 19, offlineDownloadMetadata.sourceUrl);
        v0Var.w(aj5Var, 20, offlineDownloadMetadata.sourceMimeType);
        v0Var.v(aj5Var, 21, (mj5) rb3VarArr[21].getValue(), offlineDownloadMetadata.headers);
        hu0Var.encodeNullableSerializableElement(aj5Var, 22, OfflineSubtitleMetadata$$serializer.INSTANCE, offlineDownloadMetadata.subtitle);
        hu0Var.encodeNullableSerializableElement(aj5Var, 23, Skips$$serializer.INSTANCE, offlineDownloadMetadata.skips);
        hu0Var.encodeNullableSerializableElement(aj5Var, 24, mz5Var, offlineDownloadMetadata.airedAt);
        v0Var.u(aj5Var, 25, offlineDownloadMetadata.createdAt);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 26) || offlineDownloadMetadata.audioLanguage != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 26, mz5Var, offlineDownloadMetadata.audioLanguage);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 27) || offlineDownloadMetadata.audioLabel != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 27, mz5Var, offlineDownloadMetadata.audioLabel);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final String component10() {
        return this.bannerImage;
    }

    public final Boolean component11() {
        return this.filler;
    }

    public final String component12() {
        return this.description;
    }

    public final Integer component13() {
        return this.length;
    }

    public final Integer component14() {
        return this.seasonYear;
    }

    public final MediaFormat component15() {
        return this.format;
    }

    public final String component16() {
        return this.server;
    }

    public final String component17() {
        return this.sourceType;
    }

    public final DownloadStorageType component18() {
        return this.storageType;
    }

    public final String component19() {
        return this.quality;
    }

    public final String component2() {
        return this.anistationId;
    }

    public final String component20() {
        return this.sourceUrl;
    }

    public final String component21() {
        return this.sourceMimeType;
    }

    public final Map<String, String> component22() {
        return this.headers;
    }

    public final OfflineSubtitleMetadata component23() {
        return this.subtitle;
    }

    public final Skips component24() {
        return this.skips;
    }

    public final String component25() {
        return this.airedAt;
    }

    public final long component26() {
        return this.createdAt;
    }

    public final String component27() {
        return this.audioLanguage;
    }

    public final String component28() {
        return this.audioLabel;
    }

    public final int component3() {
        return this.anilistId;
    }

    public final Integer component4() {
        return this.malId;
    }

    public final String component5() {
        return this.animeTitle;
    }

    public final String component6() {
        return this.episodeTitle;
    }

    public final int component7() {
        return this.episodeNumber;
    }

    public final String component8() {
        return this.coverImage;
    }

    public final String component9() {
        return this.thumbnailImage;
    }

    public final OfflineDownloadMetadata copy(int i, String str, int i2, Integer num, String str2, String str3, int i3, String str4, String str5, String str6, Boolean bool, String str7, Integer num2, Integer num3, MediaFormat mediaFormat, String str8, String str9, DownloadStorageType downloadStorageType, String str10, String str11, String str12, Map<String, String> map, OfflineSubtitleMetadata offlineSubtitleMetadata, Skips skips, String str13, long j, String str14, String str15) {
        str2.getClass();
        str3.getClass();
        str8.getClass();
        str9.getClass();
        downloadStorageType.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        map.getClass();
        return new OfflineDownloadMetadata(i, str, i2, num, str2, str3, i3, str4, str5, str6, bool, str7, num2, num3, mediaFormat, str8, str9, downloadStorageType, str10, str11, str12, map, offlineSubtitleMetadata, skips, str13, j, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineDownloadMetadata)) {
            return false;
        }
        OfflineDownloadMetadata offlineDownloadMetadata = (OfflineDownloadMetadata) obj;
        if (this.version == offlineDownloadMetadata.version && a34.i(this.anistationId, offlineDownloadMetadata.anistationId) && this.anilistId == offlineDownloadMetadata.anilistId && a34.i(this.malId, offlineDownloadMetadata.malId) && a34.i(this.animeTitle, offlineDownloadMetadata.animeTitle) && a34.i(this.episodeTitle, offlineDownloadMetadata.episodeTitle) && this.episodeNumber == offlineDownloadMetadata.episodeNumber && a34.i(this.coverImage, offlineDownloadMetadata.coverImage) && a34.i(this.thumbnailImage, offlineDownloadMetadata.thumbnailImage) && a34.i(this.bannerImage, offlineDownloadMetadata.bannerImage) && a34.i(this.filler, offlineDownloadMetadata.filler) && a34.i(this.description, offlineDownloadMetadata.description) && a34.i(this.length, offlineDownloadMetadata.length) && a34.i(this.seasonYear, offlineDownloadMetadata.seasonYear) && this.format == offlineDownloadMetadata.format && a34.i(this.server, offlineDownloadMetadata.server) && a34.i(this.sourceType, offlineDownloadMetadata.sourceType) && this.storageType == offlineDownloadMetadata.storageType && a34.i(this.quality, offlineDownloadMetadata.quality) && a34.i(this.sourceUrl, offlineDownloadMetadata.sourceUrl) && a34.i(this.sourceMimeType, offlineDownloadMetadata.sourceMimeType) && a34.i(this.headers, offlineDownloadMetadata.headers) && a34.i(this.subtitle, offlineDownloadMetadata.subtitle) && a34.i(this.skips, offlineDownloadMetadata.skips) && a34.i(this.airedAt, offlineDownloadMetadata.airedAt) && this.createdAt == offlineDownloadMetadata.createdAt && a34.i(this.audioLanguage, offlineDownloadMetadata.audioLanguage) && a34.i(this.audioLabel, offlineDownloadMetadata.audioLabel)) {
            return true;
        }
        return false;
    }

    public final String getAiredAt() {
        return this.airedAt;
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

    public final String getAudioLabel() {
        return this.audioLabel;
    }

    public final String getAudioLanguage() {
        return this.audioLanguage;
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

    public final String getDescription() {
        return this.description;
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final String getEpisodeTitle() {
        return this.episodeTitle;
    }

    public final Boolean getFiller() {
        return this.filler;
    }

    public final MediaFormat getFormat() {
        return this.format;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getMalId() {
        return this.malId;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final Integer getSeasonYear() {
        return this.seasonYear;
    }

    public final String getServer() {
        return this.server;
    }

    public final Skips getSkips() {
        return this.skips;
    }

    public final String getSourceMimeType() {
        return this.sourceMimeType;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final DownloadStorageType getStorageType() {
        return this.storageType;
    }

    public final OfflineSubtitleMetadata getSubtitle() {
        return this.subtitle;
    }

    public final String getThumbnailImage() {
        return this.thumbnailImage;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15 = Integer.hashCode(this.version) * 31;
        String str = this.anistationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = qx1.c(this.anilistId, (hashCode15 + hashCode) * 31, 31);
        Integer num = this.malId;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int c2 = qx1.c(this.episodeNumber, zo5.i(this.episodeTitle, zo5.i(this.animeTitle, (c + hashCode2) * 31, 31), 31), 31);
        String str2 = this.coverImage;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i2 = (c2 + hashCode3) * 31;
        String str3 = this.thumbnailImage;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        String str4 = this.bannerImage;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        Boolean bool = this.filler;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i5 = (i4 + hashCode6) * 31;
        String str5 = this.description;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i6 = (i5 + hashCode7) * 31;
        Integer num2 = this.length;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i7 = (i6 + hashCode8) * 31;
        Integer num3 = this.seasonYear;
        if (num3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num3.hashCode();
        }
        int i8 = (i7 + hashCode9) * 31;
        MediaFormat mediaFormat = this.format;
        if (mediaFormat == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = mediaFormat.hashCode();
        }
        int hashCode16 = (this.headers.hashCode() + zo5.i(this.sourceMimeType, zo5.i(this.sourceUrl, zo5.i(this.quality, (this.storageType.hashCode() + zo5.i(this.sourceType, zo5.i(this.server, (i8 + hashCode10) * 31, 31), 31)) * 31, 31), 31), 31)) * 31;
        OfflineSubtitleMetadata offlineSubtitleMetadata = this.subtitle;
        if (offlineSubtitleMetadata == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = offlineSubtitleMetadata.hashCode();
        }
        int i9 = (hashCode16 + hashCode11) * 31;
        Skips skips = this.skips;
        if (skips == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = skips.hashCode();
        }
        int i10 = (i9 + hashCode12) * 31;
        String str6 = this.airedAt;
        if (str6 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str6.hashCode();
        }
        int d = qx1.d((i10 + hashCode13) * 31, this.createdAt, 31);
        String str7 = this.audioLanguage;
        if (str7 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str7.hashCode();
        }
        int i11 = (d + hashCode14) * 31;
        String str8 = this.audioLabel;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i11 + i;
    }

    public String toString() {
        int i = this.version;
        String str = this.anistationId;
        int i2 = this.anilistId;
        Integer num = this.malId;
        String str2 = this.animeTitle;
        String str3 = this.episodeTitle;
        int i3 = this.episodeNumber;
        String str4 = this.coverImage;
        String str5 = this.thumbnailImage;
        String str6 = this.bannerImage;
        Boolean bool = this.filler;
        String str7 = this.description;
        Integer num2 = this.length;
        Integer num3 = this.seasonYear;
        MediaFormat mediaFormat = this.format;
        String str8 = this.server;
        String str9 = this.sourceType;
        DownloadStorageType downloadStorageType = this.storageType;
        String str10 = this.quality;
        String str11 = this.sourceUrl;
        String str12 = this.sourceMimeType;
        Map<String, String> map = this.headers;
        OfflineSubtitleMetadata offlineSubtitleMetadata = this.subtitle;
        Skips skips = this.skips;
        String str13 = this.airedAt;
        long j = this.createdAt;
        String str14 = this.audioLanguage;
        String str15 = this.audioLabel;
        StringBuilder sb = new StringBuilder("OfflineDownloadMetadata(version=");
        sb.append(i);
        sb.append(", anistationId=");
        sb.append(str);
        sb.append(", anilistId=");
        sb.append(i2);
        sb.append(", malId=");
        sb.append(num);
        sb.append(", animeTitle=");
        qx1.x(sb, str2, ", episodeTitle=", str3, ", episodeNumber=");
        sb.append(i3);
        sb.append(", coverImage=");
        sb.append(str4);
        sb.append(", thumbnailImage=");
        qx1.x(sb, str5, ", bannerImage=", str6, ", filler=");
        sb.append(bool);
        sb.append(", description=");
        sb.append(str7);
        sb.append(", length=");
        sb.append(num2);
        sb.append(", seasonYear=");
        sb.append(num3);
        sb.append(", format=");
        sb.append(mediaFormat);
        sb.append(", server=");
        sb.append(str8);
        sb.append(", sourceType=");
        sb.append(str9);
        sb.append(", storageType=");
        sb.append(downloadStorageType);
        sb.append(", quality=");
        qx1.x(sb, str10, ", sourceUrl=", str11, ", sourceMimeType=");
        sb.append(str12);
        sb.append(", headers=");
        sb.append(map);
        sb.append(", subtitle=");
        sb.append(offlineSubtitleMetadata);
        sb.append(", skips=");
        sb.append(skips);
        sb.append(", airedAt=");
        sb.append(str13);
        sb.append(", createdAt=");
        sb.append(j);
        qx1.x(sb, ", audioLanguage=", str14, ", audioLabel=", str15);
        sb.append(")");
        return sb.toString();
    }

    public OfflineDownloadMetadata(int i, String str, int i2, Integer num, String str2, String str3, int i3, String str4, String str5, String str6, Boolean bool, String str7, Integer num2, Integer num3, MediaFormat mediaFormat, String str8, String str9, DownloadStorageType downloadStorageType, String str10, String str11, String str12, Map<String, String> map, OfflineSubtitleMetadata offlineSubtitleMetadata, Skips skips, String str13, long j, String str14, String str15) {
        str2.getClass();
        str3.getClass();
        str8.getClass();
        str9.getClass();
        downloadStorageType.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        map.getClass();
        this.version = i;
        this.anistationId = str;
        this.anilistId = i2;
        this.malId = num;
        this.animeTitle = str2;
        this.episodeTitle = str3;
        this.episodeNumber = i3;
        this.coverImage = str4;
        this.thumbnailImage = str5;
        this.bannerImage = str6;
        this.filler = bool;
        this.description = str7;
        this.length = num2;
        this.seasonYear = num3;
        this.format = mediaFormat;
        this.server = str8;
        this.sourceType = str9;
        this.storageType = downloadStorageType;
        this.quality = str10;
        this.sourceUrl = str11;
        this.sourceMimeType = str12;
        this.headers = map;
        this.subtitle = offlineSubtitleMetadata;
        this.skips = skips;
        this.airedAt = str13;
        this.createdAt = j;
        this.audioLanguage = str14;
        this.audioLabel = str15;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return OfflineDownloadMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OfflineDownloadMetadata(int i, int i2, String str, int i3, Integer num, String str2, String str3, int i4, String str4, String str5, String str6, Boolean bool, String str7, Integer num2, Integer num3, MediaFormat mediaFormat, String str8, String str9, DownloadStorageType downloadStorageType, String str10, String str11, String str12, Map map, OfflineSubtitleMetadata offlineSubtitleMetadata, Skips skips, String str13, long j, String str14, String str15, kj5 kj5Var) {
        if (66977276 != (i & 66977276)) {
            iq4.throwMissingFieldException(i, 66977276, OfflineDownloadMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.anistationId = null;
        } else {
            this.anistationId = str;
        }
        this.anilistId = i3;
        this.malId = num;
        this.animeTitle = str2;
        this.episodeTitle = str3;
        this.episodeNumber = i4;
        this.coverImage = str4;
        this.thumbnailImage = str5;
        if ((i & 512) == 0) {
            this.bannerImage = null;
        } else {
            this.bannerImage = str6;
        }
        this.filler = bool;
        this.description = str7;
        this.length = num2;
        this.seasonYear = num3;
        this.format = mediaFormat;
        this.server = str8;
        this.sourceType = str9;
        this.storageType = (131072 & i) == 0 ? DownloadStorageType.INTERNAL : downloadStorageType;
        this.quality = str10;
        this.sourceUrl = str11;
        this.sourceMimeType = str12;
        this.headers = map;
        this.subtitle = offlineSubtitleMetadata;
        this.skips = skips;
        this.airedAt = str13;
        this.createdAt = j;
        if ((67108864 & i) == 0) {
            this.audioLanguage = null;
        } else {
            this.audioLanguage = str14;
        }
        if ((i & 134217728) == 0) {
            this.audioLabel = null;
        } else {
            this.audioLabel = str15;
        }
    }
}
