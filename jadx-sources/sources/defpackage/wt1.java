package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface wt1 {
    uj5 b();

    hu0 c(aj5 aj5Var);

    void d(double d);

    void e(short s);

    void encodeNull();

    default <T> void encodeNullableSerializableValue(mj5 mj5Var, T t) {
        mj5Var.getClass();
        if (mj5Var.getDescriptor().c()) {
            j(mj5Var, t);
        } else if (t == null) {
            encodeNull();
        } else {
            ((v0) this).encodeNotNullMark();
            j(mj5Var, t);
        }
    }

    void f(byte b);

    void g(boolean z);

    wt1 h(aj5 aj5Var);

    void i(float f);

    void j(mj5 mj5Var, Object obj);

    void k(char c);

    void l(aj5 aj5Var, int i);

    void m(int i);

    void n(long j);

    void o(String str);

    default void encodeNotNullMark() {
    }
}
