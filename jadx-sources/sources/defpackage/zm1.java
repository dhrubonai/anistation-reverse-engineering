package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zm1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zm1) && vm1.c(10.0f, 10.0f) && vm1.c(40.0f, 40.0f) && vm1.c(10.0f, 10.0f) && vm1.c(40.0f, 40.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + qx1.b(40.0f, qx1.b(10.0f, qx1.b(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        String d = vm1.d(10.0f);
        String d2 = vm1.d(40.0f);
        return h11.l(h11.o("DpTouchBoundsExpansion(start=", d, ", top=", d2, ", end="), vm1.d(10.0f), ", bottom=", vm1.d(40.0f), ", isLayoutDirectionAware=true)");
    }
}
