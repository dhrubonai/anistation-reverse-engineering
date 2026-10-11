package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c61 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ long z;

    public /* synthetic */ c61(Object obj, Object obj2, long j, byte b) {
        this.x = b;
        this.A = obj;
        this.y = obj2;
        this.z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        long j = this.z;
        Object obj = this.y;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                ((d61) obj2).g.a(ns6.a((Exception) obj, j));
                return;
            case 1:
                ((h32) obj2).j.a(ns6.a((Exception) obj, j));
                return;
            default:
                lt6 lt6Var = (lt6) ((l33) obj2).z;
                String str = eq6.a;
                lt6Var.F(j, obj);
                return;
        }
    }
}
