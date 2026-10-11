package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class t63 extends r63 {
    public final h63 j;
    public final List k;
    public final int l;
    public int m;

    public t63(y43 y43Var, h63 h63Var) {
        super(y43Var, h63Var, (String) null, 12);
        this.j = h63Var;
        List I0 = yo0.I0(h63Var.x.keySet());
        this.k = I0;
        this.l = I0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.r63, defpackage.n1
    public final q53 O(String str) {
        str.getClass();
        if (this.m % 2 == 0) {
            aj5 aj5Var = r53.a;
            return new b63(str, true);
        }
        return (q53) vn3.Q(str, this.j);
    }

    @Override // defpackage.r63, defpackage.n1
    public final String Q(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.r63, defpackage.n1
    public final q53 S() {
        return this.j;
    }

    @Override // defpackage.r63
    /* renamed from: W */
    public final h63 S() {
        return this.j;
    }

    @Override // defpackage.r63, defpackage.n1, defpackage.gu0
    public final void a(aj5 aj5Var) {
        aj5Var.getClass();
    }

    @Override // defpackage.r63, defpackage.gu0
    public final int i(aj5 aj5Var) {
        aj5Var.getClass();
        int i = this.m;
        if (i < this.l - 1) {
            int i2 = i + 1;
            this.m = i2;
            return i2;
        }
        return -1;
    }
}
