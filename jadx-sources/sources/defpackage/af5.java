package defpackage;

import com.anistation.model.Page;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class af5 extends vv6 {
    public final pn b;
    public final wd5 c;
    public final sx5 d;
    public final vy4 e;
    public final sx5 f;
    public bx5 g;
    public bx5 h;
    public final za0 i;
    public final mj0 j;
    public final qb2 k;
    public final qb2 l;

    public af5(pn pnVar, wd5 wd5Var) {
        String str;
        boolean z;
        this.b = pnVar;
        this.c = wd5Var;
        if ((959 & 1) == 0) {
            str = "Tongari Boushi no Atelier";
        } else {
            str = "";
        }
        String str2 = (959 & 2) != 0 ? "" : "Tongari Boushi no Atelier";
        if ((959 & 64) != 0) {
            z = false;
        } else {
            z = true;
        }
        vz0 vz0Var = null;
        nt1 nt1Var = nt1.x;
        sx5 a = tx5.a(new wm6(str, str2, false, false, null, nt1Var, z, nt1Var, true, null));
        this.d = a;
        this.e = h41.d(a);
        this.f = tx5.a("");
        za0 d = iv.d(-2, 6, null);
        this.i = d;
        this.j = new mj0(d);
        this.k = new qb2(20, 0.75f, true, (byte) 2);
        this.l = new qb2(16, 0.75f, true, (byte) 3);
        iv.G(new k52(((xd5) wd5Var).a.b, new yh(this, vz0Var, (byte) 22), (byte) 2), zz.J(this));
        tl7.z(zz.J(this), null, null, new hu1(this, vz0Var, (byte) 23), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r17 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        r0 = r10.getValue();
        r11 = (defpackage.wm6) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (defpackage.h98.h(r11.a).equals(r1) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        r11 = defpackage.wm6.a(r11, null, null, false, false, null, r17, false, null, null, 927);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r10.j(r0, r11) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r2 = r10.getValue();
        r11 = (defpackage.wm6) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (defpackage.h98.h(r11.a).equals(r1) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        r11 = defpackage.wm6.a(r11, null, null, false, false, null, null, true, null, null, 959);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        if (r10.j(r2, r11) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r3.x = r1;
        r3.A = 1;
        r2 = (defpackage.zn) r22.b;
        r2.getClass();
        r2 = new defpackage.mx0(new defpackage.wn(null, r2, r1), (byte) 5);
        r4 = defpackage.rh1.a;
        r2 = defpackage.zz.D(r2, defpackage.j91.y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
    
        if (r2 != r9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r23, defpackage.vz0 r24) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af5.e(java.lang.String, vz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2 A[LOOP:0: B:14:0x0086->B:20:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6 A[EDGE_INSN: B:21:0x00b6->B:22:0x00b6 BREAK  A[LOOP:0: B:14:0x0086->B:20:0x00c2], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r20) {
        /*
            r19 = this;
            r0 = r19
            r2 = r20
            sx5 r12 = r0.d
            java.lang.Object r1 = r12.getValue()
            wm6 r1 = (defpackage.wm6) r1
            java.lang.String r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L16
            goto Lc1
        L16:
            bx5 r1 = r0.g
            r13 = 0
            if (r1 == 0) goto L1e
            r1.l(r13)
        L1e:
            bx5 r1 = r0.h
            if (r1 == 0) goto L25
            r1.l(r13)
        L25:
            java.lang.Object r1 = r12.getValue()
            r14 = r1
            wm6 r14 = (defpackage.wm6) r14
            java.lang.String r1 = defpackage.h98.h(r2)
            java.lang.String r3 = r14.a
            java.util.List r4 = r14.f
            java.lang.String r3 = defpackage.h98.h(r3)
            boolean r15 = r1.equals(r3)
            qb2 r3 = r0.l
            java.lang.Object r3 = r3.get(r1)
            r16 = r3
            java.util.List r16 = (java.util.List) r16
            r3 = 1
            if (r16 != 0) goto L84
            if (r15 == 0) goto L4d
        L4b:
            r7 = r4
            goto L86
        L4d:
            boolean r1 = defpackage.uz5.V(r1)
            if (r1 == 0) goto L56
            nt1 r4 = defpackage.nt1.x
            goto L4b
        L56:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L5f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.anistation.model.SearchSuggestion r6 = (com.anistation.model.SearchSuggestion) r6
            java.lang.String r6 = r6.getTitle()
            java.lang.CharSequence r7 = defpackage.uz5.w0(r2)
            java.lang.String r7 = r7.toString()
            boolean r6 = defpackage.uz5.M(r6, r7, r3)
            if (r6 == 0) goto L5f
            r1.add(r5)
            goto L5f
        L82:
            r7 = r1
            goto L86
        L84:
            r7 = r16
        L86:
            java.lang.Object r1 = r12.getValue()
            r4 = r1
            r1 = r4
            wm6 r1 = (defpackage.wm6) r1
            if (r15 == 0) goto L94
            boolean r5 = r14.g
        L92:
            r8 = r5
            goto L9a
        L94:
            if (r16 != 0) goto L98
            r8 = r3
            goto L9a
        L98:
            r5 = 0
            goto L92
        L9a:
            r10 = 0
            r11 = 384(0x180, float:5.38E-43)
            r5 = r3
            java.lang.String r3 = ""
            r6 = r4
            r4 = 0
            r9 = r5
            r5 = 0
            r17 = r6
            r6 = 0
            r18 = r9
            r9 = 0
            r13 = r17
            wm6 r1 = defpackage.wm6.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = r12.j(r13, r1)
            if (r1 == 0) goto Lc2
            if (r15 != 0) goto Lc1
            sx5 r0 = r0.f
            r0.getClass()
            r1 = 0
            r0.l(r1, r2)
        Lc1:
            return
        Lc2:
            r3 = r18
            r13 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af5.f(java.lang.String):void");
    }

    public final void g(String str, boolean z) {
        String str2;
        boolean z2;
        String obj = uz5.w0(str).toString();
        if (!uz5.V(obj)) {
            String h = h98.h(obj);
            Page page = (Page) this.k.get(h);
            bx5 bx5Var = this.g;
            vz0 vz0Var = null;
            if (bx5Var != null) {
                bx5Var.l(null);
            }
            bx5 bx5Var2 = this.h;
            if (bx5Var2 != null) {
                bx5Var2.l(null);
            }
            while (true) {
                sx5 sx5Var = this.d;
                Object value = sx5Var.getValue();
                str2 = obj;
                wm6 wm6Var = (wm6) value;
                if (page == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (sx5Var.j(value, wm6.a(wm6Var, str2, str2, z2, false, page, null, false, null, null, 480))) {
                    break;
                } else {
                    obj = str2;
                }
            }
            if (z) {
                h(new xe5(this, str2, vz0Var, (byte) 2));
            }
            if (page != null) {
                return;
            }
            this.g = tl7.z(zz.J(this), null, null, new an(this, str2, h, vz0Var, (byte) 7), 3);
        }
    }

    public final void h(ub2 ub2Var) {
        tl7.z(zz.J(this), null, y11.A, new ze5(ub2Var, this, null, (byte) 1), 1);
    }
}
