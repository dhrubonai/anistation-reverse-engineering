package defpackage;

import android.content.Intent;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i33 {
    public final v65 a;
    public final String[] b;
    public final ak6 c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final AtomicInteger f;
    public final co2 g;
    public final co2 h;
    public final af2 i;
    public Intent j;
    public l24 k;
    public final Object l;

    public i33(v65 v65Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = v65Var;
        this.b = strArr;
        ak6 ak6Var = new ak6(v65Var, linkedHashMap, linkedHashMap2, strArr, v65Var.getUseTempTrackingTable$room_runtime(), new d0(1, this, i33.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 14));
        this.c = ak6Var;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new AtomicInteger(0);
        this.g = new co2(this, (byte) 26);
        this.h = new co2(this, (byte) 27);
        this.i = new af2(v65Var);
        this.l = new Object();
        ak6Var.k = new vt0(this, (byte) 15);
    }

    public final boolean a(g33 g33Var) {
        oc4 oc4Var;
        LinkedHashMap linkedHashMap = this.d;
        String[] strArr = g33Var.a;
        ak6 ak6Var = this.c;
        ai4 j = ak6Var.j(strArr);
        String[] strArr2 = (String[]) j.x;
        int[] iArr = (int[]) j.y;
        oc4 oc4Var2 = new oc4(g33Var, iArr, strArr2);
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (linkedHashMap.containsKey(g33Var)) {
                oc4Var = (oc4) vn3.Q(g33Var, linkedHashMap);
            } else {
                oc4Var = (oc4) linkedHashMap.put(g33Var, oc4Var2);
            }
            reentrantLock.unlock();
            if (oc4Var == null && ((kc4) ak6Var.h).a(iArr)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final x65 b(String[] strArr, boolean z, ub2 ub2Var) {
        this.c.j(strArr);
        af2 af2Var = this.i;
        af2Var.getClass();
        return new x65((v65) af2Var.y, af2Var, z, strArr, ub2Var);
    }

    public final void c() {
        if (this.a.getCloseBarrier$room_runtime().d.get()) {
            return;
        }
        this.c.e(this.g, this.h);
    }

    public final void d(g33 g33Var) {
        g33Var.getClass();
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            oc4 oc4Var = (oc4) this.d.remove(g33Var);
            if (oc4Var != null) {
                int[] iArr = oc4Var.b;
                ak6 ak6Var = this.c;
                ak6Var.getClass();
                iArr.getClass();
                if (((kc4) ak6Var.h).b(iArr)) {
                    iv.L(new h33(this, null, (byte) 1));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object e(t36 t36Var) {
        jf7.K(this.a);
        Object h = this.c.h(t36Var);
        if (h == w11.x) {
            return h;
        }
        return pn6.a;
    }
}
