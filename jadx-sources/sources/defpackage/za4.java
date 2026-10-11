package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class za4 implements x73 {
    public static final za4 a = new Object();
    public static final ya4 b = ya4.a;

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        throw new IllegalArgumentException("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return b;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        ((Void) obj).getClass();
        throw new IllegalArgumentException("'kotlin.Nothing' cannot be serialized");
    }
}
