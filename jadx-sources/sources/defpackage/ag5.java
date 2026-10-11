package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class ag5 extends jv0 implements wa4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(ag5.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long C = qs.a.objectFieldOffset(ag5.class.getDeclaredField("cleanedAndPointers$volatile"));
    public final long A;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public ag5(long j, ag5 ag5Var, int i) {
        super(ag5Var);
        this.A = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.jv0
    public final boolean d() {
        if (qs.a.getIntVolatile(this, C) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (B.addAndGet(this, -65536) == g() && c() != null) {
            return true;
        }
        return false;
    }

    public abstract int g();

    public abstract void h(int i, l11 l11Var);

    public final void i() {
        if (B.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = qs.a;
            long j = C;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            ag5 ag5Var = this;
            if (unsafe.compareAndSwapInt(ag5Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = ag5Var;
        }
    }
}
