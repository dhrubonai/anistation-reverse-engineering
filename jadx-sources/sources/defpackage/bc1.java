package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class bc1 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ hc1 y;
    public final /* synthetic */ InterruptedException z;

    public /* synthetic */ bc1(hc1 hc1Var, InterruptedException interruptedException, byte b) {
        this.x = b;
        this.y = hc1Var;
        this.z = interruptedException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        InterruptedException interruptedException = this.z;
        hc1 hc1Var = this.y;
        switch (b) {
            case 0:
                hc1Var.h.a(ns6.a(interruptedException, -9223372036854775807L));
                return;
            default:
                hc1Var.h.a(new ns6(interruptedException));
                return;
        }
    }
}
