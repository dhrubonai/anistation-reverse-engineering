package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class aj1 implements x73 {
    public static final aj1 a = new Object();
    public static final au4 b = new au4("kotlin.Double", xt4.d);

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        return Double.valueOf(l61Var.C());
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        wt1Var.d(((Number) obj).doubleValue());
    }
}
