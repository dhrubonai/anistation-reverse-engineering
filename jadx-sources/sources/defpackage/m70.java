package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class m70 {
    public pc a = null;
    public t9 b = null;
    public xg0 c = null;
    public id d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m70) {
                m70 m70Var = (m70) obj;
                if (!a34.i(this.a, m70Var.a) || !a34.i(this.b, m70Var.b) || !a34.i(this.c, m70Var.c) || !a34.i(this.d, m70Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        pc pcVar = this.a;
        int i = 0;
        if (pcVar == null) {
            hashCode = 0;
        } else {
            hashCode = pcVar.hashCode();
        }
        int i2 = hashCode * 31;
        t9 t9Var = this.b;
        if (t9Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = t9Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        xg0 xg0Var = this.c;
        if (xg0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = xg0Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        id idVar = this.d;
        if (idVar != null) {
            i = idVar.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
