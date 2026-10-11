package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f86 extends d04 {
    public final ub2 A;
    public final int B;
    public final boolean C;
    public final int D;
    public final int E;
    public final List F;
    public final ub2 G;
    public final ub2 H;
    public final ko x;
    public final xd6 y;
    public final p82 z;

    public f86(ko koVar, xd6 xd6Var, p82 p82Var, ub2 ub2Var, int i, boolean z, int i2, int i3, List list, ub2 ub2Var2, ub2 ub2Var3) {
        this.x = koVar;
        this.y = xd6Var;
        this.z = p82Var;
        this.A = ub2Var;
        this.B = i;
        this.C = z;
        this.D = i2;
        this.E = i3;
        this.F = list;
        this.G = ub2Var2;
        this.H = ub2Var3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, i86] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? xz3Var = new xz3();
        xz3Var.L = this.x;
        xz3Var.M = this.y;
        xz3Var.N = this.z;
        xz3Var.O = this.A;
        xz3Var.P = this.B;
        xz3Var.Q = this.C;
        xz3Var.R = this.D;
        xz3Var.S = this.E;
        xz3Var.T = this.F;
        xz3Var.U = this.G;
        xz3Var.V = this.H;
        return xz3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    @Override // defpackage.d04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.xz3 r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f86.b(xz3):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f86) {
                f86 f86Var = (f86) obj;
                if (a34.i(this.x, f86Var.x) && a34.i(this.y, f86Var.y) && a34.i(this.F, f86Var.F) && a34.i(this.z, f86Var.z) && this.A == f86Var.A && this.H == f86Var.H && this.B == f86Var.B && this.C == f86Var.C && this.D == f86Var.D && this.E == f86Var.E && this.G == f86Var.G) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.z.hashCode() + zo5.h(this.y, this.x.hashCode() * 31, 31)) * 31;
        int i4 = 0;
        ub2 ub2Var = this.A;
        if (ub2Var != null) {
            i = ub2Var.hashCode();
        } else {
            i = 0;
        }
        int g = (((zo5.g(qx1.c(this.B, (hashCode + i) * 31, 31), 31, this.C) + this.D) * 31) + this.E) * 31;
        List list = this.F;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (g + i2) * 31;
        ub2 ub2Var2 = this.G;
        if (ub2Var2 != null) {
            i3 = ub2Var2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 29791;
        ub2 ub2Var3 = this.H;
        if (ub2Var3 != null) {
            i4 = ub2Var3.hashCode();
        }
        return i6 + i4;
    }
}
