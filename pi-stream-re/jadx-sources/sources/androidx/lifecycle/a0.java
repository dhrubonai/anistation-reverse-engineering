package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f1065a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1066b;

    /* renamed from: c, reason: collision with root package name */
    public int f1067c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f1068d;

    public a0(c0 c0Var, d0 d0Var) {
        this.f1068d = c0Var;
        this.f1065a = d0Var;
    }

    public final void a(boolean z9) {
        int i10;
        boolean z10;
        boolean z11;
        if (z9 == this.f1066b) {
            return;
        }
        this.f1066b = z9;
        if (z9) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        c0 c0Var = this.f1068d;
        int i11 = c0Var.f1081c;
        c0Var.f1081c = i10 + i11;
        if (!c0Var.f1082d) {
            c0Var.f1082d = true;
            while (true) {
                try {
                    int i12 = c0Var.f1081c;
                    if (i11 == i12) {
                        break;
                    }
                    if (i11 == 0 && i12 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 > 0 && i12 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        c0Var.f();
                    } else if (z11) {
                        c0Var.g();
                    }
                    i11 = i12;
                } finally {
                    c0Var.f1082d = false;
                }
            }
        }
        if (this.f1066b) {
            c0Var.c(this);
        }
    }

    public void b() {
    }

    public boolean c(u uVar) {
        return false;
    }

    public abstract boolean d();
}
