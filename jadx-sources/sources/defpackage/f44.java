package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f44 {
    public Object[] a;
    public int b;
    public d44 c;

    public f44(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = ec4.a;
        } else {
            objArr = new Object[i];
        }
        this.a = objArr;
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(objArr, i);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(f44 f44Var) {
        f44Var.getClass();
        if (!f44Var.i()) {
            int i = this.b + f44Var.b;
            Object[] objArr = this.a;
            if (objArr.length < i) {
                n(objArr, i);
            }
            ms.x0(this.b, 0, f44Var.b, f44Var.a, this.a);
            this.b += f44Var.b;
        }
    }

    public final void c(List list) {
        if (!list.isEmpty()) {
            int i = this.b;
            int size = list.size() + i;
            Object[] objArr = this.a;
            if (objArr.length < size) {
                n(objArr, size);
            }
            Object[] objArr2 = this.a;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                objArr2[i2 + i] = list.get(i2);
            }
            this.b = list.size() + this.b;
        }
    }

    public final void d() {
        ms.E0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final boolean e(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f44) {
            f44 f44Var = (f44) obj;
            int i = f44Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = f44Var.a;
                f13 r0 = db.r0(0, i2);
                int i3 = r0.x;
                int i4 = r0.y;
                if (i3 <= i4) {
                    while (a34.i(objArr[i3], objArr2[i3])) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final Object f() {
        if (!i()) {
            return this.a[0];
        }
        p65.h("ObjectList is empty.");
        return null;
    }

    public final Object g(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        p(i);
        throw null;
    }

    public final int h(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    public final boolean i() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final boolean k(Object obj) {
        int h = h(obj);
        if (h >= 0) {
            l(h);
            return true;
        }
        return false;
    }

    public final Object l(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            Object[] objArr = this.a;
            Object obj = objArr[i];
            if (i != i2 - 1) {
                ms.x0(i, i + 1, i2, objArr, objArr);
            }
            int i3 = this.b - 1;
            this.b = i3;
            objArr[i3] = null;
            return obj;
        }
        p(i);
        throw null;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b) && i2 >= 0 && i2 <= i3) {
            if (i2 >= i) {
                if (i2 != i) {
                    if (i2 < i3) {
                        Object[] objArr = this.a;
                        ms.x0(i, i2, i3, objArr, objArr);
                    }
                    int i4 = this.b;
                    int i5 = i4 - (i2 - i);
                    ms.E0(i5, i4, null, this.a);
                    this.b = i5;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        p65.k(qx1.u("Start (", i, ") and end (", i2, ") must be in 0.."), this.b);
    }

    public final void n(Object[] objArr, int i) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        ms.x0(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object o(int i, Object obj) {
        if (i >= 0 && i < this.b) {
            Object[] objArr = this.a;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        p(i);
        throw null;
    }

    public final void p(int i) {
        StringBuilder s = qx1.s(i, "Index ", " must be in 0..");
        s.append(this.b - 1);
        throw new IndexOutOfBoundsException(s.toString());
    }

    public final void q(int i) {
        StringBuilder s = qx1.s(i, "Index ", " must be in 0..");
        s.append(this.b);
        throw new IndexOutOfBoundsException(s.toString());
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                Object obj = objArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                if (obj == this) {
                    valueOf = "(this)";
                } else {
                    valueOf = String.valueOf(obj);
                }
                sb.append((CharSequence) valueOf);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public /* synthetic */ f44() {
        this(16);
    }
}
