package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l06 extends IllegalStateException {
    public final byte x;
    public final int y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l06(int r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = " ms"
            if (r3 == 0) goto L31
            r1 = 1
            if (r3 == r1) goto L2a
            r1 = 2
            if (r3 == r1) goto L23
            r1 = 3
            if (r3 == r1) goto L1c
            r1 = 4
            if (r3 != r1) goto L17
            java.lang.String r1 = "Player stuck suppressed for "
            java.lang.String r0 = defpackage.qx1.i(r4, r1, r0)
            goto L37
        L17:
            defpackage.p65.l()
            r2 = 0
            throw r2
        L1c:
            java.lang.String r1 = "Player stuck playing without ending for "
            java.lang.String r0 = defpackage.qx1.i(r4, r1, r0)
            goto L37
        L23:
            java.lang.String r1 = "Player stuck playing with no progress for "
            java.lang.String r0 = defpackage.qx1.i(r4, r1, r0)
            goto L37
        L2a:
            java.lang.String r1 = "Player stuck buffering with no progress for "
            java.lang.String r0 = defpackage.qx1.i(r4, r1, r0)
            goto L37
        L31:
            java.lang.String r1 = "Player stuck buffering and not loading for "
            java.lang.String r0 = defpackage.qx1.i(r4, r1, r0)
        L37:
            r2.<init>(r0)
            r2.x = r3
            r2.y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l06.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && l06.class == obj.getClass()) {
                l06 l06Var = (l06) obj;
                if (this.x == l06Var.x && this.y == l06Var.y) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.x) * 31) + this.y;
    }
}
