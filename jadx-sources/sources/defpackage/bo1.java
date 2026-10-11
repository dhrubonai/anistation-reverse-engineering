package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class bo1 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if (defpackage.xc4.b(defpackage.t80.h0(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, v05] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.z36 r12, long r13, defpackage.xz0 r15) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo1.a(z36, long, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[Catch: pq4 -> 0x00a4, TRY_LEAVE, TryCatch #0 {pq4 -> 0x00a4, blocks: (B:11:0x0028, B:12:0x0097, B:14:0x009b, B:34:0x007b), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r1v3, types: [r05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r9v3, types: [w05] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.z36 r8, long r9, defpackage.xz0 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.vn1
            if (r0 == 0) goto L13
            r0 = r11
            vn1 r0 = (defpackage.vn1) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            vn1 r0 = new vn1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.A
            int r1 = r0.B
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            r05 r8 = r0.z
            w05 r9 = r0.y
            uq4 r10 = r0.x
            defpackage.m37.N(r11)     // Catch: defpackage.pq4 -> La4
            goto L97
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r3
        L32:
            defpackage.m37.N(r11)
            a46 r11 = r8.B
            nq4 r11 = r11.Q
            boolean r11 = f(r11, r9)
            if (r11 == 0) goto L40
            goto La3
        L40:
            a46 r11 = r8.B
            nq4 r11 = r11.Q
            java.util.List r11 = r11.a
            int r1 = r11.size()
            r4 = 0
        L4b:
            if (r4 >= r1) goto L60
            java.lang.Object r5 = r11.get(r4)
            r6 = r5
            uq4 r6 = (defpackage.uq4) r6
            long r6 = r6.a
            boolean r6 = defpackage.sw0.o(r6, r9)
            if (r6 == 0) goto L5d
            goto L61
        L5d:
            int r4 = r4 + 1
            goto L4b
        L60:
            r5 = r3
        L61:
            r10 = r5
            uq4 r10 = (defpackage.uq4) r10
            if (r10 != 0) goto L67
            goto La3
        L67:
            w05 r9 = new w05
            r9.<init>()
            w05 r11 = new w05
            r11.<init>()
            r11.x = r10
            rv6 r1 = r8.f()
            long r4 = r1.b()
            r05 r1 = new r05     // Catch: defpackage.pq4 -> La4
            r1.<init>()     // Catch: defpackage.pq4 -> La4
            wn1 r6 = new wn1     // Catch: defpackage.pq4 -> La4
            r6.<init>(r1, r11, r9, r3)     // Catch: defpackage.pq4 -> La4
            r0.x = r10     // Catch: defpackage.pq4 -> La4
            r0.y = r9     // Catch: defpackage.pq4 -> La4
            r0.z = r1     // Catch: defpackage.pq4 -> La4
            r0.B = r2     // Catch: defpackage.pq4 -> La4
            java.lang.Object r8 = r8.i(r4, r6, r0)     // Catch: defpackage.pq4 -> La4
            w11 r11 = defpackage.w11.x
            if (r8 != r11) goto L96
            return r11
        L96:
            r8 = r1
        L97:
            boolean r8 = r8.x     // Catch: defpackage.pq4 -> La4
            if (r8 == 0) goto La3
            java.lang.Object r8 = r9.x     // Catch: defpackage.pq4 -> La4
            uq4 r8 = (defpackage.uq4) r8     // Catch: defpackage.pq4 -> La4
            if (r8 != 0) goto La2
            return r10
        La2:
            return r8
        La3:
            return r3
        La4:
            java.lang.Object r8 = r9.x
            uq4 r8 = (defpackage.uq4) r8
            if (r8 != 0) goto Lab
            goto Lac
        Lab:
            r10 = r8
        Lac:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo1.b(z36, long, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, v05] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0160 -> B:11:0x0166). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.z36 r18, long r19, defpackage.o0 r21, defpackage.h30 r22) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo1.c(z36, long, o0, h30):java.lang.Object");
    }

    public static final Object d(yq4 yq4Var, ub2 ub2Var, sb2 sb2Var, sb2 sb2Var2, ic2 ic2Var, xz0 xz0Var) {
        Object t = n77.t(yq4Var, new yn1(new vj1((byte) 6), new i(ub2Var, (byte) 2), ic2Var, sb2Var2, new mm(sb2Var, (byte) 4), null), xz0Var);
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        if (t != w11Var) {
            t = pn6Var;
        }
        if (t == w11Var) {
            return t;
        }
        return pn6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.z36 r4, long r5, defpackage.ub2 r7, defpackage.xz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.zn1
            if (r0 == 0) goto L13
            r0 = r8
            zn1 r0 = (defpackage.zn1) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            zn1 r0 = new zn1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            ub2 r4 = r0.y
            z36 r5 = r0.x
            defpackage.m37.N(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L32:
            defpackage.m37.N(r8)
        L35:
            r0.x = r4
            r0.y = r7
            r0.A = r2
            java.lang.Object r8 = a(r4, r5, r0)
            w11 r5 = defpackage.w11.x
            if (r8 != r5) goto L44
            return r5
        L44:
            uq4 r8 = (defpackage.uq4) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.t80.y(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo1.e(z36, long, ub2, xz0):java.lang.Object");
    }

    public static final boolean f(nq4 nq4Var, long j) {
        Object obj;
        List list = nq4Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (sw0.o(((uq4) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        uq4 uq4Var = (uq4) obj;
        if (uq4Var != null && uq4Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float g(rv6 rv6Var, int i) {
        if (i == 2) {
            return rv6Var.f() * a;
        }
        return rv6Var.f();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x05f0 -> B:56:0x05f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x061c -> B:60:0x0604). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0250 -> B:144:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x02f7 -> B:144:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x034f -> B:145:0x03c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x03a8 -> B:141:0x03b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x068b -> B:12:0x0695). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x045e -> B:67:0x040c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x049c -> B:59:0x0603). Please report as a decompilation issue!!! */
    public static final java.lang.Object h(defpackage.z36 r29, defpackage.uq4 r30, defpackage.vj1 r31, defpackage.i r32, defpackage.ic2 r33, defpackage.sb2 r34, defpackage.mm r35, defpackage.h30 r36) {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo1.h(z36, uq4, vj1, i, ic2, sb2, mm, h30):java.lang.Object");
    }
}
