package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zu1 extends x93 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte y = 0;
    public final /* synthetic */ ln5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu1(ln5 ln5Var, pi6 pi6Var, pi6 pi6Var2, pi6 pi6Var3) {
        super(1);
        this.z = ln5Var;
        this.A = pi6Var;
        this.B = pi6Var2;
        this.C = pi6Var3;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        float f;
        float f2;
        float f3;
        long j;
        long j2;
        long j3;
        byte b = this.y;
        Object obj2 = this.B;
        Object obj3 = this.A;
        ln5 ln5Var = this.z;
        boolean z = true;
        Object obj4 = this.C;
        switch (b) {
            case 0:
                p55 p55Var = (p55) obj;
                px5 px5Var = (px5) obj3;
                float f4 = 1.0f;
                if (px5Var != null) {
                    f = ((Number) px5Var.getValue()).floatValue();
                } else {
                    f = 1.0f;
                }
                ai6 ai6Var = ln5Var.c;
                pi4 pi4Var = (pi4) ai6Var.h;
                if (ln5Var.b() && ((Boolean) ((ti4) ai6Var.a).getValue()).booleanValue()) {
                    f2 = ((pi4) ai6Var.g).h();
                } else {
                    f2 = 1.0f;
                }
                float f5 = f * f2;
                if (ln5Var.b()) {
                    ln5Var.f = f5;
                }
                p55Var.c(f5);
                px5 px5Var2 = (px5) obj2;
                if (px5Var2 != null) {
                    f3 = ((Number) px5Var2.getValue()).floatValue();
                } else {
                    f3 = 1.0f;
                }
                if (!ln5Var.b() || !((Boolean) ((ti4) ai6Var.b).getValue()).booleanValue()) {
                    z = false;
                }
                if (z) {
                    f4 = pi4Var.h();
                }
                float f6 = f3 * f4;
                if (ln5Var.b()) {
                    ln5Var.g = f6;
                    if (z) {
                        pi4Var.h();
                    }
                    if (z) {
                        wr6 wr6Var = ln5Var.j;
                        if (wr6Var == null) {
                            wr6Var = new wr6(false);
                            ln5Var.j = wr6Var;
                        }
                        kw4 kw4Var = sc1.a;
                        wr6Var.a(f6, fq1.d(bf6.b(ln5Var.d)));
                    }
                }
                p55Var.h(f6);
                p55Var.i(f6);
                px5 px5Var3 = (px5) obj4;
                if (px5Var3 != null) {
                    j = ((xh6) px5Var3.getValue()).a;
                } else {
                    j = xh6.b;
                }
                if (ln5Var.b() && ((Boolean) ((ti4) ai6Var.c).getValue()).booleanValue()) {
                    j = ((xh6) ((ti4) ai6Var.d).getValue()).a;
                }
                if (ln5Var.b()) {
                    ln5Var.h = j;
                }
                p55Var.m(j);
                return pn6.a;
            default:
                rx1 rx1Var = (rx1) obj4;
                int ordinal = ((tu1) obj).ordinal();
                xh6 xh6Var = null;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            ya5 ya5Var = rx1Var.a.d;
                            if (ya5Var != null) {
                                j3 = ya5Var.b;
                            } else {
                                j3 = ln5Var.h;
                            }
                            xh6Var = new xh6(j3);
                        } else {
                            ze0.l();
                            return null;
                        }
                    } else {
                        xh6Var = (xh6) obj3;
                    }
                } else {
                    ya5 ya5Var2 = ((iv1) obj2).a.d;
                    if (ya5Var2 != null) {
                        xh6Var = new xh6(ya5Var2.b);
                    } else {
                        ya5 ya5Var3 = rx1Var.a.d;
                        if (ya5Var3 != null) {
                            xh6Var = new xh6(ya5Var3.b);
                        }
                    }
                }
                if (xh6Var != null) {
                    j2 = xh6Var.a;
                } else {
                    j2 = xh6.b;
                }
                return new xh6(j2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu1(xh6 xh6Var, iv1 iv1Var, rx1 rx1Var, ln5 ln5Var) {
        super(1);
        this.A = xh6Var;
        this.B = iv1Var;
        this.C = rx1Var;
        this.z = ln5Var;
    }
}
