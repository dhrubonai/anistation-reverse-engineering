package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u60 extends ge6 {
    public final LinkedBlockingQueue A;
    public final oe2 B;
    public final boolean C;
    public oa1 D;
    public we2 E;
    public int F;
    public boolean G;
    public boolean H;

    public u60(oe2 oe2Var, ts6 ts6Var, boolean z) {
        super(ts6Var);
        this.B = oe2Var;
        this.A = new LinkedBlockingQueue();
        this.C = z;
    }

    @Override // defpackage.ge6
    public final void b() {
        this.A.clear();
        this.H = false;
        this.G = false;
        this.F = 0;
        we2 we2Var = this.E;
        if (we2Var != null) {
            try {
                we2Var.a();
                this.E = null;
            } catch (ze2 e) {
                throw ns6.a(e, -9223372036854775807L);
            }
        }
        super.b();
    }

    @Override // defpackage.ge6
    public final void e(final Bitmap bitmap, final bb2 bb2Var, final ex0 ex0Var) {
        this.x.f(new ss6() { // from class: s60
            @Override // defpackage.ss6
            public final void run() {
                ex0 ex0Var2 = ex0Var;
                io3.m("Bitmap queued but no timestamps provided.", ex0Var2.b());
                u60 u60Var = u60.this;
                u60Var.A.add(new t60(bitmap, bb2Var, ex0Var2));
                u60Var.p();
                u60Var.G = false;
            }
        }, true);
    }

    @Override // defpackage.te2
    public final void h() {
        this.x.f(new r60(this, (byte) 0), true);
    }

    @Override // defpackage.ge6
    public final void i() {
        this.x.f(new r60(this, (byte) 1), true);
    }

    @Override // defpackage.ge6
    public final void n(oa1 oa1Var) {
        this.F = 0;
        this.D = oa1Var;
    }

    @Override // defpackage.ge6
    public final void o() {
        this.x.f(new r60(this, (byte) 2), true);
    }

    public final void p() {
        boolean z;
        boolean z2;
        boolean hasGainmap;
        Gainmap gainmap;
        if (!this.A.isEmpty() && this.F != 0) {
            t60 t60Var = (t60) this.A.element();
            bb2 bb2Var = t60Var.b;
            ex0 ex0Var = t60Var.c;
            io3.B(ex0Var.b());
            long j = t60Var.b.b;
            io3.B(ex0Var.b());
            int i = ex0Var.e;
            ex0Var.e = i + 1;
            long round = Math.round(ex0Var.b * i);
            if (round >= 0) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            long j2 = round + j;
            if (!this.H) {
                this.H = true;
                Bitmap bitmap = t60Var.a;
                try {
                    we2 we2Var = this.E;
                    if (we2Var != null) {
                        we2Var.a();
                    }
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    a34.p();
                    int i2 = iArr[0];
                    a34.j(bitmap.getWidth(), bitmap.getHeight());
                    a34.k(3553, i2, 9729);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    a34.p();
                    ea2 ea2Var = bb2Var.a;
                    this.E = new we2(i2, -1, ea2Var.w, ea2Var.x);
                    if (Build.VERSION.SDK_INT >= 34) {
                        hasGainmap = bitmap.hasGainmap();
                        if (hasGainmap) {
                            oa1 oa1Var = this.D;
                            oa1Var.getClass();
                            gainmap = bitmap.getGainmap();
                            gainmap.getClass();
                            oa1Var.m(m9.h(gainmap));
                        }
                    }
                    if (this.C) {
                        oa1 oa1Var2 = this.D;
                        oa1Var2.getClass();
                        if (oa1Var2.a.c == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        io3.B(z2);
                        oa1Var2.u = true;
                        oa1Var2.v = false;
                    }
                } catch (ze2 e) {
                    throw ns6.a(e, -9223372036854775807L);
                }
            }
            this.F--;
            oa1 oa1Var3 = this.D;
            oa1Var3.getClass();
            oe2 oe2Var = this.B;
            we2 we2Var2 = this.E;
            we2Var2.getClass();
            oa1Var3.c(oe2Var, we2Var2, j2);
            ea2 ea2Var2 = bb2Var.a;
            LinkedHashMap linkedHashMap = a61.a;
            synchronized (a61.class) {
            }
            if (!t60Var.c.b()) {
                this.H = false;
                ((t60) this.A.remove()).a.recycle();
                if (this.A.isEmpty() && this.G) {
                    oa1 oa1Var4 = this.D;
                    oa1Var4.getClass();
                    oa1Var4.b();
                    a61.a();
                    this.G = false;
                }
            }
        }
    }
}
