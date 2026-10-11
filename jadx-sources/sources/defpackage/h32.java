package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h32 implements ve2, ye2 {
    public EGLSurface B;
    public final Context a;
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final hp0 g;
    public final ts6 h;
    public final Executor i;
    public final ws6 j;
    public final he6 l;
    public final sr1 m;
    public final sr1 n;
    public final xe2 o;
    public final boolean p;
    public int q;
    public int r;
    public oa1 s;
    public boolean t;
    public sq5 v;
    public zp2 w;
    public boolean x;
    public boolean y;
    public i36 z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public te2 u = new r18((byte) 18);
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public long A = -9223372036854775807L;

    public h32(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, hp0 hp0Var, ts6 ts6Var, Executor executor, ws6 ws6Var, xe2 xe2Var, int i, boolean z) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = hp0Var;
        this.h = ts6Var;
        this.i = executor;
        this.j = ws6Var;
        this.o = xe2Var;
        this.p = z;
        this.l = new he6(hp0.h(hp0Var), i);
        this.m = new sr1(i);
        this.n = new sr1(i);
    }

    @Override // defpackage.ye2
    public final void a(long j) {
        this.h.f(new tb1(this, j, (byte) 2), true);
    }

    @Override // defpackage.ve2
    public final void b() {
        this.h.h();
        if (this.k.isEmpty()) {
            zp2 zp2Var = this.w;
            zp2Var.getClass();
            zp2Var.D();
            this.t = false;
            return;
        }
        io3.B(!this.p);
        this.t = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ve2
    public final void c(oe2 oe2Var, we2 we2Var, final long j) {
        this.h.h();
        long j2 = this.A;
        boolean z = false;
        Object[] objArr = 0;
        Executor executor = this.i;
        if (j2 == -9223372036854775807L) {
            final Object[] objArr2 = objArr == true ? 1 : 0;
            executor.execute(new Runnable(this) { // from class: g32
                public final /* synthetic */ h32 y;

                {
                    this.y = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b = objArr2;
                    long j3 = j;
                    h32 h32Var = this.y;
                    switch (b) {
                        case 0:
                            h32Var.j.d(j3, false);
                            return;
                        default:
                            h32Var.j.d(j3, true);
                            return;
                    }
                }
            });
        }
        final byte b = 1;
        if (this.o == null) {
            if (this.p) {
                i(oe2Var, we2Var, j, j * 1000);
            } else {
                ef6 ef6Var = new ef6(we2Var, j);
                ConcurrentLinkedQueue concurrentLinkedQueue = this.k;
                concurrentLinkedQueue.add(ef6Var);
                long j3 = this.A;
                if (j3 != -9223372036854775807L) {
                    if (j == j3) {
                        this.A = -9223372036854775807L;
                        executor.execute(new Runnable(this) { // from class: g32
                            public final /* synthetic */ h32 y;

                            {
                                this.y = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b2 = b;
                                long j32 = j;
                                h32 h32Var = this.y;
                                switch (b2) {
                                    case 0:
                                        h32Var.j.d(j32, false);
                                        return;
                                    default:
                                        h32Var.j.d(j32, true);
                                        return;
                                }
                            }
                        });
                        i(oe2Var, we2Var, j, System.nanoTime());
                        concurrentLinkedQueue.clear();
                    } else {
                        this.u.k(we2Var);
                    }
                }
            }
            this.u.h();
            return;
        }
        if (this.l.d() > 0) {
            z = true;
        }
        io3.B(z);
        i(oe2Var, we2Var, j, j * 1000);
    }

    @Override // defpackage.ve2
    public final void d(we2 we2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ve2
    public final void e(dn0 dn0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ve2
    public final void f(Executor executor, ac1 ac1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ve2
    public final void flush() {
        int d;
        this.h.h();
        this.k.clear();
        int i = 0;
        this.t = false;
        this.A = -9223372036854775807L;
        oa1 oa1Var = this.s;
        if (oa1Var != null) {
            oa1Var.flush();
        }
        this.u.q();
        xe2 xe2Var = this.o;
        if (xe2Var != null) {
            return;
        }
        while (true) {
            if (xe2Var == null) {
                d = 1;
            } else {
                d = this.l.d();
            }
            if (i < d) {
                this.u.h();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ve2
    public final void g(te2 te2Var) {
        int d;
        this.h.h();
        this.u = te2Var;
        int i = 0;
        while (true) {
            if (this.o == null) {
                d = 1;
            } else {
                d = this.l.d();
            }
            if (i < d) {
                te2Var.h();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [ew2, jw2] */
    public final boolean h(oe2 oe2Var, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.q == i && this.r == i2 && this.v != null) {
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = this.b;
        if (z) {
            this.q = i;
            this.r = i2;
            sq5 j = h41.j(arrayList, i, i2);
            if (!Objects.equals(this.v, j)) {
                this.v = j;
                this.i.execute(new f32((Object) this, (Object) j, (byte) 2));
            }
        }
        this.v.getClass();
        i36 i36Var = this.z;
        oa1 oa1Var = null;
        xe2 xe2Var = this.o;
        if (i36Var == null && xe2Var == null) {
            if (this.B != null) {
                z4 = false;
            }
            io3.B(z4);
            oa1 oa1Var2 = this.s;
            if (oa1Var2 != null) {
                oa1Var2.release();
                this.s = null;
            }
            kb0.O("FinalShaderWrapper", "Output surface and size not set, dropping frame.");
            return false;
        }
        if (i36Var == null) {
            i3 = this.v.a;
        } else {
            i3 = i36Var.b;
        }
        if (i36Var == null) {
            i4 = this.v.b;
        } else {
            i4 = i36Var.c;
        }
        hp0 hp0Var = this.g;
        if (i36Var != null && this.B == null) {
            this.B = oe2Var.w(this.d, i36Var.a, hp0Var.c, i36Var.e);
        }
        if (xe2Var != null) {
            this.l.c(oe2Var, i3, i4);
        }
        oa1 oa1Var3 = this.s;
        if (oa1Var3 == null || (!this.y && !z && !this.x)) {
            oa1Var = oa1Var3;
        } else {
            oa1Var3.release();
            this.s = null;
        }
        if (oa1Var == null) {
            i36 i36Var2 = this.z;
            if (i36Var2 == null) {
                i5 = 0;
            } else {
                i5 = i36Var2.d;
            }
            ?? ew2Var = new ew2(4);
            ew2Var.d(arrayList);
            if (i5 != 0) {
                float f = i5 % 360.0f;
                if (f < 0.0f) {
                    f += 360.0f;
                }
                ew2Var.c(new za5(f));
            }
            ew2Var.c(it4.f(i3, i4));
            oa1 j2 = oa1.j(this.a, ew2Var.g(), this.c, hp0Var, 0);
            sq5 j3 = h41.j(j2.i, this.q, this.r);
            i36 i36Var3 = this.z;
            if (i36Var3 != null) {
                if (j3.a == i36Var3.b) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io3.B(z2);
                if (j3.b == i36Var3.c) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                io3.B(z3);
            }
            this.s = j2;
            this.y = false;
            this.x = false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void i(oe2 oe2Var, we2 we2Var, long j, long j2) {
        ?? r7;
        long j3;
        h32 h32Var;
        we2 we2Var2;
        h32 h32Var2;
        boolean z;
        try {
        } catch (ns6 | ze2 e) {
            e = e;
            this = this;
        }
        if (j2 != -2) {
            try {
            } catch (ns6 | ze2 e2) {
                e = e2;
                h32Var = this;
                r7 = we2Var;
                j3 = j;
            }
            if (h(oe2Var, we2Var.c, we2Var.d)) {
                long j4 = this.A;
                if (j4 != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || j == j4) {
                    if (this.z != null) {
                        h32 h32Var3 = this;
                        j3 = j;
                        try {
                            h32Var3.j(we2Var, j3, j2);
                            we2Var2 = we2Var;
                            h32Var2 = h32Var3;
                        } catch (ns6 | ze2 e3) {
                            e = e3;
                            r7 = we2Var;
                            h32Var = h32Var3;
                            h32Var.i.execute(new c61(h32Var, e, j3, (byte) 1));
                            h32Var2 = h32Var;
                            we2Var2 = r7;
                            h32Var2.u.k(we2Var2);
                            return;
                        }
                    } else {
                        h32 h32Var4 = this;
                        we2 we2Var3 = we2Var;
                        xe2 xe2Var = h32Var4.o;
                        h32Var2 = h32Var4;
                        we2Var2 = we2Var3;
                        if (xe2Var != null) {
                            h32Var4.k(we2Var3, j);
                            h32Var2 = h32Var4;
                            we2Var2 = we2Var3;
                        }
                    }
                    h32Var2.u.k(we2Var2);
                    return;
                }
            }
        }
        this.u.k(we2Var);
        if (j2 == -2) {
            this.w.getClass();
        }
    }

    public final void j(we2 we2Var, long j, long j2) {
        boolean z;
        EGLSurface eGLSurface = this.B;
        eGLSurface.getClass();
        i36 i36Var = this.z;
        i36Var.getClass();
        oa1 oa1Var = this.s;
        oa1Var.getClass();
        int i = i36Var.b;
        int i2 = i36Var.c;
        EGLDisplay eGLDisplay = this.d;
        a34.S(eGLDisplay, this.e, eGLSurface, i, i2);
        a34.B();
        oa1Var.h(we2Var.a, j);
        if (j2 == -3) {
            if (j != -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            j2 = 1000 * j;
        }
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j2);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        this.w.getClass();
        a61.a();
    }

    public final void k(we2 we2Var, long j) {
        we2 f = this.l.f();
        this.m.a(j);
        a34.T(f.b, f.c, f.d);
        a34.B();
        oa1 oa1Var = this.s;
        oa1Var.getClass();
        oa1Var.h(we2Var.a, j);
        this.n.a(a34.O());
        xe2 xe2Var = this.o;
        xe2Var.getClass();
        xe2Var.a(this, f, j);
    }

    @Override // defpackage.ve2
    public final void release() {
        this.h.h();
        oa1 oa1Var = this.s;
        if (oa1Var != null) {
            oa1Var.release();
            this.s = null;
        }
        try {
            try {
                this.l.b();
                a34.Q(this.d, this.B);
                a34.p();
            } catch (ze2 e) {
                throw new ns6(e);
            }
        } finally {
            this.B = null;
        }
    }
}
