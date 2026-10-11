package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jb3 extends wa3 {
    public final /* synthetic */ mb3 b;
    public final /* synthetic */ ic2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb3(mb3 mb3Var, ic2 ic2Var, String str) {
        super(str);
        this.b = mb3Var;
        this.c = ic2Var;
    }

    @Override // defpackage.vo3
    public final wo3 b(xo3 xo3Var, List list, long j) {
        mb3 mb3Var = this.b;
        hb3 hb3Var = mb3Var.E;
        hb3Var.x = xo3Var.getLayoutDirection();
        hb3Var.y = xo3Var.b();
        hb3Var.z = xo3Var.getFontScale();
        boolean d0 = xo3Var.d0();
        ic2 ic2Var = this.c;
        if (!d0 && mb3Var.x.E != null) {
            mb3Var.B = 0;
            wo3 wo3Var = (wo3) ic2Var.invoke(mb3Var.F, new rx0(j));
            return new ib3(wo3Var, mb3Var, mb3Var.B, wo3Var, (byte) 0);
        }
        mb3Var.A = 0;
        wo3 wo3Var2 = (wo3) ic2Var.invoke(hb3Var, new rx0(j));
        return new ib3(wo3Var2, mb3Var, mb3Var.A, wo3Var2, (byte) 1);
    }
}
