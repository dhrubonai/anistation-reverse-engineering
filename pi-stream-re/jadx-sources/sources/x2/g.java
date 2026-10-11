package x2;

import c1.r0;
import d2.q;
import f1.t;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f11108a;

    /* renamed from: b, reason: collision with root package name */
    public long f11109b;

    /* renamed from: c, reason: collision with root package name */
    public int f11110c;

    /* renamed from: d, reason: collision with root package name */
    public int f11111d;

    /* renamed from: e, reason: collision with root package name */
    public int f11112e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11113f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final t f11114g = new t(255);

    public final boolean a(q qVar, boolean z9) {
        boolean z10;
        boolean z11;
        this.f11108a = 0;
        this.f11109b = 0L;
        this.f11110c = 0;
        this.f11111d = 0;
        this.f11112e = 0;
        t tVar = this.f11114g;
        tVar.D(27);
        try {
            z10 = qVar.k(tVar.f3858a, 0, 27, z9);
        } catch (EOFException e10) {
            if (z9) {
                z10 = false;
            } else {
                throw e10;
            }
        }
        if (!z10 || tVar.w() != 1332176723) {
            return false;
        }
        if (tVar.v() != 0) {
            if (z9) {
                return false;
            }
            throw r0.c("unsupported bit stream revision");
        }
        this.f11108a = tVar.v();
        this.f11109b = tVar.j();
        tVar.l();
        tVar.l();
        tVar.l();
        int v9 = tVar.v();
        this.f11110c = v9;
        this.f11111d = v9 + 27;
        tVar.D(v9);
        try {
            z11 = qVar.k(tVar.f3858a, 0, this.f11110c, z9);
        } catch (EOFException e11) {
            if (z9) {
                z11 = false;
            } else {
                throw e11;
            }
        }
        if (!z11) {
            return false;
        }
        for (int i10 = 0; i10 < this.f11110c; i10++) {
            int v10 = tVar.v();
            this.f11113f[i10] = v10;
            this.f11112e += v10;
        }
        return true;
    }

    public final boolean b(q qVar, long j4) {
        boolean z9;
        boolean z10;
        if (qVar.q() == qVar.l()) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        t tVar = this.f11114g;
        tVar.D(4);
        while (true) {
            if (j4 != -1 && qVar.q() + 4 >= j4) {
                break;
            }
            try {
                z10 = qVar.k(tVar.f3858a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            tVar.G(0);
            if (tVar.w() == 1332176723) {
                qVar.g();
                return true;
            }
            qVar.h(1);
        }
        do {
            if (j4 != -1 && qVar.q() >= j4) {
                break;
            }
        } while (qVar.a(1) != -1);
        return false;
    }
}
