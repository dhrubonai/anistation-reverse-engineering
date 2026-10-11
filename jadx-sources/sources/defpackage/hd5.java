package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hd5 implements d84 {
    public final rd5 x;
    public boolean y;

    public hd5(rd5 rd5Var, boolean z) {
        this.x = rd5Var;
        this.y = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.d84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(long r4, long r6, defpackage.vz0 r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof defpackage.gd5
            if (r4 == 0) goto L13
            r4 = r8
            gd5 r4 = (defpackage.gd5) r4
            int r5 = r4.A
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.A = r5
            goto L1a
        L13:
            gd5 r4 = new gd5
            xz0 r8 = (defpackage.xz0) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.y
            int r8 = r4.A
            r0 = 1
            if (r8 == 0) goto L30
            if (r8 != r0) goto L29
            long r6 = r4.x
            defpackage.m37.N(r5)
            goto L4d
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r3)
            r3 = 0
            return r3
        L30:
            defpackage.m37.N(r5)
            boolean r5 = r3.y
            r1 = 0
            if (r5 == 0) goto L55
            rd5 r3 = r3.x
            boolean r5 = r3.i
            if (r5 == 0) goto L40
            goto L51
        L40:
            r4.x = r6
            r4.A = r0
            java.lang.Object r5 = r3.a(r6, r4)
            w11 r3 = defpackage.w11.x
            if (r5 != r3) goto L4d
            return r3
        L4d:
            ur6 r5 = (defpackage.ur6) r5
            long r1 = r5.a
        L51:
            long r1 = defpackage.ur6.d(r6, r1)
        L55:
            ur6 r3 = new ur6
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd5.A(long, long, vz0):java.lang.Object");
    }

    @Override // defpackage.d84
    public final long z(long j, int i, long j2) {
        if (this.y) {
            rd5 rd5Var = this.x;
            if (!rd5Var.a.a()) {
                return rd5Var.i(rd5Var.e(rd5Var.a.e(rd5Var.e(rd5Var.h(j2)))));
            }
            return 0L;
        }
        return 0L;
    }
}
