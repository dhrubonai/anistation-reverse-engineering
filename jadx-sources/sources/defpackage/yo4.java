package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yo4 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Context x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo4(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = context;
        this.y = z;
        this.z = z2;
        this.A = z3;
        this.B = z4;
        this.C = z5;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new yo4(this.x, this.y, this.z, this.A, this.B, this.C, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        yo4 yo4Var = (yo4) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        yo4Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        w57 w57Var;
        m37.N(obj);
        Activity u = iv.u(this.x);
        pn6 pn6Var = pn6.a;
        if (u == null) {
            return pn6Var;
        }
        Window window = u.getWindow();
        fq3 fq3Var = new fq3(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else if (i >= 30) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else {
            w57Var = new w57(window, fq3Var, (byte) 0);
        }
        boolean z = this.y;
        boolean z2 = this.z;
        if (z) {
            if (!z2 && !this.A) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2 && this.B) {
            w57Var.c(519);
            w57Var.g();
            w57Var.f(false);
            w57Var.e(false);
            return pn6Var;
        }
        w57Var.h();
        boolean z3 = !this.C;
        w57Var.f(z3);
        w57Var.e(z3);
        return pn6Var;
    }
}
