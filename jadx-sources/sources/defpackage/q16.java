package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q16 implements Comparable {
    public final long x;
    public final byte[] y;

    public q16(long j, byte[] bArr) {
        this.x = j;
        this.y = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.x, ((q16) obj).x);
    }
}
