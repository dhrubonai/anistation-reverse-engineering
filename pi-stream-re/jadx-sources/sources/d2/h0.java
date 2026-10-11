package d2;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3145a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f3146b;

    /* renamed from: c, reason: collision with root package name */
    public int f3147c;

    /* renamed from: d, reason: collision with root package name */
    public long f3148d;

    /* renamed from: e, reason: collision with root package name */
    public int f3149e;

    /* renamed from: f, reason: collision with root package name */
    public int f3150f;

    /* renamed from: g, reason: collision with root package name */
    public int f3151g;

    public final void a(g0 g0Var, f0 f0Var) {
        if (this.f3147c > 0) {
            g0Var.d(this.f3148d, this.f3149e, this.f3150f, this.f3151g, f0Var);
            this.f3147c = 0;
        }
    }

    public final void b(g0 g0Var, long j4, int i10, int i11, int i12, f0 f0Var) {
        boolean z9;
        if (this.f3151g <= i11 + i12) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.t("TrueHD chunk samples must be contiguous in the sample queue.", z9);
        if (!this.f3146b) {
            return;
        }
        int i13 = this.f3147c;
        int i14 = i13 + 1;
        this.f3147c = i14;
        if (i13 == 0) {
            this.f3148d = j4;
            this.f3149e = i10;
            this.f3150f = 0;
        }
        this.f3150f += i11;
        this.f3151g = i12;
        if (i14 >= 16) {
            a(g0Var, f0Var);
        }
    }

    public final void c(q qVar) {
        char c6;
        if (this.f3146b) {
            return;
        }
        byte[] bArr = this.f3145a;
        int i10 = 0;
        qVar.n(bArr, 0, 10);
        qVar.g();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    i10 = 1;
                }
                if (i10 != 0) {
                    c6 = '\t';
                } else {
                    c6 = '\b';
                }
                i10 = 40 << ((bArr[c6] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f3146b = true;
    }
}
