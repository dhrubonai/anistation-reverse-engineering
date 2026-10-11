package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ge6 implements te2 {
    public final ts6 x;
    public final Object y = new Object();
    public ss6 z;

    public ge6(ts6 ts6Var) {
        this.x = ts6Var;
    }

    public void b() {
        synchronized (this.y) {
            try {
                ss6 ss6Var = this.z;
                if (ss6Var != null) {
                    this.x.g(ss6Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface c() {
        throw new UnsupportedOperationException();
    }

    public int d() {
        return 0;
    }

    public void e(Bitmap bitmap, bb2 bb2Var, ex0 ex0Var) {
        throw new UnsupportedOperationException();
    }

    public void f(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void g(bb2 bb2Var) {
        throw new UnsupportedOperationException();
    }

    public void m(g34 g34Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void n(oa1 oa1Var);

    public void o() {
        this.x.f(new cc1(this, (byte) 2), true);
    }

    @Override // defpackage.te2
    public final void q() {
        this.x.f(new cc1(this, (byte) 3), true);
    }

    public void a() {
    }

    public void i() {
    }

    public void j() {
    }

    public void l(bb2 bb2Var, boolean z) {
    }
}
