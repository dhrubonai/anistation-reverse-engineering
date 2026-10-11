package t6;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import r6.h0;

/* loaded from: classes.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f10045a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10046b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10047c;

    public a(int i10, int i11, int[] iArr) {
        this.f10045a = iArr;
        this.f10046b = i10;
        this.f10047c = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f10046b;
            while (true) {
                if (i10 < this.f10047c) {
                    if (this.f10045a[i10] == intValue) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i10 = this.f10047c;
            int i11 = this.f10046b;
            int i12 = i10 - i11;
            if (aVar.f10047c - aVar.f10046b != i12) {
                return false;
            }
            for (int i13 = 0; i13 < i12; i13++) {
                if (this.f10045a[i11 + i13] != aVar.f10045a[aVar.f10046b + i13]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f10047c;
        int i12 = this.f10046b;
        h0.n(i10, i11 - i12);
        return Integer.valueOf(this.f10045a[i12 + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f10046b; i11 < this.f10047c; i11++) {
            i10 = (i10 * 31) + this.f10045a[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f10046b;
            int i11 = i10;
            while (true) {
                if (i11 < this.f10047c) {
                    if (this.f10045a[i11] == intValue) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i11 = this.f10047c - 1;
            while (true) {
                i10 = this.f10046b;
                if (i11 >= i10) {
                    if (this.f10045a[i11] == intValue) {
                        break;
                    }
                    i11--;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        int i11 = this.f10047c;
        int i12 = this.f10046b;
        h0.n(i10, i11 - i12);
        int i13 = i12 + i10;
        int[] iArr = this.f10045a;
        int i14 = iArr[i13];
        num.getClass();
        iArr[i13] = num.intValue();
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10047c - this.f10046b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f10047c;
        int i13 = this.f10046b;
        h0.w(i10, i11, i12 - i13);
        if (i10 == i11) {
            return Collections.emptyList();
        }
        return new a(i10 + i13, i13 + i11, this.f10045a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i10 = this.f10047c;
        int i11 = this.f10046b;
        StringBuilder sb = new StringBuilder((i10 - i11) * 5);
        sb.append('[');
        int[] iArr = this.f10045a;
        sb.append(iArr[i11]);
        while (true) {
            i11++;
            if (i11 < i10) {
                sb.append(", ");
                sb.append(iArr[i11]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
