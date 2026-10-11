package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class rp6 implements x73 {
    public static final rp6 a = new Object();
    public static final au4 b = dj5.a("io.ktor.http.Url");

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        return fz5.b(l61Var.s());
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        op6 op6Var = (op6) obj;
        op6Var.getClass();
        wt1Var.o(op6Var.C);
    }
}
