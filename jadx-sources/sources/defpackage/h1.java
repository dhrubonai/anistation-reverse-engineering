package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h1 extends bx7 {
    public static final Unsafe i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new g1((byte) 0));
            }
            try {
                k = unsafe.objectFieldOffset(j1.class.getDeclaredField("z"));
                j = unsafe.objectFieldOffset(j1.class.getDeclaredField("y"));
                l = unsafe.objectFieldOffset(j1.class.getDeclaredField("x"));
                m = unsafe.objectFieldOffset(i1.class.getDeclaredField("a"));
                n = unsafe.objectFieldOffset(i1.class.getDeclaredField("b"));
                i = unsafe;
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            ov3.k("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.bx7
    public final void F(i1 i1Var, i1 i1Var2) {
        i.putObject(i1Var, n, i1Var2);
    }

    @Override // defpackage.bx7
    public final void G(i1 i1Var, Thread thread) {
        i.putObject(i1Var, m, thread);
    }

    @Override // defpackage.bx7
    public final boolean k(j1 j1Var, a1 a1Var, a1 a1Var2) {
        while (true) {
            Unsafe unsafe = i;
            long j2 = j;
            j1 j1Var2 = j1Var;
            a1 a1Var3 = a1Var;
            a1 a1Var4 = a1Var2;
            if (unsafe.compareAndSwapObject(j1Var2, j2, a1Var3, a1Var4)) {
                return true;
            }
            if (unsafe.getObject(j1Var2, j2) != a1Var3) {
                return false;
            }
            j1Var = j1Var2;
            a1Var = a1Var3;
            a1Var2 = a1Var4;
        }
    }

    @Override // defpackage.bx7
    public final boolean l(j1 j1Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = i;
            long j2 = l;
            j1 j1Var2 = j1Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(j1Var2, j2, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(j1Var2, j2) != obj3) {
                return false;
            }
            j1Var = j1Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // defpackage.bx7
    public final boolean m(j1 j1Var, i1 i1Var, i1 i1Var2) {
        while (true) {
            Unsafe unsafe = i;
            long j2 = k;
            j1 j1Var2 = j1Var;
            i1 i1Var3 = i1Var;
            i1 i1Var4 = i1Var2;
            if (unsafe.compareAndSwapObject(j1Var2, j2, i1Var3, i1Var4)) {
                return true;
            }
            if (unsafe.getObject(j1Var2, j2) != i1Var3) {
                return false;
            }
            j1Var = j1Var2;
            i1Var = i1Var3;
            i1Var2 = i1Var4;
        }
    }

    @Override // defpackage.bx7
    public final a1 t(j1 j1Var) {
        a1 a1Var;
        a1 a1Var2 = a1.d;
        do {
            a1Var = j1Var.y;
            if (a1Var2 == a1Var) {
                break;
            }
        } while (!k(j1Var, a1Var, a1Var2));
        return a1Var;
    }

    @Override // defpackage.bx7
    public final i1 u(j1 j1Var) {
        i1 i1Var;
        i1 i1Var2 = i1.c;
        do {
            i1Var = j1Var.z;
            if (i1Var2 == i1Var) {
                break;
            }
        } while (!m(j1Var, i1Var, i1Var2));
        return i1Var;
    }
}
