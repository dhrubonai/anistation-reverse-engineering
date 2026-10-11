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
public final class Relation {
    private static final rb3[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final boolean adult;
    private final int anilistId;
    private final String color;
    private final CoverImage coverImage;
    private final MediaFormat format;
    private final List<String> genres;
    private final String id;
    private final String relationType;
    private final Integer seasonYear;
    private final MediaStatus status;
    private final Title title;

    static {
        qa4 qa4Var = new qa4((byte) 23);
        jf3 jf3Var = jf3.y;
        $childSerializers = new rb3[]{null, null, null, null, null, null, bx7.B(jf3Var, qa4Var), bx7.B(jf3Var, new qa4((byte) 24)), null, bx7.B(jf3Var, new qa4((byte) 25)), null};
    }

    public /* synthetic */ Relation(int i, String str, int i2, Title title, String str2, CoverImage coverImage, String str3, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List list, boolean z, kj5 kj5Var) {
        if (1278 != (i & 1278)) {
            iq4.throwMissingFieldException(i, 1278, Relation$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.anilistId = i2;
        this.title = title;
        this.relationType = str2;
        this.coverImage = coverImage;
        this.color = str3;
        this.format = mediaFormat;
        this.status = mediaStatus;
        if ((i & 256) == 0) {
            this.seasonYear = null;
        } else {
            this.seasonYear = num;
        }
        if ((i & 512) == 0) {
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

    public static /* synthetic */ Relation copy$default(Relation relation, String str, int i, Title title, String str2, CoverImage coverImage, String str3, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = relation.id;
        }
        if ((i2 & 2) != 0) {
            i = relation.anilistId;
        }
        if ((i2 & 4) != 0) {
            title = relation.title;
        }
        if ((i2 & 8) != 0) {
            str2 = relation.relationType;
        }
        if ((i2 & 16) != 0) {
            coverImage = relation.coverImage;
        }
        if ((i2 & 32) != 0) {
            str3 = relation.color;
        }
        if ((i2 & 64) != 0) {
            mediaFormat = relation.format;
        }
        if ((i2 & 128) != 0) {
            mediaStatus = relation.status;
        }
        if ((i2 & 256) != 0) {
            num = relation.seasonYear;
        }
        if ((i2 & 512) != 0) {
            list = relation.genres;
        }
        if ((i2 & 1024) != 0) {
            z = relation.adult;
        }
        List list2 = list;
        boolean z2 = z;
        MediaStatus mediaStatus2 = mediaStatus;
        Integer num2 = num;
        String str4 = str3;
        MediaFormat mediaFormat2 = mediaFormat;
        CoverImage coverImage2 = coverImage;
        Title title2 = title;
        return relation.copy(str, i, title2, str2, coverImage2, str4, mediaFormat2, mediaStatus2, num2, list2, z2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Relation relation, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || relation.id != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5.a, relation.id);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.t(1, relation.anilistId, aj5Var);
        v0Var.v(aj5Var, 2, Title$$serializer.INSTANCE, relation.title);
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 3, mz5Var, relation.relationType);
        v0Var.v(aj5Var, 4, CoverImage$$serializer.INSTANCE, relation.coverImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 5, mz5Var, relation.color);
        v0Var.v(aj5Var, 6, (mj5) rb3VarArr[6].getValue(), relation.format);
        v0Var.v(aj5Var, 7, (mj5) rb3VarArr[7].getValue(), relation.status);
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 8) || relation.seasonYear != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 8, i13.a, relation.seasonYear);
        }
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 9) || relation.genres != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 9, (mj5) rb3VarArr[9].getValue(), relation.genres);
        }
        v0Var.p(aj5Var, 10, relation.adult);
    }

    public final String component1() {
        return this.id;
    }

    public final List<String> component10() {
        return this.genres;
    }

    public final boolean component11() {
        return this.adult;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final Title component3() {
        return this.title;
    }

    public final String component4() {
        return this.relationType;
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
        return this.seasonYear;
    }

    public final Relation copy(String str, int i, Title title, String str2, CoverImage coverImage, String str3, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List<String> list, boolean z) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        return new Relation(str, i, title, str2, coverImage, str3, mediaFormat, mediaStatus, num, list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Relation)) {
            return false;
        }
        Relation relation = (Relation) obj;
        if (a34.i(this.id, relation.id) && this.anilistId == relation.anilistId && a34.i(this.title, relation.title) && a34.i(this.relationType, relation.relationType) && a34.i(this.coverImage, relation.coverImage) && a34.i(this.color, relation.color) && this.format == relation.format && this.status == relation.status && a34.i(this.seasonYear, relation.seasonYear) && a34.i(this.genres, relation.genres) && this.adult == relation.adult) {
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

    public final String getRelationType() {
        return this.relationType;
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
        int hashCode4;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (this.title.hashCode() + qx1.c(this.anilistId, hashCode * 31, 31)) * 31;
        String str2 = this.relationType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (this.coverImage.hashCode() + ((hashCode5 + hashCode2) * 31)) * 31;
        String str3 = this.color;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (this.status.hashCode() + ((this.format.hashCode() + ((hashCode6 + hashCode3) * 31)) * 31)) * 31;
        Integer num = this.seasonYear;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i2 = (hashCode7 + hashCode4) * 31;
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
        String str2 = this.relationType;
        CoverImage coverImage = this.coverImage;
        String str3 = this.color;
        MediaFormat mediaFormat = this.format;
        MediaStatus mediaStatus = this.status;
        Integer num = this.seasonYear;
        List<String> list = this.genres;
        boolean z = this.adult;
        StringBuilder m = h11.m(i, "Relation(id=", str, ", anilistId=", ", title=");
        m.append(title);
        m.append(", relationType=");
        m.append(str2);
        m.append(", coverImage=");
        m.append(coverImage);
        m.append(", color=");
        m.append(str3);
        m.append(", format=");
        m.append(mediaFormat);
        m.append(", status=");
        m.append(mediaStatus);
        m.append(", seasonYear=");
        m.append(num);
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
            return Relation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Relation(String str, int i, Title title, String str2, CoverImage coverImage, String str3, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List<String> list, boolean z) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        mediaStatus.getClass();
        this.id = str;
        this.anilistId = i;
        this.title = title;
        this.relationType = str2;
        this.coverImage = coverImage;
        this.color = str3;
        this.format = mediaFormat;
        this.status = mediaStatus;
        this.seasonYear = num;
        this.genres = list;
        this.adult = z;
    }

    public /* synthetic */ Relation(String str, int i, Title title, String str2, CoverImage coverImage, String str3, MediaFormat mediaFormat, MediaStatus mediaStatus, Integer num, List list, boolean z, int i2, q71 q71Var) {
        this((i2 & 1) != 0 ? null : str, i, title, str2, coverImage, str3, mediaFormat, mediaStatus, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : list, z);
    }
}
