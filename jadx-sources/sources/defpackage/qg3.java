package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qg3 {
    public eg3 a;
    public lg3 b;

    public final void a(og3 og3Var, dg3 dg3Var) {
        eg3 a = dg3Var.a();
        eg3 eg3Var = this.a;
        if (a.compareTo(eg3Var) < 0) {
            eg3Var = a;
        }
        this.a = eg3Var;
        this.b.onStateChanged(og3Var, dg3Var);
        this.a = a;
    }
}
