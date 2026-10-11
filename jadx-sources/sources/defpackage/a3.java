package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a3 extends t36 implements ic2 {
    public /* synthetic */ long A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ jd5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(jd5 jd5Var, long j, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = jd5Var;
        this.A = j;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                a3 a3Var = new a3(this.z, vz0Var);
                a3Var.A = ((xc4) obj).a;
                return a3Var;
            case 1:
                return new a3(this.z, this.A, vz0Var, (byte) 1);
            case 2:
                return new a3(this.z, this.A, vz0Var, (byte) 2);
            default:
                return new a3(this.z, this.A, vz0Var, (byte) 3);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                long j = ((xc4) obj).a;
                a3 a3Var = new a3(this.z, (vz0) obj2);
                a3Var.A = j;
                return a3Var.invokeSuspend(pn6Var);
            case 1:
                return ((a3) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((a3) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((a3) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        jd5 jd5Var = this.z;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                long j = this.A;
                this.y = true;
                Object b2 = fd5.b(jd5Var.o0, j, this);
                if (b2 == w11Var) {
                    return w11Var;
                }
                return b2;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                rd5 rd5Var = jd5Var.o0;
                x10 x10Var = new x10(this.A, (vz0) null, (byte) 1);
                this.y = true;
                if (rd5Var.g(c54.y, x10Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 2:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                rd5 rd5Var2 = jd5Var.o0;
                long j2 = this.A;
                this.y = true;
                if (rd5Var2.c(j2, true, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                rd5 rd5Var3 = jd5Var.o0;
                long j3 = this.A;
                this.y = true;
                if (rd5Var3.c(j3, false, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(jd5 jd5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 0;
        this.z = jd5Var;
    }
}
