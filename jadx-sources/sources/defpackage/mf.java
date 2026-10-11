package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mf(Object obj, long j, byte b) {
        this.x = b;
        this.z = obj;
        this.y = j;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        long j = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                return ((im5) ((ka0) obj)).b(j);
            default:
                nt1 nt1Var = nt1.x;
                return new ic6((String) obj, j, new l33((de6) null, new hn6(100, nt1Var, nt1Var)));
        }
    }
}
