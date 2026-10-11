package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class af6 implements or3, nr3 {
    public final or3 x;
    public final long y;
    public nr3 z;

    public af6(or3 or3Var, long j) {
        this.x = or3Var;
        this.y = j;
    }

    @Override // defpackage.nr3
    public final void a(or3 or3Var) {
        nr3 nr3Var = this.z;
        nr3Var.getClass();
        nr3Var.a(this);
    }

    @Override // defpackage.or3
    public final long b(long j) {
        long j2;
        long j3 = this.y;
        if (j == Long.MIN_VALUE) {
            j2 = Long.MIN_VALUE;
        } else {
            j2 = j - j3;
        }
        long b = this.x.b(j2);
        if (b == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return b + j3;
    }

    @Override // defpackage.or3
    public final long c(jz1[] jz1VarArr, boolean[] zArr, g95[] g95VarArr, boolean[] zArr2, long j) {
        g95[] g95VarArr2 = new g95[g95VarArr.length];
        int i = 0;
        while (true) {
            g95 g95Var = null;
            if (i >= g95VarArr.length) {
                break;
            }
            ze6 ze6Var = (ze6) g95VarArr[i];
            if (ze6Var != null) {
                g95Var = ze6Var.x;
            }
            g95VarArr2[i] = g95Var;
            i++;
        }
        or3 or3Var = this.x;
        long j2 = this.y;
        long c = or3Var.c(jz1VarArr, zArr, g95VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < g95VarArr.length; i2++) {
            g95 g95Var2 = g95VarArr2[i2];
            if (g95Var2 == null) {
                g95VarArr[i2] = null;
            } else {
                g95 g95Var3 = g95VarArr[i2];
                if (g95Var3 == null || ((ze6) g95Var3).x != g95Var2) {
                    g95VarArr[i2] = new ze6(g95Var2, j2);
                }
            }
        }
        return c + j2;
    }

    @Override // defpackage.ui5
    public final boolean d() {
        return this.x.d();
    }

    @Override // defpackage.or3
    public final void e() {
        String str = eq6.a;
        this.x.e();
    }

    @Override // defpackage.ui5
    public final long f() {
        long f = this.x.f();
        if (f == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return f + this.y;
    }

    @Override // defpackage.ti5
    public final void g(ui5 ui5Var) {
        nr3 nr3Var = this.z;
        nr3Var.getClass();
        nr3Var.g(this);
    }

    @Override // defpackage.or3
    public final long h(long j, if5 if5Var) {
        long j2 = this.y;
        return this.x.h(j - j2, if5Var) + j2;
    }

    @Override // defpackage.or3
    public final void i() {
        this.x.i();
    }

    @Override // defpackage.or3
    public final long j(long j) {
        long j2 = this.y;
        return this.x.j(j - j2) + j2;
    }

    @Override // defpackage.or3
    public final void l(long j) {
        this.x.l(j - this.y);
    }

    @Override // defpackage.or3
    public final List m(ArrayList arrayList) {
        return this.x.m(arrayList);
    }

    @Override // defpackage.or3
    public final long n() {
        long n = this.x.n();
        if (n == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n + this.y;
    }

    @Override // defpackage.or3
    public final void o(nr3 nr3Var, long j) {
        this.z = nr3Var;
        this.x.o(this, j - this.y);
    }

    @Override // defpackage.or3
    public final zg6 p() {
        return this.x.p();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pj3, java.lang.Object] */
    @Override // defpackage.ui5
    public final boolean q(qj3 qj3Var) {
        ?? obj = new Object();
        long j = qj3Var.a;
        obj.b = qj3Var.b;
        obj.c = qj3Var.c;
        obj.a = j - this.y;
        return this.x.q(new qj3(obj));
    }

    @Override // defpackage.ui5
    public final long s() {
        long s = this.x.s();
        if (s == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return s + this.y;
    }

    @Override // defpackage.ui5
    public final void v(long j) {
        this.x.v(j - this.y);
    }
}
