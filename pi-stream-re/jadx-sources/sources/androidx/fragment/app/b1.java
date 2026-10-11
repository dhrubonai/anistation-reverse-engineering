package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g1 f847a = new g1();

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f848b;

    static {
        i1 i1Var;
        try {
            i1Var = (i1) q3.n.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            i1Var = null;
        }
        f848b = i1Var;
    }

    public static void a(int i10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i10);
        }
    }
}
