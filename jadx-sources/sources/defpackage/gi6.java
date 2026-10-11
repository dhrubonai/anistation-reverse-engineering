package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gi6 {
    public final ic6 a;
    public final h95 b;
    public final he1 c;
    public final ti4 d;

    public gi6(ic6 ic6Var, h95 h95Var) {
        he1 he1Var;
        this.a = ic6Var;
        this.b = h95Var;
        if (h95Var != null) {
            he1Var = ut5.b(new lb5((Object) this, (Object) h95Var, (byte) 15));
        } else {
            he1Var = null;
        }
        this.c = he1Var;
        m47 m47Var = m47.x;
        this.d = xt5.g(new nh5(m47Var, m47Var));
    }

    public static void h(gi6 gi6Var, CharSequence charSequence, boolean z, boolean z2, int i) {
        boolean z3;
        ia6 ia6Var;
        boolean z4;
        boolean z5;
        if ((i & 2) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i & 4) != 0) {
            ia6Var = ia6.x;
        } else {
            ia6Var = ia6.y;
        }
        if ((i & 8) != 0) {
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i & 16) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        ic6 ic6Var = gi6Var.a;
        ic6Var.b.a().n();
        o96 o96Var = ic6Var.b;
        if (z3) {
            o96Var.f(null);
        }
        long j = o96Var.C;
        o96.d(o96Var, nd6.g(j), nd6.f(j), charSequence, 0, z5, 24);
        int length = charSequence.length() + nd6.g(j);
        ss5.j(o96Var, length, length);
        gi6Var.l(o96Var);
        ic6Var.b(z4, ia6Var);
        ic6Var.f(true);
        ic6Var.e(ic6Var.b.A);
    }

    public static void i(gi6 gi6Var, String str, long j, boolean z, boolean z2, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        ic6 ic6Var = gi6Var.a;
        ic6Var.b.a().n();
        o96 o96Var = ic6Var.b;
        long e = gi6Var.e(j);
        o96.d(o96Var, nd6.g(e), nd6.f(e), str, 0, z3, 24);
        int length = str.length() + nd6.g(e);
        ss5.j(o96Var, length, length);
        gi6Var.l(o96Var);
        ic6Var.b(z, ia6.x);
        ic6Var.f(true);
        ic6Var.e(ic6Var.b.A);
    }

    public final void a() {
        ic6 ic6Var = this.a;
        ic6Var.b.a().n();
        o96 o96Var = ic6Var.b;
        int f = nd6.f(o96Var.C);
        ss5.j(o96Var, f, f);
        ic6Var.b(true, ia6.x);
        ic6Var.f(true);
        ic6Var.e(ic6Var.b.A);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.jf r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fi6
            if (r0 == 0) goto L13
            r0 = r6
            fi6 r0 = (defpackage.fi6) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            fi6 r0 = new fi6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return
        L27:
            defpackage.m37.N(r6)
            goto L56
        L2b:
            defpackage.m37.N(r6)
            r0.z = r2
            qg0 r6 = new qg0
            vz0 r0 = defpackage.wc7.z(r0)
            r6.<init>(r2, r0)
            r6.t()
            ic6 r0 = r4.a
            z44 r0 = r0.h
            r0.b(r5)
            od r0 = new od
            r1 = 26
            r0.<init>(r4, r5, r1)
            r6.v(r0)
            java.lang.Object r4 = r6.r()
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L56
            return
        L56:
            defpackage.v71.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi6.b(jf, xz0):void");
    }

    public final void c(boolean z) {
        ic6 ic6Var = this.a;
        ic6Var.b.a().n();
        o96 o96Var = ic6Var.b;
        o96.d(o96Var, nd6.g(o96Var.C), nd6.f(o96Var.C), "", 0, z, 24);
        int g = nd6.g(o96Var.C);
        ss5.j(o96Var, g, g);
        l(o96Var);
        ic6Var.b(true, ia6.y);
        ic6Var.f(true);
        ic6Var.e(ic6Var.b.A);
    }

    public final p96 d() {
        ei6 ei6Var;
        he1 he1Var = this.c;
        if (he1Var != null && (ei6Var = (ei6) he1Var.getValue()) != null) {
            return ei6Var.a;
        }
        return this.a.c();
    }

    public final long e(long j) {
        l13 l13Var;
        long a;
        ei6 ei6Var;
        he1 he1Var = this.c;
        if (he1Var != null && (ei6Var = (ei6) he1Var.getValue()) != null) {
            l13Var = ei6Var.b;
        } else {
            l13Var = null;
        }
        if (l13Var != null) {
            int i = nd6.c;
            long a2 = l13Var.a((int) (j >> 32), false);
            if (nd6.d(j)) {
                a = a2;
            } else {
                a = l13Var.a((int) (4294967295L & j), false);
            }
            int min = Math.min(nd6.g(a2), nd6.g(a));
            int max = Math.max(nd6.f(a2), nd6.f(a));
            if (nd6.h(j)) {
                return fy5.a(max, min);
            }
            return fy5.a(min, max);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gi6) {
                gi6 gi6Var = (gi6) obj;
                if (this.a == gi6Var.a && a34.i(this.b, gi6Var.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final long f(long j) {
        l13 l13Var;
        ei6 ei6Var;
        he1 he1Var = this.c;
        if (he1Var != null && (ei6Var = (ei6) he1Var.getValue()) != null) {
            l13Var = ei6Var.b;
        } else {
            l13Var = null;
        }
        if (l13Var != null) {
            return xt5.e(j, l13Var, (nh5) this.d.getValue());
        }
        return j;
    }

    public final void g(CharSequence charSequence) {
        ic6 ic6Var = this.a;
        ic6Var.b.a().n();
        o96 o96Var = ic6Var.b;
        o96Var.c("", 0, o96Var.y.length());
        o96Var.append(charSequence.toString());
        l(o96Var);
        ic6Var.b(true, ia6.x);
        ic6Var.f(true);
        ic6Var.e(ic6Var.b.A);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        h95 h95Var = this.b;
        if (h95Var != null) {
            i = h95Var.hashCode();
        } else {
            i = 0;
        }
        return (hashCode + i) * 31;
    }

    public final void j(long j) {
        k(e(j));
    }

    public final void k(long j) {
        ic6 ic6Var = this.a;
        ic6Var.b.a().n();
        o96 o96Var = ic6Var.b;
        int i = nd6.c;
        ss5.j(o96Var, (int) (j >> 32), (int) (j & 4294967295L));
        ic6Var.b(true, ia6.x);
        ic6Var.f(true);
        ic6Var.e(ic6Var.b.A);
    }

    public final void l(o96 o96Var) {
        if (((z44) o96Var.a().y).z > 0 && nd6.d(o96Var.C)) {
            m47 m47Var = m47.x;
            this.d.setValue(new nh5(m47Var, m47Var));
        }
    }

    public final String toString() {
        ic6 ic6Var = this.a;
        return "TransformedTextFieldState(textFieldState=" + ic6Var + ", outputTransformation=null, outputTransformedText=null, codepointTransformation=" + this.b + ", codepointTransformedText=" + this.c + ", outputText=\"" + ((Object) ic6Var.c()) + "\", visualText=\"" + ((Object) d()) + "\")";
    }
}
