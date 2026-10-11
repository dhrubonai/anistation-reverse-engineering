package m3;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7178b;

    public /* synthetic */ b0(RecyclerView recyclerView, int i10) {
        this.f7177a = i10;
        this.f7178b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        long j4;
        int i10 = this.f7177a;
        RecyclerView recyclerView = this.f7178b;
        switch (i10) {
            case 0:
                if (recyclerView.L && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.J) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.O) {
                        recyclerView.N = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                h0 h0Var = recyclerView.f1239f0;
                if (h0Var != null) {
                    j jVar = (j) h0Var;
                    ArrayList arrayList = jVar.f7256h;
                    boolean z10 = !arrayList.isEmpty();
                    ArrayList arrayList2 = jVar.f7258j;
                    boolean z11 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = jVar.f7259k;
                    boolean z12 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = jVar.f7257i;
                    boolean z13 = !arrayList4.isEmpty();
                    if (z10 || z11 || z13 || z12) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j10 = jVar.f7233d;
                            if (hasNext) {
                                a1 a1Var = (a1) it.next();
                                View view = a1Var.f7153a;
                                ViewPropertyAnimator animate = view.animate();
                                jVar.f7264q.add(a1Var);
                                animate.setDuration(j10).alpha(0.0f).setListener(new e(jVar, a1Var, animate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (z11) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    jVar.f7261m.add(arrayList5);
                                    arrayList2.clear();
                                    d dVar = new d(jVar, arrayList5, 0);
                                    if (z10) {
                                        View view2 = ((i) arrayList5.get(0)).f7240a.f7153a;
                                        WeakHashMap weakHashMap = g0.y0.f4277a;
                                        g0.h0.n(view2, dVar, j10);
                                    } else {
                                        dVar.run();
                                    }
                                }
                                if (z12) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    jVar.f7262n.add(arrayList6);
                                    arrayList3.clear();
                                    d dVar2 = new d(jVar, arrayList6, 1);
                                    if (z10) {
                                        View view3 = ((h) arrayList6.get(0)).f7224a.f7153a;
                                        WeakHashMap weakHashMap2 = g0.y0.f4277a;
                                        g0.h0.n(view3, dVar2, j10);
                                    } else {
                                        dVar2.run();
                                    }
                                }
                                if (z13) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    jVar.f7260l.add(arrayList7);
                                    arrayList4.clear();
                                    d dVar3 = new d(jVar, arrayList7, 2);
                                    if (!z10 && !z11 && !z12) {
                                        dVar3.run();
                                    } else {
                                        long j11 = 0;
                                        if (!z10) {
                                            j10 = 0;
                                        }
                                        if (z11) {
                                            j4 = jVar.f7234e;
                                        } else {
                                            j4 = 0;
                                        }
                                        if (z12) {
                                            j11 = jVar.f7235f;
                                        }
                                        long max = Math.max(j4, j11) + j10;
                                        z9 = false;
                                        View view4 = ((a1) arrayList7.get(0)).f7153a;
                                        WeakHashMap weakHashMap3 = g0.y0.f4277a;
                                        g0.h0.n(view4, dVar3, max);
                                        recyclerView.D0 = z9;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                z9 = false;
                recyclerView.D0 = z9;
                return;
        }
    }
}
