package y8;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.appcompat.widget.w f11678a;

    /* renamed from: b, reason: collision with root package name */
    public x f11679b;

    /* renamed from: c, reason: collision with root package name */
    public int f11680c;

    /* renamed from: d, reason: collision with root package name */
    public String f11681d;

    /* renamed from: e, reason: collision with root package name */
    public n f11682e;

    /* renamed from: f, reason: collision with root package name */
    public h4.c f11683f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f11684g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f11685h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f11686i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f11687j;

    /* renamed from: k, reason: collision with root package name */
    public long f11688k;

    /* renamed from: l, reason: collision with root package name */
    public long f11689l;

    /* renamed from: m, reason: collision with root package name */
    public c9.e f11690m;

    public c0() {
        this.f11680c = -1;
        this.f11683f = new h4.c();
    }

    public static void b(String str, d0 d0Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (d0Var != null) {
            boolean z12 = true;
            if (d0Var.f11697x == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (d0Var.f11698y == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (d0Var.f11699z == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (d0Var.A != null) {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                        }
                        return;
                    }
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        }
    }

    public final d0 a() {
        boolean z9;
        int i10 = this.f11680c;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            androidx.appcompat.widget.w wVar = this.f11678a;
            if (wVar != null) {
                x xVar = this.f11679b;
                if (xVar != null) {
                    String str = this.f11681d;
                    if (str != null) {
                        return new d0(wVar, xVar, str, i10, this.f11682e, this.f11683f.b(), this.f11684g, this.f11685h, this.f11686i, this.f11687j, this.f11688k, this.f11689l, this.f11690m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(("code < 0: " + this.f11680c).toString());
    }

    public c0(d0 d0Var) {
        r6.h0.u(d0Var, "response");
        this.f11678a = d0Var.f11691a;
        this.f11679b = d0Var.f11692b;
        this.f11680c = d0Var.f11694d;
        this.f11681d = d0Var.f11693c;
        this.f11682e = d0Var.f11695e;
        this.f11683f = d0Var.f11696f.d();
        this.f11684g = d0Var.f11697x;
        this.f11685h = d0Var.f11698y;
        this.f11686i = d0Var.f11699z;
        this.f11687j = d0Var.A;
        this.f11688k = d0Var.B;
        this.f11689l = d0Var.C;
        this.f11690m = d0Var.D;
    }
}
