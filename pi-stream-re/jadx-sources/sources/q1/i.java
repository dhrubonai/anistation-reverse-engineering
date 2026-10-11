package q1;

import java.util.List;
import java.util.Map;
import r6.h0;
import r6.o0;
import r6.r0;

/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: d, reason: collision with root package name */
    public final int f9008d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9009e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9010f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9011g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9012h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9013i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9014j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9015k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9016l;

    /* renamed from: m, reason: collision with root package name */
    public final long f9017m;

    /* renamed from: n, reason: collision with root package name */
    public final long f9018n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9019p;

    /* renamed from: q, reason: collision with root package name */
    public final c1.p f9020q;

    /* renamed from: r, reason: collision with root package name */
    public final o0 f9021r;

    /* renamed from: s, reason: collision with root package name */
    public final o0 f9022s;

    /* renamed from: t, reason: collision with root package name */
    public final r0 f9023t;

    /* renamed from: u, reason: collision with root package name */
    public final long f9024u;

    /* renamed from: v, reason: collision with root package name */
    public final h f9025v;

    public i(int i10, String str, List list, long j4, boolean z9, long j10, boolean z10, int i11, long j11, int i12, long j12, long j13, boolean z11, boolean z12, boolean z13, c1.p pVar, List list2, List list3, h hVar, Map map) {
        super(str, list, z11);
        this.f9008d = i10;
        this.f9012h = j10;
        this.f9011g = z9;
        this.f9013i = z10;
        this.f9014j = i11;
        this.f9015k = j11;
        this.f9016l = i12;
        this.f9017m = j12;
        this.f9018n = j13;
        this.o = z12;
        this.f9019p = z13;
        this.f9020q = pVar;
        this.f9021r = o0.j(list2);
        this.f9022s = o0.j(list3);
        this.f9023t = r0.b(map);
        if (!list3.isEmpty()) {
            d dVar = (d) h0.X(list3);
            this.f9024u = dVar.f8998e + dVar.f8996c;
        } else if (!list2.isEmpty()) {
            f fVar = (f) h0.X(list2);
            this.f9024u = fVar.f8998e + fVar.f8996c;
        } else {
            this.f9024u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j4 != -9223372036854775807L) {
            if (j4 >= 0) {
                j14 = Math.min(this.f9024u, j4);
            } else {
                j14 = Math.max(0L, this.f9024u + j4);
            }
        }
        this.f9009e = j14;
        this.f9010f = j4 >= 0;
        this.f9025v = hVar;
    }

    @Override // u1.a
    public final Object a(List list) {
        return this;
    }
}
