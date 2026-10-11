package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ih1 extends Exception {
    public final Throwable x;

    public ih1(Throwable th, n11 n11Var, l11 l11Var) {
        super("Coroutine dispatcher " + n11Var + " threw an exception, context = " + l11Var, th);
        this.x = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.x;
    }
}
