package r6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l1 extends m1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f9489a = new l1();

    @Override // r6.m1
    public final m1 a() {
        return u1.f9551a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
