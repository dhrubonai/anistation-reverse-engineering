package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gm5 extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ hm5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm5(hm5 hm5Var, String str, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = hm5Var;
        this.A = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        String str = this.A;
        hm5 hm5Var = this.z;
        switch (b) {
            case 0:
                return new gm5(hm5Var, str, vz0Var, (byte) 0);
            default:
                return new gm5(hm5Var, str, vz0Var, (byte) 1);
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
                return ((gm5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((gm5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        String str = this.A;
        hm5 hm5Var = this.z;
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
                    kf2 kf2Var = hm5Var.d;
                    this.y = true;
                    Object f = ((mf2) kf2Var).a.f(str, this);
                    if (f != w11Var) {
                        f = pn6Var;
                    }
                    if (f == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            default:
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
                    kf2 kf2Var2 = hm5Var.d;
                    this.y = true;
                    Object n = ((mf2) kf2Var2).a.n(str, this);
                    if (n != w11Var) {
                        n = pn6Var;
                    }
                    if (n == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
