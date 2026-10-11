package f1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class d implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3814a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3815b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set f3816c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public List f3817d = Collections.emptyList();

    public final int b(Object obj) {
        int i10;
        synchronized (this.f3814a) {
            if (this.f3815b.containsKey(obj)) {
                i10 = ((Integer) this.f3815b.get(obj)).intValue();
            } else {
                i10 = 0;
            }
        }
        return i10;
    }

    public final void c(Object obj) {
        synchronized (this.f3814a) {
            Integer num = (Integer) this.f3815b.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f3817d);
            arrayList.remove(obj);
            this.f3817d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f3815b.remove(obj);
                HashSet hashSet = new HashSet(this.f3816c);
                hashSet.remove(obj);
                this.f3816c = Collections.unmodifiableSet(hashSet);
            } else {
                this.f3815b.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f3814a) {
            it = this.f3817d.iterator();
        }
        return it;
    }
}
