package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l77 extends k77 {
    public static l77 k;
    public static l77 l;
    public static final Object m;
    public final Context a;
    public final pv0 b;
    public final WorkDatabase c;
    public final q76 d;
    public final List e;
    public final pu4 f;
    public final ju2 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final kh6 j;

    static {
        xk3.f("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public l77(Context context, final pv0 pv0Var, q76 q76Var, final WorkDatabase workDatabase, final List list, pu4 pu4Var, kh6 kh6Var) {
        Context applicationContext = context.getApplicationContext();
        vz0 vz0Var = null;
        if (!applicationContext.isDeviceProtectedStorage()) {
            xk3 xk3Var = new xk3(4);
            synchronized (xk3.b) {
                try {
                    if (xk3.c == null) {
                        xk3.c = xk3Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a = applicationContext;
            this.d = q76Var;
            this.c = workDatabase;
            this.f = pu4Var;
            this.j = kh6Var;
            this.b = pv0Var;
            this.e = list;
            o77 o77Var = (o77) q76Var;
            ke0 ke0Var = o77Var.c;
            this.g = new ju2(workDatabase);
            final ej5 ej5Var = o77Var.a;
            String str = wb5.a;
            pu4Var.a(new bx1() { // from class: vb5
                @Override // defpackage.bx1
                public final void b(i77 i77Var, boolean z) {
                    ej5Var.execute(new es3(workDatabase, i77Var, list, pv0Var, (byte) 7));
                }
            });
            o77Var.a.execute(new y92(applicationContext, this));
            String str2 = kn6.a;
            ke0Var.getClass();
            if (ou4.a(applicationContext, pv0Var)) {
                iv.G(new k52(sw0.m(zz.l(new g10(workDatabase.workSpecDao().hasUnfinishedWorkFlow(), new t36(4, null), (byte) 1), -1)), new fd6(applicationContext, vz0Var, (byte) 3), (byte) 2), ke0Var);
                return;
            }
            return;
        }
        ze0.m("Cannot initialize WorkManager in direct boot mode");
        throw null;
    }

    public static l77 b(Context context) {
        l77 l77Var;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    l77Var = k;
                    if (l77Var == null) {
                        l77Var = l;
                    }
                }
                return l77Var;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (l77Var != null) {
            return l77Var;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void c() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        m18 m18Var = this.b.f;
        og0 og0Var = new og0(this, (byte) 1);
        boolean a = qg6.a();
        if (a) {
            try {
                Trace.beginSection(it5.f("ReschedulingWork"));
            } finally {
                if (a) {
                    Trace.endSection();
                }
            }
        }
        og0Var.invoke();
    }
}
