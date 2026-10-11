package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qp2 extends t36 implements jc2 {
    public /* synthetic */ nr2 A;
    public /* synthetic */ Throwable B;
    public final /* synthetic */ List C;
    public final /* synthetic */ byte x;
    public Throwable y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp2(List list, vz0 vz0Var, byte b) {
        super(3, vz0Var);
        this.x = b;
        this.C = list;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        List list = this.C;
        nr2 nr2Var = (nr2) obj;
        Throwable th = (Throwable) obj2;
        vz0 vz0Var = (vz0) obj3;
        switch (b) {
            case 0:
                qp2 qp2Var = new qp2(list, vz0Var, (byte) 0);
                qp2Var.A = nr2Var;
                qp2Var.B = th;
                return qp2Var.invokeSuspend(pn6Var);
            default:
                qp2 qp2Var2 = new qp2(list, vz0Var, (byte) 1);
                qp2Var2.A = nr2Var;
                qp2Var2.B = th;
                return qp2Var2.invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        List list = this.C;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                nr2 nr2Var = this.A;
                Throwable th = this.B;
                boolean z = this.z;
                if (z) {
                    if (z) {
                        Throwable th2 = this.y;
                        m37.N(obj);
                        return th2;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                Throwable i0 = h41.i0(th);
                this.A = null;
                this.B = null;
                this.y = i0;
                this.z = true;
                up2.a(list, i0, nr2Var, this);
                if (pn6Var != w11Var) {
                    return i0;
                }
                return w11Var;
            default:
                nr2 nr2Var2 = this.A;
                Throwable th3 = this.B;
                boolean z2 = this.z;
                if (z2) {
                    if (z2) {
                        Throwable th4 = this.y;
                        m37.N(obj);
                        return th4;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                Throwable i02 = h41.i0(th3);
                this.A = null;
                this.B = null;
                this.y = i02;
                this.z = true;
                up2.a(list, i02, nr2Var2, this);
                if (pn6Var != w11Var) {
                    return i02;
                }
                return w11Var;
        }
    }
}
