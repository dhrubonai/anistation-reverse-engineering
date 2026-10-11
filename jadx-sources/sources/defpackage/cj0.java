package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cj0 implements n16 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public aj0 d;
    public long e;
    public long f;
    public long g;

    public cj0() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new q61(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            h5 h5Var = new h5((Object) this, (byte) 6);
            bj0 bj0Var = new bj0();
            bj0Var.E = h5Var;
            arrayDeque.add(bj0Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.m61
    public final void a(long j) {
        this.g = j;
    }

    @Override // defpackage.n16
    public final void b(long j) {
        this.e = j;
    }

    @Override // defpackage.m61
    public final Object d() {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        aj0 aj0Var = (aj0) arrayDeque.pollFirst();
        this.d = aj0Var;
        return aj0Var;
    }

    @Override // defpackage.m61
    public final void e(u16 u16Var) {
        boolean z;
        if (u16Var == this.d) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        aj0 aj0Var = (aj0) u16Var;
        if (!aj0Var.d(4)) {
            long j = aj0Var.D;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    aj0Var.f();
                    this.a.add(aj0Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        aj0Var.H = j3;
        this.c.add(aj0Var);
        this.d = null;
    }

    public abstract dj0 f();

    @Override // defpackage.m61
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            aj0 aj0Var = (aj0) arrayDeque2.poll();
            String str = eq6.a;
            aj0Var.f();
            arrayDeque.add(aj0Var);
        }
        aj0 aj0Var2 = this.d;
        if (aj0Var2 != null) {
            aj0Var2.f();
            arrayDeque.add(aj0Var2);
            this.d = null;
        }
    }

    public abstract void g(aj0 aj0Var);

    @Override // defpackage.m61
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public bj0 c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (!arrayDeque2.isEmpty()) {
                aj0 aj0Var = (aj0) arrayDeque2.peek();
                String str = eq6.a;
                if (aj0Var.D <= this.e) {
                    aj0 aj0Var2 = (aj0) arrayDeque2.poll();
                    boolean d = aj0Var2.d(4);
                    ArrayDeque arrayDeque3 = this.a;
                    if (d) {
                        bj0 bj0Var = (bj0) arrayDeque.pollFirst();
                        bj0Var.b(4);
                        aj0Var2.f();
                        arrayDeque3.add(aj0Var2);
                        return bj0Var;
                    }
                    g(aj0Var2);
                    if (i()) {
                        dj0 f = f();
                        bj0 bj0Var2 = (bj0) arrayDeque.pollFirst();
                        long j = aj0Var2.D;
                        bj0Var2.z = j;
                        bj0Var2.B = f;
                        bj0Var2.C = j;
                        aj0Var2.f();
                        arrayDeque3.add(aj0Var2);
                        return bj0Var2;
                    }
                    aj0Var2.f();
                    arrayDeque3.add(aj0Var2);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public abstract boolean i();

    @Override // defpackage.m61
    public void release() {
    }
}
