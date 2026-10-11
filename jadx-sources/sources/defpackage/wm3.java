package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wm3 implements ay3 {
    public ay3[] a;

    @Override // defpackage.ay3
    public final ey4 a(Class cls) {
        for (ay3 ay3Var : this.a) {
            if (ay3Var.b(cls)) {
                return ay3Var.a(cls);
            }
        }
        ov3.g("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.ay3
    public final boolean b(Class cls) {
        for (ay3 ay3Var : this.a) {
            if (ay3Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
