package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class gn5 implements ei1 {
    public final qg0 A;
    public final in5 x;
    public final long y;
    public final Object z;

    public gn5(in5 in5Var, long j, Object obj, qg0 qg0Var) {
        this.x = in5Var;
        this.y = j;
        this.z = obj;
        this.A = qg0Var;
    }

    @Override // defpackage.ei1
    public final void dispose() {
        in5 in5Var = this.x;
        synchronized (in5Var) {
            if (this.y >= in5Var.p()) {
                Object[] objArr = in5Var.E;
                objArr.getClass();
                long j = this.y;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    jn5.d(objArr, j, jn5.a);
                    in5Var.k();
                }
            }
        }
    }
}
