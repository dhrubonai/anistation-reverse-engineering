package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i95 implements c25 {
    public Object A;
    public Object[] B;
    public m95 C;
    public final nj4 D = new nj4(this, 9);
    public ja5 x;
    public n95 y;
    public String z;

    public i95(ja5 ja5Var, n95 n95Var, String str, Object obj, Object[] objArr) {
        this.x = ja5Var;
        this.y = n95Var;
        this.z = str;
        this.A = obj;
        this.B = objArr;
    }

    @Override // defpackage.c25
    public final void a() {
        m95 m95Var = this.C;
        if (m95Var != null) {
            ((st3) m95Var).L();
        }
    }

    @Override // defpackage.c25
    public final void b() {
        m95 m95Var = this.C;
        if (m95Var != null) {
            ((st3) m95Var).L();
        }
    }

    @Override // defpackage.c25
    public final void c() {
        d();
    }

    public final void d() {
        String r;
        n95 n95Var = this.y;
        m95 m95Var = this.C;
        if (m95Var == null) {
            if (n95Var != null) {
                nj4 nj4Var = this.D;
                Object invoke = nj4Var.invoke();
                if (invoke != null && !n95Var.b(invoke)) {
                    if (invoke instanceof rt5) {
                        rt5 rt5Var = (rt5) invoke;
                        if (rt5Var.d() != h95.H && rt5Var.d() != p7.S && rt5Var.d() != pk2.c0) {
                            r = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            r = "MutableState containing " + rt5Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        r = oi4.r(invoke);
                    }
                    throw new IllegalArgumentException(r);
                }
                this.C = n95Var.a(this.z, nj4Var);
                return;
            }
            return;
        }
        ov3.m("entry(", m95Var, ") is not null");
    }
}
