package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ec5 extends s0 implements x11 {
    public final vz0 B;

    public ec5(vz0 vz0Var, l11 l11Var) {
        super(l11Var, true, true);
        this.B = vz0Var;
    }

    @Override // defpackage.t43
    public final boolean P() {
        return true;
    }

    @Override // defpackage.x11
    public final x11 getCallerFrame() {
        vz0 vz0Var = this.B;
        if (vz0Var instanceof x11) {
            return (x11) vz0Var;
        }
        return null;
    }

    @Override // defpackage.t43
    public void m(Object obj) {
        kh1.a(wc7.z(this.B), bx7.J(obj));
    }

    @Override // defpackage.t43
    public void n(Object obj) {
        this.B.resumeWith(bx7.J(obj));
    }

    public void j0() {
    }
}
