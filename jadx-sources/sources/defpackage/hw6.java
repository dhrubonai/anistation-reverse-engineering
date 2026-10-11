package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hw6 implements AutoCloseable {
    public final /* synthetic */ iw6 x;
    public final /* synthetic */ kw6 y;
    public final /* synthetic */ Object z;

    public /* synthetic */ hw6(iw6 iw6Var, kw6 kw6Var, Object obj) {
        this.x = iw6Var;
        this.y = kw6Var;
        this.z = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        iw6 iw6Var = this.x;
        int i = iw6Var.c - 1;
        iw6Var.c = i;
        if (iw6Var.d && i <= 0) {
            this.y.a().e(this.z);
        }
    }
}
