package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ml4 extends k2 implements Collection, k73 {
    public int A;
    public i18 B = new i18(25);
    public Object[] C;
    public Object[] D;
    public int E;
    public n2 x;
    public Object[] y;
    public Object[] z;

    public ml4(n2 n2Var, Object[] objArr, Object[] objArr2, int i) {
        this.x = n2Var;
        this.y = objArr;
        this.z = objArr2;
        this.A = i;
        this.C = objArr;
        this.D = objArr2;
        this.E = n2Var.b();
    }

    public static void f(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(ub2 ub2Var, int i, eo3 eo3Var) {
        int z = z(ub2Var, this.D, i, eo3Var);
        Object obj = eo3Var.y;
        if (z == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, z, i, (Object) null);
        this.D = objArr;
        this.E -= i - z;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (A(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(defpackage.ub2 r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.H()
            eo3 r5 = new eo3
            r0 = 6
            r9 = 0
            r5.<init>(r9, r0)
            java.lang.Object[] r0 = r15.C
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1c
            int r0 = r15.A(r1, r8, r5)
            if (r0 == r8) goto Ld2
        L19:
            r10 = r11
            goto Ld2
        L1c:
            s1 r12 = r15.m(r10)
            r13 = 32
            r0 = r13
        L23:
            if (r0 != r13) goto L36
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.z(r1, r0, r13, r5)
            goto L23
        L36:
            if (r0 != r13) goto L4a
            int r0 = r15.A(r1, r8, r5)
            if (r0 != 0) goto L47
            java.lang.Object[] r1 = r15.C
            int r2 = r15.E
            int r3 = r15.A
            r15.t(r1, r2, r3)
        L47:
            if (r0 == r8) goto Ld2
            goto L19
        L4a:
            int r2 = r12.x
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L5a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.y(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L5a
        L71:
            java.lang.Object[] r2 = r15.D
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.y(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.y
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.C
            if (r3 == 0) goto L91
            r4.getClass()
            goto L9b
        L91:
            int r3 = r15.A
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.u(r4, r14, r3, r5)
        L9b:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La7
            goto Lac
        La7:
            java.lang.String r3 = "invalid size"
            defpackage.ds4.a(r3)
        Lac:
            if (r14 != 0) goto Lb1
            r15.A = r10
            goto Lc9
        Lb1:
            int r3 = r14 + (-1)
        Lb3:
            int r5 = r15.A
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc5
            int r5 = r5 + (-5)
            r15.A = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb3
        Lc5:
            java.lang.Object[] r9 = r15.r(r4, r3, r5)
        Lc9:
            r15.C = r9
            r15.D = r2
            int r14 = r14 + r1
            r15.E = r14
            goto L19
        Ld2:
            if (r10 == 0) goto Ld9
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml4.B(ub2):boolean");
    }

    public final Object[] C(Object[] objArr, int i, int i2, eo3 eo3Var) {
        int k = vv5.k(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[k];
            Object[] n = n(objArr);
            ms.x0(k, k + 1, 32, objArr, n);
            n[31] = eo3Var.y;
            eo3Var.y = obj;
            return n;
        }
        if (objArr[31] == null) {
            i3 = vv5.k(E() - 1, i);
        }
        Object[] n2 = n(objArr);
        int i4 = i - 5;
        int i5 = k + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = n2[i3];
                obj2.getClass();
                n2[i3] = C((Object[]) obj2, i4, 0, eo3Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = n2[k];
        obj3.getClass();
        n2[k] = C((Object[]) obj3, i4, i2, eo3Var);
        return n2;
    }

    public final Object D(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.E - i;
        Object[] objArr2 = this.D;
        if (i4 == 1) {
            Object obj = objArr2[0];
            t(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] n = n(objArr2);
        ms.x0(i3, i3 + 1, i4, objArr2, n);
        n[i4 - 1] = null;
        this.C = objArr;
        this.D = n;
        this.E = (i + i4) - 1;
        this.A = i2;
        return obj2;
    }

    public final int E() {
        int i = this.E;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] F(Object[] objArr, int i, int i2, Object obj, eo3 eo3Var) {
        int k = vv5.k(i2, i);
        Object[] n = n(objArr);
        if (i == 0) {
            if (n != objArr) {
                ((AbstractList) this).modCount++;
            }
            eo3Var.y = n[k];
            n[k] = obj;
            return n;
        }
        Object obj2 = n[k];
        obj2.getClass();
        n[k] = F((Object[]) obj2, i - 5, i2, obj, eo3Var);
        return n;
    }

    public final void G(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] p;
        if (i3 < 1) {
            ds4.a("requires at least one nullBuffer");
        }
        Object[] n = n(objArr);
        objArr2[0] = n;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ms.x0(size + 1, i4, i2, n, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                p = n;
            } else {
                p = p();
                i3--;
                objArr2[i3] = p;
            }
            int i7 = i2 - i6;
            ms.x0(0, i7, i2, n, objArr3);
            ms.x0(size + 1, i4, i7, n, p);
            objArr3 = p;
        }
        Iterator it = collection.iterator();
        f(n, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] p2 = p();
            f(p2, 0, it);
            objArr2[i8] = p2;
        }
        f(objArr3, 0, it);
    }

    public final int H() {
        int i = this.E;
        if (i <= 32) {
            return i;
        }
        return i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        n77.w(i, b());
        if (i == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int E = E();
        if (i >= E) {
            j(i - E, obj, this.C);
            return;
        }
        eo3 eo3Var = new eo3((Object) null, (byte) 6);
        Object[] objArr = this.C;
        objArr.getClass();
        j(0, eo3Var.y, i(objArr, this.A, i, obj, eo3Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] p;
        n77.w(i, this.E);
        if (i == this.E) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.E - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.D;
            Object[] n = n(objArr);
            ms.x0(size2 + 1, i3, H(), objArr, n);
            f(n, i3, collection.iterator());
            this.D = n;
            this.E = collection.size() + this.E;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int H = H();
        int size3 = collection.size() + this.E;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= E()) {
            p = p();
            collection2 = collection;
            G(collection2, i, this.D, H, objArr2, size, p);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.D;
            if (size3 > H) {
                int i4 = size3 - H;
                Object[] o = o(objArr3, i4);
                h(collection2, i, i4, objArr2, size, o);
                objArr2 = objArr2;
                p = o;
            } else {
                p = p();
                int i5 = H - size3;
                ms.x0(0, i5, H, objArr3, p);
                int i6 = 32 - i5;
                Object[] o2 = o(this.D, i6);
                int i7 = size - 1;
                objArr2[i7] = o2;
                h(collection2, i, i6, objArr2, i7, o2);
                collection2 = collection2;
            }
        }
        this.C = v(this.C, i2, objArr2);
        this.D = p;
        this.E = collection2.size() + this.E;
        return true;
    }

    @Override // defpackage.k2
    public final int b() {
        return this.E;
    }

    @Override // defpackage.k2
    public final Object c(int i) {
        n77.v(i, b());
        ((AbstractList) this).modCount++;
        int E = E();
        if (i >= E) {
            return D(this.C, E, this.A, i - E);
        }
        eo3 eo3Var = new eo3(this.D[0], (byte) 6);
        Object[] objArr = this.C;
        objArr.getClass();
        D(C(objArr, this.A, i, eo3Var), E, this.A, 0);
        return eo3Var.y;
    }

    public final n2 d() {
        n2 ll4Var;
        Object[] objArr = this.C;
        if (objArr == this.y && this.D == this.z) {
            ll4Var = this.x;
        } else {
            this.B = new i18((byte) 25);
            this.y = objArr;
            Object[] objArr2 = this.D;
            this.z = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    ll4Var = es5.y;
                } else {
                    ll4Var = new es5(Arrays.copyOf(objArr2, this.E));
                }
            } else {
                ll4Var = new ll4(objArr, objArr2, this.E, this.A);
            }
        }
        this.x = ll4Var;
        return ll4Var;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        n77.v(i, b());
        if (E() <= i) {
            objArr = this.D;
        } else {
            Object[] objArr2 = this.C;
            objArr2.getClass();
            for (int i2 = this.A; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[vv5.k(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.C != null) {
            int i4 = i >> 5;
            s1 m = m(E() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (m.x - 1 != i4) {
                Object[] objArr4 = (Object[]) m.previous();
                ms.x0(0, 32 - i2, 32, objArr4, objArr3);
                objArr3 = o(objArr4, i2);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) m.previous();
            int E = i3 - (((E() >> 5) - 1) - i4);
            if (E < i3) {
                objArr2 = objArr[E];
                objArr2.getClass();
            }
            G(collection, i, objArr5, 32, objArr, E, objArr2);
            return;
        }
        ze0.m("root is null");
    }

    public final Object[] i(Object[] objArr, int i, int i2, Object obj, eo3 eo3Var) {
        Object obj2;
        int k = vv5.k(i2, i);
        if (i == 0) {
            eo3Var.y = objArr[31];
            Object[] n = n(objArr);
            ms.x0(k + 1, k, 31, objArr, n);
            n[k] = obj;
            return n;
        }
        Object[] n2 = n(objArr);
        int i3 = i - 5;
        Object obj3 = n2[k];
        obj3.getClass();
        n2[k] = i((Object[]) obj3, i3, i2, obj, eo3Var);
        while (true) {
            k++;
            if (k >= 32 || (obj2 = n2[k]) == null) {
                break;
            }
            n2[k] = i((Object[]) obj2, i3, 0, eo3Var.y, eo3Var);
        }
        return n2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj, Object[] objArr) {
        int H = H();
        Object[] n = n(this.D);
        Object[] objArr2 = this.D;
        if (H < 32) {
            ms.x0(i + 1, i, H, objArr2, n);
            n[i] = obj;
            this.C = objArr;
            this.D = n;
            this.E++;
            return;
        }
        Object obj2 = objArr2[31];
        ms.x0(i + 1, i, 31, objArr2, n);
        n[i] = obj;
        w(objArr, n, q(obj2));
    }

    public final boolean k(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.B) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        n77.w(i, this.E);
        return new ol4(this, i);
    }

    public final s1 m(int i) {
        Object[] objArr = this.C;
        if (objArr != null) {
            int E = E() >> 5;
            n77.w(i, E);
            int i2 = this.A;
            if (i2 == 0) {
                return new sa0(objArr, i);
            }
            return new nj6(objArr, i, E, i2 / 5);
        }
        ze0.m("Invalid root");
        return null;
    }

    public final Object[] n(Object[] objArr) {
        if (objArr == null) {
            return p();
        }
        if (k(objArr)) {
            return objArr;
        }
        Object[] p = p();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ms.B0(0, length, 6, objArr, p);
        return p;
    }

    public final Object[] o(Object[] objArr, int i) {
        if (k(objArr)) {
            ms.x0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] p = p();
        ms.x0(i, 0, 32 - i, objArr, p);
        return p;
    }

    public final Object[] p() {
        Object[] objArr = new Object[33];
        objArr[32] = this.B;
        return objArr;
    }

    public final Object[] q(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.B;
        return objArr;
    }

    public final Object[] r(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            ds4.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int k = vv5.k(i, i2);
        Object obj = objArr[k];
        obj.getClass();
        Object r = r((Object[]) obj, i, i2 - 5);
        if (k < 31) {
            int i3 = k + 1;
            if (objArr[i3] != null) {
                if (k(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] p = p();
                ms.x0(0, 0, i3, objArr, p);
                objArr = p;
            }
        }
        if (r != objArr[k]) {
            Object[] n = n(objArr);
            n[k] = r;
            return n;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return B(new m2(collection, (byte) 1));
    }

    public final Object[] s(Object[] objArr, int i, int i2, eo3 eo3Var) {
        Object[] s;
        int k = vv5.k(i2 - 1, i);
        if (i == 5) {
            eo3Var.y = objArr[k];
            s = null;
        } else {
            Object obj = objArr[k];
            obj.getClass();
            s = s((Object[]) obj, i - 5, i2, eo3Var);
        }
        if (s == null && k == 0) {
            return null;
        }
        Object[] n = n(objArr);
        n[k] = s;
        return n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        n77.v(i, b());
        if (E() <= i) {
            Object[] n = n(this.D);
            if (n != this.D) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = n[i2];
            n[i2] = obj;
            this.D = n;
            return obj2;
        }
        eo3 eo3Var = new eo3((Object) null, (byte) 6);
        Object[] objArr = this.C;
        objArr.getClass();
        this.C = F(objArr, this.A, i, obj, eo3Var);
        return eo3Var.y;
    }

    public final void t(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.C = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.D = objArr;
            this.E = i;
            this.A = i2;
            return;
        }
        eo3 eo3Var = new eo3(obj, (byte) 6);
        objArr.getClass();
        Object[] s = s(objArr, i2, i, eo3Var);
        s.getClass();
        Object obj2 = eo3Var.y;
        obj2.getClass();
        this.D = (Object[]) obj2;
        this.E = i;
        if (s[1] == null) {
            this.C = (Object[]) s[0];
            this.A = i2 - 5;
        } else {
            this.C = s;
            this.A = i2;
        }
    }

    public final Object[] u(Object[] objArr, int i, int i2, Iterator it) {
        boolean z;
        if (!it.hasNext()) {
            ds4.a("invalid buffersIterator");
        }
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ds4.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] n = n(objArr);
        int k = vv5.k(i, i2);
        int i3 = i2 - 5;
        n[k] = u((Object[]) n[k], i, i3, it);
        while (true) {
            k++;
            if (k >= 32 || !it.hasNext()) {
                break;
            }
            n[k] = u((Object[]) n[k], 0, i3, it);
        }
        return n;
    }

    public final Object[] v(Object[] objArr, int i, Object[][] objArr2) {
        Object[] n;
        o1 o1Var = new o1(objArr2);
        int i2 = i >> 5;
        int i3 = this.A;
        if (i2 < (1 << i3)) {
            n = u(objArr, i, i3, o1Var);
        } else {
            n = n(objArr);
        }
        while (o1Var.hasNext()) {
            this.A += 5;
            n = q(n);
            int i4 = this.A;
            u(n, 1 << i4, i4, o1Var);
        }
        return n;
    }

    public final void w(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.E;
        int i2 = i >> 5;
        int i3 = this.A;
        if (i2 > (1 << i3)) {
            this.C = x(q(objArr), objArr2, this.A + 5);
            this.D = objArr3;
            this.A += 5;
            this.E++;
            return;
        }
        if (objArr == null) {
            this.C = objArr2;
            this.D = objArr3;
            this.E = i + 1;
        } else {
            this.C = x(objArr, objArr2, i3);
            this.D = objArr3;
            this.E++;
        }
    }

    public final Object[] x(Object[] objArr, Object[] objArr2, int i) {
        int k = vv5.k(b() - 1, i);
        Object[] n = n(objArr);
        if (i == 5) {
            n[k] = objArr2;
            return n;
        }
        n[k] = x((Object[]) n[k], objArr2, i - 5);
        return n;
    }

    public final int y(ub2 ub2Var, Object[] objArr, int i, int i2, eo3 eo3Var, ArrayList arrayList, ArrayList arrayList2) {
        Object[] p;
        if (k(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eo3Var.y;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) ub2Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    if (!arrayList.isEmpty()) {
                        p = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        p = p();
                    }
                    objArr3 = p;
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        eo3Var.y = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int z(ub2 ub2Var, Object[] objArr, int i, eo3 eo3Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) ub2Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = n(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        eo3Var.y = objArr2;
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int H = H();
        if (H < 32) {
            Object[] n = n(this.D);
            n[H] = obj;
            this.D = n;
            this.E = b() + 1;
        } else {
            w(this.C, this.D, q(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int H = H();
        Iterator it = collection.iterator();
        if (32 - H >= collection.size()) {
            Object[] n = n(this.D);
            f(n, H, it);
            this.D = n;
            this.E = collection.size() + this.E;
            return true;
        }
        int size = ((collection.size() + H) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] n2 = n(this.D);
        f(n2, H, it);
        objArr[0] = n2;
        for (int i = 1; i < size; i++) {
            Object[] p = p();
            f(p, 0, it);
            objArr[i] = p;
        }
        this.C = v(this.C, E(), objArr);
        Object[] p2 = p();
        f(p2, 0, it);
        this.D = p2;
        this.E = collection.size() + this.E;
        return true;
    }
}
