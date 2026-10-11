package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class x40 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ hd6 y;

    public /* synthetic */ x40(hd6 hd6Var, byte b) {
        this.x = b;
        this.y = hd6Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        ko koVar;
        byte b = this.x;
        boolean z = false;
        byte b2 = 2;
        hd6 hd6Var = this.y;
        switch (b) {
            case 0:
                if (hd6Var != null) {
                    z = ((Boolean) new x40(hd6Var, b2).invoke()).booleanValue();
                }
                return Boolean.valueOf(z);
            case 1:
                if (hd6Var != null) {
                    z = ((Boolean) new x40(hd6Var, b2).invoke()).booleanValue();
                }
                return Boolean.valueOf(z);
            default:
                ko koVar2 = hd6Var.b;
                bd6 bd6Var = (bd6) hd6Var.a.getValue();
                if (bd6Var != null) {
                    koVar = bd6Var.a.a;
                } else {
                    koVar = null;
                }
                return Boolean.valueOf(a34.i(koVar2, koVar));
        }
    }
}
