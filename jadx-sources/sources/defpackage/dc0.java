package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class dc0 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final Class b;
    public static final long c;

    static {
        Class<?> cls;
        long objectFieldOffset;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        b = cls;
        if (cls != null) {
            if (ro6.e) {
                objectFieldOffset = ro6.c.b.objectFieldOffset(cls.getDeclaredField("channel"));
                c = objectFieldOffset;
            }
        }
        objectFieldOffset = -1;
        c = objectFieldOffset;
    }
}
