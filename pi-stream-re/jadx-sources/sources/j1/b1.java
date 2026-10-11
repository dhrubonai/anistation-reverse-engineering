package j1;

import android.os.SystemClock;
import java.util.List;
import r6.n1;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: t, reason: collision with root package name */
    public static final v1.w f5635t = new v1.w(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final c1.e1 f5636a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.w f5637b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5638c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5639d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5640e;

    /* renamed from: f, reason: collision with root package name */
    public final m f5641f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5642g;

    /* renamed from: h, reason: collision with root package name */
    public final v1.g1 f5643h;

    /* renamed from: i, reason: collision with root package name */
    public final y1.w f5644i;

    /* renamed from: j, reason: collision with root package name */
    public final List f5645j;

    /* renamed from: k, reason: collision with root package name */
    public final v1.w f5646k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5647l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5648m;

    /* renamed from: n, reason: collision with root package name */
    public final c1.t0 f5649n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f5650p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f5651q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f5652r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f5653s;

    public b1(c1.e1 e1Var, v1.w wVar, long j4, long j10, int i10, m mVar, boolean z9, v1.g1 g1Var, y1.w wVar2, List list, v1.w wVar3, boolean z10, int i11, c1.t0 t0Var, long j11, long j12, long j13, long j14, boolean z11) {
        this.f5636a = e1Var;
        this.f5637b = wVar;
        this.f5638c = j4;
        this.f5639d = j10;
        this.f5640e = i10;
        this.f5641f = mVar;
        this.f5642g = z9;
        this.f5643h = g1Var;
        this.f5644i = wVar2;
        this.f5645j = list;
        this.f5646k = wVar3;
        this.f5647l = z10;
        this.f5648m = i11;
        this.f5649n = t0Var;
        this.f5650p = j11;
        this.f5651q = j12;
        this.f5652r = j13;
        this.f5653s = j14;
        this.o = z11;
    }

    public static b1 i(y1.w wVar) {
        c1.b1 b1Var = c1.e1.f1676a;
        v1.w wVar2 = f5635t;
        return new b1(b1Var, wVar2, -9223372036854775807L, 0L, 1, null, false, v1.g1.f10431d, wVar, n1.f9497e, wVar2, false, 0, c1.t0.f1893d, 0L, 0L, 0L, 0L, false);
    }

    public final b1 a() {
        return new b1(this.f5636a, this.f5637b, this.f5638c, this.f5639d, this.f5640e, this.f5641f, this.f5642g, this.f5643h, this.f5644i, this.f5645j, this.f5646k, this.f5647l, this.f5648m, this.f5649n, this.f5650p, this.f5651q, j(), SystemClock.elapsedRealtime(), this.o);
    }

    public final b1 b(v1.w wVar) {
        return new b1(this.f5636a, this.f5637b, this.f5638c, this.f5639d, this.f5640e, this.f5641f, this.f5642g, this.f5643h, this.f5644i, this.f5645j, wVar, this.f5647l, this.f5648m, this.f5649n, this.f5650p, this.f5651q, this.f5652r, this.f5653s, this.o);
    }

    public final b1 c(v1.w wVar, long j4, long j10, long j11, long j12, v1.g1 g1Var, y1.w wVar2, List list) {
        return new b1(this.f5636a, wVar, j10, j11, this.f5640e, this.f5641f, this.f5642g, g1Var, wVar2, list, this.f5646k, this.f5647l, this.f5648m, this.f5649n, this.f5650p, j12, j4, SystemClock.elapsedRealtime(), this.o);
    }

    public final b1 d(int i10, boolean z9) {
        return new b1(this.f5636a, this.f5637b, this.f5638c, this.f5639d, this.f5640e, this.f5641f, this.f5642g, this.f5643h, this.f5644i, this.f5645j, this.f5646k, z9, i10, this.f5649n, this.f5650p, this.f5651q, this.f5652r, this.f5653s, this.o);
    }

    public final b1 e(m mVar) {
        return new b1(this.f5636a, this.f5637b, this.f5638c, this.f5639d, this.f5640e, mVar, this.f5642g, this.f5643h, this.f5644i, this.f5645j, this.f5646k, this.f5647l, this.f5648m, this.f5649n, this.f5650p, this.f5651q, this.f5652r, this.f5653s, this.o);
    }

    public final b1 f(c1.t0 t0Var) {
        return new b1(this.f5636a, this.f5637b, this.f5638c, this.f5639d, this.f5640e, this.f5641f, this.f5642g, this.f5643h, this.f5644i, this.f5645j, this.f5646k, this.f5647l, this.f5648m, t0Var, this.f5650p, this.f5651q, this.f5652r, this.f5653s, this.o);
    }

    public final b1 g(int i10) {
        return new b1(this.f5636a, this.f5637b, this.f5638c, this.f5639d, i10, this.f5641f, this.f5642g, this.f5643h, this.f5644i, this.f5645j, this.f5646k, this.f5647l, this.f5648m, this.f5649n, this.f5650p, this.f5651q, this.f5652r, this.f5653s, this.o);
    }

    public final b1 h(c1.e1 e1Var) {
        return new b1(e1Var, this.f5637b, this.f5638c, this.f5639d, this.f5640e, this.f5641f, this.f5642g, this.f5643h, this.f5644i, this.f5645j, this.f5646k, this.f5647l, this.f5648m, this.f5649n, this.f5650p, this.f5651q, this.f5652r, this.f5653s, this.o);
    }

    public final long j() {
        long j4;
        long j10;
        if (!k()) {
            return this.f5652r;
        }
        do {
            j4 = this.f5653s;
            j10 = this.f5652r;
        } while (j4 != this.f5653s);
        return f1.b0.O(f1.b0.c0(j10) + (((float) (SystemClock.elapsedRealtime() - j4)) * this.f5649n.f1894a));
    }

    public final boolean k() {
        if (this.f5640e == 3 && this.f5647l && this.f5648m == 0) {
            return true;
        }
        return false;
    }
}
