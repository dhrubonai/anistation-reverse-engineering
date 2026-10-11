package q1;

import android.net.Uri;
import c1.a1;
import c1.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: n, reason: collision with root package name */
    public static final l f9035n = new l("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List f9036d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9037e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9038f;

    /* renamed from: g, reason: collision with root package name */
    public final List f9039g;

    /* renamed from: h, reason: collision with root package name */
    public final List f9040h;

    /* renamed from: i, reason: collision with root package name */
    public final List f9041i;

    /* renamed from: j, reason: collision with root package name */
    public final v f9042j;

    /* renamed from: k, reason: collision with root package name */
    public final List f9043k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f9044l;

    /* renamed from: m, reason: collision with root package name */
    public final List f9045m;

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, v vVar, List list7, boolean z9, Map map, List list8) {
        super(str, list, z9);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((k) list2.get(i10)).f9029a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f9036d = Collections.unmodifiableList(arrayList);
        this.f9037e = Collections.unmodifiableList(list2);
        this.f9038f = Collections.unmodifiableList(list3);
        this.f9039g = Collections.unmodifiableList(list4);
        this.f9040h = Collections.unmodifiableList(list5);
        this.f9041i = Collections.unmodifiableList(list6);
        this.f9042j = vVar;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f9043k = list9;
        this.f9044l = Collections.unmodifiableMap(map);
        this.f9045m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((j) list.get(i10)).f9026a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    a1 a1Var = (a1) list2.get(i12);
                    if (a1Var.f1624b == i10 && a1Var.f1625c == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    @Override // u1.a
    public final Object a(List list) {
        return new l(this.f9046a, this.f9047b, c(this.f9037e, 0, list), Collections.emptyList(), c(this.f9039g, 1, list), c(this.f9040h, 2, list), Collections.emptyList(), this.f9042j, this.f9043k, this.f9048c, this.f9044l, this.f9045m);
    }
}
