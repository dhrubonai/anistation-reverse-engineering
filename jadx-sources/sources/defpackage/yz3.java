package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface yz3 {
    boolean d(ub2 ub2Var);

    Object i(Object obj, ic2 ic2Var);

    default yz3 w(yz3 yz3Var) {
        if (yz3Var == vz3.x) {
            return this;
        }
        return new iq0(this, yz3Var);
    }
}
