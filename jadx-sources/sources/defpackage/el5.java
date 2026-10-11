package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class el5 extends te4 {
    public static LinkedHashSet V(Set set, Serializable serializable) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(vn3.S(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && a34.i(obj, serializable)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet W(Set set, Serializable serializable) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(vn3.S(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(serializable);
        return linkedHashSet;
    }

    public static LinkedHashSet X(Set set, Iterable iterable) {
        Integer num;
        int size;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(vn3.S(size));
        linkedHashSet.addAll(set);
        dp0.Y(iterable, linkedHashSet);
        return linkedHashSet;
    }
}
