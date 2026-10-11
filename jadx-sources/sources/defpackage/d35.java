package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d35 implements lg3 {
    public final /* synthetic */ dg3 A;
    public final /* synthetic */ qg0 B;
    public final /* synthetic */ m54 C;
    public final /* synthetic */ an D;
    public final /* synthetic */ dg3 x;
    public final /* synthetic */ w05 y;
    public final /* synthetic */ v11 z;

    public d35(dg3 dg3Var, w05 w05Var, v11 v11Var, dg3 dg3Var2, qg0 qg0Var, m54 m54Var, an anVar) {
        this.x = dg3Var;
        this.y = w05Var;
        this.z = v11Var;
        this.A = dg3Var2;
        this.B = qg0Var;
        this.C = m54Var;
        this.D = anVar;
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        dg3 dg3Var2 = this.x;
        w05 w05Var = this.y;
        if (dg3Var == dg3Var2) {
            w05Var.x = tl7.z(this.z, null, null, new j10(this.C, this.D, null, (byte) 6), 3);
            return;
        }
        if (dg3Var == this.A) {
            h43 h43Var = (h43) w05Var.x;
            if (h43Var != null) {
                h43Var.l(null);
            }
            w05Var.x = null;
        }
        if (dg3Var == dg3.ON_DESTROY) {
            this.B.resumeWith(pn6.a);
        }
    }
}
