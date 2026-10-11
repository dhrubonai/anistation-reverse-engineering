package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lb3 implements v06 {
    public final t34 a;
    public final /* synthetic */ mb3 b;
    public final /* synthetic */ Object c;

    public lb3(mb3 mb3Var, Object obj) {
        this.b = mb3Var;
        this.c = obj;
        int[] iArr = j13.a;
        this.a = new t34();
    }

    @Override // defpackage.v06
    public final void a(aa aaVar) {
        xz3 xz3Var;
        kf kfVar;
        za3 za3Var = (za3) this.b.G.g(this.c);
        if (za3Var != null && (kfVar = za3Var.c0) != null) {
            xz3Var = (xz3) kfVar.D;
        } else {
            xz3Var = null;
        }
        if (xz3Var != null && xz3Var.K) {
            iv5.k(xz3Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", aaVar);
        }
    }

    @Override // defpackage.v06
    public final long b(int i) {
        za3 za3Var = (za3) this.b.G.g(this.c);
        if (za3Var != null && za3Var.I()) {
            int i2 = ((z44) ((d44) za3Var.n()).y).z;
            if (i < 0 || i >= i2) {
                ez2.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
            }
            if (this.a.b(i)) {
                int i3 = ((za3) ((d44) za3Var.n()).get(i)).d0.p.x;
                return (((za3) ((d44) za3Var.n()).get(i)).d0.p.y & 4294967295L) | (i3 << 32);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.v06
    public final int c() {
        za3 za3Var = (za3) this.b.G.g(this.c);
        if (za3Var != null) {
            return ((z44) ((d44) za3Var.n()).y).z;
        }
        return 0;
    }

    @Override // defpackage.v06
    public final void d(int i, long j) {
        mb3 mb3Var = this.b;
        za3 za3Var = (za3) mb3Var.G.g(this.c);
        if (za3Var != null && za3Var.I()) {
            int i2 = ((z44) ((d44) za3Var.n()).y).z;
            if (i < 0 || i >= i2) {
                ez2.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
            }
            if (za3Var.J()) {
                ez2.a("Pre-measure called on node that is not placed");
            }
            za3 za3Var2 = mb3Var.x;
            za3Var2.N = true;
            ((oa) cb3.a(za3Var)).r((za3) ((d44) za3Var.n()).get(i), j);
            za3Var2.N = false;
            this.a.a(i);
        }
    }

    @Override // defpackage.v06
    public final void dispose() {
        this.b.g(this.c);
    }
}
