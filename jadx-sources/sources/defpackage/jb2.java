package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jb2 extends RuntimeException {
    public final kb2 x;
    public final Throwable y;

    public jb2(kb2 kb2Var, Throwable th) {
        super(th);
        this.x = kb2Var;
        this.y = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.y;
    }
}
