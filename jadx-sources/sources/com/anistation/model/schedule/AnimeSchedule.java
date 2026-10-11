package com.anistation.model.schedule;

import com.anistation.model.CoverImage;
import com.anistation.model.CoverImage$$serializer;
import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.anistation.model.Title;
import com.anistation.model.Title$$serializer;
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
import defpackage.zo5;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class AnimeSchedule {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final boolean adult;
    private final long airingAt;
    private final int anilistId;
    private final Integer averageScore;
    private final String color;
    private final CoverImage coverImage;
    private final Integer episode;
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
        t tVar = new t((byte) 22);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{null, null, null, null, null, null, bx7.B(jf3Var, tVar), bx7.B(jf3Var, new t((byte) 23)), null, null, null, null, null, null, bx7.B(jf3Var, new t((byte) 24)), null, null, null};
    }

    public /* synthetic */ AnimeSchedule(int i, String str, int i2, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, String str3, Integer num6, List list, boolean z, Integer num7, long j, kj5 kj5Var) {
        if (262143 != (i & 262143)) {
            iq4.throwMissingFieldException(i, 262143, AnimeSchedule$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.anilistId = i2;
        this.malId = num;
        this.title = title;
        this.coverImage = coverImage;
        this.color = str2;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.totalEpisodes = num2;
        this.averageScore = num3;
        this.popularity = num4;
        this.trending = num5;
        this.season = str3;
        this.seasonYear = num6;
        this.genres = list;
        this.adult = z;
        this.episode = num7;
        this.airingAt = j;
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

    public static /* synthetic */ AnimeSchedule copy$default(AnimeSchedule animeSchedule, String str, int i, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, String str3, Integer num6, List list, boolean z, Integer num7, long j, int i2, Object obj) {
        long j2;
        Integer num8;
        List list2;
        String str4 = (i2 & 1) != 0 ? animeSchedule.id : str;
        int i3 = (i2 & 2) != 0 ? animeSchedule.anilistId : i;
        Integer num9 = (i2 & 4) != 0 ? animeSchedule.malId : num;
        Title title2 = (i2 & 8) != 0 ? animeSchedule.title : title;
        CoverImage coverImage2 = (i2 & 16) != 0 ? animeSchedule.coverImage : coverImage;
        String str5 = (i2 & 32) != 0 ? animeSchedule.color : str2;
        MediaFormat mediaFormat2 = (i2 & 64) != 0 ? animeSchedule.format : mediaFormat;
        MediaStatus mediaStatus2 = (i2 & 128) != 0 ? animeSchedule.status : mediaStatus;
        Integer num10 = (i2 & 256) != 0 ? animeSchedule.totalEpisodes : num2;
        Integer num11 = (i2 & 512) != 0 ? animeSchedule.averageScore : num3;
        Integer num12 = (i2 & 1024) != 0 ? animeSchedule.popularity : num4;
        Integer num13 = (i2 & 2048) != 0 ? animeSchedule.trending : num5;
        String str6 = (i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? animeSchedule.season : str3;
        Integer num14 = (i2 & 8192) != 0 ? animeSchedule.seasonYear : num6;
        String str7 = str4;
        List list3 = (i2 & 16384) != 0 ? animeSchedule.genres : list;
        boolean z2 = (i2 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? animeSchedule.adult : z;
        Integer num15 = (i2 & 65536) != 0 ? animeSchedule.episode : num7;
        if ((i2 & 131072) != 0) {
            list2 = list3;
            num8 = num15;
            j2 = animeSchedule.airingAt;
        } else {
            j2 = j;
            num8 = num15;
            list2 = list3;
        }
        return animeSchedule.copy(str7, i3, num9, title2, coverImage2, str5, mediaFormat2, mediaStatus2, num10, num11, num12, num13, str6, num14, list2, z2, num8, j2);
    }

    private final LocalDateTime getLocalDateTime() {
        LocalDateTime ofInstant = LocalDateTime.ofInstant(Instant.ofEpochSecond(this.airingAt), ZoneId.systemDefault());
        ofInstant.getClass();
        return ofInstant;
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(AnimeSchedule animeSchedule, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5Var, animeSchedule.id);
        v0 v0Var = (v0) hu0Var;
        v0Var.t(1, animeSchedule.anilistId, aj5Var);
        i13 i13Var = i13.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, i13Var, animeSchedule.malId);
        v0Var.v(aj5Var, 3, Title$$serializer.INSTANCE, animeSchedule.title);
        v0Var.v(aj5Var, 4, CoverImage$$serializer.INSTANCE, animeSchedule.coverImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 5, mz5Var, animeSchedule.color);
        v0Var.v(aj5Var, 6, (mj5) rb3VarArr[6].getValue(), animeSchedule.format);
        v0Var.v(aj5Var, 7, (mj5) rb3VarArr[7].getValue(), animeSchedule.status);
        hu0Var.encodeNullableSerializableElement(aj5Var, 8, i13Var, animeSchedule.totalEpisodes);
        hu0Var.encodeNullableSerializableElement(aj5Var, 9, i13Var, animeSchedule.averageScore);
        hu0Var.encodeNullableSerializableElement(aj5Var, 10, i13Var, animeSchedule.popularity);
        hu0Var.encodeNullableSerializableElement(aj5Var, 11, i13Var, animeSchedule.trending);
        hu0Var.encodeNullableSerializableElement(aj5Var, 12, mz5Var, animeSchedule.season);
        hu0Var.encodeNullableSerializableElement(aj5Var, 13, i13Var, animeSchedule.seasonYear);
        hu0Var.encodeNullableSerializableElement(aj5Var, 14, (mj5) rb3VarArr[14].getValue(), animeSchedule.genres);
        v0Var.p(aj5Var, 15, animeSchedule.adult);
        hu0Var.encodeNullableSerializableElement(aj5Var, 16, i13Var, animeSchedule.episode);
        v0Var.u(aj5Var, 17, animeSchedule.airingAt);
    }

    public final String component1() {
        return this.id;
    }

    public final Integer component10() {
        return this.averageScore;
    }

    public final Integer component11() {
        return this.popularity;
    }

    public final Integer component12() {
        return this.trending;
    }

    public final String component13() {
        return this.season;
    }

    public final Integer component14() {
        return this.seasonYear;
    }

    public final List<String> component15() {
        return this.genres;
    }

    public final boolean component16() {
        return this.adult;
    }

    public final Integer component17() {
        return this.episode;
    }

    public final long component18() {
        return this.airingAt;
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

    public final AnimeSchedule copy(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, String str3, Integer num6, List<String> list, boolean z, Integer num7, long j) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        return new AnimeSchedule(str, i, num, title, coverImage, str2, mediaFormat, mediaStatus, num2, num3, num4, num5, str3, num6, list, z, num7, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimeSchedule)) {
            return false;
        }
        AnimeSchedule animeSchedule = (AnimeSchedule) obj;
        if (a34.i(this.id, animeSchedule.id) && this.anilistId == animeSchedule.anilistId && a34.i(this.malId, animeSchedule.malId) && a34.i(this.title, animeSchedule.title) && a34.i(this.coverImage, animeSchedule.coverImage) && a34.i(this.color, animeSchedule.color) && this.format == animeSchedule.format && this.status == animeSchedule.status && a34.i(this.totalEpisodes, animeSchedule.totalEpisodes) && a34.i(this.averageScore, animeSchedule.averageScore) && a34.i(this.popularity, animeSchedule.popularity) && a34.i(this.trending, animeSchedule.trending) && a34.i(this.season, animeSchedule.season) && a34.i(this.seasonYear, animeSchedule.seasonYear) && a34.i(this.genres, animeSchedule.genres) && this.adult == animeSchedule.adult && a34.i(this.episode, animeSchedule.episode) && this.airingAt == animeSchedule.airingAt) {
            return true;
        }
        return false;
    }

    public final boolean getAdult() {
        return this.adult;
    }

    public final long getAiringAt() {
        return this.airingAt;
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

    public final Integer getEpisode() {
        return this.episode;
    }

    public final String getExactTime() {
        String format = getLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm"));
        format.getClass();
        return format;
    }

    public final MediaFormat getFormat() {
        return this.format;
    }

    public final List<String> getGenres() {
        return this.genres;
    }

    public final String getHourGroup() {
        String format = getLocalDateTime().format(DateTimeFormatter.ofPattern("HH:00"));
        format.getClass();
        return format;
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
        Integer num3 = this.averageScore;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i3 = (i2 + hashCode5) * 31;
        Integer num4 = this.popularity;
        if (num4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num4.hashCode();
        }
        int i4 = (i3 + hashCode6) * 31;
        Integer num5 = this.trending;
        if (num5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num5.hashCode();
        }
        int i5 = (i4 + hashCode7) * 31;
        String str3 = this.season;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int i6 = (i5 + hashCode8) * 31;
        Integer num6 = this.seasonYear;
        if (num6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num6.hashCode();
        }
        int i7 = (i6 + hashCode9) * 31;
        List<String> list = this.genres;
        if (list == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list.hashCode();
        }
        int g = zo5.g((i7 + hashCode10) * 31, 31, this.adult);
        Integer num7 = this.episode;
        if (num7 != null) {
            i = num7.hashCode();
        }
        return Long.hashCode(this.airingAt) + ((g + i) * 31);
    }

    public final boolean isAired() {
        return Instant.ofEpochSecond(this.airingAt).isBefore(Instant.now());
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
        Integer num3 = this.averageScore;
        Integer num4 = this.popularity;
        Integer num5 = this.trending;
        String str3 = this.season;
        Integer num6 = this.seasonYear;
        List<String> list = this.genres;
        boolean z = this.adult;
        Integer num7 = this.episode;
        long j = this.airingAt;
        StringBuilder m = h11.m(i, "AnimeSchedule(id=", str, ", anilistId=", ", malId=");
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
        m.append(", averageScore=");
        m.append(num3);
        m.append(", popularity=");
        m.append(num4);
        m.append(", trending=");
        m.append(num5);
        m.append(", season=");
        m.append(str3);
        m.append(", seasonYear=");
        m.append(num6);
        m.append(", genres=");
        m.append(list);
        m.append(", adult=");
        m.append(z);
        m.append(", episode=");
        m.append(num7);
        m.append(", airingAt=");
        m.append(j);
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
            return AnimeSchedule$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AnimeSchedule(String str, int i, Integer num, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num2, Integer num3, Integer num4, Integer num5, String str3, Integer num6, List<String> list, boolean z, Integer num7, long j) {
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
        this.averageScore = num3;
        this.popularity = num4;
        this.trending = num5;
        this.season = str3;
        this.seasonYear = num6;
        this.genres = list;
        this.adult = z;
        this.episode = num7;
        this.airingAt = j;
    }
}
