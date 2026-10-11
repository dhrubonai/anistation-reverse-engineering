package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class os0 implements ic2, jc2, kc2, lc2, mc2, nc2, oc2, pc2, tb2, vb2, xb2, yb2, zb2, ac2, bc2, cc2, dc2, fc2, gc2 {
    public zz4 A;
    public ArrayList B;
    public final int x;
    public final boolean y;
    public Object z;

    public os0(int i, boolean z, Object obj) {
        this.x = i;
        this.y = z;
        this.z = obj;
    }

    public final Object a(int i, kd2 kd2Var) {
        int q;
        kd2Var.f0(this.x);
        j(kd2Var);
        if (kd2Var.f(this)) {
            q = nx7.q(2, 0);
        } else {
            q = nx7.q(1, 0);
        }
        int i2 = i | q;
        Object obj = this.z;
        obj.getClass();
        wk6.j(2, obj);
        Object invoke = ((ic2) obj).invoke(kd2Var, Integer.valueOf(i2));
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ns0(2, this, os0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, (byte) 0);
        }
        return invoke;
    }

    public final Object b(Object obj, kd2 kd2Var, int i) {
        int q;
        kd2Var.f0(this.x);
        j(kd2Var);
        byte b = 1;
        if (kd2Var.f(this)) {
            q = nx7.q(2, 1);
        } else {
            q = nx7.q(1, 1);
        }
        Object obj2 = this.z;
        obj2.getClass();
        wk6.j(3, obj2);
        Object invoke = ((jc2) obj2).invoke(obj, kd2Var, Integer.valueOf(q | i));
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new mo(b, i, this, obj);
        }
        return invoke;
    }

    public final Object c(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, kd2 kd2Var, int i) {
        int q;
        kd2Var.f0(this.x);
        j(kd2Var);
        if (kd2Var.f(this)) {
            q = nx7.q(2, 6);
        } else {
            q = nx7.q(1, 6);
        }
        Object obj5 = this.z;
        obj5.getClass();
        wk6.j(8, obj5);
        Object f = ((oc2) obj5).f(obj, bool, obj2, obj3, obj4, kd2Var, Integer.valueOf(i | q));
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new p10(this, obj, bool, obj2, obj3, obj4, i);
        }
        return f;
    }

    public final Object d(Object obj, Object obj2, kd2 kd2Var, int i) {
        int q;
        kd2Var.f0(this.x);
        j(kd2Var);
        if (kd2Var.f(this)) {
            q = nx7.q(2, 2);
        } else {
            q = nx7.q(1, 2);
        }
        Object obj3 = this.z;
        obj3.getClass();
        wk6.j(4, obj3);
        Object e = ((kc2) obj3).e(obj, obj2, kd2Var, Integer.valueOf(q | i));
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je(this, obj, obj2, i);
        }
        return e;
    }

    @Override // defpackage.kc2
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (kd2) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.oc2
    public final /* bridge */ /* synthetic */ Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, kd2 kd2Var, Integer num) {
        return c(obj, bool, obj2, obj3, obj4, kd2Var, num.intValue());
    }

    @Override // defpackage.lc2
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h(obj, obj2, obj3, (kd2) obj4, ((Number) obj5).intValue());
    }

    public final Object h(Object obj, Object obj2, Object obj3, kd2 kd2Var, int i) {
        int q;
        kd2Var.f0(this.x);
        j(kd2Var);
        if (kd2Var.f(this)) {
            q = nx7.q(2, 3);
        } else {
            q = nx7.q(1, 3);
        }
        Object obj4 = this.z;
        obj4.getClass();
        wk6.j(5, obj4);
        Object g = ((lc2) obj4).g(obj, obj2, obj3, kd2Var, Integer.valueOf(q | i));
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new c50(this, obj, obj2, obj3, i);
        }
        return g;
    }

    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, kd2 kd2Var, int i) {
        int q;
        kd2Var.f0(this.x);
        j(kd2Var);
        if (kd2Var.f(this)) {
            q = nx7.q(2, 4);
        } else {
            q = nx7.q(1, 4);
        }
        Object obj5 = this.z;
        obj5.getClass();
        wk6.j(6, obj5);
        Object invoke = ((mc2) obj5).invoke(obj, obj2, obj3, obj4, kd2Var, Integer.valueOf(i | q));
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ms0(this, obj, obj2, obj3, obj4, i, (byte) 0);
        }
        return invoke;
    }

    @Override // defpackage.ic2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (kd2) obj);
    }

    public final void j(kd2 kd2Var) {
        zz4 B;
        if (this.y && (B = kd2Var.B()) != null) {
            B.b |= 1;
            zz4 zz4Var = this.A;
            if (zz4Var != null && zz4Var.a() && zz4Var != B && !a34.i(zz4Var.c, B.c)) {
                ArrayList arrayList = this.B;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.B = arrayList2;
                    arrayList2.add(B);
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zz4 zz4Var2 = (zz4) arrayList.get(i);
                    if (zz4Var2 == null || !zz4Var2.a() || zz4Var2 == B || a34.i(zz4Var2.c, B.c)) {
                        arrayList.set(i, B);
                        return;
                    }
                }
                arrayList.add(B);
                return;
            }
            this.A = B;
        }
    }

    @Override // defpackage.jc2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(obj, (kd2) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.mc2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return i(obj, obj2, obj3, obj4, (kd2) obj5, ((Number) obj6).intValue());
    }
}
