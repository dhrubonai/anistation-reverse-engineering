package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class u93 {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("android.os.Build");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
    }

    public static final yk3 a(String str) {
        if (!a) {
            return bl3.b(str);
        }
        return new t93(str);
    }
}
