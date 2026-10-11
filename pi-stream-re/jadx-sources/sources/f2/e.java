package f2;

import d2.a0;
import d2.c0;
import d2.g0;
import f1.b0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f3894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3896c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3897d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3898e;

    /* renamed from: f, reason: collision with root package name */
    public int f3899f;

    /* renamed from: g, reason: collision with root package name */
    public int f3900g;

    /* renamed from: h, reason: collision with root package name */
    public int f3901h;

    /* renamed from: i, reason: collision with root package name */
    public int f3902i;

    /* renamed from: j, reason: collision with root package name */
    public int f3903j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f3904k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f3905l;

    public e(int i10, int i11, long j4, int i12, g0 g0Var) {
        int i13;
        int i14;
        boolean z9 = true;
        if (i11 != 1 && i11 != 2) {
            z9 = false;
        }
        w7.b.g(z9);
        this.f3897d = j4;
        this.f3898e = i12;
        this.f3894a = g0Var;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        int i15 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f3895b = i13 | i15;
        if (i11 == 2) {
            i14 = i15 | 1650720768;
        } else {
            i14 = -1;
        }
        this.f3896c = i14;
        this.f3904k = new long[512];
        this.f3905l = new int[512];
    }

    public final c0 a(int i10) {
        return new c0(((this.f3897d * 1) / this.f3898e) * this.f3905l[i10], this.f3904k[i10]);
    }

    public final a0 b(long j4) {
        int i10 = (int) (j4 / ((this.f3897d * 1) / this.f3898e));
        int e10 = b0.e(this.f3905l, i10, true, true);
        if (this.f3905l[e10] == i10) {
            c0 a10 = a(e10);
            return new a0(a10, a10);
        }
        c0 a11 = a(e10);
        int i11 = e10 + 1;
        if (i11 < this.f3904k.length) {
            return new a0(a11, a(i11));
        }
        return new a0(a11, a11);
    }
}
