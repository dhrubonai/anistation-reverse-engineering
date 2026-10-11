package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rj2 implements sb2 {
    public final /* synthetic */ sj2 A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ sb2 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ rj2(sb2 sb2Var, boolean z, sj2 sj2Var) {
        this.y = sb2Var;
        this.z = z;
        this.A = sj2Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        sj2 sj2Var = this.A;
        boolean z = this.z;
        sb2 sb2Var = this.y;
        switch (b) {
            case 0:
                if (z) {
                    ((mm4) sj2Var).a(16);
                }
                sb2Var.invoke();
                return pn6Var;
            default:
                sb2Var.invoke();
                if (z) {
                    ((mm4) sj2Var).a(16);
                }
                return pn6Var;
        }
    }

    public /* synthetic */ rj2(boolean z, Context context, sj2 sj2Var, sb2 sb2Var) {
        this.z = z;
        this.A = sj2Var;
        this.y = sb2Var;
    }
}
