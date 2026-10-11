package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tr5 implements uo1 {
    public final pi4 A;
    public ub2 B;
    public final boolean C = true;
    public final float[] D;
    public final qi4 E;
    public final qi4 F;
    public boolean G;
    public final qi4 H;
    public final qi4 I;
    public final rg4 J;
    public final ti4 K;
    public final nj4 L;
    public final pi4 M;
    public final pi4 N;
    public final c9 O;
    public final i54 P;
    public final int x;
    public sb2 y;
    public final do0 z;

    public tr5(float f, int i, sb2 sb2Var, do0 do0Var) {
        float[] fArr;
        float f2;
        this.x = i;
        this.y = sb2Var;
        this.z = do0Var;
        this.A = new pi4(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.D = fArr;
        this.E = new qi4(0);
        this.F = new qi4(0);
        this.H = new qi4(0);
        this.I = new qi4(0);
        this.J = rg4.y;
        this.K = xt5.g(Boolean.FALSE);
        this.L = new nj4(this, (byte) 24);
        do0 do0Var2 = this.z;
        float f3 = do0Var2.a;
        float f4 = do0Var2.b - f3;
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (f - f3) / f4;
        }
        this.M = new pi4(q23.I(0.0f, 0.0f, db.B(f2, 0.0f, 1.0f)));
        this.N = new pi4(0.0f);
        this.O = new c9(this, (byte) 1);
        this.P = new i54();
    }

    @Override // defpackage.uo1
    public final Object a(l5 l5Var, j10 j10Var) {
        Object K = db.K(new e52(this, l5Var, null, (byte) 25), j10Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }

    public final void b(float f) {
        float max;
        float min;
        float f2;
        if (this.J == rg4.x) {
            float h = this.F.h();
            qi4 qi4Var = this.I;
            max = Math.max(h - (qi4Var.h() / 2.0f), 0.0f);
            min = Math.min(qi4Var.h() / 2.0f, max);
        } else {
            float h2 = this.E.h();
            qi4 qi4Var2 = this.H;
            max = Math.max(h2 - (qi4Var2.h() / 2.0f), 0.0f);
            min = Math.min(qi4Var2.h() / 2.0f, max);
        }
        pi4 pi4Var = this.M;
        float h3 = pi4Var.h() + f;
        pi4 pi4Var2 = this.N;
        pi4Var.i(pi4Var2.h() + h3);
        pi4Var2.i(0.0f);
        float d = sr5.d(pi4Var.h(), this.D, min, max);
        do0 do0Var = this.z;
        float f3 = do0Var.a;
        float f4 = do0Var.b;
        float f5 = max - min;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (d - min) / f5;
        }
        float I = q23.I(f3, f4, db.B(f2, 0.0f, 1.0f));
        if (I == this.A.h()) {
            return;
        }
        ub2 ub2Var = this.B;
        if (ub2Var != null) {
            ub2Var.invoke(Float.valueOf(I));
        } else {
            d(I);
        }
    }

    public final float c() {
        float f;
        do0 do0Var = this.z;
        float f2 = do0Var.a;
        float f3 = do0Var.b;
        float B = db.B(this.A.h(), f2, f3);
        float f4 = f3 - f2;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (B - f2) / f4;
        }
        return db.B(f, 0.0f, 1.0f);
    }

    public final void d(float f) {
        if (this.C) {
            do0 do0Var = this.z;
            float f2 = do0Var.a;
            float f3 = do0Var.b;
            f = sr5.d(db.B(f, f2, f3), this.D, f2, f3);
        }
        this.A.i(f);
    }
}
