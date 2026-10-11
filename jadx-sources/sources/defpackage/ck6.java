package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ck6 implements Serializable {
    public final Object x;
    public final Object y;
    public final Object z;

    public ck6(Object obj, Object obj2, Object obj3) {
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck6)) {
            return false;
        }
        ck6 ck6Var = (ck6) obj;
        if (a34.i(this.x, ck6Var.x) && a34.i(this.y, ck6Var.y) && a34.i(this.z, ck6Var.z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Object obj = this.x;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.y;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj3 = this.z;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ')';
    }
}
