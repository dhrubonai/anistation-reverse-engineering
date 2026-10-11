package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g23 {
    public final int a;
    public final int b;
    public final id3 c;

    public g23(int i, int i2, id3 id3Var) {
        this.a = i;
        this.b = i2;
        this.c = id3Var;
        if (i < 0) {
            hz2.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        hz2.a("size should be > 0");
    }
}
