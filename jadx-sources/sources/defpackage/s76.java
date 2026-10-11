package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s76 extends n76 {
    public final Runnable z;

    public s76(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.z.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.z;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(z51.t(runnable));
        sb.append(", ");
        sb.append(this.x);
        sb.append(", ");
        if (this.y) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return qx1.p(sb, str, ']');
    }
}
