package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class te6 {
    public final int a;
    public final hz b;
    public final b0 c;
    public te6 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ hj3 h;

    public te6(hj3 hj3Var, int i, hz hzVar, b0 b0Var) {
        this.h = hj3Var;
        this.a = i;
        this.b = hzVar;
        this.c = b0Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        z15 z15Var;
        z15 z15Var2;
        long j5 = this.h.d;
        hz hzVar = this.b;
        fa4 M = wc7.M(hzVar, 2);
        za3 O = wc7.O(hzVar);
        boolean J = O.J();
        kf kfVar = O.c0;
        if (!J) {
            z15Var2 = null;
        } else {
            if (((fa4) kfVar.B) != M) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = M.z;
                fa4 fa4Var = (fa4) kfVar.B;
                fa4Var.getClass();
                z15Var = new z15(w65.R(fa4Var.E(M, floatToRawIntBits)), (4294967295L & (((int) (r3 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r3 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, hzVar);
            } else {
                z15Var = new z15(j, j2, j3, j4, j5, fArr, hzVar);
            }
            z15Var2 = z15Var;
        }
        if (z15Var2 == null) {
            return;
        }
        this.c.invoke(z15Var2);
    }

    public final void b() {
        te6 te6Var;
        hj3 hj3Var = this.h;
        s34 s34Var = (s34) hj3Var.e;
        int i = this.a;
        te6 te6Var2 = (te6) s34Var.g(i);
        if (te6Var2 != null) {
            if (te6Var2 != this) {
                int d = s34Var.d(i);
                Object[] objArr = s34Var.c;
                Object obj = objArr[d];
                s34Var.b[d] = i;
                objArr[d] = te6Var2;
                while (true) {
                    te6 te6Var3 = te6Var2.d;
                    if (te6Var3 == null) {
                        break;
                    }
                    if (te6Var3 == this) {
                        te6Var2.d = this.d;
                        this.d = null;
                        return;
                    }
                    te6Var2 = te6Var3;
                }
            } else {
                te6 te6Var4 = this.d;
                this.d = null;
                if (te6Var4 != null) {
                    int d2 = s34Var.d(i);
                    Object[] objArr2 = s34Var.c;
                    Object obj2 = objArr2[d2];
                    s34Var.b[d2] = i;
                    objArr2[d2] = te6Var4;
                    return;
                }
                za3 O = wc7.O(this.b.x);
                if (O.I()) {
                    p05 rectManager = ((oa) cb3.a(O)).getRectManager();
                    rectManager.getClass();
                    if (O.D != -4) {
                        eb2 eb2Var = rectManager.c;
                        int d3 = rectManager.d(O);
                        long[] jArr = (long[]) eb2Var.z;
                        int i2 = d3 + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        te6 te6Var5 = (te6) hj3Var.f;
        if (te6Var5 == this) {
            hj3Var.f = te6Var5.d;
            this.d = null;
            return;
        }
        if (te6Var5 != null) {
            te6Var = te6Var5.d;
        } else {
            te6Var = null;
        }
        while (true) {
            te6 te6Var6 = te6Var5;
            te6Var5 = te6Var;
            if (te6Var5 != null) {
                if (te6Var5 == this) {
                    if (te6Var6 != null) {
                        te6Var6.d = te6Var5.d;
                    }
                    this.d = null;
                    return;
                }
                te6Var = te6Var5.d;
            } else {
                return;
            }
        }
    }
}
