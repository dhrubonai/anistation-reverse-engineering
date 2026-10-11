package v1;

/* loaded from: classes.dex */
public final class p extends l {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f10499e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f10500c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10501d;

    public p(c1.e1 e1Var, Object obj, Object obj2) {
        super(e1Var);
        this.f10500c = obj;
        this.f10501d = obj2;
    }

    @Override // v1.l, c1.e1
    public final int b(Object obj) {
        Object obj2;
        if (f10499e.equals(obj) && (obj2 = this.f10501d) != null) {
            obj = obj2;
        }
        return this.f10453b.b(obj);
    }

    @Override // v1.l, c1.e1
    public final c1.c1 g(int i10, c1.c1 c1Var, boolean z9) {
        this.f10453b.g(i10, c1Var, z9);
        if (f1.b0.a(c1Var.f1642b, this.f10501d) && z9) {
            c1Var.f1642b = f10499e;
        }
        return c1Var;
    }

    @Override // v1.l, c1.e1
    public final Object m(int i10) {
        Object m5 = this.f10453b.m(i10);
        if (f1.b0.a(m5, this.f10501d)) {
            return f10499e;
        }
        return m5;
    }

    @Override // v1.l, c1.e1
    public final c1.d1 o(int i10, c1.d1 d1Var, long j4) {
        this.f10453b.o(i10, d1Var, j4);
        if (f1.b0.a(d1Var.f1655a, this.f10500c)) {
            d1Var.f1655a = c1.d1.f1653r;
        }
        return d1Var;
    }
}
