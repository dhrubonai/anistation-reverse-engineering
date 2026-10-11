package v1;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class m implements h1.h {

    /* renamed from: a, reason: collision with root package name */
    public final h1.h f10458a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10459b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f10460c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10461d;

    /* renamed from: e, reason: collision with root package name */
    public int f10462e;

    public m(h1.d0 d0Var, int i10, i0 i0Var) {
        boolean z9;
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        this.f10458a = d0Var;
        this.f10459b = i10;
        this.f10460c = i0Var;
        this.f10461d = new byte[1];
        this.f10462e = i10;
    }

    @Override // h1.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // h1.h
    public final Map e() {
        return this.f10458a.e();
    }

    @Override // h1.h
    public final void f(h1.e0 e0Var) {
        e0Var.getClass();
        this.f10458a.f(e0Var);
    }

    @Override // h1.h
    public final Uri j() {
        return this.f10458a.j();
    }

    @Override // h1.h
    public final long m(h1.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.f10462e;
        h1.h hVar = this.f10458a;
        if (i12 == 0) {
            byte[] bArr2 = this.f10461d;
            boolean z9 = false;
            if (hVar.p(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    int i15 = 0;
                    while (i14 > 0) {
                        int p3 = hVar.p(bArr3, i15, i14);
                        if (p3 == -1) {
                            break;
                        }
                        i15 += p3;
                        i14 -= p3;
                    }
                    while (i13 > 0) {
                        int i16 = i13 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i13 = i16;
                    }
                    if (i13 > 0) {
                        f1.t tVar = new f1.t(bArr3, i13);
                        i0 i0Var = this.f10460c;
                        if (!i0Var.D) {
                            max = i0Var.A;
                        } else {
                            max = Math.max(i0Var.E.x(true), i0Var.A);
                        }
                        int i17 = tVar.f3860c - tVar.f3859b;
                        u0 u0Var = i0Var.C;
                        u0Var.getClass();
                        u0Var.e(i17, 0, tVar);
                        u0Var.d(max, 1, i17, 0, null);
                        i0Var.D = true;
                    }
                }
                z9 = true;
            }
            if (!z9) {
                return -1;
            }
            this.f10462e = this.f10459b;
        }
        int p9 = hVar.p(bArr, i10, Math.min(this.f10462e, i11));
        if (p9 != -1) {
            this.f10462e -= p9;
        }
        return p9;
    }
}
