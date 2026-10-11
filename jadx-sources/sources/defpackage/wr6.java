package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wr6 {
    public final boolean a;
    public final vr6 b;
    public final int c;
    public final l41[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public wr6(boolean z, vr6 vr6Var) {
        int i;
        this.a = z;
        this.b = vr6Var;
        if (z && vr6Var.equals(vr6.x)) {
            ze0.m("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = vr6Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2;
            } else {
                ze0.l();
                throw null;
            }
        } else {
            i = 3;
        }
        this.c = i;
        this.d = new l41[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [l41, java.lang.Object] */
    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        l41[] l41VarArr = this.d;
        l41 l41Var = l41VarArr[i];
        if (l41Var == 0) {
            ?? obj = new Object();
            obj.a = j;
            obj.b = f;
            l41VarArr[i] = obj;
            return;
        }
        l41Var.a = j;
        l41Var.b = f;
    }

    public final float b() {
        boolean z;
        vr6 vr6Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        int i3 = this.e;
        l41[] l41VarArr = this.d;
        l41 l41Var = l41VarArr[i3];
        if (l41Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        l41 l41Var2 = l41Var;
        do {
            l41 l41Var3 = l41VarArr[i3];
            z = this.a;
            vr6Var = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (l41Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = l41Var.a;
                i = i4;
                f = 0.0f;
                long j2 = l41Var3.a;
                float f5 = (float) (j - j2);
                fArr2 = fArr3;
                i2 = 1;
                float abs = (float) Math.abs(j2 - l41Var2.a);
                if (vr6Var != vr6.x && !z) {
                    l41Var2 = l41Var;
                } else {
                    l41Var2 = l41Var3;
                }
                if (f5 <= 100.0f && abs <= 40.0f) {
                    fArr2[i] = l41Var3.b;
                    fArr[i] = -f5;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 >= this.c) {
            int ordinal = vr6Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == i2) {
                    int i5 = i4 - i2;
                    float f6 = fArr[i5];
                    int i6 = i5;
                    float f7 = f;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f8 = fArr[i7];
                        if (f6 != f8) {
                            if (z) {
                                f4 = -fArr2[i7];
                            } else {
                                f4 = fArr2[i6] - fArr2[i7];
                            }
                            float f9 = f4 / (f6 - f8);
                            float abs2 = (Math.abs(f9) * (f9 - (Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2.0f))))) + f7;
                            if (i6 == i5) {
                                abs2 *= 0.5f;
                            }
                            f7 = abs2;
                        }
                        i6--;
                        f6 = f8;
                    }
                    f3 = Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
                } else {
                    ze0.l();
                    return f;
                }
            } else {
                try {
                    float[] fArr4 = this.h;
                    fz5.k(fArr, fArr2, i4, fArr4);
                    f2 = fArr4[1];
                } catch (IllegalArgumentException unused) {
                    f2 = f;
                }
                f3 = f2;
            }
            return f3 * 1000.0f;
        }
        return f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            ez2.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float b = b();
        if (b == 0.0f || Float.isNaN(b)) {
            return 0.0f;
        }
        if (b > 0.0f) {
            if (b > f) {
                return f;
            }
        } else {
            float f2 = -f;
            if (b < f2) {
                return f2;
            }
        }
        return b;
    }

    public /* synthetic */ wr6() {
        this(false, vr6.x);
    }

    public wr6(boolean z) {
        this(z, vr6.y);
    }
}
