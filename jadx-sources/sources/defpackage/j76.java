package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j76 {
    public static final qo1 a = new qo1(3, null, 2);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.z36 r5, boolean r6, defpackage.oq4 r7, defpackage.h30 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.a76
            if (r0 == 0) goto L13
            r0 = r8
            a76 r0 = (defpackage.a76) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            a76 r0 = new a76
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.z
            oq4 r6 = r0.y
            z36 r7 = r0.x
            defpackage.m37.N(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L36:
            defpackage.m37.N(r8)
        L39:
            r0.x = r5
            r0.y = r7
            r0.z = r6
            r0.B = r2
            java.lang.Object r8 = r5.d(r7, r0)
            w11 r1 = defpackage.w11.x
            if (r8 != r1) goto L4a
            return r1
        L4a:
            nq4 r8 = (defpackage.nq4) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j76.a(z36, boolean, oq4, h30):java.lang.Object");
    }

    public static /* synthetic */ Object b(z36 z36Var, h30 h30Var, int i) {
        boolean z;
        oq4 oq4Var;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            oq4Var = oq4.y;
        } else {
            oq4Var = oq4.x;
        }
        return a(z36Var, z, oq4Var, h30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[LOOP:0: B:11:0x004a->B:12:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.z36 r7, defpackage.xz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.b76
            if (r0 == 0) goto L13
            r0 = r8
            b76 r0 = (defpackage.b76) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            b76 r0 = new b76
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            z36 r7 = r0.x
            defpackage.m37.N(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.m37.N(r8)
        L31:
            r0.x = r7
            r0.z = r2
            oq4 r8 = defpackage.oq4.y
            java.lang.Object r8 = r7.d(r8, r0)
            w11 r1 = defpackage.w11.x
            if (r8 != r1) goto L40
            return r1
        L40:
            nq4 r8 = (defpackage.nq4) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            uq4 r6 = (defpackage.uq4) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            uq4 r3 = (defpackage.uq4) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j76.c(z36, xz0):java.lang.Object");
    }

    public static Object d(yq4 yq4Var, jc2 jc2Var, ub2 ub2Var, vz0 vz0Var, int i) {
        ub2 ub2Var2;
        if ((i & 4) != 0) {
            jc2Var = a;
        }
        jc2 jc2Var2 = jc2Var;
        vz0 vz0Var2 = null;
        if ((i & 8) != 0) {
            ub2Var2 = null;
        } else {
            ub2Var2 = ub2Var;
        }
        Object K = db.K(new l5(yq4Var, jc2Var2, ub2Var2, vz0Var2, (byte) 16), vz0Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }

    public static boolean e(nq4 nq4Var, boolean z) {
        boolean w;
        List list = nq4Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uq4 uq4Var = (uq4) list.get(i);
            if (z) {
                w = t80.v(uq4Var);
            } else {
                w = t80.w(uq4Var);
            }
            if (!w) {
                return false;
            }
        }
        return true;
    }

    public static bx5 f(v11 v11Var, h43 h43Var, ic2 ic2Var) {
        return tl7.z(v11Var, null, y11.A, new an(h43Var, ic2Var, null, (byte) 8), 1);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019c  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, z36] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r12v14, types: [ub2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r2v2, types: [h30, g76, xz0] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [l11, vz0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.z36 r23, defpackage.v11 r24, defpackage.ot4 r25, defpackage.jc2 r26, defpackage.ub2 r27, defpackage.h30 r28) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j76.g(z36, v11, ot4, jc2, ub2, h30):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.z36 r7, defpackage.oq4 r8, defpackage.xz0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.h76
            if (r0 == 0) goto L13
            r0 = r9
            h76 r0 = (defpackage.h76) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            h76 r0 = new h76
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.y
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            w05 r7 = r0.x
            defpackage.m37.N(r9)     // Catch: defpackage.pq4 -> L59
            goto L56
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L2e:
            defpackage.m37.N(r9)
            w05 r9 = new w05
            r9.<init>()
            il3 r1 = defpackage.il3.a
            r9.x = r1
            rv6 r1 = r7.f()     // Catch: defpackage.pq4 -> L59
            long r4 = r1.b()     // Catch: defpackage.pq4 -> L59
            x92 r1 = new x92     // Catch: defpackage.pq4 -> L59
            r6 = 2
            r1.<init>(r8, r9, r2, r6)     // Catch: defpackage.pq4 -> L59
            r0.x = r9     // Catch: defpackage.pq4 -> L59
            r0.z = r3     // Catch: defpackage.pq4 -> L59
            java.lang.Object r7 = r7.i(r4, r1, r0)     // Catch: defpackage.pq4 -> L59
            w11 r8 = defpackage.w11.x
            if (r7 != r8) goto L55
            return r8
        L55:
            r7 = r9
        L56:
            java.lang.Object r7 = r7.x
            return r7
        L59:
            kl3 r7 = defpackage.kl3.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j76.h(z36, oq4, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.z36 r17, defpackage.oq4 r18, defpackage.h30 r19) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j76.i(z36, oq4, h30):java.lang.Object");
    }
}
