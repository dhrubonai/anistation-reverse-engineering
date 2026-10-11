package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class py1 implements lt6, iw, ld6, ky3, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ vy1 x;

    public py1(vy1 vy1Var) {
        this.x = vy1Var;
    }

    @Override // defpackage.iw
    public final void A(Exception exc) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1014, new y61((byte) 26));
    }

    @Override // defpackage.iw
    public final void B(long j) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1010, new w61((byte) 1));
    }

    @Override // defpackage.iw
    public final void C(Exception exc) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1029, new y61((byte) 24));
    }

    @Override // defpackage.lt6
    public final void D(Exception exc) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1030, new w61((byte) 9));
    }

    @Override // defpackage.iw
    public final void E(io0 io0Var) {
        this.x.F.w(io0Var);
    }

    @Override // defpackage.lt6
    public final void F(long j, Object obj) {
        vy1 vy1Var = this.x;
        c71 c71Var = vy1Var.s;
        q7 a0 = c71Var.a0();
        c71Var.b0(a0, 26, new ir0(a0, obj, j));
        if (vy1Var.U == obj) {
            vy1Var.m.g(26, new p65((byte) 11));
        }
    }

    @Override // defpackage.iw
    public final void J(n61 n61Var) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1007, new y61((byte) 18));
    }

    @Override // defpackage.lt6
    public final void a(hv6 hv6Var) {
        vy1 vy1Var = this.x;
        vy1Var.m0 = hv6Var;
        vy1Var.m.g(25, new b71(hv6Var));
    }

    @Override // defpackage.ld6
    public final void b(c31 c31Var) {
        vy1 vy1Var = this.x;
        vy1Var.g0 = c31Var;
        vy1Var.m.g(27, new h5((Object) c31Var, (byte) 18));
    }

    @Override // defpackage.iw
    public final void c(int i) {
        boolean z;
        sp spVar = this.x.C;
        oy1 oy1Var = new oy1(i);
        spVar.getClass();
        if (Looper.myLooper() == ((k46) spVar.c).a.getLooper()) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        spVar.a++;
        spVar.h(new gb(spVar, oy1Var, (byte) 6));
        spVar.k(Integer.valueOf(i));
    }

    @Override // defpackage.lt6
    public final void d(String str) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1019, new w61((byte) 18));
    }

    @Override // defpackage.iw
    public final void e(boolean z) {
        vy1 vy1Var = this.x;
        if (vy1Var.f0 == z) {
            return;
        }
        vy1Var.f0 = z;
        vy1Var.m.g(23, new jy1((byte) 1, z));
    }

    @Override // defpackage.ky3
    public final void f(fy3 fy3Var) {
        vy1 vy1Var = this.x;
        ui3 ui3Var = vy1Var.m;
        hr3 a = vy1Var.q0.a();
        int i = 0;
        while (true) {
            ey3[] ey3VarArr = fy3Var.a;
            if (i >= ey3VarArr.length) {
                break;
            }
            ey3VarArr[i].b(a);
            i++;
        }
        vy1Var.q0 = new jr3(a);
        jr3 i1 = vy1Var.i1();
        if (!i1.equals(vy1Var.S)) {
            vy1Var.S = i1;
            ui3Var.c(14, new h5((Object) this, (byte) 19));
        }
        ui3Var.c(28, new h5((Object) fy3Var, (byte) 20));
        ui3Var.b();
    }

    @Override // defpackage.iw
    public final void g(q18 q18Var) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1032, new w61((byte) 2));
    }

    @Override // defpackage.lt6
    public final void h(int i, long j) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.X((jw3) c71Var.d.C), 1021, new y61((byte) 5));
    }

    @Override // defpackage.lt6
    public final void i(n61 n61Var) {
        c71 c71Var = this.x.s;
        q7 X = c71Var.X((jw3) c71Var.d.C);
        c71Var.b0(X, 1020, new h5(X, n61Var, (byte) 7));
    }

    @Override // defpackage.lt6
    public final void j(n61 n61Var) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1015, new y61((byte) 27));
    }

    @Override // defpackage.iw
    public final void k(n61 n61Var) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.X((jw3) c71Var.d.C), 1013, new y61((byte) 21));
    }

    @Override // defpackage.ld6
    public final void l(o15 o15Var) {
        this.x.m.g(27, new a71(o15Var));
    }

    @Override // defpackage.lt6
    public final void m(int i, long j) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.X((jw3) c71Var.d.C), 1018, new w61((byte) 25));
    }

    @Override // defpackage.iw
    public final void n(String str) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1012, new y61((byte) 19));
    }

    @Override // defpackage.iw
    public final void o(q18 q18Var) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1031, new y61((byte) 25));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        vy1 vy1Var = this.x;
        vy1Var.y1(surface);
        vy1Var.V = surface;
        vy1Var.t1(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vy1 vy1Var = this.x;
        vy1Var.y1(null);
        vy1Var.t1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.x.t1(i, i2);
    }

    @Override // defpackage.lt6
    public final void p(long j, String str, long j2) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1016, new y61((byte) 28));
    }

    @Override // defpackage.iw
    public final void r(long j, int i, long j2) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1011, new w61((byte) 0));
    }

    @Override // defpackage.lt6
    public final void s(io0 io0Var) {
        this.x.G.w(io0Var);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.x.t1(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        vy1 vy1Var = this.x;
        if (vy1Var.Y) {
            vy1Var.y1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        vy1 vy1Var = this.x;
        if (vy1Var.Y) {
            vy1Var.y1(null);
        }
        vy1Var.t1(0, 0);
    }

    @Override // defpackage.iw
    public final void w(ea2 ea2Var, s61 s61Var) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1009, new y61((byte) 23));
    }

    @Override // defpackage.lt6
    public final void x(ea2 ea2Var, s61 s61Var) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1017, new y61((byte) 15));
    }

    @Override // defpackage.iw
    public final void z(long j, String str, long j2) {
        c71 c71Var = this.x.s;
        c71Var.b0(c71Var.a0(), 1008, new y61((byte) 20));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
