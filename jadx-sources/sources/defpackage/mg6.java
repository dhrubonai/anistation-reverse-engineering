package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mg6 extends t36 implements ub2 {
    public final /* synthetic */ c54 A;
    public byte x;
    public final /* synthetic */ ng6 y;
    public final /* synthetic */ id0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg6(ng6 ng6Var, id0 id0Var, c54 c54Var, vz0 vz0Var) {
        super(1, vz0Var);
        this.y = ng6Var;
        this.z = id0Var;
        this.A = c54Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new mg6(this.y, this.z, this.A, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return ((mg6) create((vz0) obj)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        id0 id0Var = this.z;
        byte b = this.x;
        vz0 vz0Var = null;
        c54 c54Var = c54.z;
        c54 c54Var2 = this.A;
        byte b2 = 1;
        ng6 ng6Var = this.y;
        try {
            if (b != 0) {
                if (b == 1 || b == 2) {
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                fd6 fd6Var = new fd6(id0Var, vz0Var, b2);
                this.x = (byte) 2;
                Object d = rz5.d(new rf6(1500L, this), fd6Var);
                w11 w11Var = w11.x;
                if (d == w11Var) {
                    return w11Var;
                }
            }
            if (c54Var2 != c54Var) {
                ng6Var.a();
            }
            return pn6.a;
        } catch (Throwable th) {
            if (c54Var2 != c54Var) {
                ng6Var.a();
            }
            throw th;
        }
    }
}
