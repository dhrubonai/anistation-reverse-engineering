package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gd3 extends xz3 implements ra3 {
    public static final ed3 O = new Object();
    public hd3 L;
    public v90 M;
    public rg4 N;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001b, code lost:
    
        if (r4.N == defpackage.rg4.x) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x000d, code lost:
    
        if (r4.N == defpackage.rg4.y) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a1(defpackage.cd3 r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            r1 = 0
            r2 = 1
            if (r6 != r0) goto L6
            goto L9
        L6:
            r0 = 6
            if (r6 != r0) goto L10
        L9:
            rg4 r0 = r4.N
            rg4 r3 = defpackage.rg4.y
            if (r0 != r3) goto L24
            goto L3b
        L10:
            r0 = 3
            if (r6 != r0) goto L14
            goto L17
        L14:
            r0 = 4
            if (r6 != r0) goto L1e
        L17:
            rg4 r0 = r4.N
            rg4 r3 = defpackage.rg4.x
            if (r0 != r3) goto L24
            goto L3b
        L1e:
            if (r6 != r2) goto L21
            goto L24
        L21:
            r0 = 2
            if (r6 != r0) goto L3c
        L24:
            boolean r6 = r4.b1(r6)
            if (r6 == 0) goto L36
            int r5 = r5.b
            hd3 r4 = r4.L
            int r4 = r4.a()
            int r4 = r4 - r2
            if (r5 >= r4) goto L3b
            goto L3a
        L36:
            int r4 = r5.a
            if (r4 <= 0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        L3c:
            java.lang.String r4 = "Lazy list does not support beyond bounds layout for the specified direction"
            defpackage.ze0.m(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd3.a1(cd3, int):boolean");
    }

    public final boolean b1(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = wc7.O(this).W.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            ze0.l();
            return false;
        }
        if (i == 4) {
            int ordinal2 = wc7.O(this).W.ordinal();
            if (ordinal2 == 0) {
                return true;
            }
            if (ordinal2 == 1) {
                return false;
            }
            ze0.l();
            return false;
        }
        ze0.m("Lazy list does not support beyond bounds layout for the specified direction");
        return false;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        em4 p = ro3Var.p(j);
        return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 10));
    }
}
