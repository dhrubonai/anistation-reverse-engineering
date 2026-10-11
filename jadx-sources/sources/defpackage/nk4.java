package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nk4 {
    public final vu0 a;
    public final qu0 b;
    public final kd2 c;
    public final ic2 d;
    public final boolean e;
    public final rm6 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(pk4.z);
    public long i = nz5.c();
    public q44 j;
    public final b25 k;
    public final i05 l;

    public nk4(vu0 vu0Var, qu0 qu0Var, kd2 kd2Var, s44 s44Var, ic2 ic2Var, boolean z, rm6 rm6Var, Object obj) {
        this.a = vu0Var;
        this.b = qu0Var;
        this.c = kd2Var;
        this.d = ic2Var;
        this.e = z;
        this.f = rm6Var;
        this.g = obj;
        q44 q44Var = db5.a;
        q44Var.getClass();
        this.j = q44Var;
        b25 b25Var = new b25((byte) 0);
        b25Var.j(s44Var, kd2Var.D());
        this.k = b25Var;
        this.l = new i05(rm6Var.z);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (((pk4) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    pk4 pk4Var = pk4.C;
                    pk4 pk4Var2 = pk4.D;
                    while (!atomicReference.compareAndSet(pk4Var, pk4Var2)) {
                        if (atomicReference.get() != pk4Var) {
                            ds4.b("Unexpected state change from: " + pk4Var + " to: " + pk4Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new er0((byte) 4);
            }
        } catch (Exception e) {
            atomicReference.set(pk4.x);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                } finally {
                    this.k.c();
                    this.a.N = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        if (((pk4) this.h.get()).compareTo(pk4.C) >= 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        AtomicReference atomicReference;
        pk4 pk4Var;
        pk4 pk4Var2;
        do {
            atomicReference = this.h;
            pk4Var = pk4.A;
            pk4Var2 = pk4.C;
            if (atomicReference.compareAndSet(pk4Var, pk4Var2)) {
                return;
            }
        } while (atomicReference.get() == pk4Var);
        ds4.b("Unexpected state change from: " + pk4Var + " to: " + pk4Var2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public final boolean e(ko5 ko5Var) {
        pk4 pk4Var = pk4.B;
        AtomicReference atomicReference = this.h;
        try {
            int ordinal = ((pk4) atomicReference.get()).ordinal();
            pk4 pk4Var2 = pk4.A;
            vu0 vu0Var = this.a;
            qu0 qu0Var = this.b;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    kd2 kd2Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        kd2Var.z = 0;
                        kd2Var.y = true;
                    }
                    this.j = qu0Var.b(vu0Var, ko5Var, this.d);
                    if (z) {
                        if (kd2Var.F || kd2Var.z != 0) {
                            ds4.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        kd2Var.z = -1;
                        kd2Var.y = false;
                    }
                    pk4 pk4Var3 = pk4.z;
                    while (true) {
                        if (!atomicReference.compareAndSet(pk4Var3, pk4Var2)) {
                            if (atomicReference.get() != pk4Var3) {
                                ds4.b("Unexpected state change from: " + pk4Var3 + " to: " + pk4Var2 + ".");
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(pk4Var2, pk4Var)) {
                            if (atomicReference.get() != pk4Var2) {
                                ds4.b("Unexpected state change from: " + pk4Var2 + " to: " + pk4Var + ".");
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = nz5.c();
                        this.j = qu0Var.q(vu0Var, ko5Var, this.j);
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(pk4Var, pk4Var2)) {
                                if (atomicReference.get() != pk4Var) {
                                    ds4.b("Unexpected state change from: " + pk4Var + " to: " + pk4Var2 + ".");
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(pk4Var, pk4Var2)) {
                                if (atomicReference.get() != pk4Var) {
                                    ds4.b("Unexpected state change from: " + pk4Var + " to: " + pk4Var2 + ".");
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    eu0.b("Recursive call to resume()");
                    throw new er0((byte) 3);
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new er0((byte) 4);
            }
        } catch (Exception e) {
            atomicReference.set(pk4.x);
            throw e;
        }
    }
}
