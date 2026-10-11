package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gj4 implements mj3 {
    public final long a;
    public final v41 b;
    public final byte c;
    public final iy5 d;
    public final fj4 e;
    public volatile Object f;

    public gj4(zp2 zp2Var) {
        this.d = new iy5((q41) zp2Var.x);
        this.b = (v41) zp2Var.y;
        this.c = (byte) 4;
        this.e = (fj4) zp2Var.z;
        this.a = ij3.h.getAndIncrement();
    }

    @Override // defpackage.mj3
    public final void a() {
        this.d.y = 0L;
        t41 t41Var = new t41(this.d, this.b);
        try {
            t41Var.a();
            Uri y = this.d.x.y();
            y.getClass();
            this.f = this.e.d(y, t41Var);
        } finally {
            eq6.h(t41Var);
        }
    }

    @Override // defpackage.mj3
    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gj4(q41 q41Var, v41 v41Var, int i, fj4 fj4Var) {
        this.d = new iy5(q41Var);
        this.b = v41Var;
        this.c = i;
        this.e = fj4Var;
        this.a = ij3.h.getAndIncrement();
    }
}
