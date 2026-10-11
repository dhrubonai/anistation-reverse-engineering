package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rp7 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ rp7(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[Catch: all -> 0x0028, RuntimeException -> 0x002c, TryCatch #1 {RuntimeException -> 0x002c, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x001f, B:12:0x004a, B:15:0x0051, B:19:0x0063, B:23:0x0070, B:27:0x002f, B:29:0x0036, B:31:0x0042), top: B:2:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.to7 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.y
            qx7 r0 = (defpackage.qx7) r0
            java.lang.Object r0 = r0.x
            r1 = r0
            gu7 r1 = (defpackage.gu7) r1
            es7 r0 = r1.C     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            defpackage.gu7.l(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            bs7 r0 = r0.K     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            java.lang.String r2 = "onActivityCreated"
            r0.a(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            android.content.Intent r0 = r9.z     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r0 == 0) goto L7e
            android.net.Uri r2 = r0.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r2 == 0) goto L2f
            boolean r3 = r2.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r3 != 0) goto L26
            goto L2f
        L26:
            r5 = r2
            goto L48
        L28:
            r0 = move-exception
            r8 = r0
            goto L94
        L2c:
            r0 = move-exception
            r8 = r0
            goto L87
        L2f:
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            r3 = 0
            if (r2 == 0) goto L47
            java.lang.String r4 = "com.android.vending.referral_url"
            java.lang.String r2 = r2.getString(r4)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r4 != 0) goto L47
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            goto L26
        L47:
            r5 = r3
        L48:
            if (r5 == 0) goto L7e
            boolean r2 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r2 != 0) goto L51
            goto L7e
        L51:
            i28 r2 = r1.F     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            defpackage.gu7.j(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            boolean r0 = defpackage.i28.N0(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r0 == 0) goto L60
            java.lang.String r0 = "gs"
        L5e:
            r6 = r0
            goto L63
        L60:
            java.lang.String r0 = "auto"
            goto L5e
        L63:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            if (r10 != 0) goto L6e
            r0 = 1
        L6c:
            r4 = r0
            goto L70
        L6e:
            r0 = 0
            goto L6c
        L70:
            au7 r0 = r1.D     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            defpackage.gu7.l(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            pw7 r2 = new pw7     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
            r0.U(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c
        L7e:
            py7 r8 = r1.I
            defpackage.gu7.k(r8)
            r8.S(r9, r10)
            return
        L87:
            es7 r0 = r1.C     // Catch: java.lang.Throwable -> L28
            defpackage.gu7.l(r0)     // Catch: java.lang.Throwable -> L28
            bs7 r0 = r0.C     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r0.b(r8, r2)     // Catch: java.lang.Throwable -> L28
            goto L7e
        L94:
            py7 r0 = r1.I
            defpackage.gu7.k(r0)
            r0.S(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp7.c(to7, android.os.Bundle):void");
    }

    public void d(to7 to7Var) {
        py7 py7Var = ((gu7) ((qx7) this.y).x).I;
        gu7.k(py7Var);
        synchronized (py7Var.I) {
            try {
                if (Objects.equals(py7Var.D, to7Var)) {
                    py7Var.D = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!((gu7) py7Var.x).A.a0()) {
            return;
        }
        py7Var.C.remove(Integer.valueOf(to7Var.x));
    }

    public void e(to7 to7Var) {
        gu7 gu7Var = (gu7) ((qx7) this.y).x;
        py7 py7Var = gu7Var.I;
        gu7.k(py7Var);
        synchronized (py7Var.I) {
            py7Var.H = false;
            py7Var.E = true;
        }
        gu7 gu7Var2 = (gu7) py7Var.x;
        gu7Var2.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!gu7Var2.A.a0()) {
            py7Var.z = null;
            au7 au7Var = gu7Var2.D;
            gu7.l(au7Var);
            au7Var.U(new jn7(py7Var, elapsedRealtime));
        } else {
            dy7 V = py7Var.V(to7Var);
            py7Var.A = py7Var.z;
            py7Var.z = null;
            au7 au7Var2 = gu7Var2.D;
            gu7.l(au7Var2);
            au7Var2.U(new iy7(py7Var, V, elapsedRealtime));
        }
        r08 r08Var = gu7Var.E;
        gu7.k(r08Var);
        gu7 gu7Var3 = (gu7) r08Var.x;
        gu7Var3.H.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        au7 au7Var3 = gu7Var3.D;
        gu7.l(au7Var3);
        au7Var3.U(new g08(r08Var, elapsedRealtime2, (byte) 1));
    }

    public void f(to7 to7Var) {
        gu7 gu7Var = (gu7) ((qx7) this.y).x;
        r08 r08Var = gu7Var.E;
        gu7.k(r08Var);
        gu7 gu7Var2 = (gu7) r08Var.x;
        gu7Var2.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        au7 au7Var = gu7Var2.D;
        gu7.l(au7Var);
        au7Var.U(new g08(r08Var, elapsedRealtime, (byte) 0));
        py7 py7Var = gu7Var.I;
        gu7.k(py7Var);
        Object obj = py7Var.I;
        synchronized (obj) {
            try {
                py7Var.H = true;
                if (!Objects.equals(to7Var, py7Var.D)) {
                    synchronized (obj) {
                        py7Var.D = to7Var;
                        py7Var.E = false;
                        gu7 gu7Var3 = (gu7) py7Var.x;
                        if (gu7Var3.A.a0()) {
                            py7Var.F = null;
                            au7 au7Var2 = gu7Var3.D;
                            gu7.l(au7Var2);
                            au7Var2.U(new hy7(py7Var, (byte) 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gu7 gu7Var4 = (gu7) py7Var.x;
        if (!gu7Var4.A.a0()) {
            py7Var.z = py7Var.F;
            au7 au7Var3 = gu7Var4.D;
            gu7.l(au7Var3);
            au7Var3.U(new hy7(py7Var, (byte) 0));
            return;
        }
        py7Var.T(to7Var.y, py7Var.V(to7Var), false);
        io7 io7Var = ((gu7) py7Var.x).K;
        gu7.i(io7Var);
        gu7 gu7Var5 = (gu7) io7Var.x;
        gu7Var5.H.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        au7 au7Var4 = gu7Var5.D;
        gu7.l(au7Var4);
        au7Var4.U(new jn7(io7Var, elapsedRealtime2));
    }

    public void g(to7 to7Var, Bundle bundle) {
        dy7 dy7Var;
        py7 py7Var = ((gu7) ((qx7) this.y).x).I;
        gu7.k(py7Var);
        if (((gu7) py7Var.x).A.a0() && bundle != null && (dy7Var = (dy7) py7Var.C.get(Integer.valueOf(to7Var.x))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", dy7Var.c);
            bundle2.putString(MediationMetaData.KEY_NAME, dy7Var.a);
            bundle2.putString("referrer_name", dy7Var.b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.x) {
            case 0:
                ((sp7) this.y).a(new xo7(this, bundle, activity));
                return;
            default:
                c(to7.c(activity), bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.x) {
            case 0:
                ((sp7) this.y).a(new mp7(this, activity, (byte) 4));
                return;
            default:
                d(to7.c(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.x) {
            case 0:
                ((sp7) this.y).a(new mp7(this, activity, (byte) 2));
                return;
            default:
                e(to7.c(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.x) {
            case 0:
                ((sp7) this.y).a(new mp7(this, activity, (byte) 1));
                return;
            default:
                f(to7.c(activity));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.x) {
            case 0:
                sn7 sn7Var = new sn7();
                ((sp7) this.y).a(new xo7(this, activity, sn7Var));
                Bundle b = sn7Var.b(50L);
                if (b != null) {
                    bundle.putAll(b);
                    return;
                }
                return;
            default:
                g(to7.c(activity), bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.x) {
            case 0:
                ((sp7) this.y).a(new mp7(this, activity, (byte) 0));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.x) {
            case 0:
                ((sp7) this.y).a(new mp7(this, activity, (byte) 3));
                return;
            default:
                return;
        }
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }
}
