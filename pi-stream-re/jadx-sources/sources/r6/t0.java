package r6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class t0 extends j0 implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9538c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient o0 f9539b;

    public static int h(int i10) {
        int max = Math.max(i10, 2);
        boolean z9 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z9 = false;
        }
        if (z9) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static t0 i(int i10, Object... objArr) {
        if (i10 != 0) {
            boolean z9 = false;
            if (i10 != 1) {
                int h10 = h(i10);
                Object[] objArr2 = new Object[h10];
                int i11 = h10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int J0 = h0.J0(hashCode);
                        while (true) {
                            int i15 = J0 & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            J0++;
                        }
                    } else {
                        throw new NullPointerException(a3.g.n("at index ", i14));
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new a2(obj3);
                }
                if (h(i13) < h10 / 2) {
                    return i(i13, objArr);
                }
                int length = objArr.length;
                if (i13 < (length >> 1) + (length >> 2)) {
                    z9 = true;
                }
                if (z9) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new t1(objArr, i12, objArr2, i11, i13);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new a2(obj4);
        }
        return t1.A;
    }

    public static t0 j(Collection collection) {
        if ((collection instanceof t0) && !(collection instanceof SortedSet)) {
            t0 t0Var = (t0) collection;
            if (!t0Var.g()) {
                return t0Var;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    @Override // r6.j0
    public o0 b() {
        o0 o0Var = this.f9539b;
        if (o0Var == null) {
            o0 k10 = k();
            this.f9539b = k10;
            return k10;
        }
        return o0Var;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t0) && (this instanceof t1)) {
            t0 t0Var = (t0) obj;
            t0Var.getClass();
            if ((t0Var instanceof t1) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return h0.P(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return h0.d0(this);
    }

    public o0 k() {
        Object[] array = toArray();
        m0 m0Var = o0.f9505b;
        return o0.h(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract d2 iterator();
}
