package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ub7 implements wk7, zd4, ke4, ec7 {
    public final /* synthetic */ byte x;
    public final Object y;

    public ub7() {
        this.x = (byte) 0;
        Object obj = qh2.c;
        this.y = new SparseIntArray();
    }

    @Override // defpackage.ec7
    public void a(Bitmap bitmap) {
        zk3 zk3Var = a58.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - r3) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, bitmap.getHeight() + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((a58) this.y).c(bitmap2, 0);
    }

    public int b(Context context, nh2 nh2Var) {
        int i;
        int i2;
        a34.x(context);
        a34.x(nh2Var);
        int j = nh2Var.j();
        SparseIntArray sparseIntArray = (SparseIntArray) this.y;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(j, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.y;
        synchronized (sparseIntArray2) {
            i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (i3 < sparseIntArray2.size()) {
                        int keyAt = sparseIntArray2.keyAt(i3);
                        if (keyAt > j && sparseIntArray2.get(keyAt) == 0) {
                            break;
                        }
                        i3++;
                    } else {
                        i2 = -1;
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i2 == -1) {
                i2 = qh2.d.b(context, j);
            }
            sparseIntArray2.put(j, i2);
        }
        return i2;
    }

    public void c() {
        long j;
        r08 r08Var = (r08) this.y;
        r08Var.L();
        gu7 gu7Var = (gu7) r08Var.x;
        bt7 bt7Var = gu7Var.B;
        gu7.j(bt7Var);
        gu7Var.H.getClass();
        if (bt7Var.U(System.currentTimeMillis())) {
            bt7 bt7Var2 = gu7Var.B;
            gu7.j(bt7Var2);
            bt7Var2.I.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.K.a("Detected application was in foreground");
                long currentTimeMillis = System.currentTimeMillis();
                if (gu7Var.A.W(null, tq7.e1)) {
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = 0;
                }
                f(currentTimeMillis, j);
            }
        }
    }

    public void d(String str, String str2, Bundle bundle) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 5:
                qx7 qx7Var = (qx7) obj;
                if (TextUtils.isEmpty(str)) {
                    qx7Var.P("auto", "_err", bundle);
                    return;
                } else {
                    ze0.m("Unexpected call on client side");
                    return;
                }
            default:
                z18 z18Var = (z18) obj;
                if (TextUtils.isEmpty(str)) {
                    gu7 gu7Var = z18Var.I;
                    if (gu7Var != null) {
                        es7 es7Var = gu7Var.C;
                        gu7.l(es7Var);
                        es7Var.C.b(str2, "AppId not known when logging event");
                        return;
                    }
                    return;
                }
                z18Var.f().U(new w47((byte) 11, this, str, str2, bundle, false));
                return;
        }
    }

    public void e(long j, long j2) {
        r08 r08Var = (r08) this.y;
        r08Var.L();
        r08Var.P();
        gu7 gu7Var = (gu7) r08Var.x;
        bt7 bt7Var = gu7Var.B;
        gu7.j(bt7Var);
        if (bt7Var.U(j)) {
            gu7.j(bt7Var);
            bt7Var.I.b(true);
            gu7Var.p().Q();
        }
        gu7.j(bt7Var);
        bt7Var.M.h(j);
        if (bt7Var.I.a()) {
            f(j, j2);
        }
    }

    public void f(long j, long j2) {
        r08 r08Var = (r08) this.y;
        r08Var.L();
        gu7 gu7Var = (gu7) r08Var.x;
        if (gu7Var.a()) {
            bt7 bt7Var = gu7Var.B;
            gu7.j(bt7Var);
            bt7Var.M.h(j);
            gu7Var.H.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.K.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long valueOf = Long.valueOf(j3);
            qx7 qx7Var = gu7Var.J;
            gu7.k(qx7Var);
            qx7Var.W(j, valueOf, "auto", "_sid");
            gu7.j(bt7Var);
            bt7Var.N.h(j3);
            bt7Var.I.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            gu7.k(qx7Var);
            qx7Var.T(j, j2, bundle, "auto", "_s");
            String g = bt7Var.S.g();
            if (!TextUtils.isEmpty(g)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", g);
                gu7.k(qx7Var);
                qx7Var.T(j, j2, bundle2, "auto", "_ssr");
            }
        }
    }

    public void g(int i, Object obj, xg7 xg7Var) {
        ef7 ef7Var = (ef7) this.y;
        qe7 qe7Var = (qe7) obj;
        ef7Var.d(i, 2);
        ef7Var.r(qe7Var.b(xg7Var));
        xg7Var.e(qe7Var, this);
    }

    @Override // defpackage.wk7
    public void m(String str, long j, long j2, long j3) {
        am7 am7Var = (am7) this.y;
        try {
            am7Var.e(new hl7(am7Var, new Status(2103, null, null, null)));
        } catch (IllegalStateException e) {
            zk3 zk3Var = s25.k;
            Log.e(zk3Var.a, zk3Var.c("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = am7Var.n.h.iterator();
        while (it.hasNext()) {
            ((r25) it.next()).p(str, j, 2103, j2, j3);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [ts3, java.lang.Object] */
    @Override // defpackage.zd4
    public void onComplete(Task task) {
        di0 di0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 3:
                dn7 dn7Var = (dn7) obj;
                boolean z5 = dn7Var.j;
                zk3 zk3Var = dn7.n;
                if (task.d()) {
                    Bundle bundle = (Bundle) task.c();
                    if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                        boolean z6 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        dn7Var.k = z6;
                        zk3Var.b("The module-to-client output switcher flag value is %b", Boolean.valueOf(z6));
                    }
                    if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK")) {
                        boolean z7 = bundle.getBoolean("com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK");
                        dn7Var.l = z7;
                        zk3Var.b("The module-to-client show system output switcher on cast icon click flag value is %b", Boolean.valueOf(z7));
                    }
                }
                boolean z8 = dn7Var.k;
                boolean z9 = dn7Var.l;
                if (dn7Var.f != null && (di0Var = dn7Var.g) != null) {
                    boolean z10 = di0Var.H;
                    boolean z11 = true;
                    if (z9 && di0Var.G) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z8 && di0Var.J) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ?? obj2 = new Object();
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    obj2.a = z3;
                    if (i >= 30) {
                        obj2.a = z2;
                    }
                    if (i >= 30) {
                        obj2.c = z10;
                    }
                    if (i >= 30) {
                        obj2.b = z;
                    }
                    boolean z12 = di0Var.O;
                    if (i >= 30) {
                        obj2.d = z12;
                    }
                    us3 us3Var = new us3(obj2);
                    rs3.b();
                    ff2 c = rs3.c();
                    us3 us3Var2 = c.u;
                    bf2 bf2Var = c.a;
                    c.u = us3Var;
                    boolean h = c.h();
                    bs3 bs3Var = c.r;
                    if (h) {
                        if (bs3Var == null) {
                            bs3 bs3Var2 = new bs3(c.g, new cn7(c));
                            c.r = bs3Var2;
                            c.a(bs3Var2, true);
                            c.l();
                        }
                        bs3 bs3Var3 = c.r;
                        boolean z13 = us3Var.d;
                        bs3Var3.M = z13;
                        bs3Var3.h();
                        ui3 ui3Var = c.c;
                        ui3Var.a = z13;
                        ((Handler) ui3Var.e).post((la) ui3Var.i);
                        if (us3Var2 != null && us3Var2.c) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 != us3Var.c) {
                            bs3 bs3Var4 = c.r;
                            bs3Var4.B = c.A;
                            if (!bs3Var4.C) {
                                bs3Var4.C = true;
                                bs3Var4.z.sendEmptyMessage(2);
                            }
                        }
                    } else if (bs3Var != null) {
                        ps3 d = c.d(bs3Var);
                        if (d != null) {
                            rs3.b();
                            bs3Var.A = null;
                            bs3Var.g(null);
                            c.n(d, null);
                            bf2Var.b(514, d);
                            c.l.remove(d);
                        }
                        c.r = null;
                        ui3 ui3Var2 = c.c;
                        ((Handler) ui3Var2.e).post((la) ui3Var2.i);
                    }
                    bf2Var.b(769, us3Var);
                    Log.i(zk3Var.a, zk3Var.c("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(z5), Boolean.valueOf(z2), Boolean.valueOf(z10), Boolean.valueOf(z)));
                    qn7 qn7Var = dn7Var.i;
                    if (qn7Var != null) {
                        if (!z5 || !z2) {
                            z11 = false;
                        }
                        qn7Var.e = z11;
                    }
                    if (z5 && z2) {
                        a48.a(f28.CAST_OUTPUT_SWITCHER_ENABLED);
                    }
                    if (z10) {
                        a48.a(f28.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((gi0) ((jm7) obj).g).f("launchApplication", task);
                return;
        }
    }

    @Override // defpackage.ke4
    public void onSuccess(Object obj) {
        pq7 pq7Var = (pq7) obj;
        zk3 zk3Var = un7.d;
        boolean z = false;
        if (pq7Var != null) {
            fr7 fr7Var = pq7Var.a.x;
            a34.x(fr7Var);
            if (fr7Var.x == 1) {
                z = true;
            }
        }
        ((p76) this.y).d(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[LOOP:0: B:8:0x0032->B:10:0x0038, LOOP_END] */
    @Override // defpackage.wk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(java.lang.String r13, long r14, int r16, java.lang.Object r17, long r18, long r20) {
        /*
            r12 = this;
            java.lang.Object r12 = r12.y
            am7 r12 = (defpackage.am7) r12
            hl7 r0 = new hl7     // Catch: java.lang.IllegalStateException -> L17
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch: java.lang.IllegalStateException -> L17
            r2 = 0
            r7 = r16
            r1.<init>(r7, r2, r2, r2)     // Catch: java.lang.IllegalStateException -> L15
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L15
            r12.e(r0)     // Catch: java.lang.IllegalStateException -> L15
            goto L2a
        L15:
            r0 = move-exception
            goto L1a
        L17:
            r0 = move-exception
            r7 = r16
        L1a:
            zk3 r1 = defpackage.s25.k
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r1.a
            java.lang.String r4 = "Result already set when calling onRequestCompleted"
            java.lang.String r1 = r1.c(r4, r2)
            android.util.Log.e(r3, r1, r0)
        L2a:
            s25 r12 = r12.n
            java.util.concurrent.CopyOnWriteArrayList r12 = r12.h
            java.util.Iterator r12 = r12.iterator()
        L32:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r12.next()
            r3 = r0
            r25 r3 = (defpackage.r25) r3
            r4 = r13
            r5 = r14
            r8 = r18
            r10 = r20
            r3.p(r4, r5, r7, r8, r10)
            r7 = r16
            goto L32
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub7.x(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    public ub7(ef7 ef7Var) {
        this.x = (byte) 1;
        this.y = ef7Var;
        ef7Var.a = this;
    }

    public /* synthetic */ ub7(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }
}
