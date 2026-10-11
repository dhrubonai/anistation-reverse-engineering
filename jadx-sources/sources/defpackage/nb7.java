package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nb7 extends eb7 {
    public final p76 b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nb7(qi3 qi3Var, p76 p76Var) {
        this(4, p76Var);
        this.c = (byte) 1;
        this.d = qi3Var;
    }

    @Override // defpackage.eb7
    public final q12[] a(wa7 wa7Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((gb7) obj).a.b;
            default:
                gb7 gb7Var = (gb7) wa7Var.j.get((qi3) obj);
                if (gb7Var == null) {
                    return null;
                }
                return gb7Var.a.b;
        }
    }

    @Override // defpackage.eb7
    public final boolean b(wa7 wa7Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((gb7) obj).a.c;
            default:
                gb7 gb7Var = (gb7) wa7Var.j.get((qi3) obj);
                if (gb7Var != null && gb7Var.a.c) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.eb7
    public final void c(Status status) {
        this.b.c(new bp(status));
    }

    @Override // defpackage.eb7
    public final void d(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.eb7
    public final /* bridge */ /* synthetic */ void e(y23 y23Var, boolean z) {
        byte b = this.c;
    }

    @Override // defpackage.eb7
    public final void f(wa7 wa7Var) {
        try {
            j(wa7Var);
        } catch (DeadObjectException e) {
            c(eb7.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(eb7.g(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    public final void j(wa7 wa7Var) {
        switch (this.c) {
            case 0:
                gb7 gb7Var = (gb7) this.d;
                hb7 hb7Var = gb7Var.a;
                hb7Var.e.a.accept(wa7Var.f, this.b);
                qi3 qi3Var = (qi3) hb7Var.a.c;
                if (qi3Var != null) {
                    wa7Var.j.put(qi3Var, gb7Var);
                    return;
                }
                return;
            default:
                gb7 gb7Var2 = (gb7) wa7Var.j.remove((qi3) this.d);
                if (gb7Var2 != null) {
                    ((m15) gb7Var2.b.z).b.accept(wa7Var.f, this.b);
                    gs1 gs1Var = gb7Var2.a.a;
                    gs1Var.b = null;
                    gs1Var.c = null;
                    return;
                }
                this.b.d(Boolean.FALSE);
                return;
        }
    }

    public nb7(int i, p76 p76Var) {
        super(i);
        this.b = p76Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nb7(gb7 gb7Var, p76 p76Var) {
        this(3, p76Var);
        this.c = (byte) 0;
        this.d = gb7Var;
    }

    private final /* bridge */ /* synthetic */ void h(y23 y23Var, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void i(y23 y23Var, boolean z) {
    }
}
