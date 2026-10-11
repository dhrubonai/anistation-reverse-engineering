package defpackage;

import android.graphics.Matrix;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class it4 implements ko3 {
    public final int a;
    public final int b;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public Matrix f = new Matrix();

    public it4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static it4 f(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.k(i, "width %s must be positive", z);
        if (i2 > 0) {
            z2 = true;
        }
        io3.k(i2, "height %s must be positive", z2);
        return new it4(i, i2);
    }

    @Override // defpackage.ko3
    public final Matrix b() {
        return this.f;
    }

    @Override // defpackage.ko3
    public final int c() {
        return 9729;
    }

    @Override // defpackage.ne2
    public final boolean d(int i, int i2) {
        e(i, i2);
        if (this.f.isIdentity() && i == Math.round(this.d) && i2 == Math.round(this.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ko3
    public final sq5 e(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("inputWidth must be positive", z);
        if (i2 > 0) {
            z2 = true;
        }
        io3.m("inputHeight must be positive", z2);
        Matrix matrix = new Matrix();
        this.f = matrix;
        float f = i;
        this.d = f;
        float f2 = i2;
        this.e = f2;
        int i3 = this.a;
        int i4 = this.b;
        if (i3 != -1 && i4 != -1) {
            this.c = i3 / i4;
        }
        float f3 = this.c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            if (f3 > f4) {
                matrix.setScale(f4 / f3, 1.0f);
                float f5 = this.e;
                float f6 = this.c * f5;
                this.d = f6;
                f2 = f5;
                f = f6;
            } else {
                matrix.setScale(1.0f, f3 / f4);
                f = this.d;
                f2 = f / this.c;
                this.e = f2;
            }
        }
        if (i4 != -1) {
            if (i3 != -1) {
                this.d = i3;
                this.e = i4;
            } else {
                float f7 = i4;
                float f8 = (f * f7) / f2;
                this.d = f8;
                this.d = (float) Math.round(f8 / 1.0d);
                this.e = f7;
            }
        }
        return new sq5(Math.round(this.d), Math.round(this.e));
    }
}
