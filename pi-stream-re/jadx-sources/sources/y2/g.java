package y2;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f11548a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11549b;

    public g(long j4, byte[] bArr) {
        this.f11548a = j4;
        this.f11549b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f11548a, ((g) obj).f11548a);
    }
}
