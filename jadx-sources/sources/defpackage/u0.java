package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class u0 implements l61, gu0 {
    @Override // defpackage.l61
    public float A() {
        D();
        throw null;
    }

    @Override // defpackage.gu0
    public final long B(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return u();
    }

    @Override // defpackage.l61
    public double C() {
        D();
        throw null;
    }

    public final void D() {
        throw new IllegalArgumentException(z05.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.gu0
    public void a(aj5 aj5Var) {
        aj5Var.getClass();
    }

    @Override // defpackage.l61
    public gu0 c(aj5 aj5Var) {
        aj5Var.getClass();
        return this;
    }

    @Override // defpackage.gu0
    public final l61 d(vt4 vt4Var, int i) {
        return q(vt4Var.h(i));
    }

    @Override // defpackage.l61
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // defpackage.l61
    public Void decodeNull() {
        return null;
    }

    @Override // defpackage.gu0
    public final Object decodeNullableSerializableElement(aj5 aj5Var, int i, ne1 ne1Var, Object obj) {
        aj5Var.getClass();
        ne1Var.getClass();
        if (!ne1Var.getDescriptor().c() && !decodeNotNullMark()) {
            return decodeNull();
        }
        return f(ne1Var);
    }

    @Override // defpackage.l61
    public /* bridge */ <T> T decodeNullableSerializableValue(ne1 ne1Var) {
        return (T) super.decodeNullableSerializableValue(ne1Var);
    }

    @Override // defpackage.gu0
    public /* bridge */ boolean decodeSequentially() {
        return super.decodeSequentially();
    }

    @Override // defpackage.l61
    public boolean e() {
        D();
        throw null;
    }

    @Override // defpackage.l61
    public char g() {
        D();
        throw null;
    }

    @Override // defpackage.gu0
    public final float h(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return A();
    }

    @Override // defpackage.gu0
    public final char j(vt4 vt4Var, int i) {
        return g();
    }

    @Override // defpackage.gu0
    public final byte l(vt4 vt4Var, int i) {
        return x();
    }

    @Override // defpackage.gu0
    public final String m(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return s();
    }

    @Override // defpackage.l61
    public abstract int n();

    @Override // defpackage.gu0
    public final short o(vt4 vt4Var, int i) {
        return z();
    }

    @Override // defpackage.gu0
    public Object p(aj5 aj5Var, int i, ne1 ne1Var, Object obj) {
        aj5Var.getClass();
        ne1Var.getClass();
        return f(ne1Var);
    }

    @Override // defpackage.l61
    public l61 q(aj5 aj5Var) {
        aj5Var.getClass();
        return this;
    }

    @Override // defpackage.gu0
    public final int r(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return n();
    }

    @Override // defpackage.l61
    public String s() {
        D();
        throw null;
    }

    @Override // defpackage.l61
    public int t(aj5 aj5Var) {
        aj5Var.getClass();
        D();
        throw null;
    }

    @Override // defpackage.l61
    public abstract long u();

    @Override // defpackage.gu0
    public final boolean w(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return e();
    }

    @Override // defpackage.l61
    public abstract byte x();

    @Override // defpackage.gu0
    public final double y(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return C();
    }

    @Override // defpackage.l61
    public abstract short z();
}
