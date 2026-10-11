package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s91 implements fp3 {
    public fp3 A;
    public boolean B = true;
    public boolean C;
    public final ss3 x;
    public final fz1 y;
    public w30 z;

    public s91(fz1 fz1Var, f46 f46Var) {
        this.y = fz1Var;
        this.x = new ss3(f46Var);
    }

    public final void a(w30 w30Var) {
        fp3 fp3Var;
        fp3 h = w30Var.h();
        if (h != null && h != (fp3Var = this.A)) {
            if (fp3Var == null) {
                this.A = h;
                this.z = w30Var;
                h.b((rn4) this.x.B);
                return;
            }
            throw new yx1(2, new IllegalStateException("Multiple renderer media clocks enabled."), UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        }
    }

    @Override // defpackage.fp3
    public final void b(rn4 rn4Var) {
        fp3 fp3Var = this.A;
        if (fp3Var != null) {
            fp3Var.b(rn4Var);
            rn4Var = this.A.e();
        }
        this.x.b(rn4Var);
    }

    @Override // defpackage.fp3
    public final rn4 e() {
        fp3 fp3Var = this.A;
        if (fp3Var != null) {
            return fp3Var.e();
        }
        return (rn4) this.x.B;
    }

    @Override // defpackage.fp3
    public final long m() {
        if (this.B) {
            return this.x.m();
        }
        fp3 fp3Var = this.A;
        fp3Var.getClass();
        return fp3Var.m();
    }

    @Override // defpackage.fp3
    public final boolean o() {
        if (this.B) {
            return false;
        }
        fp3 fp3Var = this.A;
        fp3Var.getClass();
        return fp3Var.o();
    }
}
