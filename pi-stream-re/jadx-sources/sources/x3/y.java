package x3;

/* loaded from: classes.dex */
public final class y implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11271a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11272b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f11273c;

    /* renamed from: d, reason: collision with root package name */
    public final x f11274d;

    /* renamed from: e, reason: collision with root package name */
    public final v3.i f11275e;

    /* renamed from: f, reason: collision with root package name */
    public int f11276f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11277x;

    public y(e0 e0Var, boolean z9, boolean z10, v3.i iVar, x xVar) {
        w7.b.q(e0Var);
        this.f11273c = e0Var;
        this.f11271a = z9;
        this.f11272b = z10;
        this.f11275e = iVar;
        w7.b.q(xVar);
        this.f11274d = xVar;
    }

    public final synchronized void a() {
        if (!this.f11277x) {
            this.f11276f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // x3.e0
    public final int b() {
        return this.f11273c.b();
    }

    public final void c() {
        boolean z9;
        synchronized (this) {
            int i10 = this.f11276f;
            if (i10 > 0) {
                z9 = true;
                int i11 = i10 - 1;
                this.f11276f = i11;
                if (i11 != 0) {
                    z9 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z9) {
            ((q) this.f11274d).f(this.f11275e, this);
        }
    }

    @Override // x3.e0
    public final Class d() {
        return this.f11273c.d();
    }

    @Override // x3.e0
    public final synchronized void e() {
        if (this.f11276f <= 0) {
            if (!this.f11277x) {
                this.f11277x = true;
                if (this.f11272b) {
                    this.f11273c.e();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // x3.e0
    public final Object get() {
        return this.f11273c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f11271a + ", listener=" + this.f11274d + ", key=" + this.f11275e + ", acquired=" + this.f11276f + ", isRecycled=" + this.f11277x + ", resource=" + this.f11273c + '}';
    }
}
