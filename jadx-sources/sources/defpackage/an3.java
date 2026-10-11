package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class an3 implements Map, Serializable, n73 {
    public static final an3 K;
    public int[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public bn3 G;
    public fh0 H;
    public bn3 I;
    public boolean J;
    public Object[] x;
    public Object[] y;
    public int[] z;

    static {
        an3 an3Var = new an3(0);
        an3Var.J = true;
        K = an3Var;
    }

    public an3(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.x = objArr;
            this.y = null;
            this.z = iArr;
            this.A = new int[highestOneBit];
            this.B = 2;
            this.C = 0;
            this.D = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        ze0.k("capacity must be non-negative.");
        throw null;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.B * 2;
            int length = this.A.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.A;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.C;
                    Object[] objArr = this.x;
                    if (i5 >= objArr.length) {
                        f(1);
                    } else {
                        int i6 = i5 + 1;
                        this.C = i6;
                        objArr[i5] = obj;
                        this.z[i5] = i;
                        iArr[i] = i6;
                        this.F++;
                        this.E++;
                        if (i3 > this.B) {
                            this.B = i3;
                        }
                        return i5;
                    }
                } else {
                    if (a34.i(this.x[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.A.length * 2);
                        break;
                    }
                    int i7 = i - 1;
                    if (i == 0) {
                        i = this.A.length - 1;
                    } else {
                        i = i7;
                    }
                }
            }
        }
    }

    public final an3 b() {
        c();
        this.J = true;
        if (this.F > 0) {
            return this;
        }
        an3 an3Var = K;
        an3Var.getClass();
        return an3Var;
    }

    public final void c() {
        if (!this.J) {
            return;
        }
        ze0.d();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.C - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.z;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.A[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        m37.H(this.x, 0, this.C);
        Object[] objArr = this.y;
        if (objArr != null) {
            m37.H(objArr, 0, this.C);
        }
        this.F = 0;
        this.C = 0;
        this.E++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.y;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.C;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.z;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.x;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.A[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        m37.H(this.x, i3, i);
        if (objArr != null) {
            m37.H(objArr, i3, this.C);
        }
        this.C = i3;
    }

    public final boolean e(Collection collection) {
        boolean i;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        i = false;
                    } else {
                        Object[] objArr = this.y;
                        objArr.getClass();
                        i = a34.i(objArr[g], entry.getValue());
                    }
                    if (!i) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        bn3 bn3Var = this.I;
        if (bn3Var == null) {
            bn3 bn3Var2 = new bn3(this, (byte) 0);
            this.I = bn3Var2;
            return bn3Var2;
        }
        return bn3Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.F != map.size() || !e(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        Object[] objArr;
        Object[] objArr2 = this.x;
        int length = objArr2.length;
        int i2 = this.C;
        int i3 = length - i2;
        int i4 = i2 - this.F;
        int i5 = 1;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i6 = i2 + i;
        if (i6 >= 0) {
            if (i6 > objArr2.length) {
                int length2 = objArr2.length;
                int i7 = length2 + (length2 >> 1);
                if (i7 - i6 < 0) {
                    i7 = i6;
                }
                if (i7 - 2147483639 > 0) {
                    if (i6 > 2147483639) {
                        i7 = Integer.MAX_VALUE;
                    } else {
                        i7 = 2147483639;
                    }
                }
                this.x = Arrays.copyOf(objArr2, i7);
                Object[] objArr3 = this.y;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i7);
                } else {
                    objArr = null;
                }
                this.y = objArr;
                this.z = Arrays.copyOf(this.z, i7);
                if (i7 >= 1) {
                    i5 = i7;
                }
                int highestOneBit = Integer.highestOneBit(i5 * 3);
                if (highestOneBit > this.A.length) {
                    j(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.B;
        while (true) {
            int i3 = this.A[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (a34.i(this.x[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            int i5 = i - 1;
            if (i == 0) {
                i = this.A.length - 1;
            } else {
                i = i5;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.y;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i = this.C;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.z[i] >= 0) {
                Object[] objArr = this.y;
                objArr.getClass();
                if (a34.i(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        xm3 xm3Var = new xm3(this, (byte) 0);
        int i3 = 0;
        while (xm3Var.hasNext()) {
            int i4 = xm3Var.x;
            an3 an3Var = (an3) xm3Var.A;
            if (i4 < an3Var.C) {
                xm3Var.x = i4 + 1;
                xm3Var.y = i4;
                Object obj = an3Var.x[i4];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = an3Var.y;
                objArr.getClass();
                Object obj2 = objArr[xm3Var.y];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                xm3Var.c();
                i3 += i ^ i2;
            } else {
                qi2.e();
                return 0;
            }
        }
        return i3;
    }

    public final int i(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.D;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.F == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.z[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.E
            int r0 = r0 + 1
            r5.E = r0
            int r0 = r5.C
            int r1 = r5.F
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.A = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.D = r6
        L1c:
            int r6 = r5.C
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.x
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.B
        L2c:
            int[] r3 = r5.A
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.z
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.ze0.m(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an3.j(int):void");
    }

    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.x;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.y;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i5 = this.z[i];
        loop0: while (true) {
            int i6 = i5;
            int i7 = 0;
            do {
                int i8 = i5 - 1;
                if (i5 == 0) {
                    i5 = this.A.length - 1;
                } else {
                    i5 = i8;
                }
                int[] iArr2 = this.A;
                i2 = iArr2[i5];
                i7++;
                if (i7 > this.B) {
                    iArr2[i6] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i6] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.x[i3]) - i5;
                    iArr = this.A;
                }
            } while ((i4 & (iArr.length - 1)) < i7);
            iArr[i6] = i2;
            this.z[i3] = i6;
        }
        this.z[i] = -1;
        this.F--;
        this.E++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        bn3 bn3Var = this.G;
        if (bn3Var == null) {
            bn3 bn3Var2 = new bn3(this, (byte) 1);
            this.G = bn3Var2;
            return bn3Var2;
        }
        return bn3Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.y;
        if (objArr == null) {
            int length = this.x.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.y = objArr;
            } else {
                ze0.k("capacity must be non-negative.");
                return null;
            }
        }
        if (a < 0) {
            int i = (-a) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[a] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a = a(entry.getKey());
                Object[] objArr = this.y;
                if (objArr == null) {
                    int length = this.x.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.y = objArr;
                    } else {
                        ze0.k("capacity must be non-negative.");
                        return;
                    }
                }
                if (a >= 0) {
                    objArr[a] = entry.getValue();
                } else {
                    int i = (-a) - 1;
                    if (!a34.i(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.y;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.F;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.F * 3) + 2);
        sb.append("{");
        int i = 0;
        xm3 xm3Var = new xm3(this, (byte) 0);
        while (xm3Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = xm3Var.x;
            an3 an3Var = (an3) xm3Var.A;
            if (i2 < an3Var.C) {
                xm3Var.x = i2 + 1;
                xm3Var.y = i2;
                Object obj = an3Var.x[i2];
                if (obj == an3Var) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = an3Var.y;
                objArr.getClass();
                Object obj2 = objArr[xm3Var.y];
                if (obj2 == an3Var) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                xm3Var.c();
                i++;
            } else {
                qi2.e();
                return null;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        fh0 fh0Var = this.H;
        if (fh0Var == null) {
            fh0 fh0Var2 = new fh0(this, (byte) 1);
            this.H = fh0Var2;
            return fh0Var2;
        }
        return fh0Var;
    }

    public an3() {
        this(8);
    }
}
