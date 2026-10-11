package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ap4 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ w44 E;
    public final /* synthetic */ w44 F;
    public final /* synthetic */ w44 G;
    public final /* synthetic */ Context x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ap4(Context context, boolean z, boolean[] zArr, boolean z2, boolean z3, int i, boolean z4, w44 w44Var, w44 w44Var2, w44 w44Var3, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = context;
        this.y = z;
        this.z = zArr;
        this.A = z2;
        this.B = z3;
        this.C = i;
        this.D = z4;
        this.E = w44Var;
        this.F = w44Var2;
        this.G = w44Var3;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        w44 w44Var = this.F;
        w44 w44Var2 = this.G;
        Context context = this.x;
        boolean z = this.y;
        boolean[] zArr = this.z;
        boolean z2 = this.A;
        boolean z3 = this.B;
        boolean z4 = this.C;
        return new ap4(context, z, zArr, z2, z3, z4 ? 1 : 0, this.D, this.E, w44Var, w44Var2, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ap4 ap4Var = (ap4) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        ap4Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z;
        m37.N(obj);
        Context context = this.x;
        Activity u = iv.u(context);
        pn6 pn6Var = pn6.a;
        if (u != null) {
            boolean z2 = this.y;
            boolean[] zArr = this.z;
            w44 w44Var = this.F;
            w44 w44Var2 = this.G;
            w44 w44Var3 = this.E;
            if (!z2) {
                if (iv.E(context)) {
                    tk4 tk4Var = t80.f;
                    if (tk4Var != null && tk4Var.b(u)) {
                        t80.f = null;
                        tk4Var.a();
                    }
                    iv.j(w44Var3, false);
                    w44Var.setValue(Boolean.FALSE);
                    zArr[0] = false;
                    w44Var2.setValue(null);
                    u.setRequestedOrientation(-1);
                    return pn6Var;
                }
                if (u.getRequestedOrientation() != -1) {
                    t80.p(u);
                    return pn6Var;
                }
            } else {
                tk4 tk4Var2 = t80.f;
                if (tk4Var2 != null && tk4Var2.b(u)) {
                    t80.f = null;
                    tk4Var2.a();
                }
                boolean z3 = this.C;
                boolean z4 = this.A;
                boolean z5 = this.B;
                if (z4 ? !z5 ? u.getRequestedOrientation() == z3 || u.getRequestedOrientation() == -1 : u.getRequestedOrientation() == 6 : u.getRequestedOrientation() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!a34.i((Boolean) w44Var2.getValue(), Boolean.valueOf(z5)) || !z) {
                    w44Var2.setValue(Boolean.valueOf(z5));
                    w44Var.setValue(Boolean.FALSE);
                    boolean z6 = zArr[0];
                    zArr[0] = false;
                    if (!z4) {
                        iv.j(w44Var3, false);
                        u.setRequestedOrientation(-1);
                        return pn6Var;
                    }
                    boolean z7 = this.D;
                    if (z5) {
                        if (z6 && z7) {
                            iv.j(w44Var3, false);
                            u.setRequestedOrientation(6);
                            return pn6Var;
                        }
                        iv.j(w44Var3, true);
                        u.setRequestedOrientation(6);
                        return pn6Var;
                    }
                    if (z6 && z7) {
                        iv.j(w44Var3, false);
                        u.setRequestedOrientation(-1);
                        return pn6Var;
                    }
                    iv.j(w44Var3, true);
                    u.setRequestedOrientation(z3 ? 1 : 0);
                    return pn6Var;
                }
            }
        }
        return pn6Var;
    }
}
