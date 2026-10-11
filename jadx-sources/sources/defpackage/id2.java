package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class id2 extends qu0 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final q44 e;
    public final ti4 f;
    public final /* synthetic */ kd2 g;

    public id2(kd2 kd2Var, long j, boolean z, boolean z2, af2 af2Var) {
        this.g = kd2Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        q44 q44Var = db5.a;
        this.e = new q44();
        this.f = new ti4(al4.A, pk2.c0);
    }

    @Override // defpackage.qu0
    public final void a(vu0 vu0Var, ic2 ic2Var) {
        this.g.b.a(vu0Var, ic2Var);
    }

    @Override // defpackage.qu0
    public final q44 b(vu0 vu0Var, ko5 ko5Var, ic2 ic2Var) {
        return this.g.b.b(vu0Var, ko5Var, ic2Var);
    }

    @Override // defpackage.qu0
    public final void c(k14 k14Var) {
        this.g.b.c(k14Var);
    }

    @Override // defpackage.qu0
    public final void d() {
        kd2 kd2Var = this.g;
        kd2Var.A--;
    }

    @Override // defpackage.qu0
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // defpackage.qu0
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.qu0
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.qu0
    public final long h() {
        return this.a;
    }

    @Override // defpackage.qu0
    public final pu0 i() {
        return this.g.h;
    }

    @Override // defpackage.qu0
    public final al4 j() {
        return (al4) this.f.getValue();
    }

    @Override // defpackage.qu0
    public final l11 k() {
        return this.g.b.k();
    }

    @Override // defpackage.qu0
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // defpackage.qu0
    public final void m(k14 k14Var) {
        this.g.b.m(k14Var);
    }

    @Override // defpackage.qu0
    public final void n(vu0 vu0Var) {
        kd2 kd2Var = this.g;
        qu0 qu0Var = kd2Var.b;
        qu0Var.n(kd2Var.h);
        qu0Var.n(vu0Var);
    }

    @Override // defpackage.qu0
    public final void o(k14 k14Var, j14 j14Var, nr nrVar) {
        this.g.b.o(k14Var, j14Var, nrVar);
    }

    @Override // defpackage.qu0
    public final j14 p(k14 k14Var) {
        return this.g.b.p(k14Var);
    }

    @Override // defpackage.qu0
    public final q44 q(vu0 vu0Var, ko5 ko5Var, q44 q44Var) {
        return this.g.b.q(vu0Var, ko5Var, q44Var);
    }

    @Override // defpackage.qu0
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.qu0
    public final void s(kd2 kd2Var) {
        this.e.a(kd2Var);
    }

    @Override // defpackage.qu0
    public final void t(zz4 zz4Var) {
        this.g.b.t(zz4Var);
    }

    @Override // defpackage.qu0
    public final void u(vu0 vu0Var) {
        this.g.b.u(vu0Var);
    }

    @Override // defpackage.qu0
    public final sg0 v(vt0 vt0Var) {
        return this.g.b.v(vt0Var);
    }

    @Override // defpackage.qu0
    public final void w() {
        this.g.A++;
    }

    @Override // defpackage.qu0
    public final void x(kd2 kd2Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                kd2Var.getClass();
                set.remove(kd2Var.z());
            }
        }
        if (kd2Var != null) {
            this.e.l(kd2Var);
        }
    }

    @Override // defpackage.qu0
    public final void y(vu0 vu0Var) {
        this.g.b.y(vu0Var);
    }

    public final void z() {
        q44 q44Var = this.e;
        if (q44Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = q44Var.b;
                long[] jArr = q44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    kd2 kd2Var = (kd2) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(kd2Var.z());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            q44Var.b();
        }
    }
}
