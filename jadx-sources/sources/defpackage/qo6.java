package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class qo6 {
    public final /* synthetic */ byte a;
    public final Unsafe b;

    public /* synthetic */ qo6(Unsafe unsafe, byte b) {
        this.a = b;
        this.b = unsafe;
    }

    public abstract void a(long j, byte[] bArr, long j2, long j3);

    public abstract void b(byte[] bArr, long j, long j2, long j3);

    public boolean c(long j, Object obj) {
        return this.b.getBoolean(obj, j);
    }

    public byte d(long j) {
        return this.b.getByte(j);
    }

    public byte e(long j, Object obj) {
        return this.b.getByte(obj, j);
    }

    public double f(long j, Object obj) {
        return this.b.getDouble(obj, j);
    }

    public float g(long j, Object obj) {
        return this.b.getFloat(obj, j);
    }

    public long h(long j) {
        return this.b.getLong(j);
    }

    public void i(Object obj, long j, boolean z) {
        this.b.putBoolean(obj, j, z);
    }

    public void j(long j, byte b) {
        this.b.putByte(j, b);
    }

    public void k(long j, Object obj, byte b) {
        this.b.putByte(obj, j, b);
    }

    public void l(Object obj, long j, double d) {
        this.b.putDouble(obj, j, d);
    }

    public void m(Object obj, long j, float f) {
        this.b.putFloat(obj, j, f);
    }

    public boolean n() {
        byte b = this.a;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        Unsafe unsafe = this.b;
        switch (b) {
            case 0:
                if (unsafe != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        cls3.getMethod("getInt", Object.class, cls2);
                        cls3.getMethod("putInt", Object.class, cls2, cls);
                        cls3.getMethod("getLong", Object.class, cls2);
                        cls3.getMethod("putLong", Object.class, cls2, cls2);
                        cls3.getMethod("getObject", Object.class, cls2);
                        cls3.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th) {
                        ro6.m(th);
                    }
                }
                return false;
            default:
                if (unsafe != null) {
                    try {
                        Class<?> cls4 = unsafe.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls2);
                        cls4.getMethod("putInt", Object.class, cls2, cls);
                        cls4.getMethod("getLong", Object.class, cls2);
                        cls4.getMethod("putLong", Object.class, cls2, cls2);
                        cls4.getMethod("getObject", Object.class, cls2);
                        cls4.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th2) {
                        so6.i(th2);
                    }
                }
                return false;
        }
    }

    public abstract boolean o();

    public abstract void p(long j, Object obj, byte b);

    public abstract boolean q(long j, Object obj);

    public abstract void r(Object obj, long j, boolean z);

    public abstract float s(long j, Object obj);

    public abstract void t(Object obj, long j, float f);

    public abstract double u(long j, Object obj);

    public abstract void v(Object obj, long j, double d);
}
