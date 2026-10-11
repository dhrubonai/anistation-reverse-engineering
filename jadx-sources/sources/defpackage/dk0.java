package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dk0 {
    public static final ck0 b = new Object();
    public final Object a;

    public /* synthetic */ dk0(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (!(obj instanceof ck0)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dk0) {
            if (!a34.i(this.a, ((dk0) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof bk0) {
            return ((bk0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
