package i2;

import c1.u;
import c1.v;
import d2.g0;
import e0.j;
import f1.t;
import g1.g;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: b, reason: collision with root package name */
    public final t f5304b;

    /* renamed from: c, reason: collision with root package name */
    public final t f5305c;

    /* renamed from: d, reason: collision with root package name */
    public int f5306d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5307e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5308f;

    /* renamed from: x, reason: collision with root package name */
    public int f5309x;

    public e(g0 g0Var) {
        super(g0Var);
        this.f5304b = new t(g.f4335a);
        this.f5305c = new t(4);
    }

    public final boolean n(t tVar) {
        int v9 = tVar.v();
        int i10 = (v9 >> 4) & 15;
        int i11 = v9 & 15;
        if (i11 == 7) {
            this.f5309x = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new d(a3.g.n("Video format not supported: ", i11));
    }

    public final boolean o(long j4, t tVar) {
        int i10;
        int v9 = tVar.v();
        byte[] bArr = tVar.f3858a;
        int i11 = tVar.f3859b;
        int i12 = i11 + 1;
        int i13 = (((bArr[i11] & 255) << 24) >> 8) | ((bArr[i12] & 255) << 8);
        tVar.f3859b = i12 + 1 + 1;
        long j10 = (((bArr[r4] & 255) | i13) * 1000) + j4;
        Object obj = this.f3315a;
        if (v9 == 0 && !this.f5307e) {
            t tVar2 = new t(new byte[tVar.f3860c - tVar.f3859b]);
            tVar.d(tVar2.f3858a, 0, tVar.f3860c - tVar.f3859b);
            d2.c a10 = d2.c.a(tVar2);
            this.f5306d = a10.f3101b;
            u k10 = a3.g.k("video/avc");
            k10.f1905i = a10.f3110k;
            k10.f1912q = a10.f3102c;
            k10.f1913r = a10.f3103d;
            k10.f1916u = a10.f3109j;
            k10.f1910n = a10.f3100a;
            ((g0) obj).b(new v(k10));
            this.f5307e = true;
            return false;
        }
        if (v9 != 1 || !this.f5307e) {
            return false;
        }
        if (this.f5309x == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (!this.f5308f && i10 == 0) {
            return false;
        }
        t tVar3 = this.f5305c;
        byte[] bArr2 = tVar3.f3858a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i14 = 4 - this.f5306d;
        int i15 = 0;
        while (tVar.f3860c - tVar.f3859b > 0) {
            tVar.d(tVar3.f3858a, i14, this.f5306d);
            tVar3.G(0);
            int y9 = tVar3.y();
            t tVar4 = this.f5304b;
            tVar4.G(0);
            g0 g0Var = (g0) obj;
            g0Var.f(4, tVar4);
            g0Var.f(y9, tVar);
            i15 = i15 + 4 + y9;
        }
        ((g0) obj).d(j10, i10, i15, 0, null);
        this.f5308f = true;
        return true;
    }
}
