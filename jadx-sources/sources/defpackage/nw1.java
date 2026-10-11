package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class nw1 extends pw1 {
    public final /* synthetic */ rw1 A;
    public final qg0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw1(rw1 rw1Var, long j, qg0 qg0Var) {
        super(j);
        this.A = rw1Var;
        this.z = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.z.C(this.A);
    }

    @Override // defpackage.pw1
    public final String toString() {
        return super.toString() + this.z;
    }
}
