package q3;

import android.view.ViewGroup;
import g0.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9189a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f9190b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f9191c = new ArrayList();

    public static void a(ViewGroup viewGroup, s sVar) {
        ArrayList arrayList = f9191c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap weakHashMap = y0.f4277a;
            if (g0.k0.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (sVar == null) {
                    sVar = f9189a;
                }
                s clone = sVar.clone();
                ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((s) it.next()).v(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.i(viewGroup, true);
                }
                a3.g.z(viewGroup.getTag(R.id.transition_current_scene));
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone != null) {
                    u uVar = new u(viewGroup, clone);
                    viewGroup.addOnAttachStateChangeListener(uVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(uVar);
                }
            }
        }
    }

    public static n.e b() {
        n.e eVar;
        ThreadLocal threadLocal = f9190b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (n.e) weakReference.get()) != null) {
            return eVar;
        }
        n.e eVar2 = new n.e();
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
