package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class y66 implements l61, gu0 {
    public final ArrayList a = new ArrayList();
    public boolean b;

    @Override // defpackage.l61
    public final float A() {
        return H(N());
    }

    @Override // defpackage.gu0
    public final long B(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return K(((n1) this).R(aj5Var, i));
    }

    @Override // defpackage.l61
    public final double C() {
        return G(N());
    }

    public abstract boolean D(Object obj);

    public abstract byte E(Object obj);

    public abstract char F(Object obj);

    public abstract double G(Object obj);

    public abstract float H(Object obj);

    public abstract l61 I(Object obj, aj5 aj5Var);

    public abstract int J(Object obj);

    public abstract long K(Object obj);

    public abstract short L(Object obj);

    public abstract String M(Object obj);

    public final Object N() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(arrayList.size() - 1);
        this.b = true;
        return remove;
    }

    @Override // defpackage.gu0
    public final l61 d(vt4 vt4Var, int i) {
        return I(((n1) this).R(vt4Var, i), vt4Var.h(i));
    }

    @Override // defpackage.l61
    public final Void decodeNull() {
        return null;
    }

    @Override // defpackage.gu0
    public final Object decodeNullableSerializableElement(aj5 aj5Var, int i, ne1 ne1Var, Object obj) {
        Object f;
        aj5Var.getClass();
        ne1Var.getClass();
        this.a.add(((n1) this).R(aj5Var, i));
        if (!ne1Var.getDescriptor().c() && !decodeNotNullMark()) {
            f = null;
        } else {
            f = f(ne1Var);
        }
        if (!this.b) {
            N();
        }
        this.b = false;
        return f;
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
    public final boolean e() {
        return D(N());
    }

    @Override // defpackage.l61
    public abstract /* bridge */ Object f(ne1 ne1Var);

    @Override // defpackage.l61
    public final char g() {
        return F(N());
    }

    @Override // defpackage.gu0
    public final float h(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return H(((n1) this).R(aj5Var, i));
    }

    @Override // defpackage.gu0
    public final char j(vt4 vt4Var, int i) {
        return F(((n1) this).R(vt4Var, i));
    }

    @Override // defpackage.gu0
    public final byte l(vt4 vt4Var, int i) {
        return E(((n1) this).R(vt4Var, i));
    }

    @Override // defpackage.gu0
    public final String m(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return M(((n1) this).R(aj5Var, i));
    }

    @Override // defpackage.l61
    public final int n() {
        return J(N());
    }

    @Override // defpackage.gu0
    public final short o(vt4 vt4Var, int i) {
        return L(((n1) this).R(vt4Var, i));
    }

    @Override // defpackage.gu0
    public final Object p(aj5 aj5Var, int i, ne1 ne1Var, Object obj) {
        aj5Var.getClass();
        ne1Var.getClass();
        this.a.add(((n1) this).R(aj5Var, i));
        ne1Var.getClass();
        Object f = f(ne1Var);
        if (!this.b) {
            N();
        }
        this.b = false;
        return f;
    }

    @Override // defpackage.gu0
    public final int r(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return J(((n1) this).R(aj5Var, i));
    }

    @Override // defpackage.l61
    public final String s() {
        return M(N());
    }

    @Override // defpackage.l61
    public final int t(aj5 aj5Var) {
        String str;
        aj5Var.getClass();
        Object N = N();
        n1 n1Var = (n1) this;
        String str2 = (String) N;
        str2.getClass();
        q53 O = n1Var.O(str2);
        String a = aj5Var.a();
        boolean z = O instanceof l63;
        y43 y43Var = n1Var.c;
        if (!z) {
            String str3 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of " + a;
            String U = n1Var.U(str2);
            if (y43Var.a.l) {
                str = iv.I(O.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str3, U, null, str));
        }
        return m37.r(aj5Var, y43Var, ((l63) O).b(), "");
    }

    @Override // defpackage.l61
    public final long u() {
        return K(N());
    }

    @Override // defpackage.gu0
    public final boolean w(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return D(((n1) this).R(aj5Var, i));
    }

    @Override // defpackage.l61
    public final byte x() {
        return E(N());
    }

    @Override // defpackage.gu0
    public final double y(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return G(((n1) this).R(aj5Var, i));
    }

    @Override // defpackage.l61
    public final short z() {
        return L(N());
    }
}
