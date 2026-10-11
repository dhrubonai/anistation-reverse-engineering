package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i07 extends t36 implements ic2 {
    public final /* synthetic */ r05 A;
    public final /* synthetic */ w44 B;
    public final /* synthetic */ w44 C;
    public final /* synthetic */ v11 D;
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;
    public final /* synthetic */ float I;
    public final /* synthetic */ float J;
    public final /* synthetic */ float K;
    public final /* synthetic */ float L;
    public final /* synthetic */ wj M;
    public final /* synthetic */ v27 N;
    public final /* synthetic */ sb2 O;
    public final /* synthetic */ w44 P;
    public final /* synthetic */ w44 Q;
    public final /* synthetic */ wj R;
    public boolean x;
    public final /* synthetic */ yq4 y;
    public final /* synthetic */ w05 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i07(yq4 yq4Var, w05 w05Var, r05 r05Var, w44 w44Var, w44 w44Var2, v11 v11Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, wj wjVar, v27 v27Var, sb2 sb2Var, w44 w44Var3, w44 w44Var4, wj wjVar2, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = yq4Var;
        this.z = w05Var;
        this.A = r05Var;
        this.B = w44Var;
        this.C = w44Var2;
        this.D = v11Var;
        this.E = f;
        this.F = f2;
        this.G = f3;
        this.H = f4;
        this.I = f5;
        this.J = f6;
        this.K = f7;
        this.L = f8;
        this.M = wjVar;
        this.N = v27Var;
        this.O = sb2Var;
        this.P = w44Var3;
        this.Q = w44Var4;
        this.R = wjVar2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new i07(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((i07) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
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
            final w05 w05Var = this.z;
            final r05 r05Var = this.A;
            final w44 w44Var = this.B;
            final w44 w44Var2 = this.C;
            gj gjVar = new gj((Object) w05Var, (Object) r05Var, w44Var, w44Var2, (byte) 13);
            final v11 v11Var = this.D;
            final float f = this.E;
            final float f2 = this.F;
            final float f3 = this.G;
            final float f4 = this.H;
            final float f5 = this.I;
            final float f6 = this.J;
            final float f7 = this.K;
            final float f8 = this.L;
            final wj wjVar = this.M;
            final v27 v27Var = this.N;
            final sb2 sb2Var = this.O;
            final w44 w44Var3 = this.P;
            final w44 w44Var4 = this.Q;
            final wj wjVar2 = this.R;
            sb2 sb2Var2 = new sb2() { // from class: b07
                @Override // defpackage.sb2
                public final Object invoke() {
                    bx5 z2 = tl7.z(v11.this, null, null, new f07(f, f2, f3, f4, f5, f6, f7, f8, wjVar, r05Var, v27Var, sb2Var, w05Var, w44Var3, w44Var2, w44Var4, wjVar2, null), 3);
                    tw5 tw5Var = s07.a;
                    w44Var.setValue(z2);
                    return pn6.a;
                }
            };
            sb2 sb2Var3 = new sb2() { // from class: c07
                @Override // defpackage.sb2
                public final Object invoke() {
                    bx5 z2 = tl7.z(v11.this, null, null, new g07(f, f2, f3, f4, f5, f6, f7, f8, wjVar, w05Var, w44Var3, w44Var2, null), 3);
                    tw5 tw5Var = s07.a;
                    w44Var.setValue(z2);
                    return pn6.a;
                }
            };
            ic2 ic2Var = new ic2() { // from class: d07
                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((uq4) obj2).a();
                    tl7.z(v11.this, null, null, new h07(f, f2, f3, f4, f5, f6, f7, f8, wjVar, (xc4) obj3, r05Var, w44Var3, w44Var2, null), 3);
                    return pn6.a;
                }
            };
            this.x = true;
            Object d = bo1.d(this.y, gjVar, sb2Var2, sb2Var3, ic2Var, this);
            w11 w11Var = w11.x;
            if (d == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
