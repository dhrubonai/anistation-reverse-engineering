package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.common.zzd;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h implements Handler.Callback {
    public static final Status G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object I = new Object();
    public static h J;
    public final ConcurrentHashMap A;
    public a0 B;
    public final n.f C;
    public final n.f D;
    public final zaq E;
    public volatile boolean F;

    /* renamed from: a, reason: collision with root package name */
    public long f2420a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2421b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.u f2422c;

    /* renamed from: d, reason: collision with root package name */
    public d5.b f2423d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2424e;

    /* renamed from: f, reason: collision with root package name */
    public final b5.d f2425f;

    /* renamed from: x, reason: collision with root package name */
    public final z3.e f2426x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f2427y;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicInteger f2428z;

    public h(Context context, Looper looper) {
        boolean z9;
        b5.d dVar = b5.d.f1517d;
        this.f2420a = 10000L;
        this.f2421b = false;
        this.f2427y = new AtomicInteger(1);
        this.f2428z = new AtomicInteger(0);
        this.A = new ConcurrentHashMap(5, 0.75f, 1);
        this.B = null;
        this.C = new n.f(0);
        this.D = new n.f(0);
        this.F = true;
        this.f2424e = context;
        zaq zaqVar = new zaq(looper, this);
        this.E = zaqVar;
        this.f2425f = dVar;
        this.f2426x = new z3.e();
        PackageManager packageManager = context.getPackageManager();
        if (j5.a.f6150h == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                z9 = true;
            } else {
                z9 = false;
            }
            j5.a.f6150h = Boolean.valueOf(z9 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (j5.a.f6150h.booleanValue()) {
            this.F = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (I) {
            h hVar = J;
            if (hVar != null) {
                hVar.f2428z.incrementAndGet();
                zaq zaqVar = hVar.E;
                zaqVar.sendMessageAtFrontOfQueue(zaqVar.obtainMessage(10));
            }
        }
    }

    public static Status e(a aVar, b5.a aVar2) {
        String str = aVar.f2370b.f2368c;
        String valueOf = String.valueOf(aVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), aVar2.f1508c, aVar2);
    }

    public static h g(Context context) {
        h hVar;
        synchronized (I) {
            if (J == null) {
                Looper looper = com.google.android.gms.common.internal.l.a().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = b5.d.f1516c;
                J = new h(applicationContext, looper);
            }
            hVar = J;
        }
        return hVar;
    }

    public final void b(a0 a0Var) {
        synchronized (I) {
            if (this.B != a0Var) {
                this.B = a0Var;
                this.C.clear();
            }
            this.C.addAll(a0Var.f2377e);
        }
    }

    public final boolean c() {
        if (this.f2421b) {
            return false;
        }
        com.google.android.gms.common.internal.t tVar = com.google.android.gms.common.internal.s.a().f2594a;
        if (tVar != null && !tVar.f2596b) {
            return false;
        }
        int i10 = ((SparseIntArray) this.f2426x.f12044b).get(203400000, -1);
        if (i10 != -1 && i10 != 0) {
            return false;
        }
        return true;
    }

    public final boolean d(b5.a aVar, int i10) {
        PendingIntent pendingIntent;
        boolean z9;
        boolean booleanValue;
        boolean isInstantApp;
        boolean z10;
        PendingIntent pendingIntent2;
        Boolean bool;
        b5.d dVar = this.f2425f;
        Context context = this.f2424e;
        dVar.getClass();
        synchronized (j5.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = j5.a.f6143a;
            pendingIntent = null;
            if (context2 != null && (bool = j5.a.f6144b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            j5.a.f6144b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                j5.a.f6144b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    j5.a.f6144b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    j5.a.f6144b = Boolean.FALSE;
                }
            }
            j5.a.f6143a = applicationContext;
            booleanValue = j5.a.f6144b.booleanValue();
        }
        if (!booleanValue) {
            int i11 = aVar.f1507b;
            if (i11 != 0 && aVar.f1508c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                pendingIntent2 = aVar.f1508c;
            } else {
                Intent a10 = dVar.a(context, null, i11);
                if (a10 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a10, zzd.zza | 134217728);
                }
                pendingIntent2 = pendingIntent;
            }
            if (pendingIntent2 != null) {
                int i12 = aVar.f1507b;
                int i13 = GoogleApiActivity.f2352b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent2);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                dVar.g(context, i12, zal.zaa(context, 0, intent, zal.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    public final g0 f(com.google.android.gms.common.api.l lVar) {
        a apiKey = lVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.A;
        g0 g0Var = (g0) concurrentHashMap.get(apiKey);
        if (g0Var == null) {
            g0Var = new g0(this, lVar);
            concurrentHashMap.put(apiKey, g0Var);
        }
        if (g0Var.f2404b.requiresSignIn()) {
            this.D.add(apiKey);
        }
        g0Var.n();
        return g0Var;
    }

    public final void h(b5.a aVar, int i10) {
        if (!d(aVar, i10)) {
            zaq zaqVar = this.E;
            zaqVar.sendMessage(zaqVar.obtainMessage(5, i10, 0, aVar));
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        b5.c[] g10;
        boolean z9;
        int i10 = message.what;
        zaq zaqVar = this.E;
        ConcurrentHashMap concurrentHashMap = this.A;
        long j4 = 300000;
        g0 g0Var = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j4 = 10000;
                }
                this.f2420a = j4;
                zaqVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zaqVar.sendMessageDelayed(zaqVar.obtainMessage(12, (a) it.next()), this.f2420a);
                }
                return true;
            case 2:
                a3.g.z(message.obj);
                throw null;
            case 3:
                for (g0 g0Var2 : concurrentHashMap.values()) {
                    w7.b.l(g0Var2.f2415m.E);
                    g0Var2.f2413k = null;
                    g0Var2.n();
                }
                return true;
            case 4:
            case 8:
            case 13:
                p0 p0Var = (p0) message.obj;
                g0 g0Var3 = (g0) concurrentHashMap.get(p0Var.f2453c.getApiKey());
                if (g0Var3 == null) {
                    g0Var3 = f(p0Var.f2453c);
                }
                boolean requiresSignIn = g0Var3.f2404b.requiresSignIn();
                b1 b1Var = p0Var.f2451a;
                if (requiresSignIn && this.f2428z.get() != p0Var.f2452b) {
                    b1Var.a(G);
                    g0Var3.q();
                } else {
                    g0Var3.o(b1Var);
                }
                return true;
            case 5:
                int i11 = message.arg1;
                b5.a aVar = (b5.a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        g0 g0Var4 = (g0) it2.next();
                        if (g0Var4.f2409g == i11) {
                            g0Var = g0Var4;
                        }
                    }
                }
                if (g0Var != null) {
                    int i12 = aVar.f1507b;
                    if (i12 == 13) {
                        this.f2425f.getClass();
                        AtomicBoolean atomicBoolean = b5.g.f1521a;
                        String d10 = b5.a.d(i12);
                        int length = String.valueOf(d10).length();
                        String str = aVar.f1509d;
                        StringBuilder sb = new StringBuilder(length + 69 + String.valueOf(str).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(d10);
                        sb.append(": ");
                        sb.append(str);
                        g0Var.e(new Status(17, sb.toString()));
                    } else {
                        g0Var.e(e(g0Var.f2405c, aVar));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i11);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                Context context = this.f2424e;
                if (context.getApplicationContext() instanceof Application) {
                    c.a((Application) context.getApplicationContext());
                    c cVar = c.f2385e;
                    d0 d0Var = new d0(this);
                    cVar.getClass();
                    synchronized (cVar) {
                        cVar.f2388c.add(d0Var);
                    }
                    AtomicBoolean atomicBoolean2 = cVar.f2387b;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.f2386a.set(true);
                        }
                    }
                    if (!cVar.f2386a.get()) {
                        this.f2420a = 300000L;
                    }
                }
                return true;
            case zzaja.zze.zzg /* 7 */:
                f((com.google.android.gms.common.api.l) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    g0 g0Var5 = (g0) concurrentHashMap.get(message.obj);
                    w7.b.l(g0Var5.f2415m.E);
                    if (g0Var5.f2411i) {
                        g0Var5.n();
                    }
                }
                return true;
            case 10:
                n.f fVar = this.D;
                fVar.getClass();
                n.a aVar2 = new n.a(fVar);
                while (aVar2.hasNext()) {
                    g0 g0Var6 = (g0) concurrentHashMap.remove((a) aVar2.next());
                    if (g0Var6 != null) {
                        g0Var6.q();
                    }
                }
                fVar.clear();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    g0 g0Var7 = (g0) concurrentHashMap.get(message.obj);
                    h hVar = g0Var7.f2415m;
                    w7.b.l(hVar.E);
                    boolean z10 = g0Var7.f2411i;
                    if (z10) {
                        if (z10) {
                            h hVar2 = g0Var7.f2415m;
                            zaq zaqVar2 = hVar2.E;
                            a aVar3 = g0Var7.f2405c;
                            zaqVar2.removeMessages(11, aVar3);
                            hVar2.E.removeMessages(9, aVar3);
                            g0Var7.f2411i = false;
                        }
                        if (hVar.f2425f.b(hVar.f2424e) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        g0Var7.e(status);
                        g0Var7.f2404b.disconnect("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((g0) concurrentHashMap.get(message.obj)).m(true);
                }
                return true;
            case 14:
                b0 b0Var = (b0) message.obj;
                a aVar4 = b0Var.f2382a;
                boolean containsKey = concurrentHashMap.containsKey(aVar4);
                TaskCompletionSource taskCompletionSource = b0Var.f2383b;
                if (!containsKey) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                } else {
                    taskCompletionSource.setResult(Boolean.valueOf(((g0) concurrentHashMap.get(aVar4)).m(false)));
                }
                return true;
            case 15:
                h0 h0Var = (h0) message.obj;
                if (concurrentHashMap.containsKey(h0Var.f2429a)) {
                    g0 g0Var8 = (g0) concurrentHashMap.get(h0Var.f2429a);
                    if (g0Var8.f2412j.contains(h0Var) && !g0Var8.f2411i) {
                        if (!g0Var8.f2404b.isConnected()) {
                            g0Var8.n();
                        } else {
                            g0Var8.g();
                        }
                    }
                }
                return true;
            case 16:
                h0 h0Var2 = (h0) message.obj;
                if (concurrentHashMap.containsKey(h0Var2.f2429a)) {
                    g0 g0Var9 = (g0) concurrentHashMap.get(h0Var2.f2429a);
                    if (g0Var9.f2412j.remove(h0Var2)) {
                        h hVar3 = g0Var9.f2415m;
                        hVar3.E.removeMessages(15, h0Var2);
                        hVar3.E.removeMessages(16, h0Var2);
                        LinkedList linkedList = g0Var9.f2403a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            b5.c cVar2 = h0Var2.f2430b;
                            if (hasNext) {
                                b1 b1Var2 = (b1) it3.next();
                                if ((b1Var2 instanceof m0) && (g10 = ((m0) b1Var2).g(g0Var9)) != null) {
                                    int length2 = g10.length;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 < length2) {
                                            if (p7.a0.q(g10[i13], cVar2)) {
                                                if (i13 >= 0) {
                                                    z9 = true;
                                                }
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                    z9 = false;
                                    if (z9) {
                                        arrayList.add(b1Var2);
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i14 = 0; i14 < size; i14++) {
                                    b1 b1Var3 = (b1) arrayList.get(i14);
                                    linkedList.remove(b1Var3);
                                    b1Var3.b(new com.google.android.gms.common.api.w(cVar2));
                                }
                            }
                        }
                    }
                }
                return true;
            case 17:
                com.google.android.gms.common.internal.u uVar = this.f2422c;
                if (uVar != null) {
                    if (uVar.f2600a > 0 || c()) {
                        if (this.f2423d == null) {
                            this.f2423d = new d5.b(this.f2424e);
                        }
                        this.f2423d.c(uVar);
                    }
                    this.f2422c = null;
                }
                return true;
            case 18:
                o0 o0Var = (o0) message.obj;
                long j10 = o0Var.f2449c;
                com.google.android.gms.common.internal.q qVar = o0Var.f2447a;
                int i15 = o0Var.f2448b;
                if (j10 == 0) {
                    com.google.android.gms.common.internal.u uVar2 = new com.google.android.gms.common.internal.u(i15, Arrays.asList(qVar));
                    if (this.f2423d == null) {
                        this.f2423d = new d5.b(this.f2424e);
                    }
                    this.f2423d.c(uVar2);
                } else {
                    com.google.android.gms.common.internal.u uVar3 = this.f2422c;
                    if (uVar3 != null) {
                        List list = uVar3.f2601b;
                        if (uVar3.f2600a == i15 && (list == null || list.size() < o0Var.f2450d)) {
                            com.google.android.gms.common.internal.u uVar4 = this.f2422c;
                            if (uVar4.f2601b == null) {
                                uVar4.f2601b = new ArrayList();
                            }
                            uVar4.f2601b.add(qVar);
                        } else {
                            zaqVar.removeMessages(17);
                            com.google.android.gms.common.internal.u uVar5 = this.f2422c;
                            if (uVar5 != null) {
                                if (uVar5.f2600a > 0 || c()) {
                                    if (this.f2423d == null) {
                                        this.f2423d = new d5.b(this.f2424e);
                                    }
                                    this.f2423d.c(uVar5);
                                }
                                this.f2422c = null;
                            }
                        }
                    }
                    if (this.f2422c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(qVar);
                        this.f2422c = new com.google.android.gms.common.internal.u(i15, arrayList2);
                        zaqVar.sendMessageDelayed(zaqVar.obtainMessage(17), o0Var.f2449c);
                    }
                }
                return true;
            case 19:
                this.f2421b = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i10);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
