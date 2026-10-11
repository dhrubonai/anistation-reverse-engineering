package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zl2 implements Comparable {
    public final int A;
    public final long B;
    public final op1 C;
    public final String D;
    public final String E;
    public final long F;
    public final long G;
    public final boolean H;
    public final String x;
    public final yl2 y;
    public final long z;

    public zl2(String str, yl2 yl2Var, long j, int i, long j2, op1 op1Var, String str2, String str3, long j3, long j4, boolean z) {
        this.x = str;
        this.y = yl2Var;
        this.z = j;
        this.A = i;
        this.B = j2;
        this.C = op1Var;
        this.D = str2;
        this.E = str3;
        this.F = j3;
        this.G = j4;
        this.H = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.B;
        if (j > longValue) {
            return 1;
        }
        if (j < l.longValue()) {
            return -1;
        }
        return 0;
    }
}
