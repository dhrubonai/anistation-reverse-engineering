package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface nr {
    Object h();

    void i(int i, Object obj);

    void j(Object obj);

    void k();

    void l(int i, int i2, int i3);

    default void m(Object obj, ic2 ic2Var) {
        ic2Var.invoke(h(), obj);
    }

    void n(int i, int i2);

    void p();

    void q(int i, Object obj);

    default void r() {
    }
}
