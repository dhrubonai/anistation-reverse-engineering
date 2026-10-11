package h8;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final j f5144a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5145b;

    /* renamed from: c, reason: collision with root package name */
    public i8.j f5146c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f5147d;

    /* renamed from: e, reason: collision with root package name */
    public LinearLayout f5148e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5149f = new ArrayList();

    public y(j jVar) {
        this.f5144a = jVar;
        this.f5145b = jVar.getContext();
    }

    public final void a(String str) {
        String lowerCase;
        String lowerCase2;
        if (str == null) {
            lowerCase = "";
        } else {
            lowerCase = str.trim().toLowerCase();
        }
        boolean isEmpty = lowerCase.isEmpty();
        ArrayList arrayList = this.f5149f;
        if (isEmpty) {
            i8.j jVar = this.f5146c;
            ArrayList arrayList2 = jVar.f5442f;
            arrayList2.clear();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            jVar.f7192a.b();
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a8.e eVar = (a8.e) it.next();
            String str2 = eVar.f183a;
            if (str2 == null) {
                lowerCase2 = "";
            } else {
                lowerCase2 = str2.toLowerCase();
            }
            String valueOf = String.valueOf(Math.round(eVar.f186d));
            if (lowerCase2.contains(lowerCase) || valueOf.equals(lowerCase)) {
                arrayList3.add(eVar);
            }
        }
        i8.j jVar2 = this.f5146c;
        ArrayList arrayList4 = jVar2.f5442f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        jVar2.f7192a.b();
    }
}
