package com.anistation.model;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.ds;
import defpackage.h11;
import defpackage.hu0;
import defpackage.i13;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.qa4;
import defpackage.qx1;
import defpackage.rb3;
import defpackage.uv1;
import defpackage.v0;
import defpackage.x73;
import defpackage.zo5;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Recent {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final boolean adult;
    private final long airedAt;
    private final int anilistId;
    private final Integer averageScore;
    private final String color;
    private final CoverImage coverImage;
    private final int episodeNumber;
    private final MediaFormat format;
    private final List<String> genres;
    private final String id;
    private final String logo;
    private final Integer malId;
    private final Integer popularity;
    private final String season;
    private final Integer seasonYear;
    private final MediaStatus status;
    private final String thumbnailImage;
    private final Title title;
    private final Integer trending;

    static {
        qa4 qa4Var = new qa4((byte) 17);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{null, null, null, null, null, null, null, null, bx7.B(jf3Var, qa4Var), bx7.B(jf3Var, new qa4((byte) 18)), null, null, null, null, null, bx7.B(jf3Var, new qa4((byte) 19)), null, null, null};
    }

    public /* synthetic */ Recent(int i, String str, int i2, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, String str5, Integer num5, List list, boolean z, int i3, long j, kj5 kj5Var) {
        if (524286 != (i & 524286)) {
            iq4.throwMissingFieldException(i, 524286, Recent$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.anilistId = i2;
        this.malId = num;
        this.title = title;
        this.coverImage = coverImage;
        this.thumbnailImage = str2;
        this.logo = str3;
        this.color = str4;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.averageScore = num2;
        this.popularity = num3;
        this.trending = num4;
        this.season = str5;
        this.seasonYear = num5;
        this.genres = list;
        this.adult = z;
        this.episodeNumber = i3;
        this.airedAt = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x73 _childSerializers$_anonymous_() {
        MediaFormat[] values = MediaFormat.values();
        values.getClass();
        return new uv1("com.anistation.model.MediaFormat", values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ x73 _childSerializers$_anonymous_$0() {
        return MediaStatus.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ x73 _childSerializers$_anonymous_$1() {
        return new ds(mz5.a, (byte) 0);
    }

    public static /* synthetic */ Recent copy$default(Recent recent, String str, int i, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, String str5, Integer num5, List list, boolean z, int i2, long j, int i3, Object obj) {
        long j2;
        int i4;
        Integer num6;
        String str6 = (i3 & 1) != 0 ? recent.id : str;
        int i5 = (i3 & 2) != 0 ? recent.anilistId : i;
        Integer num7 = (i3 & 4) != 0 ? recent.malId : num;
        Title title2 = (i3 & 8) != 0 ? recent.title : title;
        CoverImage coverImage2 = (i3 & 16) != 0 ? recent.coverImage : coverImage;
        String str7 = (i3 & 32) != 0 ? recent.thumbnailImage : str2;
        String str8 = (i3 & 64) != 0 ? recent.logo : str3;
        String str9 = (i3 & 128) != 0 ? recent.color : str4;
        MediaFormat mediaFormat2 = (i3 & 256) != 0 ? recent.format : mediaFormat;
        MediaStatus mediaStatus2 = (i3 & 512) != 0 ? recent.status : mediaStatus;
        Integer num8 = (i3 & 1024) != 0 ? recent.averageScore : num2;
        Integer num9 = (i3 & 2048) != 0 ? recent.popularity : num3;
        Integer num10 = (i3 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? recent.trending : num4;
        String str10 = (i3 & 8192) != 0 ? recent.season : str5;
        String str11 = str6;
        Integer num11 = (i3 & 16384) != 0 ? recent.seasonYear : num5;
        List list2 = (i3 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? recent.genres : list;
        boolean z2 = (i3 & 65536) != 0 ? recent.adult : z;
        int i6 = (i3 & 131072) != 0 ? recent.episodeNumber : i2;
        if ((i3 & 262144) != 0) {
            num6 = num11;
            i4 = i6;
            j2 = recent.airedAt;
        } else {
            j2 = j;
            i4 = i6;
            num6 = num11;
        }
        return recent.copy(str11, i5, num7, title2, coverImage2, str7, str8, str9, mediaFormat2, mediaStatus2, num8, num9, num10, str10, num6, list2, z2, i4, j2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Recent recent, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || recent.id != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5.a, recent.id);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.t(1, recent.anilistId, aj5Var);
        i13 i13Var = i13.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, i13Var, recent.malId);
        v0Var.v(aj5Var, 3, Title$$serializer.INSTANCE, recent.title);
        v0Var.v(aj5Var, 4, CoverImage$$serializer.INSTANCE, recent.coverImage);
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 5, mz5Var, recent.thumbnailImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 6, mz5Var, recent.logo);
        hu0Var.encodeNullableSerializableElement(aj5Var, 7, mz5Var, recent.color);
        v0Var.v(aj5Var, 8, (mj5) rb3VarArr[8].getValue(), recent.format);
        v0Var.v(aj5Var, 9, (mj5) rb3VarArr[9].getValue(), recent.status);
        hu0Var.encodeNullableSerializableElement(aj5Var, 10, i13Var, recent.averageScore);
        hu0Var.encodeNullableSerializableElement(aj5Var, 11, i13Var, recent.popularity);
        hu0Var.encodeNullableSerializableElement(aj5Var, 12, i13Var, recent.trending);
        hu0Var.encodeNullableSerializableElement(aj5Var, 13, mz5Var, recent.season);
        hu0Var.encodeNullableSerializableElement(aj5Var, 14, i13Var, recent.seasonYear);
        hu0Var.encodeNullableSerializableElement(aj5Var, 15, (mj5) rb3VarArr[15].getValue(), recent.genres);
        v0Var.p(aj5Var, 16, recent.adult);
        v0Var.t(17, recent.episodeNumber, aj5Var);
        v0Var.u(aj5Var, 18, recent.airedAt);
    }

    public final String component1() {
        return this.id;
    }

    public final MediaStatus component10() {
        return this.status;
    }

    public final Integer component11() {
        return this.averageScore;
    }

    public final Integer component12() {
        return this.popularity;
    }

    public final Integer component13() {
        return this.trending;
    }

    public final String component14() {
        return this.season;
    }

    public final Integer component15() {
        return this.seasonYear;
    }

    public final List<String> component16() {
        return this.genres;
    }

    public final boolean component17() {
        return this.adult;
    }

    public final int component18() {
        return this.episodeNumber;
    }

    public final long component19() {
        return this.airedAt;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final Integer component3() {
        return this.malId;
    }

    public final Title component4() {
        return this.title;
    }

    public final CoverImage component5() {
        return this.coverImage;
    }

    public final String component6() {
        return this.thumbnailImage;
    }

    public final String component7() {
        return this.logo;
    }

    public final String component8() {
        return this.color;
    }

    public final MediaFormat component9() {
        return this.format;
    }

    public final Recent copy(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, String str5, Integer num5, List<String> list, boolean z, int i2, long j) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        return new Recent(str, i, num, title, coverImage, str2, str3, str4, mediaFormat, mediaStatus, num2, num3, num4, str5, num5, list, z, i2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recent)) {
            return false;
        }
        Recent recent = (Recent) obj;
        if (a34.i(this.id, recent.id) && this.anilistId == recent.anilistId && a34.i(this.malId, recent.malId) && a34.i(this.title, recent.title) && a34.i(this.coverImage, recent.coverImage) && a34.i(this.thumbnailImage, recent.thumbnailImage) && a34.i(this.logo, recent.logo) && a34.i(this.color, recent.color) && this.format == recent.format && this.status == recent.status && a34.i(this.averageScore, recent.averageScore) && a34.i(this.popularity, recent.popularity) && a34.i(this.trending, recent.trending) && a34.i(this.season, recent.season) && a34.i(this.seasonYear, recent.seasonYear) && a34.i(this.genres, recent.genres) && this.adult == recent.adult && this.episodeNumber == recent.episodeNumber && this.airedAt == recent.airedAt) {
            return true;
        }
        return false;
    }

    public final boolean getAdult() {
        return this.adult;
    }

    public final long getAiredAt() {
        return this.airedAt;
    }

    public final int getAnilistId() {
        return this.anilistId;
    }

    public final Integer getAverageScore() {
        return this.averageScore;
    }

    public final String getColor() {
        return this.color;
    }

    public final CoverImage getCoverImage() {
        return this.coverImage;
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final MediaFormat getFormat() {
        return this.format;
    }

    public final List<String> getGenres() {
        return this.genres;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Integer getMalId() {
        return this.malId;
    }

    public final Integer getPopularity() {
        return this.popularity;
    }

    public final String getSeason() {
        return this.season;
    }

    public final Integer getSeasonYear() {
        return this.seasonYear;
    }

    public final MediaStatus getStatus() {
        return this.status;
    }

    public final String getThumbnailImage() {
        return this.thumbnailImage;
    }

    public final Title getTitle() {
        return this.title;
    }

    public final Integer getTrending() {
        return this.trending;
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
        String str = this.id;
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
        int hashCode11 = (this.coverImage.hashCode() + ((this.title.hashCode() + ((c + hashCode2) * 31)) * 31)) * 31;
        String str2 = this.thumbnailImage;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i2 = (hashCode11 + hashCode3) * 31;
        String str3 = this.logo;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        String str4 = this.color;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int hashCode12 = (this.status.hashCode() + ((this.format.hashCode() + ((i3 + hashCode5) * 31)) * 31)) * 31;
        Integer num2 = this.averageScore;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i4 = (hashCode12 + hashCode6) * 31;
        Integer num3 = this.popularity;
        if (num3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num3.hashCode();
        }
        int i5 = (i4 + hashCode7) * 31;
        Integer num4 = this.trending;
        if (num4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num4.hashCode();
        }
        int i6 = (i5 + hashCode8) * 31;
        String str5 = this.season;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i7 = (i6 + hashCode9) * 31;
        Integer num5 = this.seasonYear;
        if (num5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num5.hashCode();
        }
        int i8 = (i7 + hashCode10) * 31;
        List<String> list = this.genres;
        if (list != null) {
            i = list.hashCode();
        }
        return Long.hashCode(this.airedAt) + qx1.c(this.episodeNumber, zo5.g((i8 + i) * 31, 31, this.adult), 31);
    }

    public String toString() {
        String str = this.id;
        int i = this.anilistId;
        Integer num = this.malId;
        Title title = this.title;
        CoverImage coverImage = this.coverImage;
        String str2 = this.thumbnailImage;
        String str3 = this.logo;
        String str4 = this.color;
        MediaFormat mediaFormat = this.format;
        MediaStatus mediaStatus = this.status;
        Integer num2 = this.averageScore;
        Integer num3 = this.popularity;
        Integer num4 = this.trending;
        String str5 = this.season;
        Integer num5 = this.seasonYear;
        List<String> list = this.genres;
        boolean z = this.adult;
        int i2 = this.episodeNumber;
        long j = this.airedAt;
        StringBuilder m = h11.m(i, "Recent(id=", str, ", anilistId=", ", malId=");
        m.append(num);
        m.append(", title=");
        m.append(title);
        m.append(", coverImage=");
        m.append(coverImage);
        m.append(", thumbnailImage=");
        m.append(str2);
        m.append(", logo=");
        qx1.x(m, str3, ", color=", str4, ", format=");
        m.append(mediaFormat);
        m.append(", status=");
        m.append(mediaStatus);
        m.append(", averageScore=");
        m.append(num2);
        m.append(", popularity=");
        m.append(num3);
        m.append(", trending=");
        m.append(num4);
        m.append(", season=");
        m.append(str5);
        m.append(", seasonYear=");
        m.append(num5);
        m.append(", genres=");
        m.append(list);
        m.append(", adult=");
        m.append(z);
        m.append(", episodeNumber=");
        m.append(i2);
        m.append(", airedAt=");
        return qx1.k(j, ")", m);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Recent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Recent(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, String str5, Integer num5, List<String> list, boolean z, int i2, long j) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        this.id = str;
        this.anilistId = i;
        this.malId = num;
        this.title = title;
        this.coverImage = coverImage;
        this.thumbnailImage = str2;
        this.logo = str3;
        this.color = str4;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.averageScore = num2;
        this.popularity = num3;
        this.trending = num4;
        this.season = str5;
        this.seasonYear = num5;
        this.genres = list;
        this.adult = z;
        this.episodeNumber = i2;
        this.airedAt = j;
    }

    public /* synthetic */ Recent(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, String str5, Integer num5, List list, boolean z, int i2, long j, int i3, q71 q71Var) {
        this((i3 & 1) != 0 ? null : str, i, num, title, coverImage, str2, str3, str4, mediaFormat, mediaStatus, num2, num3, num4, str5, num5, list, z, i2, j);
    }
}
