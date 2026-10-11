package com.anistation.model;

import defpackage.a34;
import defpackage.aj5;
import defpackage.hu0;
import defpackage.iq4;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.mz5;
import defpackage.q71;
import defpackage.qx1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class CoverImage {
    public static final Companion Companion = new Companion(null);
    private final String extraLarge;
    private final String large;

    public /* synthetic */ CoverImage(int i, String str, String str2, kj5 kj5Var) {
        if (3 != (i & 3)) {
            iq4.throwMissingFieldException(i, 3, CoverImage$$serializer.INSTANCE.getDescriptor());
        }
        this.extraLarge = str;
        this.large = str2;
    }

    public static /* synthetic */ CoverImage copy$default(CoverImage coverImage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coverImage.extraLarge;
        }
        if ((i & 2) != 0) {
            str2 = coverImage.large;
        }
        return coverImage.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$AniStation_core_model(CoverImage coverImage, hu0 hu0Var, aj5 aj5Var) {
        mz5 mz5Var = mz5.a;
        hu0Var.encodeNullableSerializableElement(aj5Var, 0, mz5Var, coverImage.extraLarge);
        hu0Var.encodeNullableSerializableElement(aj5Var, 1, mz5Var, coverImage.large);
    }

    public final String component1() {
        return this.extraLarge;
    }

    public final String component2() {
        return this.large;
    }

    public final CoverImage copy(String str, String str2) {
        return new CoverImage(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverImage)) {
            return false;
        }
        CoverImage coverImage = (CoverImage) obj;
        if (a34.i(this.extraLarge, coverImage.extraLarge) && a34.i(this.large, coverImage.large)) {
            return true;
        }
        return false;
    }

    public final String getExtraLarge() {
        return this.extraLarge;
    }

    public final String getLarge() {
        return this.large;
    }

    public int hashCode() {
        int hashCode;
        String str = this.extraLarge;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.large;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return qx1.n("CoverImage(extraLarge=", this.extraLarge, ", large=", this.large, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final x73 serializer() {
            return CoverImage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CoverImage(String str, String str2) {
        this.extraLarge = str;
        this.large = str2;
    }
}
