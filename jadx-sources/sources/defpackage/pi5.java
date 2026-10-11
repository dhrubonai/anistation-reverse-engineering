package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pi5 implements b95 {
    public final b95 a;
    public final int b;
    public long c;
    public final /* synthetic */ qi5 d;

    public pi5(qi5 qi5Var, b95 b95Var, int i) {
        this.d = qi5Var;
        this.a = b95Var;
        this.b = i;
    }

    @Override // defpackage.b95
    public final Surface a() {
        return this.a.a();
    }

    @Override // defpackage.b95
    public final q61 b() {
        return this.a.b();
    }

    @Override // defpackage.b95
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.b95
    public final int e(Bitmap bitmap, ex0 ex0Var) {
        return this.a.e(bitmap, ex0Var.a());
    }

    @Override // defpackage.b95
    public final void f() {
        qi5 qi5Var = this.d;
        AtomicInteger atomicInteger = qi5Var.k;
        atomicInteger.decrementAndGet();
        if (qi5Var.j()) {
            this.a.f();
        } else if (atomicInteger.get() == 0) {
            qi5Var.f.f(new a92(this, (byte) 20));
        }
    }

    @Override // defpackage.b95
    public final boolean g() {
        b95 b95Var = this.a;
        q61 b = b95Var.b();
        b.getClass();
        if (b.d(4)) {
            qi5 qi5Var = this.d;
            qi5Var.k.decrementAndGet();
            if (!qi5Var.j()) {
                if (this.b == 1 && qi5Var.p) {
                    io3.B(b95Var.g());
                } else {
                    b.f();
                    b.D = 0L;
                }
                if (qi5Var.k.get() == 0) {
                    qi5Var.f.f(new a92(this, (byte) 20));
                }
                return true;
            }
        }
        io3.B(b95Var.g());
        return true;
    }

    @Override // defpackage.b95
    public final boolean h(long j) {
        return this.a.h(j);
    }
}
