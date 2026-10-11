package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class xh4 {
    public float A = 1.0f;
    public ia3 B = ia3.x;
    public ad x;
    public boolean y;
    public w60 z;

    public boolean d(float f) {
        return false;
    }

    public boolean e(w60 w60Var) {
        return false;
    }

    public final void g(bp1 bp1Var, long j, float f, w60 w60Var) {
        if (this.A != f) {
            if (!d(f)) {
                ad adVar = this.x;
                if (f == 1.0f) {
                    if (adVar != null) {
                        adVar.p(f);
                    }
                    this.y = false;
                } else {
                    if (adVar == null) {
                        adVar = n77.l();
                        this.x = adVar;
                    }
                    adVar.p(f);
                    this.y = true;
                }
            }
            this.A = f;
        }
        if (!a34.i(this.z, w60Var)) {
            if (!e(w60Var)) {
                ad adVar2 = this.x;
                if (w60Var == null) {
                    if (adVar2 != null) {
                        adVar2.s(null);
                    }
                    this.y = false;
                } else {
                    if (adVar2 == null) {
                        adVar2 = n77.l();
                        this.x = adVar2;
                    }
                    adVar2.s(w60Var);
                    this.y = true;
                }
            }
            this.z = w60Var;
        }
        ia3 layoutDirection = bp1Var.getLayoutDirection();
        if (this.B != layoutDirection) {
            f(layoutDirection);
            this.B = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (bp1Var.g() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((af2) bp1Var.n0().y).i(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.y) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float intBitsToFloat4 = Float.intBitsToFloat(i2);
                        n05 g = n03.g(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        vg0 y = bp1Var.n0().y();
                        ad adVar3 = this.x;
                        if (adVar3 == null) {
                            adVar3 = n77.l();
                            this.x = adVar3;
                        }
                        try {
                            y.r(g, adVar3);
                            i(bp1Var);
                            y.p();
                        } catch (Throwable th) {
                            y.p();
                            throw th;
                        }
                    } else {
                        i(bp1Var);
                    }
                }
            } catch (Throwable th2) {
                ((af2) bp1Var.n0().y).i(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        ((af2) bp1Var.n0().y).i(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(bp1 bp1Var);

    public void f(ia3 ia3Var) {
    }
}
