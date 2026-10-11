package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o04 extends f1 implements Runnable {
    public final Runnable E;

    public o04(Runnable runnable) {
        runnable.getClass();
        this.E = runnable;
    }

    @Override // defpackage.j1
    public final String j() {
        return "task=[" + this.E + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.E.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
