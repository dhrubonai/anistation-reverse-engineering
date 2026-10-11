package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class if5 {
    public static final if5 c;
    public static final if5 d;
    public static final if5 e;
    public final long a;
    public final long b;

    static {
        if5 if5Var = new if5(0L, 0L);
        c = if5Var;
        new if5(Long.MAX_VALUE, Long.MAX_VALUE);
        d = new if5(Long.MAX_VALUE, 0L);
        new if5(0L, Long.MAX_VALUE);
        e = if5Var;
    }

    public if5(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        io3.n(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r17, long r19, long r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            long r3 = r0.a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            long r8 = r0.b
            if (r7 != 0) goto L13
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto L13
            return r1
        L13:
            java.lang.String r0 = defpackage.eq6.a
            long r10 = r1 - r3
            long r3 = r3 ^ r1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L20
            r0 = r3
            goto L21
        L20:
            r0 = r4
        L21:
            long r12 = r1 ^ r10
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 < 0) goto L29
            r5 = r3
            goto L2a
        L29:
            r5 = r4
        L2a:
            r0 = r0 | r5
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L34
            r12 = r10
            goto L3c
        L34:
            r0 = 63
            long r12 = r10 >>> r0
            r14 = 1
            long r12 = r12 ^ r14
            long r12 = r12 + r5
        L3c:
            r14 = -9223372036854775808
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L46
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 != 0) goto L4e
        L46:
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 != 0) goto L4f
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 == 0) goto L4f
        L4e:
            r12 = r14
        L4f:
            long r5 = defpackage.eq6.a(r1, r8)
            int r0 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r0 > 0) goto L5d
            int r0 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r0 > 0) goto L5d
            r0 = r3
            goto L5e
        L5d:
            r0 = r4
        L5e:
            int r7 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r7 > 0) goto L67
            int r5 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r5 > 0) goto L67
            goto L68
        L67:
            r3 = r4
        L68:
            if (r0 == 0) goto L7d
            if (r3 == 0) goto L7d
            long r3 = r19 - r1
            long r3 = java.lang.Math.abs(r3)
            long r0 = r21 - r1
            long r0 = java.lang.Math.abs(r0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L82
            goto L7f
        L7d:
            if (r0 == 0) goto L80
        L7f:
            return r19
        L80:
            if (r3 == 0) goto L83
        L82:
            return r21
        L83:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if5.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && if5.class == obj.getClass()) {
            if5 if5Var = (if5) obj;
            if (this.a == if5Var.a && this.b == if5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
