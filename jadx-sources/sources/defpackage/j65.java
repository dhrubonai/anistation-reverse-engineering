package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j65 {
    public static final tq1 a = new tq1(new qa4((byte) 28), (byte) 0);
    public static final l65 b;

    static {
        long j = ep0.i;
        b = new l65(true, j);
        new l65(false, j);
    }

    public static l65 a(int i, long j) {
        if ((i & 4) != 0) {
            j = ep0.i;
        }
        if (vm1.c(Float.NaN, Float.NaN) && cm6.a(j, ep0.i)) {
            return b;
        }
        return new l65(true, j);
    }
}
