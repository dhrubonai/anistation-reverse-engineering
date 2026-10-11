package defpackage;

import android.content.Context;
import com.anistation.model.watch.SkipRange;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qj2 implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ qj2(boolean z, v27 v27Var, SkipRange skipRange, boolean z2, SkipRange skipRange2) {
        this.x = (byte) 2;
        this.y = z;
        this.A = v27Var;
        this.B = skipRange;
        this.z = z2;
        this.C = skipRange2;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj = this.C;
        boolean z = this.z;
        Object obj2 = this.B;
        Object obj3 = this.A;
        boolean z2 = this.y;
        switch (b) {
            case 0:
                Context context = (Context) obj3;
                sj2 sj2Var = (sj2) obj2;
                sb2 sb2Var = (sb2) obj;
                if (z2) {
                    if (z) {
                        kb0.F(context);
                    } else {
                        ((mm4) sj2Var).a(16);
                    }
                }
                sb2Var.invoke();
                return pn6Var;
            case 1:
                Context context2 = (Context) obj3;
                sj2 sj2Var2 = (sj2) obj2;
                sb2 sb2Var2 = (sb2) obj;
                if (z2) {
                    if (z) {
                        kb0.F(context2);
                    } else {
                        ((mm4) sj2Var2).a(16);
                    }
                }
                sb2Var2.invoke();
                return pn6Var;
            default:
                v27 v27Var = (v27) obj3;
                SkipRange skipRange = (SkipRange) obj2;
                SkipRange skipRange2 = (SkipRange) obj;
                if (z2) {
                    v27Var.K(io3.i0(skipRange.getEnd() * 1000.0d));
                } else if (z) {
                    v27Var.K(io3.i0(skipRange2.getEnd() * 1000.0d));
                }
                return pn6Var;
        }
    }

    public /* synthetic */ qj2(boolean z, boolean z2, Context context, sj2 sj2Var, sb2 sb2Var, byte b) {
        this.x = b;
        this.y = z;
        this.z = z2;
        this.A = context;
        this.B = sj2Var;
        this.C = sb2Var;
    }
}
