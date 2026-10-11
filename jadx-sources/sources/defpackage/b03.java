package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b03 extends po0 implements Runnable, nd4, View.OnAttachStateChangeListener {
    public int A;
    public v57 B;
    public final p44 C;
    public final qi4 D;
    public final f44 E;
    public final zt5 F;
    public boolean z;

    public b03() {
        super(1);
        p44 p44Var = new p44(9);
        b67.a.getClass();
        p44Var.n(a67.b, new q67("caption bar"));
        p44Var.n(a67.c, new q67("display cutout"));
        p44Var.n(a67.d, new q67("ime"));
        p44Var.n(a67.e, new q67("mandatory system gestures"));
        p44Var.n(a67.f, new q67("navigation bars"));
        p44Var.n(a67.g, new q67("status bars"));
        p44Var.n(a67.h, new q67("system gestures"));
        p44Var.n(a67.i, new q67("tappable element"));
        p44Var.n(a67.j, new q67("waterfall"));
        this.C = p44Var;
        this.D = new qi4(0);
        this.E = new f44(4);
        this.F = new zt5();
    }

    public final void F(v57 v57Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        s34 s34Var = d67.a;
        int[] iArr3 = s34Var.b;
        Object[] objArr3 = s34Var.c;
        long[] jArr3 = s34Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            b67 b67Var = (b67) objArr3[i6];
                            yz2 i8 = v57Var.a.i(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (i8.a << 48) | (i8.b << 32) | (i8.c << 16) | i8.d;
                            Object g = this.C.g(b67Var);
                            g.getClass();
                            q67 q67Var = (q67) g;
                            j2 = j3;
                            if (!gy5.d(j4, q67Var.h)) {
                                q67Var.h = j4;
                                z2 = true;
                                if (!gy5.d(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                yz2 j5 = v57Var.a.j(i7);
                                objArr2 = objArr3;
                                long j6 = (j5.b << 32) | (j5.a << 48) | (j5.c << 16) | j5.d;
                                if (!gy5.d(q67Var.i, j6)) {
                                    q67Var.i = j6;
                                    z2 = true;
                                    if (!gy5.d(j6, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            q67Var.a.setValue(Boolean.valueOf(v57Var.a.u(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        th1 h = v57Var.a.h();
        if (h == null) {
            j = 0;
        } else {
            yz2 a = h.a();
            j = (a.a << c3) | (a.b << c2) | (a.c << c) | a.d;
        }
        p44 p44Var = this.C;
        b67.a.getClass();
        Object g2 = p44Var.g(a67.j);
        g2.getClass();
        q67 q67Var2 = (q67) g2;
        q67Var2.a.setValue(Boolean.valueOf(!gy5.d(j, 0L)));
        if (!gy5.d(q67Var2.h, j)) {
            q67Var2.h = j;
            q67Var2.i = j;
            z2 = z;
            if (!gy5.d(j, 0L)) {
                z3 = z2;
            }
        }
        if (h == null) {
            f44 f44Var = this.E;
            if (f44Var.b > 0) {
                f44Var.d();
                this.F.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = h.a.getBoundingRects();
            int size = boundingRects.size();
            f44 f44Var2 = this.E;
            if (size < f44Var2.b) {
                f44Var2.m(boundingRects.size(), this.E.b);
                this.F.d(boundingRects.size(), this.F.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.E.b;
                int i9 = 0;
                while (i9 < size2) {
                    f44 f44Var3 = this.E;
                    f44Var3.a(xt5.g(boundingRects.get(f44Var3.b)));
                    this.F.add(new lz2(qx1.h(this.E.b, "display cutout rect ")));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = boundingRects.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = boundingRects.get(i10);
                w44 w44Var = (w44) this.E.g(i10);
                if (!a34.i(w44Var.getValue(), rect)) {
                    w44Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!boundingRects.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.D.h() != 0) && z2) {
            qi4 qi4Var = this.D;
            qi4Var.i(qi4Var.h() + 1);
            synchronized (mt5.c) {
                q44 q44Var = mt5.j.h;
                if (q44Var != null) {
                    boolean z5 = z;
                    if (q44Var.h() == z5) {
                        z4 = z5;
                    }
                }
                z4 = false;
            }
            if (z4) {
                mt5.c();
            }
        }
    }

    @Override // defpackage.po0
    public final void d(c57 c57Var) {
        boolean z = false;
        this.z = false;
        int d = c57Var.a.d();
        this.A &= ~d;
        this.B = null;
        b67 b67Var = (b67) d67.a.b(d);
        if (b67Var != null) {
            Object g = this.C.g(b67Var);
            g.getClass();
            q67 q67Var = (q67) g;
            q67Var.c.i(0.0f);
            q67Var.e.i(1.0f);
            q67Var.d.i(0L);
            q67Var.c.i(0.0f);
            q67Var.b.setValue(Boolean.FALSE);
            q67Var.j = -1L;
            q67Var.k = -1L;
            qi4 qi4Var = this.D;
            qi4Var.i(qi4Var.h() + 1);
            synchronized (mt5.c) {
                q44 q44Var = mt5.j.h;
                if (q44Var != null) {
                    if (q44Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                mt5.c();
            }
        }
    }

    @Override // defpackage.po0
    public final void e(c57 c57Var) {
        this.z = true;
    }

    @Override // defpackage.po0
    public final v57 f(v57 v57Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c57 c57Var = (c57) list.get(i);
            b67 b67Var = (b67) d67.a.b(c57Var.a.d());
            if (b67Var != null) {
                Object g = this.C.g(b67Var);
                g.getClass();
                q67 q67Var = (q67) g;
                if (((Boolean) q67Var.b.getValue()).booleanValue()) {
                    b57 b57Var = c57Var.a;
                    q67Var.c.i(b57Var.c());
                    q67Var.e.i(b57Var.a());
                    q67Var.d.i(b57Var.b());
                }
            }
        }
        F(v57Var);
        return v57Var;
    }

    @Override // defpackage.po0
    public final l33 g(c57 c57Var, l33 l33Var) {
        v57 v57Var = this.B;
        boolean z = false;
        this.z = false;
        this.B = null;
        if (c57Var.a.b() > 0 && v57Var != null) {
            int d = c57Var.a.d();
            this.A |= d;
            b67 b67Var = (b67) d67.a.b(d);
            if (b67Var != null) {
                Object g = this.C.g(b67Var);
                g.getClass();
                q67 q67Var = (q67) g;
                yz2 i = v57Var.a.i(d);
                long j = (i.a << 48) | (i.b << 32) | (i.c << 16) | i.d;
                long j2 = q67Var.h;
                if (!gy5.d(j, j2)) {
                    q67Var.j = j2;
                    q67Var.k = j;
                    q67Var.b.setValue(Boolean.TRUE);
                    b57 b57Var = c57Var.a;
                    q67Var.c.i(b57Var.c());
                    q67Var.e.i(b57Var.a());
                    q67Var.d.i(b57Var.b());
                    qi4 qi4Var = this.D;
                    qi4Var.i(qi4Var.h() + 1);
                    synchronized (mt5.c) {
                        q44 q44Var = mt5.j.h;
                        if (q44Var != null) {
                            if (q44Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        mt5.c();
                        return l33Var;
                    }
                }
            }
        }
        return l33Var;
    }

    @Override // defpackage.nd4
    public final v57 i(View view, v57 v57Var) {
        if (this.z) {
            this.B = v57Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return v57Var;
            }
        } else if (this.A == 0) {
            F(v57Var);
        }
        return v57Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        int i = pv6.a;
        kv6.b(view, this);
        c57.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        int i = pv6.a;
        kv6.b(view, null);
        c57.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.z) {
            this.A = 0;
            this.z = false;
            v57 v57Var = this.B;
            if (v57Var != null) {
                F(v57Var);
                this.B = null;
            }
        }
    }
}
