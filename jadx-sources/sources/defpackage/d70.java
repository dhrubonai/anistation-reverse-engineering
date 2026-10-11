package defpackage;

import android.graphics.RenderEffect;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d70 {
    public RenderEffect a;
    public final float b;
    public final float c;
    public final int d;

    public d70(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d70) {
                d70 d70Var = (d70) obj;
                if (this.b == d70Var.b && this.c == d70Var.c && this.d == d70Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qx1.b(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i == 0) {
            str = "Clamp";
        } else if (i == 1) {
            str = "Repeated";
        } else if (i == 2) {
            str = "Mirror";
        } else if (i == 3) {
            str = "Decal";
        } else {
            str = "Unknown";
        }
        return h11.k(qx1.t("BlurEffect(renderEffect=null, radiusX=", this.b, ", radiusY=", this.c, ", edgeTreatment="), str, ")");
    }
}
