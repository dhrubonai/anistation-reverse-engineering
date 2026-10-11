package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ow1 extends pw1 {
    public final Runnable z;

    public ow1(Runnable runnable, long j) {
        super(j);
        this.z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.z.run();
    }

    @Override // defpackage.pw1
    public final String toString() {
        return super.toString() + this.z;
    }
}
