package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class mk3 {
    public static final i18 d = new i18((byte) 24);
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public final int a;
    public final int b;
    public final AtomicReferenceArray c;
    private volatile /* synthetic */ Object nextRef = null;
    private volatile /* synthetic */ long stateRef = 0;

    static {
        Unsafe unsafe = qs.a;
        e = unsafe.objectFieldOffset(mk3.class.getDeclaredField("nextRef"));
        f = unsafe.objectFieldOffset(mk3.class.getDeclaredField("stateRef"));
    }

    public mk3(int i) {
        this.a = i;
        int i2 = i - 1;
        this.b = i2;
        this.c = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            ze0.m("Check failed.");
            throw null;
        }
        ze0.m("Check failed.");
        throw null;
    }

    public final int a(rg5 rg5Var) {
        while (true) {
            long j = this.stateRef;
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) ((1152921503533105152L & j) >> 30);
            int i2 = this.b;
            if (((i + 2) & i2) == (((int) (1073741823 & j)) & i2)) {
                return 1;
            }
            mk3 mk3Var = this;
            if (qs.a.compareAndSwapLong(mk3Var, f, j, (((i + 1) & 1073741823) << 30) | ((-1152921503533105153L) & j))) {
                mk3Var.c.set(mk3Var.b & i, rg5Var);
                mk3 mk3Var2 = mk3Var;
                while ((mk3Var2.stateRef & 1152921504606846976L) != 0) {
                    mk3Var2 = mk3Var2.d();
                    AtomicReferenceArray atomicReferenceArray = mk3Var2.c;
                    int i3 = mk3Var2.b & i;
                    Object obj = atomicReferenceArray.get(i3);
                    if ((obj instanceof lk3) && ((lk3) obj).a == i) {
                        atomicReferenceArray.set(i3, rg5Var);
                    } else {
                        mk3Var2 = null;
                    }
                    if (mk3Var2 == null) {
                        return 0;
                    }
                }
                return 0;
            }
            this = mk3Var;
        }
    }

    public final boolean b() {
        while (true) {
            long j = this.stateRef;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            mk3 mk3Var = this;
            if (qs.a.compareAndSwapLong(mk3Var, f, j, j | 2305843009213693952L)) {
                return true;
            }
            this = mk3Var;
        }
    }

    public final boolean c() {
        long j = this.stateRef;
        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    public final mk3 d() {
        mk3 mk3Var;
        long j;
        Unsafe unsafe;
        long j2;
        while (true) {
            long j3 = this.stateRef;
            if ((j3 & 1152921504606846976L) != 0) {
                mk3Var = this;
                j = j3;
                break;
            }
            j = j3 | 1152921504606846976L;
            mk3Var = this;
            if (qs.a.compareAndSwapLong(mk3Var, f, j3, j)) {
                break;
            }
            this = mk3Var;
        }
        while (true) {
            mk3 mk3Var2 = (mk3) mk3Var.nextRef;
            if (mk3Var2 != null) {
                return mk3Var2;
            }
            mk3 mk3Var3 = new mk3(mk3Var.a * 2);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = mk3Var.b;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                AtomicReferenceArray atomicReferenceArray = mk3Var3.c;
                int i5 = mk3Var3.b & i;
                Object obj = mk3Var.c.get(i4);
                if (obj == null) {
                    obj = new lk3(i);
                }
                atomicReferenceArray.set(i5, obj);
                i++;
            }
            mk3Var3.stateRef = (-1152921504606846977L) & j;
            do {
                unsafe = qs.a;
                j2 = e;
                if (unsafe.compareAndSwapObject(mk3Var, j2, (Object) null, mk3Var3)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(mk3Var, j2) == null);
        }
    }

    public final Object e() {
        Object obj;
        mk3 mk3Var = this;
        long j = mk3Var.stateRef;
        if ((j & 1152921504606846976L) != 0) {
            return d;
        }
        int i = (int) (j & 1073741823);
        int i2 = mk3Var.b;
        int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
        int i4 = i2 & i;
        if (i3 == i4 || (obj = mk3Var.c.get(i4)) == null || (obj instanceof lk3)) {
            return null;
        }
        long j2 = (i + 1) & 1073741823;
        if (qs.a.compareAndSwapLong(mk3Var, f, j, (j & (-1073741824)) | j2)) {
            mk3Var.c.set(mk3Var.b & i, null);
            return obj;
        }
        while (true) {
            long j3 = mk3Var.stateRef;
            int i5 = (int) (j3 & 1073741823);
            if (i5 == i) {
                if ((j3 & 1152921504606846976L) != 0) {
                    mk3Var = mk3Var.d();
                } else {
                    mk3 mk3Var2 = mk3Var;
                    if (qs.a.compareAndSwapLong(mk3Var2, f, j3, (j3 & (-1073741824)) | j2)) {
                        mk3Var2.c.set(i5 & mk3Var2.b, null);
                        mk3Var = null;
                    } else {
                        mk3Var = mk3Var2;
                    }
                }
                if (mk3Var == null) {
                    return obj;
                }
            } else {
                ze0.m("This queue can have only one consumer");
                return null;
            }
        }
    }
}
