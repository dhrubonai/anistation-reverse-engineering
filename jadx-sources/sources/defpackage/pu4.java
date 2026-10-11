package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pu4 {
    public static final String l = xk3.f("Processor");
    public final Context b;
    public final pv0 c;
    public final o77 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public pu4(Context context, pv0 pv0Var, o77 o77Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = pv0Var;
        this.d = o77Var;
        this.e = workDatabase;
    }

    public static boolean d(String str, v87 v87Var, int i) {
        String str2 = l;
        if (v87Var != null) {
            v87Var.m.s(new m87(i));
            xk3 d = xk3.d();
            StringBuilder n = h11.n("WorkerWrapper interrupted for ", str, " (");
            n.append(v87Var.a.c);
            n.append("), reason: ");
            n.append(i);
            d.a(str2, n.toString());
            return true;
        }
        xk3.d().a(str2, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(bx1 bx1Var) {
        synchronized (this.k) {
            this.j.add(bx1Var);
        }
    }

    public final v87 b(String str) {
        boolean z;
        v87 v87Var = (v87) this.f.remove(str);
        if (v87Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            v87Var = (v87) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = h46.G;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            xk3.d().c(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return v87Var;
    }

    public final v87 c(String str) {
        v87 v87Var = (v87) this.f.get(str);
        if (v87Var == null) {
            return (v87) this.g.get(str);
        }
        return v87Var;
    }

    public final void e(i77 i77Var) {
        this.d.e.execute(new f32((Object) this, (Object) i77Var, (byte) 23));
    }
}
