package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ir extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir(byte b, vz0 vz0Var, Object obj, Object obj2, boolean z) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.B = obj2;
        this.z = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                return new ir((byte) 0, vz0Var, (kr) obj3, (sb2) obj2, this.z);
            default:
                return new ir((byte) 1, vz0Var, (f83) obj3, (fa6) obj2, this.z);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((ir) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((ir) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0034. Please report as an issue. */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        boolean z = this.z;
        Object obj2 = this.A;
        w11 w11Var = w11.x;
        Object obj3 = this.B;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                kr krVar = (kr) obj2;
                byte b2 = this.y;
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            m37.N(obj);
                            return pn6Var;
                        }
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m37.N(obj);
                } else {
                    m37.N(obj);
                    rq rqVar = krVar.b;
                    this.y = (byte) 1;
                    tq tqVar = (tq) rqVar;
                    tqVar.getClass();
                    mx0 mx0Var = new mx0(new sq(null, tqVar), (byte) 5);
                    ja1 ja1Var = rh1.a;
                    obj = zz.D(mx0Var, j91.y);
                    if (obj == w11Var) {
                        return w11Var;
                    }
                }
                hr hrVar = new hr((sb2) obj3, krVar, z, null);
                this.y = (byte) 2;
                if (iv.q((w42) obj, hrVar, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                fa6 fa6Var = (fa6) obj3;
                byte b3 = this.y;
                if (b3 != 0) {
                    if (b3 != 1 && b3 != 2 && b3 != 3) {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m37.N(obj);
                } else {
                    m37.N(obj);
                    switch (((f83) obj2).ordinal()) {
                        case 17:
                            cc6 cc6Var = fa6Var.P;
                            this.y = (byte) 1;
                            cc6Var.c(false, this);
                            if (pn6Var == w11Var) {
                                return w11Var;
                            }
                            break;
                        case 18:
                            cc6 cc6Var2 = fa6Var.P;
                            this.y = (byte) 3;
                            if (cc6Var2.s(z, this) == w11Var) {
                                return w11Var;
                            }
                            break;
                        case 19:
                            cc6 cc6Var3 = fa6Var.P;
                            this.y = (byte) 2;
                            cc6Var3.d(this);
                            if (pn6Var == w11Var) {
                                return w11Var;
                            }
                            break;
                    }
                }
                return pn6Var;
        }
    }
}
