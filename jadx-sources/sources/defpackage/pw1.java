package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class pw1 implements Runnable, Comparable, ei1 {
    private volatile Object _heap;
    public long x;
    public int y = -1;

    public pw1(long j) {
        this.x = j;
    }

    public final int a(long j, qw1 qw1Var, rw1 rw1Var) {
        pw1 pw1Var;
        boolean z;
        synchronized (this) {
            if (this._heap == sw1.a) {
                return 2;
            }
            synchronized (qw1Var) {
                try {
                    pw1[] pw1VarArr = qw1Var.a;
                    if (pw1VarArr != null) {
                        pw1Var = pw1VarArr[0];
                    } else {
                        pw1Var = null;
                    }
                    int i = rw1.F;
                    if (qs.a.getIntVolatile(rw1Var, rw1.D) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return 1;
                    }
                    if (pw1Var == null) {
                        qw1Var.c = j;
                    } else {
                        long j2 = pw1Var.x;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = qw1Var.c;
                        if (j - j3 > 0) {
                            qw1Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.x - j < 0) {
                        this.x = j;
                    }
                    qw1Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(qw1 qw1Var) {
        if (this._heap != sw1.a) {
            this._heap = qw1Var;
        } else {
            ze0.k("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.x - ((pw1) obj).x;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.ei1
    public final void dispose() {
        qw1 qw1Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                ni1 ni1Var = sw1.a;
                if (obj == ni1Var) {
                    return;
                }
                pe6 pe6Var = null;
                if (obj instanceof qw1) {
                    qw1Var = (qw1) obj;
                } else {
                    qw1Var = null;
                }
                if (qw1Var != null) {
                    synchronized (qw1Var) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof pe6) {
                            pe6Var = (pe6) obj2;
                        }
                        if (pe6Var != null) {
                            qw1Var.c(this.y);
                        }
                    }
                }
                this._heap = ni1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.x + ']';
    }
}
