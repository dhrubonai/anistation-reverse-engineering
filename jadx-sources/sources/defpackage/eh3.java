package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class eh3 extends n11 implements vc1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(eh3.class, "runningWorkers$volatile");
    public static final /* synthetic */ long E = qs.a.objectFieldOffset(eh3.class.getDeclaredField("runningWorkers$volatile"));
    public final int A;
    public final nk3 B;
    public final Object C;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final /* synthetic */ vc1 y;
    public final n11 z;

    /* JADX WARN: Multi-variable type inference failed */
    public eh3(n11 n11Var, int i) {
        vc1 vc1Var;
        if (n11Var instanceof vc1) {
            vc1Var = (vc1) n11Var;
        } else {
            vc1Var = null;
        }
        this.y = vc1Var == null ? n81.a : vc1Var;
        this.z = n11Var;
        this.A = i;
        this.B = new nk3();
        this.C = new Object();
    }

    @Override // defpackage.vc1
    public final ei1 a(long j, Runnable runnable, l11 l11Var) {
        return this.y.a(j, runnable, l11Var);
    }

    @Override // defpackage.vc1
    public final void d0(long j, qg0 qg0Var) {
        this.y.d0(j, qg0Var);
    }

    @Override // defpackage.n11
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.z);
        sb.append(".limitedParallelism(");
        return qx1.o(sb, this.A, ')');
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        Runnable y0;
        this.B.a(runnable);
        if (qs.a.getIntVolatile(this, E) < this.A && z0() && (y0 = y0()) != null) {
            try {
                kh1.b(this.z, this, new yc2((byte) 3, this, y0, false));
            } catch (Throwable th) {
                D.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // defpackage.n11
    public final void v0(l11 l11Var, Runnable runnable) {
        Runnable y0;
        this.B.a(runnable);
        if (qs.a.getIntVolatile(this, E) < this.A && z0() && (y0 = y0()) != null) {
            try {
                this.z.v0(this, new yc2((byte) 3, this, y0, false));
            } catch (Throwable th) {
                D.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // defpackage.n11
    public final n11 x0(int i) {
        wk6.k(i);
        if (i >= this.A) {
            return this;
        }
        return super.x0(i);
    }

    public final Runnable y0() {
        while (true) {
            Runnable runnable = (Runnable) this.B.d();
            if (runnable == null) {
                synchronized (this.C) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.B.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    public final boolean z0() {
        synchronized (this.C) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
            if (qs.a.getIntVolatile(this, E) >= this.A) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
