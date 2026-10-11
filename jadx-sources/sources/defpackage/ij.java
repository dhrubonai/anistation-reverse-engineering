package defpackage;

import android.content.Context;
import com.anistation.model.settings.HoldAction;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ij extends t36 implements ic2 {
    public final /* synthetic */ r05 A;
    public final /* synthetic */ w05 B;
    public final /* synthetic */ HoldAction C;
    public final /* synthetic */ ic2 D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ w44 F;
    public boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(boolean z, boolean z2, r05 r05Var, w05 w05Var, HoldAction holdAction, ic2 ic2Var, Context context, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = z;
        this.z = z2;
        this.A = r05Var;
        this.B = w05Var;
        this.C = holdAction;
        this.D = ic2Var;
        this.E = context;
        this.F = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new ij(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((ij) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            m18 m18Var = fq1.y;
            long W = w65.W(500L, jq1.MILLISECONDS);
            this.x = true;
            Object v = x97.v(W, this);
            w11 w11Var = w11.x;
            if (v == w11Var) {
                return w11Var;
            }
        }
        if (this.y && !this.z && !this.A.x) {
            w05 w05Var = this.B;
            HoldAction holdAction = this.C;
            w05Var.x = holdAction;
            sj.b(this.F, true);
            this.D.invoke(holdAction, Boolean.FALSE);
            kb0.F(this.E);
        }
        return pn6.a;
    }
}
