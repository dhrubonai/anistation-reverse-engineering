package h3;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4807b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4808c;

    /* renamed from: d, reason: collision with root package name */
    public int f4809d;

    /* renamed from: e, reason: collision with root package name */
    public String f4810e;

    public i0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f4809d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f4807b;
        } else {
            i10 = i11 + this.f4808c;
        }
        this.f4809d = i10;
        this.f4810e = this.f4806a + this.f4809d;
    }

    public final void b() {
        if (this.f4809d != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public i0(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.f4806a = str;
        this.f4807b = i11;
        this.f4808c = i12;
        this.f4809d = Integer.MIN_VALUE;
        this.f4810e = "";
    }
}
