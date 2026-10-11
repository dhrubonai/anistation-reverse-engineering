package defpackage;

import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ej implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ej(boolean z, tr5 tr5Var) {
        this.x = (byte) 2;
        this.y = z;
        this.z = tr5Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        Object obj2 = this.z;
        boolean z = this.y;
        switch (b) {
            case 0:
                View view = (View) obj2;
                ((ci1) obj).getClass();
                view.setKeepScreenOn(z);
                return new i5(view, (byte) 4);
            case 1:
                bt0 bt0Var = (bt0) obj2;
                bt0Var.a.e(z);
                bt0Var.b.g(z);
                return new rz((xg3) obj, bt0Var);
            default:
                tr5 tr5Var = (tr5) obj2;
                bi5 bi5Var = (bi5) obj;
                pn6 pn6Var = pn6.a;
                if (!z) {
                    w73[] w73VarArr = zh5.a;
                    bi5Var.b(yh5.j, pn6Var);
                }
                String valueOf = String.valueOf(io3.h0(tr5Var.A.h() * 100.0f) / 100.0f);
                w73[] w73VarArr2 = zh5.a;
                ai5 ai5Var = yh5.b;
                w73 w73Var = zh5.a[0];
                ai5Var.getClass();
                bi5Var.b(ai5Var, valueOf);
                bi5Var.b(oh5.i, new o3(null, new nr5(tr5Var, (byte) 1)));
                return pn6Var;
        }
    }

    public /* synthetic */ ej(byte b, Object obj, boolean z) {
        this.x = b;
        this.z = obj;
        this.y = z;
    }
}
