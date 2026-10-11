package x2;

import d2.q;
import f1.t;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f11103a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final t f11104b = new t(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f11105c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f11106d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11107e;

    public final boolean a(q qVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        int i12;
        if (qVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        boolean z13 = this.f11107e;
        t tVar = this.f11104b;
        if (z13) {
            this.f11107e = false;
            tVar.D(0);
        }
        while (!this.f11107e) {
            int i13 = this.f11105c;
            g gVar = this.f11103a;
            if (i13 < 0) {
                if (!gVar.b(qVar, -1L) || !gVar.a(qVar, true)) {
                    return false;
                }
                int i14 = gVar.f11111d;
                if ((gVar.f11108a & 1) == 1 && tVar.f3860c == 0) {
                    this.f11106d = 0;
                    int i15 = 0;
                    do {
                        int i16 = this.f11106d;
                        int i17 = 0 + i16;
                        if (i17 >= gVar.f11110c) {
                            break;
                        }
                        this.f11106d = i16 + 1;
                        i12 = gVar.f11113f[i17];
                        i15 += i12;
                    } while (i12 == 255);
                    i14 += i15;
                    i11 = this.f11106d + 0;
                } else {
                    i11 = 0;
                }
                try {
                    qVar.h(i14);
                    z12 = true;
                } catch (EOFException unused) {
                    z12 = false;
                }
                if (!z12) {
                    return false;
                }
                this.f11105c = i11;
            }
            int i18 = this.f11105c;
            this.f11106d = 0;
            int i19 = 0;
            do {
                int i20 = this.f11106d;
                int i21 = i18 + i20;
                if (i21 >= gVar.f11110c) {
                    break;
                }
                this.f11106d = i20 + 1;
                i10 = gVar.f11113f[i21];
                i19 += i10;
            } while (i10 == 255);
            int i22 = this.f11105c + this.f11106d;
            if (i19 > 0) {
                tVar.a(tVar.f3860c + i19);
                try {
                    qVar.readFully(tVar.f3858a, tVar.f3860c, i19);
                    z10 = true;
                } catch (EOFException unused2) {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                tVar.F(tVar.f3860c + i19);
                if (gVar.f11113f[i22 - 1] != 255) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f11107e = z11;
            }
            if (i22 == gVar.f11110c) {
                i22 = -1;
            }
            this.f11105c = i22;
        }
        return true;
    }
}
