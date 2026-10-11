package p1;

import java.util.List;

/* loaded from: classes.dex */
public final class g extends w1.b {

    /* renamed from: d, reason: collision with root package name */
    public final List f8433d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8434e;

    public g(long j4, List list) {
        super(0L, list.size() - 1);
        this.f8434e = j4;
        this.f8433d = list;
    }

    @Override // w1.p
    public final long a() {
        b();
        q1.g gVar = (q1.g) this.f8433d.get((int) this.f10748c);
        return this.f8434e + gVar.f8998e + gVar.f8996c;
    }

    @Override // w1.p
    public final long k() {
        b();
        return this.f8434e + ((q1.g) this.f8433d.get((int) this.f10748c)).f8998e;
    }
}
