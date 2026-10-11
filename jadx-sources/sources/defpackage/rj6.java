package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rj6 extends pj6 {
    public final gl4 A;

    public rj6(gl4 gl4Var) {
        this.A = gl4Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.z;
        this.z = i + 2;
        Object[] objArr = this.x;
        return new z34(this.A, objArr[i], objArr[i + 1]);
    }
}
