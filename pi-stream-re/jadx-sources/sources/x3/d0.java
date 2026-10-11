package x3;

/* loaded from: classes.dex */
public final class d0 implements e0, q4.b {

    /* renamed from: e, reason: collision with root package name */
    public static final f.c f11157e = q6.g.o0(20, new w1.o(21));

    /* renamed from: a, reason: collision with root package name */
    public final q4.d f11158a = new q4.d();

    /* renamed from: b, reason: collision with root package name */
    public e0 f11159b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11160c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11161d;

    public final synchronized void a() {
        this.f11158a.a();
        if (this.f11160c) {
            this.f11160c = false;
            if (this.f11161d) {
                e();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // x3.e0
    public final int b() {
        return this.f11159b.b();
    }

    @Override // q4.b
    public final q4.d c() {
        return this.f11158a;
    }

    @Override // x3.e0
    public final Class d() {
        return this.f11159b.d();
    }

    @Override // x3.e0
    public final synchronized void e() {
        this.f11158a.a();
        this.f11161d = true;
        if (!this.f11160c) {
            this.f11159b.e();
            this.f11159b = null;
            f11157e.b(this);
        }
    }

    @Override // x3.e0
    public final Object get() {
        return this.f11159b.get();
    }
}
