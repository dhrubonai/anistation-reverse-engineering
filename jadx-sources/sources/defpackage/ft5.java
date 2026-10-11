package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ft5 {
    public kt5 a;
    public long b;
    public boolean c;
    public int d;

    public ft5(long j, kt5 kt5Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = kt5Var;
        this.b = j;
        tg5 tg5Var = mt5.a;
        if (j != 0) {
            kt5 d = d();
            long j2 = d.z;
            long[] jArr = d.A;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.y;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.x;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (mt5.c) {
                i = mt5.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(ft5 ft5Var) {
        mt5.b.O(ft5Var);
    }

    public final void a() {
        synchronized (mt5.c) {
            b();
            p();
        }
    }

    public void b() {
        mt5.d = mt5.d.c(g());
    }

    public abstract void c();

    public kt5 d() {
        return this.a;
    }

    public abstract ub2 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public ub2 i() {
        return null;
    }

    public final ft5 j() {
        dn0 dn0Var = mt5.b;
        ft5 ft5Var = (ft5) dn0Var.get();
        dn0Var.O(this);
        return ft5Var;
    }

    public void k() {
        q23.W();
        throw null;
    }

    public void l() {
        q23.W();
        throw null;
    }

    public void n(xx5 xx5Var) {
        tg5 tg5Var = mt5.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            mt5.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(kt5 kt5Var) {
        this.a = kt5Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ft5 u(ub2 ub2Var);

    public void m() {
    }
}
