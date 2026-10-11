package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ak0 {
    public final int a;
    public final int b;
    public final float[] c;
    public final boolean d;
    public final boolean e;

    public ak0(int i, int i2, float[] fArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("Input channel count must be positive.", z);
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.m("Output channel count must be positive.", z2);
        if (fArr.length == i * i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        io3.m("Coefficient array length is invalid.", z3);
        this.a = i;
        this.b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                ze0.k(qx1.i(i3, "Coefficient at index ", " is negative."));
                throw null;
            }
        }
        this.c = fArr;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                float f = this.c[(this.b * i4) + i5];
                if (i4 == i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (f != 1.0f && z4) {
                    z8 = false;
                }
                if (f != 0.0f) {
                    z6 = false;
                    if (!z4) {
                        z7 = false;
                    }
                }
            }
        }
        this.d = z6;
        if (this.a == this.b && z7 && z8) {
            z5 = true;
        }
        this.e = z5;
    }

    public static ak0 a(int i, int i2) {
        float[] fArr;
        if (i == i2) {
            fArr = new float[i2 * i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[(i2 * i3) + i3] = 1.0f;
            }
        } else if (i == 1 && i2 == 2) {
            fArr = new float[]{1.0f, 1.0f};
        } else if (i == 2 && i2 == 1) {
            fArr = new float[]{0.5f, 0.5f};
        } else {
            ov3.g(qx1.l("Default channel mixing coefficients for ", i, "->", i2, " are not yet implemented."));
            return null;
        }
        return new ak0(i, i2, fArr);
    }
}
