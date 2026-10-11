package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nr5 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ tr5 y;

    public /* synthetic */ nr5(tr5 tr5Var, byte b) {
        this.x = b;
        this.y = tr5Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        int i;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        tr5 tr5Var = this.y;
        switch (b) {
            case 0:
                k13 k13Var = (k13) obj;
                tr5Var.H.i((int) (k13Var.a >> 32));
                tr5Var.I.i((int) (k13Var.a & 4294967295L));
                return pn6Var;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                do0 do0Var = tr5Var.z;
                pi4 pi4Var = tr5Var.A;
                float f = do0Var.a;
                float f2 = do0Var.b;
                float B = db.B(floatValue, f, f2);
                int i2 = tr5Var.x;
                boolean z = false;
                if (i2 > 0 && (i = i2 + 1) >= 0) {
                    float f3 = B;
                    float f4 = f3;
                    int i3 = 0;
                    while (true) {
                        float I = q23.I(do0Var.a, f2, i3 / i);
                        float f5 = I - B;
                        if (Math.abs(f5) <= f3) {
                            f3 = Math.abs(f5);
                            f4 = I;
                        }
                        if (i3 != i) {
                            i3++;
                        } else {
                            B = f4;
                        }
                    }
                }
                if (B != pi4Var.h()) {
                    if (B != pi4Var.h()) {
                        ub2 ub2Var = tr5Var.B;
                        if (ub2Var != null) {
                            ub2Var.invoke(Float.valueOf(B));
                        } else {
                            tr5Var.d(B);
                        }
                    }
                    sb2 sb2Var = tr5Var.y;
                    if (sb2Var != null) {
                        sb2Var.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                tr5Var.b(0.0f);
                tr5Var.L.invoke();
                return pn6Var;
        }
    }
}
