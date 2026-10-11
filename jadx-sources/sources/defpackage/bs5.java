package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bs5 {
    public final yr5 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public s34 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final l13 p;
    public final l13 q;
    public final l13 r;
    public s34 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public r34 x;

    public bs5(yr5 yr5Var) {
        this.a = yr5Var;
        int[] iArr = yr5Var.x;
        this.b = iArr;
        Object[] objArr = yr5Var.z;
        this.c = objArr;
        this.d = yr5Var.F;
        this.e = yr5Var.G;
        this.f = yr5Var.H;
        int i = yr5Var.y;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = yr5Var.A;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new l13((byte) 1);
        this.q = new l13((byte) 1);
        this.r = new l13((byte) 1);
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    public static void y(bs5 bs5Var) {
        int i = bs5Var.v;
        int q = bs5Var.q(i);
        int[] iArr = bs5Var.b;
        int i2 = (q * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            int i4 = (i3 & (-134217729)) | 134217728;
            iArr[i2] = i4;
            if ((67108864 & i4) != 0) {
                return;
            }
            bs5Var.V(bs5Var.F(iArr, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.ms.w0(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.ms.w0(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(int r9) {
        /*
            r8 = this;
            int r0 = r8.h
            int r1 = r8.g
            if (r1 == r9) goto Lab
            java.util.ArrayList r2 = r8.d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L59
            int r2 = r8.h
            int r3 = r8.n()
            int r3 = r3 - r2
            java.util.ArrayList r2 = r8.d
            if (r1 >= r9) goto L39
            int r2 = defpackage.as5.b(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.d
            java.lang.Object r4 = r4.get(r2)
            ed2 r4 = (defpackage.ed2) r4
            int r5 = r4.a
            if (r5 >= 0) goto L59
            int r5 = r5 + r3
            if (r5 >= r9) goto L59
            r4.a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            int r2 = defpackage.as5.b(r2, r9, r3)
        L3d:
            java.util.ArrayList r4 = r8.d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.d
            java.lang.Object r4 = r4.get(r2)
            ed2 r4 = (defpackage.ed2) r4
            int r5 = r4.a
            if (r5 < 0) goto L59
            int r5 = r3 - r5
            int r5 = -r5
            r4.a = r5
            int r2 = r2 + 1
            goto L3d
        L59:
            if (r0 <= 0) goto L70
            int[] r2 = r8.b
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6a
            int r4 = r4 + r3
            defpackage.ms.w0(r4, r3, r5, r2, r2)
            goto L70
        L6a:
            int r6 = r5 + r4
            int r3 = r3 + r4
            defpackage.ms.w0(r5, r6, r3, r2, r2)
        L70:
            if (r9 >= r1) goto L74
            int r1 = r9 + r0
        L74:
            int r2 = r8.n()
            if (r1 >= r2) goto L7b
            goto L80
        L7b:
            java.lang.String r3 = "Check failed"
            defpackage.eu0.a(r3)
        L80:
            if (r1 >= r2) goto Lab
            int[] r3 = r8.b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L8f
            r6 = r3
            goto L95
        L8f:
            int r6 = r8.o()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L95:
            if (r6 >= r9) goto L98
            goto L9f
        L98:
            int r7 = r8.o()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        L9f:
            if (r6 == r3) goto La5
            int[] r3 = r8.b
            r3[r4] = r6
        La5:
            int r1 = r1 + 1
            if (r1 != r9) goto L80
            int r1 = r1 + r0
            goto L80
        Lab:
            r8.g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs5.A(int):void");
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, o());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int q = q(min);
                int q2 = q(i5);
                int i7 = this.g;
                while (q < q2) {
                    int i8 = (q * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        eu0.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    q++;
                    if (q == i7) {
                        q += this.h;
                    }
                }
            } else {
                int q3 = q(i5);
                int q4 = q(min);
                while (q3 < q4) {
                    int i10 = (q3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        eu0.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    q3++;
                    if (q3 == this.g) {
                        q3 += this.h;
                    }
                }
            }
            this.m = min;
        }
        this.k = i;
    }

    public final List C(ed2 ed2Var, bs5 bs5Var) {
        int E;
        if (bs5Var.n <= 0) {
            eu0.a("Check failed");
        }
        if (this.n != 0) {
            eu0.a("Check failed");
        }
        if (!ed2Var.a()) {
            eu0.a("Check failed");
        }
        boolean z = true;
        int c = c(ed2Var) + 1;
        int i = this.t;
        if (i > c || c >= this.u) {
            eu0.a("Check failed");
        }
        int F = F(this.b, c);
        int t = t(c);
        if (x(c)) {
            E = 1;
        } else {
            E = E(c);
        }
        List H = h98.H(this, c, bs5Var, false, false, true);
        V(F);
        if (E <= 0) {
            z = false;
        }
        while (F >= i) {
            int q = q(F);
            int[] iArr = this.b;
            int i2 = q * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - t;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    as5.f(q, (i4 & 67108863) - E, iArr);
                }
            }
            F = F(this.b, F);
        }
        if (z) {
            if (this.o < E) {
                eu0.a("Check failed");
            }
            this.o -= E;
        }
        return H;
    }

    public final Object D(int i) {
        int q = q(i);
        int[] iArr = this.b;
        if ((iArr[(q * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iArr, q))];
        }
        return null;
    }

    public final int E(int i) {
        return this.b[(q(i) * 5) + 1] & 67108863;
    }

    public final int F(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        if (i2 > -2) {
            return i2;
        }
        return (o() + i2) - (-2);
    }

    public final Object G(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            eu0.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void H() {
        int i;
        int i2;
        r34 r34Var = this.x;
        if (r34Var != null) {
            while (r34Var.b != 0) {
                int T = w65.T(r34Var);
                int q = q(T);
                int i3 = T + 1;
                int t = t(T) + T;
                while (true) {
                    i = 0;
                    if (i3 < t) {
                        if ((this.b[(q(i3) * 5) + 1] & 201326592) != 0) {
                            i2 = 1;
                            break;
                        }
                        i3 += t(i3);
                    } else {
                        i2 = 0;
                        break;
                    }
                }
                int[] iArr = this.b;
                int i4 = (q * 5) + 1;
                int i5 = iArr[i4];
                if ((67108864 & i5) != 0) {
                    i = 1;
                }
                if (i != i2) {
                    iArr[i4] = (i2 << 26) | ((-67108865) & i5);
                    int F = F(iArr, T);
                    if (F >= 0) {
                        w65.m(r34Var, F);
                    }
                }
            }
        }
    }

    public final boolean I() {
        if (this.n != 0) {
            eu0.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int f = f(this.b, q(i));
        int M = M();
        P(this.v);
        r34 r34Var = this.x;
        if (r34Var != null) {
            while (true) {
                int i3 = r34Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 != 0) {
                    if (r34Var.a[0] < i) {
                        break;
                    }
                    w65.T(r34Var);
                } else {
                    p65.h("IntList is empty.");
                    return false;
                }
            }
        }
        boolean J = J(i, this.t - i);
        K(f, this.i - f, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= M;
        return J;
    }

    public final boolean J(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.e;
                int i3 = i + i2;
                int b = as5.b(this.d, i3, n() - this.h);
                if (b >= this.d.size()) {
                    b--;
                }
                int i4 = b + 1;
                int i5 = 0;
                while (b >= 0) {
                    ed2 ed2Var = (ed2) this.d.get(b);
                    int c = c(ed2Var);
                    if (c < i) {
                        break;
                    }
                    if (c < i3) {
                        ed2Var.a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = b + 1;
                        }
                        i4 = b;
                    }
                    b--;
                }
                if (i4 < i5) {
                    z = true;
                }
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                V(i8);
            }
        }
        return z;
    }

    public final void K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object L(int i, int i2, Object obj) {
        int O = O(this.b, q(i));
        int f = f(this.b, q(i + 1));
        int i3 = O + i2;
        if (i3 < O || i3 >= f) {
            eu0.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int g = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[g];
        objArr[g] = obj;
        return obj2;
    }

    public final int M() {
        int q = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void N() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, q(i));
    }

    public final int O(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int d = as5.d(iArr, i);
        int i2 = this.l;
        int length = this.c.length;
        if (d < 0) {
            return (length - i2) + d + 1;
        }
        return d;
    }

    public final md2 P(int i) {
        ed2 S;
        HashMap hashMap = this.e;
        if (hashMap == null || (S = S(i)) == null) {
            return null;
        }
        return (md2) hashMap.get(S);
    }

    public final void Q() {
        if (this.n != 0) {
            eu0.a("Key must be supplied when inserting");
        }
        q18 q18Var = au0.a;
        R(0, q18Var, false, q18Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(int i, Object obj, boolean z, Object obj2) {
        Object[] objArr;
        int i2;
        int i3;
        int i4;
        int i5 = this.v;
        if (this.n > 0) {
            objArr = true;
        } else {
            objArr = false;
        }
        this.r.e(this.o);
        q18 q18Var = au0.a;
        if (objArr != false) {
            int i6 = this.t;
            int f = f(this.b, q(i6));
            v(1);
            this.i = f;
            this.j = f;
            int q = q(i6);
            if (obj != q18Var) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (!z && obj2 != q18Var) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int h = h(f, this.k, this.l, this.c.length);
            if (h >= 0 && this.m < i6) {
                h = -(((this.c.length - this.l) - h) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = q * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i3 << 29) | (i4 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = h;
            int i9 = (z ? 1 : 0) + i3 + i4;
            if (i9 > 0) {
                w(i9, i6);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i3 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i4 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i6 + 1;
            this.v = i6;
            this.t = i2;
            if (i5 >= 0) {
                P(i5);
            }
        } else {
            this.p.e(i5);
            this.q.e((n() - this.h) - this.u);
            int i11 = this.t;
            int q2 = q(i11);
            if (!a34.i(obj2, q18Var)) {
                if (z) {
                    W(this.t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.i = O(this.b, q2);
            this.j = f(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i12 = q2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final ed2 S(int i) {
        ArrayList arrayList;
        int c;
        if (i < 0 || i >= o() || (c = as5.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (ed2) arrayList.get(c);
    }

    public final void T(Object obj) {
        if (this.n > 0 && this.i != this.k) {
            s34 s34Var = this.s;
            if (s34Var == null) {
                s34Var = new s34();
            }
            this.s = s34Var;
            int i = this.v;
            Object b = s34Var.b(i);
            if (b == null) {
                b = new f44();
                s34Var.h(i, b);
            }
            ((f44) b).a(obj);
            return;
        }
        G(obj);
    }

    public final void U(Object obj) {
        int q = q(this.t);
        int i = (q * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            eu0.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, q))] = obj;
    }

    public final void V(int i) {
        if (i >= 0) {
            r34 r34Var = this.x;
            if (r34Var == null) {
                r34Var = new r34();
                this.x = r34Var;
            }
            w65.m(r34Var, i);
        }
    }

    public final void W(int i, Object obj) {
        int q = q(i);
        int[] iArr = this.b;
        if (q >= iArr.length || (iArr[(q * 5) + 1] & 1073741824) == 0) {
            eu0.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(this.b, q))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            eu0.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            ds4.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        int i3 = this.v;
        if (i2 < i3 || i2 > this.u) {
            eu0.a("Cannot seek outside the current group (" + i3 + "-" + this.u + ")");
        }
        this.t = i2;
        int f = f(this.b, q(i2));
        this.i = f;
        this.j = f;
    }

    public final ed2 b(int i) {
        ArrayList arrayList = this.d;
        int c = as5.c(arrayList, i, o());
        if (c < 0) {
            if (i > this.g) {
                i = -(o() - i);
            }
            ed2 ed2Var = new ed2(i);
            arrayList.add(-(c + 1), ed2Var);
            return ed2Var;
        }
        return (ed2) arrayList.get(c);
    }

    public final int c(ed2 ed2Var) {
        int i = ed2Var.a;
        if (i < 0) {
            return o() + i;
        }
        return i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.e((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            H();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap hashMap = this.e;
        s34 s34Var = this.f;
        yr5 yr5Var = this.a;
        if (!yr5Var.D) {
            ds4.a("Unexpected writer close()");
        }
        yr5Var.D = false;
        yr5Var.x = iArr;
        yr5Var.y = i2;
        yr5Var.z = objArr;
        yr5Var.A = i3;
        yr5Var.F = arrayList;
        yr5Var.G = hashMap;
        yr5Var.H = s34Var;
    }

    public final int f(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        int i3 = this.l;
        int length = this.c.length;
        if (i2 < 0) {
            return (length - i3) + i2 + 1;
        }
        return i2;
    }

    public final int g(int i) {
        int i2;
        int i3 = this.l;
        if (i < this.k) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return (i3 * i2) + i;
    }

    public final void i() {
        boolean z;
        boolean z2;
        int i;
        int q;
        f44 f44Var;
        int i2 = 0;
        if (this.n > 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.t;
        int i4 = this.u;
        int i5 = this.v;
        int q2 = q(i5);
        int i6 = this.o;
        int i7 = i3 - i5;
        int i8 = q2 * 5;
        int i9 = i8 + 1;
        if ((this.b[i9] & 1073741824) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        l13 l13Var = this.r;
        if (z) {
            s34 s34Var = this.s;
            if (s34Var != null && (f44Var = (f44) s34Var.b(i5)) != null) {
                Object[] objArr = f44Var.a;
                int i10 = f44Var.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    G(objArr[i11]);
                }
            }
            int[] iArr = this.b;
            iArr[i8 + 3] = i7;
            as5.f(q2, i6, iArr);
            int d = l13Var.d();
            if (z2) {
                i6 = 1;
            }
            this.o = d + i6;
            int F = F(this.b, i5);
            this.v = F;
            if (F < 0) {
                q = o();
            } else {
                q = q(F + 1);
            }
            if (q >= 0) {
                i2 = f(this.b, q);
            }
            this.i = i2;
            this.j = i2;
            return;
        }
        if (i3 != i4) {
            eu0.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i12 = i8 + 3;
        int i13 = iArr2[i12];
        int i14 = iArr2[i9] & 67108863;
        iArr2[i12] = i7;
        as5.f(q2, i6, iArr2);
        int d2 = this.p.d();
        this.u = (n() - this.h) - this.q.d();
        this.v = d2;
        int F2 = F(this.b, i5);
        int d3 = l13Var.d();
        this.o = d3;
        if (F2 == d2) {
            if (!z2) {
                i2 = i6 - i14;
            }
            this.o = d3 + i2;
            return;
        }
        int i15 = i7 - i13;
        if (z2) {
            i = 0;
        } else {
            i = i6 - i14;
        }
        if (i15 != 0 || i != 0) {
            while (F2 != 0 && F2 != d2 && (i != 0 || i15 != 0)) {
                int q3 = q(F2);
                if (i15 != 0) {
                    int[] iArr3 = this.b;
                    int i16 = (q3 * 5) + 3;
                    iArr3[i16] = iArr3[i16] + i15;
                }
                if (i != 0) {
                    int[] iArr4 = this.b;
                    as5.f(q3, (iArr4[(q3 * 5) + 1] & 67108863) + i, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(q3 * 5) + 1] & 1073741824) != 0) {
                    i = 0;
                }
                F2 = F(iArr5, F2);
            }
        }
        this.o += i;
    }

    public final void j() {
        if (this.n <= 0) {
            ds4.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                eu0.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.d();
        }
    }

    public final void k(int i) {
        boolean z;
        boolean z2 = false;
        if (this.n <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            eu0.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z2 = true;
            }
            if (!z2) {
                eu0.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            Q();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0137, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r20, defpackage.ic2 r21) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bs5.m(int, ic2):void");
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = (q * 5) + 1;
        if ((iArr[i2] & 268435456) != 0) {
            return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iArr, q)];
        }
        return au0.a;
    }

    public final int q(int i) {
        int i2;
        int i3 = this.h;
        if (i < this.g) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return (i3 * i2) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int q = q(i);
        int[] iArr = this.b;
        int i2 = q * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
        }
        return null;
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        int i = this.t;
        int i2 = this.u;
        int o = o();
        int i3 = this.g;
        int i4 = this.h + i3;
        StringBuilder u = qx1.u("SlotWriter(current = ", i, " end=", i2, " size = ");
        h11.y(u, o, " gap=", i3, "-");
        return zo5.k(i4, ")", u);
    }

    public final boolean u(int i, int i2) {
        int n;
        int t;
        if (i2 == this.v) {
            n = this.u;
        } else {
            l13 l13Var = this.p;
            if (i2 > l13Var.c(0)) {
                t = t(i2);
            } else {
                int[] iArr = l13Var.a;
                int min = Math.min(iArr.length, l13Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 < min) {
                        if (iArr[i3] == i2) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 < 0) {
                    t = t(i2);
                } else {
                    n = (n() - this.h) - this.q.a[i3];
                }
            }
            n = t + i2;
        }
        if (i <= i2 || i >= n) {
            return false;
        }
        return true;
    }

    public final void v(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.t;
            A(i3);
            int i4 = this.g;
            int i5 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                ms.w0(0, 0, i4 * 5, iArr, iArr2);
                ms.w0((i4 + i8) * 5, (i5 + i4) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i5 = i8;
                iArr = iArr2;
            }
            int i9 = this.u;
            if (i9 >= i4) {
                this.u = i9 + i;
            }
            int i10 = i4 + i;
            this.g = i10;
            this.h = i5 - i;
            if (i6 > 0) {
                i2 = f(iArr, q(i3 + i));
            } else {
                i2 = 0;
            }
            if (this.m >= i4) {
                i7 = this.k;
            }
            int h = h(i2, i7, this.l, this.c.length);
            for (int i11 = i4; i11 < i10; i11++) {
                this.b[(i11 * 5) + 4] = h;
            }
            int i12 = this.m;
            if (i12 >= i4) {
                this.m = i12 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        if ((this.b[(q(i) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final void z(yr5 yr5Var, int i) {
        if (this.n <= 0) {
            eu0.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.y == 0) {
            int[] iArr = yr5Var.x;
            int i2 = iArr[(i * 5) + 3];
            int i3 = yr5Var.y;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap hashMap = this.e;
                s34 s34Var = this.f;
                Object[] objArr2 = yr5Var.z;
                int i4 = yr5Var.A;
                HashMap hashMap2 = yr5Var.G;
                s34 s34Var2 = yr5Var.H;
                this.b = iArr;
                this.c = objArr2;
                this.d = yr5Var.F;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = hashMap2;
                this.f = s34Var2;
                yr5Var.x = iArr2;
                yr5Var.y = 0;
                yr5Var.z = objArr;
                yr5Var.A = 0;
                yr5Var.F = arrayList;
                yr5Var.G = hashMap;
                yr5Var.H = s34Var;
                return;
            }
        }
        bs5 h = yr5Var.h();
        try {
            h98.H(h, i, this, true, true, false);
            h.e(true);
        } catch (Throwable th) {
            h.e(false);
            throw th;
        }
    }
}
