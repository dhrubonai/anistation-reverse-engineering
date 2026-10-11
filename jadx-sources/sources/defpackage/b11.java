package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b11 extends d04 {
    public final boolean A;
    public final h12 B;
    public final jb6 C;
    public final yv2 D;
    public final w72 E;
    public final di6 x;
    public final mc6 y;
    public final uf3 z;

    public b11(di6 di6Var, mc6 mc6Var, uf3 uf3Var, boolean z, h12 h12Var, jb6 jb6Var, yv2 yv2Var, w72 w72Var) {
        this.x = di6Var;
        this.y = mc6Var;
        this.z = uf3Var;
        this.A = z;
        this.B = h12Var;
        this.C = jb6Var;
        this.D = yv2Var;
        this.E = w72Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, e11, zc1] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? zc1Var = new zc1();
        zc1Var.N = this.x;
        zc1Var.O = this.y;
        zc1Var.P = this.z;
        zc1Var.Q = this.A;
        zc1Var.R = this.B;
        jb6 jb6Var = this.C;
        zc1Var.S = jb6Var;
        zc1Var.T = this.D;
        zc1Var.U = this.E;
        jb6Var.f = new c11(zc1Var, (byte) 4);
        return zc1Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        e11 e11Var = (e11) xz3Var;
        boolean z = e11Var.Q;
        yv2 yv2Var = e11Var.T;
        jb6 jb6Var = e11Var.S;
        e11Var.N = this.x;
        mc6 mc6Var = this.y;
        e11Var.O = mc6Var;
        e11Var.P = this.z;
        boolean z2 = this.A;
        e11Var.Q = z2;
        e11Var.R = this.B;
        jb6 jb6Var2 = this.C;
        e11Var.S = jb6Var2;
        yv2 yv2Var2 = this.D;
        e11Var.T = yv2Var2;
        e11Var.U = this.E;
        if (z2 != z || z2 != z || !a34.i(yv2Var2, yv2Var) || !nd6.d(mc6Var.b)) {
            z51.w(e11Var);
        }
        if (jb6Var2 != jb6Var) {
            jb6Var2.f = new c11(e11Var, (byte) 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b11) {
                b11 b11Var = (b11) obj;
                if (this.x.equals(b11Var.x) && a34.i(this.y, b11Var.y) && this.z == b11Var.z && this.A == b11Var.A && this.B.equals(b11Var.B) && this.C == b11Var.C && a34.i(this.D, b11Var.D) && a34.i(this.E, b11Var.E)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + zo5.g(zo5.g(zo5.g((this.z.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.A), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.x + ", value=" + this.y + ", state=" + this.z + ", readOnly=false, enabled=" + this.A + ", isPassword=false, offsetMapping=" + this.B + ", manager=" + this.C + ", imeOptions=" + this.D + ", focusRequester=" + this.E + ")";
    }
}
