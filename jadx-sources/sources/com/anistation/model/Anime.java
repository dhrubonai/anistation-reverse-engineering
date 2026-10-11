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
import defpackage.qx1;
import defpackage.rb3;
import defpackage.t;
import defpackage.uv1;
import defpackage.v0;
import defpackage.x73;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Anime {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final boolean adult;
    private final int anilistId;
    private final Integer averageScore;
    private final String color;
    private final CoverImage coverImage;
    private final Integer duration;
    private final MediaFormat format;
    private final List<String> genres;
    private final String id;
    private final Integer malId;
    private final Integer popularity;
    private final String season;
    private final Integer seasonYear;
    private final MediaStatus status;
    private final Title title;
    private final Integer totalEpisodes;
    private final Integer trending;

    static {
        t tVar = new t((byte) 19);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{null, null, null, null, null, null, bx7.B(jf3Var, tVar), bx7.B(jf3Var, new t((byte) 20)), null, null, null, null, null, null, null, bx7.B(jf3Var, new t((byte) 21)), null};
    }

    public /* synthetic */ Anime(int i, String str, int i2, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, Integer num7, List list, boolean z, kj5 kj5Var) {
        if (131070 != (i & 131070)) {
            iq4.throwMissingFieldException(i, 131070, Anime$$serializer.INSTANCE.getDescriptor());
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
        this.color = str2;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.totalEpisodes = num2;
        this.duration = num3;
        this.averageScore = num4;
        this.popularity = num5;
        this.trending = num6;
        this.season = str3;
        this.seasonYear = num7;
        this.genres = list;
        this.adult = z;
    }

    public static final x73 _childSerializers$_anonymous_() {
        MediaFormat[] values = MediaFormat.values();
        values.getClass();
        return new uv1("com.anistation.model.MediaFormat", values);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$0() {
        return MediaStatus.Companion.serializer();
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$1() {
        return new ds(mz5.a, (byte) 0);
    }

    public static /* synthetic */ x73 a() {
        return _childSerializers$_anonymous_$0();
    }

    public static /* synthetic */ x73 b() {
        return _childSerializers$_anonymous_();
    }

    public static /* synthetic */ x73 c() {
        return _childSerializers$_anonymous_$1();
    }

    public static /* synthetic */ Anime copy$default(Anime anime, String str, int i, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, Integer num7, List list, boolean z, int i2, Object obj) {
        String str4;
        int i3;
        Integer num8;
        Title title2;
        CoverImage coverImage2;
        String str5;
        MediaFormat mediaFormat2;
        MediaStatus mediaStatus2;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        String str6;
        Integer num14;
        List list2;
        boolean z2;
        List list3;
        String str7;
        Anime anime2;
        Integer num15;
        int i4;
        Integer num16;
        Title title3;
        CoverImage coverImage3;
        String str8;
        MediaFormat mediaFormat3;
        MediaStatus mediaStatus3;
        Integer num17;
        Integer num18;
        Integer num19;
        Integer num20;
        Integer num21;
        String str9;
        if ((i2 & 1) != 0) {
            str4 = anime.id;
        } else {
            str4 = str;
        }
        if ((i2 & 2) != 0) {
            i3 = anime.anilistId;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            num8 = anime.malId;
        } else {
            num8 = num;
        }
        if ((i2 & 8) != 0) {
            title2 = anime.title;
        } else {
            title2 = title;
        }
        if ((i2 & 16) != 0) {
            coverImage2 = anime.coverImage;
        } else {
            coverImage2 = coverImage;
        }
        if ((i2 & 32) != 0) {
            str5 = anime.color;
        } else {
            str5 = str2;
        }
        if ((i2 & 64) != 0) {
            mediaFormat2 = anime.format;
        } else {
            mediaFormat2 = mediaFormat;
        }
        if ((i2 & 128) != 0) {
            mediaStatus2 = anime.status;
        } else {
            mediaStatus2 = mediaStatus;
        }
        if ((i2 & 256) != 0) {
            num9 = anime.totalEpisodes;
        } else {
            num9 = num2;
        }
        if ((i2 & 512) != 0) {
            num10 = anime.duration;
        } else {
            num10 = num3;
        }
        if ((i2 & 1024) != 0) {
            num11 = anime.averageScore;
        } else {
            num11 = num4;
        }
        if ((i2 & 2048) != 0) {
            num12 = anime.popularity;
        } else {
            num12 = num5;
        }
        if ((i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            num13 = anime.trending;
        } else {
            num13 = num6;
        }
        if ((i2 & 8192) != 0) {
            str6 = anime.season;
        } else {
            str6 = str3;
        }
        String str10 = str4;
        if ((i2 & 16384) != 0) {
            num14 = anime.seasonYear;
        } else {
            num14 = num7;
        }
        if ((i2 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            list2 = anime.genres;
        } else {
            list2 = list;
        }
        if ((i2 & 65536) != 0) {
            list3 = list2;
            z2 = anime.adult;
            num15 = num14;
            i4 = i3;
            num16 = num8;
            title3 = title2;
            coverImage3 = coverImage2;
            str8 = str5;
            mediaFormat3 = mediaFormat2;
            mediaStatus3 = mediaStatus2;
            num17 = num9;
            num18 = num10;
            num19 = num11;
            num20 = num12;
            num21 = num13;
            str9 = str6;
            str7 = str10;
            anime2 = anime;
        } else {
            z2 = z;
            list3 = list2;
            str7 = str10;
            anime2 = anime;
            num15 = num14;
            i4 = i3;
            num16 = num8;
            title3 = title2;
            coverImage3 = coverImage2;
            str8 = str5;
            mediaFormat3 = mediaFormat2;
            mediaStatus3 = mediaStatus2;
            num17 = num9;
            num18 = num10;
            num19 = num11;
            num20 = num12;
            num21 = num13;
            str9 = str6;
        }
        return anime2.copy(str7, i4, num16, title3, coverImage3, str8, mediaFormat3, mediaStatus3, num17, num18, num19, num20, num21, str9, num15, list3, z2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Anime anime, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || anime.id != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5.a, anime.id);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.t(1, anime.anilistId, aj5Var);
        i13 i13Var = i13.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, i13Var, anime.malId);
        v0Var.v(aj5Var, 3, Title$$serializer.INSTANCE, anime.title);
        v0Var.v(aj5Var, 4, CoverImage$$serializer.INSTANCE, anime.coverImage);
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 5, mz5Var, anime.color);
        v0Var.v(aj5Var, 6, (mj5) rb3VarArr[6].getValue(), anime.format);
        v0Var.v(aj5Var, 7, (mj5) rb3VarArr[7].getValue(), anime.status);
        hu0Var.encodeNullableSerializableElement(aj5Var, 8, i13Var, anime.totalEpisodes);
        hu0Var.encodeNullableSerializableElement(aj5Var, 9, i13Var, anime.duration);
        hu0Var.encodeNullableSerializableElement(aj5Var, 10, i13Var, anime.averageScore);
        hu0Var.encodeNullableSerializableElement(aj5Var, 11, i13Var, anime.popularity);
        hu0Var.encodeNullableSerializableElement(aj5Var, 12, i13Var, anime.trending);
        hu0Var.encodeNullableSerializableElement(aj5Var, 13, mz5Var, anime.season);
        hu0Var.encodeNullableSerializableElement(aj5Var, 14, i13Var, anime.seasonYear);
        hu0Var.encodeNullableSerializableElement(aj5Var, 15, (mj5) rb3VarArr[15].getValue(), anime.genres);
        v0Var.p(aj5Var, 16, anime.adult);
    }

    public final String component1() {
        return this.id;
    }

    public final Integer component10() {
        return this.duration;
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
        return this.color;
    }

    public final MediaFormat component7() {
        return this.format;
    }

    public final MediaStatus component8() {
        return this.status;
    }

    public final Integer component9() {
        return this.totalEpisodes;
    }

    public final Anime copy(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, Integer num7, List<String> list, boolean z) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        return new Anime(str, i, num, title, coverImage, str2, mediaFormat, mediaStatus, num2, num3, num4, num5, num6, str3, num7, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Anime)) {
            return false;
        }
        Anime anime = (Anime) obj;
        if (a34.i(this.id, anime.id) && this.anilistId == anime.anilistId && a34.i(this.malId, anime.malId) && a34.i(this.title, anime.title) && a34.i(this.coverImage, anime.coverImage) && a34.i(this.color, anime.color) && this.format == anime.format && this.status == anime.status && a34.i(this.totalEpisodes, anime.totalEpisodes) && a34.i(this.duration, anime.duration) && a34.i(this.averageScore, anime.averageScore) && a34.i(this.popularity, anime.popularity) && a34.i(this.trending, anime.trending) && a34.i(this.season, anime.season) && a34.i(this.seasonYear, anime.seasonYear) && a34.i(this.genres, anime.genres) && this.adult == anime.adult) {
            return true;
        }
        return false;
    }

    public final boolean getAdult() {
        return this.adult;
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

    public final Integer getDuration() {
        return this.duration;
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

    public final Title getTitle() {
        return this.title;
    }

    public final Integer getTotalEpisodes() {
        return this.totalEpisodes;
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
        String str2 = this.color;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode12 = (this.status.hashCode() + ((this.format.hashCode() + ((hashCode11 + hashCode3) * 31)) * 31)) * 31;
        Integer num2 = this.totalEpisodes;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i2 = (hashCode12 + hashCode4) * 31;
        Integer num3 = this.duration;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i3 = (i2 + hashCode5) * 31;
        Integer num4 = this.averageScore;
        if (num4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num4.hashCode();
        }
        int i4 = (i3 + hashCode6) * 31;
        Integer num5 = this.popularity;
        if (num5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num5.hashCode();
        }
        int i5 = (i4 + hashCode7) * 31;
        Integer num6 = this.trending;
        if (num6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num6.hashCode();
        }
        int i6 = (i5 + hashCode8) * 31;
        String str3 = this.season;
        if (str3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str3.hashCode();
        }
        int i7 = (i6 + hashCode9) * 31;
        Integer num7 = this.seasonYear;
        if (num7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num7.hashCode();
        }
        int i8 = (i7 + hashCode10) * 31;
        List<String> list = this.genres;
        if (list != null) {
            i = list.hashCode();
        }
        return Boolean.hashCode(this.adult) + ((i8 + i) * 31);
    }

    public String toString() {
        String str = this.id;
        int i = this.anilistId;
        Integer num = this.malId;
        Title title = this.title;
        CoverImage coverImage = this.coverImage;
        String str2 = this.color;
        MediaFormat mediaFormat = this.format;
        MediaStatus mediaStatus = this.status;
        Integer num2 = this.totalEpisodes;
        Integer num3 = this.duration;
        Integer num4 = this.averageScore;
        Integer num5 = this.popularity;
        Integer num6 = this.trending;
        String str3 = this.season;
        Integer num7 = this.seasonYear;
        List<String> list = this.genres;
        boolean z = this.adult;
        StringBuilder m = h11.m(i, "Anime(id=", str, ", anilistId=", ", malId=");
        m.append(num);
        m.append(", title=");
        m.append(title);
        m.append(", coverImage=");
        m.append(coverImage);
        m.append(", color=");
        m.append(str2);
        m.append(", format=");
        m.append(mediaFormat);
        m.append(", status=");
        m.append(mediaStatus);
        m.append(", totalEpisodes=");
        m.append(num2);
        m.append(", duration=");
        m.append(num3);
        m.append(", averageScore=");
        m.append(num4);
        m.append(", popularity=");
        m.append(num5);
        m.append(", trending=");
        m.append(num6);
        m.append(", season=");
        m.append(str3);
        m.append(", seasonYear=");
        m.append(num7);
        m.append(", genres=");
        m.append(list);
        m.append(", adult=");
        return qx1.r(m, z, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Anime$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Anime(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, Integer num7, List<String> list, boolean z) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        this.id = str;
        this.anilistId = i;
        this.malId = num;
        this.title = title;
        this.coverImage = coverImage;
        this.color = str2;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.totalEpisodes = num2;
        this.duration = num3;
        this.averageScore = num4;
        this.popularity = num5;
        this.trending = num6;
        this.season = str3;
        this.seasonYear = num7;
        this.genres = list;
        this.adult = z;
    }

    public /* synthetic */ Anime(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, Integer num7, List list, boolean z, int i2, q71 q71Var) {
        this((i2 & 1) != 0 ? null : str, i, num, title, coverImage, str2, mediaFormat, mediaStatus, num2, num3, num4, num5, num6, str3, num7, list, z);
    }
}
