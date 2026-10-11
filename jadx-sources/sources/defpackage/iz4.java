package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iz4 extends t36 implements ic2 {
    public final /* synthetic */ ev2 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ kz4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz4(kz4 kz4Var, ev2 ev2Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = kz4Var;
        this.A = ev2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        ev2 ev2Var = this.A;
        kz4 kz4Var = this.z;
        switch (b) {
            case 0:
                return new iz4(kz4Var, ev2Var, vz0Var, (byte) 0);
            default:
                return new iz4(kz4Var, ev2Var, vz0Var, (byte) 1);
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
                return ((iz4) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((iz4) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        ev2 ev2Var = this.A;
        kz4 kz4Var = this.z;
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
                this.y = true;
                int i = kz4.f;
                Object a = kz4Var.a(ev2Var, 0, this);
                if (a == w11Var) {
                    return w11Var;
                }
                return a;
            default:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                int i2 = kz4.f;
                Object a2 = kz4Var.a(ev2Var, 1, this);
                if (a2 == w11Var) {
                    return w11Var;
                }
                return a2;
        }
    }
}
