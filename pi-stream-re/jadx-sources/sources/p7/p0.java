package p7;

/* loaded from: classes.dex */
public abstract class p0 implements Runnable, Comparable, k0 {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f8728a;

    /* renamed from: b, reason: collision with root package name */
    public int f8729b = -1;

    public p0(long j4) {
        this.f8728a = j4;
    }

    public final t7.a0 a() {
        Object obj = this._heap;
        if (obj instanceof t7.a0) {
            return (t7.a0) obj;
        }
        return null;
    }

    @Override // p7.k0
    public final void b() {
        q0 q0Var;
        synchronized (this) {
            Object obj = this._heap;
            w4.o oVar = t0.f8744a;
            if (obj == oVar) {
                return;
            }
            if (obj instanceof q0) {
                q0Var = (q0) obj;
            } else {
                q0Var = null;
            }
            if (q0Var != null) {
                q0Var.d(this);
            }
            this._heap = oVar;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = this.f8728a - ((p0) obj).f8728a;
        if (j4 > 0) {
            return 1;
        }
        if (j4 < 0) {
            return -1;
        }
        return 0;
    }

    public final int d(long j4, q0 q0Var, r0 r0Var) {
        p0 p0Var;
        synchronized (this) {
            if (this._heap == t0.f8744a) {
                return 2;
            }
            synchronized (q0Var) {
                try {
                    p0[] p0VarArr = q0Var.f10050a;
                    if (p0VarArr != null) {
                        p0Var = p0VarArr[0];
                    } else {
                        p0Var = null;
                    }
                    if (r0.N(r0Var)) {
                        return 1;
                    }
                    if (p0Var == null) {
                        q0Var.f8730c = j4;
                    } else {
                        long j10 = p0Var.f8728a;
                        if (j10 - j4 < 0) {
                            j4 = j10;
                        }
                        if (j4 - q0Var.f8730c > 0) {
                            q0Var.f8730c = j4;
                        }
                    }
                    long j11 = this.f8728a;
                    long j12 = q0Var.f8730c;
                    if (j11 - j12 < 0) {
                        this.f8728a = j12;
                    }
                    q0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(q0 q0Var) {
        boolean z9;
        if (this._heap != t0.f8744a) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this._heap = q0Var;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8728a + ']';
    }
}
