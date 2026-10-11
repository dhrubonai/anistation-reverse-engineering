package r6;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9508a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9509b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9510c;

    public p0(Object obj, Object obj2, Object obj3) {
        this.f9508a = obj;
        this.f9509b = obj2;
        this.f9510c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f9508a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f9509b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f9510c);
        return new IllegalArgumentException(sb.toString());
    }
}
