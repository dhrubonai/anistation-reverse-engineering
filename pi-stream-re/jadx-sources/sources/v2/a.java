package v2;

import d2.k;

/* loaded from: classes.dex */
public final class a extends k implements f {

    /* renamed from: h, reason: collision with root package name */
    public final int f10590h;

    public a(long j4, long j10, d2.b bVar, boolean z9) {
        super(bVar.f3098f, bVar.f3095c, j4, j10, z9);
        this.f10590h = bVar.f3098f;
    }

    @Override // v2.f
    public final long b(long j4) {
        return ((Math.max(0L, j4 - this.f3171b) * 8) * 1000000) / this.f3174e;
    }

    @Override // v2.f
    public final long d() {
        return -1L;
    }

    @Override // v2.f
    public final int k() {
        return this.f10590h;
    }
}
