package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oj6 {
    public static final oj6 e = new oj6(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final i18 c;
    public Object[] d;

    public oj6(int i, int i2, Object[] objArr, i18 i18Var) {
        this.a = i;
        this.b = i2;
        this.c = i18Var;
        this.d = objArr;
    }

    public static oj6 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, i18 i18Var) {
        Object[] objArr;
        if (i3 > 30) {
            return new oj6(0, 0, new Object[]{obj, obj2, obj3, obj4}, i18Var);
        }
        int m = nv5.m(i, i3);
        int m2 = nv5.m(i2, i3);
        if (m != m2) {
            if (m < m2) {
                objArr = new Object[]{obj, obj2, obj3, obj4};
            } else {
                objArr = new Object[]{obj3, obj4, obj, obj2};
            }
            return new oj6((1 << m) | (1 << m2), 0, objArr, i18Var);
        }
        return new oj6(0, 1 << m, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, i18Var)}, i18Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, i18 i18Var) {
        int i5;
        Object obj3 = this.d[i];
        if (obj3 != null) {
            i5 = obj3.hashCode();
        } else {
            i5 = 0;
        }
        oj6 j = j(i5, obj3, x(i), i3, obj, obj2, i4 + 5, i18Var);
        int t = t(i2);
        int i6 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ms.B0(0, i, 6, objArr, objArr2);
        ms.x0(i, i + 2, i6, objArr, objArr2);
        objArr2[t - 1] = j;
        ms.x0(t, i6, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        d13 o0 = db.o0(db.r0(0, this.d.length), 2);
        int i = o0.x;
        int i2 = o0.y;
        int i3 = o0.z;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!a34.i(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int m = 1 << nv5.m(i, i2);
        if (h(m)) {
            return a34.i(obj, this.d[f(m)]);
        }
        if (i(m)) {
            oj6 s = s(t(m));
            if (i2 == 30) {
                return s.c(obj);
            }
            return s.d(i, i2 + 5, obj);
        }
        return false;
    }

    public final boolean e(oj6 oj6Var) {
        if (this != oj6Var) {
            if (this.b == oj6Var.b && this.a == oj6Var.a) {
                int length = this.d.length;
                for (int i = 0; i < length; i++) {
                    if (this.d[i] == oj6Var.d[i]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int m = 1 << nv5.m(i, i2);
        if (h(m)) {
            int f = f(m);
            if (a34.i(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (i(m)) {
            oj6 s = s(t(m));
            if (i2 == 30) {
                d13 o0 = db.o0(db.r0(0, s.d.length), 2);
                int i3 = o0.x;
                int i4 = o0.y;
                int i5 = o0.z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!a34.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        } else {
                            return null;
                        }
                    }
                    return s.x(i3);
                }
                return null;
            }
            return s.g(i, i2 + 5, obj);
        }
        return null;
    }

    public final boolean h(int i) {
        if ((this.a & i) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i) {
        if ((this.b & i) != 0) {
            return true;
        }
        return false;
    }

    public final oj6 k(int i, dl4 dl4Var) {
        dl4Var.c(dl4Var.C - 1);
        dl4Var.A = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == dl4Var.y) {
            this.d = nv5.r(objArr, i);
            return this;
        }
        return new oj6(0, 0, nv5.r(objArr, i), dl4Var.y);
    }

    public final oj6 l(int i, Object obj, Object obj2, int i2, dl4 dl4Var) {
        dl4 dl4Var2;
        oj6 l;
        int m = 1 << nv5.m(i, i2);
        boolean h = h(m);
        i18 i18Var = this.c;
        if (h) {
            int f = f(m);
            if (a34.i(obj, this.d[f])) {
                dl4Var.A = x(f);
                if (x(f) == obj2) {
                    return this;
                }
                if (i18Var == dl4Var.y) {
                    this.d[f + 1] = obj2;
                    return this;
                }
                dl4Var.B++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new oj6(this.a, this.b, copyOf, dl4Var.y);
            }
            dl4Var.c(dl4Var.C + 1);
            i18 i18Var2 = dl4Var.y;
            if (i18Var == i18Var2) {
                this.d = a(f, m, i, obj, obj2, i2, i18Var2);
                this.a ^= m;
                this.b |= m;
                return this;
            }
            return new oj6(this.a ^ m, this.b | m, a(f, m, i, obj, obj2, i2, i18Var2), i18Var2);
        }
        if (i(m)) {
            int t = t(m);
            oj6 s = s(t);
            if (i2 == 30) {
                d13 o0 = db.o0(db.r0(0, s.d.length), 2);
                int i3 = o0.x;
                int i4 = o0.y;
                int i5 = o0.z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!a34.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    dl4Var.A = s.x(i3);
                    if (s.c == dl4Var.y) {
                        s.d[i3 + 1] = obj2;
                        l = s;
                    } else {
                        dl4Var.B++;
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        l = new oj6(0, 0, copyOf2, dl4Var.y);
                    }
                    dl4Var2 = dl4Var;
                }
                dl4Var.c(dl4Var.C + 1);
                l = new oj6(0, 0, nv5.n(s.d, 0, obj, obj2), dl4Var.y);
                dl4Var2 = dl4Var;
            } else {
                dl4Var2 = dl4Var;
                l = s.l(i, obj, obj2, i2 + 5, dl4Var2);
            }
            if (s == l) {
                return this;
            }
            return r(t, l, dl4Var2.y);
        }
        dl4Var.c(dl4Var.C + 1);
        i18 i18Var3 = dl4Var.y;
        int f2 = f(m);
        Object[] objArr3 = this.d;
        if (i18Var == i18Var3) {
            this.d = nv5.n(objArr3, f2, obj, obj2);
            this.a |= m;
            return this;
        }
        return new oj6(this.a | m, this.b, nv5.n(objArr3, f2, obj, obj2), i18Var3);
    }

    public final oj6 m(oj6 oj6Var, int i, td1 td1Var, dl4 dl4Var) {
        oj6 oj6Var2;
        Object[] objArr;
        int i2;
        int i3;
        oj6 j;
        int i4;
        int i5;
        int i6;
        if (this == oj6Var) {
            td1Var.a += b();
            return this;
        }
        int i7 = 0;
        if (i > 30) {
            i18 i18Var = dl4Var.y;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + oj6Var.d.length);
            int length = this.d.length;
            d13 o0 = db.o0(db.r0(0, oj6Var.d.length), 2);
            int i8 = o0.x;
            int i9 = o0.y;
            int i10 = o0.z;
            if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                while (true) {
                    if (!c(oj6Var.d[i8])) {
                        Object[] objArr3 = oj6Var.d;
                        copyOf[length] = objArr3[i8];
                        copyOf[length + 1] = objArr3[i8 + 1];
                        length += 2;
                    } else {
                        td1Var.a++;
                    }
                    if (i8 == i9) {
                        break;
                    }
                    i8 += i10;
                }
            }
            if (length != this.d.length) {
                if (length != oj6Var.d.length) {
                    if (length == copyOf.length) {
                        return new oj6(0, 0, copyOf, i18Var);
                    }
                    return new oj6(0, 0, Arrays.copyOf(copyOf, length), i18Var);
                }
                return oj6Var;
            }
            return this;
        }
        int i11 = this.b | oj6Var.b;
        int i12 = this.a;
        int i13 = oj6Var.a;
        int i14 = (i12 ^ i13) & (~i11);
        int i15 = i12 & i13;
        int i16 = i14;
        while (i15 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i15);
            if (a34.i(this.d[f(lowestOneBit)], oj6Var.d[oj6Var.f(lowestOneBit)])) {
                i16 |= lowestOneBit;
            } else {
                i11 |= lowestOneBit;
            }
            i15 ^= lowestOneBit;
        }
        if ((i11 & i16) != 0) {
            ds4.b("Check failed.");
        }
        if (a34.i(this.c, dl4Var.y) && this.a == i16 && this.b == i11) {
            oj6Var2 = this;
        } else {
            oj6Var2 = new oj6(i16, i11, new Object[Integer.bitCount(i11) + (Integer.bitCount(i16) * 2)], null);
        }
        int i17 = i11;
        int i18 = 0;
        while (i17 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i17);
            Object[] objArr4 = oj6Var2.d;
            int length2 = (objArr4.length - 1) - i18;
            if (i(lowestOneBit2)) {
                j = s(t(lowestOneBit2));
                if (oj6Var.i(lowestOneBit2)) {
                    j = j.m(oj6Var.s(oj6Var.t(lowestOneBit2)), i + 5, td1Var, dl4Var);
                    objArr = objArr4;
                } else if (oj6Var.h(lowestOneBit2)) {
                    int f = oj6Var.f(lowestOneBit2);
                    Object obj = oj6Var.d[f];
                    Object x = oj6Var.x(f);
                    int i19 = dl4Var.C;
                    if (obj != null) {
                        i6 = obj.hashCode();
                    } else {
                        i6 = i7;
                    }
                    int i20 = i6;
                    objArr = objArr4;
                    j = j.l(i20, obj, x, i + 5, dl4Var);
                    if (dl4Var.C == i19) {
                        td1Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (oj6Var.i(lowestOneBit2)) {
                    oj6 s = oj6Var.s(oj6Var.t(lowestOneBit2));
                    if (h(lowestOneBit2)) {
                        int f2 = f(lowestOneBit2);
                        Object obj2 = this.d[f2];
                        if (obj2 != null) {
                            i4 = obj2.hashCode();
                        } else {
                            i4 = 0;
                        }
                        int i21 = i + 5;
                        if (s.d(i4, i21, obj2)) {
                            td1Var.a++;
                        } else {
                            Object x2 = x(f2);
                            if (obj2 != null) {
                                i5 = obj2.hashCode();
                            } else {
                                i5 = 0;
                            }
                            j = s.l(i5, obj2, x2, i21, dl4Var);
                        }
                    }
                    j = s;
                } else {
                    int f3 = f(lowestOneBit2);
                    Object obj3 = this.d[f3];
                    Object x3 = x(f3);
                    int f4 = oj6Var.f(lowestOneBit2);
                    Object obj4 = oj6Var.d[f4];
                    Object x4 = oj6Var.x(f4);
                    if (obj3 != null) {
                        i2 = obj3.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (obj4 != null) {
                        i3 = obj4.hashCode();
                    } else {
                        i3 = 0;
                    }
                    j = j(i2, obj3, x3, i3, obj4, x4, i + 5, dl4Var.y);
                }
            }
            objArr[length2] = j;
            i18++;
            i17 ^= lowestOneBit2;
            i7 = 0;
        }
        int i22 = 0;
        while (i16 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i16);
            int i23 = i22 * 2;
            if (!oj6Var.h(lowestOneBit3)) {
                int f5 = f(lowestOneBit3);
                Object[] objArr5 = oj6Var2.d;
                objArr5[i23] = this.d[f5];
                objArr5[i23 + 1] = x(f5);
            } else {
                int f6 = oj6Var.f(lowestOneBit3);
                Object[] objArr6 = oj6Var2.d;
                objArr6[i23] = oj6Var.d[f6];
                objArr6[i23 + 1] = oj6Var.x(f6);
                if (h(lowestOneBit3)) {
                    td1Var.a++;
                }
            }
            i22++;
            i16 ^= lowestOneBit3;
        }
        if (!e(oj6Var2)) {
            if (oj6Var.e(oj6Var2)) {
                return oj6Var;
            }
            return oj6Var2;
        }
        return this;
    }

    public final oj6 n(int i, Object obj, int i2, dl4 dl4Var) {
        oj6 n;
        int m = 1 << nv5.m(i, i2);
        if (h(m)) {
            int f = f(m);
            if (a34.i(obj, this.d[f])) {
                return p(f, m, dl4Var);
            }
        } else if (i(m)) {
            int t = t(m);
            oj6 s = s(t);
            if (i2 == 30) {
                d13 o0 = db.o0(db.r0(0, s.d.length), 2);
                int i3 = o0.x;
                int i4 = o0.y;
                int i5 = o0.z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!a34.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, dl4Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, dl4Var);
            return q(s, n, t, m, dl4Var.y);
        }
        return this;
    }

    public final oj6 o(int i, Object obj, Object obj2, int i2, dl4 dl4Var) {
        dl4 dl4Var2;
        oj6 o;
        int m = 1 << nv5.m(i, i2);
        if (h(m)) {
            int f = f(m);
            if (a34.i(obj, this.d[f]) && a34.i(obj2, x(f))) {
                return p(f, m, dl4Var);
            }
            return this;
        }
        if (i(m)) {
            int t = t(m);
            oj6 s = s(t);
            if (i2 == 30) {
                d13 o0 = db.o0(db.r0(0, s.d.length), 2);
                int i3 = o0.x;
                int i4 = o0.y;
                int i5 = o0.z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (a34.i(obj, s.d[i3]) && a34.i(obj2, s.x(i3))) {
                            o = s.k(i3, dl4Var);
                            break;
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    }
                    dl4Var2 = dl4Var;
                }
                o = s;
                dl4Var2 = dl4Var;
            } else {
                dl4Var2 = dl4Var;
                o = s.o(i, obj, obj2, i2 + 5, dl4Var2);
            }
            return q(s, o, t, m, dl4Var2.y);
        }
        return this;
    }

    public final oj6 p(int i, int i2, dl4 dl4Var) {
        dl4Var.c(dl4Var.C - 1);
        dl4Var.A = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == dl4Var.y) {
            this.d = nv5.r(objArr, i);
            this.a ^= i2;
            return this;
        }
        return new oj6(i2 ^ this.a, this.b, nv5.r(objArr, i), dl4Var.y);
    }

    public final oj6 q(oj6 oj6Var, oj6 oj6Var2, int i, int i2, i18 i18Var) {
        i18 i18Var2 = this.c;
        if (oj6Var2 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (i18Var2 == i18Var) {
                this.d = nv5.s(objArr, i);
                this.b ^= i2;
                return this;
            }
            return new oj6(this.a, this.b ^ i2, nv5.s(objArr, i), i18Var);
        }
        if (i18Var2 != i18Var && oj6Var == oj6Var2) {
            return this;
        }
        return r(i, oj6Var2, i18Var);
    }

    public final oj6 r(int i, oj6 oj6Var, i18 i18Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && oj6Var.d.length == 2 && oj6Var.b == 0) {
            oj6Var.a = this.b;
            return oj6Var;
        }
        if (this.c == i18Var) {
            objArr[i] = oj6Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = oj6Var;
        return new oj6(this.a, this.b, copyOf, i18Var);
    }

    public final oj6 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (oj6) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        r13.y = w(r11, r4, (defpackage.oj6) r13.y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mn0 u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj6.u(int, int, java.lang.Object, java.lang.Object):mn0");
    }

    public final oj6 v(int i, int i2, Object obj) {
        oj6 v;
        int m = 1 << nv5.m(i, i2);
        if (h(m)) {
            int f = f(m);
            if (a34.i(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new oj6(this.a ^ m, this.b, nv5.r(objArr, f), null);
                }
            } else {
                return this;
            }
        } else if (i(m)) {
            int t = t(m);
            oj6 s = s(t);
            if (i2 == 30) {
                d13 o0 = db.o0(db.r0(0, s.d.length), 2);
                int i3 = o0.x;
                int i4 = o0.y;
                int i5 = o0.z;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!a34.i(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    if (objArr2.length == 2) {
                        v = null;
                    } else {
                        v = new oj6(0, 0, nv5.r(objArr2, i3), null);
                    }
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new oj6(this.a, this.b ^ m, nv5.s(objArr3, t), null);
                }
            } else {
                if (s != v) {
                    return w(t, m, v);
                }
                return this;
            }
        } else {
            return this;
        }
        return null;
    }

    public final oj6 w(int i, int i2, oj6 oj6Var) {
        Object[] objArr = oj6Var.d;
        if (objArr.length == 2 && oj6Var.b == 0) {
            if (this.d.length == 1) {
                oj6Var.a = this.b;
                return oj6Var;
            }
            int f = f(i2);
            Object[] objArr2 = this.d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            ms.x0(i + 2, i + 1, objArr2.length, copyOf, copyOf);
            ms.x0(f + 2, f, i, copyOf, copyOf);
            copyOf[f] = obj;
            copyOf[f + 1] = obj2;
            return new oj6(this.a ^ i2, this.b ^ i2, copyOf, null);
        }
        Object[] objArr3 = this.d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2[i] = oj6Var;
        return new oj6(this.a, this.b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
