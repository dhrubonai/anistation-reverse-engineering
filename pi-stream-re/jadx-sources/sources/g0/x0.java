package g0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f4272d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f4273a = null;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f4274b = null;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f4275c = null;

    public static void b(View view) {
        int size;
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            a3.g.z(arrayList.get(size));
            throw null;
        }
    }

    public final View a(View view) {
        View a10;
        WeakHashMap weakHashMap = this.f4273a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount));
                    }
                } while (a10 == null);
                return a10;
            }
            b(view);
            return null;
        }
        return null;
    }
}
