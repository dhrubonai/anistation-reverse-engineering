package m1;

import f1.b0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements a {

    /* renamed from: a, reason: collision with root package name */
    public final z1.p f7105a;

    /* renamed from: b, reason: collision with root package name */
    public final i.g f7106b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f7107c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7108d;

    /* renamed from: e, reason: collision with root package name */
    public final h1.h f7109e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7110f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7111g;

    /* renamed from: h, reason: collision with root package name */
    public final s f7112h;

    /* renamed from: i, reason: collision with root package name */
    public final n[] f7113i;

    /* renamed from: j, reason: collision with root package name */
    public y1.s f7114j;

    /* renamed from: k, reason: collision with root package name */
    public n1.c f7115k;

    /* renamed from: l, reason: collision with root package name */
    public int f7116l;

    /* renamed from: m, reason: collision with root package name */
    public v1.b f7117m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7118n;

    public p(c1.r rVar, z1.p pVar, n1.c cVar, i.g gVar, int i10, int[] iArr, y1.s sVar, int i11, h1.h hVar, long j4, int i12, boolean z9, ArrayList arrayList, s sVar2) {
        this.f7105a = pVar;
        this.f7115k = cVar;
        this.f7106b = gVar;
        this.f7107c = iArr;
        this.f7114j = sVar;
        this.f7108d = i11;
        this.f7109e = hVar;
        this.f7116l = i10;
        this.f7110f = j4;
        this.f7111g = i12;
        this.f7112h = sVar2;
        long e10 = cVar.e(i10);
        ArrayList b10 = b();
        this.f7113i = new n[sVar.length()];
        int i13 = 0;
        while (i13 < this.f7113i.length) {
            n1.m mVar = (n1.m) b10.get(sVar.f(i13));
            n1.b Q = gVar.Q(mVar.f7960b);
            n[] nVarArr = this.f7113i;
            if (Q == null) {
                Q = (n1.b) mVar.f7960b.get(0);
            }
            int i14 = i13;
            nVarArr[i14] = new n(e10, mVar, Q, rVar.d(i11, mVar.f7959a, z9, arrayList, sVar2), 0L, mVar.l());
            i13 = i14 + 1;
        }
    }

    public final long a(long j4) {
        n1.c cVar = this.f7115k;
        long j10 = cVar.f7908a;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j4 - b0.O(j10 + cVar.b(this.f7116l).f7943b);
    }

    public final ArrayList b() {
        List list = this.f7115k.b(this.f7116l).f7944c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f7107c) {
            arrayList.addAll(((n1.a) list.get(i10)).f7900c);
        }
        return arrayList;
    }

    public final n c(int i10) {
        n[] nVarArr = this.f7113i;
        n nVar = nVarArr[i10];
        n1.b Q = this.f7106b.Q(nVar.f7099b.f7960b);
        if (Q != null && !Q.equals(nVar.f7100c)) {
            n nVar2 = new n(nVar.f7102e, nVar.f7099b, Q, nVar.f7098a, nVar.f7103f, nVar.f7101d);
            nVarArr[i10] = nVar2;
            return nVar2;
        }
        return nVar;
    }
}
