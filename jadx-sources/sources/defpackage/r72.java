package defpackage;

import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r72 implements p72 {
    public final oa a;
    public final oa b;
    public final n72 d;
    public y34 f;
    public h82 h;
    public final h82 c = new h82(2, null, 14);
    public final q72 e = new q72(this);
    public final f44 g = new f44(1);

    public r72(oa oaVar, oa oaVar2) {
        this.a = oaVar;
        this.b = oaVar2;
        this.d = new n72(this, oaVar2);
    }

    public final boolean b(boolean z) {
        kf kfVar;
        if (g() != null) {
            h82 g = g();
            j(null);
            if (g != null) {
                d82 d82Var = d82.x;
                d82 d82Var2 = d82.z;
                g.b1(d82Var, d82Var2);
                if (!g.x.K) {
                    ez2.b("visitAncestors called on an unattached node");
                }
                xz3 xz3Var = g.x.B;
                za3 O = wc7.O(g);
                while (O != null) {
                    if ((((xz3) O.c0.D).A & 1024) != 0) {
                        while (xz3Var != null) {
                            if ((xz3Var.z & 1024) != 0) {
                                xz3 xz3Var2 = xz3Var;
                                z44 z44Var = null;
                                while (xz3Var2 != null) {
                                    if (xz3Var2 instanceof h82) {
                                        ((h82) xz3Var2).b1(d82.y, d82Var2);
                                    } else if ((xz3Var2.z & 1024) != 0 && (xz3Var2 instanceof zc1)) {
                                        int i = 0;
                                        for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                            if ((xz3Var3.z & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    xz3Var2 = xz3Var3;
                                                } else {
                                                    if (z44Var == null) {
                                                        z44Var = new z44(new xz3[16], 0);
                                                    }
                                                    if (xz3Var2 != null) {
                                                        z44Var.b(xz3Var2);
                                                        xz3Var2 = null;
                                                    }
                                                    z44Var.b(xz3Var3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    xz3Var2 = wc7.J(z44Var);
                                }
                            }
                            xz3Var = xz3Var.B;
                        }
                    }
                    O = O.v();
                    if (O != null && (kfVar = O.c0) != null) {
                        xz3Var = (z66) kfVar.C;
                    } else {
                        xz3Var = null;
                    }
                }
            }
        }
        return true;
    }

    public final boolean c(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (!z) {
            int ordinal = v94.E(this.c, i).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    ze0.l();
                    return false;
                }
                z3 = false;
            } else {
                b(z);
            }
        } else {
            b(z);
        }
        if (z3 && z2) {
            d();
        }
        return z3;
    }

    public final void d() {
        oa oaVar = this.a;
        if (!oaVar.isFocused() && !oaVar.hasFocus()) {
            if (oaVar.hasFocus()) {
                View findFocus = oaVar.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                oaVar.clearFocus();
                return;
            }
            return;
        }
        oaVar.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r7 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0198 A[Catch: all -> 0x0317, TryCatch #0 {all -> 0x0317, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:11:0x0025, B:13:0x0029, B:14:0x0031, B:15:0x004d, B:18:0x0058, B:20:0x005e, B:21:0x0063, B:23:0x006b, B:25:0x0070, B:27:0x0076, B:31:0x007c, B:36:0x0198, B:38:0x019e, B:39:0x01a1, B:41:0x01ac, B:44:0x01ba, B:48:0x01c4, B:51:0x01ca, B:52:0x01cf, B:54:0x01d7, B:56:0x01dd, B:58:0x01e1, B:60:0x01e9, B:62:0x01ef, B:68:0x01f7, B:70:0x0200, B:71:0x0204, B:66:0x0207, B:77:0x020d, B:88:0x0212, B:91:0x0215, B:93:0x021b, B:100:0x021f, B:105:0x0228, B:107:0x0230, B:115:0x0247, B:117:0x024c, B:151:0x0250, B:146:0x0292, B:119:0x025c, B:121:0x0262, B:123:0x0266, B:125:0x026e, B:127:0x0274, B:133:0x027c, B:135:0x0285, B:136:0x0289, B:131:0x028c, B:157:0x0297, B:161:0x02a7, B:163:0x02ac, B:197:0x02b0, B:192:0x02f2, B:165:0x02bc, B:167:0x02c2, B:169:0x02c6, B:171:0x02ce, B:173:0x02d4, B:179:0x02dc, B:181:0x02e5, B:182:0x02e9, B:177:0x02ec, B:204:0x02f9, B:206:0x0300, B:219:0x0084, B:221:0x008a, B:222:0x008d, B:224:0x0095, B:227:0x00a3, B:231:0x00ad, B:266:0x0102, B:268:0x0106, B:233:0x00b2, B:235:0x00b8, B:237:0x00bc, B:239:0x00c4, B:241:0x00ca, B:247:0x00d2, B:249:0x00db, B:250:0x00df, B:245:0x00e2, B:256:0x00e8, B:270:0x00ed, B:273:0x00f0, B:275:0x00f6, B:282:0x00fa, B:287:0x010c, B:289:0x0112, B:290:0x0115, B:292:0x011f, B:295:0x012d, B:299:0x0137, B:334:0x018c, B:336:0x0190, B:301:0x013c, B:303:0x0142, B:305:0x0146, B:307:0x014e, B:309:0x0154, B:315:0x015c, B:317:0x0165, B:318:0x0169, B:313:0x016c, B:324:0x0172, B:339:0x0177, B:342:0x017a, B:344:0x0180, B:351:0x0184, B:357:0x0037, B:359:0x003b, B:361:0x0041, B:363:0x0045), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [z44] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [z44] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [xz3] */
    /* JADX WARN: Type inference failed for: r12v25, types: [xz3] */
    /* JADX WARN: Type inference failed for: r12v29, types: [xz3] */
    /* JADX WARN: Type inference failed for: r12v30, types: [xz3] */
    /* JADX WARN: Type inference failed for: r12v34, types: [xz3] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [xz3] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [z44] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(android.view.KeyEvent r13, defpackage.sb2 r14) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r72.e(android.view.KeyEvent, sb2):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x011e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean f(int r19, defpackage.n05 r20, defpackage.ub2 r21) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r72.f(int, n05, ub2):java.lang.Boolean");
    }

    public final h82 g() {
        h82 h82Var = this.h;
        if (h82Var != null && h82Var.K) {
            return h82Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, w05] */
    public final boolean h(int i, boolean z) {
        boolean z2;
        h82 g = g();
        oa oaVar = this.a;
        byte b = 1;
        if (g == null || !g.L || !oaVar.s(i)) {
            ?? obj = new Object();
            obj.x = Boolean.FALSE;
            h82 g2 = g();
            Boolean f = f(i, oaVar.getEmbeddedViewFocusRect(), new xm((Object) obj, i, b));
            if (!a34.i(f, Boolean.TRUE) || g2 == g()) {
                if (f != null && obj.x != null) {
                    if (!f.booleanValue() || !((Boolean) obj.x).booleanValue()) {
                        if ((i == 1 || i == 2) && z && c(i, false, false)) {
                            Boolean f2 = f(i, null, new da(i, (byte) 5));
                            if (f2 != null) {
                                z2 = f2.booleanValue();
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i) {
        boolean z = false;
        if (!c(i, false, false)) {
            return false;
        }
        Boolean f = f(i, null, new da(i, (byte) 4));
        if (f != null) {
            z = f.booleanValue();
        }
        if (!z) {
            d();
        }
        return z;
    }

    public final void j(h82 h82Var) {
        h82 h82Var2 = this.h;
        this.h = h82Var;
        f44 f44Var = this.g;
        Object[] objArr = f44Var.a;
        int i = f44Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((o72) objArr[i2]).a(h82Var2, h82Var);
        }
    }
}
