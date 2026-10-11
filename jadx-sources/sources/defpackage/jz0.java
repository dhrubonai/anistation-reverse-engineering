package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jz0 {
    public static final jz0 e = new jz0("*", "*", nt1.x);
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jz0(String str, String str2, List list) {
        this(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.jz0 r7) {
        /*
            r6 = this;
            r7.getClass()
            java.lang.String r0 = r7.d
            java.lang.String r1 = r7.c
            java.lang.String r2 = "*"
            boolean r3 = defpackage.a34.i(r1, r2)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L1a
            java.lang.String r3 = r6.c
            boolean r1 = defpackage.b06.C(r1, r3, r5)
            if (r1 != 0) goto L1a
            return r4
        L1a:
            boolean r1 = defpackage.a34.i(r0, r2)
            if (r1 != 0) goto L29
            java.lang.String r1 = r6.d
            boolean r0 = defpackage.b06.C(r0, r1, r5)
            if (r0 != 0) goto L29
            return r4
        L29:
            java.util.List r7 = r7.b
            java.util.Iterator r7 = r7.iterator()
        L2f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r7.next()
            ek2 r0 = (defpackage.ek2) r0
            java.lang.String r1 = r0.a
            java.lang.String r0 = r0.b
            boolean r3 = defpackage.a34.i(r1, r2)
            if (r3 == 0) goto L72
            boolean r1 = defpackage.a34.i(r0, r2)
            if (r1 == 0) goto L4d
        L4b:
            r0 = r5
            goto L83
        L4d:
            java.util.List r1 = r6.b
            if (r1 == 0) goto L59
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L59
        L57:
            r0 = r4
            goto L83
        L59:
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            ek2 r3 = (defpackage.ek2) r3
            java.lang.String r3 = r3.b
            boolean r3 = defpackage.b06.C(r3, r0, r5)
            if (r3 == 0) goto L5d
            goto L4b
        L72:
            java.lang.String r1 = r6.b(r1)
            boolean r3 = defpackage.a34.i(r0, r2)
            if (r3 == 0) goto L7f
            if (r1 == 0) goto L57
            goto L4b
        L7f:
            boolean r0 = defpackage.b06.C(r1, r0, r5)
        L83:
            if (r0 != 0) goto L2f
            return r4
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz0.a(jz0):boolean");
    }

    public final String b(String str) {
        str.getClass();
        List list = this.b;
        int D = te4.D(list);
        if (D >= 0) {
            int i = 0;
            while (true) {
                ek2 ek2Var = (ek2) list.get(i);
                if (b06.C(ek2Var.a, str, true)) {
                    return ek2Var.b;
                }
                if (i != D) {
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (defpackage.b06.C(r1.b, r7, true) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jz0 c(java.lang.String r7) {
        /*
            r6 = this;
            java.util.List r0 = r6.b
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L4d
            r3 = 1
            if (r1 == r3) goto L35
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L14
            goto L4d
        L14:
            java.util.Iterator r1 = r0.iterator()
        L18:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            ek2 r4 = (defpackage.ek2) r4
            java.lang.String r5 = r4.a
            boolean r5 = defpackage.b06.C(r5, r2, r3)
            if (r5 == 0) goto L18
            java.lang.String r4 = r4.b
            boolean r4 = defpackage.b06.C(r4, r7, r3)
            if (r4 == 0) goto L18
            goto L4c
        L35:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            ek2 r1 = (defpackage.ek2) r1
            java.lang.String r4 = r1.a
            boolean r4 = defpackage.b06.C(r4, r2, r3)
            if (r4 == 0) goto L4d
            java.lang.String r1 = r1.b
            boolean r1 = defpackage.b06.C(r1, r7, r3)
            if (r1 == 0) goto L4d
        L4c:
            return r6
        L4d:
            jz0 r1 = new jz0
            ek2 r3 = new ek2
            r3.<init>(r2, r7)
            java.util.ArrayList r7 = defpackage.yo0.v0(r0, r3)
            java.lang.String r0 = r6.c
            java.lang.String r2 = r6.d
            java.lang.String r6 = r6.a
            r1.<init>(r0, r2, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz0.c(java.lang.String):jz0");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jz0) {
            jz0 jz0Var = (jz0) obj;
            if (b06.C(this.c, jz0Var.c, true) && b06.C(this.d, jz0Var.d, true) && a34.i(this.b, jz0Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.c.toLowerCase(locale);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.d.toLowerCase(locale);
        lowerCase2.getClass();
        int hashCode2 = lowerCase2.hashCode();
        return (this.b.hashCode() * 31) + hashCode2 + (hashCode * 31) + hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011b A[LOOP:1: B:13:0x0044->B:38:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126 A[EDGE_INSN: B:39:0x0126->B:78:0x0126 BREAK  A[LOOP:1: B:13:0x0044->B:38:0x011b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz0.toString():java.lang.String");
    }

    public jz0(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public jz0(String str, String str2, String str3, ArrayList arrayList) {
        this(str3, arrayList);
        this.c = str;
        this.d = str2;
    }
}
