package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ze5 extends t36 implements ic2 {
    public final /* synthetic */ af5 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ ub2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze5(ub2 ub2Var, af5 af5Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = ub2Var;
        this.A = af5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        af5 af5Var = this.A;
        ub2 ub2Var = this.z;
        switch (b) {
            case 0:
                return new ze5(ub2Var, af5Var, vz0Var, (byte) 0);
            default:
                return new ze5(ub2Var, af5Var, vz0Var, (byte) 1);
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
                return ((ze5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((ze5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        Object obj2 = pn6.a;
        af5 af5Var = this.A;
        ub2 ub2Var = this.z;
        Object obj3 = w11.x;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                try {
                    if (z) {
                        if (z) {
                            m37.N(obj);
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        this.y = true;
                        if (ub2Var.invoke(this) == obj3) {
                            obj2 = obj3;
                        }
                    }
                    return obj2;
                } catch (IOException unused) {
                    af5Var.i.i(obj2);
                    return obj2;
                }
            default:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return obj2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                la4 la4Var = la4.x;
                ze5 ze5Var = new ze5(ub2Var, af5Var, vz0Var, (byte) 0);
                this.y = true;
                if (tl7.V(la4Var, ze5Var, this) == obj3) {
                    return obj3;
                }
                return obj2;
        }
    }
}
