package h3;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final d2.g0 f4847a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4848b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4849c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4850d;

    /* renamed from: e, reason: collision with root package name */
    public int f4851e;

    /* renamed from: f, reason: collision with root package name */
    public int f4852f;

    /* renamed from: g, reason: collision with root package name */
    public long f4853g;

    /* renamed from: h, reason: collision with root package name */
    public long f4854h;

    public o(d2.g0 g0Var) {
        this.f4847a = g0Var;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        boolean z9;
        if (this.f4849c) {
            int i12 = this.f4852f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f4850d = z9;
                this.f4849c = false;
                return;
            }
            this.f4852f = (i11 - i10) + i12;
        }
    }
}
