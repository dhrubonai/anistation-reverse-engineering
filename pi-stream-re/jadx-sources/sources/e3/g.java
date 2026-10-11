package e3;

import android.text.Layout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f3442a;

    /* renamed from: b, reason: collision with root package name */
    public int f3443b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3444c;

    /* renamed from: d, reason: collision with root package name */
    public int f3445d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3446e;

    /* renamed from: k, reason: collision with root package name */
    public float f3452k;

    /* renamed from: l, reason: collision with root package name */
    public String f3453l;
    public Layout.Alignment o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f3456p;

    /* renamed from: r, reason: collision with root package name */
    public b f3458r;

    /* renamed from: f, reason: collision with root package name */
    public int f3447f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f3448g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f3449h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f3450i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f3451j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f3454m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f3455n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f3457q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f3459s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f3444c && gVar.f3444c) {
                this.f3443b = gVar.f3443b;
                this.f3444c = true;
            }
            if (this.f3449h == -1) {
                this.f3449h = gVar.f3449h;
            }
            if (this.f3450i == -1) {
                this.f3450i = gVar.f3450i;
            }
            if (this.f3442a == null && (str = gVar.f3442a) != null) {
                this.f3442a = str;
            }
            if (this.f3447f == -1) {
                this.f3447f = gVar.f3447f;
            }
            if (this.f3448g == -1) {
                this.f3448g = gVar.f3448g;
            }
            if (this.f3455n == -1) {
                this.f3455n = gVar.f3455n;
            }
            if (this.o == null && (alignment2 = gVar.o) != null) {
                this.o = alignment2;
            }
            if (this.f3456p == null && (alignment = gVar.f3456p) != null) {
                this.f3456p = alignment;
            }
            if (this.f3457q == -1) {
                this.f3457q = gVar.f3457q;
            }
            if (this.f3451j == -1) {
                this.f3451j = gVar.f3451j;
                this.f3452k = gVar.f3452k;
            }
            if (this.f3458r == null) {
                this.f3458r = gVar.f3458r;
            }
            if (this.f3459s == Float.MAX_VALUE) {
                this.f3459s = gVar.f3459s;
            }
            if (!this.f3446e && gVar.f3446e) {
                this.f3445d = gVar.f3445d;
                this.f3446e = true;
            }
            if (this.f3454m == -1 && (i10 = gVar.f3454m) != -1) {
                this.f3454m = i10;
            }
        }
    }
}
