package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ge3 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ af3 y;

    public /* synthetic */ ge3(af3 af3Var, byte b) {
        this.x = b;
        this.y = af3Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        int i;
        boolean z;
        byte b = this.x;
        af3 af3Var = this.y;
        switch (b) {
            case 0:
                i = af3Var.j().o;
                break;
            case 1:
                i = ((ue3) af3Var.f.getValue()).k;
                break;
            default:
                ue3 j = af3Var.j();
                if (j.o > 0 && !j.l.isEmpty() && j.n > j.m && !af3Var.j.a()) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
        return Integer.valueOf(i);
    }
}
