package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class op5 implements m61 {
    public final np5 a;
    public final q61[] e;
    public final r61[] f;
    public int g;
    public int h;
    public q61 i;
    public o61 j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public op5(q61[] q61VarArr, r61[] r61VarArr) {
        this.e = q61VarArr;
        this.g = q61VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = r61VarArr;
        this.h = r61VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        np5 np5Var = new np5(this);
        this.a = np5Var;
        np5Var.start();
    }

    @Override // defpackage.m61
    public final void a(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    io3.B(z);
                    this.m = j;
                }
                z = true;
                io3.B(z);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m61
    public final Object d() {
        boolean z;
        q61 q61Var;
        synchronized (this.b) {
            try {
                o61 o61Var = this.j;
                if (o61Var == null) {
                    if (this.i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    io3.B(z);
                    int i = this.g;
                    if (i == 0) {
                        q61Var = null;
                    } else {
                        q61[] q61VarArr = this.e;
                        int i2 = i - 1;
                        this.g = i2;
                        q61Var = q61VarArr[i2];
                    }
                    this.i = q61Var;
                } else {
                    throw o61Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q61Var;
    }

    public q61 f() {
        return new q61(1);
    }

    @Override // defpackage.m61
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                q61 q61Var = this.i;
                if (q61Var != null) {
                    q61Var.f();
                    q61[] q61VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    q61VarArr[i] = q61Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    q61 q61Var2 = (q61) this.c.removeFirst();
                    q61Var2.f();
                    q61[] q61VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    q61VarArr2[i2] = q61Var2;
                }
                while (!this.d.isEmpty()) {
                    ((r61) this.d.removeFirst()).i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract r61 g();

    /* JADX WARN: Type inference failed for: r1v1, types: [o61, java.lang.Exception] */
    public o61 h(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    public abstract o61 i(q61 q61Var, r61 r61Var, boolean z);

    public final boolean j() {
        boolean z;
        o61 h;
        boolean z2;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            q61 q61Var = (q61) this.c.removeFirst();
            r61[] r61VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            r61 r61Var = r61VarArr[i];
            boolean z3 = this.k;
            this.k = false;
            if (q61Var.d(4)) {
                r61Var.b(4);
            } else {
                r61Var.z = q61Var.D;
                if (q61Var.d(134217728)) {
                    r61Var.b(134217728);
                }
                long j = q61Var.D;
                synchronized (this.b) {
                    long j2 = this.m;
                    if (j2 != -9223372036854775807L && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    r61Var.A = true;
                }
                try {
                    h = i(q61Var, r61Var, z3);
                } catch (OutOfMemoryError e) {
                    h = h(e);
                } catch (RuntimeException e2) {
                    h = h(e2);
                }
                if (h != null) {
                    synchronized (this.b) {
                        this.j = h;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        r61Var.i();
                    } else if (r61Var.A) {
                        r61Var.i();
                    } else {
                        this.d.addLast(r61Var);
                    }
                    q61Var.f();
                    q61[] q61VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    q61VarArr[i2] = q61Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.m61
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final r61 c() {
        synchronized (this.b) {
            try {
                o61 o61Var = this.j;
                if (o61Var == null) {
                    if (this.d.isEmpty()) {
                        return null;
                    }
                    return (r61) this.d.removeFirst();
                }
                throw o61Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m61
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void e(q61 q61Var) {
        boolean z;
        synchronized (this.b) {
            try {
                o61 o61Var = this.j;
                if (o61Var == null) {
                    if (q61Var == this.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    io3.n(z);
                    this.c.addLast(q61Var);
                    if (!this.c.isEmpty() && this.h > 0) {
                        this.b.notify();
                    }
                    this.i = null;
                } else {
                    throw o61Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(r61 r61Var) {
        synchronized (this.b) {
            r61Var.f();
            r61[] r61VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            r61VarArr[i] = r61Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.m61
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
