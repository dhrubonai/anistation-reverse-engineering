package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z62 extends k1 {
    public final /* synthetic */ byte A = 0;
    public final Iterable B;

    public z62(nw2 nw2Var, int i) {
        super(nw2Var.size(), i);
        this.B = nw2Var;
    }

    @Override // defpackage.k1
    public final Object a(int i) {
        byte b = this.A;
        Iterable iterable = this.B;
        switch (b) {
            case 0:
                return ((a72) iterable).x[i].iterator();
            default:
                return ((nw2) iterable).get(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z62(a72 a72Var, int i) {
        super(i, 0);
        this.B = a72Var;
    }
}
