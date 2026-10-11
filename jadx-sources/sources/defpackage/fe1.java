package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fe1 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fe1(em4[] em4VarArr, z75 z75Var, int i, int[] iArr) {
        this.x = (byte) 2;
        this.z = em4VarArr;
        this.A = z75Var;
        this.y = i;
        this.B = iArr;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        x75 x75Var;
        n21 n21Var;
        int a;
        byte b = this.x;
        int i2 = 0;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.B;
        int i3 = this.y;
        Object obj3 = this.A;
        Object obj4 = this.z;
        bd6 bd6Var = null;
        switch (b) {
            case 0:
                h13 h13Var = (h13) obj3;
                b44 b44Var = (b44) obj2;
                if (obj != ((he1) obj4)) {
                    if (obj instanceof xx5) {
                        int i4 = h13Var.a - i3;
                        int d = b44Var.d(obj);
                        if (d >= 0) {
                            i = b44Var.c[d];
                        } else {
                            i = Integer.MAX_VALUE;
                        }
                        b44Var.g(Math.min(i4, i), obj);
                        return pn6Var;
                    }
                    return pn6Var;
                }
                ze0.m("A derived state calculation cannot read itself");
                return null;
            case 1:
                zn2 zn2Var = (zn2) obj4;
                xo3 xo3Var = (xo3) obj3;
                em4 em4Var = (em4) obj2;
                dm4 dm4Var = (dm4) obj;
                int i5 = zn2Var.y;
                cb6 cb6Var = zn2Var.x;
                di6 di6Var = zn2Var.z;
                cd6 cd6Var = (cd6) zn2Var.A.invoke();
                if (cd6Var != null) {
                    bd6Var = cd6Var.a;
                }
                bd6 bd6Var2 = bd6Var;
                if (xo3Var.getLayoutDirection() == ia3.y) {
                    z = true;
                } else {
                    z = false;
                }
                cb6Var.a(rg4.y, xt5.c(dm4Var, i5, di6Var, bd6Var2, z, em4Var.x), i3, em4Var.x);
                dm4.j(dm4Var, em4Var, Math.round(-cb6Var.a.h()), 0);
                return pn6Var;
            default:
                em4[] em4VarArr = (em4[]) obj4;
                z75 z75Var = (z75) obj3;
                int[] iArr = (int[]) obj2;
                dm4 dm4Var2 = (dm4) obj;
                int length = em4VarArr.length;
                int i6 = 0;
                while (i2 < length) {
                    em4 em4Var2 = em4VarArr[i2];
                    int i7 = i6 + 1;
                    em4Var2.getClass();
                    Object w = em4Var2.w();
                    if (w instanceof x75) {
                        x75Var = (x75) w;
                    } else {
                        x75Var = null;
                    }
                    if (x75Var != null) {
                        n21Var = x75Var.c;
                    } else {
                        n21Var = null;
                    }
                    if (n21Var != null) {
                        a = n21Var.i.a(em4Var2.y, i3, ia3.x);
                    } else {
                        a = z75Var.b.a(em4Var2.y, i3);
                    }
                    dm4Var2.f(em4Var2, iArr[i6], a, 0.0f);
                    i2++;
                    i6 = i7;
                }
                return pn6Var;
        }
    }

    public /* synthetic */ fe1(byte b, int i, Object obj, Object obj2, Object obj3) {
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.y = i;
    }
}
