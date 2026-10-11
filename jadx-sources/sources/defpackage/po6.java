package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class po6 extends qo6 {
    @Override // defpackage.qo6
    public final void a(long j, byte[] bArr, long j2, long j3) {
        this.b.copyMemory((Object) null, j, bArr, ro6.f + j2, j3);
    }

    @Override // defpackage.qo6
    public final void b(byte[] bArr, long j, long j2, long j3) {
        this.b.copyMemory(bArr, ro6.f + j, (Object) null, j2, j3);
    }

    @Override // defpackage.qo6
    public final boolean n() {
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
            ro6.m(th);
            return false;
        }
    }

    @Override // defpackage.qo6
    public final boolean o() {
        Unsafe unsafe = this.b;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (ro6.d() != null) {
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
                        ro6.m(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                ro6.m(th2);
            }
        }
        return false;
    }
}
