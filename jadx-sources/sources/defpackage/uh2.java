package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uh2 implements Handler.Callback {
    public static final Status L = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status M = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object N = new Object();
    public static uh2 O;
    public wb7 A;
    public final Context B;
    public final qh2 C;
    public final ub7 D;
    public final AtomicInteger E;
    public final AtomicInteger F;
    public final ConcurrentHashMap G;
    public final ls H;
    public final ls I;
    public final h15 J;
    public volatile boolean K;
    public long x;
    public boolean y;
    public x76 z;

    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.Handler, h15] */
    public uh2(Context context, Looper looper) {
        qh2 qh2Var = qh2.d;
        this.x = 10000L;
        this.y = false;
        this.E = new AtomicInteger(1);
        this.F = new AtomicInteger(0);
        this.G = new ConcurrentHashMap(5, 0.75f, 1);
        this.H = new ls(0);
        this.I = new ls(0);
        this.K = true;
        this.B = context;
        ?? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.J = handler;
        this.C = qh2Var;
        this.D = new ub7();
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = h98.w;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            h98.w = bool;
        }
        if (bool.booleanValue()) {
            this.K = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status c(kp kpVar, hw0 hw0Var) {
        String str = (String) kpVar.b.z;
        String valueOf = String.valueOf(hw0Var);
        return new Status(17, h11.l(new StringBuilder(str.length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), hw0Var.z, hw0Var);
    }

    public static uh2 d(Context context) {
        uh2 uh2Var;
        HandlerThread handlerThread;
        synchronized (N) {
            uh2Var = O;
            if (uh2Var == null) {
                synchronized (o28.g) {
                    try {
                        handlerThread = o28.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            o28.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = o28.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = qh2.c;
                uh2 uh2Var2 = new uh2(applicationContext, looper);
                O = uh2Var2;
                uh2Var = uh2Var2;
            }
        }
        return uh2Var;
    }

    public final wa7 a(ph2 ph2Var) {
        kp kpVar = ph2Var.f;
        ConcurrentHashMap concurrentHashMap = this.G;
        wa7 wa7Var = (wa7) concurrentHashMap.get(kpVar);
        if (wa7Var == null) {
            wa7Var = new wa7(this, ph2Var);
            concurrentHashMap.put(kpVar, wa7Var);
        }
        if (wa7Var.f.u()) {
            this.I.add(kpVar);
        }
        wa7Var.q();
        return wa7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.p76 r10, int r11, defpackage.ph2 r12) {
        /*
            r9 = this;
            if (r11 == 0) goto L7e
            kp r3 = r12.f
            boolean r12 = r9.e()
            r8 = 1
            if (r12 != 0) goto Lc
            goto L46
        Lc:
            i75 r12 = defpackage.i75.n()
            java.lang.Object r12 = r12.y
            j75 r12 = (defpackage.j75) r12
            if (r12 == 0) goto L49
            boolean r0 = r12.y
            if (r0 == 0) goto L46
            boolean r12 = r12.z
            java.util.concurrent.ConcurrentHashMap r0 = r9.G
            java.lang.Object r0 = r0.get(r3)
            wa7 r0 = (defpackage.wa7) r0
            if (r0 == 0) goto L4a
            nh2 r1 = r0.f
            boolean r2 = r1 instanceof defpackage.r30
            if (r2 == 0) goto L46
            r30 r1 = (defpackage.r30) r1
            jv7 r2 = r1.x
            if (r2 == 0) goto L4a
            boolean r2 = r1.r()
            if (r2 != 0) goto L4a
            mw0 r12 = defpackage.ab7.a(r0, r1, r11)
            if (r12 == 0) goto L46
            int r1 = r0.p
            int r1 = r1 + r8
            r0.p = r1
            boolean r12 = r12.z
            goto L4a
        L46:
            r11 = 0
            r1 = r9
            goto L63
        L49:
            r12 = r8
        L4a:
            ab7 r0 = new ab7
            r1 = 0
            if (r12 == 0) goto L55
            long r4 = java.lang.System.currentTimeMillis()
            goto L56
        L55:
            r4 = r1
        L56:
            if (r12 == 0) goto L5c
            long r1 = android.os.SystemClock.elapsedRealtime()
        L5c:
            r6 = r1
            r1 = r9
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            r11 = r0
        L63:
            if (r11 == 0) goto L7e
            v78 r9 = r10.a
            h15 r10 = r1.J
            java.util.Objects.requireNonNull(r10)
            s35 r12 = new s35
            r12.<init>(r10, r8)
            os7 r10 = new os7
            r10.<init>(r12, r11)
            u98 r11 = r9.b
            r11.m(r10)
            r9.j()
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh2.b(p76, int, ph2):void");
    }

    public final boolean e() {
        int i;
        if (!this.y) {
            j75 j75Var = (j75) i75.n().y;
            if (j75Var == null || j75Var.y) {
                SparseIntArray sparseIntArray = (SparseIntArray) this.D.y;
                synchronized (sparseIntArray) {
                    i = sparseIntArray.get(203400000, -1);
                }
                if (i != -1 && i != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean f(hw0 hw0Var, int i) {
        boolean z;
        qh2 qh2Var = this.C;
        qh2Var.getClass();
        Context context = this.B;
        if (!n03.z(context)) {
            int i2 = hw0Var.y;
            PendingIntent pendingIntent = hw0Var.z;
            if (i2 != 0 && pendingIntent != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                pendingIntent = null;
                Intent a = qh2Var.a(i2, context, null);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.y;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                qh2Var.f(context, i2, PendingIntent.getActivity(context, 0, intent, tb7.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final void g(hw0 hw0Var, int i) {
        if (!f(hw0Var, i)) {
            h15 h15Var = this.J;
            h15Var.sendMessage(h15Var.obtainMessage(5, i, 0, hw0Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0313  */
    /* JADX WARN: Type inference failed for: r10v1, types: [ph2, wb7] */
    /* JADX WARN: Type inference failed for: r2v21, types: [ph2, wb7] */
    /* JADX WARN: Type inference failed for: r2v23, types: [ph2, wb7] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh2.handleMessage(android.os.Message):boolean");
    }
}
