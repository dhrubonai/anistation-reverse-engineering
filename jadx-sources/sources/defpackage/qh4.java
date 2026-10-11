package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qh4 implements gm0 {
    public final Class x;

    public qh4(Class cls) {
        cls.getClass();
        this.x = cls;
    }

    @Override // defpackage.gm0
    public final Class d() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qh4) {
            if (a34.i(this.x, ((qh4) obj).x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return this.x.toString() + " (Kotlin reflection is not available)";
    }
}
