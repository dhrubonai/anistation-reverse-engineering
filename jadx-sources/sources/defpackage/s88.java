package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s88 extends a88 implements Runnable {
    public final Runnable E;

    public s88(Runnable runnable) {
        runnable.getClass();
        this.E = runnable;
    }

    @Override // defpackage.a88
    public final String e() {
        String obj = this.E.toString();
        return qx1.q(new StringBuilder(obj.length() + 7), "task=[", obj, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.E.run();
        } catch (Throwable th) {
            if (f88.D.u(this, null, new y78(th))) {
                a88.g(this);
            }
            throw th;
        }
    }
}
