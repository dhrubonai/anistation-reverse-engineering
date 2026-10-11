package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ul3 extends AbstractList implements RandomAccess, Serializable {
    public final long[] x;
    public final int y;
    public final int z;

    public ul3(long[] jArr, int i, int i2) {
        this.x = jArr;
        this.y = i;
        this.z = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.y;
            while (true) {
                if (i < this.z) {
                    if (this.x[i] == longValue) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ul3) {
                ul3 ul3Var = (ul3) obj;
                int size = size();
                if (ul3Var.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (this.x[this.y + i] == ul3Var.x[ul3Var.y + i]) {
                        }
                    }
                    return true;
                }
                return false;
            }
            return super.equals(obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        io3.r(i, size());
        return Long.valueOf(this.x[this.y + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.y; i2 < this.z; i2++) {
            i = (i * 31) + zz.K(this.x[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.y;
            int i2 = i;
            while (true) {
                if (i2 < this.z) {
                    if (this.x[i2] == longValue) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
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
        int i;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i2 = this.z;
            while (true) {
                i2--;
                i = this.y;
                if (i2 >= i) {
                    if (this.x[i2] == longValue) {
                        break;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Long l = (Long) obj;
        io3.r(i, size());
        int i2 = this.y + i;
        long[] jArr = this.x;
        long j = jArr[i2];
        l.getClass();
        jArr[i2] = l.longValue();
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z - this.y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        io3.y(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.y;
        return new ul3(this.x, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 10);
        sb.append('[');
        long[] jArr = this.x;
        int i = this.y;
        sb.append(jArr[i]);
        while (true) {
            i++;
            if (i < this.z) {
                sb.append(", ");
                sb.append(jArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
