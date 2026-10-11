package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eq4 extends kf6 {
    public static final Object j = new Object();
    public final ar3 e;
    public final boolean f;
    public final boolean g;
    public final uq3 h;
    public final long i;

    public eq4(fq4 fq4Var) {
        uq3 uq3Var;
        this.e = fq4Var.q();
        this.f = fq4Var.f0();
        this.g = fq4Var.C0();
        if (fq4Var.b1()) {
            uq3Var = uq3.f;
        } else {
            uq3Var = null;
        }
        this.h = uq3Var;
        this.i = eq6.U(fq4Var.w());
    }

    @Override // defpackage.kf6
    public final int b(Object obj) {
        if (j != obj) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        y5 y5Var = y5.c;
        Object obj = j;
        hf6Var.h(obj, obj, 0, this.i, 0L, y5Var, false);
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final int h() {
        return 1;
    }

    @Override // defpackage.kf6
    public final Object l(int i) {
        return j;
    }

    @Override // defpackage.kf6
    public final jf6 m(int i, jf6 jf6Var, long j2) {
        jf6Var.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        jf6Var.k = false;
        return jf6Var;
    }

    @Override // defpackage.kf6
    public final int o() {
        return 1;
    }
}
