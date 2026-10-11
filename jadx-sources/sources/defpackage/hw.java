package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public /* synthetic */ hw(Object obj, String str, long j, long j2, byte b) {
        this.x = b;
        this.B = obj;
        this.y = str;
        this.z = j;
        this.A = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.B;
        switch (b) {
            case 0:
                iw iwVar = (iw) ((pz2) obj).z;
                String str = eq6.a;
                iwVar.z(this.z, this.y, this.A);
                return;
            default:
                lt6 lt6Var = (lt6) ((l33) obj).z;
                String str2 = eq6.a;
                lt6Var.p(this.z, this.y, this.A);
                return;
        }
    }
}
