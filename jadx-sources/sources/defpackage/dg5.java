package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dg5 implements Comparable {
    public final long x;
    public final v41 y;

    public dg5(long j, v41 v41Var) {
        this.x = j;
        this.y = v41Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.x, ((dg5) obj).x);
    }
}
