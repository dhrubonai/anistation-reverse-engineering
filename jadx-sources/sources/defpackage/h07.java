package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h07 extends t36 implements ic2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ wj G;
    public final /* synthetic */ xc4 H;
    public final /* synthetic */ r05 I;
    public final /* synthetic */ w44 J;
    public final /* synthetic */ w44 K;
    public boolean x;
    public final /* synthetic */ float y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h07(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, wj wjVar, xc4 xc4Var, r05 r05Var, w44 w44Var, w44 w44Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = f;
        this.z = f2;
        this.A = f3;
        this.B = f4;
        this.C = f5;
        this.D = f6;
        this.E = f7;
        this.F = f8;
        this.G = wjVar;
        this.H = xc4Var;
        this.I = r05Var;
        this.J = w44Var;
        this.K = w44Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new h07(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((h07) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            tw5 tw5Var = s07.a;
            float floatValue = ((Number) this.J.getValue()).floatValue();
            float f3 = this.y;
            float f4 = this.z;
            float f5 = f3 + f4;
            float f6 = ((this.A - this.B) - this.C) - f4;
            if (f6 < f5) {
                f = f5;
            } else {
                f = f6;
            }
            float f7 = this.D + f4;
            float f8 = this.E;
            float f9 = ((f8 - this.F) - floatValue) - f4;
            if (f9 < f7) {
                f2 = f7;
            } else {
                f2 = f9;
            }
            long r = s07.r((uy3) this.K.getValue(), f5, f, f7, f2);
            wj wjVar = this.G;
            long f10 = xc4.f(xc4.f(r, ((xc4) wjVar.d()).a), this.H.a);
            boolean z2 = this.I.x;
            if (f6 < f5) {
                f6 = f5;
            }
            if (f9 < f7) {
                f9 = f7;
            }
            if (z2) {
                f9 = f8 + f4;
            }
            float B = db.B(Float.intBitsToFloat((int) (f10 >> 32)), f5, f6);
            float B2 = db.B(Float.intBitsToFloat((int) (f10 & 4294967295L)), f7, f9);
            xc4 xc4Var = new xc4(xc4.e((Float.floatToRawIntBits(B) << 32) | (Float.floatToRawIntBits(B2) & 4294967295L), r));
            this.x = true;
            Object f11 = wjVar.f(this, xc4Var);
            w11 w11Var = w11.x;
            if (f11 == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
