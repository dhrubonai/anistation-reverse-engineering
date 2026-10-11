package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gt0 implements og3 {
    public final rg3 x = new rg3(this, true);
    public eg3 y;
    public eg3 z;

    public gt0() {
        eg3 eg3Var = eg3.y;
        this.y = eg3Var;
        this.z = eg3Var;
    }

    public final void a() {
        eg3 eg3Var;
        if (this.y.ordinal() < this.z.ordinal()) {
            eg3Var = this.y;
        } else {
            eg3Var = this.z;
        }
        rg3 rg3Var = this.x;
        if (rg3Var.i == eg3.y && eg3Var == eg3.x) {
            return;
        }
        eg3Var.getClass();
        rg3Var.d("setCurrentState");
        rg3Var.f(eg3Var);
    }

    @Override // defpackage.og3
    public final fg3 getLifecycle() {
        return this.x;
    }
}
