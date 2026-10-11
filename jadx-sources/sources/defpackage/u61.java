package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u61 implements bi1 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ w44 d;

    public u61(Set set, Object obj, Set set2, w44 w44Var) {
        this.a = set;
        this.b = obj;
        this.c = set2;
        this.d = w44Var;
    }

    @Override // defpackage.bi1
    public final void dispose() {
        Set set = this.a;
        Object obj = this.b;
        boolean remove = set.remove(obj);
        if (!this.c.contains(obj) && remove) {
            List list = (List) this.d.getValue();
            if (list instanceof RandomAccess) {
                int size = list.size() - 1;
                if (size < 0) {
                    return;
                }
                while (true) {
                    int i = size - 1;
                    ((k74) list.get(size)).a.invoke(obj);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            } else {
                Iterator it = yo0.y0(list).iterator();
                while (it.hasNext()) {
                    ((k74) it.next()).a.invoke(obj);
                }
            }
        }
    }
}
