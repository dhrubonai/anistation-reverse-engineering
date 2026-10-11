package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ci implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ px5 y;

    public /* synthetic */ ci(px5 px5Var, byte b) {
        this.x = b;
        this.y = px5Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        boolean z = false;
        px5 px5Var = this.y;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) px5Var.getValue();
                bool.booleanValue();
                return bool;
            case 1:
                xc4 xc4Var = (xc4) px5Var.getValue();
                long j = xc4Var.a;
                return xc4Var;
            case 2:
                ol olVar = kh5.a;
                xc4 xc4Var2 = (xc4) px5Var.getValue();
                long j2 = xc4Var2.a;
                return xc4Var2;
            case 3:
                return Float.valueOf(((Number) px5Var.getValue()).floatValue());
            case 4:
                if (((Number) px5Var.getValue()).floatValue() > 0.96f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                if (((Number) px5Var.getValue()).floatValue() >= 1.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                if (((Number) px5Var.getValue()).floatValue() >= 0.995f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                if (((Number) px5Var.getValue()).floatValue() == 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Float.valueOf(((Number) px5Var.getValue()).floatValue());
        }
    }
}
