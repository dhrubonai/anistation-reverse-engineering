package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fw3 extends kf6 {
    public final kf6 e;
    public final cw2 f;
    public final cw2 g;

    public fw3(kf6 kf6Var, cw2 cw2Var, cw2 cw2Var2) {
        this.e = kf6Var;
        this.f = cw2Var;
        this.g = cw2Var2;
    }

    @Override // defpackage.kf6
    public final int a(boolean z) {
        return this.e.a(z);
    }

    @Override // defpackage.kf6
    public final int b(Object obj) {
        Object obj2;
        boolean z = obj instanceof String;
        kf6 kf6Var = this.e;
        if (z && (obj2 = ((n15) this.g).E.get(obj)) != null) {
            return kf6Var.b(obj2);
        }
        return kf6Var.b(obj);
    }

    @Override // defpackage.kf6
    public final int c(boolean z) {
        return this.e.c(z);
    }

    @Override // defpackage.kf6
    public final int e(int i, int i2, boolean z) {
        return this.e.e(i, i2, z);
    }

    @Override // defpackage.kf6
    public final hf6 f(int i, hf6 hf6Var, boolean z) {
        String str;
        String str2;
        this.e.f(i, hf6Var, z);
        if (z) {
            Object obj = hf6Var.a;
            cw2 cw2Var = this.g;
            if (obj != null && (str2 = (String) cw2Var.get(obj)) != null) {
                hf6Var.a = str2;
            }
            Object obj2 = hf6Var.b;
            if (obj2 != null && (str = (String) cw2Var.get(obj2)) != null) {
                hf6Var.b = str;
            }
        }
        return hf6Var;
    }

    @Override // defpackage.kf6
    public final int h() {
        return this.e.h();
    }

    @Override // defpackage.kf6
    public final int k(int i, int i2, boolean z) {
        return this.e.k(i, i2, z);
    }

    @Override // defpackage.kf6
    public final Object l(int i) {
        Object l = this.e.l(i);
        String str = (String) this.g.get(l);
        if (str == null) {
            return l;
        }
        return str;
    }

    @Override // defpackage.kf6
    public final jf6 m(int i, jf6 jf6Var, long j) {
        String str;
        this.e.m(i, jf6Var, j);
        Object obj = jf6Var.a;
        if (obj != null && (str = (String) this.f.get(obj)) != null) {
            jf6Var.a = str;
        }
        return jf6Var;
    }

    @Override // defpackage.kf6
    public final int o() {
        return this.e.o();
    }
}
