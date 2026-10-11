package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ib1 extends kb1 implements Comparable {
    public final int B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;

    public ib1(int i, yg6 yg6Var, int i2, hb1 hb1Var, int i3, String str, String str2) {
        super(i, yg6Var, i2);
        boolean z;
        boolean z2;
        nw2 nw2Var;
        int i4;
        int i5;
        int bitCount;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6 = 0;
        this.C = w30.l(i3, false);
        int i7 = this.A.e;
        int i8 = hb1Var.C;
        nw2 nw2Var2 = hb1Var.y;
        int i9 = i7 & (~i8);
        if ((i9 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.D = z;
        if ((i9 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.E = z2;
        if (str2 != null) {
            nw2Var = nw2.s(str2);
        } else if (nw2Var2.isEmpty()) {
            nw2Var = nw2.s("");
        } else {
            nw2Var = nw2Var2;
        }
        int i10 = 0;
        while (true) {
            if (i10 < nw2Var.size()) {
                i4 = mb1.g(this.A, (String) nw2Var.get(i10), hb1Var.D);
                if (i4 > 0) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i4 = 0;
                i10 = Integer.MAX_VALUE;
                break;
            }
        }
        this.F = i10;
        this.G = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            i5 = hb1Var.A;
        }
        int i11 = this.A.f;
        qg4 qg4Var = mb1.k;
        if (i11 != 0 && i11 == i5) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i5 & i11);
        }
        this.H = bitCount;
        ea2 ea2Var = this.A;
        if ((1088 & ea2Var.f) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.K = z3;
        int f = mb1.f(ea2Var, hb1Var.z);
        this.I = f;
        if (mb1.h(str) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int g = mb1.g(this.A, str, z4);
        this.J = g;
        if (i4 <= 0 && ((!nw2Var2.isEmpty() || bitCount <= 0) && ((!nw2Var2.isEmpty() || f == Integer.MAX_VALUE) && !this.D && ((!this.E || g <= 0) && !hb1Var.x)))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (w30.l(i3, hb1Var.B0) && z5) {
            i6 = 1;
        }
        this.B = i6;
    }

    @Override // defpackage.kb1
    public final int a() {
        return this.B;
    }

    @Override // defpackage.kb1
    public final boolean b(kb1 kb1Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ib1 ib1Var) {
        wq0 d = wq0.a.d(this.C, ib1Var.C);
        Integer valueOf = Integer.valueOf(this.F);
        Integer valueOf2 = Integer.valueOf(ib1Var.F);
        w64 w64Var = w64.y;
        w64 w64Var2 = w64.z;
        wq0 c = d.c(valueOf, valueOf2, w64Var2);
        int i = ib1Var.G;
        int i2 = this.G;
        wq0 a = c.a(i2, i);
        int i3 = ib1Var.H;
        int i4 = this.H;
        wq0 d2 = a.a(i4, i3).c(Integer.valueOf(this.I), Integer.valueOf(ib1Var.I), w64Var2).d(this.D, ib1Var.D);
        Boolean valueOf3 = Boolean.valueOf(this.E);
        Boolean valueOf4 = Boolean.valueOf(ib1Var.E);
        if (i2 != 0) {
            w64Var = w64Var2;
        }
        wq0 a2 = d2.c(valueOf3, valueOf4, w64Var).a(this.J, ib1Var.J);
        if (i4 == 0) {
            a2 = a2.e(this.K, ib1Var.K);
        }
        return a2.f();
    }
}
