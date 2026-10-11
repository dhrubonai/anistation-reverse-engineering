package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hd6 {
    public final ti4 a = xt5.g(null);
    public ko b;
    public final zt5 c;

    public hd6(ko koVar) {
        ka6 ka6Var = new ka6((byte) 10);
        koVar.getClass();
        io ioVar = new io(koVar);
        ArrayList arrayList = ioVar.z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) ka6Var.invoke(((ho) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                jo joVar = (jo) list.get(i2);
                arrayList3.add(new ho(joVar.a, joVar.b, joVar.c, joVar.d));
            }
            dp0.Y(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = ioVar.e();
        this.c = new zt5();
    }

    public static jo c(jo joVar, bd6 bd6Var) {
        int c = bd6Var.b.c(r4.f - 1, false);
        if (joVar.b >= c) {
            return null;
        }
        return jo.a(joVar, null, 0, Math.min(joVar.c, c), 11);
    }

    public final void a(int i, kd2 kd2Var) {
        int i2;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        Object obj;
        boolean z4;
        boolean z5;
        boolean z6;
        pv5 pv5Var;
        pv5 pv5Var2;
        pv5 pv5Var3;
        kd2Var.f0(1154651354);
        char c2 = 2;
        if (kd2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z7 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            wf wfVar = (wf) kd2Var.j(bv0.s);
            ko koVar = this.b;
            List a = koVar.a(koVar.y.length());
            int size = a.size();
            int i4 = 0;
            while (i4 < size) {
                jo joVar = (jo) a.get(i4);
                int i5 = joVar.b;
                Object obj2 = joVar.a;
                if (i5 != joVar.c) {
                    kd2Var.e0(725478935);
                    Object Q = kd2Var.Q();
                    Object obj3 = au0.a;
                    Object obj4 = Q;
                    if (Q == obj3) {
                        Object u34Var = new u34();
                        kd2Var.n0(u34Var);
                        obj4 = u34Var;
                    }
                    u34 u34Var2 = (u34) obj4;
                    c = c2;
                    yz3 O = io3.O(vz3.x, new ll5((Object) this, (Object) joVar, (byte) 8));
                    Object Q2 = kd2Var.Q();
                    if (Q2 == obj3) {
                        z3 = true;
                        Object ka6Var = new ka6((byte) 11);
                        kd2Var.n0(ka6Var);
                        obj = ka6Var;
                    } else {
                        z3 = true;
                        obj = Q2;
                    }
                    yz3 H = bb4.H(rh5.a(O, z7, (ub2) obj).w(new od6(new fs0(this, joVar, (byte) 15))), u34Var2);
                    sq4.a.getClass();
                    yz3 G = kb0.G(H, kb0.m);
                    boolean h = kd2Var.h(this) | kd2Var.f(joVar) | kd2Var.h(wfVar);
                    Object Q3 = kd2Var.Q();
                    Object obj5 = Q3;
                    if (h || Q3 == obj3) {
                        Object lb5Var = new lb5(this, joVar, wfVar);
                        kd2Var.n0(lb5Var);
                        obj5 = lb5Var;
                    }
                    b90.a(q23.p(G, u34Var2, false, null, null, (sb2) obj5, 508), kd2Var, 0);
                    vh3 vh3Var = (vh3) obj2;
                    id6 a2 = vh3Var.a();
                    if (a2 == null || (a2.a == null && a2.b == null && a2.c == null && a2.d == null)) {
                        z2 = false;
                        kd2Var.e0(728331710);
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(726303039);
                        Object Q4 = kd2Var.Q();
                        Object obj6 = Q4;
                        if (Q4 == obj3) {
                            Object wh3Var = new wh3(u34Var2);
                            kd2Var.n0(wh3Var);
                            obj6 = wh3Var;
                        }
                        wh3 wh3Var2 = (wh3) obj6;
                        Object Q5 = kd2Var.Q();
                        pv5 pv5Var4 = null;
                        boolean z8 = false;
                        Object obj7 = Q5;
                        if (Q5 == obj3) {
                            Object fd6Var = new fd6(wh3Var2, z8 ? 1 : 0, (byte) 0);
                            kd2Var.n0(fd6Var);
                            obj7 = fd6Var;
                        }
                        db.f((ic2) obj7, kd2Var, pn6.a);
                        qi4 qi4Var = wh3Var2.b;
                        qi4 qi4Var2 = wh3Var2.b;
                        if ((qi4Var.h() & 2) != 0) {
                            z4 = z3;
                        } else {
                            z4 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z4);
                        if ((qi4Var2.h() & 1) != 0) {
                            z5 = z3;
                        } else {
                            z5 = false;
                        }
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        if ((qi4Var2.h() & 4) != 0) {
                            z6 = z3;
                        } else {
                            z6 = false;
                        }
                        Boolean valueOf3 = Boolean.valueOf(z6);
                        id6 a3 = vh3Var.a();
                        if (a3 != null) {
                            pv5Var = a3.a;
                        } else {
                            pv5Var = null;
                        }
                        id6 a4 = vh3Var.a();
                        if (a4 != null) {
                            pv5Var2 = a4.b;
                        } else {
                            pv5Var2 = null;
                        }
                        id6 a5 = vh3Var.a();
                        if (a5 != null) {
                            pv5Var3 = a5.c;
                        } else {
                            pv5Var3 = null;
                        }
                        id6 a6 = vh3Var.a();
                        if (a6 != null) {
                            pv5Var4 = a6.d;
                        }
                        Object[] objArr = {valueOf, valueOf2, valueOf3, pv5Var, pv5Var2, pv5Var3, pv5Var4};
                        boolean h2 = kd2Var.h(this) | kd2Var.f(joVar);
                        Object Q6 = kd2Var.Q();
                        Object obj8 = Q6;
                        if (h2 || Q6 == obj3) {
                            Object ll5Var = new ll5(this, joVar, wh3Var2);
                            kd2Var.n0(ll5Var);
                            obj8 = ll5Var;
                        }
                        b(objArr, (ub2) obj8, kd2Var, (i3 << 6) & 896);
                        z2 = false;
                        kd2Var.q(false);
                    }
                    kd2Var.q(z2);
                } else {
                    c = c2;
                    z2 = z7;
                    kd2Var.e0(728345598);
                    kd2Var.q(z2);
                }
                i4++;
                z7 = z2;
                c2 = c;
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new cu5(this, i, (byte) 7);
        }
    }

    public final void b(Object[] objArr, ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(-2083052099);
        if ((i & 48) == 0) {
            if (kd2Var.h(ub2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(this)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        kd2Var.c0(-358306546, Integer.valueOf(objArr.length));
        boolean z2 = false;
        if (kd2Var.d(objArr.length)) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i7 = i2 | i3;
        for (Object obj : objArr) {
            if (kd2Var.h(obj)) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            i7 |= i4;
        }
        kd2Var.q(false);
        if ((i7 & 14) == 0) {
            i7 |= 2;
        }
        byte b = 1;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(ub2Var);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean h = kd2Var.h(this);
            if ((i7 & 112) == 32) {
                z2 = true;
            }
            boolean z3 = h | z2;
            Object Q = kd2Var.Q();
            if (z3 || Q == au0.a) {
                Q = new w40(this, ub2Var, b);
                kd2Var.n0(Q);
            }
            db.e(array, (ub2) Q, kd2Var);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 15, i, (Object) this, (Object) objArr, (Object) ub2Var);
        }
    }
}
