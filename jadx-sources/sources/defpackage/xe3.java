package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xe3 extends t36 implements ic2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ af3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe3(af3 af3Var, int i, int i2, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = af3Var;
        this.A = i;
        this.B = i2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        xe3 xe3Var = new xe3(this.z, this.A, this.B, vz0Var);
        xe3Var.y = obj;
        return xe3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((xe3) create((wc5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        byte b = 1;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            wc5 wc5Var = (wc5) this.y;
            af3 af3Var = this.z;
            o8 o8Var = new o8(wc5Var, af3Var, b);
            ud1 ud1Var = ((ue3) af3Var.f.getValue()).i;
            this.x = true;
            Object i = kb0.i(o8Var, this.A, this.B, 100, ud1Var, this);
            w11 w11Var = w11.x;
            if (i == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
