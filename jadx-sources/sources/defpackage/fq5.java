package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fq5 implements or3, kj3 {
    public final eb2 A;
    public final zg6 B;
    public final ArrayList C = new ArrayList();
    public final dn0 D;
    public final ea2 E;
    public boolean F;
    public byte[] G;
    public int H;
    public final v41 x;
    public final o41 y;
    public final n71 z;

    public fq5(v41 v41Var, o41 o41Var, n71 n71Var, ea2 ea2Var, q18 q18Var, eb2 eb2Var, l04 l04Var) {
        dn0 dn0Var;
        this.x = v41Var;
        this.y = o41Var;
        this.z = n71Var;
        this.E = ea2Var;
        this.A = eb2Var;
        this.B = new zg6(new yg6("", ea2Var));
        if (l04Var != null) {
            dn0Var = new dn0(l04Var, (byte) 2);
        } else {
            dn0Var = new dn0("SingleSampleMediaPeriod", (byte) 2);
        }
        this.D = dn0Var;
    }

    @Override // defpackage.kj3
    public final q03 B(mj3 mj3Var, long j, long j2, IOException iOException, int i) {
        long min;
        boolean z;
        q03 q03Var;
        eq5 eq5Var = (eq5) mj3Var;
        iy5 iy5Var = eq5Var.c;
        hj3 hj3Var = new hj3(eq5Var.a, eq5Var.b, j);
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        String str = eq6.a;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof bj4) || (th instanceof FileNotFoundException) || (th instanceof lq2) || (th instanceof oj3) || ((th instanceof s41) && ((s41) th).x == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
        boolean z2 = false;
        if (min != -9223372036854775807L && i < 3) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            kb0.P("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.F = true;
            q03Var = dn0.E;
        } else if (min != -9223372036854775807L) {
            q03Var = new q03(0, min);
        } else {
            q03Var = dn0.F;
        }
        int i2 = q03Var.x;
        if (i2 == 0 || i2 == 1) {
            z2 = true;
        }
        this.A.r(ij3Var, 1, -1, this.E, 0, null, 0L, -9223372036854775807L, iOException, !z2);
        return q03Var;
    }

    @Override // defpackage.or3
    public final long c(jz1[] jz1VarArr, boolean[] zArr, g95[] g95VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < jz1VarArr.length; i++) {
            g95 g95Var = g95VarArr[i];
            ArrayList arrayList = this.C;
            if (g95Var != null && (jz1VarArr[i] == null || !zArr[i])) {
                arrayList.remove(g95Var);
                g95VarArr[i] = null;
            }
            if (g95VarArr[i] == null && jz1VarArr[i] != null) {
                dq5 dq5Var = new dq5(this);
                arrayList.add(dq5Var);
                g95VarArr[i] = dq5Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.ui5
    public final boolean d() {
        return this.D.F();
    }

    @Override // defpackage.ui5
    public final long f() {
        if (!this.F && !this.D.F()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.kj3
    public final void g(mj3 mj3Var, long j, long j2, boolean z) {
        eq5 eq5Var = (eq5) mj3Var;
        iy5 iy5Var = eq5Var.c;
        hj3 hj3Var = new hj3(eq5Var.a, eq5Var.b, j);
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        this.A.p(new ij3(hj3Var), 1, -1, null, 0, null, 0L, -9223372036854775807L);
    }

    @Override // defpackage.or3
    public final long j(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i < arrayList.size()) {
                dq5 dq5Var = (dq5) arrayList.get(i);
                if (dq5Var.x == 2) {
                    dq5Var.x = (byte) 1;
                }
                i++;
            } else {
                return j;
            }
        }
    }

    @Override // defpackage.kj3
    public final void k(mj3 mj3Var, long j, long j2) {
        eq5 eq5Var = (eq5) mj3Var;
        this.H = (int) eq5Var.c.y;
        byte[] bArr = eq5Var.d;
        bArr.getClass();
        this.G = bArr;
        this.F = true;
        iy5 iy5Var = eq5Var.c;
        hj3 hj3Var = new hj3(eq5Var.a, eq5Var.b, j);
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = this.H;
        this.A.q(new ij3(hj3Var), 1, -1, this.E, 0, null, 0L, -9223372036854775807L);
    }

    @Override // defpackage.or3
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.or3
    public final void o(nr3 nr3Var, long j) {
        nr3Var.a(this);
    }

    @Override // defpackage.or3
    public final zg6 p() {
        return this.B;
    }

    @Override // defpackage.ui5
    public final boolean q(qj3 qj3Var) {
        if (!this.F) {
            dn0 dn0Var = this.D;
            if (!dn0Var.F() && ((IOException) dn0Var.A) == null) {
                q41 H = this.y.H();
                n71 n71Var = this.z;
                if (n71Var != null) {
                    H.z(n71Var);
                }
                dn0Var.T(new eq5(H, this.x), this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.kj3
    public final void r(mj3 mj3Var, long j, long j2, int i) {
        eq5 eq5Var = (eq5) mj3Var;
        iy5 iy5Var = eq5Var.c;
        hj3 hj3Var = new hj3(eq5Var.a, eq5Var.b, j);
        if (i != 0) {
            hj3Var.f = iy5Var.z;
            hj3Var.g = iy5Var.A;
            hj3Var.c = j2;
            hj3Var.d = iy5Var.y;
        }
        this.A.x(new ij3(hj3Var), 1, -1, this.E, 0, null, 0L, -9223372036854775807L, i);
    }

    @Override // defpackage.ui5
    public final long s() {
        if (this.F) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // defpackage.or3
    public final void i() {
    }

    @Override // defpackage.or3
    public final void l(long j) {
    }

    @Override // defpackage.ui5
    public final void v(long j) {
    }

    @Override // defpackage.or3
    public final long h(long j, if5 if5Var) {
        return j;
    }
}
