package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ey7 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ py7 B;
    public final /* synthetic */ dy7 x;
    public final /* synthetic */ dy7 y;
    public final /* synthetic */ long z;

    public ey7(py7 py7Var, dy7 dy7Var, dy7 dy7Var2, long j, boolean z) {
        this.x = dy7Var;
        this.y = dy7Var2;
        this.z = j;
        this.A = z;
        this.B = py7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.R(this.x, this.y, this.z, this.A, null);
    }
}
