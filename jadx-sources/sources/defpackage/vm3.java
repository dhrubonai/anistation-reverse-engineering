package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vm3 implements zx3 {
    public zx3[] a;

    @Override // defpackage.zx3
    public final yx3 a(Class cls) {
        for (zx3 zx3Var : this.a) {
            if (zx3Var.b(cls)) {
                return zx3Var.a(cls);
            }
        }
        ov3.g("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.zx3
    public final boolean b(Class cls) {
        for (zx3 zx3Var : this.a) {
            if (zx3Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
