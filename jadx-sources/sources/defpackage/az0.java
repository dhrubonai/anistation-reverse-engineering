package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class az0 extends d04 {
    public final ub2 A;
    public final ub2 B;
    public final e7 C;
    public final dz0 D;
    public final tt E;
    public final String F;
    public final ev2 x;
    public final kz4 y;
    public final jt z;

    public az0(ev2 ev2Var, kz4 kz4Var, jt jtVar, ub2 ub2Var, ub2 ub2Var2, e7 e7Var, dz0 dz0Var, tt ttVar, String str) {
        this.x = ev2Var;
        this.y = kz4Var;
        this.z = jtVar;
        this.A = ub2Var;
        this.B = ub2Var2;
        this.C = e7Var;
        this.D = dz0Var;
        this.E = ttVar;
        this.F = str;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        ux0 ux0Var;
        jt jtVar = this.z;
        kz4 kz4Var = this.y;
        ev2 ev2Var = this.x;
        kt ktVar = new kt(kz4Var, ev2Var, jtVar);
        qt qtVar = new qt(ktVar);
        qtVar.J = this.A;
        qtVar.K = this.B;
        qtVar.L = this.D;
        qtVar.M = this.E;
        qtVar.l(ktVar);
        cr5 cr5Var = ev2Var.o;
        if (cr5Var instanceof ux0) {
            ux0Var = (ux0) cr5Var;
        } else {
            ux0Var = null;
        }
        return new bz0(qtVar, this.C, this.D, this.F, ux0Var);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ux0 ux0Var;
        bz0 bz0Var = (bz0) xz3Var;
        long h = bz0Var.R.h();
        ux0 ux0Var2 = bz0Var.Q;
        jt jtVar = this.z;
        kz4 kz4Var = this.y;
        ev2 ev2Var = this.x;
        kt ktVar = new kt(kz4Var, ev2Var, jtVar);
        qt qtVar = bz0Var.R;
        qtVar.J = this.A;
        qtVar.K = this.B;
        dz0 dz0Var = this.D;
        qtVar.L = dz0Var;
        qtVar.M = this.E;
        qtVar.l(ktVar);
        boolean b = uq5.b(h, qtVar.h());
        bz0Var.L = this.C;
        cr5 cr5Var = ev2Var.o;
        if (cr5Var instanceof ux0) {
            ux0Var = (ux0) cr5Var;
        } else {
            ux0Var = null;
        }
        bz0Var.Q = ux0Var;
        bz0Var.M = dz0Var;
        bz0Var.N = 1.0f;
        bz0Var.O = true;
        String str = bz0Var.P;
        String str2 = this.F;
        if (!a34.i(str, str2)) {
            bz0Var.P = str2;
            z51.w(bz0Var);
        }
        boolean i = a34.i(ux0Var2, bz0Var.Q);
        if (!b || !i) {
            w65.E(bz0Var);
        }
        v94.y(bz0Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof az0) {
                az0 az0Var = (az0) obj;
                if (this.x.equals(az0Var.x) && this.y == az0Var.y && a34.i(this.z, az0Var.z) && a34.i(this.A, az0Var.A) && a34.i(this.B, az0Var.B) && a34.i(this.C, az0Var.C) && a34.i(this.D, az0Var.D) && Float.compare(1.0f, 1.0f) == 0 && a34.i(this.E, az0Var.E) && a34.i(this.F, az0Var.F)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + (this.x.hashCode() * 31)) * 31)) * 31)) * 31;
        int i = 0;
        ub2 ub2Var = this.B;
        if (ub2Var == null) {
            hashCode = 0;
        } else {
            hashCode = ub2Var.hashCode();
        }
        int g = zo5.g(qx1.b(1.0f, (this.D.hashCode() + ((this.C.hashCode() + qx1.c(1, (hashCode3 + hashCode) * 31, 31)) * 31)) * 31, 961), 31, true);
        tt ttVar = this.E;
        if (ttVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ttVar.hashCode();
        }
        int i2 = (g + hashCode2) * 31;
        String str = this.F;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.x);
        sb.append(", imageLoader=");
        sb.append(this.y);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.z);
        sb.append(", transform=");
        sb.append(this.A);
        sb.append(", onState=");
        sb.append(this.B);
        sb.append(", filterQuality=Low, alignment=");
        sb.append(this.C);
        sb.append(", contentScale=");
        sb.append(this.D);
        sb.append(", alpha=1.0, colorFilter=null, clipToBounds=true, previewHandler=");
        sb.append(this.E);
        sb.append(", contentDescription=");
        return h11.k(sb, this.F, ")");
    }
}
