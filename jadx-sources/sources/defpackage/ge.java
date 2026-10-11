package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ge implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ge(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.z = obj;
        this.y = z;
        this.A = obj2;
        this.B = obj3;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.B;
        Object obj3 = this.A;
        boolean z = this.y;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                pc pcVar = (pc) obj3;
                w60 w60Var = (w60) obj2;
                bb3 bb3Var = (bb3) obj;
                bb3Var.a();
                xg0 xg0Var = bb3Var.x;
                if (((Boolean) ((sb2) obj4).invoke()).booleanValue()) {
                    if (z) {
                        long A0 = xg0Var.A0();
                        dn0 dn0Var = xg0Var.y;
                        long B = dn0Var.B();
                        dn0Var.y().h();
                        try {
                            ((af2) dn0Var.y).r(-1.0f, 1.0f, A0);
                            bp1.s0(bb3Var, pcVar, w60Var);
                        } finally {
                            h11.u(dn0Var, B);
                        }
                    } else {
                        bp1.s0(bb3Var, pcVar, w60Var);
                    }
                }
                return pn6Var;
            default:
                pi3 pi3Var = (pi3) obj4;
                String str = (String) obj3;
                v87 v87Var = (v87) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof m87) {
                    pi3Var.stop(((m87) th).x);
                }
                if (z && str != null) {
                    Trace.endAsyncSection(it5.f(str), v87Var.a.hashCode());
                }
                return pn6Var;
        }
    }
}
