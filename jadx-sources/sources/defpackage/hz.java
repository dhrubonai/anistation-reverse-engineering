package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hz extends xz3 {
    public te6 L;
    public final /* synthetic */ iz M;

    public hz(iz izVar) {
        this.M = izVar;
    }

    @Override // defpackage.xz3
    public final void S0() {
        iz izVar = this.M;
        izVar.x = this;
        if (izVar.y != null) {
            b0 b0Var = new b0(this, izVar, (byte) 13);
            za3 O = wc7.O(this);
            int i = O.y;
            p05 rectManager = ((oa) cb3.a(O)).getRectManager();
            hj3 hj3Var = rectManager.d;
            hj3Var.getClass();
            s34 s34Var = (s34) hj3Var.e;
            te6 te6Var = new te6(hj3Var, i, this, b0Var);
            Object b = s34Var.b(i);
            if (b == null) {
                s34Var.h(i, te6Var);
                b = te6Var;
            }
            te6 te6Var2 = (te6) b;
            if (te6Var2 != te6Var) {
                while (true) {
                    te6 te6Var3 = te6Var2.d;
                    if (te6Var3 == null) {
                        break;
                    } else {
                        te6Var2 = te6Var3;
                    }
                }
                te6Var2.d = te6Var;
            }
            za3 O2 = wc7.O(this.x);
            if (O2.D != -4) {
                eb2 eb2Var = rectManager.c;
                int d = rectManager.d(O2);
                long[] jArr = (long[]) eb2Var.z;
                int i2 = d + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.j();
            this.L = te6Var;
        }
    }

    @Override // defpackage.xz3
    public final void T0() {
        iz izVar = this.M;
        if (izVar.x == this) {
            izVar.x = null;
        }
        te6 te6Var = this.L;
        if (te6Var != null) {
            te6Var.b();
        }
        this.L = null;
    }
}
