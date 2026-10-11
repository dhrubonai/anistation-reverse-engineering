package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oo6 extends qo6 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo6(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 1);
        this.c = b;
    }

    @Override // defpackage.qo6
    public final boolean c(long j, Object obj) {
        switch (this.c) {
            case 0:
                if (so6.g) {
                    return so6.e(j, obj);
                }
                if (((byte) ((so6.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (so6.g) {
                    return so6.e(j, obj);
                }
                if (((byte) ((so6.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                return false;
            default:
                return this.b.getBoolean(obj, j);
        }
    }

    @Override // defpackage.qo6
    public final double f(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            default:
                return this.b.getDouble(obj, j);
        }
    }

    @Override // defpackage.qo6
    public final float g(long j, Object obj) {
        switch (this.c) {
            case 0:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            default:
                return this.b.getFloat(obj, j);
        }
    }

    @Override // defpackage.qo6
    public final void i(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (so6.g) {
                    so6.k(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    so6.l(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
            case 1:
                if (so6.g) {
                    so6.k(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    so6.l(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                this.b.putBoolean(obj, j, z);
                return;
        }
    }

    @Override // defpackage.qo6
    public final void k(long j, Object obj, byte b) {
        switch (this.c) {
            case 0:
                if (so6.g) {
                    so6.k(j, obj, b);
                    return;
                } else {
                    so6.l(j, obj, b);
                    return;
                }
            case 1:
                if (so6.g) {
                    so6.k(j, obj, b);
                    return;
                } else {
                    so6.l(j, obj, b);
                    return;
                }
            default:
                this.b.putByte(obj, j, b);
                return;
        }
    }

    @Override // defpackage.qo6
    public final void l(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
            case 1:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                this.b.putDouble(obj, j, d);
                return;
        }
    }

    @Override // defpackage.qo6
    public final void m(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                return;
            case 1:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                return;
            default:
                this.b.putFloat(obj, j, f);
                return;
        }
    }

    @Override // defpackage.qo6
    public boolean n() {
        switch (this.c) {
            case 2:
                if (!super.n()) {
                    return false;
                }
                try {
                    Class<?> cls = this.b.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    so6.i(th);
                    return false;
                }
            default:
                return super.n();
        }
    }

    @Override // defpackage.qo6
    public final boolean o() {
        switch (this.c) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = this.b;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (so6.c() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        so6.i(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    so6.i(th2);
                    return false;
                }
        }
    }
}
