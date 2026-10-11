package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z45 implements Serializable {
    public final Object x;

    public /* synthetic */ z45(Object obj) {
        this.x = obj;
    }

    public static final /* synthetic */ z45 a(Object obj) {
        return new z45(obj);
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof y45) {
            return ((y45) obj).x;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof y45);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z45) {
            if (!a34.i(this.x, ((z45) obj).x)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.x;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.x;
        if (obj instanceof y45) {
            return ((y45) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
