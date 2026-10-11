package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ii6 {
    public static final long z;
    public final Context a;
    public final bi6 b;
    public final nw2 c;
    public final nw2 d;
    public final nw2 e;
    public final boolean f;
    public final long g;
    public final ui3 h;
    public final ys i;
    public final i18 j;
    public final fc1 k;
    public final j81 l;
    public final cn7 m;
    public final Looper n;
    public final k46 o;
    public final eo3 p = new eo3((Object) this, (byte) 22);
    public final t91 q;
    public pz1 r;
    public boolean s;
    public ou0 t;
    public ou0 u;
    public String v;
    public String w;
    public ur1 x;
    public cs1 y;

    static {
        long j;
        cr3.a("media3.transformer");
        if (eq6.Q()) {
            j = 25000;
        } else {
            j = 10000;
        }
        z = j;
    }

    public ii6(Context context, bi6 bi6Var, nw2 nw2Var, nw2 nw2Var2, nw2 nw2Var3, boolean z2, long j, ui3 ui3Var, ys ysVar, i18 i18Var, fc1 fc1Var, j81 j81Var, cn7 cn7Var, Looper looper, t91 t91Var) {
        this.a = context;
        this.b = bi6Var;
        this.c = nw2Var;
        this.d = nw2Var2;
        this.e = nw2Var3;
        this.f = z2;
        this.g = j;
        this.h = ui3Var;
        this.i = ysVar;
        this.j = i18Var;
        this.k = fc1Var;
        this.l = j81Var;
        this.m = cn7Var;
        this.n = looper;
        this.q = t91Var;
        this.o = new k46(new Handler(looper, null));
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 35 && this.f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mm5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [mm5, java.lang.Object] */
    public final void b() {
        int a;
        i();
        pz1 pz1Var = this.r;
        if (pz1Var == null) {
            d();
            return;
        }
        int i = -1;
        try {
            pz1Var.cancel();
        } finally {
            ?? obj = new Object();
            i();
            pz1 pz1Var2 = this.r;
            if (pz1Var2 == 0) {
                a = 0;
            } else {
                a = pz1Var2.a(obj);
            }
            if (a()) {
                if (a == 2) {
                    i = obj.x;
                }
                if (this.x == null) {
                    f();
                }
                ur1 ur1Var = this.x;
                ur1Var.getClass();
                ur1Var.e(i);
            }
            this.r = null;
            this.s = false;
            d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cs1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [ew2, yw2] */
    /* JADX WARN: Type inference failed for: r5v9, types: [ew2, yw2] */
    public final void c(ou0 ou0Var, String str) {
        rr1 rr1Var;
        long j = this.g;
        byte b = 1;
        if (j != -9223372036854775807L) {
            xv3 xv3Var = new xv3(this, (byte) 14);
            ?? obj = new Object();
            obj.a = j;
            obj.b = xv3Var;
            String str2 = eq6.a;
            obj.c = Executors.newSingleThreadScheduledExecutor(new fv0("WatchdogTimer", (byte) 1));
            this.y = obj;
            obj.d = ((ScheduledExecutorService) obj.c).schedule(new ct6(xv3Var, (byte) 1), j, TimeUnit.MILLISECONDS);
        }
        this.u = ou0Var;
        ArrayList arrayList = new ArrayList();
        z62 listIterator = ou0Var.b.listIterator(0);
        while (listIterator.hasNext()) {
            rr1 rr1Var2 = (rr1) listIterator.next();
            ArrayList arrayList2 = new ArrayList();
            z62 listIterator2 = rr1Var2.a.listIterator(0);
            while (listIterator2.hasNext()) {
                qr1 qr1Var = (qr1) listIterator2.next();
                io3.B(qr1Var.h.isEmpty());
                pr1 a = qr1Var.a();
                a.h = nw2.o(nw2.s(new ag6(b)));
                arrayList2.add(new qr1(a));
            }
            io3.n(!arrayList2.isEmpty());
            zw2 zw2Var = rr1Var2.b;
            if (zw2Var.contains(-2)) {
                rt3 rt3Var = new rt3(arrayList2);
                boolean z2 = rr1Var2.c;
                io3.B(((zw2) rt3Var.z).contains(-2));
                if (z2) {
                    ?? ew2Var = new ew2(4);
                    ew2Var.g((zw2) rt3Var.z);
                    ew2Var.c(1);
                    rt3Var.z = ew2Var.h();
                } else {
                    zw2 zw2Var2 = (zw2) rt3Var.z;
                    int i = zw2.z;
                    oq5 oq5Var = new oq5(1);
                    io3.w(zw2Var2, "set1");
                    rt3Var.z = zw2.m(new al5(zw2Var2, oq5Var, (byte) 1));
                }
                boolean z3 = rr1Var2.d;
                io3.B(((zw2) rt3Var.z).contains(-2));
                if (z3) {
                    ?? ew2Var2 = new ew2(4);
                    ew2Var2.g((zw2) rt3Var.z);
                    ew2Var2.c(2);
                    rt3Var.z = ew2Var2.h();
                } else {
                    zw2 zw2Var3 = (zw2) rt3Var.z;
                    int i2 = zw2.z;
                    oq5 oq5Var2 = new oq5(2);
                    io3.w(zw2Var3, "set1");
                    rt3Var.z = zw2.m(new al5(zw2Var3, oq5Var2, (byte) 1));
                }
                rr1Var = new rr1(rt3Var);
            } else {
                rt3 rt3Var2 = new rt3(zw2Var);
                ((jw2) rt3Var2.y).d(arrayList2);
                rr1Var = new rr1(rt3Var2);
            }
            arrayList.add(rr1Var);
        }
        ou0 b2 = ou0Var.b();
        b2.c(arrayList);
        this.t = b2.a();
        this.v = str;
    }

    public final void d() {
        cs1 cs1Var = this.y;
        if (cs1Var != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) cs1Var.d;
            scheduledFuture.getClass();
            scheduledFuture.cancel(false);
            ((ScheduledExecutorService) cs1Var.c).shutdownNow();
            this.y = null;
        }
    }

    public final void e(ou0 ou0Var, String str, String str2) {
        boolean z2;
        boolean b;
        i();
        if (this.r == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.A("There is already an export in progress.", z2);
        z62 listIterator = ou0Var.b.listIterator(0);
        loop0: while (true) {
            if (listIterator.hasNext()) {
                z62 listIterator2 = ((rr1) listIterator.next()).a.listIterator(0);
                while (listIterator2.hasNext()) {
                    qr1 qr1Var = (qr1) listIterator2.next();
                    qr1Var.getClass();
                    if (yu5.b(qr1Var.f)) {
                        b = true;
                        break loop0;
                    }
                }
            } else {
                b = yu5.b(ou0Var.d);
                break;
            }
        }
        io3.n(!b);
        c(ou0Var, str);
        this.w = str2;
        this.s = true;
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r6 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Type inference failed for: r2v0, types: [tr1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.media.metrics.LogSessionId f() {
        /*
            r12 = this;
            boolean r0 = r12.a()
            r1 = 0
            if (r0 == 0) goto La1
            t91 r0 = r12.q
            r0.getClass()
            tr1 r2 = new tr1
            android.content.Context r0 = r0.x
            r2.<init>()
            java.lang.String r3 = "media_metrics"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.media.metrics.MediaMetricsManager r0 = defpackage.sh1.f(r0)
            if (r0 == 0) goto L25
            android.media.metrics.EditingSession r0 = defpackage.a4.g(r0)
            r2.x = r0
        L25:
            android.media.metrics.EditingSession r0 = r2.x
            if (r0 == 0) goto L2d
            android.media.metrics.LogSessionId r1 = defpackage.a4.h(r0)
        L2d:
            java.lang.String r0 = defpackage.z91.y
            ou0 r3 = r12.t
            r3.getClass()
            xr1 r3 = r3.d
            nw2 r3 = r3.a
            boolean r3 = r3.isEmpty()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L56
            ou0 r3 = r12.t
            r3.getClass()
            nw2 r3 = r3.b
            dv r6 = new dv
            r7 = 5
            r6.<init>(r7)
            boolean r3 = defpackage.bx7.d(r3, r6)
            if (r3 == 0) goto L54
            goto L56
        L54:
            r3 = r4
            goto L57
        L56:
            r3 = r5
        L57:
            ou0 r6 = r12.t
            r6.getClass()
            xr1 r6 = r6.d
            nw2 r6 = r6.b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L99
            ou0 r6 = r12.t
            r6.getClass()
            nw2 r6 = r6.b
            java.util.Iterator r6 = r6.iterator()
            r7 = r4
        L72:
            boolean r8 = r6.hasNext()
            r9 = -1
            if (r8 == 0) goto L91
            java.lang.Object r8 = r6.next()
            rr1 r8 = (defpackage.rr1) r8
            o15 r8 = r8.a
            dv r10 = new dv
            r11 = 6
            r10.<init>(r11)
            boolean r8 = defpackage.bx7.d(r8, r10)
            if (r8 == 0) goto L8e
            goto L92
        L8e:
            int r7 = r7 + 1
            goto L72
        L91:
            r7 = r9
        L92:
            if (r7 == r9) goto L96
            r6 = r5
            goto L97
        L96:
            r6 = r4
        L97:
            if (r6 == 0) goto L9a
        L99:
            r4 = r5
        L9a:
            ur1 r5 = new ur1
            r5.<init>(r2, r0, r3, r4)
            r12.x = r5
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii6.f():android.media.metrics.LogSessionId");
    }

    public final void g(ar3 ar3Var, String str) {
        pr1 pr1Var = new pr1(ar3Var);
        boolean z2 = false;
        pr1Var.b = false;
        pr1Var.c = false;
        pr1Var.f = new xr1(this.c, this.d);
        qr1 qr1Var = new qr1(pr1Var);
        zw2 zw2Var = rr1.e;
        rt3 rt3Var = new rt3((byte) 19);
        ((jw2) rt3Var.y).c(qr1Var);
        ou0 a = new ou0(new rr1(rt3Var), new rr1[0]).a();
        i();
        if (this.r == null) {
            z2 = true;
        }
        io3.A("There is already an export in progress.", z2);
        c(a, str);
        h();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kz] */
    public final void h() {
        pz1 o81Var;
        this.t.getClass();
        LogSessionId f = f();
        this.u.getClass();
        ?? obj = new Object();
        obj.x = this.h;
        k46 k46Var = this.o;
        obj.y = k46Var;
        bi6 bi6Var = this.b;
        obj.z = bi6Var;
        obj.B = bi6Var;
        obj.A = new AtomicInteger();
        a61.b();
        boolean z2 = this.s;
        cn7 cn7Var = this.m;
        eo3 eo3Var = this.p;
        j81 j81Var = this.l;
        fc1 fc1Var = this.k;
        i18 i18Var = this.j;
        ys ysVar = this.i;
        Context context = this.a;
        if (z2) {
            ou0 ou0Var = this.t;
            ou0Var.getClass();
            String str = this.v;
            str.getClass();
            String str2 = this.w;
            str2.getClass();
            o81Var = new h55(context, ou0Var, bi6Var, ysVar, i18Var, fc1Var, j81Var, this.e, eo3Var, obj, k46Var, f, false, cn7Var, str, str2);
            this.r = o81Var;
        } else {
            ou0 ou0Var2 = this.t;
            ou0Var2.getClass();
            String str3 = this.v;
            str3.getClass();
            o81Var = new o81(context, ou0Var2, bi6Var, ysVar, i18Var, fc1Var, j81Var, this.e, eo3Var, obj, k46Var, f, false, cn7Var, str3);
            this.r = o81Var;
        }
        o81Var.start();
    }

    public final void i() {
        if (Looper.myLooper() == this.n) {
            return;
        }
        ze0.m("Transformer is accessed on the wrong thread.");
    }
}
