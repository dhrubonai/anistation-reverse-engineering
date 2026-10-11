package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zw2 extends gw2 implements Set {
    public static final /* synthetic */ int z = 0;
    public transient nw2 y;

    public static int j(int i) {
        int max = Math.max(i, 2);
        boolean z2 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z2 = false;
        }
        io3.m("collection too large", z2);
        return 1073741824;
    }

    public static zw2 k(Object[] objArr, int i) {
        if (i != 0) {
            if (i != 1) {
                int j = j(i);
                Object[] objArr2 = new Object[j];
                int i2 = j - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int b0 = h41.b0(hashCode);
                        while (true) {
                            int i6 = b0 & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            b0++;
                        }
                    } else {
                        qi2.m(qx1.h(i5, "at index "));
                        return null;
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new oq5(obj3);
                }
                if (j(i4) < j / 2) {
                    return k(objArr, i4);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new v15(i3, i2, i4, objArr, objArr2);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new oq5(obj4);
        }
        return v15.G;
    }

    public static zw2 m(Collection collection) {
        if ((collection instanceof zw2) && !(collection instanceof SortedSet)) {
            zw2 zw2Var = (zw2) collection;
            if (!zw2Var.h()) {
                return zw2Var;
            }
        }
        Object[] array = collection.toArray();
        return k(array, array.length);
    }

    public static zw2 p(Object obj, Object obj2) {
        return k(new Object[]{obj, obj2}, 2);
    }

    public static zw2 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z2;
        if (objArr.length <= 2147483641) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.m("the total number of elements must fit in an int", z2);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return k(objArr2, length);
    }

    @Override // defpackage.gw2
    public nw2 b() {
        nw2 nw2Var = this.y;
        if (nw2Var == null) {
            nw2 n = n();
            this.y = n;
            return n;
        }
        return nw2Var;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zw2) && o() && ((zw2) obj).o() && hashCode() != obj.hashCode()) {
            return false;
        }
        return bb4.v(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return bb4.G(this);
    }

    public nw2 n() {
        Object[] array = toArray(gw2.x);
        z62 z62Var = nw2.y;
        return nw2.j(array, array.length);
    }

    public boolean o() {
        return this instanceof v15;
    }
}
