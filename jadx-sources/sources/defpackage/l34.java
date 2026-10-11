package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l34 implements ht6 {
    public final Context a;
    public final hp0 b;
    public final y23 c;
    public final gt6 d;
    public final Executor e;
    public final ScheduledExecutorService g;
    public final fc1 h;
    public final ArrayDeque i;
    public final SparseArray j;
    public final boolean k;
    public List l;
    public l68 m;
    public hc1 n;
    public yb1 o;
    public sq5 p;
    public boolean q;
    public boolean r;
    public volatile boolean t;
    public long s = -9223372036854775807L;
    public final SparseArray f = new SparseArray();

    public l34(Context context, fc1 fc1Var, hp0 hp0Var, gt6 gt6Var, Executor executor, boolean z) {
        this.a = context;
        this.b = hp0Var;
        this.d = gt6Var;
        this.e = executor;
        this.k = z;
        String str = eq6.a;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new fv0("Effect:MultipleInputVideoGraph:Thread", (byte) 1));
        this.g = newSingleThreadScheduledExecutor;
        y23 y23Var = new y23((byte) 6);
        this.c = y23Var;
        fc1 a = fc1Var.a();
        a.b = y23Var;
        a.c = newSingleThreadScheduledExecutor;
        this.h = new fc1(!a.a, y23Var, newSingleThreadScheduledExecutor, a.d, a.e, a.f, a.g);
        this.i = new ArrayDeque();
        this.j = new SparseArray();
        this.p = sq5.c;
        z62 z62Var = nw2.y;
        this.l = o15.B;
        this.m = l68.S;
    }

    public final xs6 a(int i) {
        boolean z;
        String str = eq6.a;
        SparseArray sparseArray = this.f;
        if (sparseArray.indexOfKey(i) >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        return (xs6) sparseArray.get(i);
    }

    public final void b() {
        ef6 ef6Var = (ef6) this.i.peek();
        if (ef6Var != null) {
            hc1 hc1Var = this.n;
            hc1Var.getClass();
            we2 we2Var = ef6Var.a;
            int i = we2Var.c;
            int i2 = we2Var.d;
            sq5 sq5Var = this.p;
            if (i != sq5Var.a || i2 != sq5Var.b) {
                da2 da2Var = new da2();
                da2Var.G = this.b;
                da2Var.v = i;
                da2Var.w = i2;
                hc1Var.h(3, 0L, new ea2(da2Var), this.l);
                this.p = new sq5(i, i2);
            }
            int i3 = ef6Var.a.a;
            long j = ef6Var.b;
            io3.B(!hc1Var.w);
            if (hc1Var.m.e() && !hc1Var.x) {
                ge6 ge6Var = (ge6) hc1Var.f.j;
                ge6Var.getClass();
                ge6Var.f(i3, j);
                this.i.remove();
                if (this.q && this.i.isEmpty()) {
                    hc1Var.k();
                }
            }
        }
    }

    @Override // defpackage.ht6
    public final void e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ht6
    public final boolean f(int i) {
        return ((hc1) a(i)).g();
    }

    @Override // defpackage.ht6
    public final void flush() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i < sparseArray.size()) {
                ((hc1) ((xs6) sparseArray.get(sparseArray.keyAt(i)))).e();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ht6
    public final int g(int i) {
        ge6 ge6Var = (ge6) ((hc1) a(i)).f.j;
        if (ge6Var != null) {
            return ge6Var.d();
        }
        return 0;
    }

    @Override // defpackage.ht6
    public final void h(List list) {
        this.l = list;
    }

    @Override // defpackage.ht6
    public final void i(int i) {
        boolean z;
        SparseArray sparseArray = this.f;
        String str = eq6.a;
        if (sparseArray.indexOfKey(i) >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(!z);
        yb1 yb1Var = this.o;
        yb1Var.getClass();
        synchronized (yb1Var) {
            io3.B(!eq6.l(yb1Var.f, i));
            yb1Var.f.put(i, new xb1());
            if (yb1Var.o == -1) {
                yb1Var.o = i;
            }
        }
        fc1 a = this.h.a();
        h81 h81Var = new h81(this, i);
        a.d = h81Var;
        a.e = (byte) 2;
        this.f.put(i, new fc1(!a.a, a.b, a.c, h81Var, 2, a.f, a.g).b(this.a, this.b, true, this.e, new fr0((Object) this, i, (byte) 6)));
    }

    @Override // defpackage.ht6
    public final void initialize() {
        boolean z;
        boolean z2 = false;
        if (this.f.size() == 0 && this.o == null && this.n == null && !this.r) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        hc1 b = this.h.b(this.a, this.b, this.k, qg1.x, new sn3((Object) this, (byte) 5));
        this.n = b;
        g34 g34Var = new g34(this);
        SparseArray sparseArray = (SparseArray) b.f.h;
        if (sparseArray.indexOfKey(3) >= 0) {
            z2 = true;
        }
        io3.B(z2);
        ((vz2) sparseArray.get(3)).a.m(g34Var);
        yb1 yb1Var = new yb1(this.a, this.c, this.g, new fq3((Object) this, (byte) 2), new g34(this));
        this.o = yb1Var;
        yb1Var.k = this.m;
    }

    @Override // defpackage.ht6
    public final Surface j(int i) {
        boolean z;
        SparseArray sparseArray = (SparseArray) ((hc1) a(i)).f.h;
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
        hc1 hc1Var = this.n;
        hc1Var.getClass();
        io3.A("Calling this method is not allowed when renderFramesAutomatically is enabled", !hc1Var.j);
        hc1Var.g.g(new tb1(hc1Var, j, (byte) 1));
    }

    @Override // defpackage.ht6
    public final void l(int i, int i2, ea2 ea2Var, List list, long j) {
        ((hc1) a(i)).h(i2, j, ea2Var, list);
    }

    @Override // defpackage.ht6
    public final void m(l68 l68Var) {
        this.m = l68Var;
        yb1 yb1Var = this.o;
        if (yb1Var != null) {
            yb1Var.k = l68Var;
        }
    }

    @Override // defpackage.ht6
    public final boolean n(int i, Bitmap bitmap, ex0 ex0Var) {
        return ((hc1) a(i)).f(bitmap, ex0Var);
    }

    @Override // defpackage.ht6
    public final boolean o() {
        return this.t;
    }

    @Override // defpackage.ht6
    public final void p(i36 i36Var) {
        hc1 hc1Var = this.n;
        hc1Var.getClass();
        hc1Var.j(i36Var);
    }

    @Override // defpackage.ht6
    public final void q(int i) {
        ((hc1) a(i)).k();
    }

    @Override // defpackage.ht6
    public final void release() {
        if (this.r) {
            return;
        }
        for (int i = 0; i < this.f.size(); i++) {
            SparseArray sparseArray = this.f;
            ((hc1) ((xs6) sparseArray.get(sparseArray.keyAt(i)))).i();
        }
        yb1 yb1Var = this.o;
        byte b = 1;
        if (yb1Var != null) {
            synchronized (yb1Var) {
                try {
                    yb1Var.e.e(new ub1(yb1Var, b));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e);
                }
            }
            this.o = null;
        }
        hc1 hc1Var = this.n;
        if (hc1Var != null) {
            hc1Var.i();
            this.n = null;
        }
        this.g.submit(new a92(this, (byte) 8));
        this.g.shutdown();
        try {
            this.g.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            kb0.s("MultiInputVG", "Thread interrupted while waiting for executor service termination");
        }
        this.r = true;
    }
}
