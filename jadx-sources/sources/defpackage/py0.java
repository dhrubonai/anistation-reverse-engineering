package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class py0 extends xz3 implements wu0, yo3 {
    public rg4 L;
    public final rd5 M;
    public boolean N;
    public fa0 O;
    public final id5 P;
    public boolean R;
    public boolean T;
    public final v90 Q = new v90((byte) 0);
    public long S = -1;

    public py0(rg4 rg4Var, rd5 rd5Var, boolean z, fa0 fa0Var, id5 id5Var) {
        this.L = rg4Var;
        this.M = rd5Var;
        this.N = z;
        this.O = fa0Var;
        this.P = id5Var;
    }

    public static boolean c1(py0 py0Var, n05 n05Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = py0Var.b1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long e1 = py0Var.e1(n05Var, j3, j2);
        if (Math.abs(Float.intBitsToFloat((int) (e1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (e1 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.yo3
    public final void a(long j) {
        int D;
        long j2;
        long b1 = b1();
        this.S = j;
        int ordinal = this.L.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                D = a34.D((int) (j >> 32), (int) (b1 >> 32));
            } else {
                ze0.l();
                return;
            }
        } else {
            D = a34.D((int) (j & 4294967295L), (int) (b1 & 4294967295L));
        }
        if (D < 0) {
            if (!this.N) {
                if (this.L == rg4.x) {
                    j2 = (((int) (b1 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L;
                } else {
                    j2 = (((int) (b1 >> 32)) - ((int) (j >> 32))) << 32;
                }
            } else {
                j2 = 0;
            }
            long j3 = j2;
            n05 n05Var = (n05) this.P.invoke();
            if (n05Var != null && !this.T && !this.R && c1(this, n05Var, b1, 0L, 2) && !c1(this, n05Var, 0L, j3, 1)) {
                this.R = true;
                d1(j3);
            }
        }
    }

    public final float a1(fa0 fa0Var, long j) {
        float f;
        n05 n05Var;
        int compare;
        long j2 = this.S;
        z44 z44Var = this.Q.a;
        int i = z44Var.z - 1;
        Object[] objArr = z44Var.x;
        n05 n05Var2 = null;
        if (i < objArr.length) {
            n05Var = null;
            while (true) {
                if (i >= 0) {
                    n05 n05Var3 = (n05) ((my0) objArr[i]).a.invoke();
                    if (n05Var3 != null) {
                        long e = n05Var3.e();
                        long O = m37.O(b1());
                        f = 0.0f;
                        int ordinal = this.L.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                compare = Float.compare(Float.intBitsToFloat((int) (e >> 32)), Float.intBitsToFloat((int) (O >> 32)));
                            } else {
                                ze0.l();
                                return 0.0f;
                            }
                        } else {
                            compare = Float.compare(Float.intBitsToFloat((int) (e & 4294967295L)), Float.intBitsToFloat((int) (O & 4294967295L)));
                        }
                        if (compare <= 0) {
                            n05Var = n05Var3;
                        } else if (n05Var == null) {
                            n05Var = n05Var3;
                        }
                    }
                    i--;
                } else {
                    f = 0.0f;
                    break;
                }
            }
        } else {
            f = 0.0f;
            n05Var = null;
        }
        if (n05Var == null) {
            if (this.R) {
                n05Var2 = (n05) this.P.invoke();
            }
            if (n05Var2 == null) {
                return f;
            }
            n05Var = n05Var2;
        }
        long O2 = m37.O(j2);
        int ordinal2 = this.L.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                float f2 = n05Var.a;
                return fa0Var.a(f2 - ((int) (j >> 32)), n05Var.c - f2, Float.intBitsToFloat((int) (O2 >> 32)));
            }
            ze0.l();
            return f;
        }
        float f3 = n05Var.b;
        return fa0Var.a(f3 - ((int) (j & 4294967295L)), n05Var.d - f3, Float.intBitsToFloat((int) (O2 & 4294967295L)));
    }

    public final long b1() {
        long j = this.S;
        if (k13.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void d1(long j) {
        fa0 fa0Var = this.O;
        if (fa0Var == null) {
            fa0Var = (fa0) t80.C(this, ha0.a);
        }
        fa0 fa0Var2 = fa0Var;
        if (this.T) {
            hz2.c("launchAnimation called when previous animation was running");
        }
        fa0 fa0Var3 = this.O;
        if (fa0Var3 == null) {
            fa0Var3 = (fa0) t80.C(this, ha0.a);
        }
        fa0Var3.getClass();
        fa0.a.getClass();
        yo6 yo6Var = new yo6(ea0.b);
        tl7.z(O0(), null, y11.A, new oy0(this, yo6Var, fa0Var2, j, null), 1);
    }

    public final long e1(n05 n05Var, long j, long j2) {
        long O = m37.O(j);
        int ordinal = this.L.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                fa0 fa0Var = this.O;
                if (fa0Var == null) {
                    fa0Var = (fa0) t80.C(this, ha0.a);
                }
                float f = n05Var.a;
                return (Float.floatToRawIntBits(fa0Var.a(f - ((int) (j2 >> 32)), n05Var.c - f, Float.intBitsToFloat((int) (O >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            }
            ze0.l();
            return 0L;
        }
        fa0 fa0Var2 = this.O;
        if (fa0Var2 == null) {
            fa0Var2 = (fa0) t80.C(this, ha0.a);
        }
        float f2 = n05Var.b;
        float a = fa0Var2.a(f2 - ((int) (j2 & 4294967295L)), n05Var.d - f2, Float.intBitsToFloat((int) (O & 4294967295L)));
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
    }
}
