package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class js6 implements bi2 {
    public final ht6 a;
    public final int b;
    public final long c;
    public final AtomicLong d = new AtomicLong();

    public js6(ht6 ht6Var, int i, long j) {
        this.a = ht6Var;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.b95
    public final Surface a() {
        return this.a.j(this.b);
    }

    @Override // defpackage.ge4
    public final void c(qr1 qr1Var, long j, ea2 ea2Var, boolean z) {
        String scheme;
        boolean equals;
        int i;
        vq3 vq3Var = qr1Var.a.b;
        if (vq3Var == null || (scheme = vq3Var.a.getScheme()) == null) {
            equals = false;
        } else {
            equals = scheme.equals("transformer_surface_asset");
        }
        long b = qr1Var.b(j);
        AtomicLong atomicLong = this.d;
        if (ea2Var != null) {
            if (ea2Var.C % 180 != 0) {
                da2 a = ea2Var.a();
                a.v = ea2Var.x;
                a.w = ea2Var.w;
                a.B = 0;
                ea2Var = new ea2(a);
            }
            ea2 ea2Var2 = ea2Var;
            if (equals) {
                i = 4;
            } else {
                String str = ea2Var2.p;
                str.getClass();
                if (qy3.k(str)) {
                    i = 2;
                } else if (str.equals("video/raw")) {
                    i = 3;
                } else if (qy3.m(str)) {
                    i = 1;
                } else {
                    ze0.k("MIME type not supported ".concat(str));
                    return;
                }
            }
            this.a.l(this.b, i, ea2Var2, qr1Var.f.b, atomicLong.get() + this.c);
        }
        atomicLong.addAndGet(b);
    }

    @Override // defpackage.b95
    public final int d() {
        return this.a.g(this.b);
    }

    @Override // defpackage.b95
    public final int e(Bitmap bitmap, ex0 ex0Var) {
        if (this.a.n(this.b, bitmap, ex0Var)) {
            return 1;
        }
        return 2;
    }

    @Override // defpackage.b95
    public final void f() {
        this.a.q(this.b);
    }

    @Override // defpackage.b95
    public final boolean h(long j) {
        return this.a.f(this.b);
    }
}
