package g3;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4371a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4372b;

    public f(int i10, b bVar) {
        this.f4371a = i10;
        this.f4372b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f4371a, ((f) obj).f4371a);
    }
}
