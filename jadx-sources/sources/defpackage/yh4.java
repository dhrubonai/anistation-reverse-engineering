package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yh4 extends d04 {
    public final float A;
    public final w60 B;
    public final xh4 x;
    public final e7 y;
    public final dz0 z;

    public yh4(xh4 xh4Var, e7 e7Var, dz0 dz0Var, float f, w60 w60Var) {
        this.x = xh4Var;
        this.y = e7Var;
        this.z = dz0Var;
        this.A = f;
        this.B = w60Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, zh4] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = true;
        xz3Var.N = this.y;
        xz3Var.O = this.z;
        xz3Var.P = this.A;
        xz3Var.Q = this.B;
        return xz3Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        boolean z;
        zh4 zh4Var = (zh4) xz3Var;
        boolean z2 = zh4Var.M;
        xh4 xh4Var = this.x;
        if (z2 && uq5.b(zh4Var.L.h(), xh4Var.h())) {
            z = false;
        } else {
            z = true;
        }
        zh4Var.L = xh4Var;
        zh4Var.M = true;
        zh4Var.N = this.y;
        zh4Var.O = this.z;
        zh4Var.P = this.A;
        zh4Var.Q = this.B;
        if (z) {
            w65.E(zh4Var);
        }
        v94.y(zh4Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yh4) {
                yh4 yh4Var = (yh4) obj;
                if (!a34.i(this.x, yh4Var.x) || !a34.i(this.y, yh4Var.y) || !this.z.equals(yh4Var.z) || Float.compare(this.A, yh4Var.A) != 0 || !a34.i(this.B, yh4Var.B)) {
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
        int b = qx1.b(this.A, (this.z.hashCode() + ((this.y.hashCode() + zo5.g(this.x.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        w60 w60Var = this.B;
        if (w60Var == null) {
            hashCode = 0;
        } else {
            hashCode = w60Var.hashCode();
        }
        return b + hashCode;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.x + ", sizeToIntrinsics=true, alignment=" + this.y + ", contentScale=" + this.z + ", alpha=" + this.A + ", colorFilter=" + this.B + ")";
    }
}
