package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ab3 {
    public final j7 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public j7 h;
    public final /* synthetic */ byte j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public ab3(j7 j7Var, byte b) {
        this.j = b;
        this.a = j7Var;
    }

    public final void a(f7 f7Var, int i, fa4 fa4Var) {
        float intBitsToFloat;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        ih4 ih4Var = fa4Var.q0;
                        if (ih4Var != null) {
                            fi2 fi2Var = (fi2) ih4Var;
                            float[] b = fi2Var.b();
                            if (!fi2Var.P) {
                                j = jo3.b(j, b);
                            }
                        }
                        j = w65.N(j, fa4Var.c0);
                        break;
                    default:
                        am3 W0 = fa4Var.W0();
                        W0.getClass();
                        long j2 = W0.S;
                        j = xc4.f((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                fa4Var = fa4Var.T;
                fa4Var.getClass();
                if (fa4Var.equals(this.a.e())) {
                    if (f7Var instanceof vn2) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    HashMap hashMap = this.i;
                    if (hashMap.containsKey(f7Var)) {
                        int intValue = ((Number) vn3.Q(f7Var, hashMap)).intValue();
                        vn2 vn2Var = i7.a;
                        round = ((Number) f7Var.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(f7Var, Integer.valueOf(round));
                    return;
                }
            } while (!b(fa4Var).containsKey(f7Var));
            float c = c(fa4Var, f7Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(fa4 fa4Var) {
        switch (this.j) {
            case 0:
                return fa4Var.u0().a();
            default:
                am3 W0 = fa4Var.W0();
                W0.getClass();
                return W0.u0().a();
        }
    }

    public final int c(fa4 fa4Var, f7 f7Var) {
        switch (this.j) {
            case 0:
                return fa4Var.P(f7Var);
            default:
                am3 W0 = fa4Var.W0();
                W0.getClass();
                return W0.P(f7Var);
        }
    }

    public final boolean d() {
        if (!this.c && !this.e && !this.f && !this.g) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        h();
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        this.b = true;
        j7 j7Var = this.a;
        j7 f = j7Var.f();
        if (f == null) {
            return;
        }
        if (this.c) {
            f.K();
        } else if (this.e || this.d) {
            f.requestLayout();
        }
        if (this.f) {
            j7Var.K();
        }
        if (this.g) {
            j7Var.requestLayout();
        }
        f.a().f();
    }

    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        l0 l0Var = new l0(this, (byte) 5);
        j7 j7Var = this.a;
        j7Var.t(l0Var);
        hashMap.putAll(b(j7Var.e()));
        this.b = false;
    }

    public final void h() {
        ab3 a;
        ab3 a2;
        boolean d = d();
        j7 j7Var = this.a;
        if (!d) {
            j7 f = j7Var.f();
            if (f != null) {
                j7Var = f.a().h;
                if (j7Var == null || !j7Var.a().d()) {
                    j7 j7Var2 = this.h;
                    if (j7Var2 != null && !j7Var2.a().d()) {
                        j7 f2 = j7Var2.f();
                        if (f2 != null && (a2 = f2.a()) != null) {
                            a2.h();
                        }
                        j7 f3 = j7Var2.f();
                        if (f3 != null && (a = f3.a()) != null) {
                            j7Var = a.h;
                        } else {
                            j7Var = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.h = j7Var;
    }
}
