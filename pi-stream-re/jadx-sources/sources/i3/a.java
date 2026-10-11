package i3;

import a3.g;
import c1.r0;
import c1.u;
import c1.v;
import d2.g0;
import d2.r;
import f1.b0;
import f1.t;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5310m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f5311n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final r f5312a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f5313b;

    /* renamed from: c, reason: collision with root package name */
    public final d2.b f5314c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5315d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5316e;

    /* renamed from: f, reason: collision with root package name */
    public final t f5317f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5318g;

    /* renamed from: h, reason: collision with root package name */
    public final v f5319h;

    /* renamed from: i, reason: collision with root package name */
    public int f5320i;

    /* renamed from: j, reason: collision with root package name */
    public long f5321j;

    /* renamed from: k, reason: collision with root package name */
    public int f5322k;

    /* renamed from: l, reason: collision with root package name */
    public long f5323l;

    public a(r rVar, g0 g0Var, d2.b bVar) {
        this.f5312a = rVar;
        this.f5313b = g0Var;
        this.f5314c = bVar;
        int max = Math.max(1, bVar.f3096d / 10);
        this.f5318g = max;
        t tVar = new t((byte[]) bVar.f3094b);
        tVar.n();
        int n9 = tVar.n();
        this.f5315d = n9;
        int i10 = bVar.f3095c;
        int i11 = bVar.f3098f;
        int i12 = (((i11 - (i10 * 4)) * 8) / (bVar.f3099g * i10)) + 1;
        if (n9 == i12) {
            int i13 = b0.f3799a;
            int i14 = ((max + n9) - 1) / n9;
            this.f5316e = new byte[i11 * i14];
            this.f5317f = new t(n9 * 2 * i10 * i14);
            int i15 = ((bVar.f3096d * bVar.f3098f) * 8) / n9;
            u k10 = g.k("audio/raw");
            k10.f1903g = i15;
            k10.f1904h = i15;
            k10.f1909m = max * 2 * i10;
            k10.f1920y = bVar.f3095c;
            k10.f1921z = bVar.f3096d;
            k10.A = 2;
            this.f5319h = new v(k10);
            return;
        }
        throw r0.a("Expected frames per block: " + i12 + "; got: " + n9, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0049 -> B:4:0x004b). Please report as a decompilation issue!!! */
    @Override // i3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(d2.q r23, long r24) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.a(d2.q, long):boolean");
    }

    @Override // i3.b
    public final void b(int i10, long j4) {
        this.f5312a.s(new e(this.f5314c, this.f5315d, i10, j4));
        this.f5313b.b(this.f5319h);
    }

    @Override // i3.b
    public final void c(long j4) {
        this.f5320i = 0;
        this.f5321j = j4;
        this.f5322k = 0;
        this.f5323l = 0L;
    }

    public final void d(int i10) {
        long j4 = this.f5321j;
        long j10 = this.f5323l;
        d2.b bVar = this.f5314c;
        long V = j4 + b0.V(j10, 1000000L, bVar.f3096d);
        int i11 = i10 * 2 * bVar.f3095c;
        this.f5313b.d(V, 1, i11, this.f5322k - i11, null);
        this.f5323l += i10;
        this.f5322k -= i11;
    }
}
