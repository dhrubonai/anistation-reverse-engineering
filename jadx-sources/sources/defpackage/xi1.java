package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xi1 extends IllegalStateException {
    public final String x;

    public xi1(yp2 yp2Var) {
        yp2Var.getClass();
        this.x = "Response already received: " + yp2Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.x;
    }
}
