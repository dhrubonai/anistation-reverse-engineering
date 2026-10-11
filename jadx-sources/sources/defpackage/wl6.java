package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wl6 implements x73 {
    public static final wl6 a = new Object();
    public static final aj5 b = bz2.InlinePrimitiveDescriptor("kotlin.UByte", nd0.a);

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        return new sl6(l61Var.q(b).x());
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        wt1Var.h(b).f(((sl6) obj).x);
    }
}
