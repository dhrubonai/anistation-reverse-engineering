package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class db1 extends kb1 implements Comparable {
    public final int B;
    public final boolean C;
    public final String D;
    public final hb1 E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final int M;
    public final int N;
    public final boolean O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final boolean T;
    public final boolean U;
    public final boolean V;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3 A[LOOP:1: B:32:0x00f0->B:34:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public db1(int r8, defpackage.yg6 r9, int r10, defpackage.hb1 r11, int r12, boolean r13, defpackage.za1 r14, int r15) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db1.<init>(int, yg6, int, hb1, int, boolean, za1, int):void");
    }

    @Override // defpackage.kb1
    public final int a() {
        return this.B;
    }

    @Override // defpackage.kb1
    public final boolean b(kb1 kb1Var) {
        int i;
        String str;
        db1 db1Var = (db1) kb1Var;
        ea2 ea2Var = db1Var.A;
        this.E.getClass();
        ea2 ea2Var2 = this.A;
        int i2 = ea2Var2.J;
        if (i2 != -1 && i2 == ea2Var.J) {
            if ((this.K || ((str = ea2Var2.p) != null && TextUtils.equals(str, ea2Var.p))) && (i = ea2Var2.L) != -1 && i == ea2Var.L && this.T == db1Var.T && this.U == db1Var.U) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(db1 db1Var) {
        qg4 qg4Var;
        qg4 a;
        boolean z = this.F;
        boolean z2 = this.C;
        if (z2 && z) {
            a = mb1.k;
            qg4Var = a;
        } else {
            qg4 qg4Var2 = mb1.k;
            qg4Var = qg4Var2;
            a = qg4Var2.a();
        }
        boolean z3 = db1Var.F;
        int i = db1Var.R;
        wq0 d = wq0.a.d(z, z3);
        Integer valueOf = Integer.valueOf(this.H);
        Integer valueOf2 = Integer.valueOf(db1Var.H);
        w64 w64Var = w64.z;
        wq0 c = d.c(valueOf, valueOf2, w64Var).a(this.G, db1Var.G).a(this.I, db1Var.I).c(Integer.valueOf(this.J), Integer.valueOf(db1Var.J), w64Var).d(this.O, db1Var.O).d(this.L, db1Var.L).c(Integer.valueOf(this.M), Integer.valueOf(db1Var.M), w64Var).a(this.N, db1Var.N).d(z2, db1Var.C).c(Integer.valueOf(this.S), Integer.valueOf(db1Var.S), w64Var);
        boolean z4 = this.E.F;
        int i2 = this.R;
        if (z4) {
            c = c.c(Integer.valueOf(i2), Integer.valueOf(i), qg4Var.a());
        }
        wq0 c2 = c.d(this.T, db1Var.T).d(this.U, db1Var.U).d(this.V, db1Var.V).c(Integer.valueOf(this.P), Integer.valueOf(db1Var.P), a).c(Integer.valueOf(this.Q), Integer.valueOf(db1Var.Q), a);
        if (Objects.equals(this.D, db1Var.D)) {
            c2 = c2.c(Integer.valueOf(i2), Integer.valueOf(i), a);
        }
        return c2.f();
    }
}
