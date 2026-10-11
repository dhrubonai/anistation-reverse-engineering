package r;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final n f9284a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9285b = new ArrayList();

    public l(n nVar) {
        this.f9284a = null;
        this.f9284a = nVar;
    }

    public static long a(g gVar, long j4) {
        n nVar = gVar.f9273d;
        if (nVar instanceof j) {
            return j4;
        }
        ArrayList arrayList = gVar.f9280k;
        int size = arrayList.size();
        long j10 = j4;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f9273d != nVar) {
                    j10 = Math.min(j10, a(gVar2, gVar2.f9275f + j4));
                }
            }
        }
        if (gVar == nVar.f9296i) {
            long j11 = nVar.j();
            long j12 = j4 - j11;
            return Math.min(Math.min(j10, a(nVar.f9295h, j12)), j12 - r9.f9275f);
        }
        return j10;
    }

    public static long b(g gVar, long j4) {
        n nVar = gVar.f9273d;
        if (nVar instanceof j) {
            return j4;
        }
        ArrayList arrayList = gVar.f9280k;
        int size = arrayList.size();
        long j10 = j4;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f9273d != nVar) {
                    j10 = Math.max(j10, b(gVar2, gVar2.f9275f + j4));
                }
            }
        }
        if (gVar == nVar.f9295h) {
            long j11 = nVar.j();
            long j12 = j4 + j11;
            return Math.max(Math.max(j10, b(nVar.f9296i, j12)), j12 - r9.f9275f);
        }
        return j10;
    }
}
