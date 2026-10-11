package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class of5 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ sf5 B;
    public final /* synthetic */ xi6 C;
    public final /* synthetic */ float D;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of5(Object obj, Object obj2, sf5 sf5Var, xi6 xi6Var, float f, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = obj;
        this.A = obj2;
        this.B = sf5Var;
        this.C = xi6Var;
        this.D = f;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        of5 of5Var = new of5(this.z, this.A, this.B, this.C, this.D, vz0Var);
        of5Var.y = obj;
        return of5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((of5) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        pn6 pn6Var = pn6.a;
        sf5 sf5Var = this.B;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            v11 v11Var = (v11) this.y;
            Object obj2 = this.z;
            Object obj3 = this.A;
            if (!a34.i(obj2, obj3)) {
                sf5Var.O();
            } else {
                sf5Var.L = null;
                if (a34.i(sf5Var.z.getValue(), obj2)) {
                    return pn6Var;
                }
            }
            boolean i = a34.i(obj2, obj3);
            float f = this.D;
            if (!i) {
                xi6 xi6Var = this.C;
                xi6Var.r(obj2);
                xi6Var.o(0L);
                sf5Var.y.setValue(obj2);
                xi6Var.k(f);
            }
            sf5Var.T(f);
            if (sf5Var.K.j()) {
                tl7.z(v11Var, null, null, new hu1(sf5Var, null, (byte) 24), 3);
            } else {
                sf5Var.J = Long.MIN_VALUE;
            }
            this.x = true;
            Object W = sf5Var.W(this);
            w11 w11Var = w11.x;
            if (W == w11Var) {
                return w11Var;
            }
        }
        sf5Var.S();
        return pn6Var;
    }
}
