package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class yt extends of6 {
    public static final fr0 h;
    public static yt i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final char l;
    public static final long m;
    public byte e;
    public int f = -1;
    public long g;

    static {
        fr0 fr0Var = new fr0((byte) 8, false);
        fr0Var.z = new yt[8];
        h = fr0Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        k = newCondition;
        l = (char) 60000;
        m = 60000000000L;
    }

    public final void h() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 == 0 && !z) {
            return;
        }
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            if (this.e == 0) {
                this.e = (byte) 1;
                nx7.K(this);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            byte b = this.e;
            boolean z = false;
            this.e = (byte) 0;
            if (b == 1) {
                h.p(this);
                return false;
            }
            if (b == 2) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
