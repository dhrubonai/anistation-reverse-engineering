package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h46 implements ae4, bx1 {
    public static final String G = xk3.f("SystemFgDispatcher");
    public i77 A;
    public final LinkedHashMap B;
    public final HashMap C;
    public final HashMap D;
    public final eo3 E;
    public SystemForegroundService F;
    public final l77 x;
    public final q76 y;
    public final Object z = new Object();

    public h46(Context context) {
        l77 b = l77.b(context);
        this.x = b;
        this.y = b.d;
        this.A = null;
        this.B = new LinkedHashMap();
        this.D = new HashMap();
        this.C = new HashMap();
        this.E = new eo3(b.j);
        b.f.a(this);
    }

    public static Intent c(Context context, i77 i77Var, z92 z92Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", i77Var.a);
        intent.putExtra("KEY_GENERATION", i77Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", z92Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", z92Var.b);
        intent.putExtra("KEY_NOTIFICATION", z92Var.c);
        return intent;
    }

    @Override // defpackage.ae4
    public final void a(z77 z77Var, xx0 xx0Var) {
        if (xx0Var instanceof wx0) {
            String str = z77Var.a;
            xk3.d().a(G, "Constraints unmet for WorkSpec " + str);
            i77 d = fy5.d(z77Var);
            int i = ((wx0) xx0Var).a;
            l77 l77Var = this.x;
            q76 q76Var = l77Var.d;
            qy5 qy5Var = new qy5(l77Var.f, new ix5(d), true, i);
            q76Var.getClass();
            ((o77) q76Var).a.execute(qy5Var);
        }
    }

    @Override // defpackage.bx1
    public final void b(i77 i77Var, boolean z) {
        h43 h43Var;
        Map.Entry entry;
        synchronized (this.z) {
            try {
                if (((z77) this.C.remove(i77Var)) != null) {
                    h43Var = (h43) this.D.remove(i77Var);
                } else {
                    h43Var = null;
                }
                if (h43Var != null) {
                    h43Var.l(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z92 z92Var = (z92) this.B.remove(i77Var);
        if (i77Var.equals(this.A)) {
            if (this.B.size() > 0) {
                Iterator it = this.B.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.A = (i77) entry.getKey();
                if (this.F != null) {
                    z92 z92Var2 = (z92) entry.getValue();
                    this.F.d(z92Var2.a, z92Var2.b, z92Var2.c);
                    this.F.A.cancel(z92Var2.a);
                }
            } else {
                this.A = null;
            }
        }
        SystemForegroundService systemForegroundService = this.F;
        if (z92Var != null && systemForegroundService != null) {
            xk3.d().a(G, "Removing Notification (id: " + z92Var.a + ", workSpecId: " + i77Var + ", notificationType: " + z92Var.b);
            systemForegroundService.A.cancel(z92Var.a);
        }
    }

    public final void d(Intent intent) {
        if (this.F != null) {
            int i = 0;
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            i77 i77Var = new i77(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            xk3.d().a(G, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
            if (notification != null) {
                z92 z92Var = new z92(intExtra, intExtra2, notification);
                LinkedHashMap linkedHashMap = this.B;
                linkedHashMap.put(i77Var, z92Var);
                z92 z92Var2 = (z92) linkedHashMap.get(this.A);
                if (z92Var2 == null) {
                    this.A = i77Var;
                } else {
                    this.F.A.notify(intExtra, notification);
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        i |= ((z92) ((Map.Entry) it.next()).getValue()).b;
                    }
                    z92Var = new z92(z92Var2.a, i, z92Var2.c);
                }
                this.F.d(z92Var.a, z92Var.b, z92Var.c);
                return;
            }
            ze0.k("Notification passed in the intent was null.");
            return;
        }
        ze0.m("handleNotify was called on the destroyed dispatcher");
    }

    public final void e() {
        this.F = null;
        synchronized (this.z) {
            try {
                Iterator it = this.D.values().iterator();
                while (it.hasNext()) {
                    ((h43) it.next()).l(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pu4 pu4Var = this.x.f;
        synchronized (pu4Var.k) {
            pu4Var.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        xk3.d().e(G, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.B.entrySet()) {
            if (((z92) entry.getValue()).b == i2) {
                i77 i77Var = (i77) entry.getKey();
                l77 l77Var = this.x;
                q76 q76Var = l77Var.d;
                qy5 qy5Var = new qy5(l77Var.f, new ix5(i77Var), true, -128);
                q76Var.getClass();
                ((o77) q76Var).a.execute(qy5Var);
            }
        }
        SystemForegroundService systemForegroundService = this.F;
        if (systemForegroundService != null) {
            systemForegroundService.y = true;
            xk3.d().a(SystemForegroundService.B, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
