package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wa7 implements sh2, th2 {
    public final nh2 f;
    public final kp g;
    public final y23 h;
    public final int k;
    public final ib7 l;
    public boolean m;
    public final /* synthetic */ uh2 q;
    public final LinkedList e = new LinkedList();
    public final HashSet i = new HashSet();
    public final HashMap j = new HashMap();
    public final ArrayList n = new ArrayList();
    public hw0 o = null;
    public int p = 0;

    public wa7(uh2 uh2Var, ph2 ph2Var) {
        this.q = uh2Var;
        Looper looper = uh2Var.J.getLooper();
        st3 a = ph2Var.a();
        tp tpVar = new tp((ls) a.x, (String) a.y, (String) a.z);
        nh2 t = ((te4) ph2Var.d.y).t(ph2Var.a, looper, tpVar, ph2Var.e, this, this);
        i75 i75Var = ph2Var.c;
        if (i75Var != null && (t instanceof r30)) {
            t.u = i75Var;
        } else {
            String str = ph2Var.b;
            if (str != null && (t instanceof r30)) {
                t.t = str;
            }
        }
        this.f = t;
        this.g = ph2Var.f;
        this.h = new y23((byte) 26);
        this.k = ph2Var.h;
        if (t.u()) {
            Context context = uh2Var.B;
            h15 h15Var = uh2Var.J;
            st3 a2 = ph2Var.a();
            this.l = new ib7(context, h15Var, new tp((ls) a2.x, (String) a2.y, (String) a2.z));
            return;
        }
        this.l = null;
    }

    @Override // defpackage.th2
    public final void a(hw0 hw0Var) {
        n(hw0Var, null);
    }

    @Override // defpackage.sh2
    public final void b(int i) {
        uh2 uh2Var = this.q;
        if (Looper.myLooper() == uh2Var.J.getLooper()) {
            d(i);
        } else {
            uh2Var.J.post(new ag0((Object) this, i, (byte) 1));
        }
    }

    public final void c() {
        nh2 nh2Var = this.f;
        uh2 uh2Var = this.q;
        a34.r(uh2Var.J);
        this.o = null;
        k(hw0.C);
        if (this.m) {
            h15 h15Var = uh2Var.J;
            kp kpVar = this.g;
            h15Var.removeMessages(11, kpVar);
            uh2Var.J.removeMessages(9, kpVar);
            this.m = false;
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            hb7 hb7Var = ((gb7) it.next()).a;
            if (l(hb7Var.b) != null) {
                it.remove();
            } else {
                try {
                    hb7Var.e.a.accept(nh2Var, new p76());
                } catch (DeadObjectException unused) {
                    b(3);
                    nh2Var.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException e) {
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        f();
        j();
    }

    public final void d(int i) {
        a34.r(this.q.J);
        this.o = null;
        this.m = true;
        String str = this.f.a;
        y23 y23Var = this.h;
        y23Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        y23Var.d0(true, new Status(20, sb.toString(), null, null));
        kp kpVar = this.g;
        uh2 uh2Var = this.q;
        h15 h15Var = uh2Var.J;
        h15Var.sendMessageDelayed(Message.obtain(h15Var, 9, kpVar), 5000L);
        h15 h15Var2 = uh2Var.J;
        h15Var2.sendMessageDelayed(Message.obtain(h15Var2, 11, kpVar), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        SparseIntArray sparseIntArray = (SparseIntArray) uh2Var.D.y;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((gb7) it.next()).getClass();
        }
    }

    public final boolean e(hw0 hw0Var) {
        synchronized (uh2.N) {
            this.q.getClass();
        }
        return false;
    }

    public final void f() {
        LinkedList linkedList = this.e;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eb7 eb7Var = (eb7) arrayList.get(i);
            if (this.f.q()) {
                if (g(eb7Var)) {
                    linkedList.remove(eb7Var);
                }
            } else {
                return;
            }
        }
    }

    public final boolean g(eb7 eb7Var) {
        if (eb7Var == null) {
            y23 y23Var = this.h;
            nh2 nh2Var = this.f;
            eb7Var.e(y23Var, nh2Var.u());
            try {
                eb7Var.f(this);
                return true;
            } catch (DeadObjectException unused) {
                b(1);
                nh2Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        q12 l = l(eb7Var.a(this));
        if (l == null) {
            y23 y23Var2 = this.h;
            nh2 nh2Var2 = this.f;
            eb7Var.e(y23Var2, nh2Var2.u());
            try {
                eb7Var.f(this);
                return true;
            } catch (DeadObjectException unused2) {
                b(1);
                nh2Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f.getClass().getName();
        String str = l.x;
        long c = l.c();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(c).length() + 2);
        qx1.x(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(c);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        uh2 uh2Var = this.q;
        if (uh2Var.K && eb7Var.b(this)) {
            xa7 xa7Var = new xa7(this.g, l);
            ArrayList arrayList = this.n;
            int indexOf = arrayList.indexOf(xa7Var);
            if (indexOf >= 0) {
                xa7 xa7Var2 = (xa7) arrayList.get(indexOf);
                uh2Var.J.removeMessages(15, xa7Var2);
                uh2Var.J.sendMessageDelayed(Message.obtain(uh2Var.J, 15, xa7Var2), 5000L);
                return false;
            }
            arrayList.add(xa7Var);
            uh2Var.J.sendMessageDelayed(Message.obtain(uh2Var.J, 15, xa7Var), 5000L);
            uh2Var.J.sendMessageDelayed(Message.obtain(uh2Var.J, 16, xa7Var), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            hw0 hw0Var = new hw0(2, null, null);
            if (!e(hw0Var)) {
                if (uh2Var.f(hw0Var, this.k)) {
                    String str2 = l.x;
                    long c2 = l.c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 55 + String.valueOf(c2).length());
                    sb2.append("Notification displayed for missing feature: ");
                    sb2.append(str2);
                    sb2.append(", version: ");
                    sb2.append(c2);
                    Log.w("GoogleApiManager", sb2.toString());
                    return false;
                }
                return false;
            }
            String str3 = l.x;
            long c3 = l.c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 61 + String.valueOf(c3).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str3);
            sb3.append(", version: ");
            sb3.append(c3);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        eb7Var.d(new vo6(l));
        return true;
    }

    public final void h(Status status, Exception exc, boolean z) {
        boolean z2;
        a34.r(this.q.J);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                eb7 eb7Var = (eb7) it.next();
                if (!z || eb7Var.a == 2) {
                    if (status != null) {
                        eb7Var.c(status);
                    } else {
                        eb7Var.d(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        ze0.k("Status XOR exception should be null");
    }

    public final void i(Status status) {
        a34.r(this.q.J);
        h(status, null, false);
    }

    public final void j() {
        uh2 uh2Var = this.q;
        h15 h15Var = uh2Var.J;
        kp kpVar = this.g;
        h15Var.removeMessages(12, kpVar);
        h15 h15Var2 = uh2Var.J;
        h15Var2.sendMessageDelayed(h15Var2.obtainMessage(12, kpVar), uh2Var.x);
    }

    public final void k(hw0 hw0Var) {
        HashSet hashSet = this.i;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (bx7.q(hw0Var, hw0.C)) {
                    nh2 nh2Var = this.f;
                    if (!nh2Var.q() || nh2Var.b == null) {
                        v71.i("Failed to connect when checking package");
                        return;
                    }
                }
                throw null;
            }
            ov3.d();
            return;
        }
        hashSet.clear();
    }

    public final q12 l(q12[] q12VarArr) {
        q12[] q12VarArr2;
        if (q12VarArr != null && q12VarArr.length != 0) {
            jv7 jv7Var = this.f.x;
            if (jv7Var == null) {
                q12VarArr2 = null;
            } else {
                q12VarArr2 = jv7Var.y;
            }
            if (q12VarArr2 == null) {
                q12VarArr2 = new q12[0];
            }
            so5 so5Var = new so5(q12VarArr2.length);
            for (q12 q12Var : q12VarArr2) {
                so5Var.put(q12Var.x, Long.valueOf(q12Var.c()));
            }
            for (q12 q12Var2 : q12VarArr) {
                Long l = (Long) so5Var.get(q12Var2.x);
                if (l == null || l.longValue() < q12Var2.c()) {
                    return q12Var2;
                }
            }
        }
        return null;
    }

    public final void m(hw0 hw0Var) {
        a34.r(this.q.J);
        nh2 nh2Var = this.f;
        String name = nh2Var.getClass().getName();
        String valueOf = String.valueOf(hw0Var);
        nh2 nh2Var2 = nh2Var;
        nh2Var2.d(h11.l(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
        n(hw0Var, null);
    }

    public final void n(hw0 hw0Var, RuntimeException runtimeException) {
        mo5 mo5Var;
        uh2 uh2Var = this.q;
        a34.r(uh2Var.J);
        ib7 ib7Var = this.l;
        if (ib7Var != null && (mo5Var = ib7Var.k) != null) {
            mo5Var.c();
        }
        a34.r(this.q.J);
        this.o = null;
        SparseIntArray sparseIntArray = (SparseIntArray) uh2Var.D.y;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        k(hw0Var);
        if ((this.f instanceof xb7) && hw0Var.y != 24) {
            uh2Var.y = true;
            h15 h15Var = uh2Var.J;
            h15Var.sendMessageDelayed(h15Var.obtainMessage(19), 300000L);
        }
        int i = hw0Var.y;
        if (i == 4) {
            i(uh2.M);
            return;
        }
        if (i == 25) {
            i(uh2.c(this.g, hw0Var));
            return;
        }
        LinkedList linkedList = this.e;
        if (linkedList.isEmpty()) {
            this.o = hw0Var;
            return;
        }
        if (runtimeException != null) {
            a34.r(uh2Var.J);
            h(null, runtimeException, false);
            return;
        }
        boolean z = uh2Var.K;
        kp kpVar = this.g;
        if (z) {
            h(uh2.c(kpVar, hw0Var), null, true);
            if (!linkedList.isEmpty() && !e(hw0Var) && !uh2Var.f(hw0Var, this.k)) {
                if (hw0Var.y == 18) {
                    this.m = true;
                }
                if (this.m) {
                    h15 h15Var2 = uh2Var.J;
                    h15Var2.sendMessageDelayed(Message.obtain(h15Var2, 9, kpVar), 5000L);
                    return;
                } else {
                    i(uh2.c(kpVar, hw0Var));
                    return;
                }
            }
            return;
        }
        i(uh2.c(kpVar, hw0Var));
    }

    public final void o(eb7 eb7Var) {
        a34.r(this.q.J);
        boolean q = this.f.q();
        LinkedList linkedList = this.e;
        if (q) {
            if (g(eb7Var)) {
                j();
                return;
            } else {
                linkedList.add(eb7Var);
                return;
            }
        }
        linkedList.add(eb7Var);
        hw0 hw0Var = this.o;
        if (hw0Var != null && hw0Var.y != 0 && hw0Var.z != null) {
            n(hw0Var, null);
        } else {
            q();
        }
    }

    @Override // defpackage.sh2
    public final void onConnected() {
        uh2 uh2Var = this.q;
        if (Looper.myLooper() == uh2Var.J.getLooper()) {
            c();
        } else {
            uh2Var.J.post(new la((Object) this, (byte) 10));
        }
    }

    public final void p() {
        uh2 uh2Var = this.q;
        a34.r(uh2Var.J);
        Status status = uh2.L;
        i(status);
        this.h.d0(false, status);
        for (qi3 qi3Var : (qi3[]) this.j.keySet().toArray(new qi3[0])) {
            o(new nb7(qi3Var, new p76()));
        }
        k(new hw0(4, null, null));
        if (this.f.q()) {
            uh2Var.J.post(new la((Object) new eo3((Object) this, (byte) 29), (byte) 11));
        }
    }

    public final void q() {
        uh2 uh2Var = this.q;
        a34.r(uh2Var.J);
        nh2 nh2Var = this.f;
        if (!nh2Var.q()) {
            nh2 nh2Var2 = nh2Var;
            if (!nh2Var2.r()) {
                try {
                    int b = uh2Var.D.b(uh2Var.B, nh2Var);
                    if (b != 0) {
                        hw0 hw0Var = new hw0(b, null, null);
                        String name = nh2Var.getClass().getName();
                        String hw0Var2 = hw0Var.toString();
                        StringBuilder sb = new StringBuilder(name.length() + 35 + hw0Var2.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(hw0Var2);
                        Log.w("GoogleApiManager", sb.toString());
                        n(hw0Var, null);
                        return;
                    }
                    kh0 kh0Var = new kh0(uh2Var, nh2Var, this.g);
                    if (nh2Var.u()) {
                        ib7 ib7Var = this.l;
                        a34.x(ib7Var);
                        mo5 mo5Var = ib7Var.k;
                        if (mo5Var != null) {
                            mo5Var.c();
                        }
                        tp tpVar = ib7Var.j;
                        tpVar.D = Integer.valueOf(System.identityHashCode(ib7Var));
                        qa7 qa7Var = ib7Var.h;
                        Context context = ib7Var.f;
                        Handler handler = ib7Var.g;
                        ib7Var.k = (mo5) qa7Var.t(context, handler.getLooper(), tpVar, (no5) tpVar.C, ib7Var, ib7Var);
                        ib7Var.l = kh0Var;
                        Set set = ib7Var.i;
                        if (set != null && !set.isEmpty()) {
                            mo5 mo5Var2 = ib7Var.k;
                            mo5Var2.getClass();
                            mo5Var2.k = new cn7((r30) mo5Var2);
                            mo5Var2.x(2, null);
                        } else {
                            handler.post(new la(ib7Var));
                        }
                    }
                    try {
                        nh2Var2.k = kh0Var;
                        nh2Var2.x(2, null);
                    } catch (SecurityException e) {
                        n(new hw0(10, null, null), e);
                    }
                } catch (IllegalStateException e2) {
                    n(new hw0(10, null, null), e2);
                }
            }
        }
    }
}
