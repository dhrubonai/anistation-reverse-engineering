package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mb3 implements it0 {
    public int A;
    public int B;
    public final p44 C;
    public final p44 D;
    public final hb3 E;
    public final eb3 F;
    public final p44 G;
    public final y06 H;
    public final p44 I;
    public final z44 J;
    public int K;
    public int L;
    public final String M;
    public final za3 x;
    public qu0 y;
    public z06 z;

    public mb3(za3 za3Var, z06 z06Var) {
        this.x = za3Var;
        this.z = z06Var;
        long[] jArr = cb5.a;
        this.C = new p44();
        this.D = new p44();
        this.E = new hb3(this);
        this.F = new eb3(this);
        this.G = new p44();
        this.H = new y06();
        this.I = new p44();
        this.J = new z44(new Object[16], 0);
        this.M = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(fb3 fb3Var) {
        q44 q44Var;
        nk4 nk4Var = fb3Var.f;
        if (nk4Var != null) {
            nk4Var.h.set(pk4.y);
            b25 b25Var = nk4Var.k;
            if (((q44) b25Var.g).h()) {
                q44Var = (q44) b25Var.g;
                q44 q44Var2 = db5.a;
                b25Var.g = new q44();
                ((z44) b25Var.c).h();
            } else {
                q44Var = null;
            }
            b25Var.c();
            vu0 vu0Var = nk4Var.a;
            vu0Var.N = null;
            if (q44Var != null) {
                vu0Var.R.i = q44Var;
                vu0Var.T = (byte) 2;
            }
            fb3Var.f = null;
            vu0 vu0Var2 = fb3Var.c;
            if (vu0Var2 != null) {
                vu0Var2.p();
            }
            fb3Var.c = null;
        }
    }

    @Override // defpackage.it0
    public final void a() {
        vu0 vu0Var;
        za3 za3Var = this.x;
        za3Var.N = true;
        p44 p44Var = this.C;
        Object[] objArr = p44Var.c;
        long[] jArr = p44Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (vu0Var = ((fb3) objArr[(i << 3) + i3]).c) != null) {
                            vu0Var.p();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        za3Var.Q();
        za3Var.N = false;
        p44Var.a();
        this.D.a();
        this.L = 0;
        this.K = 0;
        this.G.a();
        h();
    }

    public final void b(fb3 fb3Var, boolean z) {
        ub2 ub2Var;
        nk4 nk4Var = fb3Var.f;
        if (nk4Var != null) {
            ft5 b = et5.b();
            if (b != null) {
                ub2Var = b.e();
            } else {
                ub2Var = null;
            }
            ft5 e = et5.e(b);
            try {
                za3 za3Var = this.x;
                za3Var.N = true;
                if (z) {
                    while (!nk4Var.c()) {
                        try {
                            nk4Var.e(new qi2((byte) 8));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                nk4Var.a();
                fb3Var.f = null;
                za3Var.N = false;
            } finally {
                et5.k(b, e, ub2Var);
            }
        }
    }

    @Override // defpackage.it0
    public final void c() {
        i(true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, v06] */
    public final v06 e(Object obj) {
        if (!this.x.I()) {
            return new Object();
        }
        return new lb3(this, obj);
    }

    public final void f(int i) {
        boolean z;
        ub2 ub2Var;
        boolean z2 = false;
        this.K = 0;
        List o = this.x.o();
        d44 d44Var = (d44) o;
        int i2 = (((z44) d44Var.y).z - this.L) - 1;
        if (i <= i2) {
            this.H.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.C.g((za3) d44Var.get(i3));
                    g.getClass();
                    ((g44) this.H.y).a(((fb3) g).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.z.i(this.H);
            ft5 b = et5.b();
            if (b != null) {
                ub2Var = b.e();
            } else {
                ub2Var = null;
            }
            ft5 e = et5.e(b);
            z = false;
            while (i2 >= i) {
                try {
                    za3 za3Var = (za3) ((d44) o).get(i2);
                    Object g2 = this.C.g(za3Var);
                    g2.getClass();
                    fb3 fb3Var = (fb3) g2;
                    Object obj = fb3Var.a;
                    if (((g44) this.H.y).c(obj)) {
                        this.K++;
                        if (((Boolean) fb3Var.g.getValue()).booleanValue()) {
                            db3 db3Var = za3Var.d0;
                            uo3 uo3Var = db3Var.p;
                            xa3 xa3Var = xa3.z;
                            uo3Var.I = xa3Var;
                            em3 em3Var = db3Var.q;
                            if (em3Var != null) {
                                em3Var.G = xa3Var;
                            }
                            l(fb3Var, false);
                            if (fb3Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        za3 za3Var2 = this.x;
                        za3Var2.N = true;
                        this.C.l(za3Var);
                        vu0 vu0Var = fb3Var.c;
                        if (vu0Var != null) {
                            vu0Var.p();
                        }
                        this.x.R(i2, 1);
                        za3Var2.N = false;
                    }
                    this.D.l(obj);
                    i2--;
                } catch (Throwable th) {
                    et5.k(b, e, ub2Var);
                    throw th;
                }
            }
            et5.k(b, e, ub2Var);
        } else {
            z = false;
        }
        if (z) {
            synchronized (mt5.c) {
                q44 q44Var = mt5.j.h;
                if (q44Var != null) {
                    if (q44Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                mt5.c();
            }
        }
        h();
    }

    public final void g(Object obj) {
        h();
        za3 za3Var = (za3) this.G.l(obj);
        za3 za3Var2 = this.x;
        if (za3Var != null) {
            if (this.L <= 0) {
                ez2.b("No pre-composed items to dispose");
            }
            int j = ((z44) ((d44) za3Var2.o()).y).j(za3Var);
            if (j < ((z44) ((d44) za3Var2.o()).y).z - this.L) {
                ez2.b("Item is not in pre-composed item range");
            }
            this.K++;
            this.L--;
            fb3 fb3Var = (fb3) this.C.g(za3Var);
            if (fb3Var != null) {
                d(fb3Var);
            }
            int i = (((z44) ((d44) za3Var2.o()).y).z - this.L) - this.K;
            j(j, i);
            f(i);
        }
        if (this.J.i(obj)) {
            za3.W(za3Var2, true, 6);
        }
    }

    public final void h() {
        int i = ((z44) ((d44) this.x.o()).y).z;
        int i2 = this.C.e;
        if (i2 != i) {
            ez2.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.K;
        int i4 = this.L;
        if ((i - i3) - i4 < 0) {
            StringBuilder u = qx1.u("Incorrect state. Total children ", i, ". Reusable children ", i3, ". Precomposed children ");
            u.append(i4);
            ez2.a(u.toString());
        }
        int i5 = this.G.e;
        int i6 = this.L;
        if (i5 == i6) {
            return;
        }
        ez2.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        ub2 ub2Var;
        this.L = 0;
        this.G.a();
        List o = this.x.o();
        int i = ((z44) ((d44) o).y).z;
        if (this.K != i) {
            this.K = i;
            ft5 b = et5.b();
            if (b != null) {
                ub2Var = b.e();
            } else {
                ub2Var = null;
            }
            ft5 e = et5.e(b);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    za3 za3Var = (za3) ((d44) o).get(i2);
                    fb3 fb3Var = (fb3) this.C.g(za3Var);
                    if (fb3Var != null && ((Boolean) fb3Var.g.getValue()).booleanValue()) {
                        db3 db3Var = za3Var.d0;
                        uo3 uo3Var = db3Var.p;
                        xa3 xa3Var = xa3.z;
                        uo3Var.I = xa3Var;
                        em3 em3Var = db3Var.q;
                        if (em3Var != null) {
                            em3Var.G = xa3Var;
                        }
                        l(fb3Var, z);
                        fb3Var.a = te4.j;
                    }
                } catch (Throwable th) {
                    et5.k(b, e, ub2Var);
                    throw th;
                }
            }
            et5.k(b, e, ub2Var);
            this.D.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        za3 za3Var = this.x;
        za3Var.N = true;
        za3Var.M(i, i2, 1);
        za3Var.N = false;
    }

    public final void k(Object obj, ic2 ic2Var, boolean z) {
        za3 za3Var = this.x;
        if (za3Var.I()) {
            h();
            if (!this.D.c(obj)) {
                this.I.l(obj);
                p44 p44Var = this.G;
                Object g = p44Var.g(obj);
                if (g == null) {
                    g = n(obj);
                    if (g != null) {
                        j(((z44) ((d44) za3Var.o()).y).j(g), ((z44) ((d44) za3Var.o()).y).z);
                        this.L++;
                    } else {
                        int i = ((z44) ((d44) za3Var.o()).y).z;
                        za3 za3Var2 = new za3(2);
                        za3Var.N = true;
                        za3Var.C(i, za3Var2);
                        za3Var.N = false;
                        this.L++;
                        g = za3Var2;
                    }
                    p44Var.n(obj, g);
                }
                m((za3) g, obj, z, ic2Var);
            }
        }
    }

    public final void l(fb3 fb3Var, boolean z) {
        vu0 vu0Var;
        if (!z && fb3Var.h) {
            fb3Var.g.setValue(Boolean.FALSE);
        } else {
            fb3Var.g = xt5.g(Boolean.FALSE);
        }
        if (fb3Var.f != null) {
            d(fb3Var);
            return;
        }
        if (z) {
            vu0 vu0Var2 = fb3Var.c;
            if (vu0Var2 != null) {
                vu0Var2.o();
                return;
            }
            return;
        }
        vg4 m162getOutOfFrameExecutor = ((oa) cb3.a(this.x)).m162getOutOfFrameExecutor();
        if (m162getOutOfFrameExecutor != null) {
            ((oa) m162getOutOfFrameExecutor).C(new vt0(fb3Var, (byte) 18));
        } else if (!fb3Var.h && (vu0Var = fb3Var.c) != null) {
            vu0Var.o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0083, B:45:0x00ad, B:47:0x00bf, B:49:0x00d5, B:51:0x00d9, B:52:0x011f, B:55:0x00e6, B:56:0x00f1, B:58:0x00f5, B:60:0x010c, B:63:0x0116, B:64:0x0111, B:65:0x011c, B:66:0x00c2, B:69:0x0092, B:71:0x00a0, B:72:0x0129, B:73:0x0133), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0083, B:45:0x00ad, B:47:0x00bf, B:49:0x00d5, B:51:0x00d9, B:52:0x011f, B:55:0x00e6, B:56:0x00f1, B:58:0x00f5, B:60:0x010c, B:63:0x0116, B:64:0x0111, B:65:0x011c, B:66:0x00c2, B:69:0x0092, B:71:0x00a0, B:72:0x0129, B:73:0x0133), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0083, B:45:0x00ad, B:47:0x00bf, B:49:0x00d5, B:51:0x00d9, B:52:0x011f, B:55:0x00e6, B:56:0x00f1, B:58:0x00f5, B:60:0x010c, B:63:0x0116, B:64:0x0111, B:65:0x011c, B:66:0x00c2, B:69:0x0092, B:71:0x00a0, B:72:0x0129, B:73:0x0133), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0083, B:45:0x00ad, B:47:0x00bf, B:49:0x00d5, B:51:0x00d9, B:52:0x011f, B:55:0x00e6, B:56:0x00f1, B:58:0x00f5, B:60:0x010c, B:63:0x0116, B:64:0x0111, B:65:0x011c, B:66:0x00c2, B:69:0x0092, B:71:0x00a0, B:72:0x0129, B:73:0x0133), top: B:36:0x0076 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fb3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.za3 r10, java.lang.Object r11, boolean r12, defpackage.ic2 r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb3.m(za3, java.lang.Object, boolean, ic2):void");
    }

    public final za3 n(Object obj) {
        p44 p44Var;
        int i;
        if (this.K != 0) {
            d44 d44Var = (d44) this.x.o();
            int i2 = ((z44) d44Var.y).z - this.L;
            int i3 = i2 - this.K;
            int i4 = i2 - 1;
            int i5 = i4;
            while (true) {
                p44Var = this.C;
                if (i5 >= i3) {
                    Object g = p44Var.g((za3) d44Var.get(i5));
                    g.getClass();
                    if (a34.i(((fb3) g).a, obj)) {
                        i = i5;
                        break;
                    }
                    i5--;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                while (i4 >= i3) {
                    Object g2 = p44Var.g((za3) d44Var.get(i4));
                    g2.getClass();
                    fb3 fb3Var = (fb3) g2;
                    Object obj2 = fb3Var.a;
                    if (obj2 != te4.j && !this.z.q(obj, obj2)) {
                        i4--;
                    } else {
                        fb3Var.a = obj;
                        i5 = i4;
                        i = i5;
                        break;
                    }
                }
                i5 = i4;
            }
            if (i == -1) {
                return null;
            }
            if (i5 != i3) {
                j(i5, i3);
            }
            this.K--;
            za3 za3Var = (za3) d44Var.get(i3);
            Object g3 = p44Var.g(za3Var);
            g3.getClass();
            fb3 fb3Var2 = (fb3) g3;
            fb3Var2.g = xt5.g(Boolean.TRUE);
            fb3Var2.e = true;
            fb3Var2.d = true;
            return za3Var;
        }
        return null;
    }
}
