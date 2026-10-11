package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nj extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 1;
    public boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(boolean z, boolean z2, w44 w44Var, w44 w44Var2, w44 w44Var3, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = z;
        this.z = z2;
        this.A = w44Var;
        this.B = w44Var2;
        this.C = w44Var3;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        switch (b) {
            case 0:
                return new nj(this.y, this.z, (dq4) obj2, (w44) obj4, (w44) obj3, vz0Var);
            case 1:
                return new nj((Context) obj2, this.z, (w44) obj4, (w44) obj3, vz0Var);
            case 2:
                return new nj(this.z, (List) obj2, (List) obj4, (af3) obj3, vz0Var);
            default:
                return new nj(this.y, this.z, (w44) obj4, (w44) obj3, (w44) obj2, vz0Var);
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
                ((nj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                return ((nj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((nj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                ((nj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.C;
        Object obj3 = this.B;
        boolean z = this.z;
        Object obj4 = this.A;
        switch (b) {
            case 0:
                m37.N(obj);
                if (this.y || !z || ((dq4) obj2).j) {
                    List list = sj.a;
                    ((w44) obj4).setValue(Boolean.FALSE);
                    ((w44) obj3).setValue(null);
                }
                return pn6Var;
            case 1:
                w44 w44Var = (w44) obj3;
                w44 w44Var2 = (w44) obj4;
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
                    if (((Boolean) w44Var2.getValue()).booleanValue()) {
                        m18 m18Var = fq1.y;
                        long W = w65.W(300L, jq1.MILLISECONDS);
                        this.y = true;
                        if (x97.v(W, this) == w11Var) {
                            return w11Var;
                        }
                    }
                    return pn6Var;
                }
                Activity u = iv.u((Context) obj2);
                if (u != null && !z && ((Boolean) w44Var.getValue()).booleanValue()) {
                    w44Var.setValue(Boolean.FALSE);
                    u.setRequestedOrientation(-1);
                }
                w44Var2.setValue(Boolean.FALSE);
                return pn6Var;
            case 2:
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
                    if (!z && (!((List) obj2).isEmpty() || !((List) obj4).isEmpty())) {
                        this.y = true;
                        y23 y23Var = af3.y;
                        if (((af3) obj3).l(0, 0, this) == w11Var) {
                            return w11Var;
                        }
                    }
                }
                return pn6Var;
            default:
                m37.N(obj);
                w44 w44Var3 = (w44) obj4;
                if (s07.o(w44Var3) && (!this.y || z || ((dq4) ((w44) obj3).getValue()).j)) {
                    w44Var3.setValue(Boolean.FALSE);
                    ((w44) obj2).setValue(null);
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(boolean z, List list, List list2, af3 af3Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = z;
        this.C = list;
        this.A = list2;
        this.B = af3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(Context context, boolean z, w44 w44Var, w44 w44Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.C = context;
        this.z = z;
        this.A = w44Var;
        this.B = w44Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(boolean z, boolean z2, dq4 dq4Var, w44 w44Var, w44 w44Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = z;
        this.z = z2;
        this.C = dq4Var;
        this.A = w44Var;
        this.B = w44Var2;
    }
}
