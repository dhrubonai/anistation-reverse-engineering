package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface wz3 extends yz3 {
    @Override // defpackage.yz3
    default boolean d(ub2 ub2Var) {
        return ((Boolean) ub2Var.invoke(this)).booleanValue();
    }

    @Override // defpackage.yz3
    default Object i(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }
}
