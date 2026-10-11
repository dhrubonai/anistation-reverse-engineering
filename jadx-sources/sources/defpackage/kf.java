package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kf implements tv2 {
    public final Object A;
    public Object B;
    public final Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public final /* synthetic */ byte x;
    public final Object y;
    public final Object z;

    public kf(vy1 vy1Var, py1 py1Var, f46 f46Var, int i, int i2, int i3, int i4) {
        this.x = (byte) 3;
        this.y = vy1Var;
        this.A = py1Var;
        this.B = f46Var;
        this.C = new hf6();
        this.D = f46Var.a(vy1Var.t, new jj1(this, (byte) 3));
        this.E = new h06(this, i);
        this.F = new i06(this, i2);
        this.G = new j06(this, i3);
        this.H = new k06(this, i4);
        g06 g06Var = new g06(this);
        this.z = g06Var;
        vy1Var.m.a(g06Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xz3, s20] */
    public static xz3 d(wz3 wz3Var, xz3 xz3Var) {
        xz3 xz3Var2;
        if (wz3Var instanceof d04) {
            xz3Var2 = ((d04) wz3Var).a();
            xz3Var2.z = ga4.f(xz3Var2);
        } else {
            ?? xz3Var3 = new xz3();
            xz3Var3.z = ga4.d(wz3Var);
            xz3Var3.L = wz3Var;
            xz3Var3.N = new HashSet();
            xz3Var2 = xz3Var3;
        }
        if (xz3Var2.K) {
            ez2.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        xz3Var2.F = true;
        xz3 xz3Var4 = xz3Var.C;
        if (xz3Var4 != null) {
            xz3Var4.B = xz3Var2;
            xz3Var2.C = xz3Var4;
        }
        xz3Var.C = xz3Var2;
        xz3Var2.B = xz3Var;
        return xz3Var2;
    }

    public static xz3 e(xz3 xz3Var) {
        boolean z = xz3Var.K;
        if (z) {
            b44 b44Var = ga4.a;
            if (!z) {
                ez2.b("autoInvalidateRemovedNode called on unattached node");
            }
            ga4.a(xz3Var, -1, 2);
            xz3Var.X0();
            xz3Var.R0();
        }
        xz3 xz3Var2 = xz3Var.C;
        xz3 xz3Var3 = xz3Var.B;
        if (xz3Var2 != null) {
            xz3Var2.B = xz3Var3;
            xz3Var.C = null;
        }
        if (xz3Var3 != null) {
            xz3Var3.C = xz3Var2;
            xz3Var.B = null;
        }
        xz3Var3.getClass();
        return xz3Var3;
    }

    public static void l(wz3 wz3Var, wz3 wz3Var2, xz3 xz3Var) {
        if ((wz3Var instanceof d04) && (wz3Var2 instanceof d04)) {
            xz3Var.getClass();
            ((d04) wz3Var2).b(xz3Var);
            if (xz3Var.K) {
                ga4.c(xz3Var);
                return;
            } else {
                xz3Var.G = true;
                return;
            }
        }
        if (xz3Var instanceof s20) {
            s20 s20Var = (s20) xz3Var;
            if (s20Var.K) {
                s20Var.b1();
            }
            s20Var.L = wz3Var2;
            s20Var.z = ga4.d(wz3Var2);
            if (s20Var.K) {
                s20Var.a1(false);
            }
            if (xz3Var.K) {
                ga4.c(xz3Var);
                return;
            } else {
                xz3Var.G = true;
                return;
            }
        }
        ez2.b("Unknown Modifier.Node type");
    }

    @Override // defpackage.tv2
    public int a() {
        return ((ad) this.z).a();
    }

    @Override // defpackage.tv2
    public long b(long j) {
        return ((ad) this.y).b(j);
    }

    @Override // defpackage.tv2
    public long c(long j) {
        return ((ad) this.y).c(j);
    }

    public void f(ub2 ub2Var) {
        ad adVar = (ad) this.y;
        adVar.y++;
        ((z44) adVar.B).b(ub2Var);
        adVar.d();
    }

    public boolean g(int i) {
        if ((((xz3) this.D).A & i) != 0) {
            return true;
        }
        return false;
    }

    public void h(xz3 xz3Var, fa4 fa4Var) {
        kz2 kz2Var;
        for (xz3 xz3Var2 = xz3Var.B; xz3Var2 != null; xz3Var2 = xz3Var2.B) {
            if (xz3Var2 == ((ba4) this.z)) {
                za3 v = ((za3) this.y).v();
                if (v != null) {
                    kz2Var = (kz2) v.c0.A;
                } else {
                    kz2Var = null;
                }
                fa4Var.T = kz2Var;
                this.B = fa4Var;
                return;
            }
            if ((xz3Var2.z & 2) == 0) {
                xz3Var2.Z0(fa4Var);
            } else {
                return;
            }
        }
    }

    public void i() {
        for (xz3 xz3Var = (xz3) this.D; xz3Var != null; xz3Var = xz3Var.C) {
            xz3Var.W0();
            if (xz3Var.F) {
                b44 b44Var = ga4.a;
                if (!xz3Var.K) {
                    ez2.b("autoInvalidateInsertedNode called on unattached node");
                }
                ga4.a(xz3Var, -1, 1);
            }
            if (xz3Var.G) {
                ga4.c(xz3Var);
            }
            xz3Var.F = false;
            xz3Var.G = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0196, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019b, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a5, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a7, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b5, code lost:
    
        if (r0.b(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b7, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c2, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c6, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c8, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ca, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cc, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d2, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d4, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0269, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01be, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0199, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0192, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0180, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0173, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x017e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026f, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0159, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d5, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014f, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0155, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0157, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015b, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015c, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015e, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0160, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0162, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0170, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0175, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0187, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0194, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r32, defpackage.f44 r33, defpackage.f44 r34, defpackage.xz3 r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf.j(int, f44, f44, xz3, boolean):void");
    }

    public void k() {
        kz2 kz2Var;
        ta3 ta3Var;
        za3 za3Var = (za3) this.y;
        fa4 fa4Var = (kz2) this.A;
        for (xz3 xz3Var = ((z66) this.C).B; xz3Var != null; xz3Var = xz3Var.B) {
            ra3 g = wc7.g(xz3Var);
            if (g != null) {
                fa4 fa4Var2 = xz3Var.E;
                if (fa4Var2 != null) {
                    ta3 ta3Var2 = (ta3) fa4Var2;
                    ra3 ra3Var = ta3Var2.z0;
                    ta3Var2.C1(g);
                    ta3Var = ta3Var2;
                    if (ra3Var != xz3Var) {
                        ih4 ih4Var = ta3Var2.q0;
                        ta3Var = ta3Var2;
                        if (ih4Var != null) {
                            ((fi2) ih4Var).c();
                            ta3Var = ta3Var2;
                        }
                    }
                } else {
                    ta3 ta3Var3 = new ta3(za3Var, g);
                    xz3Var.Z0(ta3Var3);
                    ta3Var = ta3Var3;
                }
                fa4Var.T = ta3Var;
                ta3Var.S = fa4Var;
                fa4Var = ta3Var;
            } else {
                xz3Var.Z0(fa4Var);
            }
        }
        za3 v = za3Var.v();
        if (v != null) {
            kz2Var = (kz2) v.c0.A;
        } else {
            kz2Var = null;
        }
        fa4Var.T = kz2Var;
        this.B = fa4Var;
    }

    public String toString() {
        switch (this.x) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                xz3 xz3Var = (xz3) this.D;
                z66 z66Var = (z66) this.C;
                if (xz3Var == z66Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (xz3Var != null && xz3Var != z66Var) {
                            sb.append(String.valueOf(xz3Var));
                            if (xz3Var.C == z66Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                xz3Var = xz3Var.C;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public kf() {
        this.x = (byte) 2;
        this.z = a34.I();
        this.y = a34.I();
        this.C = a34.I();
        this.D = a34.I();
        this.A = a34.I();
        this.B = a34.I();
        this.E = a34.I();
        this.F = a34.I();
        this.G = a34.I();
    }

    public kf(za3 za3Var) {
        this.x = (byte) 1;
        this.y = za3Var;
        xz3 xz3Var = new xz3();
        xz3Var.A = -1;
        this.z = xz3Var;
        kz2 kz2Var = new kz2(za3Var);
        this.A = kz2Var;
        this.B = kz2Var;
        z66 z66Var = kz2Var.z0;
        this.C = z66Var;
        this.D = z66Var;
        this.E = new f44();
    }

    public kf(ad adVar, gi6 gi6Var, rt3 rt3Var, ub2 ub2Var, h31 h31Var, dd6 dd6Var, sb2 sb2Var, rv6 rv6Var, ub2 ub2Var2) {
        this.x = (byte) 0;
        this.z = adVar;
        this.A = gi6Var;
        this.B = rt3Var;
        this.C = ub2Var;
        this.E = h31Var;
        this.F = dd6Var;
        this.G = sb2Var;
        this.H = rv6Var;
        this.D = ub2Var2;
        this.y = adVar;
    }
}
