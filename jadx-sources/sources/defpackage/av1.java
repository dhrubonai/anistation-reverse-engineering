package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class av1 extends x93 implements sb2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ ln5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av1(ln5 ln5Var, byte b) {
        super(0);
        this.y = b;
        this.z = ln5Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.y;
        ln5 ln5Var = this.z;
        switch (b) {
            case 0:
                return ln5Var;
            default:
                ti4 ti4Var = ln5Var.b;
                Boolean bool = Boolean.FALSE;
                ti4Var.setValue(bool);
                ln5Var.c(false);
                ai6 ai6Var = ln5Var.c;
                ((ti4) ai6Var.a).setValue(bool);
                ((ti4) ai6Var.b).setValue(bool);
                ((ti4) ai6Var.c).setValue(bool);
                ((ti4) ai6Var.e).setValue(bool);
                ln5Var.e = ep0.h;
                ln5Var.f = 1.0f;
                ln5Var.g = 1.0f;
                wr6 wr6Var = ln5Var.j;
                if (wr6Var != null) {
                    ms.E0(0, r2.length, null, wr6Var.d);
                    wr6Var.e = 0;
                }
                ln5Var.h = xh6.b;
                ln5Var.i = 0L;
                return pn6.a;
        }
    }
}
