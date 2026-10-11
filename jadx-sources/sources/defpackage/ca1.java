package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ca1 {
    public final String a;
    public int b;
    public long c;
    public final jw3 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ da1 g;

    public ca1(da1 da1Var, String str, int i, jw3 jw3Var) {
        long j;
        this.g = da1Var;
        this.a = str;
        this.b = i;
        if (jw3Var == null) {
            j = -1;
        } else {
            j = jw3Var.d;
        }
        this.c = j;
        if (jw3Var != null && jw3Var.c()) {
            this.d = jw3Var;
        }
    }

    public final boolean a(q7 q7Var) {
        jw3 jw3Var = q7Var.d;
        kf6 kf6Var = q7Var.b;
        if (jw3Var == null) {
            if (this.b != q7Var.c) {
                return true;
            }
            return false;
        }
        long j = this.c;
        if (j != -1) {
            if (jw3Var.d <= j) {
                jw3 jw3Var2 = this.d;
                if (jw3Var2 != null) {
                    int i = jw3Var2.b;
                    int b = kf6Var.b(jw3Var.a);
                    int b2 = kf6Var.b(jw3Var2.a);
                    if (jw3Var.d >= jw3Var2.d && b >= b2) {
                        if (b <= b2) {
                            if (jw3Var.c()) {
                                int i2 = jw3Var.b;
                                int i3 = jw3Var.c;
                                if (i2 <= i) {
                                    if (i2 == i && i3 > jw3Var2.c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i4 = jw3Var.e;
                            if (i4 == -1 || i4 > i) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.kf6 r7, defpackage.kf6 r8) {
        /*
            r6 = this;
            int r0 = r6.b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.o()
            if (r0 >= r7) goto L11
            goto L36
        L11:
            r0 = r3
            goto L36
        L13:
            da1 r1 = r6.g
            jf6 r4 = r1.a
            r7.n(r0, r4)
            int r0 = r4.n
        L1c:
            int r5 = r4.o
            if (r0 > r5) goto L11
            java.lang.Object r5 = r7.l(r0)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            hf6 r7 = r1.b
            hf6 r7 = r8.f(r5, r7, r2)
            int r0 = r7.c
            goto L36
        L33:
            int r0 = r0 + 1
            goto L1c
        L36:
            r6.b = r0
            if (r0 != r3) goto L3b
            goto L4a
        L3b:
            jw3 r6 = r6.d
            if (r6 != 0) goto L40
            goto L48
        L40:
            java.lang.Object r6 = r6.a
            int r6 = r8.b(r6)
            if (r6 == r3) goto L4a
        L48:
            r6 = 1
            return r6
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca1.b(kf6, kf6):boolean");
    }
}
