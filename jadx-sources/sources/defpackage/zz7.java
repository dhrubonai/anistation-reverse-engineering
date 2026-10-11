package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zz7 extends zq7 {
    public cr7 A;
    public volatile Boolean B;
    public final ez7 C;
    public ScheduledExecutorService D;
    public final d42 E;
    public final ArrayList F;
    public final ez7 G;
    public final vz7 z;

    public zz7(gu7 gu7Var) {
        super(gu7Var);
        this.F = new ArrayList();
        this.E = new d42(gu7Var.H);
        this.z = new vz7(this);
        this.C = new ez7(this, gu7Var, (byte) 0);
        this.G = new ez7(this, gu7Var, (byte) 1);
    }

    @Override // defpackage.zq7
    public final boolean O() {
        return false;
    }

    public final void P(AtomicReference atomicReference) {
        L();
        M();
        Z(new t35(this, atomicReference, b0(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.L()
            r7.M()
            im7 r4 = new im7
            r4.<init>(r8)
            r7.X()
            java.lang.Object r0 = r7.x
            gu7 r0 = (defpackage.gu7) r0
            ak7 r1 = r0.A
            r2 = 0
            sq7 r3 = defpackage.tq7.W0
            boolean r1 = r1.W(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            sr7 r0 = r0.m()
            java.lang.Object r1 = r0.x
            gu7 r1 = (defpackage.gu7) r1
            i28 r3 = r1.F
            es7 r1 = r1.C
            defpackage.gu7.j(r3)
            byte[] r3 = defpackage.i28.u0(r4)
            if (r3 != 0) goto L3f
            defpackage.gu7.l(r1)
            bs7 r0 = r1.D
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.a(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            defpackage.gu7.l(r1)
            bs7 r0 = r1.D
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.a(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.S(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            b48 r2 = r7.b0(r2)
            pw7 r0 = new pw7
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r1.Z(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz7.Q(android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [xr7, r30] */
    public final void R() {
        L();
        M();
        if (!c0()) {
            if (!S()) {
                gu7 gu7Var = (gu7) this.x;
                if (!gu7Var.A.O()) {
                    List<ResolveInfo> queryIntentServices = gu7Var.x.getPackageManager().queryIntentServices(new Intent().setClassName(gu7Var.x, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        Intent intent = new Intent("com.google.android.gms.measurement.START");
                        intent.setComponent(new ComponentName(gu7Var.x, "com.google.android.gms.measurement.AppMeasurementService"));
                        vz7 vz7Var = this.z;
                        zz7 zz7Var = vz7Var.z;
                        zz7Var.L();
                        Context context = ((gu7) zz7Var.x).x;
                        af2 g = af2.g();
                        synchronized (vz7Var) {
                            try {
                                boolean z = vz7Var.x;
                                zz7 zz7Var2 = vz7Var.z;
                                gu7 gu7Var2 = (gu7) zz7Var2.x;
                                if (z) {
                                    es7 es7Var = gu7Var2.C;
                                    gu7.l(es7Var);
                                    es7Var.K.a("Connection attempt already in progress");
                                    return;
                                } else {
                                    es7 es7Var2 = gu7Var2.C;
                                    gu7.l(es7Var2);
                                    es7Var2.K.a("Using local app measurement service");
                                    vz7Var.x = true;
                                    g.v(context, context.getClass().getName(), intent, zz7Var2.z, 129, null);
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                    es7 es7Var3 = gu7Var.C;
                    gu7.l(es7Var3);
                    es7Var3.C.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                return;
            }
            vz7 vz7Var2 = this.z;
            zz7 zz7Var3 = vz7Var2.z;
            zz7Var3.L();
            Context context2 = ((gu7) zz7Var3.x).x;
            synchronized (vz7Var2) {
                try {
                    if (vz7Var2.x) {
                        es7 es7Var4 = ((gu7) vz7Var2.z.x).C;
                        gu7.l(es7Var4);
                        es7Var4.K.a("Connection attempt already in progress");
                    } else {
                        if (vz7Var2.y != null && (vz7Var2.y.r() || vz7Var2.y.q())) {
                            es7 es7Var5 = ((gu7) vz7Var2.z.x).C;
                            gu7.l(es7Var5);
                            es7Var5.K.a("Already awaiting connection attempt");
                            return;
                        }
                        vz7Var2.y = new r30(context2, Looper.getMainLooper(), o28.a(context2), rh2.b, 93, vz7Var2, vz7Var2, null);
                        es7 es7Var6 = ((gu7) vz7Var2.z.x).C;
                        gu7.l(es7Var6);
                        es7Var6.K.a("Connecting to remote service");
                        vz7Var2.x = true;
                        a34.x(vz7Var2.y);
                        vz7Var2.y.a();
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz7.S():boolean");
    }

    public final void T() {
        L();
        M();
        vz7 vz7Var = this.z;
        if (vz7Var.y != null && (vz7Var.y.q() || vz7Var.y.r())) {
            vz7Var.y.c();
        }
        vz7Var.y = null;
        try {
            af2.g().u(((gu7) this.x).x, vz7Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.A = null;
    }

    public final boolean U() {
        L();
        M();
        if (S()) {
            i28 i28Var = ((gu7) this.x).F;
            gu7.j(i28Var);
            if (i28Var.w0() < ((Integer) tq7.J0.a(null)).intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean V() {
        L();
        M();
        if (S()) {
            i28 i28Var = ((gu7) this.x).F;
            gu7.j(i28Var);
            if (i28Var.w0() < 241200) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void W(ComponentName componentName) {
        L();
        if (this.A != null) {
            this.A = null;
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.K.b(componentName, "Disconnected from device MeasurementService");
            L();
            R();
        }
    }

    public final void X() {
        ((gu7) this.x).getClass();
    }

    public final void Y() {
        L();
        d42 d42Var = this.E;
        d42Var.getClass();
        d42Var.a = SystemClock.elapsedRealtime();
        ak7 ak7Var = ((gu7) this.x).A;
        this.C.b(((Long) tq7.Y.a(null)).longValue());
    }

    public final void Z(Runnable runnable) {
        L();
        if (c0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.F;
        long size = arrayList.size();
        gu7 gu7Var = (gu7) this.x;
        ak7 ak7Var = gu7Var.A;
        if (size >= 1000) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.G.b(60000L);
            R();
        }
    }

    public final void a0() {
        L();
        gu7 gu7Var = (gu7) this.x;
        es7 es7Var = gu7Var.C;
        gu7.l(es7Var);
        bs7 bs7Var = es7Var.K;
        ArrayList arrayList = this.F;
        bs7Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                es7 es7Var2 = gu7Var.C;
                gu7.l(es7Var2);
                es7Var2.C.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.G.c();
    }

    public final b48 b0(boolean z) {
        long abs;
        Pair pair;
        gu7 gu7Var = (gu7) this.x;
        gu7Var.getClass();
        nr7 p = gu7Var.p();
        String str = null;
        if (z) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            gu7 gu7Var2 = (gu7) es7Var.x;
            bt7 bt7Var = gu7Var2.B;
            gu7.j(bt7Var);
            if (bt7Var.B != null) {
                bt7 bt7Var2 = gu7Var2.B;
                gu7.j(bt7Var2);
                ok2 ok2Var = bt7Var2.B;
                bt7 bt7Var3 = (bt7) ok2Var.z;
                bt7Var3.L();
                bt7Var3.L();
                long j = ((bt7) ok2Var.z).P().getLong("health_monitor:start", 0L);
                if (j == 0) {
                    ok2Var.F();
                    abs = 0;
                } else {
                    ((gu7) bt7Var3.x).H.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = ok2Var.y;
                if (abs >= j2) {
                    if (abs > j2 + j2) {
                        ok2Var.F();
                    } else {
                        String string = bt7Var3.P().getString("health_monitor:value", null);
                        long j3 = bt7Var3.P().getLong("health_monitor:count", 0L);
                        ok2Var.F();
                        if (string != null && j3 > 0) {
                            pair = new Pair(string, Long.valueOf(j3));
                        } else {
                            pair = bt7.W;
                        }
                        if (pair != null && pair != bt7.W) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = qx1.q(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = qx1.q(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
                }
            }
        }
        return p.P(str);
    }

    public final boolean c0() {
        L();
        M();
        if (this.A != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x049b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x049b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0439 A[Catch: all -> 0x0475, TRY_ENTER, TryCatch #49 {all -> 0x0475, blocks: (B:196:0x0465, B:219:0x0439, B:221:0x043f, B:222:0x0442, B:210:0x0486, B:340:0x0370, B:344:0x037a, B:345:0x038b), top: B:195:0x0465 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x049b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02d4 A[Catch: all -> 0x01fc, SQLiteException -> 0x02ae, SQLiteDatabaseLockedException -> 0x02b3, SQLiteFullException -> 0x02b7, TryCatch #58 {all -> 0x01fc, blocks: (B:167:0x01d7, B:170:0x01eb, B:172:0x01f0, B:180:0x0214, B:181:0x0217, B:178:0x0210, B:229:0x021d, B:232:0x0231, B:234:0x0249, B:237:0x0252, B:238:0x0255, B:240:0x0243, B:243:0x0259, B:246:0x026d, B:248:0x0285, B:251:0x028f, B:252:0x0292, B:254:0x027f, B:264:0x0296, B:272:0x02aa, B:274:0x02d4, B:287:0x02de, B:288:0x02e1, B:285:0x02ce, B:259:0x02f0, B:261:0x02fb, B:337:0x035b), top: B:166:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0596 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0626  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(defpackage.cr7 r70, defpackage.y2 r71, defpackage.b48 r72) {
        /*
            Method dump skipped, instructions count: 1751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz7.d0(cr7, y2, b48):void");
    }

    public final void e0(yh7 yh7Var) {
        boolean S;
        L();
        M();
        gu7 gu7Var = (gu7) this.x;
        gu7Var.getClass();
        sr7 m = gu7Var.m();
        gu7 gu7Var2 = (gu7) m.x;
        gu7.j(gu7Var2.F);
        byte[] u0 = i28.u0(yh7Var);
        if (u0.length > 131072) {
            es7 es7Var = gu7Var2.C;
            gu7.l(es7Var);
            es7Var.D.a("Conditional user property too long for local database. Sending directly to service");
            S = false;
        } else {
            S = m.S(2, u0);
        }
        Z(new xy7(this, b0(true), S, new yh7(yh7Var)));
    }
}
