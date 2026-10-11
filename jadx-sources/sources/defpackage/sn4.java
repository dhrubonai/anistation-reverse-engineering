package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sn4 extends t36 implements ic2 {
    public final /* synthetic */ o27 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ h43 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn4(h43 h43Var, o27 o27Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = h43Var;
        this.A = o27Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        o27 o27Var = this.A;
        h43 h43Var = this.z;
        switch (b) {
            case 0:
                return new sn4(h43Var, o27Var, vz0Var, (byte) 0);
            default:
                return new sn4(h43Var, o27Var, vz0Var, (byte) 1);
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
                return ((sn4) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((sn4) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        o27 o27Var = this.A;
        h43 h43Var = this.z;
        w11 w11Var = w11.x;
        vz0 vz0Var = null;
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
                ja1 ja1Var = rh1.a;
                j91 j91Var = j91.y;
                q8 q8Var = new q8(h43Var, o27Var, vz0Var, (byte) 9);
                this.y = true;
                if (tl7.V(j91Var, q8Var, this) == w11Var) {
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
                la4 la4Var = la4.x;
                sn4 sn4Var = new sn4(h43Var, o27Var, vz0Var, (byte) 0);
                this.y = true;
                if (tl7.V(la4Var, sn4Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
