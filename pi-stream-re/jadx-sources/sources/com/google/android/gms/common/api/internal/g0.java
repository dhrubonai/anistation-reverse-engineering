package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g0 implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.g f2404b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2405c;

    /* renamed from: d, reason: collision with root package name */
    public final z f2406d;

    /* renamed from: g, reason: collision with root package name */
    public final int f2409g;

    /* renamed from: h, reason: collision with root package name */
    public final r0 f2410h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2411i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f2415m;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f2403a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f2407e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2408f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2412j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public b5.a f2413k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f2414l = 0;

    public g0(h hVar, com.google.android.gms.common.api.l lVar) {
        this.f2415m = hVar;
        com.google.android.gms.common.api.g zab = lVar.zab(hVar.E.getLooper(), this);
        this.f2404b = zab;
        this.f2405c = lVar.getApiKey();
        this.f2406d = new z();
        this.f2409g = lVar.zaa();
        if (zab.requiresSignIn()) {
            this.f2410h = lVar.zac(hVar.f2424e, hVar.E);
        } else {
            this.f2410h = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void a(int i10) {
        Looper myLooper = Looper.myLooper();
        h hVar = this.f2415m;
        if (myLooper == hVar.E.getLooper()) {
            i(i10);
        } else {
            hVar.E.post(new e0(this, i10, 0));
        }
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void b() {
        Looper myLooper = Looper.myLooper();
        h hVar = this.f2415m;
        if (myLooper == hVar.E.getLooper()) {
            h();
        } else {
            hVar.E.post(new q0(this, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void c(b5.a aVar) {
        p(aVar, null);
    }

    public final void d(b5.a aVar) {
        HashSet hashSet = this.f2407e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            a3.g.z(it.next());
            if (p7.a0.q(aVar, b5.a.f1505e)) {
                this.f2404b.getEndpointPackageName();
            }
            throw null;
        }
        hashSet.clear();
    }

    public final void e(Status status) {
        w7.b.l(this.f2415m.E);
        f(status, null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z9) {
        boolean z10;
        w7.b.l(this.f2415m.E);
        boolean z11 = false;
        if (status != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (runtimeException == null) {
            z11 = true;
        }
        if (z10 != z11) {
            Iterator it = this.f2403a.iterator();
            while (it.hasNext()) {
                b1 b1Var = (b1) it.next();
                if (!z9 || b1Var.f2384a == 2) {
                    if (status != null) {
                        b1Var.a(status);
                    } else {
                        b1Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void g() {
        LinkedList linkedList = this.f2403a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b1 b1Var = (b1) arrayList.get(i10);
            if (this.f2404b.isConnected()) {
                if (k(b1Var)) {
                    linkedList.remove(b1Var);
                }
            } else {
                return;
            }
        }
    }

    public final void h() {
        h hVar = this.f2415m;
        w7.b.l(hVar.E);
        this.f2413k = null;
        d(b5.a.f1505e);
        if (this.f2411i) {
            zaq zaqVar = hVar.E;
            a aVar = this.f2405c;
            zaqVar.removeMessages(11, aVar);
            hVar.E.removeMessages(9, aVar);
            this.f2411i = false;
        }
        Iterator it = this.f2408f.values().iterator();
        if (!it.hasNext()) {
            g();
            j();
        } else {
            a3.g.z(it.next());
            throw null;
        }
    }

    public final void i(int i10) {
        h hVar = this.f2415m;
        w7.b.l(hVar.E);
        this.f2413k = null;
        this.f2411i = true;
        String lastDisconnectMessage = this.f2404b.getLastDisconnectMessage();
        z zVar = this.f2406d;
        zVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        zVar.a(new Status(20, sb.toString()), true);
        zaq zaqVar = hVar.E;
        a aVar = this.f2405c;
        zaqVar.sendMessageDelayed(Message.obtain(zaqVar, 9, aVar), 5000L);
        zaq zaqVar2 = hVar.E;
        zaqVar2.sendMessageDelayed(Message.obtain(zaqVar2, 11, aVar), 120000L);
        ((SparseIntArray) hVar.f2426x.f12044b).clear();
        Iterator it = this.f2408f.values().iterator();
        if (!it.hasNext()) {
            return;
        }
        a3.g.z(it.next());
        throw null;
    }

    public final void j() {
        h hVar = this.f2415m;
        zaq zaqVar = hVar.E;
        a aVar = this.f2405c;
        zaqVar.removeMessages(12, aVar);
        zaq zaqVar2 = hVar.E;
        zaqVar2.sendMessageDelayed(zaqVar2.obtainMessage(12, aVar), hVar.f2420a);
    }

    public final boolean k(b1 b1Var) {
        b5.c cVar;
        if (!(b1Var instanceof m0)) {
            com.google.android.gms.common.api.g gVar = this.f2404b;
            b1Var.d(this.f2406d, gVar.requiresSignIn());
            try {
                b1Var.c(this);
            } catch (DeadObjectException unused) {
                a(1);
                gVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        m0 m0Var = (m0) b1Var;
        b5.c[] g10 = m0Var.g(this);
        if (g10 != null && g10.length != 0) {
            b5.c[] availableFeatures = this.f2404b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new b5.c[0];
            }
            n.e eVar = new n.e(availableFeatures.length);
            for (b5.c cVar2 : availableFeatures) {
                eVar.put(cVar2.f1513a, Long.valueOf(cVar2.d()));
            }
            int length = g10.length;
            for (int i10 = 0; i10 < length; i10++) {
                cVar = g10[i10];
                Long l10 = (Long) eVar.getOrDefault(cVar.f1513a, null);
                if (l10 == null || l10.longValue() < cVar.d()) {
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            com.google.android.gms.common.api.g gVar2 = this.f2404b;
            b1Var.d(this.f2406d, gVar2.requiresSignIn());
            try {
                b1Var.c(this);
            } catch (DeadObjectException unused2) {
                a(1);
                gVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.f2404b.getClass().getName();
        String str = cVar.f1513a;
        long d10 = cVar.d();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(d10);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (this.f2415m.F && m0Var.f(this)) {
            h0 h0Var = new h0(this.f2405c, cVar);
            int indexOf = this.f2412j.indexOf(h0Var);
            if (indexOf >= 0) {
                h0 h0Var2 = (h0) this.f2412j.get(indexOf);
                this.f2415m.E.removeMessages(15, h0Var2);
                zaq zaqVar = this.f2415m.E;
                Message obtain = Message.obtain(zaqVar, 15, h0Var2);
                this.f2415m.getClass();
                zaqVar.sendMessageDelayed(obtain, 5000L);
            } else {
                this.f2412j.add(h0Var);
                zaq zaqVar2 = this.f2415m.E;
                Message obtain2 = Message.obtain(zaqVar2, 15, h0Var);
                this.f2415m.getClass();
                zaqVar2.sendMessageDelayed(obtain2, 5000L);
                zaq zaqVar3 = this.f2415m.E;
                Message obtain3 = Message.obtain(zaqVar3, 16, h0Var);
                this.f2415m.getClass();
                zaqVar3.sendMessageDelayed(obtain3, 120000L);
                b5.a aVar = new b5.a(2, null);
                if (!l(aVar)) {
                    this.f2415m.d(aVar, this.f2409g);
                }
            }
            return false;
        }
        m0Var.b(new com.google.android.gms.common.api.w(cVar));
        return true;
    }

    public final boolean l(b5.a aVar) {
        int i10;
        synchronized (h.I) {
            h hVar = this.f2415m;
            boolean z9 = false;
            if (hVar.B == null || !hVar.C.contains(this.f2405c)) {
                return false;
            }
            a0 a0Var = this.f2415m.B;
            int i11 = this.f2409g;
            a0Var.getClass();
            c1 c1Var = new c1(aVar, i11);
            AtomicReference atomicReference = a0Var.f2374b;
            while (true) {
                i10 = 1;
                if (atomicReference.compareAndSet(null, c1Var)) {
                    z9 = true;
                    break;
                }
                if (atomicReference.get() != null) {
                    break;
                }
            }
            if (z9) {
                a0Var.f2375c.post(new t0(i10, a0Var, c1Var));
            }
            return true;
        }
    }

    public final boolean m(boolean z9) {
        boolean z10;
        w7.b.l(this.f2415m.E);
        com.google.android.gms.common.api.g gVar = this.f2404b;
        if (!gVar.isConnected() || this.f2408f.size() != 0) {
            return false;
        }
        z zVar = this.f2406d;
        if (((Map) zVar.f2484a).isEmpty() && ((Map) zVar.f2485b).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (z9) {
                j();
            }
            return false;
        }
        gVar.disconnect("Timing out service connection.");
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.gms.common.api.g, q5.c] */
    public final void n() {
        h hVar = this.f2415m;
        w7.b.l(hVar.E);
        com.google.android.gms.common.api.g gVar = this.f2404b;
        if (!gVar.isConnected() && !gVar.isConnecting()) {
            try {
                int M = hVar.f2426x.M(hVar.f2424e, gVar);
                if (M != 0) {
                    b5.a aVar = new b5.a(M, null);
                    String name = gVar.getClass().getName();
                    String aVar2 = aVar.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + aVar2.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(aVar2);
                    Log.w("GoogleApiManager", sb.toString());
                    p(aVar, null);
                    return;
                }
                i0 i0Var = new i0(hVar, gVar, this.f2405c);
                if (gVar.requiresSignIn()) {
                    r0 r0Var = this.f2410h;
                    w7.b.s(r0Var);
                    q5.c cVar = r0Var.f2462f;
                    if (cVar != null) {
                        cVar.disconnect();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(r0Var));
                    com.google.android.gms.common.internal.h hVar2 = r0Var.f2461e;
                    hVar2.f2528h = valueOf;
                    s4.g gVar2 = r0Var.f2459c;
                    Context context = r0Var.f2457a;
                    Handler handler = r0Var.f2458b;
                    r0Var.f2462f = gVar2.buildClient(context, handler.getLooper(), hVar2, (Object) hVar2.f2527g, (com.google.android.gms.common.api.m) r0Var, (com.google.android.gms.common.api.n) r0Var);
                    r0Var.f2463g = i0Var;
                    Set set = r0Var.f2460d;
                    if (set != null && !set.isEmpty()) {
                        r0Var.f2462f.b();
                    } else {
                        handler.post(new q0(r0Var, 0));
                    }
                }
                try {
                    gVar.connect(i0Var);
                } catch (SecurityException e10) {
                    p(new b5.a(10), e10);
                }
            } catch (IllegalStateException e11) {
                p(new b5.a(10), e11);
            }
        }
    }

    public final void o(b1 b1Var) {
        boolean z9;
        w7.b.l(this.f2415m.E);
        boolean isConnected = this.f2404b.isConnected();
        LinkedList linkedList = this.f2403a;
        if (isConnected) {
            if (k(b1Var)) {
                j();
                return;
            } else {
                linkedList.add(b1Var);
                return;
            }
        }
        linkedList.add(b1Var);
        b5.a aVar = this.f2413k;
        if (aVar != null) {
            if (aVar.f1507b != 0 && aVar.f1508c != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                p(aVar, null);
                return;
            }
        }
        n();
    }

    public final void p(b5.a aVar, RuntimeException runtimeException) {
        q5.c cVar;
        w7.b.l(this.f2415m.E);
        r0 r0Var = this.f2410h;
        if (r0Var != null && (cVar = r0Var.f2462f) != null) {
            cVar.disconnect();
        }
        w7.b.l(this.f2415m.E);
        this.f2413k = null;
        ((SparseIntArray) this.f2415m.f2426x.f12044b).clear();
        d(aVar);
        if ((this.f2404b instanceof d5.c) && aVar.f1507b != 24) {
            h hVar = this.f2415m;
            hVar.f2421b = true;
            zaq zaqVar = hVar.E;
            zaqVar.sendMessageDelayed(zaqVar.obtainMessage(19), 300000L);
        }
        if (aVar.f1507b == 4) {
            e(h.H);
            return;
        }
        if (this.f2403a.isEmpty()) {
            this.f2413k = aVar;
            return;
        }
        if (runtimeException != null) {
            w7.b.l(this.f2415m.E);
            f(null, runtimeException, false);
            return;
        }
        if (this.f2415m.F) {
            f(h.e(this.f2405c, aVar), null, true);
            if (!this.f2403a.isEmpty() && !l(aVar) && !this.f2415m.d(aVar, this.f2409g)) {
                if (aVar.f1507b == 18) {
                    this.f2411i = true;
                }
                if (this.f2411i) {
                    zaq zaqVar2 = this.f2415m.E;
                    Message obtain = Message.obtain(zaqVar2, 9, this.f2405c);
                    this.f2415m.getClass();
                    zaqVar2.sendMessageDelayed(obtain, 5000L);
                    return;
                }
                e(h.e(this.f2405c, aVar));
                return;
            }
            return;
        }
        e(h.e(this.f2405c, aVar));
    }

    public final void q() {
        w7.b.l(this.f2415m.E);
        Status status = h.G;
        e(status);
        z zVar = this.f2406d;
        zVar.getClass();
        zVar.a(status, false);
        for (m mVar : (m[]) this.f2408f.keySet().toArray(new m[0])) {
            o(new z0(new TaskCompletionSource()));
        }
        d(new b5.a(4));
        com.google.android.gms.common.api.g gVar = this.f2404b;
        if (gVar.isConnected()) {
            gVar.onUserSignOut(new f0(this));
        }
    }
}
