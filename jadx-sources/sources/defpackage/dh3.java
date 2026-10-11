package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dh3 extends la2 {
    public long A;
    public final long y;
    public final boolean z;

    public dh3(bv5 bv5Var, long j, boolean z) {
        super(bv5Var);
        this.y = j;
        this.z = z;
        if (j >= 0) {
            return;
        }
        ze0.e(h11.h(j, "byteCount < 0: "));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r2 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r2 = defpackage.zo5.n(r4, "expected ", " bytes but got ");
        r2.append(r16.A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        throw new java.io.EOFException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r11 = r16.A + r2;
        r16.A = r11;
        r11 = r11 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r11 > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r2 = r19.y - r11;
        r6 = new java.lang.Object();
        r6.v0(r19);
        r19.f0(r2, r6);
        r6.skip(r6.y);
        r2 = defpackage.zo5.n(r4, "expected ", " bytes but got ");
        r2.append(r16.A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        throw new java.io.IOException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r17 > r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r17 > r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        r2 = r16.x.j0(r2, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r2 != (-1)) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, pa0] */
    @Override // defpackage.la2, defpackage.bv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j0(long r17, defpackage.pa0 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r1.getClass()
            long r2 = r0.A
            long r4 = r0.y
            long r2 = r4 - r2
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            java.lang.String r9 = " bytes but got "
            java.lang.String r10 = "expected "
            if (r8 < 0) goto L80
            boolean r11 = r0.z
            r12 = -1
            if (r11 == 0) goto L28
            r14 = 1
            long r2 = r2 + r14
            int r11 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r11 <= 0) goto L25
            goto L2f
        L25:
            r2 = r17
            goto L2f
        L28:
            if (r8 != 0) goto L2b
            goto L3b
        L2b:
            int r11 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r11 <= 0) goto L25
        L2f:
            bv5 r11 = r0.x
            long r2 = r11.j0(r2, r1)
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 != 0) goto L4f
            if (r8 != 0) goto L3c
        L3b:
            return r12
        L3c:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.StringBuilder r2 = defpackage.zo5.n(r4, r10, r9)
            long r3 = r0.A
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L4f:
            long r11 = r0.A
            long r11 = r11 + r2
            r0.A = r11
            long r11 = r11 - r4
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 > 0) goto L5a
            return r2
        L5a:
            long r2 = r1.y
            long r2 = r2 - r11
            pa0 r6 = new pa0
            r6.<init>()
            r6.v0(r1)
            r1.f0(r2, r6)
            long r1 = r6.y
            r6.skip(r1)
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = defpackage.zo5.n(r4, r10, r9)
            long r3 = r0.A
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L80:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = defpackage.zo5.n(r4, r10, r9)
            long r3 = r0.A
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh3.j0(long, pa0):long");
    }
}
