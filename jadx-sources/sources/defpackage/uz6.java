package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uz6 extends t36 implements ic2 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ w44 B;
    public final /* synthetic */ w44 C;
    public final /* synthetic */ w44 D;
    public final /* synthetic */ w44 E;
    public final /* synthetic */ w44 F;
    public final /* synthetic */ w44 G;
    public boolean x;
    public final /* synthetic */ e9 y;
    public final /* synthetic */ w44 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz6(e9 e9Var, w44 w44Var, w44 w44Var2, w44 w44Var3, w44 w44Var4, w44 w44Var5, w44 w44Var6, w44 w44Var7, w44 w44Var8, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = e9Var;
        this.z = w44Var;
        this.A = w44Var2;
        this.B = w44Var3;
        this.C = w44Var4;
        this.D = w44Var5;
        this.E = w44Var6;
        this.F = w44Var7;
        this.G = w44Var8;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new uz6(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((uz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
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
            w42 m = sw0.m(wt5.j(new t8(this.y, (byte) 5)));
            tz6 tz6Var = new tz6(this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
            this.x = true;
            Object collect = m.collect(tz6Var, this);
            w11 w11Var = w11.x;
            if (collect == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
