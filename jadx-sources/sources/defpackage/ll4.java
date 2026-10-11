package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ll4 extends n2 {
    public final int A;
    public final Object[] x;
    public final Object[] y;
    public final int z;

    public ll4(Object[] objArr, Object[] objArr2, int i, int i2) {
        boolean z;
        this.x = objArr;
        this.y = objArr2;
        this.z = i;
        this.A = i2;
        if (b() > 32) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ds4.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] k(Object[] objArr, int i, int i2, Object obj, eo3 eo3Var) {
        Object[] copyOf;
        int k = vv5.k(i2, i);
        if (i == 0) {
            if (k == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            ms.x0(k + 1, k, 31, objArr, copyOf);
            eo3Var.y = objArr[31];
            copyOf[k] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[k];
        obj2.getClass();
        copyOf2[k] = k((Object[]) obj2, i3, i2, obj, eo3Var);
        while (true) {
            k++;
            if (k >= 32 || copyOf2[k] == null) {
                break;
            }
            Object obj3 = objArr[k];
            obj3.getClass();
            copyOf2[k] = k((Object[]) obj3, i3, 0, eo3Var.y, eo3Var);
        }
        return copyOf2;
    }

    public static Object[] n(Object[] objArr, int i, int i2, eo3 eo3Var) {
        Object[] n;
        int k = vv5.k(i2, i);
        if (i == 5) {
            eo3Var.y = objArr[k];
            n = null;
        } else {
            Object obj = objArr[k];
            obj.getClass();
            n = n((Object[]) obj, i - 5, i2, eo3Var);
        }
        if (n == null && k == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[k] = n;
        return copyOf;
    }

    public static Object[] t(int i, int i2, Object obj, Object[] objArr) {
        int k = vv5.k(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[k] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[k];
        obj2.getClass();
        copyOf[k] = t(i - 5, i2, obj, (Object[]) obj2);
        return copyOf;
    }

    @Override // defpackage.m0
    public final int b() {
        return this.z;
    }

    @Override // defpackage.n2
    public final n2 c(int i, Object obj) {
        int i2 = this.z;
        n77.w(i, i2);
        if (i == i2) {
            return d(obj);
        }
        int s = s();
        Object[] objArr = this.x;
        if (i >= s) {
            return m(i - s, obj, objArr);
        }
        eo3 eo3Var = new eo3((Object) null, (byte) 6);
        return m(0, eo3Var.y, k(objArr, this.A, i, obj, eo3Var));
    }

    @Override // defpackage.n2
    public final n2 d(Object obj) {
        int s = s();
        int i = this.z;
        int i2 = i - s;
        Object[] objArr = this.x;
        Object[] objArr2 = this.y;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new ll4(objArr, copyOf, i + 1, this.A);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return o(objArr, objArr2, objArr3);
    }

    @Override // defpackage.n2
    public final ml4 g() {
        return new ml4(this, this.x, this.y, this.A);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        n77.v(i, b());
        if (s() <= i) {
            objArr = this.y;
        } else {
            Object[] objArr2 = this.x;
            for (int i2 = this.A; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[vv5.k(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.n2
    public final n2 h(m2 m2Var) {
        ml4 ml4Var = new ml4(this, this.x, this.y, this.A);
        ml4Var.B(m2Var);
        return ml4Var.d();
    }

    @Override // defpackage.n2
    public final n2 i(int i) {
        n77.v(i, b());
        int s = s();
        int i2 = this.A;
        Object[] objArr = this.x;
        if (i >= s) {
            return r(objArr, s, i2, i - s);
        }
        return r(q(objArr, i2, i, new eo3(this.y[0], (byte) 6)), s, i2, 0);
    }

    @Override // defpackage.n2
    public final n2 j(int i, Object obj) {
        int i2 = this.z;
        n77.v(i, i2);
        int s = s();
        Object[] objArr = this.x;
        Object[] objArr2 = this.y;
        int i3 = this.A;
        if (s <= i) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i & 31] = obj;
            return new ll4(objArr, copyOf, i2, i3);
        }
        return new ll4(t(i3, i, obj, objArr), objArr2, i2, i3);
    }

    @Override // defpackage.r1, java.util.List
    public final ListIterator listIterator(int i) {
        n77.w(i, this.z);
        return new nl4(i, this.z, (this.A / 5) + 1, this.x, this.y);
    }

    public final ll4 m(int i, Object obj, Object[] objArr) {
        int s = s();
        int i2 = this.z;
        int i3 = i2 - s;
        Object[] objArr2 = this.y;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            ms.x0(i + 1, i, i3, objArr2, copyOf);
            copyOf[i] = obj;
            return new ll4(objArr, copyOf, i2 + 1, this.A);
        }
        Object obj2 = objArr2[31];
        ms.x0(i + 1, i, i3 - 1, objArr2, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, copyOf, objArr3);
    }

    public final ll4 o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.z;
        int i2 = i >> 5;
        int i3 = this.A;
        if (i2 > (1 << i3)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i4 = i3 + 5;
            return new ll4(p(objArr4, objArr2, i4), objArr3, i + 1, i4);
        }
        return new ll4(p(objArr, objArr2, i3), objArr3, i + 1, i3);
    }

    public final Object[] p(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int k = vv5.k(b() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[k] = objArr2;
            return objArr3;
        }
        objArr3[k] = p((Object[]) objArr3[k], objArr2, i - 5);
        return objArr3;
    }

    public final Object[] q(Object[] objArr, int i, int i2, eo3 eo3Var) {
        Object[] copyOf;
        int k = vv5.k(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (k == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            ms.x0(k, k + 1, 32, objArr, copyOf);
            copyOf[31] = eo3Var.y;
            eo3Var.y = objArr[k];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = vv5.k(s() - 1, i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        int i5 = k + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                obj.getClass();
                copyOf2[i3] = q((Object[]) obj, i4, 0, eo3Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[k];
        obj2.getClass();
        copyOf2[k] = q((Object[]) obj2, i4, i2, eo3Var);
        return copyOf2;
    }

    public final n2 r(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.z - i;
        Object obj = null;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new es5(objArr);
            }
            eo3 eo3Var = new eo3(obj, (byte) 6);
            Object[] n = n(objArr, i2, i - 1, eo3Var);
            n.getClass();
            Object obj2 = eo3Var.y;
            obj2.getClass();
            Object[] objArr2 = (Object[]) obj2;
            if (n[1] == null) {
                Object obj3 = n[0];
                obj3.getClass();
                return new ll4((Object[]) obj3, objArr2, i, i2 - 5);
            }
            return new ll4(n, objArr2, i, i2);
        }
        Object[] objArr3 = this.y;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        int i5 = i4 - 1;
        if (i3 < i5) {
            ms.x0(i3, i3 + 1, i4, objArr3, copyOf);
        }
        copyOf[i5] = null;
        return new ll4(objArr, copyOf, (i + i4) - 1, i2);
    }

    public final int s() {
        return (this.z - 1) & (-32);
    }
}
