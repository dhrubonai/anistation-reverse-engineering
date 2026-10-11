package com.anistation.model;

import defpackage.a34;
import defpackage.aj5;
import defpackage.h11;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class Title {
    public static final Companion Companion = new Companion(null);
    private final String english;

    /* renamed from: native, reason: not valid java name */
    private final String f0native;
    private final String romaji;
    private final String userPreferred;

    public /* synthetic */ Title(int i, String str, String str2, String str3, String str4, kj5 kj5Var) {
        if (15 != (i & 15)) {
            iq4.throwMissingFieldException(i, 15, Title$$serializer.INSTANCE.getDescriptor());
        }
        this.romaji = str;
        this.english = str2;
        this.f0native = str3;
        this.userPreferred = str4;
    }

    public static /* synthetic */ Title copy$default(Title title, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = title.romaji;
        }
        if ((i & 2) != 0) {
            str2 = title.english;
        }
        if ((i & 4) != 0) {
            str3 = title.f0native;
        }
        if ((i & 8) != 0) {
            str4 = title.userPreferred;
        }
        return title.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(Title title, hu0 hu0Var, aj5 aj5Var) {
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5Var, title.romaji);
        hu0Var.encodeNullableSerializableElement(aj5Var, 1, mz5Var, title.english);
        hu0Var.encodeNullableSerializableElement(aj5Var, 2, mz5Var, title.f0native);
        hu0Var.encodeNullableSerializableElement(aj5Var, 3, mz5Var, title.userPreferred);
    }

    public final String component1() {
        return this.romaji;
    }

    public final String component2() {
        return this.english;
    }

    public final String component3() {
        return this.f0native;
    }

    public final String component4() {
        return this.userPreferred;
    }

    public final Title copy(String str, String str2, String str3, String str4) {
        return new Title(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Title)) {
            return false;
        }
        Title title = (Title) obj;
        if (a34.i(this.romaji, title.romaji) && a34.i(this.english, title.english) && a34.i(this.f0native, title.f0native) && a34.i(this.userPreferred, title.userPreferred)) {
            return true;
        }
        return false;
    }

    public final String getEnglish() {
        return this.english;
    }

    public final String getNative() {
        return this.f0native;
    }

    public final String getRomaji() {
        return this.romaji;
    }

    public final String getUserPreferred() {
        return this.userPreferred;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.romaji;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.english;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f0native;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.userPreferred;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.romaji;
        String str2 = this.english;
        return h11.l(h11.o("Title(romaji=", str, ", english=", str2, ", native="), this.f0native, ", userPreferred=", this.userPreferred, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return Title$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Title(String str, String str2, String str3, String str4) {
        this.romaji = str;
        this.english = str2;
        this.f0native = str3;
        this.userPreferred = str4;
    }
}
