package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ng5 implements lg0, dx6 {
    public static final /* synthetic */ long C = qs.a.objectFieldOffset(ng5.class.getDeclaredField("state$volatile"));
    public final l11 x;
    public Object z;
    private volatile /* synthetic */ Object state$volatile = qg5.a;
    public ArrayList y = new ArrayList(2);
    public int A = -1;
    public Object B = qg5.d;

    public ng5(l11 l11Var) {
        this.x = l11Var;
    }

    @Override // defpackage.lg0
    public final void a(Throwable th) {
        ng5 ng5Var;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == qg5.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = qs.a;
                ng5Var = this;
                if (unsafe2.compareAndSwapObject(ng5Var, C, objectVolatile, qg5.c)) {
                    ArrayList arrayList = ng5Var.y;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((lg5) obj).a();
                    }
                    ng5Var.B = qg5.d;
                    ng5Var.y = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(ng5Var, j) != objectVolatile) {
                    break;
                } else {
                    this = ng5Var;
                }
            }
            this = ng5Var;
        }
    }

    @Override // defpackage.dx6
    public final void b(ag5 ag5Var, int i) {
        this.z = ag5Var;
        this.A = i;
    }

    public final Object c(xz0 xz0Var) {
        Unsafe unsafe = qs.a;
        long j = C;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        lg5 lg5Var = (lg5) objectVolatile;
        Object obj = lg5Var.d;
        Object obj2 = this.B;
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                lg5 lg5Var2 = (lg5) obj3;
                if (lg5Var2 != lg5Var) {
                    lg5Var2.a();
                }
            }
            qs.a.putObjectVolatile(this, j, qg5.b);
            this.B = qg5.d;
            this.y = null;
        }
        Object invoke = lg5Var.c.invoke(lg5Var.a, obj, obj2);
        sc2 sc2Var = lg5Var.e;
        if (obj == qg5.e) {
            return ((ub2) sc2Var).invoke(xz0Var);
        }
        return ((ic2) sc2Var).invoke(invoke, xz0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        if (r13 == r8) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.xz0 r16) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng5.d(xz0):java.lang.Object");
    }

    public final lg5 e(Object obj) {
        ArrayList arrayList = this.y;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList.get(i);
            i++;
            if (((lg5) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        lg5 lg5Var = (lg5) obj2;
        if (lg5Var != null) {
            return lg5Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(zp2 zp2Var, ic2 ic2Var) {
        g(new lg5(this, zp2Var.x, (jc2) zp2Var.y, (jc2) zp2Var.z, null, (t36) ic2Var, (jc2) zp2Var.A), false);
    }

    public final void g(lg5 lg5Var, boolean z) {
        Object obj = lg5Var.a;
        Unsafe unsafe = qs.a;
        long j = C;
        if (unsafe.getObjectVolatile(this, j) instanceof lg5) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.y;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((lg5) obj2).a == obj) {
                        ov3.l(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        lg5Var.b.invoke(obj, this, lg5Var.d);
        if (this.B == qg5.d) {
            if (!z) {
                ArrayList arrayList2 = this.y;
                arrayList2.getClass();
                arrayList2.add(lg5Var);
            }
            lg5Var.g = this.z;
            lg5Var.h = this.A;
            this.z = null;
            this.A = -1;
            return;
        }
        qs.a.putObjectVolatile(this, j, lg5Var);
    }

    public final int h(Object obj, Object obj2) {
        ng5 ng5Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        jc2 jc2Var;
        while (true) {
            Unsafe unsafe3 = qs.a;
            long j = C;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof pg0) {
                lg5 e = this.e(obj);
                if (e != null) {
                    jc2 jc2Var2 = e.f;
                    if (jc2Var2 != null) {
                        jc2Var = (jc2) jc2Var2.invoke(this, e.d, obj2);
                    } else {
                        jc2Var = null;
                    }
                    while (true) {
                        Unsafe unsafe4 = qs.a;
                        ng5Var = this;
                        if (unsafe4.compareAndSwapObject(ng5Var, C, objectVolatile, e)) {
                            pg0 pg0Var = (pg0) objectVolatile;
                            ng5Var.B = obj2;
                            ni1 c = pg0Var.c(pn6.a, jc2Var);
                            if (c == null) {
                                ng5Var.B = qg5.d;
                                return 2;
                            }
                            pg0Var.k(c);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(ng5Var, j) != objectVolatile) {
                            break;
                        }
                        this = ng5Var;
                    }
                } else {
                    continue;
                }
            } else {
                ng5Var = this;
                if (!a34.i(objectVolatile, qg5.b) && !(objectVolatile instanceof lg5)) {
                    if (a34.i(objectVolatile, qg5.c)) {
                        return 2;
                    }
                    if (a34.i(objectVolatile, qg5.a)) {
                        List H = te4.H(obj);
                        do {
                            unsafe2 = qs.a;
                            if (unsafe2.compareAndSwapObject(ng5Var, C, objectVolatile, H)) {
                                return 1;
                            }
                        } while (unsafe2.getObjectVolatile(ng5Var, j) == objectVolatile);
                    } else if (objectVolatile instanceof List) {
                        ArrayList v0 = yo0.v0((Collection) objectVolatile, obj);
                        do {
                            unsafe = qs.a;
                            if (unsafe.compareAndSwapObject(ng5Var, C, objectVolatile, v0)) {
                                return 1;
                            }
                        } while (unsafe.getObjectVolatile(ng5Var, j) == objectVolatile);
                    } else {
                        v71.g(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                } else {
                    return 3;
                }
            }
            this = ng5Var;
        }
    }
}
