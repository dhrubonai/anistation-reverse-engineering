package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r70 extends d04 {
    public final float x;
    public final su5 y;
    public final om5 z;

    public r70(float f, su5 su5Var, om5 om5Var) {
        this.x = f;
        this.y = su5Var;
        this.z = om5Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new q70(this.x, this.y, this.z);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        q70 q70Var = (q70) xz3Var;
        float f = q70Var.O;
        ve0 ve0Var = q70Var.R;
        float f2 = this.x;
        if (!vm1.c(f, f2)) {
            q70Var.O = f2;
            ve0Var.a1();
        }
        su5 su5Var = q70Var.P;
        su5 su5Var2 = this.y;
        if (!a34.i(su5Var, su5Var2)) {
            q70Var.P = su5Var2;
            ve0Var.a1();
        }
        om5 om5Var = q70Var.Q;
        om5 om5Var2 = this.z;
        if (!a34.i(om5Var, om5Var2)) {
            q70Var.Q = om5Var2;
            ve0Var.a1();
            z51.w(q70Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r70) {
                r70 r70Var = (r70) obj;
                if (!vm1.c(this.x, r70Var.x) || !this.y.equals(r70Var.y) || !a34.i(this.z, r70Var.z)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.z.hashCode() + ((this.y.hashCode() + (Float.hashCode(this.x) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + vm1.d(this.x) + ", brush=" + this.y + ", shape=" + this.z + ")";
    }
}
