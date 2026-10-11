package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xe5 extends t36 implements ub2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ af5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe5(af5 af5Var, String str, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.z = af5Var;
        this.A = str;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        String str = this.A;
        af5 af5Var = this.z;
        switch (b) {
            case 0:
                return new xe5(af5Var, str, vz0Var, (byte) 0);
            case 1:
                return new xe5(af5Var, str, vz0Var, (byte) 1);
            default:
                return new xe5(af5Var, str, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((xe5) create(vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((xe5) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((xe5) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        String str = this.A;
        af5 af5Var = this.z;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    wd5 wd5Var = af5Var.c;
                    this.y = true;
                    Object a = ((xd5) wd5Var).a.a(str, this);
                    if (a != w11Var) {
                        a = pn6Var;
                    }
                    if (a == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    wd5 wd5Var2 = af5Var.c;
                    this.y = true;
                    Object d = ((xd5) wd5Var2).a.d(str, this);
                    if (d != w11Var) {
                        d = pn6Var;
                    }
                    if (d == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            default:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    wd5 wd5Var3 = af5Var.c;
                    this.y = true;
                    Object a2 = ((xd5) wd5Var3).a.a(str, this);
                    if (a2 != w11Var) {
                        a2 = pn6Var;
                    }
                    if (a2 == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
