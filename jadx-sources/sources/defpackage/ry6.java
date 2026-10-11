package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ry6 implements sb2 {
    public final /* synthetic */ w44 A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ v11 y;
    public final /* synthetic */ n80 z;

    public /* synthetic */ ry6(v11 v11Var, n80 n80Var, w44 w44Var) {
        this.y = v11Var;
        this.z = n80Var;
        this.A = w44Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.A;
        n80 n80Var = this.z;
        v11 v11Var = this.y;
        switch (b) {
            case 0:
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                tl7.z(v11Var, null, null, new q8(n80Var, w44Var, null, (byte) 17), 3);
                return pn6Var;
            default:
                tl7.z(v11Var, null, null, new vj6(n80Var, w44Var, null, (byte) 3), 3);
                return pn6Var;
        }
    }

    public /* synthetic */ ry6(v11 v11Var, w44 w44Var, n80 n80Var) {
        this.y = v11Var;
        this.A = w44Var;
        this.z = n80Var;
    }
}
