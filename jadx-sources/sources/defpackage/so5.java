package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class so5 {
    public int[] x;
    public Object[] y;
    public int z;

    public so5(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = w65.c;
        } else {
            iArr = new int[i];
        }
        this.x = iArr;
        if (i == 0) {
            objArr = w65.e;
        } else {
            objArr = new Object[i << 1];
        }
        this.y = objArr;
    }

    public final int a(Object obj) {
        int i = this.z * 2;
        Object[] objArr = this.y;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i, Object obj) {
        int i2 = this.z;
        if (i2 == 0) {
            return -1;
        }
        int p = w65.p(i2, i, this.x);
        if (p < 0 || a34.i(obj, this.y[p << 1])) {
            return p;
        }
        int i3 = p + 1;
        while (i3 < i2 && this.x[i3] == i) {
            if (a34.i(obj, this.y[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = p - 1; i4 >= 0 && this.x[i4] == i; i4--) {
            if (a34.i(obj, this.y[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        if (obj == null) {
            return d();
        }
        return b(obj.hashCode(), obj);
    }

    public final void clear() {
        int i = this.z;
        if (i > 0) {
            this.x = w65.c;
            this.y = w65.e;
            i = 0;
            this.z = 0;
        }
        if (i <= 0) {
            return;
        }
        ze0.j();
    }

    public boolean containsKey(Object obj) {
        if (c(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d() {
        int i = this.z;
        if (i == 0) {
            return -1;
        }
        int p = w65.p(i, 0, this.x);
        if (p < 0 || this.y[p << 1] == null) {
            return p;
        }
        int i2 = p + 1;
        while (i2 < i && this.x[i2] == 0) {
            if (this.y[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = p - 1; i3 >= 0 && this.x[i3] == 0; i3--) {
            if (this.y[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.z) {
            z = true;
        }
        if (z) {
            return this.y[i << 1];
        }
        ze0.k(qx1.h(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof so5) {
                int i = this.z;
                if (i != ((so5) obj).z) {
                    return false;
                }
                so5 so5Var = (so5) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object e = e(i2);
                    Object h = h(i2);
                    Object obj2 = so5Var.get(e);
                    if (h == null) {
                        if (obj2 != null || !so5Var.containsKey(e)) {
                            return false;
                        }
                    } else if (!h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.z != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.z;
            for (int i4 = 0; i4 < i3; i4++) {
                Object e2 = e(i4);
                Object h2 = h(i4);
                Object obj3 = ((Map) obj).get(e2);
                if (h2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(e2)) {
                        return false;
                    }
                } else if (!h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.z)) {
            Object[] objArr = this.y;
            int i3 = i << 1;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
                return obj;
            }
            int i4 = i2 - 1;
            int[] iArr = this.x;
            int i5 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                this.x = Arrays.copyOf(iArr, i5);
                this.y = Arrays.copyOf(this.y, i5 << 1);
                if (i2 == this.z) {
                    if (i > 0) {
                        ms.w0(0, 0, i, iArr, this.x);
                        ms.x0(0, 0, i3, objArr, this.y);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        ms.w0(i, i6, i2, iArr, this.x);
                        ms.x0(i3, i6 << 1, i2 << 1, objArr, this.y);
                    }
                } else {
                    ze0.j();
                    return null;
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    ms.w0(i, i7, i2, iArr, iArr);
                    Object[] objArr2 = this.y;
                    ms.x0(i3, i7 << 1, i2 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.y;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i2 == this.z) {
                this.z = i4;
                return obj;
            }
            ze0.j();
            return null;
        }
        ze0.k(qx1.h(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final Object g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.z) {
            z = true;
        }
        if (z) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.y;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        ze0.k(qx1.h(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public Object get(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return this.y[(c << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return this.y[(c << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.z) {
            z = true;
        }
        if (z) {
            return this.y[(i << 1) + 1];
        }
        ze0.k(qx1.h(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.x;
        Object[] objArr = this.y;
        int i2 = this.z;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final boolean isEmpty() {
        if (this.z <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int d;
        int i2 = this.z;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            d = b(i, obj);
        } else {
            d = d();
        }
        if (d >= 0) {
            int i3 = (d << 1) + 1;
            Object[] objArr = this.y;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~d;
        int[] iArr = this.x;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            this.x = Arrays.copyOf(iArr, i5);
            this.y = Arrays.copyOf(this.y, i5 << 1);
            if (i2 != this.z) {
                ze0.j();
                return null;
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.x;
            int i6 = i4 + 1;
            ms.w0(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.y;
            ms.x0(i6 << 1, i4 << 1, this.z << 1, objArr2, objArr2);
        }
        int i7 = this.z;
        if (i2 == i7) {
            int[] iArr3 = this.x;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.y;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.z = i7 + 1;
                return null;
            }
        }
        ze0.j();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0 && a34.i(obj2, h(c))) {
            f(c);
            return true;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c >= 0 && a34.i(obj2, h(c))) {
            g(c, obj3);
            return true;
        }
        return false;
    }

    public final int size() {
        return this.z;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.z * 28);
        sb.append('{');
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object e = e(i2);
            if (e != sb) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return f(c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return g(c, obj2);
        }
        return null;
    }

    public so5() {
        this(0);
    }
}
