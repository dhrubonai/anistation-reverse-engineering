package com.anistation.model;

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
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Recommendation {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final boolean adult;
    private final int anilistId;
    private final String color;
    private final CoverImage coverImage;
    private final MediaFormat format;
    private final List<String> genres;
    private final String id;
    private final Integer seasonYear;
    private final MediaStatus status;
    private final Title title;

    static {
        qa4 qa4Var = new qa4((byte) 20);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{null, null, null, null, null, bx7.B(jf3Var, qa4Var), bx7.B(jf3Var, new qa4((byte) 21)), null, bx7.B(jf3Var, new qa4((byte) 22)), null};
    }

    public /* synthetic */ Recommendation(int i, String str, int i2, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List list, boolean z, kj5 kj5Var) {
        if (638 != (i & 638)) {
            iq4.throwMissingFieldException(i, 638, Recommendation$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.anilistId = i2;
        this.title = title;
        this.coverImage = coverImage;
        this.color = str2;
        this.format = mediaFormat;
        this.status = mediaStatus;
        if ((i & 128) == 0) {
            this.seasonYear = null;
        } else {
            this.seasonYear = num;
        }
        if ((i & 256) == 0) {
            this.genres = null;
        } else {
            this.genres = list;
        }
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

    public static /* synthetic */ Recommendation copy$default(Recommendation recommendation, String str, int i, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recommendation.id;
        }
        if ((i2 & 2) != 0) {
            i = recommendation.anilistId;
        }
        if ((i2 & 4) != 0) {
            title = recommendation.title;
        }
        if ((i2 & 8) != 0) {
            coverImage = recommendation.coverImage;
        }
        if ((i2 & 16) != 0) {
            str2 = recommendation.color;
        }
        if ((i2 & 32) != 0) {
            mediaFormat = recommendation.format;
        }
        if ((i2 & 64) != 0) {
            mediaStatus = recommendation.status;
        }
        if ((i2 & 128) != 0) {
            num = recommendation.seasonYear;
        }
        if ((i2 & 256) != 0) {
            list = recommendation.genres;
        }
        if ((i2 & 512) != 0) {
            z = recommendation.adult;
        }
        List list2 = list;
        boolean z2 = z;
        MediaStatus mediaStatus2 = mediaStatus;
        Integer num2 = num;
        String str3 = str2;
        MediaFormat mediaFormat2 = mediaFormat;
        return recommendation.copy(str, i, title, coverImage, str3, mediaFormat2, mediaStatus2, num2, list2, z2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Recommendation recommendation, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || recommendation.id != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5.a, recommendation.id);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.t(1, recommendation.anilistId, aj5Var);
        v0Var.v(aj5Var, 2, Title$$serializer.INSTANCE, recommendation.title);
        v0Var.v(aj5Var, 3, CoverImage$$serializer.INSTANCE, recommendation.coverImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 4, mz5.a, recommendation.color);
        v0Var.v(aj5Var, 5, (mj5) rb3VarArr[5].getValue(), recommendation.format);
        v0Var.v(aj5Var, 6, (mj5) rb3VarArr[6].getValue(), recommendation.status);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 7) || recommendation.seasonYear != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 7, i13.a, recommendation.seasonYear);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 8) || recommendation.genres != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 8, (mj5) rb3VarArr[8].getValue(), recommendation.genres);
        }
        v0Var.p(aj5Var, 9, recommendation.adult);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.adult;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final Title component3() {
        return this.title;
    }

    public final CoverImage component4() {
        return this.coverImage;
    }

    public final String component5() {
        return this.color;
    }

    public final MediaFormat component6() {
        return this.format;
    }

    public final MediaStatus component7() {
        return this.status;
    }

    public final Integer component8() {
        return this.seasonYear;
    }

    public final List<String> component9() {
        return this.genres;
    }

    public final Recommendation copy(String str, int i, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List<String> list, boolean z) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        return new Recommendation(str, i, title, coverImage, str2, mediaFormat, mediaStatus, num, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recommendation)) {
            return false;
        }
        Recommendation recommendation = (Recommendation) obj;
        if (a34.i(this.id, recommendation.id) && this.anilistId == recommendation.anilistId && a34.i(this.title, recommendation.title) && a34.i(this.coverImage, recommendation.coverImage) && a34.i(this.color, recommendation.color) && this.format == recommendation.format && this.status == recommendation.status && a34.i(this.seasonYear, recommendation.seasonYear) && a34.i(this.genres, recommendation.genres) && this.adult == recommendation.adult) {
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

    public final String getColor() {
        return this.color;
    }

    public final CoverImage getCoverImage() {
        return this.coverImage;
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

    public final Integer getSeasonYear() {
        return this.seasonYear;
    }

    public final MediaStatus getStatus() {
        return this.status;
    }

    public final Title getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (this.coverImage.hashCode() + ((this.title.hashCode() + qx1.c(this.anilistId, hashCode * 31, 31)) * 31)) * 31;
        String str2 = this.color;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode5 = (this.status.hashCode() + ((this.format.hashCode() + ((hashCode4 + hashCode2) * 31)) * 31)) * 31;
        Integer num = this.seasonYear;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i2 = (hashCode5 + hashCode3) * 31;
        List<String> list = this.genres;
        if (list != null) {
            i = list.hashCode();
        }
        return Boolean.hashCode(this.adult) + ((i2 + i) * 31);
    }

    public String toString() {
        String str = this.id;
        int i = this.anilistId;
        Title title = this.title;
        CoverImage coverImage = this.coverImage;
        String str2 = this.color;
        MediaFormat mediaFormat = this.format;
        MediaStatus mediaStatus = this.status;
        Integer num = this.seasonYear;
        List<String> list = this.genres;
        boolean z = this.adult;
        StringBuilder m = h11.m(i, "Recommendation(id=", str, ", anilistId=", ", title=");
        m.append(title);
        m.append(", coverImage=");
        m.append(coverImage);
        m.append(", color=");
        m.append(str2);
        m.append(", format=");
        m.append(mediaFormat);
        m.append(", status=");
        m.append(mediaStatus);
        m.append(", seasonYear=");
        m.append(num);
        m.append(", genres=");
        m.append(list);
        m.append(", adult=");
        m.append(z);
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
            return Recommendation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Recommendation(String str, int i, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List<String> list, boolean z) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        this.id = str;
        this.anilistId = i;
        this.title = title;
        this.coverImage = coverImage;
        this.color = str2;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.seasonYear = num;
        this.genres = list;
        this.adult = z;
    }

    public /* synthetic */ Recommendation(String str, int i, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List list, boolean z, int i2, q71 q71Var) {
        this((i2 & 1) != 0 ? null : str, i, title, coverImage, str2, mediaFormat, mediaStatus, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : list, z);
    }
}
