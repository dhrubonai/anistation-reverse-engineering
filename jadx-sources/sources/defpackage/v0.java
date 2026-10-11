package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class v0 implements wt1, hu0 {
    @Override // defpackage.wt1
    public abstract void d(double d);

    @Override // defpackage.wt1
    public abstract void e(short s);

    @Override // defpackage.wt1
    public /* bridge */ void encodeNotNullMark() {
        super.encodeNotNullMark();
    }

    public void encodeNullableSerializableElement(aj5 aj5Var, int i, mj5 mj5Var, Object obj) {
        aj5Var.getClass();
        mj5Var.getClass();
        q(aj5Var, i);
        encodeNullableSerializableValue(mj5Var, obj);
    }

    @Override // defpackage.wt1
    public /* bridge */ <T> void encodeNullableSerializableValue(mj5 mj5Var, T t) {
        super.encodeNullableSerializableValue(mj5Var, t);
    }

    @Override // defpackage.wt1
    public abstract void f(byte b);

    @Override // defpackage.wt1
    public abstract void g(boolean z);

    @Override // defpackage.wt1
    public abstract wt1 h(aj5 aj5Var);

    @Override // defpackage.wt1
    public abstract void i(float f);

    @Override // defpackage.wt1
    public abstract void k(char c);

    @Override // defpackage.wt1
    public abstract void m(int i);

    @Override // defpackage.wt1
    public abstract void n(long j);

    @Override // defpackage.wt1
    public abstract void o(String str);

    public final void p(aj5 aj5Var, int i, boolean z) {
        aj5Var.getClass();
        q(aj5Var, i);
        g(z);
    }

    public abstract void q(aj5 aj5Var, int i);

    public final void r(aj5 aj5Var, int i, float f) {
        aj5Var.getClass();
        q(aj5Var, i);
        i(f);
    }

    public final wt1 s(vt4 vt4Var, int i) {
        q(vt4Var, i);
        return h(vt4Var.h(i));
    }

    public /* bridge */ boolean shouldEncodeElementDefault(aj5 aj5Var, int i) {
        return super.shouldEncodeElementDefault(aj5Var, i);
    }

    public final void t(int i, int i2, aj5 aj5Var) {
        aj5Var.getClass();
        q(aj5Var, i);
        m(i2);
    }

    public final void u(aj5 aj5Var, int i, long j) {
        aj5Var.getClass();
        q(aj5Var, i);
        n(j);
    }

    public final void v(aj5 aj5Var, int i, mj5 mj5Var, Object obj) {
        aj5Var.getClass();
        mj5Var.getClass();
        q(aj5Var, i);
        j(mj5Var, obj);
    }

    public final void w(aj5 aj5Var, int i, String str) {
        aj5Var.getClass();
        str.getClass();
        q(aj5Var, i);
        o(str);
    }
}
