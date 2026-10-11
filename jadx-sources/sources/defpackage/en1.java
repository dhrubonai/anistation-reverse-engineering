package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class en1 extends t36 implements ic2 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ u34 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en1(u34 u34Var, w44 w44Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = u34Var;
        this.A = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new en1(this.z, this.A, vz0Var, (byte) 0);
            default:
                return new en1(this.z, this.A, vz0Var, (byte) 1);
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
                return ((en1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((en1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        w44 w44Var = this.A;
        u34 u34Var = this.z;
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
                ArrayList arrayList = new ArrayList();
                in5 in5Var = u34Var.a;
                dn1 dn1Var = new dn1(arrayList, w44Var, (byte) 0);
                this.y = true;
                in5Var.collect(dn1Var, this);
                return w11Var;
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
                ArrayList arrayList2 = new ArrayList();
                in5 in5Var2 = u34Var.a;
                dn1 dn1Var2 = new dn1(arrayList2, w44Var, (byte) 1);
                this.y = true;
                in5Var2.collect(dn1Var2, this);
                return w11Var;
        }
    }
}
