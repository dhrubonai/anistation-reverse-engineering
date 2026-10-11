package defpackage;

import java.util.HashMap;
import java.util.Random;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class da1 {
    public static final xw h = new xw((byte) 2);
    public static final Random i = new Random();
    public mr3 d;
    public String f;
    public final jf6 a = new jf6();
    public final hf6 b = new hf6();
    public final HashMap c = new HashMap();
    public kf6 e = kf6.a;
    public long g = -1;

    public final void a(ca1 ca1Var) {
        long j = ca1Var.c;
        if (j != -1 && ca1Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ca1 b(int r19, defpackage.jw3 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            ca1 r8 = (defpackage.ca1) r8
            long r9 = r8.c
            jw3 r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.d
            da1 r14 = r8.g
            java.util.HashMap r15 = r14.c
            r16 = r12
            java.lang.String r12 = r14.f
            java.lang.Object r12 = r15.get(r12)
            ca1 r12 = (defpackage.ca1) r12
            if (r12 == 0) goto L4b
            long r12 = r12.c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L59
            r8.c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.c()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.b
            int r10 = r11.b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.b
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = defpackage.eq6.a
            jw3 r9 = r5.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        La0:
            r5 = r8
            r6 = r9
            goto L16
        La4:
            if (r5 != 0) goto Lb6
            xw r4 = defpackage.da1.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            ca1 r5 = new ca1
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da1.b(int, jw3):ca1");
    }

    public final synchronized String c(kf6 kf6Var, jw3 jw3Var) {
        return b(kf6Var.g(jw3Var.a, this.b).c, jw3Var).a;
    }

    public final void d(q7 q7Var) {
        jw3 jw3Var;
        kf6 kf6Var = q7Var.b;
        int i2 = q7Var.c;
        jw3 jw3Var2 = q7Var.d;
        boolean p = kf6Var.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                ca1 ca1Var = (ca1) hashMap.get(str);
                ca1Var.getClass();
                a(ca1Var);
                return;
            }
            return;
        }
        ca1 ca1Var2 = (ca1) hashMap.get(str);
        this.f = b(i2, jw3Var2).a;
        e(q7Var);
        if (jw3Var2 != null) {
            long j = jw3Var2.d;
            if (jw3Var2.c()) {
                if (ca1Var2 == null || ca1Var2.c != j || (jw3Var = ca1Var2.d) == null || jw3Var.b != jw3Var2.b || jw3Var.c != jw3Var2.c) {
                    b(i2, new jw3(j, jw3Var2.a));
                    this.d.getClass();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.q7 r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            mr3 r0 = r8.d     // Catch: java.lang.Throwable -> L54
            r0.getClass()     // Catch: java.lang.Throwable -> L54
            kf6 r0 = r9.b     // Catch: java.lang.Throwable -> L54
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L10
            monitor-exit(r8)
            return
        L10:
            jw3 r0 = r9.d     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L56
            long r0 = r0.d     // Catch: java.lang.Throwable -> L54
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3a
            java.util.HashMap r4 = r8.c     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = r8.f     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L54
            ca1 r4 = (defpackage.ca1) r4     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L2f
            long r4 = r4.c     // Catch: java.lang.Throwable -> L54
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2f
            goto L34
        L2f:
            long r4 = r8.g     // Catch: java.lang.Throwable -> L54
            r6 = 1
            long r4 = r4 + r6
        L34:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L3a
            monitor-exit(r8)
            return
        L3a:
            java.util.HashMap r0 = r8.c     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r8.f     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L54
            ca1 r0 = (defpackage.ca1) r0     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L56
            long r4 = r0.c     // Catch: java.lang.Throwable -> L54
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L56
            int r0 = r0.b     // Catch: java.lang.Throwable -> L54
            int r1 = r9.c     // Catch: java.lang.Throwable -> L54
            if (r0 == r1) goto L56
            monitor-exit(r8)
            return
        L54:
            r9 = move-exception
            goto Lc9
        L56:
            int r0 = r9.c     // Catch: java.lang.Throwable -> L54
            jw3 r1 = r9.d     // Catch: java.lang.Throwable -> L54
            ca1 r0 = r8.b(r0, r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r8.f     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L66
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> L54
            r8.f = r1     // Catch: java.lang.Throwable -> L54
        L66:
            jw3 r1 = r9.d     // Catch: java.lang.Throwable -> L54
            r2 = 1
            if (r1 == 0) goto La5
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto La5
            jw3 r1 = new jw3     // Catch: java.lang.Throwable -> L54
            jw3 r3 = r9.d     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> L54
            long r5 = r3.d     // Catch: java.lang.Throwable -> L54
            int r3 = r3.b     // Catch: java.lang.Throwable -> L54
            r1.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> L54
            int r3 = r9.c     // Catch: java.lang.Throwable -> L54
            ca1 r1 = r8.b(r3, r1)     // Catch: java.lang.Throwable -> L54
            boolean r3 = r1.e     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto La5
            r1.e = r2     // Catch: java.lang.Throwable -> L54
            kf6 r1 = r9.b     // Catch: java.lang.Throwable -> L54
            jw3 r3 = r9.d     // Catch: java.lang.Throwable -> L54
            java.lang.Object r3 = r3.a     // Catch: java.lang.Throwable -> L54
            hf6 r4 = r8.b     // Catch: java.lang.Throwable -> L54
            r1.g(r3, r4)     // Catch: java.lang.Throwable -> L54
            hf6 r1 = r8.b     // Catch: java.lang.Throwable -> L54
            jw3 r3 = r9.d     // Catch: java.lang.Throwable -> L54
            int r3 = r3.b     // Catch: java.lang.Throwable -> L54
            r1.d(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = defpackage.eq6.a     // Catch: java.lang.Throwable -> L54
            mr3 r1 = r8.d     // Catch: java.lang.Throwable -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L54
        La5:
            boolean r1 = r0.e     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto Lb0
            r0.e = r2     // Catch: java.lang.Throwable -> L54
            mr3 r1 = r8.d     // Catch: java.lang.Throwable -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L54
        Lb0:
            java.lang.String r1 = r0.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r8.f     // Catch: java.lang.Throwable -> L54
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto Lc7
            boolean r1 = r0.f     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto Lc7
            r0.f = r2     // Catch: java.lang.Throwable -> L54
            mr3 r1 = r8.d     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.a     // Catch: java.lang.Throwable -> L54
            r1.e(r9, r0)     // Catch: java.lang.Throwable -> L54
        Lc7:
            monitor-exit(r8)
            return
        Lc9:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da1.e(q7):void");
    }
}
