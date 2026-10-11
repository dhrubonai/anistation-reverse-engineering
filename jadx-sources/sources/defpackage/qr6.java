package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qr6 implements mr6 {
    public final ar1 A;
    public int[] B = lr6.a;
    public float[] C;
    public rl D;
    public rl E;
    public rl F;
    public rl G;
    public float[] H;
    public float[] I;
    public af2 J;
    public final r34 x;
    public final s34 y;
    public final short z;

    /* JADX WARN: Multi-variable type inference failed */
    public qr6(r34 r34Var, s34 s34Var, int i, ar1 ar1Var) {
        this.x = r34Var;
        this.y = s34Var;
        this.z = i;
        this.A = ar1Var;
        float[] fArr = lr6.b;
        this.C = fArr;
        this.H = fArr;
        this.I = fArr;
        this.J = lr6.c;
    }

    public final int a(int i) {
        int i2;
        r34 r34Var = this.x;
        int i3 = r34Var.b;
        int i4 = 0;
        if (i3 > 0) {
            int i5 = i3 - 1;
            while (true) {
                if (i4 <= i5) {
                    i2 = (i4 + i5) >>> 1;
                    int i6 = r34Var.a[i2];
                    if (i6 < i) {
                        i4 = i2 + 1;
                    } else {
                        if (i6 <= i) {
                            break;
                        }
                        i5 = i2 - 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 < -1) {
                return -(i2 + 2);
            }
            return i2;
        }
        ze0.g("");
        return 0;
    }

    public final float c(int i, int i2, boolean z) {
        ar1 ar1Var;
        float f;
        r34 r34Var = this.x;
        if (i >= r34Var.b - 1) {
            f = i2;
        } else {
            int c = r34Var.c(i);
            int c2 = r34Var.c(i + 1);
            if (i2 == c) {
                f = c;
            } else {
                int i3 = c2 - c;
                pr6 pr6Var = (pr6) this.y.b(c);
                if (pr6Var == null || (ar1Var = pr6Var.b) == null) {
                    ar1Var = this.A;
                }
                float f2 = i3;
                float a = ar1Var.a((i2 - c) / f2);
                if (z) {
                    return a;
                }
                return ((f2 * a) + c) / 1000.0f;
            }
        }
        return f / 1000.0f;
    }

    public final void d(rl rlVar, rl rlVar2, rl rlVar3) {
        boolean z;
        float[] fArr;
        if (this.J != lr6.c) {
            z = true;
        } else {
            z = false;
        }
        rl rlVar4 = this.D;
        s34 s34Var = this.y;
        r34 r34Var = this.x;
        if (rlVar4 == null) {
            this.D = rlVar.c();
            this.E = rlVar3.c();
            int i = r34Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = r34Var.c(i2) / 1000.0f;
            }
            this.C = fArr2;
            int i3 = r34Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.B = iArr;
        }
        if (z) {
            if (this.J != lr6.c && a34.i(this.F, rlVar) && a34.i(this.G, rlVar2)) {
                return;
            }
            this.F = rlVar;
            this.G = rlVar2;
            int b = rlVar.b() + (rlVar.b() % 2);
            this.H = new float[b];
            this.I = new float[b];
            int i5 = r34Var.b;
            float[][] fArr3 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = r34Var.c(i6);
                pr6 pr6Var = (pr6) s34Var.b(c);
                if (c == 0 && pr6Var == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = rlVar.a(i7);
                    }
                } else if (c == this.z && pr6Var == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = rlVar2.a(i8);
                    }
                } else {
                    pr6Var.getClass();
                    rl rlVar5 = pr6Var.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = rlVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.J = new af2(this.B, this.C, fArr3);
        }
    }

    @Override // defpackage.kr6
    public final rl o(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        long j2;
        long j3 = j / 1000000;
        int[] iArr = lr6.a;
        long j4 = this.z;
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 < 0) {
            return rlVar3;
        }
        d(rlVar, rlVar2, rlVar3);
        rl rlVar4 = this.E;
        rlVar4.getClass();
        int i = 0;
        if (this.J != lr6.c) {
            int i2 = (int) j2;
            float c = c(a(i2), i2, false);
            float[] fArr = this.I;
            pr[][] prVarArr = (pr[][]) this.J.y;
            float f = prVarArr[0][0].a;
            float f2 = prVarArr[prVarArr.length - 1][0].b;
            if (c < f) {
                c = f;
            }
            if (c <= f2) {
                f2 = c;
            }
            int length = fArr.length;
            boolean z = false;
            for (pr[] prVarArr2 : prVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    pr prVar = prVarArr2[i4];
                    if (f2 <= prVar.b) {
                        if (prVar.p) {
                            fArr[i3] = prVar.q;
                            fArr[i3 + 1] = prVar.r;
                        } else {
                            prVar.c(f2);
                            fArr[i3] = prVar.a();
                            fArr[i3 + 1] = prVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                rlVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            rl y = y((j2 - 1) * 1000000, rlVar, rlVar2, rlVar3);
            rl y2 = y(j2 * 1000000, rlVar, rlVar2, rlVar3);
            int b = y.b();
            while (i < b) {
                rlVar4.e(i, (y.a(i) - y2.a(i)) * 1000.0f);
                i++;
            }
        }
        return rlVar4;
    }

    @Override // defpackage.mr6
    public final int v() {
        return 0;
    }

    @Override // defpackage.mr6
    public final int x() {
        return this.z;
    }

    @Override // defpackage.kr6
    public final rl y(long j, rl rlVar, rl rlVar2, rl rlVar3) {
        rl rlVar4;
        rl rlVar5;
        pr[][] prVarArr;
        rl rlVar6 = rlVar;
        long j2 = j / 1000000;
        int[] iArr = lr6.a;
        short s = this.z;
        long j3 = s;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i = (int) j3;
        s34 s34Var = this.y;
        pr6 pr6Var = (pr6) s34Var.b(i);
        if (pr6Var != null) {
            return pr6Var.a;
        }
        if (i >= s) {
            return rlVar2;
        }
        if (i <= 0) {
            return rlVar6;
        }
        d(rlVar6, rlVar2, rlVar3);
        rl rlVar7 = this.D;
        rlVar7.getClass();
        int i2 = 0;
        if (this.J != lr6.c) {
            float c = c(a(i), i, false);
            float[] fArr = this.H;
            pr[][] prVarArr2 = (pr[][]) this.J.y;
            int length = prVarArr2.length - 1;
            float f = prVarArr2[0][0].a;
            float f2 = prVarArr2[length][0].b;
            int length2 = fArr.length;
            if (c >= f && c <= f2) {
                int length3 = prVarArr2.length;
                int i3 = 0;
                boolean z = false;
                while (i3 < length3) {
                    int i4 = i2;
                    int i5 = i4;
                    while (i4 < length2 - 1) {
                        pr prVar = prVarArr2[i3][i5];
                        if (c <= prVar.b) {
                            if (prVar.p) {
                                float f3 = prVar.a;
                                float f4 = prVar.k;
                                float f5 = prVar.c;
                                fArr[i4] = ((prVar.e - f5) * (c - f3) * f4) + f5;
                                float f6 = prVar.d;
                                fArr[i4 + 1] = ((prVar.f - f6) * (c - f3) * f4) + f6;
                            } else {
                                prVar.c(c);
                                fArr[i4] = (prVar.n * prVar.h) + prVar.q;
                                fArr[i4 + 1] = (prVar.o * prVar.i) + prVar.r;
                            }
                            z = true;
                        }
                        i4 += 2;
                        i5++;
                    }
                    if (z) {
                        break;
                    }
                    i3++;
                    i2 = 0;
                }
            } else {
                if (c > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f7 = c - f;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2 - 1) {
                    pr prVar2 = prVarArr2[length][i7];
                    boolean z2 = prVar2.p;
                    float f8 = prVar2.r;
                    float f9 = prVar2.q;
                    if (z2) {
                        float f10 = prVar2.a;
                        float f11 = prVar2.k;
                        float f12 = prVar2.c;
                        prVarArr = prVarArr2;
                        fArr[i6] = (f9 * f7) + ((prVar2.e - f12) * (f - f10) * f11) + f12;
                        float f13 = (f - f10) * f11;
                        float f14 = prVar2.d;
                        fArr[i6 + 1] = (f8 * f7) + ((prVar2.f - f14) * f13) + f14;
                    } else {
                        prVarArr = prVarArr2;
                        prVar2.c(f);
                        fArr[i6] = (prVar2.a() * f7) + (prVar2.n * prVar2.h) + f9;
                        fArr[i6 + 1] = (prVar2.b() * f7) + (prVar2.o * prVar2.i) + f8;
                    }
                    i6 += 2;
                    i7++;
                    prVarArr2 = prVarArr;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                rlVar7.e(i8, fArr[i8]);
            }
        } else {
            int a = a(i);
            float c2 = c(a, i, true);
            r34 r34Var = this.x;
            pr6 pr6Var2 = (pr6) s34Var.b(r34Var.c(a));
            if (pr6Var2 != null && (rlVar5 = pr6Var2.a) != null) {
                rlVar6 = rlVar5;
            }
            pr6 pr6Var3 = (pr6) s34Var.b(r34Var.c(a + 1));
            if (pr6Var3 == null || (rlVar4 = pr6Var3.a) == null) {
                rlVar4 = rlVar2;
            }
            int b = rlVar7.b();
            for (int i9 = 0; i9 < b; i9++) {
                rlVar7.e(i9, (rlVar4.a(i9) * c2) + ((1.0f - c2) * rlVar6.a(i9)));
            }
        }
        return rlVar7;
    }
}
