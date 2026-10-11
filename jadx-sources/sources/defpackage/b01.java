package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b01 implements sb2 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ sb2 y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ b01(sb2 sb2Var, w44 w44Var, w44 w44Var2, byte b) {
        this.x = b;
        this.y = sb2Var;
        this.z = w44Var;
        this.A = w44Var2;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        tt1 tt1Var = tt1.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.A;
        w44 w44Var2 = this.z;
        sb2 sb2Var = this.y;
        switch (b) {
            case 0:
                if (((Boolean) w44Var2.getValue()).booleanValue()) {
                    w44Var2.setValue(Boolean.FALSE);
                    w44Var.setValue(tt1Var);
                } else {
                    sb2Var.invoke();
                }
                return pn6Var;
            case 1:
                if (((Boolean) w44Var2.getValue()).booleanValue()) {
                    w44Var2.setValue(Boolean.FALSE);
                    w44Var.setValue(tt1Var);
                } else {
                    sb2Var.invoke();
                }
                return pn6Var;
            case 2:
                if (!s07.d(w44Var2) && !s07.e(w44Var)) {
                    w44Var.setValue(Boolean.TRUE);
                    sb2Var.invoke();
                }
                return pn6Var;
            default:
                if (!s07.d(w44Var2) && !s07.e(w44Var)) {
                    w44Var.setValue(Boolean.TRUE);
                    sb2Var.invoke();
                }
                return pn6Var;
        }
    }
}
