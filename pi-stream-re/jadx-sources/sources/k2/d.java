package k2;

import d2.q;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final q f6429a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6430b;

    public d(q qVar, long j4) {
        boolean z9;
        this.f6429a = qVar;
        if (qVar.q() >= j4) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        this.f6430b = j4;
    }

    @Override // d2.q
    public final int a(int i10) {
        return this.f6429a.a(i10);
    }

    @Override // d2.q
    public final boolean b(byte[] bArr, int i10, int i11, boolean z9) {
        return this.f6429a.b(bArr, i10, i11, z9);
    }

    @Override // d2.q
    public final long c() {
        return this.f6429a.c() - this.f6430b;
    }

    @Override // d2.q
    public final int d(byte[] bArr, int i10, int i11) {
        return this.f6429a.d(bArr, i10, i11);
    }

    @Override // d2.q
    public final void g() {
        this.f6429a.g();
    }

    @Override // d2.q
    public final void h(int i10) {
        this.f6429a.h(i10);
    }

    @Override // d2.q
    public final boolean i(int i10, boolean z9) {
        return this.f6429a.i(i10, z9);
    }

    @Override // d2.q
    public final boolean k(byte[] bArr, int i10, int i11, boolean z9) {
        return this.f6429a.k(bArr, i10, i11, z9);
    }

    @Override // d2.q
    public final long l() {
        return this.f6429a.l() - this.f6430b;
    }

    @Override // d2.q
    public final void n(byte[] bArr, int i10, int i11) {
        this.f6429a.n(bArr, i10, i11);
    }

    @Override // d2.q
    public final void o(int i10) {
        this.f6429a.o(i10);
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        return this.f6429a.p(bArr, i10, i11);
    }

    @Override // d2.q
    public final long q() {
        return this.f6429a.q() - this.f6430b;
    }

    @Override // d2.q
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f6429a.readFully(bArr, i10, i11);
    }
}
