package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hx3 {
    public final mu2 a;
    public final Map b;

    public hx3(mu2 mu2Var, Map map) {
        this.a = mu2Var;
        this.b = oi4.J(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hx3) {
            hx3 hx3Var = (hx3) obj;
            if (a34.i(this.a, hx3Var.a) && a34.i(this.b, hx3Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
