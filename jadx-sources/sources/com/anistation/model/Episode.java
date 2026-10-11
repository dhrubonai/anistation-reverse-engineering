package com.anistation.model;

import defpackage.a34;
import defpackage.aj5;
import defpackage.h11;
import defpackage.hu0;
import defpackage.i13;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.l70;
import defpackage.mz5;
import defpackage.q71;
import defpackage.qx1;
import defpackage.v0;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Episode {
    public static final Companion Companion = new Companion(null);
    private final String airedAt;
    private final String description;
    private final Boolean filler;
    private final String id;
    private final String image;
    private final Integer length;
    private final int number;
    private final String syncedAt;
    private final String title;

    public /* synthetic */ Episode(int i, String str, int i2, String str2, String str3, Boolean bool, String str4, Integer num, String str5, String str6, kj5 kj5Var) {
        if (511 != (i & 511)) {
            iq4.throwMissingFieldException(i, 511, Episode$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.number = i2;
        this.title = str2;
        this.image = str3;
        this.filler = bool;
        this.description = str4;
        this.length = num;
        this.airedAt = str5;
        this.syncedAt = str6;
    }

    public static /* synthetic */ Episode copy$default(Episode episode, String str, int i, String str2, String str3, Boolean bool, String str4, Integer num, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = episode.id;
        }
        if ((i2 & 2) != 0) {
            i = episode.number;
        }
        if ((i2 & 4) != 0) {
            str2 = episode.title;
        }
        if ((i2 & 8) != 0) {
            str3 = episode.image;
        }
        if ((i2 & 16) != 0) {
            bool = episode.filler;
        }
        if ((i2 & 32) != 0) {
            str4 = episode.description;
        }
        if ((i2 & 64) != 0) {
            num = episode.length;
        }
        if ((i2 & 128) != 0) {
            str5 = episode.airedAt;
        }
        if ((i2 & 256) != 0) {
            str6 = episode.syncedAt;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str10 = str2;
        return episode.copy(str, i, str10, str3, bool2, str9, num2, str7, str8);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Episode episode, hu0 hu0Var, aj5 aj5Var) {
        v0 v0Var = (v0) hu0Var;
        v0Var.w(aj5Var, 0, episode.id);
        v0Var.t(1, episode.number, aj5Var);
        mz5 mz5Var = mz5.a;
        v0Var.encodeNullableSerializableElement(aj5Var, 2, mz5Var, episode.title);
        v0Var.encodeNullableSerializableElement(aj5Var, 3, mz5Var, episode.image);
        v0Var.encodeNullableSerializableElement(aj5Var, 4, l70.a, episode.filler);
        v0Var.encodeNullableSerializableElement(aj5Var, 5, mz5Var, episode.description);
        v0Var.encodeNullableSerializableElement(aj5Var, 6, i13.a, episode.length);
        v0Var.encodeNullableSerializableElement(aj5Var, 7, mz5Var, episode.airedAt);
        v0Var.w(aj5Var, 8, episode.syncedAt);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.number;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.image;
    }

    public final Boolean component5() {
        return this.filler;
    }

    public final String component6() {
        return this.description;
    }

    public final Integer component7() {
        return this.length;
    }

    public final String component8() {
        return this.airedAt;
    }

    public final String component9() {
        return this.syncedAt;
    }

    public final Episode copy(String str, int i, String str2, String str3, Boolean bool, String str4, Integer num, String str5, String str6) {
        str.getClass();
        str6.getClass();
        return new Episode(str, i, str2, str3, bool, str4, num, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        if (a34.i(this.id, episode.id) && this.number == episode.number && a34.i(this.title, episode.title) && a34.i(this.image, episode.image) && a34.i(this.filler, episode.filler) && a34.i(this.description, episode.description) && a34.i(this.length, episode.length) && a34.i(this.airedAt, episode.airedAt) && a34.i(this.syncedAt, episode.syncedAt)) {
            return true;
        }
        return false;
    }

    public final String getAiredAt() {
        return this.airedAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getFiller() {
        return this.filler;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final int getNumber() {
        return this.number;
    }

    public final String getSyncedAt() {
        return this.syncedAt;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int c = qx1.c(this.number, this.id.hashCode() * 31, 31);
        String str = this.title;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        String str2 = this.image;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.filler;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.description;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.length;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str4 = this.airedAt;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return this.syncedAt.hashCode() + ((i6 + i) * 31);
    }

    public String toString() {
        String str = this.id;
        int i = this.number;
        String str2 = this.title;
        String str3 = this.image;
        Boolean bool = this.filler;
        String str4 = this.description;
        Integer num = this.length;
        String str5 = this.airedAt;
        String str6 = this.syncedAt;
        StringBuilder m = h11.m(i, "Episode(id=", str, ", number=", ", title=");
        qx1.x(m, str2, ", image=", str3, ", filler=");
        m.append(bool);
        m.append(", description=");
        m.append(str4);
        m.append(", length=");
        m.append(num);
        m.append(", airedAt=");
        m.append(str5);
        m.append(", syncedAt=");
        return h11.k(m, str6, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Episode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Episode(String str, int i, String str2, String str3, Boolean bool, String str4, Integer num, String str5, String str6) {
        str.getClass();
        str6.getClass();
        this.id = str;
        this.number = i;
        this.title = str2;
        this.image = str3;
        this.filler = bool;
        this.description = str4;
        this.length = num;
        this.airedAt = str5;
        this.syncedAt = str6;
    }
}
