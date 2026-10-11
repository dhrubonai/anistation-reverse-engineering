package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ro6 {
    public static final Unsafe a;
    public static final Class b;
    public static final qo6 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    static {
        Unsafe unsafe;
        boolean o;
        boolean n;
        long j;
        boolean z = true;
        qo6 qo6Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new g1((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = i9.a;
        boolean f2 = f(Long.TYPE);
        boolean f3 = f(Integer.TYPE);
        if (unsafe != null) {
            if (i9.a()) {
                if (f2) {
                    qo6Var = new no6(unsafe, (byte) 1);
                } else if (f3) {
                    qo6Var = new no6(unsafe, (byte) 0);
                }
            } else {
                qo6Var = new qo6(unsafe, (byte) 0);
            }
        }
        c = qo6Var;
        if (qo6Var == null) {
            o = false;
        } else {
            o = qo6Var.o();
        }
        d = o;
        if (qo6Var == null) {
            n = false;
        } else {
            n = qo6Var.n();
        }
        e = n;
        f = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field d2 = d();
        if (d2 != null && qo6Var != null) {
            j = qo6Var.b.objectFieldOffset(d2);
        } else {
            j = -1;
        }
        g = j;
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z = false;
        }
        h = z;
    }

    public static long a(ByteBuffer byteBuffer) {
        return c.b.getLong(byteBuffer, g);
    }

    public static int b(Class cls) {
        if (e) {
            return c.b.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (e) {
            c.b.arrayIndexScale(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (i9.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void e(long j, byte[] bArr, long j2, long j3) {
        c.a(j, bArr, j2, j3);
    }

    public static boolean f(Class cls) {
        if (!i9.a()) {
            return false;
        }
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(long j, byte[] bArr) {
        return c.e(f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((j((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int j(long j, Object obj) {
        return c.b.getInt(obj, j);
    }

    public static long k(long j, Object obj) {
        return c.b.getLong(obj, j);
    }

    public static Object l(long j, Object obj) {
        return c.b.getObject(obj, j);
    }

    public static void m(Throwable th) {
        Logger.getLogger(ro6.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void n(long j, byte b2) {
        c.j(j, b2);
    }

    public static void o(byte[] bArr, long j, byte b2) {
        c.k(f + j, bArr, b2);
    }

    public static void p(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int j3 = j(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        r(obj, j2, ((255 & b2) << i) | (j3 & (~(255 << i))));
    }

    public static void q(long j, Object obj, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        r(obj, j2, ((255 & b2) << i) | (j(j2, obj) & (~(255 << i))));
    }

    public static void r(Object obj, long j, int i) {
        c.b.putInt(obj, j, i);
    }

    public static void s(Object obj, long j, long j2) {
        c.b.putLong(obj, j, j2);
    }

    public static void t(long j, Object obj, Object obj2) {
        c.b.putObject(obj, j, obj2);
    }
}
