package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ca3 {
    public static final ca3 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [ca3, java.lang.Object] */
    static {
        ?? obj = new Object();
        if (vm1.b(0.0f, 0.0f) < 0 || vm1.b(0.0f, 0.0f) < 0 || vm1.b(0.0f, 0.0f) < 0 || vm1.b(0.0f, 0.0f) < 0) {
            dz2.a("Layer outsets must be non-negative");
        }
        a = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ca3) || !vm1.c(0.0f, 0.0f) || !vm1.c(0.0f, 0.0f) || !vm1.c(0.0f, 0.0f) || !vm1.c(0.0f, 0.0f)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + qx1.b(0.0f, qx1.b(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String d = vm1.d(0.0f);
        String d2 = vm1.d(0.0f);
        return h11.l(h11.o("LayerOutsets(left=", d, ", top=", d2, ", right="), vm1.d(0.0f), ", bottom=", vm1.d(0.0f), ")");
    }
}
