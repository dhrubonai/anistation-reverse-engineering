package d2;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class o implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3189a = new byte[4096];

    @Override // d2.g0
    public final int a(c1.l lVar, int i10, boolean z9) {
        byte[] bArr = this.f3189a;
        int p3 = lVar.p(bArr, 0, Math.min(bArr.length, i10));
        if (p3 == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        return p3;
    }

    @Override // d2.g0
    public final void b(c1.v vVar) {
    }

    @Override // d2.g0
    public final int c(c1.l lVar, int i10, boolean z9) {
        return a(lVar, i10, z9);
    }

    @Override // d2.g0
    public final void d(long j4, int i10, int i11, int i12, f0 f0Var) {
    }

    @Override // d2.g0
    public final void e(int i10, int i11, f1.t tVar) {
        tVar.H(i10);
    }

    @Override // d2.g0
    public final void f(int i10, f1.t tVar) {
        e(i10, 0, tVar);
    }
}
