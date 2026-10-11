package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mz3 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ wj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz3(wj wjVar, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = wjVar;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new mz3(this.z, vz0Var, (byte) 0);
            default:
                return new mz3(this.z, vz0Var, (byte) 1);
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
                return ((mz3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((mz3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
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
                Float f = new Float(0.0f);
                this.y = true;
                if (wj.a(this.z, f, null, null, this, 14) == w11Var) {
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
                Float f2 = new Float(0.0f);
                sk6 sk6Var = s07.d;
                this.y = true;
                if (wj.a(this.z, f2, sk6Var, null, this, 12) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
