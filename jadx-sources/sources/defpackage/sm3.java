package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sm3 extends z4 {
    public final a5 a;

    public sm3(a5 a5Var) {
        this.a = a5Var;
    }

    @Override // defpackage.z4
    public final void a(Object obj) {
        e5 e5Var = this.a.a;
        if (e5Var != null) {
            e5Var.a(obj);
        } else {
            ze0.m("Launcher has not been initialized");
        }
    }
}
