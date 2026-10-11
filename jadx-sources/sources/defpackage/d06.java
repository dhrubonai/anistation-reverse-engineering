package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d06 extends bb4 {
    public final float O;
    public final float P;
    public final int Q;
    public final int R;

    public d06(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.O = f;
        this.P = f2;
        this.Q = i;
        this.R = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d06)) {
            return false;
        }
        d06 d06Var = (d06) obj;
        if (this.O == d06Var.O && this.P == d06Var.P && this.Q == d06Var.Q && this.R == d06Var.R) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return qx1.c(this.R, qx1.c(this.Q, qx1.b(this.P, Float.hashCode(this.O) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.Q;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i != 2) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        int i2 = this.R;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        return h11.l(qx1.t("Stroke(width=", this.O, ", miter=", this.P, ", cap="), str, ", join=", str2, ", pathEffect=null)");
    }
}
