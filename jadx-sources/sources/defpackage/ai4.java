package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ai4 implements Serializable {
    public final Object x;
    public final Object y;

    public ai4(Object obj, Object obj2) {
        this.x = obj;
        this.y = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4)) {
            return false;
        }
        ai4 ai4Var = (ai4) obj;
        if (a34.i(this.x, ai4Var.x) && a34.i(this.y, ai4Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.x;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.y;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "(" + this.x + ", " + this.y + ')';
    }
}
