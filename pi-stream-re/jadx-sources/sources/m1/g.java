package m1;

import c1.c1;
import c1.e0;
import c1.e1;
import c1.k0;
import f1.b0;

/* loaded from: classes.dex */
public final class g extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f7062b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7063c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7064d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7065e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7066f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7067g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7068h;

    /* renamed from: i, reason: collision with root package name */
    public final n1.c f7069i;

    /* renamed from: j, reason: collision with root package name */
    public final k0 f7070j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f7071k;

    public g(long j4, long j10, long j11, int i10, long j12, long j13, long j14, n1.c cVar, k0 k0Var, e0 e0Var) {
        boolean z9;
        boolean z10 = cVar.f7911d;
        if (e0Var != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z10 == z9);
        this.f7062b = j4;
        this.f7063c = j10;
        this.f7064d = j11;
        this.f7065e = i10;
        this.f7066f = j12;
        this.f7067g = j13;
        this.f7068h = j14;
        this.f7069i = cVar;
        this.f7070j = k0Var;
        this.f7071k = e0Var;
    }

    @Override // c1.e1
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f7065e) < 0 || intValue >= i()) {
            return -1;
        }
        return intValue;
    }

    @Override // c1.e1
    public final c1 g(int i10, c1 c1Var, boolean z9) {
        String str;
        w7.b.m(i10, i());
        Integer num = null;
        n1.c cVar = this.f7069i;
        if (z9) {
            str = cVar.b(i10).f7942a;
        } else {
            str = null;
        }
        if (z9) {
            num = Integer.valueOf(this.f7065e + i10);
        }
        long e10 = cVar.e(i10);
        long O = b0.O(cVar.b(i10).f7943b - cVar.b(0).f7943b) - this.f7066f;
        c1Var.getClass();
        c1.b bVar = c1.b.f1626c;
        c1Var.f1641a = str;
        c1Var.f1642b = num;
        c1Var.f1643c = 0;
        c1Var.f1644d = e10;
        c1Var.f1645e = O;
        c1Var.f1647g = bVar;
        c1Var.f1646f = false;
        return c1Var;
    }

    @Override // c1.e1
    public final int i() {
        return this.f7069i.c();
    }

    @Override // c1.e1
    public final Object m(int i10) {
        w7.b.m(i10, i());
        return Integer.valueOf(this.f7065e + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    @Override // c1.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c1.d1 o(int r22, c1.d1 r23, long r24) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.g.o(int, c1.d1, long):c1.d1");
    }

    @Override // c1.e1
    public final int p() {
        return 1;
    }
}
