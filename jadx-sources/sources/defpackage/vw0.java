package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class vw0 {
    public final pp0 a;
    public final pp0 b;
    public final pp0 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vw0(defpackage.pp0 r10, defpackage.pp0 r11, int r12) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.wk6.n(r0, r2)
            if (r0 == 0) goto L12
            pp0 r0 = defpackage.m37.c(r10)
            goto L13
        L12:
            r0 = r10
        L13:
            long r4 = r11.b
            boolean r1 = defpackage.wk6.n(r4, r2)
            if (r1 == 0) goto L20
            pp0 r1 = defpackage.m37.c(r11)
            goto L21
        L20:
            r1 = r11
        L21:
            float[] r4 = defpackage.te4.g
            r5 = 3
            r6 = 0
            if (r12 != r5) goto L6d
            long r7 = r10.b
            boolean r12 = defpackage.wk6.n(r7, r2)
            long r7 = r11.b
            boolean r2 = defpackage.wk6.n(r7, r2)
            if (r12 == 0) goto L38
            if (r2 == 0) goto L38
            goto L6d
        L38:
            if (r12 != 0) goto L3c
            if (r2 == 0) goto L6d
        L3c:
            if (r12 == 0) goto L3f
            goto L40
        L3f:
            r10 = r11
        L40:
            b65 r10 = (defpackage.b65) r10
            o47 r10 = r10.d
            if (r12 == 0) goto L4b
            float[] r12 = r10.a()
            goto L4c
        L4b:
            r12 = r4
        L4c:
            if (r2 == 0) goto L52
            float[] r4 = r10.a()
        L52:
            r10 = 0
            r2 = r12[r10]
            r3 = r4[r10]
            float r2 = r2 / r3
            r3 = 1
            r6 = r12[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r12 = r12[r7]
            r4 = r4[r7]
            float r12 = r12 / r4
            float[] r4 = new float[r5]
            r4[r10] = r2
            r4[r3] = r6
            r4[r7] = r12
            r6 = r4
        L6d:
            r9.<init>(r11, r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw0.<init>(pp0, pp0, int):void");
    }

    public long a(long j) {
        float g = ep0.g(j);
        float f = ep0.f(j);
        float d = ep0.d(j);
        float c = ep0.c(j);
        pp0 pp0Var = this.b;
        long d2 = pp0Var.d(g, f, d);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e = pp0Var.e(g, f, d);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e *= fArr[2];
        }
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        return this.c.f(f2, f3, e, c, this.a);
    }

    public vw0(pp0 pp0Var, pp0 pp0Var2, pp0 pp0Var3, float[] fArr) {
        this.a = pp0Var;
        this.b = pp0Var2;
        this.c = pp0Var3;
        this.d = fArr;
    }
}
