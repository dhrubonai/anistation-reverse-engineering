package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class h34 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ float y;
    public final /* synthetic */ ws6 z;

    public /* synthetic */ h34(ws6 ws6Var, float f, byte b) {
        this.x = b;
        this.z = ws6Var;
        this.y = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        float f = this.y;
        ws6 ws6Var = this.z;
        switch (b) {
            case 0:
                ((l34) ((sn3) ws6Var).y).d.f(f);
                return;
            default:
                ((up5) ((ok2) ws6Var).z).d.f(f);
                return;
        }
    }
}
