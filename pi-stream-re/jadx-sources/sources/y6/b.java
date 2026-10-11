package y6;

import java.util.Comparator;
import r6.h0;

/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11634a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        h0.u(comparable, "a");
        h0.u(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return a.f11633a;
    }
}
