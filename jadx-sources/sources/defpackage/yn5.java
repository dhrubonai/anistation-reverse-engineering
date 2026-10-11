package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yn5 implements d84 {
    public final /* synthetic */ do5 x;
    public final /* synthetic */ ub2 y;

    public yn5(do5 do5Var, ub2 ub2Var) {
        this.x = do5Var;
        this.y = ub2Var;
    }

    @Override // defpackage.d84
    public final Object A(long j, long j2, vz0 vz0Var) {
        this.y.invoke(new Float(ur6.c(j2)));
        return new ur6(j2);
    }

    @Override // defpackage.d84
    public final long O(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        float f = 0.0f;
        if (intBitsToFloat < 0.0f && i == 1) {
            d9 d9Var = this.x.e;
            float e = d9Var.e(intBitsToFloat);
            pi4 pi4Var = d9Var.i;
            if (!Float.isNaN(pi4Var.h())) {
                f = pi4Var.h();
            }
            pi4Var.i(e);
            return a(e - f);
        }
        return 0L;
    }

    public final long a(float f) {
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // defpackage.d84
    public final long z(long j, int i, long j2) {
        float h;
        if (i == 1) {
            d9 d9Var = this.x.e;
            float e = d9Var.e(Float.intBitsToFloat((int) (4294967295L & j2)));
            pi4 pi4Var = d9Var.i;
            if (Float.isNaN(pi4Var.h())) {
                h = 0.0f;
            } else {
                h = pi4Var.h();
            }
            pi4Var.i(e);
            return a(e - h);
        }
        return 0L;
    }

    @Override // defpackage.d84
    public final Object z0(long j, vz0 vz0Var) {
        float c = ur6.c(j);
        do5 do5Var = this.x;
        float f = do5Var.e.f();
        float c2 = do5Var.e.d().c();
        if (c < 0.0f && f > c2) {
            this.y.invoke(new Float(c));
        } else {
            j = 0;
        }
        return new ur6(j);
    }
}
