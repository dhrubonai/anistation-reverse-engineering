package v1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b1 implements z1.l {

    /* renamed from: a, reason: collision with root package name */
    public final long f10368a = n.f10478b.getAndIncrement();

    /* renamed from: b, reason: collision with root package name */
    public final h1.l f10369b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.d0 f10370c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f10371d;

    public b1(h1.h hVar, h1.l lVar) {
        this.f10369b = lVar;
        this.f10370c = new h1.d0(hVar);
    }

    @Override // z1.l
    public final void c() {
        h1.d0 d0Var = this.f10370c;
        d0Var.f4561b = 0L;
        try {
            d0Var.m(this.f10369b);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) d0Var.f4561b;
                byte[] bArr = this.f10371d;
                if (bArr == null) {
                    this.f10371d = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f10371d = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f10371d;
                i10 = d0Var.p(bArr2, i11, bArr2.length - i11);
            }
        } finally {
            w7.b.C(d0Var);
        }
    }

    @Override // z1.l
    public final void m() {
    }
}
