package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class z53 implements Iterator, j73 {
    public boolean A = true;
    public boolean B;
    public final y43 x;
    public final qy4 y;
    public final ne1 z;

    public z53(y43 y43Var, qy4 qy4Var, ne1 ne1Var) {
        this.x = y43Var;
        this.y = qy4Var;
        this.z = ne1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        String str;
        if (this.B) {
            return false;
        }
        qy4 qy4Var = this.y;
        if (qy4Var.z() == 9) {
            this.B = true;
            qy4Var.i((byte) 9);
            if (qy4Var.z() == 10) {
                return false;
            }
            if (qy4Var.z() != 8) {
                qy4Var.s();
                return false;
            }
            m1.u(qy4Var, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
            throw null;
        }
        if (qy4Var.z() != 10 || this.B) {
            return true;
        }
        String V = h98.V((byte) 9);
        int i2 = qy4Var.y;
        if (i2 > 0) {
            i = i2 - 1;
        } else {
            i = i2;
        }
        yr yrVar = qy4Var.G;
        if (i2 != yrVar.y && i >= 0) {
            str = String.valueOf(yrVar.x[i]);
        } else {
            str = "EOF";
        }
        m1.u(qy4Var, qx1.n("Expected ", V, ", but had '", str, "' instead"), i, null, 4);
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        boolean z = this.A;
        qy4 qy4Var = this.y;
        if (z) {
            this.A = false;
        } else {
            qy4Var.j(',');
        }
        ne1 ne1Var = this.z;
        return new zy5(this.x, i97.z, qy4Var, ne1Var.getDescriptor(), null).f(ne1Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
