package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class hg5 {
    public static final zf5 a = new zf5(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(zf5 zf5Var) {
        int i;
        zf5Var.getClass();
        if (zf5Var.f == null && zf5Var.g == null) {
            if (!zf5Var.d) {
                AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
                zf5 zf5Var2 = a;
                zf5 zf5Var3 = (zf5) atomicReference.getAndSet(zf5Var2);
                if (zf5Var3 == zf5Var2) {
                    return;
                }
                if (zf5Var3 != null) {
                    i = zf5Var3.c;
                } else {
                    i = 0;
                }
                if (i >= 65536) {
                    atomicReference.set(zf5Var3);
                    return;
                }
                zf5Var.f = zf5Var3;
                zf5Var.b = 0;
                zf5Var.c = i + 8192;
                atomicReference.set(zf5Var);
                return;
            }
            return;
        }
        ze0.k("Failed requirement.");
    }

    public static final zf5 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        zf5 zf5Var = a;
        zf5 zf5Var2 = (zf5) atomicReference.getAndSet(zf5Var);
        if (zf5Var2 == zf5Var) {
            return new zf5();
        }
        if (zf5Var2 == null) {
            atomicReference.set(null);
            return new zf5();
        }
        atomicReference.set(zf5Var2.f);
        zf5Var2.f = null;
        zf5Var2.c = 0;
        return zf5Var2;
    }
}
