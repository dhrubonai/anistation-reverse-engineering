package r6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class u1 extends m1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f9551a = new u1();

    @Override // r6.m1
    public final m1 a() {
        return l1.f9489a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
