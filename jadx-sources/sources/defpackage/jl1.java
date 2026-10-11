package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jl1 implements gk1 {
    public final Context a;
    public final ik1 b;
    public final boolean c;
    public final l33 d;
    public final Class e;
    public kl1 f;
    public u35 g;

    public jl1(Context context, ik1 ik1Var, boolean z, l33 l33Var, Class cls) {
        this.a = context;
        this.b = ik1Var;
        this.c = z;
        this.d = l33Var;
        this.e = cls;
        ik1Var.getClass();
        ik1Var.d.add(this);
        i();
    }

    @Override // defpackage.gk1
    public final void a(ik1 ik1Var) {
        kl1 kl1Var = this.f;
        if (kl1Var != null) {
            kl1Var.a(ik1Var.m);
        }
    }

    @Override // defpackage.gk1
    public final void b(ik1 ik1Var, cj1 cj1Var) {
        pn0 pn0Var;
        kl1 kl1Var = this.f;
        if (kl1Var != null && (pn0Var = kl1Var.x) != null) {
            int i = cj1Var.b;
            if (i != 2 && i != 5 && i != 7) {
                if (pn0Var.z) {
                    pn0Var.f();
                }
            } else {
                pn0Var.y = true;
                pn0Var.f();
            }
        }
        kl1 kl1Var2 = this.f;
        if (kl1Var2 != null && !kl1Var2.E) {
            return;
        }
        int i2 = cj1Var.b;
        if (i2 != 2 && i2 != 5 && i2 != 7) {
            return;
        }
        kb0.O("DownloadService", "DownloadService wasn't running. Restarting.");
        h();
    }

    @Override // defpackage.gk1
    public final void c() {
        i();
    }

    @Override // defpackage.gk1
    public final void d() {
        kl1 kl1Var = this.f;
        if (kl1Var != null) {
            kl1Var.b();
        }
    }

    @Override // defpackage.gk1
    public final void e(ik1 ik1Var, boolean z) {
        if (!z && !ik1Var.h) {
            kl1 kl1Var = this.f;
            if (kl1Var != null && !kl1Var.E) {
                return;
            }
            List list = ik1Var.m;
            for (int i = 0; i < list.size(); i++) {
                if (((cj1) list.get(i)).b == 0) {
                    h();
                    return;
                }
            }
        }
    }

    @Override // defpackage.gk1
    public final void f(ik1 ik1Var, cj1 cj1Var) {
        pn0 pn0Var;
        kl1 kl1Var = this.f;
        if (kl1Var != null && (pn0Var = kl1Var.x) != null && pn0Var.z) {
            pn0Var.f();
        }
    }

    public final void g() {
        u35 u35Var = new u35(0);
        if (!Objects.equals(this.g, u35Var)) {
            ((JobScheduler) this.d.z).cancel(2102);
            this.g = u35Var;
        }
    }

    public final void h() {
        Class cls = this.e;
        boolean z = this.c;
        Context context = this.a;
        if (z) {
            try {
                Intent action = new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                String str = eq6.a;
                context.startForegroundService(action);
                return;
            } catch (IllegalStateException unused) {
                kb0.O("DownloadService", "Failed to restart (foreground launch restriction)");
                return;
            }
        }
        try {
            context.startService(new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
        } catch (IllegalStateException unused2) {
            kb0.O("DownloadService", "Failed to restart (process is idle)");
        }
    }

    public final boolean i() {
        u35 u35Var;
        u35 u35Var2;
        boolean z;
        boolean z2;
        ik1 ik1Var = this.b;
        boolean z3 = ik1Var.l;
        l33 l33Var = this.d;
        if (l33Var == null) {
            return !z3;
        }
        if (!z3) {
            g();
            return true;
        }
        u35 u35Var3 = ik1Var.n.c;
        int i = u35Var3.x;
        int i2 = i & 31;
        if (i2 == i) {
            u35Var = u35Var3;
        } else {
            u35Var = new u35(i2);
        }
        if (!u35Var.equals(u35Var3)) {
            g();
            return false;
        }
        if (Objects.equals(this.g, u35Var3)) {
            return true;
        }
        String packageName = this.a.getPackageName();
        ComponentName componentName = (ComponentName) l33Var.y;
        int i3 = i & 31;
        if (i3 == i) {
            u35Var2 = u35Var3;
        } else {
            u35Var2 = new u35(i3);
        }
        if (!u35Var2.equals(u35Var3)) {
            kb0.O("PlatformScheduler", "Ignoring unsupported requirements: " + (u35Var2.x ^ i));
        }
        JobInfo.Builder builder = new JobInfo.Builder(2102, componentName);
        if ((i & 2) != 0) {
            builder.setRequiredNetworkType(2);
        } else if ((i & 1) != 0) {
            builder.setRequiredNetworkType(1);
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        builder.setRequiresDeviceIdle(z);
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        builder.setRequiresCharging(z2);
        if ((i & 16) != 0) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", "androidx.media3.exoplayer.downloadService.action.RESTART");
        persistableBundle.putString("service_package", packageName);
        persistableBundle.putInt("requirements", i);
        builder.setExtras(persistableBundle);
        if (((JobScheduler) l33Var.z).schedule(builder.build()) == 1) {
            this.g = u35Var3;
            return true;
        }
        kb0.O("DownloadService", "Failed to schedule restart");
        g();
        return false;
    }
}
