package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qk4 implements bv5 {
    public int A;
    public boolean B;
    public long C;
    public final db0 x;
    public final pa0 y;
    public zf5 z;

    public qk4(db0 db0Var) {
        int i;
        this.x = db0Var;
        pa0 c = db0Var.c();
        this.y = c;
        zf5 zf5Var = c.x;
        this.z = zf5Var;
        if (zf5Var != null) {
            i = zf5Var.b;
        } else {
            i = -1;
        }
        this.A = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = true;
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return this.x.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.bv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j0(long r9, defpackage.pa0 r11) {
        /*
            r8 = this;
            r11.getClass()
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.B
            if (r3 != 0) goto L5f
            zf5 r3 = r8.z
            pa0 r4 = r8.y
            if (r3 == 0) goto L27
            zf5 r5 = r4.x
            if (r3 != r5) goto L21
            int r3 = r8.A
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.ze0.m(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.C
            r2 = 1
            long r0 = r0 + r2
            db0 r2 = r8.x
            boolean r0 = r2.g(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            zf5 r0 = r8.z
            if (r0 != 0) goto L48
            zf5 r0 = r4.x
            if (r0 == 0) goto L48
            r8.z = r0
            int r0 = r0.b
            r8.A = r0
        L48:
            long r0 = r4.y
            long r2 = r8.C
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r9, r0)
            pa0 r2 = r8.y
            long r4 = r8.C
            r3 = r11
            r2.l(r3, r4, r6)
            long r9 = r8.C
            long r9 = r9 + r6
            r8.C = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.ze0.m(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.h11.h(r9, r8)
            defpackage.ze0.e(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk4.j0(long, pa0):long");
    }
}
