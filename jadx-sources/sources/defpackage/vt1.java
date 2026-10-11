package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vt1 extends c95 implements bi2 {
    public static final ByteBuffer q = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final ea2 e;
    public final long f;
    public final AtomicLong g;
    public final ConcurrentLinkedQueue h;
    public final ConcurrentLinkedQueue i;
    public volatile boolean j;
    public long k;
    public boolean l;
    public boolean m;
    public long n;
    public q61 o;
    public boolean p;

    public vt1(ea2 ea2Var, bi6 bi6Var, t54 t54Var, kz kzVar, long j) {
        super(ea2Var, t54Var);
        this.e = ea2Var;
        this.f = j;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        kzVar.C(bi6Var);
    }

    @Override // defpackage.b95
    public final q61 b() {
        if (this.o == null) {
            q61 q61Var = (q61) this.h.poll();
            this.o = q61Var;
            if (!this.m) {
                if (q61Var == null) {
                    q61 q61Var2 = new q61(2);
                    this.o = q61Var2;
                    q61Var2.B = q;
                } else {
                    long j = this.n;
                    q61Var.B.getClass();
                    this.n = j - r0.capacity();
                }
            }
        }
        return this.o;
    }

    @Override // defpackage.ge4
    public final void c(qr1 qr1Var, long j, ea2 ea2Var, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        this.l = z;
        atomicLong.addAndGet(j);
        this.p = false;
    }

    @Override // defpackage.b95
    public final boolean g() {
        boolean z;
        q61 q61Var = this.o;
        q61Var.getClass();
        this.o = null;
        if (q61Var.d(4)) {
            this.j = true;
        } else {
            long j = this.k + this.f + q61Var.D;
            q61Var.D = j;
            if (!this.l && j >= this.g.get() + this.f) {
                this.p = true;
            }
            if (this.p) {
                q61Var.f();
                q61Var.D = 0L;
                this.h.add(q61Var);
            } else {
                this.i.add(q61Var);
            }
        }
        if (!this.m) {
            int size = this.i.size() + this.h.size();
            long j2 = this.n;
            q61Var.B.getClass();
            long capacity = j2 + r0.capacity();
            this.n = capacity;
            if (size >= 10 && (size >= 200 || capacity >= 2097152)) {
                z = true;
            } else {
                z = false;
            }
            this.m = z;
        }
        return true;
    }

    @Override // defpackage.c95
    public final q61 k() {
        return (q61) this.i.peek();
    }

    @Override // defpackage.c95
    public final ea2 l() {
        return this.e;
    }

    @Override // defpackage.c95
    public final boolean m() {
        if (this.j && this.i.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c95
    public final void p() {
        q61 q61Var = (q61) this.i.remove();
        q61Var.f();
        q61Var.D = 0L;
        this.h.add(q61Var);
    }

    @Override // defpackage.c95
    public final bi2 j(qr1 qr1Var, ea2 ea2Var, int i) {
        return this;
    }
}
