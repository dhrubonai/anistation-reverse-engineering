package m3;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((s0) ((Observable) this).mObservers.get(size)).f7363a;
            recyclerView.k(null);
            recyclerView.f1258x0.f7411f = true;
            recyclerView.W(true);
            if (!recyclerView.f1236e.g()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i10) {
        boolean z9;
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((s0) ((Observable) this).mObservers.get(size)).f7363a;
            recyclerView.k(null);
            b bVar = recyclerView.f1236e;
            ArrayList arrayList = bVar.f7172b;
            arrayList.add(bVar.h(null, 2, i10, 1));
            bVar.f7176f |= 2;
            if (arrayList.size() == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (RecyclerView.V0 && recyclerView.K && recyclerView.J) {
                    WeakHashMap weakHashMap = g0.y0.f4277a;
                    g0.h0.m(recyclerView, recyclerView.f1261z);
                } else {
                    recyclerView.R = true;
                    recyclerView.requestLayout();
                }
            }
        }
    }
}
