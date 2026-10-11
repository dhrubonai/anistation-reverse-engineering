package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y18 {
    public final z18 a;
    public int b = 1;
    public long c = a();

    public y18(z18 z18Var) {
        this.a = z18Var;
    }

    public final long a() {
        z18 z18Var = this.a;
        a34.x(z18Var);
        long longValue = ((Long) tq7.v.a(null)).longValue();
        long longValue2 = ((Long) tq7.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        z18Var.d().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
