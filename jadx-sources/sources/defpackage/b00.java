package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b00 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ sp y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b00(sp spVar, Object obj, byte b) {
        this.x = b;
        this.y = spVar;
        this.z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.z;
        sp spVar = this.y;
        switch (b) {
            case 0:
                if (spVar.a == 0) {
                    spVar.k(obj);
                    return;
                }
                return;
            default:
                int i = spVar.a - 1;
                spVar.a = i;
                if (i == 0) {
                    spVar.k(obj);
                    return;
                }
                return;
        }
    }
}
