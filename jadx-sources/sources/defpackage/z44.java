package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z44 implements RandomAccess {
    public Object[] x;
    public d44 y;
    public int z;

    public z44(Object[] objArr, int i) {
        this.x = objArr;
        this.z = i;
    }

    public final void a(int i, Object obj) {
        int i2 = this.z + 1;
        if (this.x.length < i2) {
            o(i2);
        }
        Object[] objArr = this.x;
        int i3 = this.z;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.z++;
    }

    public final void b(Object obj) {
        int i = this.z + 1;
        if (this.x.length < i) {
            o(i);
        }
        Object[] objArr = this.x;
        int i2 = this.z;
        objArr[i2] = obj;
        this.z = i2 + 1;
    }

    public final void c(int i, z44 z44Var) {
        int i2 = z44Var.z;
        if (i2 == 0) {
            return;
        }
        int i3 = this.z + i2;
        if (this.x.length < i3) {
            o(i3);
        }
        Object[] objArr = this.x;
        int i4 = this.z;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(z44Var.x, 0, objArr, i, i2);
        this.z += i2;
    }

    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.z + size;
        if (this.x.length < i2) {
            o(i2);
        }
        Object[] objArr = this.x;
        int i3 = this.z;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.z += size;
    }

    public final boolean f(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.z + size;
        if (this.x.length < i3) {
            o(i3);
        }
        Object[] objArr = this.x;
        int i4 = this.z;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                objArr[i2 + i] = obj;
                i2 = i5;
            } else {
                te4.R();
                throw null;
            }
        }
        this.z += size;
        return true;
    }

    public final List g() {
        d44 d44Var = this.y;
        if (d44Var == null) {
            d44 d44Var2 = new d44(this, (byte) 1);
            this.y = d44Var2;
            return d44Var2;
        }
        return d44Var;
    }

    public final void h() {
        Object[] objArr = this.x;
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.z = 0;
    }

    public final boolean i(Object obj) {
        int i = this.z - 1;
        if (i >= 0) {
            for (int i2 = 0; !a34.i(this.x[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.x;
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (a34.i(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int j = j(obj);
        if (j >= 0) {
            m(j);
            return true;
        }
        return false;
    }

    public final Object m(int i) {
        Object[] objArr = this.x;
        Object obj = objArr[i];
        int i2 = this.z;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.z - 1;
        this.z = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void n(int i, int i2) {
        if (i2 > i) {
            int i3 = this.z;
            if (i2 < i3) {
                Object[] objArr = this.x;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.z;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.x[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.z = i5;
        }
    }

    public final void o(int i) {
        Object[] objArr = this.x;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.x = objArr2;
    }
}
