package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nz4 {
    public final wv a;
    public final fr0 b;
    public final Object c = new Object();

    public nz4(wv wvVar, fr0 fr0Var) {
        this.a = wvVar;
        this.b = fr0Var;
    }

    public final void a(long j) {
        synchronized (this.c) {
            g90 g90Var = (g90) this.a.c;
            g90Var.x = j;
            g90Var.h(j);
        }
    }
}
