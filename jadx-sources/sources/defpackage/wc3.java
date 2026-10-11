package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wc3 implements kd5 {
    public static final y23 w = x97.G(new st0((byte) 25), new p03(5));
    public final k91 a;
    public boolean b;
    public mc3 c;
    public final pc3 d;
    public final ti4 e;
    public final u34 f;
    public float g;
    public final ma1 h;
    public final boolean i;
    public za3 j;
    public final uc3 k;
    public final iz l;
    public final od3 m;
    public final v90 n;
    public final be3 o;
    public final i75 p;
    public final yd3 q;
    public final w44 r;
    public final w44 s;
    public final ti4 t;
    public final ti4 u;
    public final l33 v;

    /* JADX WARN: Type inference failed for: r0v0, types: [k91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [iz, java.lang.Object] */
    public wc3(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.e = new z44(new ae3[16], 0);
        obj.c = -1;
        this.a = obj;
        this.d = new pc3(i, i2, (byte) 0);
        this.e = new ti4(yc3.a, h95.H);
        this.f = new u34();
        this.h = new ma1(new lz0(this, (byte) 21));
        this.i = true;
        this.k = new uc3(this, (byte) 0);
        this.l = new Object();
        this.m = new od3();
        this.n = new v90((byte) 1);
        this.o = new be3(new xm((Object) this, i, (byte) 2));
        this.p = new i75((Object) this, (byte) 28);
        this.q = new yd3();
        this.r = nx7.u();
        this.s = nx7.u();
        Boolean bool = Boolean.FALSE;
        this.t = xt5.g(bool);
        this.u = xt5.g(bool);
        this.v = new l33((byte) 2);
    }

    public static Object i(wc3 wc3Var, int i, t36 t36Var) {
        wc3Var.getClass();
        Object d = wc3Var.d(c54.x, new vq(wc3Var, i, null, (byte) 1), t36Var);
        if (d == w11.x) {
            return d;
        }
        return pn6.a;
    }

    @Override // defpackage.kd5
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.kd5
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.kd5
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r6.h.d(r7, r8, r0) != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6.l.f(r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.kd5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.c54 r7, defpackage.ic2 r8, defpackage.xz0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.vc3
            if (r0 == 0) goto L13
            r0 = r9
            vc3 r0 = (defpackage.vc3) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            vc3 r0 = new vc3
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.z
            int r1 = r0.B
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m37.N(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L31:
            t36 r7 = r0.y
            r8 = r7
            ic2 r8 = (defpackage.ic2) r8
            c54 r7 = r0.x
            defpackage.m37.N(r9)
            goto L5b
        L3c:
            defpackage.m37.N(r9)
            ti4 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            mc3 r1 = defpackage.yc3.a
            if (r9 != r1) goto L5b
            r0.x = r7
            r9 = r8
            t36 r9 = (defpackage.t36) r9
            r0.y = r9
            r0.B = r4
            iz r9 = r6.l
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.x = r2
            r0.y = r2
            r0.B = r3
            ma1 r6 = r6.h
            java.lang.Object r6 = r6.d(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc3.d(c54, ic2, xz0):java.lang.Object");
    }

    @Override // defpackage.kd5
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(mc3 mc3Var, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        nc3 nc3Var;
        boolean z4;
        int i3;
        nc3 nc3Var2;
        nc3 nc3Var3;
        List list = mc3Var.n;
        int i4 = mc3Var.q;
        oc3 oc3Var = mc3Var.a;
        int i5 = mc3Var.b;
        this.o.e = list.size();
        Object obj = null;
        ub2 ub2Var = null;
        obj = null;
        boolean z5 = false;
        pc3 pc3Var = this.d;
        l33 l33Var = this.v;
        if (!z && this.b) {
            this.c = mc3Var;
            ft5 b = et5.b();
            if (b != null) {
                ub2Var = b.e();
            }
            ft5 e = et5.e(b);
            try {
                if (((Number) ((ml) l33Var.z).y.getValue()).floatValue() == 0.0f) {
                    z5 = true;
                }
                if (!z5 && i5 == pc3Var.c.h() && oc3Var != null && (nc3Var3 = (nc3) ms.J0(oc3Var.b)) != null && nc3Var3.a == pc3Var.b.h()) {
                    l33Var.q();
                }
                return;
            } finally {
                et5.k(b, e, ub2Var);
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= mc3Var.d;
        this.e.setValue(mc3Var);
        if (oc3Var != null) {
            i = oc3Var.a;
        } else {
            i = 0;
        }
        if (i == 0 && i5 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.u.setValue(Boolean.valueOf(z3));
        this.t.setValue(Boolean.valueOf(mc3Var.c));
        if (z2) {
            pc3Var.getClass();
            if (i5 < 0.0f) {
                hz2.c("scrollOffset should be non-negative");
            }
            pc3Var.c.i(i5);
        } else {
            pc3Var.getClass();
            if (oc3Var != null && (nc3Var2 = (nc3) ms.J0(oc3Var.b)) != null) {
                obj = nc3Var2.b;
            }
            pc3Var.e = obj;
            if (pc3Var.d || i4 > 0) {
                pc3Var.d = true;
                if (i5 < 0.0f) {
                    hz2.c("scrollOffset should be non-negative (" + i5 + ")");
                }
                if (oc3Var != null && (nc3Var = (nc3) ms.J0(oc3Var.b)) != null) {
                    i2 = nc3Var.a;
                } else {
                    i2 = 0;
                }
                pc3Var.a(i2, i5);
            }
            if (this.i) {
                k91 k91Var = this.a;
                z44 z44Var = (z44) k91Var.e;
                int i6 = k91Var.a;
                boolean z6 = k91Var.b;
                if (i6 != -1 && !list.isEmpty() && i6 != k91.b(mc3Var, z6)) {
                    k91Var.a = -1;
                    Object[] objArr = z44Var.x;
                    int i7 = z44Var.z;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((ae3) objArr[i8]).cancel();
                    }
                    z44Var.h();
                }
                int i9 = k91Var.c;
                if (i9 != -1 && k91Var.d != 0.0f && i9 != i4 && !list.isEmpty()) {
                    if (k91Var.d < 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int b2 = k91.b(mc3Var, z4);
                    if (k91Var.d < 0.0f) {
                        z5 = true;
                    }
                    if (z5) {
                        i3 = ((nc3) yo0.r0(list)).a + 1;
                    } else {
                        i3 = ((nc3) yo0.k0(list)).a - 1;
                    }
                    if (i3 >= 0 && i3 < i4 && b2 != k91Var.a && b2 >= 0) {
                        k91Var.a = b2;
                        z44Var.h();
                        z44Var.d(z44Var.z, this.p.u(b2));
                    }
                }
                k91Var.c = i4;
            }
        }
        if (z) {
            l33Var.t(mc3Var.f, mc3Var.i, mc3Var.h);
        }
    }

    public final mc3 g() {
        return (mc3) this.e.getValue();
    }

    public final void h(float f, mc3 mc3Var) {
        boolean z;
        int i;
        long j;
        if (this.i) {
            k91 k91Var = this.a;
            z44 z44Var = (z44) k91Var.e;
            List list = mc3Var.n;
            List list2 = mc3Var.n;
            rg4 rg4Var = mc3Var.r;
            if (!list.isEmpty()) {
                int i2 = 0;
                if (f < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                int b = k91.b(mc3Var, z);
                if (z) {
                    i = ((nc3) yo0.r0(list2)).a + 1;
                } else {
                    i = ((nc3) yo0.k0(list2)).a - 1;
                }
                if (i >= 0 && i < mc3Var.q) {
                    if (b != k91Var.a && b >= 0) {
                        if (k91Var.b != z) {
                            Object[] objArr = z44Var.x;
                            int i3 = z44Var.z;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((ae3) objArr[i4]).cancel();
                            }
                        }
                        k91Var.b = z;
                        k91Var.a = b;
                        z44Var.h();
                        z44Var.d(z44Var.z, this.p.u(b));
                    }
                    if (z) {
                        nc3 nc3Var = (nc3) yo0.r0(list2);
                        if (rg4Var == rg4.x) {
                            j = nc3Var.w & 4294967295L;
                        } else {
                            j = nc3Var.w >> 32;
                        }
                        int i5 = (int) j;
                        if (((jf7.A(nc3Var, rg4Var) + i5) + mc3Var.t) - mc3Var.p < (-f)) {
                            Object[] objArr2 = z44Var.x;
                            int i6 = z44Var.z;
                            while (i2 < i6) {
                                ((ae3) objArr2[i2]).a();
                                i2++;
                            }
                        }
                    } else {
                        if (mc3Var.o - jf7.A((nc3) yo0.k0(list2), rg4Var) < f) {
                            Object[] objArr3 = z44Var.x;
                            int i7 = z44Var.z;
                            while (i2 < i7) {
                                ((ae3) objArr3[i2]).a();
                                i2++;
                            }
                        }
                    }
                }
            }
            k91Var.d = f;
        }
    }
}
