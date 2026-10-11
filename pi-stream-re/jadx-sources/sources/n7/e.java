package n7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x6.o;

/* loaded from: classes.dex */
public abstract class e extends f {
    public static final List k0(c cVar) {
        Iterator it = cVar.iterator();
        if (!it.hasNext()) {
            return o.f11318a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return com.bumptech.glide.c.L(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
