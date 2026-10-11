package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vr implements ur, wr {
    public final float A;
    public final float x;
    public final boolean y;
    public final ze0 z;

    public vr(float f, boolean z, ze0 ze0Var) {
        this.x = f;
        this.y = z;
        this.z = ze0Var;
        this.A = f;
    }

    @Override // defpackage.wr
    public final void H(ud1 ud1Var, int i, int[] iArr, int[] iArr2) {
        j(ud1Var, i, iArr, ia3.x, iArr2);
    }

    @Override // defpackage.ur, defpackage.wr
    public final float a() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vr) {
                vr vrVar = (vr) obj;
                if (!vm1.c(this.x, vrVar.x) || this.y != vrVar.y || !this.z.equals(vrVar.z)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.z.hashCode() + zo5.g(Float.hashCode(this.x) * 31, 31, this.y);
    }

    @Override // defpackage.ur
    public final void j(ud1 ud1Var, int i, int[] iArr, ia3 ia3Var, int[] iArr2) {
        boolean z;
        int i2;
        int round;
        if (iArr.length != 0) {
            int x0 = ud1Var.x0(this.x);
            if (this.y && ia3Var == ia3.y) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int max = Math.max(0, i - iArr[i3]);
                    iArr2[i5] = max;
                    i4 = Math.min(x0, max);
                    i = iArr2[i5] - i4;
                    i3++;
                    i5++;
                }
                i2 = i + i4;
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i6 < length2) {
                    int i10 = iArr[i6];
                    int min = Math.min(i7, i - i10);
                    iArr2[i9] = min;
                    int min2 = Math.min(x0, (i - min) - i10);
                    int i11 = iArr2[i9] + i10 + min2;
                    i6++;
                    i8 = min2;
                    i7 = i11;
                    i9++;
                }
                i2 = i - (i7 - i8);
            }
            if (i2 > 0) {
                byte b = this.z.x;
                ia3 ia3Var2 = ia3.x;
                float f = -1.0f;
                switch (b) {
                    case 4:
                        float f2 = (i2 + 0) / 2.0f;
                        float f3 = 0.0f;
                        if (ia3Var != ia3Var2) {
                            f3 = 0.0f * (-1.0f);
                        }
                        round = Math.round((1.0f + f3) * f2);
                        break;
                    case 5:
                        round = Math.round((1.0f - 1.0f) * ((i2 + 0) / 2.0f));
                        break;
                    default:
                        float f4 = i2 / 2.0f;
                        if (ia3Var != ia3Var2) {
                            f = 1.0f;
                        }
                        round = Math.round((1.0f + f) * f4);
                        break;
                }
                if (z) {
                    round -= i2;
                }
                if (round != 0) {
                    int length3 = iArr2.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        iArr2[i12] = iArr2[i12] + round;
                    }
                }
            }
        }
    }

    public final String toString() {
        String str;
        if (this.y) {
            str = "";
        } else {
            str = "Absolute";
        }
        return str + "Arrangement#spacedAligned(" + vm1.d(this.x) + ", " + this.z + ")";
    }
}
