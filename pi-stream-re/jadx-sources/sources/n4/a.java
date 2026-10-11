package n4;

import z.g;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f8006a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8007b;

    /* renamed from: c, reason: collision with root package name */
    public g f8008c;

    public a(int i10, boolean z9) {
        this.f8006a = i10;
        this.f8007b = z9;
    }

    @Override // n4.e
    public final d q(v3.a aVar) {
        if (aVar == v3.a.MEMORY_CACHE) {
            return b.f8009a;
        }
        if (this.f8008c == null) {
            this.f8008c = new g(this.f8006a, this.f8007b);
        }
        return this.f8008c;
    }
}
