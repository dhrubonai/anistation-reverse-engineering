package m3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f7343e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final u.f f7344f = new u.f(1);

    /* renamed from: b, reason: collision with root package name */
    public long f7346b;

    /* renamed from: c, reason: collision with root package name */
    public long f7347c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7345a = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7348d = new ArrayList();

    public static a1 c(RecyclerView recyclerView, int i10, long j4) {
        boolean z9;
        int h10 = recyclerView.f1238f.h();
        int i11 = 0;
        while (true) {
            if (i11 < h10) {
                a1 L = RecyclerView.L(recyclerView.f1238f.g(i11));
                if (L.f7155c == i10 && !L.h()) {
                    z9 = true;
                    break;
                }
                i11++;
            } else {
                z9 = false;
                break;
            }
        }
        if (z9) {
            return null;
        }
        a3.h hVar = recyclerView.f1232c;
        try {
            recyclerView.R();
            a1 l10 = hVar.l(i10, j4);
            if (l10 != null) {
                if (l10.g() && !l10.h()) {
                    hVar.i(l10.f7153a);
                } else {
                    hVar.a(l10, false);
                }
            }
            return l10;
        } finally {
            recyclerView.S(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.Q0 && !this.f7345a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f7346b == 0) {
                this.f7346b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        n.g gVar = recyclerView.f1256w0;
        gVar.f7873a = i10;
        gVar.f7874b = i11;
    }

    public final void b(long j4) {
        p pVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        p pVar2;
        boolean z9;
        ArrayList arrayList = this.f7345a;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                n.g gVar = recyclerView3.f1256w0;
                gVar.c(recyclerView3, false);
                i10 += gVar.f7876d;
            }
        }
        ArrayList arrayList2 = this.f7348d;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                n.g gVar2 = recyclerView4.f1256w0;
                int abs = Math.abs(gVar2.f7874b) + Math.abs(gVar2.f7873a);
                for (int i14 = 0; i14 < gVar2.f7876d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        pVar2 = new p();
                        arrayList2.add(pVar2);
                    } else {
                        pVar2 = (p) arrayList2.get(i12);
                    }
                    int[] iArr = gVar2.f7875c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    pVar2.f7334a = z9;
                    pVar2.f7335b = abs;
                    pVar2.f7336c = i15;
                    pVar2.f7337d = recyclerView4;
                    pVar2.f7338e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f7344f);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (pVar = (p) arrayList2.get(i16)).f7337d) != null; i16++) {
            if (pVar.f7334a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j4;
            }
            a1 c6 = c(recyclerView, pVar.f7338e, j10);
            if (c6 != null && c6.f7154b != null && c6.g() && !c6.h() && (recyclerView2 = (RecyclerView) c6.f7154b.get()) != null) {
                if (recyclerView2.T && recyclerView2.f1238f.h() != 0) {
                    h0 h0Var = recyclerView2.f1239f0;
                    if (h0Var != null) {
                        h0Var.e();
                    }
                    k0 k0Var = recyclerView2.E;
                    a3.h hVar = recyclerView2.f1232c;
                    if (k0Var != null) {
                        k0Var.f0(hVar);
                        recyclerView2.E.g0(hVar);
                    }
                    ((ArrayList) hVar.f66c).clear();
                    hVar.g();
                }
                n.g gVar3 = recyclerView2.f1256w0;
                gVar3.c(recyclerView2, true);
                if (gVar3.f7876d != 0) {
                    try {
                        int i17 = c0.n.f1613a;
                        c0.m.a("RV Nested Prefetch");
                        w0 w0Var = recyclerView2.f1258x0;
                        d0 d0Var = recyclerView2.D;
                        w0Var.f7409d = 1;
                        w0Var.f7410e = d0Var.a();
                        w0Var.f7412g = false;
                        w0Var.f7413h = false;
                        w0Var.f7414i = false;
                        for (int i18 = 0; i18 < gVar3.f7876d * 2; i18 += 2) {
                            c(recyclerView2, gVar3.f7875c[i18], j4);
                        }
                        c0.m.b();
                        pVar.f7334a = false;
                        pVar.f7335b = 0;
                        pVar.f7336c = 0;
                        pVar.f7337d = null;
                        pVar.f7338e = 0;
                    } catch (Throwable th) {
                        int i19 = c0.n.f1613a;
                        c0.m.b();
                        throw th;
                    }
                }
            }
            pVar.f7334a = false;
            pVar.f7335b = 0;
            pVar.f7336c = 0;
            pVar.f7337d = null;
            pVar.f7338e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = c0.n.f1613a;
            c0.m.a("RV Prefetch");
            ArrayList arrayList = this.f7345a;
            if (arrayList.isEmpty()) {
                this.f7346b = 0L;
                c0.m.b();
                return;
            }
            int size = arrayList.size();
            long j4 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j4 = Math.max(recyclerView.getDrawingTime(), j4);
                }
            }
            if (j4 == 0) {
                this.f7346b = 0L;
                c0.m.b();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j4) + this.f7347c);
                this.f7346b = 0L;
                c0.m.b();
            }
        } catch (Throwable th) {
            this.f7346b = 0L;
            int i12 = c0.n.f1613a;
            c0.m.b();
            throw th;
        }
    }
}
