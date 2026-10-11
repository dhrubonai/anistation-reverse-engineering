package l7;

import r6.h0;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r3 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof l7.c
            r1 = 0
            if (r0 == 0) goto L32
            char r0 = r6.f6875a
            char r2 = r6.f6876b
            int r3 = r6.h0.B(r0, r2)
            r4 = 1
            if (r3 <= 0) goto L12
            r3 = r4
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 == 0) goto L27
            r3 = r7
            l7.c r3 = (l7.c) r3
            char r5 = r3.f6875a
            char r3 = r3.f6876b
            int r3 = r6.h0.B(r5, r3)
            if (r3 <= 0) goto L24
            r3 = r4
            goto L25
        L24:
            r3 = r1
        L25:
            if (r3 != 0) goto L31
        L27:
            l7.c r7 = (l7.c) r7
            char r3 = r7.f6875a
            if (r0 != r3) goto L32
            char r7 = r7.f6876b
            if (r2 != r7) goto L32
        L31:
            r1 = r4
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        boolean z9;
        char c6 = this.f6875a;
        char c10 = this.f6876b;
        if (h0.B(c6, c10) > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return -1;
        }
        return (c6 * 31) + c10;
    }

    public final String toString() {
        return this.f6875a + ".." + this.f6876b;
    }
}
