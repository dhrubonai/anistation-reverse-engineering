package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wn3 implements or3, nr3 {
    public lw3 A;
    public or3 B;
    public nr3 C;
    public long D = -9223372036854775807L;
    public boolean E;
    public final jw3 x;
    public final long y;
    public final l7 z;

    public wn3(jw3 jw3Var, l7 l7Var, long j) {
        this.x = jw3Var;
        this.z = l7Var;
        this.y = j;
    }

    @Override // defpackage.nr3
    public final void a(or3 or3Var) {
        nr3 nr3Var = this.C;
        String str = eq6.a;
        nr3Var.a(this);
    }

    @Override // defpackage.or3
    public final long b(long j) {
        or3 or3Var = this.B;
        if (or3Var != null) {
            return or3Var.b(j);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.or3
    public final long c(jz1[] jz1VarArr, boolean[] zArr, g95[] g95VarArr, boolean[] zArr2, long j) {
        long j2 = this.D;
        if (j2 != -9223372036854775807L && j == this.y) {
            j = j2;
        }
        this.D = -9223372036854775807L;
        or3 or3Var = this.B;
        String str = eq6.a;
        return or3Var.c(jz1VarArr, zArr, g95VarArr, zArr2, j);
    }

    @Override // defpackage.ui5
    public final boolean d() {
        or3 or3Var = this.B;
        if (or3Var != null && or3Var.d()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.or3
    public final void e() {
        this.E = true;
        or3 or3Var = this.B;
        if (or3Var != null) {
            or3Var.e();
        }
    }

    @Override // defpackage.ui5
    public final long f() {
        or3 or3Var = this.B;
        String str = eq6.a;
        return or3Var.f();
    }

    @Override // defpackage.ti5
    public final void g(ui5 ui5Var) {
        nr3 nr3Var = this.C;
        String str = eq6.a;
        nr3Var.g(this);
    }

    @Override // defpackage.or3
    public final long h(long j, if5 if5Var) {
        or3 or3Var = this.B;
        String str = eq6.a;
        return or3Var.h(j, if5Var);
    }

    @Override // defpackage.or3
    public final void i() {
        or3 or3Var = this.B;
        if (or3Var != null) {
            or3Var.i();
            return;
        }
        lw3 lw3Var = this.A;
        if (lw3Var != null) {
            lw3Var.d();
        }
    }

    @Override // defpackage.or3
    public final long j(long j) {
        or3 or3Var = this.B;
        String str = eq6.a;
        return or3Var.j(j);
    }

    public final void k(jw3 jw3Var) {
        long j = this.D;
        if (j == -9223372036854775807L) {
            j = this.y;
        }
        lw3 lw3Var = this.A;
        lw3Var.getClass();
        or3 b = lw3Var.b(jw3Var, this.z, j);
        this.B = b;
        if (this.E) {
            b.e();
        }
        if (this.C != null) {
            this.B.o(this, j);
        }
    }

    @Override // defpackage.or3
    public final void l(long j) {
        or3 or3Var = this.B;
        String str = eq6.a;
        or3Var.l(j);
    }

    @Override // defpackage.or3
    public final List m(ArrayList arrayList) {
        or3 or3Var = this.B;
        String str = eq6.a;
        return or3Var.m(arrayList);
    }

    @Override // defpackage.or3
    public final long n() {
        or3 or3Var = this.B;
        String str = eq6.a;
        return or3Var.n();
    }

    @Override // defpackage.or3
    public final void o(nr3 nr3Var, long j) {
        this.C = nr3Var;
        or3 or3Var = this.B;
        if (or3Var != null) {
            long j2 = this.D;
            if (j2 == -9223372036854775807L) {
                j2 = this.y;
            }
            or3Var.o(this, j2);
        }
    }

    @Override // defpackage.or3
    public final zg6 p() {
        or3 or3Var = this.B;
        String str = eq6.a;
        return or3Var.p();
    }

    @Override // defpackage.ui5
    public final boolean q(qj3 qj3Var) {
        or3 or3Var = this.B;
        if (or3Var != null && or3Var.q(qj3Var)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ui5
    public final long s() {
        or3 or3Var = this.B;
        String str = eq6.a;
        return or3Var.s();
    }

    @Override // defpackage.ui5
    public final void v(long j) {
        or3 or3Var = this.B;
        String str = eq6.a;
        or3Var.v(j);
    }
}
