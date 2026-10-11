package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aj0 extends u16 implements Comparable {
    public long H;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        aj0 aj0Var = (aj0) obj;
        if (d(4) != aj0Var.d(4)) {
            if (d(4)) {
                return 1;
            }
            return -1;
        }
        long j = this.D - aj0Var.D;
        if (j == 0) {
            j = this.H - aj0Var.H;
            if (j == 0) {
                return 0;
            }
        }
        if (j > 0) {
            return 1;
        }
        return -1;
    }
}
