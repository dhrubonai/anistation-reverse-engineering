package com.anistation.model;

import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
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

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class AnimeWatchOrderItem {
    private final int anilistId;
    private final CoverImage coverImage;
    private final Integer duration;
    private final MediaFormat format;
    private final String id;
    private final int malId;
    private final String startDate;
    private final Title title;
    private final Integer totalEpisodes;
    public static final Companion Companion = new Companion(null);
    private static final rb3[] $childSerializers = {null, null, null, null, null, null, bx7.B(jf3.y, new t((byte) 25)), null, null};

    public /* synthetic */ AnimeWatchOrderItem(int i, String str, int i2, int i3, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, Integer num, Integer num2, kj5 kj5Var) {
        if (510 != (i & 510)) {
            iq4.throwMissingFieldException(i, 510, AnimeWatchOrderItem$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.anilistId = i2;
        this.malId = i3;
        this.title = title;
        this.coverImage = coverImage;
        this.startDate = str2;
        this.format = mediaFormat;
        this.totalEpisodes = num;
        this.duration = num2;
    }

    public static final x73 _childSerializers$_anonymous_() {
        MediaFormat[] values = MediaFormat.values();
        values.getClass();
        return new uv1("com.anistation.model.MediaFormat", values);
    }

    public static /* synthetic */ AnimeWatchOrderItem copy$default(AnimeWatchOrderItem animeWatchOrderItem, String str, int i, int i2, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, Integer num, Integer num2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = animeWatchOrderItem.id;
        }
        if ((i3 & 2) != 0) {
            i = animeWatchOrderItem.anilistId;
        }
        if ((i3 & 4) != 0) {
            i2 = animeWatchOrderItem.malId;
        }
        if ((i3 & 8) != 0) {
            title = animeWatchOrderItem.title;
        }
        if ((i3 & 16) != 0) {
            coverImage = animeWatchOrderItem.coverImage;
        }
        if ((i3 & 32) != 0) {
            str2 = animeWatchOrderItem.startDate;
        }
        if ((i3 & 64) != 0) {
            mediaFormat = animeWatchOrderItem.format;
        }
        if ((i3 & 128) != 0) {
            num = animeWatchOrderItem.totalEpisodes;
        }
        if ((i3 & 256) != 0) {
            num2 = animeWatchOrderItem.duration;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str3 = str2;
        MediaFormat mediaFormat2 = mediaFormat;
        CoverImage coverImage2 = coverImage;
        int i4 = i2;
        return animeWatchOrderItem.copy(str, i, i4, title, coverImage2, str3, mediaFormat2, num3, num4);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(AnimeWatchOrderItem animeWatchOrderItem, hu0 hu0Var, aj5 aj5Var) {
        rb3[] rb3VarArr = $childSerializers;
        if (hu0Var.shouldEncodeElementDefault(aj5Var, 0) || animeWatchOrderItem.id != null) {
            hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5.a, animeWatchOrderItem.id);
        }
        v0 v0Var = (v0) hu0Var;
        v0Var.t(1, animeWatchOrderItem.anilistId, aj5Var);
        v0Var.t(2, animeWatchOrderItem.malId, aj5Var);
        v0Var.v(aj5Var, 3, Title$$serializer.INSTANCE, animeWatchOrderItem.title);
        v0Var.v(aj5Var, 4, CoverImage$$serializer.INSTANCE, animeWatchOrderItem.coverImage);
        hu0Var.encodeNullableSerializableElement(aj5Var, 5, mz5.a, animeWatchOrderItem.startDate);
        v0Var.v(aj5Var, 6, (mj5) rb3VarArr[6].getValue(), animeWatchOrderItem.format);
        i13 i13Var = i13.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 7, i13Var, animeWatchOrderItem.totalEpisodes);
        hu0Var.encodeNullableSerializableElement(aj5Var, 8, i13Var, animeWatchOrderItem.duration);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.anilistId;
    }

    public final int component3() {
        return this.malId;
    }

    public final Title component4() {
        return this.title;
    }

    public final CoverImage component5() {
        return this.coverImage;
    }

    public final String component6() {
        return this.startDate;
    }

    public final MediaFormat component7() {
        return this.format;
    }

    public final Integer component8() {
        return this.totalEpisodes;
    }

    public final Integer component9() {
        return this.duration;
    }

    public final AnimeWatchOrderItem copy(String str, int i, int i2, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, Integer num, Integer num2) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        return new AnimeWatchOrderItem(str, i, i2, title, coverImage, str2, mediaFormat, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimeWatchOrderItem)) {
            return false;
        }
        AnimeWatchOrderItem animeWatchOrderItem = (AnimeWatchOrderItem) obj;
        if (a34.i(this.id, animeWatchOrderItem.id) && this.anilistId == animeWatchOrderItem.anilistId && this.malId == animeWatchOrderItem.malId && a34.i(this.title, animeWatchOrderItem.title) && a34.i(this.coverImage, animeWatchOrderItem.coverImage) && a34.i(this.startDate, animeWatchOrderItem.startDate) && this.format == animeWatchOrderItem.format && a34.i(this.totalEpisodes, animeWatchOrderItem.totalEpisodes) && a34.i(this.duration, animeWatchOrderItem.duration)) {
            return true;
        }
        return false;
    }

    public final int getAnilistId() {
        return this.anilistId;
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

    public final String getId() {
        return this.id;
    }

    public final int getMalId() {
        return this.malId;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final Title getTitle() {
        return this.title;
    }

    public final Integer getTotalEpisodes() {
        return this.totalEpisodes;
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
        int hashCode4 = (this.coverImage.hashCode() + ((this.title.hashCode() + qx1.c(this.malId, qx1.c(this.anilistId, hashCode * 31, 31), 31)) * 31)) * 31;
        String str2 = this.startDate;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode5 = (this.format.hashCode() + ((hashCode4 + hashCode2) * 31)) * 31;
        Integer num = this.totalEpisodes;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i2 = (hashCode5 + hashCode3) * 31;
        Integer num2 = this.duration;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.id;
        int i = this.anilistId;
        int i2 = this.malId;
        Title title = this.title;
        CoverImage coverImage = this.coverImage;
        String str2 = this.startDate;
        MediaFormat mediaFormat = this.format;
        Integer num = this.totalEpisodes;
        Integer num2 = this.duration;
        StringBuilder m = h11.m(i, "AnimeWatchOrderItem(id=", str, ", anilistId=", ", malId=");
        m.append(i2);
        m.append(", title=");
        m.append(title);
        m.append(", coverImage=");
        m.append(coverImage);
        m.append(", startDate=");
        m.append(str2);
        m.append(", format=");
        m.append(mediaFormat);
        m.append(", totalEpisodes=");
        m.append(num);
        m.append(", duration=");
        m.append(num2);
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
            return AnimeWatchOrderItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AnimeWatchOrderItem(String str, int i, int i2, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, Integer num, Integer num2) {
        title.getClass();
        coverImage.getClass();
        mediaFormat.getClass();
        this.id = str;
        this.anilistId = i;
        this.malId = i2;
        this.title = title;
        this.coverImage = coverImage;
        this.startDate = str2;
        this.format = mediaFormat;
        this.totalEpisodes = num;
        this.duration = num2;
    }

    public /* synthetic */ AnimeWatchOrderItem(String str, int i, int i2, Title title, CoverImage coverImage, String str2, MediaFormat mediaFormat, Integer num, Integer num2, int i3, q71 q71Var) {
        this((i3 & 1) != 0 ? null : str, i, i2, title, coverImage, str2, mediaFormat, num, num2);
    }
}
