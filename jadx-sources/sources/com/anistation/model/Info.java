package com.anistation.model;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.co2;
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
import defpackage.nt1;
import defpackage.q71;
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
public final class Info {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final boolean adult;
    private final int anilistId;
    private final Integer averageScore;
    private final String bannerImage;
    private final String color;
    private final String country;
    private final CoverImage coverImage;
    private final String description;
    private final Integer duration;
    private final String endDate;
    private final MediaFormat format;
    private final List<String> genres;
    private final String id;
    private final Integer malId;
    private final NextAiringEpisode nextAiringEpisode;
    private final Integer popularity;
    private final List<Recommendation> recommendations;
    private final List<Relation> relations;
    private final MediaSeason season;
    private final Integer seasonYear;
    private final MediaSource source;
    private final String startDate;
    private final MediaStatus status;
    private final List<Studio> studios;
    private final List<String> synonyms;
    private final Title title;
    private final Integer totalEpisodes;
    private final Integer trending;
    private final List<AnimeWatchOrderItem> watchOrder;

    static {
        co2 co2Var = new co2((byte) 14);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{null, null, null, null, null, null, null, null, null, null, bx7.B(jf3Var, co2Var), bx7.B(jf3Var, new co2((byte) 15)), null, null, null, null, null, bx7.B(jf3Var, new co2((byte) 16)), null, bx7.B(jf3Var, new co2((byte) 17)), bx7.B(jf3Var, new co2((byte) 18)), null, bx7.B(jf3Var, new co2((byte) 19)), null, null, bx7.B(jf3Var, new co2((byte) 20)), bx7.B(jf3Var, new co2((byte) 21)), bx7.B(jf3Var, new co2((byte) 22)), bx7.B(jf3Var, new co2((byte) 23))};
    }

    public /* synthetic */ Info(int i, String str, int i2, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, String str5, String str6, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, MediaSeason mediaSeason, Integer num7, List list, List list2, String str7, MediaSource mediaSource, boolean z, NextAiringEpisode nextAiringEpisode, List list3, List list4, List list5, List list6, kj5 kj5Var) {
        if (469762046 != (i & 469762046)) {
            iq4.throwMissingFieldException(i, 469762046, Info$$serializer.INSTANCE.getDescriptor());
        }
        this.id = (i & 1) == 0 ? null : str;
        this.anilistId = i2;
        this.malId = num;
        this.title = title;
        this.coverImage = coverImage;
        this.bannerImage = str2;
        this.color = str3;
        this.description = str4;
        this.startDate = str5;
        this.endDate = str6;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.totalEpisodes = num2;
        this.duration = num3;
        this.averageScore = num4;
        this.popularity = num5;
        this.trending = num6;
        this.season = mediaSeason;
        this.seasonYear = num7;
        this.genres = list;
        this.synonyms = list2;
        this.country = str7;
        this.source = mediaSource;
        this.adult = z;
        this.nextAiringEpisode = nextAiringEpisode;
        this.studios = list3;
        this.watchOrder = (i & 67108864) == 0 ? nt1.x : list4;
        this.relations = list5;
        this.recommendations = list6;
    }

    public static final x73 _childSerializers$_anonymous_() {
        MediaFormat[] values = MediaFormat.values();
        values.getClass();
        return new uv1("com.anistation.model.MediaFormat", values);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$0() {
        return MediaStatus.Companion.serializer();
    }

    public static final x73 _childSerializers$_anonymous_$1() {
        MediaSeason[] values = MediaSeason.values();
        values.getClass();
        return new uv1("com.anistation.model.MediaSeason", values);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$2() {
        return new ds(mz5.a, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$3() {
        return new ds(mz5.a, (byte) 0);
    }

    public static final x73 _childSerializers$_anonymous_$4() {
        MediaSource[] values = MediaSource.values();
        values.getClass();
        return new uv1("com.anistation.model.MediaSource", values);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$5() {
        return new ds(Studio$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$6() {
        return new ds(AnimeWatchOrderItem$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$7() {
        return new ds(Relation$$serializer.INSTANCE, (byte) 0);
    }

    public static final /* synthetic */ x73 _childSerializers$_anonymous_$8() {
        return new ds(Recommendation$$serializer.INSTANCE, (byte) 0);
    }

    public static /* synthetic */ Info copy$default(Info info, String str, int i, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, String str5, String str6, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, MediaSeason mediaSeason, Integer num7, List list, List list2, String str7, MediaSource mediaSource, boolean z, NextAiringEpisode nextAiringEpisode, List list3, List list4, List list5, List list6, int i2, Object obj) {
        List list7;
        List list8;
        String str8 = (i2 & 1) != 0 ? info.id : str;
        int i3 = (i2 & 2) != 0 ? info.anilistId : i;
        Integer num8 = (i2 & 4) != 0 ? info.malId : num;
        Title title2 = (i2 & 8) != 0 ? info.title : title;
        CoverImage coverImage2 = (i2 & 16) != 0 ? info.coverImage : coverImage;
        String str9 = (i2 & 32) != 0 ? info.bannerImage : str2;
        String str10 = (i2 & 64) != 0 ? info.color : str3;
        String str11 = (i2 & 128) != 0 ? info.description : str4;
        String str12 = (i2 & 256) != 0 ? info.startDate : str5;
        String str13 = (i2 & 512) != 0 ? info.endDate : str6;
        MediaFormat mediaFormat2 = (i2 & 1024) != 0 ? info.format : mediaFormat;
        MediaStatus mediaStatus2 = (i2 & 2048) != 0 ? info.status : mediaStatus;
        Integer num9 = (i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? info.totalEpisodes : num2;
        Integer num10 = (i2 & 8192) != 0 ? info.duration : num3;
        String str14 = str8;
        Integer num11 = (i2 & 16384) != 0 ? info.averageScore : num4;
        Integer num12 = (i2 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? info.popularity : num5;
        Integer num13 = (i2 & 65536) != 0 ? info.trending : num6;
        MediaSeason mediaSeason2 = (i2 & 131072) != 0 ? info.season : mediaSeason;
        Integer num14 = (i2 & 262144) != 0 ? info.seasonYear : num7;
        List list9 = (i2 & 524288) != 0 ? info.genres : list;
        List list10 = (i2 & 1048576) != 0 ? info.synonyms : list2;
        String str15 = (i2 & 2097152) != 0 ? info.country : str7;
        MediaSource mediaSource2 = (i2 & 4194304) != 0 ? info.source : mediaSource;
        boolean z2 = (i2 & 8388608) != 0 ? info.adult : z;
        NextAiringEpisode nextAiringEpisode2 = (i2 & 16777216) != 0 ? info.nextAiringEpisode : nextAiringEpisode;
        List list11 = (i2 & 33554432) != 0 ? info.studios : list3;
        List list12 = (i2 & 67108864) != 0 ? info.watchOrder : list4;
        List list13 = (i2 & 134217728) != 0 ? info.relations : list5;
        if ((i2 & 268435456) != 0) {
            list8 = list13;
            list7 = info.recommendations;
        } else {
            list7 = list6;
            list8 = list13;
        }
        return info.copy(str14, i3, num8, title2, coverImage2, str9, str10, str11, str12, str13, mediaFormat2, mediaStatus2, num9, num10, num11, num12, num13, mediaSeason2, num14, list9, list10, str15, mediaSource2, z2, nextAiringEpisode2, list11, list12, list8, list7);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Info info, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || info.id != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5.a, info.id);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.t(1, info.anilistId, aj5Var);
        i13 i13Var = i13.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, i13Var, info.malId);
        v0Var.v(aj5Var, 3, Title$$serializer.INSTANCE, info.title);
        v0Var.v(aj5Var, 4, CoverImage$$serializer.INSTANCE, info.coverImage);
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 5, mz5Var, info.bannerImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 6, mz5Var, info.color);
        hu0Var.encodeNullableSerializableElement(aj5Var, 7, mz5Var, info.description);
        hu0Var.encodeNullableSerializableElement(aj5Var, 8, mz5Var, info.startDate);
        hu0Var.encodeNullableSerializableElement(aj5Var, 9, mz5Var, info.endDate);
        v0Var.v(aj5Var, 10, (mj5) rb3VarArr[10].getValue(), info.format);
        v0Var.v(aj5Var, 11, (mj5) rb3VarArr[11].getValue(), info.status);
        hu0Var.encodeNullableSerializableElement(aj5Var, 12, i13Var, info.totalEpisodes);
        hu0Var.encodeNullableSerializableElement(aj5Var, 13, i13Var, info.duration);
        hu0Var.encodeNullableSerializableElement(aj5Var, 14, i13Var, info.averageScore);
        hu0Var.encodeNullableSerializableElement(aj5Var, 15, i13Var, info.popularity);
        hu0Var.encodeNullableSerializableElement(aj5Var, 16, i13Var, info.trending);
        hu0Var.encodeNullableSerializableElement(aj5Var, 17, (mj5) rb3VarArr[17].getValue(), info.season);
        hu0Var.encodeNullableSerializableElement(aj5Var, 18, i13Var, info.seasonYear);
        v0Var.v(aj5Var, 19, (mj5) rb3VarArr[19].getValue(), info.genres);
        v0Var.v(aj5Var, 20, (mj5) rb3VarArr[20].getValue(), info.synonyms);
        hu0Var.encodeNullableSerializableElement(aj5Var, 21, mz5Var, info.country);
        hu0Var.encodeNullableSerializableElement(aj5Var, 22, (mj5) rb3VarArr[22].getValue(), info.source);
        v0Var.p(aj5Var, 23, info.adult);
        hu0Var.encodeNullableSerializableElement(aj5Var, 24, NextAiringEpisode$$serializer.INSTANCE, info.nextAiringEpisode);
        v0Var.v(aj5Var, 25, (mj5) rb3VarArr[25].getValue(), info.studios);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 26) || !a34.i(info.watchOrder, nt1.x)) {
            v0Var.v(aj5Var, 26, (mj5) rb3VarArr[26].getValue(), info.watchOrder);
        }
        v0Var.v(aj5Var, 27, (mj5) rb3VarArr[27].getValue(), info.relations);
        v0Var.v(aj5Var, 28, (mj5) rb3VarArr[28].getValue(), info.recommendations);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.endDate;
    }

    public final MediaFormat component11() {
        return this.format;
    }

    public final MediaStatus component12() {
        return this.status;
    }

    public final Integer component13() {
        return this.totalEpisodes;
    }

    public final Integer component14() {
        return this.duration;
    }

    public final Integer component15() {
        return this.averageScore;
    }

    public final Integer component16() {
        return this.popularity;
    }

    public final Integer component17() {
        return this.trending;
    }

    public final MediaSeason component18() {
        return this.season;
    }

    public final Integer component19() {
        return this.seasonYear;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final List<String> component20() {
        return this.genres;
    }

    public final List<String> component21() {
        return this.synonyms;
    }

    public final String component22() {
        return this.country;
    }

    public final MediaSource component23() {
        return this.source;
    }

    public final boolean component24() {
        return this.adult;
    }

    public final NextAiringEpisode component25() {
        return this.nextAiringEpisode;
    }

    public final List<Studio> component26() {
        return this.studios;
    }

    public final List<AnimeWatchOrderItem> component27() {
        return this.watchOrder;
    }

    public final List<Relation> component28() {
        return this.relations;
    }

    public final List<Recommendation> component29() {
        return this.recommendations;
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
        return this.bannerImage;
    }

    public final String component7() {
        return this.color;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.startDate;
    }

    public final Info copy(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, String str5, String str6, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, MediaSeason mediaSeason, Integer num7, List<String> list, List<String> list2, String str7, MediaSource mediaSource, boolean z, NextAiringEpisode nextAiringEpisode, List<Studio> list3, List<AnimeWatchOrderItem> list4, List<Relation> list5, List<Recommendation> list6) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new Info(str, i, num, title, coverImage, str2, str3, str4, str5, str6, mediaFormat, mediaStatus, num2, num3, num4, num5, num6, mediaSeason, num7, list, list2, str7, mediaSource, z, nextAiringEpisode, list3, list4, list5, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Info)) {
            return false;
        }
        Info info = (Info) obj;
        if (a34.i(this.id, info.id) && this.anilistId == info.anilistId && a34.i(this.malId, info.malId) && a34.i(this.title, info.title) && a34.i(this.coverImage, info.coverImage) && a34.i(this.bannerImage, info.bannerImage) && a34.i(this.color, info.color) && a34.i(this.description, info.description) && a34.i(this.startDate, info.startDate) && a34.i(this.endDate, info.endDate) && this.format == info.format && this.status == info.status && a34.i(this.totalEpisodes, info.totalEpisodes) && a34.i(this.duration, info.duration) && a34.i(this.averageScore, info.averageScore) && a34.i(this.popularity, info.popularity) && a34.i(this.trending, info.trending) && this.season == info.season && a34.i(this.seasonYear, info.seasonYear) && a34.i(this.genres, info.genres) && a34.i(this.synonyms, info.synonyms) && a34.i(this.country, info.country) && this.source == info.source && this.adult == info.adult && a34.i(this.nextAiringEpisode, info.nextAiringEpisode) && a34.i(this.studios, info.studios) && a34.i(this.watchOrder, info.watchOrder) && a34.i(this.relations, info.relations) && a34.i(this.recommendations, info.recommendations)) {
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

    public final String getBannerImage() {
        return this.bannerImage;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCountry() {
        return this.country;
    }

    public final CoverImage getCoverImage() {
        return this.coverImage;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getEndDate() {
        return this.endDate;
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

    public final NextAiringEpisode getNextAiringEpisode() {
        return this.nextAiringEpisode;
    }

    public final Integer getPopularity() {
        return this.popularity;
    }

    public final List<Recommendation> getRecommendations() {
        return this.recommendations;
    }

    public final List<Relation> getRelations() {
        return this.relations;
    }

    public final MediaSeason getSeason() {
        return this.season;
    }

    public final Integer getSeasonYear() {
        return this.seasonYear;
    }

    public final MediaSource getSource() {
        return this.source;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final MediaStatus getStatus() {
        return this.status;
    }

    public final List<Studio> getStudios() {
        return this.studios;
    }

    public final List<String> getSynonyms() {
        return this.synonyms;
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

    public final List<AnimeWatchOrderItem> getWatchOrder() {
        return this.watchOrder;
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
        int hashCode15;
        int hashCode16;
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
        int hashCode17 = (this.coverImage.hashCode() + ((this.title.hashCode() + ((c + hashCode2) * 31)) * 31)) * 31;
        String str2 = this.bannerImage;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i2 = (hashCode17 + hashCode3) * 31;
        String str3 = this.color;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        String str4 = this.description;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i4 = (i3 + hashCode5) * 31;
        String str5 = this.startDate;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i5 = (i4 + hashCode6) * 31;
        String str6 = this.endDate;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int hashCode18 = (this.status.hashCode() + ((this.format.hashCode() + ((i5 + hashCode7) * 31)) * 31)) * 31;
        Integer num2 = this.totalEpisodes;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i6 = (hashCode18 + hashCode8) * 31;
        Integer num3 = this.duration;
        if (num3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num3.hashCode();
        }
        int i7 = (i6 + hashCode9) * 31;
        Integer num4 = this.averageScore;
        if (num4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num4.hashCode();
        }
        int i8 = (i7 + hashCode10) * 31;
        Integer num5 = this.popularity;
        if (num5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num5.hashCode();
        }
        int i9 = (i8 + hashCode11) * 31;
        Integer num6 = this.trending;
        if (num6 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num6.hashCode();
        }
        int i10 = (i9 + hashCode12) * 31;
        MediaSeason mediaSeason = this.season;
        if (mediaSeason == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = mediaSeason.hashCode();
        }
        int i11 = (i10 + hashCode13) * 31;
        Integer num7 = this.seasonYear;
        if (num7 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = num7.hashCode();
        }
        int j = zo5.j(this.synonyms, zo5.j(this.genres, (i11 + hashCode14) * 31, 31), 31);
        String str7 = this.country;
        if (str7 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str7.hashCode();
        }
        int i12 = (j + hashCode15) * 31;
        MediaSource mediaSource = this.source;
        if (mediaSource == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = mediaSource.hashCode();
        }
        int g = zo5.g((i12 + hashCode16) * 31, 31, this.adult);
        NextAiringEpisode nextAiringEpisode = this.nextAiringEpisode;
        if (nextAiringEpisode != null) {
            i = nextAiringEpisode.hashCode();
        }
        return this.recommendations.hashCode() + zo5.j(this.relations, zo5.j(this.watchOrder, zo5.j(this.studios, (g + i) * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.id;
        int i = this.anilistId;
        Integer num = this.malId;
        Title title = this.title;
        CoverImage coverImage = this.coverImage;
        String str2 = this.bannerImage;
        String str3 = this.color;
        String str4 = this.description;
        String str5 = this.startDate;
        String str6 = this.endDate;
        MediaFormat mediaFormat = this.format;
        MediaStatus mediaStatus = this.status;
        Integer num2 = this.totalEpisodes;
        Integer num3 = this.duration;
        Integer num4 = this.averageScore;
        Integer num5 = this.popularity;
        Integer num6 = this.trending;
        MediaSeason mediaSeason = this.season;
        Integer num7 = this.seasonYear;
        List<String> list = this.genres;
        List<String> list2 = this.synonyms;
        String str7 = this.country;
        MediaSource mediaSource = this.source;
        boolean z = this.adult;
        NextAiringEpisode nextAiringEpisode = this.nextAiringEpisode;
        List<Studio> list3 = this.studios;
        List<AnimeWatchOrderItem> list4 = this.watchOrder;
        List<Relation> list5 = this.relations;
        List<Recommendation> list6 = this.recommendations;
        StringBuilder m = h11.m(i, "Info(id=", str, ", anilistId=", ", malId=");
        m.append(num);
        m.append(", title=");
        m.append(title);
        m.append(", coverImage=");
        m.append(coverImage);
        m.append(", bannerImage=");
        m.append(str2);
        m.append(", color=");
        qx1.x(m, str3, ", description=", str4, ", startDate=");
        qx1.x(m, str5, ", endDate=", str6, ", format=");
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
        m.append(mediaSeason);
        m.append(", seasonYear=");
        m.append(num7);
        m.append(", genres=");
        m.append(list);
        m.append(", synonyms=");
        m.append(list2);
        m.append(", country=");
        m.append(str7);
        m.append(", source=");
        m.append(mediaSource);
        m.append(", adult=");
        m.append(z);
        m.append(", nextAiringEpisode=");
        m.append(nextAiringEpisode);
        m.append(", studios=");
        m.append(list3);
        m.append(", watchOrder=");
        m.append(list4);
        m.append(", relations=");
        m.append(list5);
        m.append(", recommendations=");
        m.append(list6);
        m.append(")");
        return m.toString();
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Info$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Info(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, String str5, String str6, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, MediaSeason mediaSeason, Integer num7, List<String> list, List<String> list2, String str7, MediaSource mediaSource, boolean z, NextAiringEpisode nextAiringEpisode, List<Studio> list3, List<AnimeWatchOrderItem> list4, List<Relation> list5, List<Recommendation> list6) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        this.id = str;
        this.anilistId = i;
        this.malId = num;
        this.title = title;
        this.coverImage = coverImage;
        this.bannerImage = str2;
        this.color = str3;
        this.description = str4;
        this.startDate = str5;
        this.endDate = str6;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.totalEpisodes = num2;
        this.duration = num3;
        this.averageScore = num4;
        this.popularity = num5;
        this.trending = num6;
        this.season = mediaSeason;
        this.seasonYear = num7;
        this.genres = list;
        this.synonyms = list2;
        this.country = str7;
        this.source = mediaSource;
        this.adult = z;
        this.nextAiringEpisode = nextAiringEpisode;
        this.studios = list3;
        this.watchOrder = list4;
        this.relations = list5;
        this.recommendations = list6;
    }

    public /* synthetic */ Info(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, String str3, String str4, String str5, String str6, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, MediaSeason mediaSeason, Integer num7, List list, List list2, String str7, MediaSource mediaSource, boolean z, NextAiringEpisode nextAiringEpisode, List list3, List list4, List list5, List list6, int i2, q71 q71Var) {
        this((i2 & 1) != 0 ? null : str, i, num, title, coverImage, str2, str3, str4, str5, str6, mediaFormat, mediaStatus, num2, num3, num4, num5, num6, mediaSeason, num7, list, list2, str7, mediaSource, z, nextAiringEpisode, list3, (i2 & 67108864) != 0 ? nt1.x : list4, list5, list6);
    }
}
