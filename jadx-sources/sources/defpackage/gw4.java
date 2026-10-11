package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gw4 implements bc4 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final u12 f;
    public static final u12 g;
    public static final i53 h;
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final hw4 d = new hw4(this);

    static {
        ku kuVar = new ku(1);
        HashMap hashMap = new HashMap();
        hashMap.put(cw4.class, kuVar);
        f = new u12("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        ku kuVar2 = new ku(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cw4.class, kuVar2);
        g = new u12("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        h = new i53((byte) 1);
    }

    public gw4(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public static int g(u12 u12Var) {
        cw4 cw4Var = (cw4) ((Annotation) u12Var.b.get(cw4.class));
        if (cw4Var != null) {
            return cw4Var.tag();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // defpackage.bc4
    public final bc4 a(u12 u12Var, Object obj) {
        e(u12Var, obj, true);
        return this;
    }

    public final void b(u12 u12Var, int i, boolean z) {
        if (!z || i != 0) {
            cw4 cw4Var = (cw4) ((Annotation) u12Var.b.get(cw4.class));
            if (cw4Var != null) {
                int ordinal = cw4Var.intEncoding().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        h((cw4Var.tag() << 3) | 5);
                        this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                        return;
                    }
                    h(cw4Var.tag() << 3);
                    h((i << 1) ^ (i >> 31));
                    return;
                }
                h(cw4Var.tag() << 3);
                h(i);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void c(u12 u12Var, long j, boolean z) {
        if (!z || j != 0) {
            cw4 cw4Var = (cw4) ((Annotation) u12Var.b.get(cw4.class));
            if (cw4Var != null) {
                int ordinal = cw4Var.intEncoding().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        h((cw4Var.tag() << 3) | 1);
                        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                        return;
                    }
                    h(cw4Var.tag() << 3);
                    i((j >> 63) ^ (j << 1));
                    return;
                }
                h(cw4Var.tag() << 3);
                i(j);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    @Override // defpackage.bc4
    public final bc4 d(u12 u12Var, long j) {
        c(u12Var, j, true);
        return this;
    }

    public final void e(u12 u12Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    h((g(u12Var) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(e);
                    h(bytes.length);
                    this.a.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(u12Var, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    f(h, u12Var, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != 0.0d) {
                    h((g(u12Var) << 3) | 1);
                    this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    h((g(u12Var) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                c(u12Var, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                b(u12Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                h((g(u12Var) << 3) | 2);
                h(bArr.length);
                this.a.write(bArr);
                return;
            }
            ac4 ac4Var = (ac4) this.b.get(obj.getClass());
            if (ac4Var != null) {
                f(ac4Var, u12Var, obj, z);
                return;
            }
            uq6 uq6Var = (uq6) this.c.get(obj.getClass());
            if (uq6Var != null) {
                hw4 hw4Var = this.d;
                hw4Var.a = false;
                hw4Var.c = u12Var;
                hw4Var.b = z;
                uq6Var.a(obj, hw4Var);
                return;
            }
            if (obj instanceof rk3) {
                b(u12Var, ((rk3) obj).x, true);
            } else if (obj instanceof Enum) {
                b(u12Var, ((Enum) obj).ordinal(), true);
            } else {
                f(q23.f, u12Var, obj, z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, wf3] */
    public final void f(ac4 ac4Var, u12 u12Var, Object obj, boolean z) {
        ?? outputStream = new OutputStream();
        outputStream.x = 0L;
        try {
            OutputStream outputStream2 = this.a;
            this.a = outputStream;
            try {
                ac4Var.a(obj, this);
                this.a = outputStream2;
                long j = outputStream.x;
                outputStream.close();
                if (z && j == 0) {
                    return;
                }
                h((g(u12Var) << 3) | 2);
                i(j);
                ac4Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.a;
            if (j != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    public final void i(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }
}
