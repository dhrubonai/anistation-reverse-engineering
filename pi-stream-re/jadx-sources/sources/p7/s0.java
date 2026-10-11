package p7;

/* loaded from: classes.dex */
public abstract class s0 extends w {

    /* renamed from: c, reason: collision with root package name */
    public long f8739c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8740d;

    /* renamed from: e, reason: collision with root package name */
    public x6.h f8741e;

    public final void I() {
        long j4 = this.f8739c - 4294967296L;
        this.f8739c = j4;
        if (j4 <= 0 && this.f8740d) {
            shutdown();
        }
    }

    public abstract Thread J();

    public final void K(boolean z9) {
        long j4;
        long j10 = this.f8739c;
        if (z9) {
            j4 = 4294967296L;
        } else {
            j4 = 1;
        }
        this.f8739c = j4 + j10;
        if (!z9) {
            this.f8740d = true;
        }
    }

    public final boolean L() {
        Object g10;
        x6.h hVar = this.f8741e;
        if (hVar == null) {
            return false;
        }
        if (hVar.isEmpty()) {
            g10 = null;
        } else {
            g10 = hVar.g();
        }
        h0 h0Var = (h0) g10;
        if (h0Var == null) {
            return false;
        }
        h0Var.run();
        return true;
    }

    public void M(long j4, p0 p0Var) {
        b0.f8663z.S(j4, p0Var);
    }

    public abstract void shutdown();
}
