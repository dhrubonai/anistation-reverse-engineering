package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z84 implements t12 {
    public final String a;
    public final mg4 b;
    public final d46 c;
    public final d46 d;
    public final d46 e;
    public final xy2 f;
    public final d46 g;

    public z84(String str, mg4 mg4Var, d46 d46Var, d46 d46Var2, d46 d46Var3, xy2 xy2Var, d46 d46Var4) {
        this.a = str;
        this.b = mg4Var;
        this.c = d46Var;
        this.d = d46Var2;
        this.e = d46Var3;
        this.f = xy2Var;
        this.g = d46Var4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Lc
            java.lang.String r1 = "text/plain"
            r2 = 0
            boolean r1 = defpackage.b06.I(r4, r1, r2)
            if (r1 == 0) goto L53
        Lc:
            boolean r1 = defpackage.uz5.V(r3)
            if (r1 == 0) goto L14
        L12:
            r1 = r0
            goto L50
        L14:
            r1 = 35
            java.lang.String r3 = defpackage.uz5.s0(r3, r1)
            r1 = 63
            java.lang.String r3 = defpackage.uz5.s0(r3, r1)
            r1 = 47
            java.lang.String r3 = defpackage.uz5.n0(r1, r3, r3)
            r1 = 46
            java.lang.String r2 = ""
            java.lang.String r3 = defpackage.uz5.n0(r1, r3, r2)
            boolean r1 = defpackage.uz5.V(r3)
            if (r1 == 0) goto L35
            goto L12
        L35:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            r3.getClass()
            an3 r1 = defpackage.ry3.a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L50
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)
        L50:
            if (r1 == 0) goto L53
            return r1
        L53:
            if (r4 == 0) goto L5c
            r3 = 59
            java.lang.String r3 = defpackage.uz5.p0(r4, r3)
            return r3
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z84.d(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void f(h94 h94Var) {
        int i = h94Var.a;
        if ((200 <= i && i < 300) || i == 304) {
        } else {
            throw new er0(qx1.h(i, "HTTP "), (byte) 2);
        }
    }

    @Override // defpackage.t12
    public final Object a(ou1 ou1Var) {
        fn6 fn6Var = (fn6) this.g.getValue();
        String str = this.b.e;
        d0 d0Var = new d0(1, this, z84.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 17);
        fn6Var.getClass();
        return d0Var.invoke(ou1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01ac, code lost:
    
        if (r0 == r12) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018f A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:14:0x003e, B:15:0x01af, B:21:0x0052, B:22:0x018b, B:24:0x018f, B:32:0x0122, B:34:0x0128, B:37:0x0150, B:39:0x0156, B:42:0x0165, B:43:0x016a, B:44:0x016b, B:70:0x00a7, B:72:0x00ae, B:74:0x00bc, B:77:0x00ee, B:79:0x00fa, B:83:0x00d2, B:85:0x00dc, B:87:0x0147, B:88:0x014e), top: B:8:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128 A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:14:0x003e, B:15:0x01af, B:21:0x0052, B:22:0x018b, B:24:0x018f, B:32:0x0122, B:34:0x0128, B:37:0x0150, B:39:0x0156, B:42:0x0165, B:43:0x016a, B:44:0x016b, B:70:0x00a7, B:72:0x00ae, B:74:0x00bc, B:77:0x00ee, B:79:0x00fa, B:83:0x00d2, B:85:0x00dc, B:87:0x0147, B:88:0x014e), top: B:8:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156 A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:14:0x003e, B:15:0x01af, B:21:0x0052, B:22:0x018b, B:24:0x018f, B:32:0x0122, B:34:0x0128, B:37:0x0150, B:39:0x0156, B:42:0x0165, B:43:0x016a, B:44:0x016b, B:70:0x00a7, B:72:0x00ae, B:74:0x00bc, B:77:0x00ee, B:79:0x00fa, B:83:0x00d2, B:85:0x00dc, B:87:0x0147, B:88:0x014e), top: B:8:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ae A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:14:0x003e, B:15:0x01af, B:21:0x0052, B:22:0x018b, B:24:0x018f, B:32:0x0122, B:34:0x0128, B:37:0x0150, B:39:0x0156, B:42:0x0165, B:43:0x016a, B:44:0x016b, B:70:0x00a7, B:72:0x00ae, B:74:0x00bc, B:77:0x00ee, B:79:0x00fa, B:83:0x00d2, B:85:0x00dc, B:87:0x0147, B:88:0x014e), top: B:8:0x0030 }] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vz0 r19) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z84.b(vz0):java.lang.Object");
    }

    public final n22 c() {
        n22 n22Var;
        gz4 gz4Var = (gz4) this.d.getValue();
        if (gz4Var != null && (n22Var = gz4Var.a) != null) {
            return n22Var;
        }
        return this.b.f;
    }

    public final e94 e() {
        boolean z;
        w4 w4Var = gv2.b;
        mg4 mg4Var = this.b;
        b94 b94Var = (b94) wk6.p(mg4Var, w4Var);
        b94Var.getClass();
        a94 a94Var = new a94(b94Var);
        af0 af0Var = mg4Var.h;
        boolean z2 = af0Var.x;
        if (mg4Var.i.x && ((qw0) this.f.x).a()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && z2) {
            a94Var.b("only-if-cached, max-stale=2147483647");
        } else if (z && !z2) {
            if (af0Var.y) {
                a94Var.b("no-cache");
            } else {
                a94Var.b("no-cache, no-store");
            }
        } else if (!z && !z2) {
            a94Var.b("no-cache, only-if-cached");
        }
        String str = (String) wk6.p(mg4Var, gv2.a);
        b94 b94Var2 = new b94(vn3.Z(a94Var.a));
        if (wk6.p(mg4Var, gv2.c) == null) {
            return new e94(this.a, str, b94Var2, mg4Var.j);
        }
        ov3.d();
        return null;
    }

    public final d22 g(fz4 fz4Var) {
        fh1 fh1Var = fz4Var.x;
        if (!fh1Var.y) {
            qj4 qj4Var = (qj4) fh1Var.x.c.get(1);
            n22 c = c();
            String str = this.b.e;
            if (str == null) {
                str = this.a;
            }
            return kb0.f(qj4Var, c, str, fz4Var, 16);
        }
        ze0.m("snapshot is closed");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [cb0, java.lang.Object, pa0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.lv5 r5, defpackage.xz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.x84
            if (r0 == 0) goto L13
            r0 = r6
            x84 r0 = (defpackage.x84) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            x84 r0 = new x84
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            pa0 r5 = r0.x
            defpackage.m37.N(r6)
            goto L47
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r6)
            pa0 r6 = new pa0
            r6.<init>()
            r0.x = r6
            r0.A = r2
            db0 r5 = r5.x
            r5.S(r6)
            pn6 r5 = defpackage.pn6.a
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L46
            return r0
        L46:
            r5 = r6
        L47:
            n22 r4 = r4.c()
            fv5 r4 = defpackage.kb0.g(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z84.h(lv5, xz0):java.lang.Object");
    }

    public final h94 i(fz4 fz4Var) {
        Throwable th;
        h94 h94Var;
        try {
            n22 c = c();
            fh1 fh1Var = fz4Var.x;
            if (!fh1Var.y) {
                bv5 l0 = c.l0((qj4) fh1Var.x.c.get(0));
                l0.getClass();
                xy4 xy4Var = new xy4(l0);
                try {
                    h94Var = a34.k0(xy4Var);
                    try {
                        xy4Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        xy4Var.close();
                    } catch (Throwable th4) {
                        n03.i(th3, th4);
                    }
                    th = th3;
                    h94Var = null;
                }
                if (th == null) {
                    return h94Var;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed");
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0136, code lost:
    
        if (r4 == r6) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [fq3] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fz4 r23, defpackage.h94 r24, defpackage.h94 r25, defpackage.xz0 r26) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z84.j(fz4, h94, h94, xz0):java.lang.Object");
    }
}
