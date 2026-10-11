package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rm0 extends d04 {
    public final boolean A;
    public final String B;
    public final m65 C;
    public final sb2 D;
    public final u34 x;
    public final by2 y;
    public final boolean z;

    public rm0(u34 u34Var, by2 by2Var, boolean z, boolean z2, String str, m65 m65Var, sb2 sb2Var) {
        this.x = u34Var;
        this.y = by2Var;
        this.z = z;
        this.A = z2;
        this.B = str;
        this.C = m65Var;
        this.D = sb2Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new k0(this.x, this.y, this.z, this.A, this.B, this.C, this.D);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((um0) xz3Var).q1(this.x, this.y, this.z, this.A, this.B, this.C, this.D);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rm0.class == obj.getClass()) {
                rm0 rm0Var = (rm0) obj;
                if (!a34.i(this.x, rm0Var.x) || !a34.i(this.y, rm0Var.y) || this.z != rm0Var.z || this.A != rm0Var.A || !a34.i(this.B, rm0Var.B) || !a34.i(this.C, rm0Var.C) || this.D != rm0Var.D) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        u34 u34Var = this.x;
        if (u34Var != null) {
            i = u34Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        by2 by2Var = this.y;
        if (by2Var != null) {
            i2 = by2Var.hashCode();
        } else {
            i2 = 0;
        }
        int g = zo5.g(zo5.g((i5 + i2) * 31, 31, this.z), 31, this.A);
        String str = this.B;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (g + i3) * 31;
        m65 m65Var = this.C;
        if (m65Var != null) {
            i4 = Integer.hashCode(m65Var.a);
        }
        return this.D.hashCode() + ((i6 + i4) * 31);
    }
}
