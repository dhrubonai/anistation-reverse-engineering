package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h47 implements Comparable {
    public final int x;
    public final d47 y;

    public h47(int i, d47 d47Var) {
        this.x = i;
        this.y = d47Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.x, ((h47) obj).x);
    }
}
