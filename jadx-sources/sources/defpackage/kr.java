package defpackage;

import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kr extends vv6 {
    public final rq b;
    public final qp c;
    public final sx5 d = tx5.a(dr.a);
    public final sx5 e = tx5.a(Boolean.FALSE);
    public bx5 f;

    public kr(rq rqVar, qp qpVar) {
        this.b = rqVar;
        this.c = qpVar;
        e(new gr((byte) 0), false);
    }

    public final void e(sb2 sb2Var, boolean z) {
        if (this.d.getValue() instanceof br) {
            return;
        }
        tl7.z(zz.J(this), null, null, new ir((byte) 0, null, this, sb2Var, z), 3);
    }

    public final void f() {
        AppUpdateCheck appUpdateCheck;
        fr frVar = (fr) this.d.getValue();
        if (frVar != null) {
            if (frVar instanceof zq) {
                appUpdateCheck = ((zq) frVar).a;
            } else if (frVar instanceof cr) {
                appUpdateCheck = ((cr) frVar).b;
            } else {
                return;
            }
            if (appUpdateCheck != null) {
                bx5 bx5Var = this.f;
                vz0 vz0Var = null;
                if (bx5Var != null) {
                    bx5Var.l(null);
                }
                this.f = tl7.z(zz.J(this), null, null, new c0(this, appUpdateCheck, vz0Var, (byte) 9), 3);
            }
        }
    }
}
