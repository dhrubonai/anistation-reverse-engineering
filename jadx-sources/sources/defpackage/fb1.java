package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fb1 implements Comparable {
    public final boolean x;
    public final boolean y;

    public fb1(int i, ea2 ea2Var) {
        this.x = (ea2Var.e & 1) != 0;
        this.y = w30.l(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fb1 fb1Var = (fb1) obj;
        return wq0.a.d(this.y, fb1Var.y).d(this.x, fb1Var.x).f();
    }
}
