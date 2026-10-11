package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vm1 implements Comparable {
    public final float x;

    public /* synthetic */ vm1(float f) {
        this.x = f;
    }

    public static final /* synthetic */ vm1 a(float f) {
        return new vm1(f);
    }

    public static int b(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            return Float.compare(f, f2);
        }
        return 0;
    }

    public static final boolean c(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public static String d(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.x, ((vm1) obj).x);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vm1) {
            if (Float.compare(this.x, ((vm1) obj).x) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.x);
    }

    public final String toString() {
        return d(this.x);
    }
}
