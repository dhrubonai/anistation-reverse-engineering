package defpackage;

import android.graphics.Matrix;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class za5 implements ko3 {
    public final float a;
    public final Matrix b;
    public Matrix c;

    public za5(float f) {
        this.a = f;
        Matrix matrix = new Matrix();
        this.b = matrix;
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate(f);
    }

    @Override // defpackage.ko3
    public final Matrix b() {
        Matrix matrix = this.c;
        io3.w(matrix, "configure must be called first");
        return matrix;
    }

    @Override // defpackage.ne2
    public final boolean d(int i, int i2) {
        sq5 e = e(i, i2);
        Matrix matrix = this.c;
        matrix.getClass();
        if (matrix.isIdentity() && i == e.a && i2 == e.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ko3
    public final sq5 e(int i, int i2) {
        boolean z;
        boolean z2;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("inputWidth must be positive", z);
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.m("inputHeight must be positive", z2);
        Matrix matrix = this.b;
        this.c = new Matrix(matrix);
        if (matrix.isIdentity()) {
            return new sq5(i, i2);
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        this.c.preScale(f3, 1.0f);
        this.c.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}};
        float f4 = Float.MIN_VALUE;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.c.mapPoints(fArr2);
            f5 = Math.min(f5, fArr2[0]);
            f4 = Math.max(f4, fArr2[0]);
            f6 = Math.min(f6, fArr2[1]);
            f7 = Math.max(f7, fArr2[1]);
        }
        float f8 = (f4 - f5) / 2.0f;
        float f9 = (f7 - f6) / 2.0f;
        this.c.postScale(1.0f / f8, 1.0f / f9);
        return new sq5(Math.round(f * f8), Math.round(f2 * f9));
    }
}
