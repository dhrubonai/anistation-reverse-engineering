package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gh1 extends n22 {
    public final n22 z;

    public gh1(n22 n22Var) {
        n22Var.getClass();
        this.z = n22Var;
    }

    @Override // defpackage.n22
    public final List G(qj4 qj4Var) {
        List<qj4> G = this.z.G(qj4Var);
        ArrayList arrayList = new ArrayList();
        for (qj4 qj4Var2 : G) {
            qj4Var2.getClass();
            arrayList.add(qj4Var2);
        }
        cp0.W(arrayList);
        return arrayList;
    }

    @Override // defpackage.n22
    public final e22 T(qj4 qj4Var) {
        qj4Var.getClass();
        e22 T = this.z.T(qj4Var);
        if (T == null) {
            return null;
        }
        qj4 qj4Var2 = (qj4) T.d;
        if (qj4Var2 == null) {
            return T;
        }
        boolean z = T.b;
        boolean z2 = T.c;
        Long l = (Long) T.e;
        Long l2 = (Long) T.f;
        Long l3 = (Long) T.g;
        Long l4 = (Long) T.h;
        Map map = (Map) T.i;
        map.getClass();
        return new e22(z, z2, qj4Var2, l, l2, l3, l4, map);
    }

    @Override // defpackage.n22
    public final pq5 a(qj4 qj4Var) {
        return this.z.a(qj4Var);
    }

    @Override // defpackage.n22, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z.close();
    }

    @Override // defpackage.n22
    public final z63 d0(qj4 qj4Var) {
        return this.z.d0(qj4Var);
    }

    @Override // defpackage.n22
    public final pq5 k0(qj4 qj4Var, boolean z) {
        qj4 c = qj4Var.c();
        if (c != null) {
            bs bsVar = new bs();
            while (c != null && !A(c)) {
                bsVar.addFirst(c);
                c = c.c();
            }
            Iterator<E> it = bsVar.iterator();
            while (it.hasNext()) {
                p((qj4) it.next());
            }
        }
        return this.z.k0(qj4Var, z);
    }

    @Override // defpackage.n22
    public final void l(qj4 qj4Var, qj4 qj4Var2) {
        qj4Var2.getClass();
        this.z.l(qj4Var, qj4Var2);
    }

    @Override // defpackage.n22
    public final bv5 l0(qj4 qj4Var) {
        qj4Var.getClass();
        return this.z.l0(qj4Var);
    }

    @Override // defpackage.n22
    public final void p(qj4 qj4Var) {
        qj4Var.getClass();
        this.z.p(qj4Var);
    }

    @Override // defpackage.n22
    public final void q(qj4 qj4Var) {
        qj4Var.getClass();
        this.z.q(qj4Var);
    }

    public final String toString() {
        return z05.a(gh1.class).f() + '(' + this.z + ')';
    }
}
