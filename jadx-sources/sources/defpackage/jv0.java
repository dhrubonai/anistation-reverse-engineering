package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class jv0 {
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ int z = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = qs.a;
        x = unsafe.objectFieldOffset(jv0.class.getDeclaredField("_next$volatile"));
        y = unsafe.objectFieldOffset(jv0.class.getDeclaredField("_prev$volatile"));
    }

    public jv0(ag5 ag5Var) {
        this._prev$volatile = ag5Var;
    }

    public final void b() {
        qs.a.putObjectVolatile(this, y, (Object) null);
    }

    public final jv0 c() {
        Object objectVolatile = qs.a.getObjectVolatile(this, x);
        if (objectVolatile == iv0.a) {
            return null;
        }
        return (jv0) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        jv0 jv0Var;
        jv0 jv0Var2;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = qs.a;
            long j = y;
            jv0 jv0Var3 = (jv0) unsafe2.getObjectVolatile(this, j);
            while (jv0Var3 != null && jv0Var3.d()) {
                jv0Var3 = (jv0) qs.a.getObjectVolatile(jv0Var3, j);
            }
            jv0 c = c();
            c.getClass();
            do {
                jv0Var = c;
                if (!jv0Var.d()) {
                    break;
                } else {
                    c = jv0Var.c();
                }
            } while (c != null);
            while (true) {
                Object objectVolatile = qs.a.getObjectVolatile(jv0Var, j);
                if (((jv0) objectVolatile) == null) {
                    jv0Var2 = null;
                } else {
                    jv0Var2 = jv0Var3;
                }
                do {
                    unsafe = qs.a;
                    if (unsafe.compareAndSwapObject(jv0Var, y, objectVolatile, jv0Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(jv0Var, j) == objectVolatile);
            }
            if (jv0Var3 != null) {
                unsafe.putObjectVolatile(jv0Var3, x, jv0Var);
            }
            if (!jv0Var.d() || jv0Var.c() == null) {
                if (jv0Var3 == null || !jv0Var3.d()) {
                    return;
                }
            }
        }
    }
}
