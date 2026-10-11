package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x16 {
    public static final x16 c = new x16(-9223372036854775807L, false);
    public boolean a;
    public long b;

    public x16(long j, boolean z) {
        this.b = j;
        this.a = z;
    }

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
