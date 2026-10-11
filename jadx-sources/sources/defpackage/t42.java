package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t42 implements n42 {
    public final float a;
    public final sw5 b;

    /* JADX WARN: Type inference failed for: r6v1, types: [sw5, java.lang.Object] */
    public t42(float f, float f2, float f3) {
        this.a = f3;
        ?? obj = new Object();
        obj.a = 1.0f;
        obj.b = Math.sqrt(50.0d);
        obj.c = 1.0f;
        if (f < 0.0f) {
            fs4.a("Damping ratio must be non-negative");
        }
        obj.c = f;
        double d = obj.b;
        if (((float) (d * d)) <= 0.0f) {
            fs4.a("Spring stiffness constant must be positive.");
        }
        obj.b = Math.sqrt(f2);
        this.b = obj;
    }

    @Override // defpackage.n42
    public final float b(long j, float f, float f2, float f3) {
        sw5 sw5Var = this.b;
        sw5Var.a = f2;
        return Float.intBitsToFloat((int) (sw5Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    @Override // defpackage.n42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(float r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t42.c(float, float, float):long");
    }

    @Override // defpackage.n42
    public final float d(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.n42
    public final float e(long j, float f, float f2, float f3) {
        sw5 sw5Var = this.b;
        sw5Var.a = f2;
        return Float.intBitsToFloat((int) (sw5Var.a(f, f3, j / 1000000) >> 32));
    }

    public /* synthetic */ t42(float f, float f2) {
        this(f, f2, 0.01f);
    }
}
