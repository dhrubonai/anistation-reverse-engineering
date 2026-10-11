package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b85 implements a85 {
    public static final b85 a = new Object();

    public final yz3 a(float f, boolean z) {
        if (f <= 0.0d) {
            cz2.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return new ob3(f, z);
    }
}
