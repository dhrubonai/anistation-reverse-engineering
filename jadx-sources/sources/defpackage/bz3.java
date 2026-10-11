package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bz3 extends t36 implements ic2 {
    public final /* synthetic */ lz A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ cz3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz3(cz3 cz3Var, lz lzVar, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = cz3Var;
        this.A = lzVar;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        lz lzVar = this.A;
        cz3 cz3Var = this.z;
        switch (b) {
            case 0:
                return new bz3(cz3Var, lzVar, vz0Var, (byte) 0);
            default:
                return new bz3(cz3Var, lzVar, vz0Var, (byte) 1);
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
                return ((bz3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((bz3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        lz lzVar = this.A;
        cz3 cz3Var = this.z;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                wj wjVar = cz3Var.e;
                Float f = new Float(sz.a.a(lzVar.c));
                this.y = true;
                if (wjVar.f(this, f) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
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
                wj wjVar2 = cz3Var.e;
                Float f2 = new Float(sz.a.a(lzVar.c));
                this.y = true;
                if (wjVar2.f(this, f2) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
