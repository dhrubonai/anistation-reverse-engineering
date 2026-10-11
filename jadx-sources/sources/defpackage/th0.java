package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class th0 implements io4 {
    public final /* synthetic */ qi4 a;
    public final /* synthetic */ w44 b;
    public final /* synthetic */ w44 c;

    public th0(qi4 qi4Var, w44 w44Var, w44 w44Var2) {
        this.a = qi4Var;
        this.b = w44Var;
        this.c = w44Var2;
    }

    @Override // defpackage.io4
    public final void C(int i, boolean z) {
        this.a.i(i);
        this.b.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.io4
    public final void V(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }
}
