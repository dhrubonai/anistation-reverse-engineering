package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class up5 implements ht6 {
    public final Context a;
    public final fc1 b;
    public final hp0 c;
    public final gt6 d;
    public final Executor e;
    public final boolean f;
    public xs6 g;
    public i36 h;
    public nw2 i;
    public boolean j;
    public volatile boolean k;
    public int l;

    public up5(Context context, fc1 fc1Var, hp0 hp0Var, gt6 gt6Var, Executor executor, boolean z) {
        this.a = context;
        this.b = fc1Var;
        this.c = hp0Var;
        this.d = gt6Var;
        this.e = executor;
        z62 z62Var = nw2.y;
        this.i = o15.B;
        this.f = z;
        this.l = -1;
    }

    @Override // defpackage.ht6
    public final void e() {
        this.g.getClass();
        throw new UnsupportedOperationException("Replaying when enableReplayableCache is set to false");
    }

    @Override // defpackage.ht6
    public final boolean f(int i) {
        this.g.getClass();
        return ((hc1) this.g).g();
    }

    @Override // defpackage.ht6
    public final void flush() {
        this.g.getClass();
        ((hc1) this.g).e();
    }

    @Override // defpackage.ht6
    public final int g(int i) {
        this.g.getClass();
        ge6 ge6Var = (ge6) ((hc1) this.g).f.j;
        if (ge6Var != null) {
            return ge6Var.d();
        }
        return 0;
    }

    @Override // defpackage.ht6
    public final void h(List list) {
        this.i = nw2.o(list);
    }

    @Override // defpackage.ht6
    public final void i(int i) {
        boolean z;
        boolean z2 = false;
        if (this.g == null && !this.j) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        if (this.l == -1) {
            z2 = true;
        }
        io3.A("This VideoGraph supports only one input.", z2);
        this.l = i;
        hc1 b = this.b.b(this.a, this.c, this.f, qg1.x, new ok2(this));
        this.g = b;
        i36 i36Var = this.h;
        if (i36Var != null) {
            b.j(i36Var);
        }
    }

    @Override // defpackage.ht6
    public final Surface j(int i) {
        boolean z;
        this.g.getClass();
        SparseArray sparseArray = (SparseArray) ((hc1) this.g).f.h;
        String str = eq6.a;
        if (sparseArray.indexOfKey(1) >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        return ((vz2) sparseArray.get(1)).a.c();
    }

    @Override // defpackage.ht6
    public final void k(long j) {
        this.g.getClass();
        hc1 hc1Var = (hc1) this.g;
        io3.A("Calling this method is not allowed when renderFramesAutomatically is enabled", !hc1Var.j);
        hc1Var.g.g(new tb1(hc1Var, j, (byte) 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ew2, jw2] */
    @Override // defpackage.ht6
    public final void l(int i, int i2, ea2 ea2Var, List list, long j) {
        this.g.getClass();
        xs6 xs6Var = this.g;
        ?? ew2Var = new ew2(4);
        ew2Var.d(list);
        ew2Var.d(this.i);
        ((hc1) xs6Var).h(i2, j, ea2Var, ew2Var.g());
    }

    @Override // defpackage.ht6
    public final void m(l68 l68Var) {
        io3.m("SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings", l68Var.equals(l68.S));
    }

    @Override // defpackage.ht6
    public final boolean n(int i, Bitmap bitmap, ex0 ex0Var) {
        this.g.getClass();
        return ((hc1) this.g).f(bitmap, ex0Var);
    }

    @Override // defpackage.ht6
    public final boolean o() {
        return this.k;
    }

    @Override // defpackage.ht6
    public final void p(i36 i36Var) {
        this.h = i36Var;
        xs6 xs6Var = this.g;
        if (xs6Var != null) {
            ((hc1) xs6Var).j(i36Var);
        }
    }

    @Override // defpackage.ht6
    public final void q(int i) {
        this.g.getClass();
        ((hc1) this.g).k();
    }

    @Override // defpackage.ht6
    public final void release() {
        if (this.j) {
            return;
        }
        xs6 xs6Var = this.g;
        if (xs6Var != null) {
            ((hc1) xs6Var).i();
        }
        this.j = true;
    }

    @Override // defpackage.ht6
    public final void initialize() {
    }
}
