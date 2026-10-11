package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ih2 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;

    public /* synthetic */ ih2(ub2 ub2Var, byte b) {
        this.x = b;
        this.y = ub2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        long j;
        switch (this.x) {
            case 0:
                kt5 kt5Var = (kt5) obj;
                synchronized (mt5.c) {
                    j = mt5.e;
                    mt5.e = 1 + j;
                }
                return new uy4(j, kt5Var, this.y);
            default:
                return this.y.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
