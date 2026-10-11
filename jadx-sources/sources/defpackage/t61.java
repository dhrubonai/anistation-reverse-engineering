package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t61 implements bi1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ w44 d;
    public final /* synthetic */ w44 e;

    public t61(Object obj, Set set, Set set2, w44 w44Var, w44 w44Var2) {
        this.a = obj;
        this.b = set;
        this.c = set2;
        this.d = w44Var;
        this.e = w44Var2;
    }

    @Override // defpackage.bi1
    public final void dispose() {
        ArrayList arrayList;
        List list = (List) this.d.getValue();
        boolean z = false;
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((j74) list.get(i)).b);
            }
        } else {
            arrayList = new ArrayList(zo0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((j74) it.next()).b);
            }
        }
        Object obj = this.a;
        if (!arrayList.contains(obj)) {
            z = this.b.remove(obj);
        }
        if (z && !this.c.contains(obj)) {
            List list2 = (List) this.e.getValue();
            if (list2 instanceof RandomAccess) {
                int size2 = list2.size() - 1;
                if (size2 < 0) {
                    return;
                }
                while (true) {
                    int i2 = size2 - 1;
                    ((k74) list2.get(size2)).a.invoke(obj);
                    if (i2 >= 0) {
                        size2 = i2;
                    } else {
                        return;
                    }
                }
            } else {
                Iterator it2 = yo0.y0(list2).iterator();
                while (it2.hasNext()) {
                    ((k74) it2.next()).a.invoke(obj);
                }
            }
        }
    }
}
