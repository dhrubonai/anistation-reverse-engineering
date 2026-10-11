package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qg7 implements xg7 {
    public final qe7 a;
    public final p7 b;

    public qg7(p7 p7Var, qe7 qe7Var) {
        qc5 qc5Var = gf7.a;
        this.b = p7Var;
        this.a = qe7Var;
    }

    @Override // defpackage.xg7
    public final mf7 a() {
        qe7 qe7Var = this.a;
        if (qe7Var instanceof mf7) {
            return ((mf7) qe7Var).g();
        }
        kf7 kf7Var = (kf7) ((mf7) qe7Var).q(5);
        boolean e = kf7Var.y.e();
        mf7 mf7Var = kf7Var.y;
        if (!e) {
            return mf7Var;
        }
        mf7Var.getClass();
        ug7.c.a(mf7Var.getClass()).f(mf7Var);
        mf7Var.f();
        return kf7Var.y;
    }

    @Override // defpackage.xg7
    public final void b(Object obj, Object obj2) {
        yg7.b(obj, obj2);
    }

    @Override // defpackage.xg7
    public final int c(qe7 qe7Var) {
        gh7 gh7Var = ((mf7) qe7Var).zzc;
        int i = gh7Var.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < gh7Var.a; i3++) {
                int i4 = gh7Var.b[i3] >>> 3;
                we7 we7Var = (we7) gh7Var.c[i3];
                int a = ef7.a(8);
                int a2 = ef7.a(i4) + ef7.a(16);
                int a3 = ef7.a(24);
                int c = we7Var.c();
                i2 += a + a + a2 + zo5.d(c, c, a3);
            }
            gh7Var.d = i2;
            return i2;
        }
        return i;
    }

    @Override // defpackage.xg7
    public final boolean d(Object obj) {
        throw h11.f(obj);
    }

    @Override // defpackage.xg7
    public final void e(Object obj, ub7 ub7Var) {
        throw h11.f(obj);
    }

    @Override // defpackage.xg7
    public final void f(Object obj) {
        this.b.getClass();
        gh7 gh7Var = ((mf7) obj).zzc;
        if (gh7Var.e) {
            gh7Var.e = false;
        }
        qc5 qc5Var = gf7.a;
        throw h11.f(obj);
    }

    @Override // defpackage.xg7
    public final void g(Object obj, byte[] bArr, int i, int i2, m97 m97Var) {
        mf7 mf7Var = (mf7) obj;
        if (mf7Var.zzc == gh7.f) {
            mf7Var.zzc = gh7.a();
        }
        throw h11.f(obj);
    }

    @Override // defpackage.xg7
    public final int h(mf7 mf7Var) {
        return mf7Var.zzc.hashCode();
    }

    @Override // defpackage.xg7
    public final boolean i(mf7 mf7Var, mf7 mf7Var2) {
        if (!mf7Var.zzc.equals(mf7Var2.zzc)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.xg7
    public final void j(Object obj, fm0 fm0Var, ff7 ff7Var) {
        this.b.getClass();
        p7.b(obj);
        obj.getClass();
        throw new ClassCastException();
    }
}
