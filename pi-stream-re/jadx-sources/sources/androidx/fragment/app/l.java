package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l extends n1 {
    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (g0.c1.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    i(arrayList, childAt);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(n.e eVar, View view) {
        WeakHashMap weakHashMap = g0.y0.f4277a;
        String k10 = g0.n0.k(view);
        if (k10 != null) {
            eVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(eVar, childAt);
                }
            }
        }
    }

    public static void k(n.e eVar, Collection collection) {
        Iterator it = ((r6.w) eVar.entrySet()).iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            WeakHashMap weakHashMap = g0.y0.f4277a;
            if (!collection.contains(g0.n0.k(view))) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x088c A[LOOP:6: B:159:0x0886->B:161:0x088c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x070c  */
    @Override // androidx.fragment.app.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 2244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.b(java.util.ArrayList, boolean):void");
    }
}
