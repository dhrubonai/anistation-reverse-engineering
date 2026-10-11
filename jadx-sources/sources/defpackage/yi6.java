package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class yi6 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ xi6 y;

    public /* synthetic */ yi6(xi6 xi6Var, byte b) {
        this.x = b;
        this.y = xi6Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        xi6 xi6Var = this.y;
        switch (b) {
            case 0:
                return new zi6(xi6Var, (byte) 0);
            default:
                return new zi6(xi6Var, (byte) 1);
        }
    }
}
