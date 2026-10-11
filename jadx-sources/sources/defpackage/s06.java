package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s06 implements ni5, aq1 {
    public final ni5 a;
    public final int b;
    public final int c;

    public s06(ni5 ni5Var, int i, int i2) {
        ni5Var.getClass();
        this.a = ni5Var;
        this.b = i;
        this.c = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i2 >= i) {
                    return;
                }
                ze0.e(zo5.m("endIndex should be not less than startIndex, but was ", " < ", i2, i));
                throw null;
            }
            ze0.e(qx1.h(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        ze0.e(qx1.h(i, "startIndex should be non-negative, but is "));
        throw null;
    }

    @Override // defpackage.aq1
    public final ni5 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return this;
        }
        return new s06(this.a, i3, i + i3);
    }

    @Override // defpackage.aq1
    public final ni5 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return st1.a;
        }
        return new s06(this.a, i3 + i, i2);
    }

    @Override // defpackage.ni5
    public final Iterator iterator() {
        return new xd2(this);
    }
}
