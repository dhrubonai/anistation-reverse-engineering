package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v32 {
    public boolean c;
    public int e;
    public long h;
    public final h5 i;
    public u32 a = new u32();
    public u32 b = new u32();
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    public v32(h5 h5Var) {
        this.i = h5Var;
    }

    public final long a() {
        if (this.a.a()) {
            u32 u32Var = this.a;
            long j = u32Var.e;
            if (j == 0) {
                return 0L;
            }
            return u32Var.f / j;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r10) {
        /*
            r9 = this;
            long r0 = r9.d
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = r9.h
            r2 = 1
            long r0 = r0 + r2
            r9.h = r0
            u32 r0 = r9.a
            r0.b(r10)
            u32 r0 = r9.a
            boolean r0 = r0.a()
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L20
            r9.c = r4
            goto L59
        L20:
            long r5 = r9.d
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L59
            boolean r0 = r9.c
            if (r0 == 0) goto L46
            u32 r0 = r9.b
            long r5 = r0.d
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L3b
            r0 = r4
            goto L44
        L3b:
            boolean[] r0 = r0.g
            long r5 = r5 - r2
            r2 = 15
            long r5 = r5 % r2
            int r2 = (int) r5
            boolean r0 = r0[r2]
        L44:
            if (r0 == 0) goto L52
        L46:
            u32 r0 = r9.b
            r0.c()
            u32 r0 = r9.b
            long r2 = r9.d
            r0.b(r2)
        L52:
            r9.c = r1
            u32 r0 = r9.b
            r0.b(r10)
        L59:
            boolean r0 = r9.c
            if (r0 == 0) goto L6f
            u32 r0 = r9.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L6f
            u32 r0 = r9.a
            u32 r2 = r9.b
            r9.a = r2
            r9.b = r0
            r9.c = r4
        L6f:
            r9.d = r10
            u32 r10 = r9.a
            boolean r10 = r10.a()
            if (r10 == 0) goto L7a
            goto L7e
        L7a:
            int r10 = r9.e
            int r4 = r10 + 1
        L7e:
            r9.e = r4
            r9.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v32.b(long):void");
    }

    public final void c() {
        float f;
        float f2;
        boolean a = this.a.a();
        if (a) {
            u32 u32Var = this.a;
            long j = u32Var.e;
            long j2 = 0;
            if (j != 0) {
                j2 = u32Var.f / j;
            }
            f = (float) (1.0E9d / j2);
        } else {
            f = this.f;
        }
        float f3 = this.g;
        if (f != f3) {
            if (f != -1.0f && f3 != -1.0f) {
                if (a && this.a.f >= 5000000000L) {
                    f2 = 0.1f;
                } else {
                    f2 = 1.0f;
                }
                if (Math.abs(f - f3) < f2) {
                    return;
                }
            } else if (f == -1.0f && this.e < 30) {
                return;
            }
            this.g = f;
            h5 h5Var = this.i;
            byte b = h5Var.x;
            Object obj = h5Var.y;
            switch (b) {
                case 13:
                    et6 et6Var = ((ys6) obj).b;
                    if (et6Var.f != f) {
                        et6Var.f = f;
                        et6Var.c(false);
                        return;
                    }
                    return;
                default:
                    aq3 aq3Var = (aq3) obj;
                    et6 et6Var2 = aq3Var.j1.b;
                    if (et6Var2.f != f) {
                        et6Var2.f = f;
                        et6Var2.c(false);
                    }
                    aq3Var.D0(aq3Var.j0);
                    return;
            }
        }
    }
}
