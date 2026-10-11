package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lf extends t36 implements ic2 {
    public final /* synthetic */ gi6 A;
    public final /* synthetic */ dd6 B;
    public final /* synthetic */ rt3 C;
    public final /* synthetic */ pd D;
    public final /* synthetic */ yv2 E;
    public final /* synthetic */ ub2 F;
    public final /* synthetic */ sb2 G;
    public final /* synthetic */ rv6 H;
    public final /* synthetic */ ub2 I;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ t44 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(t44 t44Var, gi6 gi6Var, dd6 dd6Var, rt3 rt3Var, pd pdVar, yv2 yv2Var, ub2 ub2Var, sb2 sb2Var, rv6 rv6Var, ub2 ub2Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = t44Var;
        this.A = gi6Var;
        this.B = dd6Var;
        this.C = rt3Var;
        this.D = pdVar;
        this.E = yv2Var;
        this.F = ub2Var;
        this.G = sb2Var;
        this.H = rv6Var;
        this.I = ub2Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        lf lfVar = new lf(this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, vz0Var);
        lfVar.y = obj;
        return lfVar;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ((lf) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
        return w11.x;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z = this.x;
        vz0 vz0Var = null;
        if (z) {
            if (!z) {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m37.N(obj);
            v71.e();
            return null;
        }
        m37.N(obj);
        v11 v11Var = (v11) this.y;
        gi6 gi6Var = this.A;
        rt3 rt3Var = this.C;
        tl7.z(v11Var, null, y11.A, new c0(gi6Var, rt3Var, vz0Var, (byte) 4), 1);
        t44 t44Var = this.z;
        if (t44Var != null) {
            tl7.z(v11Var, null, null, new q8(t44Var, rt3Var, vz0Var, (byte) 2), 3);
        }
        final h31 h31Var = new h31(gi6Var, this.B, rt3Var, v11Var);
        final gi6 gi6Var2 = this.A;
        final yv2 yv2Var = this.E;
        final rt3 rt3Var2 = this.C;
        final ub2 ub2Var = this.F;
        final dd6 dd6Var = this.B;
        final sb2 sb2Var = this.G;
        final rv6 rv6Var = this.H;
        final ub2 ub2Var2 = this.I;
        en4 en4Var = new en4() { // from class: hf
            @Override // defpackage.en4
            public final InputConnection a(EditorInfo editorInfo) {
                gi6 gi6Var3 = gi6.this;
                kf kfVar = new kf(new ad(gi6Var3), gi6Var3, rt3Var2, ub2Var, h31Var, dd6Var, sb2Var, rv6Var, ub2Var2);
                jf7.O(editorInfo, gi6Var3.d(), gi6Var3.d().B, yv2Var);
                return new ay5(kfVar, editorInfo);
            }
        };
        this.x = true;
        this.D.a(en4Var, this);
        return w11.x;
    }
}
