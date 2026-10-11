package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class m63 extends n1 {
    public final q53 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m63(y43 y43Var, q53 q53Var, String str) {
        super(y43Var, str);
        q53Var.getClass();
        this.f = q53Var;
        this.a.add("primitive");
    }

    @Override // defpackage.n1
    public final q53 O(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        ze0.k("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.n1
    public final q53 S() {
        return this.f;
    }

    @Override // defpackage.gu0
    public final int i(aj5 aj5Var) {
        aj5Var.getClass();
        return 0;
    }
}
