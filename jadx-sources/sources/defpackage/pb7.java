package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pb7 extends eb7 {
    public final o76 b;
    public final p76 c;
    public final r18 d;

    public pb7(int i, o76 o76Var, p76 p76Var, r18 r18Var) {
        super(i);
        this.c = p76Var;
        this.b = o76Var;
        this.d = r18Var;
        if (i == 2 && o76Var.b) {
            ze0.k("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.eb7
    public final q12[] a(wa7 wa7Var) {
        return this.b.a;
    }

    @Override // defpackage.eb7
    public final boolean b(wa7 wa7Var) {
        return this.b.b;
    }

    @Override // defpackage.eb7
    public final void c(Status status) {
        bp bpVar;
        this.d.getClass();
        if (status.z != null) {
            bpVar = new bp(status);
        } else {
            bpVar = new bp(status);
        }
        this.c.c(bpVar);
    }

    @Override // defpackage.eb7
    public final void d(Exception exc) {
        this.c.c(exc);
    }

    @Override // defpackage.eb7
    public final void e(y23 y23Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) y23Var.z;
        p76 p76Var = this.c;
        map.put(p76Var, valueOf);
        p76Var.a.e(new l33(y23Var, p76Var));
    }

    @Override // defpackage.eb7
    public final void f(wa7 wa7Var) {
        p76 p76Var = this.c;
        try {
            o76 o76Var = this.b;
            ((g25) ((o76) o76Var.d).d).accept(wa7Var.f, p76Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(eb7.g(e2));
        } catch (RuntimeException e3) {
            p76Var.c(e3);
        }
    }
}
