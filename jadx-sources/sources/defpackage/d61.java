package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d61 implements ve2 {
    public final Context a;
    public final ze0 b;
    public oa1 c;
    public final hp0 d;
    public EGLDisplay i;
    public int j = -1;
    public int k = -1;
    public te2 e = new p18((byte) 12);
    public ue2 f = new q18((byte) 12);
    public se2 g = new ze0((byte) 28);
    public Executor h = qg1.x;

    public d61(Context context, ze0 ze0Var, hp0 hp0Var) {
        this.a = context;
        this.b = ze0Var;
        this.d = hp0Var;
    }

    public final void a(int i, int i2) {
        if (this.i == null) {
            this.i = a34.Y();
        }
        EGL14.eglGetCurrentContext();
        if (this.j == -1 || this.k == -1) {
            this.j = i;
            this.k = i2;
        }
        this.b.getClass();
        if (this.c == null) {
            io3.t(4, "initialCapacity");
            Object[] objArr = new Object[4];
            it4 f = it4.f(this.j, this.k);
            int b = fw2.b(4, 1);
            if (b > 4) {
                objArr = Arrays.copyOf(objArr, b);
            }
            int i3 = 0;
            objArr[0] = f;
            o15 j = nw2.j(objArr, 1);
            o15 o15Var = o15.B;
            hp0 hp0Var = this.d;
            if (hp0Var.c == 1) {
                i3 = 2;
            }
            this.c = oa1.j(this.a, j, o15Var, hp0Var, i3);
        }
    }

    @Override // defpackage.ve2
    public final void b() {
        this.f.f();
    }

    @Override // defpackage.ve2
    public final void c(oe2 oe2Var, we2 we2Var, long j) {
        try {
            a(we2Var.c, we2Var.d);
            this.c.getClass();
            throw null;
        } catch (ns6 | ze2 e) {
            this.h.execute(new c61(this, e, j, (byte) 0));
        }
    }

    @Override // defpackage.ve2
    public final void d(we2 we2Var) {
        this.e.k(we2Var);
        this.e.h();
    }

    @Override // defpackage.ve2
    public final void e(dn0 dn0Var) {
        this.f = dn0Var;
    }

    @Override // defpackage.ve2
    public final void f(Executor executor, ac1 ac1Var) {
        this.g = ac1Var;
        this.h = executor;
    }

    @Override // defpackage.ve2
    public final void flush() {
        oa1 oa1Var = this.c;
        if (oa1Var != null) {
            oa1Var.flush();
        }
        this.e.q();
        this.e.h();
    }

    @Override // defpackage.ve2
    public final void g(te2 te2Var) {
        this.e = te2Var;
        te2Var.h();
    }

    @Override // defpackage.ve2
    public final void release() {
        oa1 oa1Var = this.c;
        if (oa1Var != null) {
            oa1Var.release();
        }
        try {
            a34.p();
        } catch (ze2 e) {
            throw new ns6(e);
        }
    }
}
