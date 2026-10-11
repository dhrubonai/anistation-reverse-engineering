package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wp0 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ wp0(h82 h82Var, h82 h82Var2, n05 n05Var, int i, bg bgVar) {
        this.z = h82Var;
        this.A = h82Var2;
        this.B = n05Var;
        this.y = i;
        this.C = bgVar;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        x75 x75Var;
        n21 n21Var;
        int a;
        byte b = this.x;
        Object obj2 = this.C;
        int i = this.y;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        switch (b) {
            case 0:
                em4[] em4VarArr = (em4[]) obj5;
                xp0 xp0Var = (xp0) obj4;
                xo3 xo3Var = (xo3) obj3;
                int[] iArr = (int[]) obj2;
                dm4 dm4Var = (dm4) obj;
                int length = em4VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    em4 em4Var = em4VarArr[i2];
                    int i4 = i3 + 1;
                    em4Var.getClass();
                    Object w = em4Var.w();
                    if (w instanceof x75) {
                        x75Var = (x75) w;
                    } else {
                        x75Var = null;
                    }
                    ia3 layoutDirection = xo3Var.getLayoutDirection();
                    if (x75Var != null) {
                        n21Var = x75Var.c;
                    } else {
                        n21Var = null;
                    }
                    if (n21Var != null) {
                        a = n21Var.i.a(em4Var.x, i, layoutDirection);
                    } else {
                        a = xp0Var.b.a(em4Var.x, i, layoutDirection);
                    }
                    dm4Var.f(em4Var, a, iArr[i3], 0.0f);
                    i2++;
                    i3 = i4;
                }
                return pn6.a;
            default:
                h82 h82Var = (h82) obj4;
                n05 n05Var = (n05) obj3;
                bg bgVar = (bg) obj2;
                t50 t50Var = (t50) obj;
                if (((h82) obj5) != ((r72) ((oa) wc7.P(h82Var)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean o = vv5.o(i, bgVar, h82Var, n05Var);
                Boolean valueOf = Boolean.valueOf(o);
                if (!o && t50Var.a()) {
                    return null;
                }
                return valueOf;
        }
    }

    public /* synthetic */ wp0(em4[] em4VarArr, xp0 xp0Var, int i, xo3 xo3Var, int[] iArr) {
        this.z = em4VarArr;
        this.A = xp0Var;
        this.y = i;
        this.B = xo3Var;
        this.C = iArr;
    }
}
