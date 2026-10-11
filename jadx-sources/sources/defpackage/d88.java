package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d88 extends yu5 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(g1.b);
            }
            try {
                c = unsafe.objectFieldOffset(f88.class.getDeclaredField("z"));
                b = unsafe.objectFieldOffset(f88.class.getDeclaredField("y"));
                d = unsafe.objectFieldOffset(f88.class.getDeclaredField("x"));
                e = unsafe.objectFieldOffset(e88.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(e88.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            ov3.k("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.yu5
    public final void n(e88 e88Var, Thread thread) {
        a.putObject(e88Var, e, thread);
    }

    @Override // defpackage.yu5
    public final void p(e88 e88Var, e88 e88Var2) {
        a.putObject(e88Var, f, e88Var2);
    }

    @Override // defpackage.yu5
    public final boolean q(f88 f88Var, e88 e88Var, e88 e88Var2) {
        while (true) {
            Unsafe unsafe = a;
            long j = c;
            f88 f88Var2 = f88Var;
            e88 e88Var3 = e88Var;
            e88 e88Var4 = e88Var2;
            if (unsafe.compareAndSwapObject(f88Var2, j, e88Var3, e88Var4)) {
                return true;
            }
            if (unsafe.getObject(f88Var2, j) != e88Var3) {
                return false;
            }
            f88Var = f88Var2;
            e88Var = e88Var3;
            e88Var2 = e88Var4;
        }
    }

    @Override // defpackage.yu5
    public final boolean r(f88 f88Var, z78 z78Var, z78 z78Var2) {
        while (true) {
            Unsafe unsafe = a;
            long j = b;
            f88 f88Var2 = f88Var;
            z78 z78Var3 = z78Var;
            z78 z78Var4 = z78Var2;
            if (unsafe.compareAndSwapObject(f88Var2, j, z78Var3, z78Var4)) {
                return true;
            }
            if (unsafe.getObject(f88Var2, j) != z78Var3) {
                return false;
            }
            f88Var = f88Var2;
            z78Var = z78Var3;
            z78Var2 = z78Var4;
        }
    }

    @Override // defpackage.yu5
    public final e88 s(f88 f88Var) {
        e88 e88Var;
        e88 e88Var2 = e88.c;
        do {
            e88Var = f88Var.z;
            if (e88Var2 == e88Var) {
                break;
            }
        } while (!q(f88Var, e88Var, e88Var2));
        return e88Var;
    }

    @Override // defpackage.yu5
    public final z78 t(f88 f88Var) {
        z78 z78Var;
        z78 z78Var2 = z78.d;
        do {
            z78Var = f88Var.y;
            if (z78Var2 == z78Var) {
                break;
            }
        } while (!r(f88Var, z78Var, z78Var2));
        return z78Var;
    }

    @Override // defpackage.yu5
    public final boolean u(f88 f88Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = a;
            long j = d;
            f88 f88Var2 = f88Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(f88Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(f88Var2, j) != obj3) {
                return false;
            }
            f88Var = f88Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }
}
