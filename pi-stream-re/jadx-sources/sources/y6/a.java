package y6;

import java.util.Comparator;
import r6.h0;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11633a = new a();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        h0.u(comparable, "a");
        h0.u(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return b.f11634a;
    }
}
