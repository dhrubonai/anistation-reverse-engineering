package k9;

import r6.h0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6545a;

    /* renamed from: b, reason: collision with root package name */
    public int f6546b;

    /* renamed from: c, reason: collision with root package name */
    public int f6547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6548d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6549e;

    /* renamed from: f, reason: collision with root package name */
    public r f6550f;

    /* renamed from: g, reason: collision with root package name */
    public r f6551g;

    public r() {
        this.f6545a = new byte[8192];
        this.f6549e = true;
        this.f6548d = false;
    }

    public final r a() {
        r rVar = this.f6550f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f6551g;
        h0.q(rVar2);
        rVar2.f6550f = this.f6550f;
        r rVar3 = this.f6550f;
        h0.q(rVar3);
        rVar3.f6551g = this.f6551g;
        this.f6550f = null;
        this.f6551g = null;
        return rVar;
    }

    public final void b(r rVar) {
        rVar.f6551g = this;
        rVar.f6550f = this.f6550f;
        r rVar2 = this.f6550f;
        h0.q(rVar2);
        rVar2.f6551g = rVar;
        this.f6550f = rVar;
    }

    public final r c() {
        this.f6548d = true;
        return new r(this.f6545a, this.f6546b, this.f6547c, true);
    }

    public final void d(r rVar, int i10) {
        if (rVar.f6549e) {
            int i11 = rVar.f6547c;
            int i12 = i11 + i10;
            byte[] bArr = rVar.f6545a;
            if (i12 > 8192) {
                if (!rVar.f6548d) {
                    int i13 = rVar.f6546b;
                    if (i12 - i13 <= 8192) {
                        x6.i.h1(bArr, 0, bArr, i13, i11);
                        rVar.f6547c -= rVar.f6546b;
                        rVar.f6546b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i14 = rVar.f6547c;
            int i15 = this.f6546b;
            x6.i.h1(this.f6545a, i14, bArr, i15, i15 + i10);
            rVar.f6547c += i10;
            this.f6546b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public r(byte[] bArr, int i10, int i11, boolean z9) {
        h0.u(bArr, "data");
        this.f6545a = bArr;
        this.f6546b = i10;
        this.f6547c = i11;
        this.f6548d = z9;
        this.f6549e = false;
    }
}
