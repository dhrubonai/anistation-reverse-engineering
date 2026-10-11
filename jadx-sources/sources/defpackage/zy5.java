package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class zy5 extends u0 implements m53, tl0 {
    public final y43 a;
    public final i97 b;
    public final m1 c;
    public final uj5 d;
    public int e;
    public tv f;
    public final g53 g;
    public final s53 h;

    public zy5(y43 y43Var, i97 i97Var, m1 m1Var, aj5 aj5Var, tv tvVar) {
        s53 s53Var;
        aj5Var.getClass();
        this.a = y43Var;
        this.b = i97Var;
        this.c = m1Var;
        this.d = y43Var.b;
        this.e = -1;
        this.f = tvVar;
        g53 g53Var = y43Var.a;
        this.g = g53Var;
        if (g53Var.f) {
            s53Var = null;
        } else {
            s53Var = new s53(aj5Var);
        }
        this.h = s53Var;
    }

    @Override // defpackage.u0, defpackage.l61
    public final float A() {
        m1 m1Var = this.c;
        String o = m1Var.o();
        try {
            float parseFloat = Float.parseFloat(o);
            if (!this.a.a.i && Math.abs(parseFloat) > Float.MAX_VALUE) {
                m1.u(m1Var, iv.J(Float.valueOf(parseFloat), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
                throw null;
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            m1.u(m1Var, qx1.g('\'', "Failed to parse type 'float' for input '", o), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.u0, defpackage.l61
    public final double C() {
        m1 m1Var = this.c;
        String o = m1Var.o();
        try {
            double parseDouble = Double.parseDouble(o);
            if (!this.a.a.i && Math.abs(parseDouble) > Double.MAX_VALUE) {
                m1.u(m1Var, iv.J(Double.valueOf(parseDouble), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
                throw null;
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            m1.u(m1Var, qx1.g('\'', "Failed to parse type 'double' for input '", o), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (defpackage.m37.s(r4.a, r5) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (i(r5) != (-1)) goto L19;
     */
    @Override // defpackage.u0, defpackage.gu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.aj5 r5) {
        /*
            r4 = this;
            r5.getClass()
            int r0 = r5.e()
            r1 = -1
            if (r0 != 0) goto L18
            y43 r0 = r4.a
            boolean r0 = defpackage.m37.s(r0, r5)
            if (r0 == 0) goto L18
        L12:
            int r0 = r4.i(r5)
            if (r0 != r1) goto L12
        L18:
            m1 r5 = r4.c
            boolean r0 = r5.E()
            if (r0 != 0) goto L42
            i97 r4 = r4.b
            char r4 = r4.y
            r5.j(r4)
            java.lang.Object r4 = r5.A
            ad r4 = (defpackage.ad) r4
            int r5 = r4.y
            java.lang.Object r0 = r4.B
            int[] r0 = (int[]) r0
            r2 = r0[r5]
            r3 = -2
            if (r2 != r3) goto L3c
            r0[r5] = r1
            int r5 = r5 + (-1)
            r4.y = r5
        L3c:
            if (r5 == r1) goto L41
            int r5 = r5 + r1
            r4.y = r5
        L41:
            return
        L42:
            java.lang.String r4 = ""
            defpackage.iv.D(r5, r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy5.a(aj5):void");
    }

    @Override // defpackage.gu0
    public final uj5 b() {
        return this.d;
    }

    @Override // defpackage.u0, defpackage.l61
    public final gu0 c(aj5 aj5Var) {
        aj5Var.getClass();
        y43 y43Var = this.a;
        i97 i = jy5.i(y43Var, aj5Var);
        m1 m1Var = this.c;
        ad adVar = (ad) m1Var.A;
        int i2 = adVar.y + 1;
        adVar.y = i2;
        if (i2 == ((Object[]) adVar.A).length) {
            adVar.o();
        }
        ((Object[]) adVar.A)[i2] = aj5Var;
        m1Var.j(i.x);
        if (m1Var.z() != 4) {
            int ordinal = i.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (this.b == i && y43Var.a.f) {
                    return this;
                }
                return new zy5(y43Var, i, m1Var, aj5Var, this.f);
            }
            return new zy5(y43Var, i, m1Var, aj5Var, this.f);
        }
        m1.u(m1Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.u0, defpackage.l61
    public final boolean decodeNotNullMark() {
        boolean z;
        boolean z2;
        s53 s53Var = this.h;
        if (s53Var != null) {
            z = s53Var.b;
        } else {
            z = false;
        }
        if (!z) {
            m1 m1Var = this.c;
            int B = m1Var.B(m1Var.C());
            int length = m1Var.w().length() - B;
            if (length >= 4 && B != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != m1Var.w().charAt(B + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || h98.k(m1Var.w().charAt(B + 4)) != 0) {
                        m1Var.y = B + 4;
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.u0, defpackage.l61
    public final Void decodeNull() {
        return null;
    }

    @Override // defpackage.tl0
    public final void decodeStringChunked(ub2 ub2Var) {
        ub2Var.getClass();
        this.c.n(ub2Var, this.g.c);
    }

    @Override // defpackage.u0, defpackage.l61
    public final boolean e() {
        boolean z;
        boolean z2;
        m1 m1Var = this.c;
        int C = m1Var.C();
        if (C != m1Var.w().length()) {
            if (m1Var.w().charAt(C) == '\"') {
                C++;
                z = true;
            } else {
                z = false;
            }
            int B = m1Var.B(C);
            if (B < m1Var.w().length() && B != -1) {
                int i = B + 1;
                int charAt = m1Var.w().charAt(B) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        m1Var.f(i, "rue");
                        z2 = true;
                    } else {
                        m1.u(m1Var, "Expected valid boolean literal prefix, but had '" + m1Var.o() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    m1Var.f(i, "alse");
                    z2 = false;
                }
                if (z) {
                    if (m1Var.y != m1Var.w().length()) {
                        if (m1Var.w().charAt(m1Var.y) == '\"') {
                            m1Var.y++;
                            return z2;
                        }
                        m1.u(m1Var, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    m1.u(m1Var, "EOF", 0, null, 6);
                    throw null;
                }
                return z2;
            }
            m1.u(m1Var, "EOF", 0, null, 6);
            throw null;
        }
        m1.u(m1Var, "EOF", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Type inference failed for: r0v7, types: [tv, java.lang.Object] */
    @Override // defpackage.l61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ne1 r11) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy5.f(ne1):java.lang.Object");
    }

    @Override // defpackage.u0, defpackage.l61
    public final char g() {
        m1 m1Var = this.c;
        String o = m1Var.o();
        if (o.length() == 1) {
            return o.charAt(0);
        }
        m1.u(m1Var, qx1.g('\'', "Expected single char, but got '", o), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c8, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        r0 = r3.y;
        r1 = (int[]) r3.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
    
        if (r1[r0] != (-2)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
    
        r1[r0] = -1;
        r0 = r0 - 1;
        r3.y = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
    
        if (r0 == (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
    
        r3.y = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0108, code lost:
    
        r2.t(defpackage.uz5.X(6, r2.D(0, r2.y), r5), defpackage.qx1.g('\'', "Encountered an unknown key '", r5), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0120, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.aj5 r21) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy5.i(aj5):int");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yq6] */
    @Override // defpackage.m53
    public final q53 k() {
        g53 g53Var = this.a.a;
        ?? obj = new Object();
        obj.c = this.c;
        obj.a = g53Var.c;
        return obj.c();
    }

    @Override // defpackage.u0, defpackage.l61
    public final int n() {
        m1 m1Var = this.c;
        long k = m1Var.k();
        int i = (int) k;
        if (k == i) {
            return i;
        }
        m1.u(m1Var, "Failed to parse int for input '" + k + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.u0, defpackage.gu0
    public final Object p(aj5 aj5Var, int i, ne1 ne1Var, Object obj) {
        boolean z;
        Object obj2;
        ad adVar = (ad) this.c.A;
        aj5Var.getClass();
        ne1Var.getClass();
        if (this.b == i97.B && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int[] iArr = (int[]) adVar.B;
            int i2 = adVar.y;
            if (iArr[i2] == -2) {
                ((Object[]) adVar.A)[i2] = p7.M;
            }
        }
        Object f = f(ne1Var);
        if (z) {
            int[] iArr2 = (int[]) adVar.B;
            int i3 = adVar.y;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                adVar.y = i4;
                if (i4 == ((Object[]) adVar.A).length) {
                    adVar.o();
                }
            }
            Object[] objArr = (Object[]) adVar.A;
            int i5 = adVar.y;
            if (((g53) adVar.z).l) {
                obj2 = f;
            } else {
                obj2 = l68.F;
            }
            objArr[i5] = obj2;
            ((int[]) adVar.B)[i5] = -2;
        }
        return f;
    }

    @Override // defpackage.u0, defpackage.l61
    public final l61 q(aj5 aj5Var) {
        aj5Var.getClass();
        if (bz5.a(aj5Var)) {
            return new n53(this.c, this.a);
        }
        return this;
    }

    @Override // defpackage.u0, defpackage.l61
    public final String s() {
        boolean z = this.g.c;
        m1 m1Var = this.c;
        if (z) {
            return m1Var.p();
        }
        return m1Var.l();
    }

    @Override // defpackage.u0, defpackage.l61
    public final int t(aj5 aj5Var) {
        aj5Var.getClass();
        return m37.r(aj5Var, this.a, s(), " at path ".concat(((ad) this.c.A).j()));
    }

    @Override // defpackage.u0, defpackage.l61
    public final long u() {
        return this.c.k();
    }

    @Override // defpackage.m53
    public final y43 v() {
        return this.a;
    }

    @Override // defpackage.u0, defpackage.l61
    public final byte x() {
        m1 m1Var = this.c;
        long k = m1Var.k();
        byte b = (byte) k;
        if (k == b) {
            return b;
        }
        m1.u(m1Var, "Failed to parse byte for input '" + k + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.u0, defpackage.l61
    public final short z() {
        m1 m1Var = this.c;
        long k = m1Var.k();
        short s = (short) k;
        if (k == s) {
            return s;
        }
        m1.u(m1Var, "Failed to parse short for input '" + k + '\'', 0, null, 6);
        throw null;
    }
}
