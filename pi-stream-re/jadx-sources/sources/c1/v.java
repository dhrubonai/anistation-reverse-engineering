package c1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public final class v {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public int J;

    /* renamed from: a, reason: collision with root package name */
    public final String f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1924b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1925c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1926d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1927e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1928f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1929g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1930h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1931i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1932j;

    /* renamed from: k, reason: collision with root package name */
    public final p0 f1933k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1934l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1935m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1936n;
    public final List o;

    /* renamed from: p, reason: collision with root package name */
    public final p f1937p;

    /* renamed from: q, reason: collision with root package name */
    public final long f1938q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1939r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1940s;

    /* renamed from: t, reason: collision with root package name */
    public final float f1941t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1942u;

    /* renamed from: v, reason: collision with root package name */
    public final float f1943v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f1944w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1945x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1946y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1947z;

    static {
        new u().a();
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
        f1.b0.J(6);
        f1.b0.J(7);
        f1.b0.J(8);
        f1.b0.J(9);
        f1.b0.J(10);
        f1.b0.J(11);
        f1.b0.J(12);
        f1.b0.J(13);
        f1.b0.J(14);
        f1.b0.J(15);
        f1.b0.J(16);
        f1.b0.J(17);
        f1.b0.J(18);
        f1.b0.J(19);
        f1.b0.J(20);
        f1.b0.J(21);
        f1.b0.J(22);
        f1.b0.J(23);
        f1.b0.J(24);
        f1.b0.J(25);
        f1.b0.J(26);
        f1.b0.J(27);
        f1.b0.J(28);
        f1.b0.J(29);
        f1.b0.J(30);
        f1.b0.J(31);
        f1.b0.J(32);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [c1.t] */
    public v(final u uVar) {
        Stream stream;
        boolean anyMatch;
        boolean z9;
        String str;
        this.f1923a = uVar.f1897a;
        String P = f1.b0.P(uVar.f1900d);
        this.f1926d = P;
        if (uVar.f1899c.isEmpty() && uVar.f1898b != null) {
            this.f1925c = r6.o0.o(new x(P, uVar.f1898b));
            this.f1924b = uVar.f1898b;
        } else if (!uVar.f1899c.isEmpty() && uVar.f1898b == null) {
            List list = uVar.f1899c;
            this.f1925c = list;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    x xVar = (x) it.next();
                    if (TextUtils.equals(xVar.f1950a, P)) {
                        str = xVar.f1951b;
                        break;
                    }
                } else {
                    str = ((x) list.get(0)).f1951b;
                    break;
                }
            }
            this.f1924b = str;
        } else {
            if (!uVar.f1899c.isEmpty() || uVar.f1898b != null) {
                stream = uVar.f1899c.stream();
                anyMatch = stream.anyMatch(new Predicate() { // from class: c1.t
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((x) obj).f1951b.equals(u.this.f1898b);
                    }
                });
                if (!anyMatch) {
                    z9 = false;
                    w7.b.u(z9);
                    this.f1925c = uVar.f1899c;
                    this.f1924b = uVar.f1898b;
                }
            }
            z9 = true;
            w7.b.u(z9);
            this.f1925c = uVar.f1899c;
            this.f1924b = uVar.f1898b;
        }
        this.f1927e = uVar.f1901e;
        this.f1928f = uVar.f1902f;
        int i10 = uVar.f1903g;
        this.f1929g = i10;
        int i11 = uVar.f1904h;
        this.f1930h = i11;
        this.f1931i = i11 != -1 ? i11 : i10;
        this.f1932j = uVar.f1905i;
        this.f1933k = uVar.f1906j;
        this.f1934l = uVar.f1907k;
        this.f1935m = uVar.f1908l;
        this.f1936n = uVar.f1909m;
        List list2 = uVar.f1910n;
        this.o = list2 == null ? Collections.emptyList() : list2;
        p pVar = uVar.o;
        this.f1937p = pVar;
        this.f1938q = uVar.f1911p;
        this.f1939r = uVar.f1912q;
        this.f1940s = uVar.f1913r;
        this.f1941t = uVar.f1914s;
        int i12 = uVar.f1915t;
        this.f1942u = i12 == -1 ? 0 : i12;
        float f10 = uVar.f1916u;
        this.f1943v = f10 == -1.0f ? 1.0f : f10;
        this.f1944w = uVar.f1917v;
        this.f1945x = uVar.f1918w;
        this.f1946y = uVar.f1919x;
        this.f1947z = uVar.f1920y;
        this.A = uVar.f1921z;
        this.B = uVar.A;
        int i13 = uVar.B;
        this.C = i13 == -1 ? 0 : i13;
        int i14 = uVar.C;
        this.D = i14 != -1 ? i14 : 0;
        this.E = uVar.D;
        this.F = uVar.E;
        this.G = uVar.F;
        this.H = uVar.G;
        int i15 = uVar.H;
        if (i15 == 0 && pVar != null) {
            this.I = 1;
        } else {
            this.I = i15;
        }
    }

    public final u a() {
        return new u(this);
    }

    public final int b() {
        int i10;
        int i11 = this.f1939r;
        if (i11 == -1 || (i10 = this.f1940s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean c(v vVar) {
        List list = this.o;
        if (list.size() != vVar.o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) vVar.o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final v d(v vVar) {
        String str;
        float f10;
        String str2;
        p0 p0Var;
        p pVar;
        boolean z9;
        p0 p0Var2;
        int i10;
        boolean z10;
        boolean z11;
        if (this == vVar) {
            return this;
        }
        int i11 = q0.i(this.f1935m);
        String str3 = vVar.f1923a;
        String str4 = vVar.f1924b;
        if (str4 == null) {
            str4 = this.f1924b;
        }
        List list = vVar.f1925c;
        if (list.isEmpty()) {
            list = this.f1925c;
        }
        if ((i11 != 3 && i11 != 1) || (str = vVar.f1926d) == null) {
            str = this.f1926d;
        }
        int i12 = this.f1929g;
        if (i12 == -1) {
            i12 = vVar.f1929g;
        }
        int i13 = this.f1930h;
        if (i13 == -1) {
            i13 = vVar.f1930h;
        }
        String str5 = this.f1932j;
        if (str5 == null) {
            String s9 = f1.b0.s(i11, vVar.f1932j);
            if (f1.b0.b0(s9).length == 1) {
                str5 = s9;
            }
        }
        p0 p0Var3 = vVar.f1933k;
        p0 p0Var4 = this.f1933k;
        if (p0Var4 != null) {
            p0Var3 = p0Var4.e(p0Var3);
        }
        float f11 = this.f1941t;
        if (f11 == -1.0f && i11 == 2) {
            f11 = vVar.f1941t;
        }
        int i14 = this.f1927e | vVar.f1927e;
        int i15 = this.f1928f | vVar.f1928f;
        ArrayList arrayList = new ArrayList();
        p pVar2 = vVar.f1937p;
        if (pVar2 != null) {
            o[] oVarArr = pVar2.f1872a;
            int length = oVarArr.length;
            f10 = f11;
            int i16 = 0;
            while (i16 < length) {
                int i17 = length;
                o oVar = oVarArr[i16];
                o[] oVarArr2 = oVarArr;
                if (oVar.f1871e != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(oVar);
                }
                i16++;
                length = i17;
                oVarArr = oVarArr2;
            }
            str2 = pVar2.f1874c;
        } else {
            f10 = f11;
            str2 = null;
        }
        p pVar3 = this.f1937p;
        if (pVar3 != null) {
            if (str2 == null) {
                str2 = pVar3.f1874c;
            }
            int size = arrayList.size();
            o[] oVarArr3 = pVar3.f1872a;
            int length2 = oVarArr3.length;
            String str6 = str2;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = length2;
                o oVar2 = oVarArr3[i18];
                o[] oVarArr4 = oVarArr3;
                if (oVar2.f1871e != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int i20 = 0;
                    while (true) {
                        if (i20 < size) {
                            i10 = size;
                            p0Var2 = p0Var3;
                            if (((o) arrayList.get(i20)).f1868b.equals(oVar2.f1868b)) {
                                z10 = true;
                                break;
                            }
                            i20++;
                            p0Var3 = p0Var2;
                            size = i10;
                        } else {
                            p0Var2 = p0Var3;
                            i10 = size;
                            z10 = false;
                            break;
                        }
                    }
                    if (!z10) {
                        arrayList.add(oVar2);
                    }
                } else {
                    p0Var2 = p0Var3;
                    i10 = size;
                }
                i18++;
                length2 = i19;
                oVarArr3 = oVarArr4;
                p0Var3 = p0Var2;
                size = i10;
            }
            p0Var = p0Var3;
            str2 = str6;
        } else {
            p0Var = p0Var3;
        }
        if (arrayList.isEmpty()) {
            pVar = null;
        } else {
            pVar = new p(str2, arrayList);
        }
        u uVar = new u(this);
        uVar.f1897a = str3;
        uVar.f1898b = str4;
        uVar.d(list);
        uVar.f1900d = str;
        uVar.f1901e = i14;
        uVar.f1902f = i15;
        uVar.f1903g = i12;
        uVar.f1904h = i13;
        uVar.f1905i = str5;
        uVar.f1906j = p0Var;
        uVar.o = pVar;
        uVar.f1914s = f10;
        uVar.F = vVar.G;
        uVar.G = vVar.H;
        return new v(uVar);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        int i11 = this.J;
        if (i11 != 0 && (i10 = vVar.J) != 0 && i11 != i10) {
            return false;
        }
        if (this.f1927e == vVar.f1927e && this.f1928f == vVar.f1928f && this.f1929g == vVar.f1929g && this.f1930h == vVar.f1930h && this.f1936n == vVar.f1936n && this.f1938q == vVar.f1938q && this.f1939r == vVar.f1939r && this.f1940s == vVar.f1940s && this.f1942u == vVar.f1942u && this.f1945x == vVar.f1945x && this.f1947z == vVar.f1947z && this.A == vVar.A && this.B == vVar.B && this.C == vVar.C && this.D == vVar.D && this.E == vVar.E && this.G == vVar.G && this.H == vVar.H && this.I == vVar.I && Float.compare(this.f1941t, vVar.f1941t) == 0 && Float.compare(this.f1943v, vVar.f1943v) == 0 && f1.b0.a(this.f1923a, vVar.f1923a) && f1.b0.a(this.f1924b, vVar.f1924b) && this.f1925c.equals(vVar.f1925c) && f1.b0.a(this.f1932j, vVar.f1932j) && f1.b0.a(this.f1934l, vVar.f1934l) && f1.b0.a(this.f1935m, vVar.f1935m) && f1.b0.a(this.f1926d, vVar.f1926d) && Arrays.equals(this.f1944w, vVar.f1944w) && f1.b0.a(this.f1933k, vVar.f1933k) && f1.b0.a(this.f1946y, vVar.f1946y) && f1.b0.a(this.f1937p, vVar.f1937p) && c(vVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.J == 0) {
            int i10 = 0;
            String str = this.f1923a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f1924b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f1925c.hashCode() + ((i11 + hashCode2) * 31)) * 31;
            String str3 = this.f1926d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (((((((((hashCode7 + hashCode3) * 31) + this.f1927e) * 31) + this.f1928f) * 31) + this.f1929g) * 31) + this.f1930h) * 31;
            String str4 = this.f1932j;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            p0 p0Var = this.f1933k;
            if (p0Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = p0Var.hashCode();
            }
            int i14 = (i13 + hashCode5) * 31;
            String str5 = this.f1934l;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            String str6 = this.f1935m;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            this.J = ((((((((((((((((((((Float.floatToIntBits(this.f1943v) + ((((Float.floatToIntBits(this.f1941t) + ((((((((((i15 + i10) * 31) + this.f1936n) * 31) + ((int) this.f1938q)) * 31) + this.f1939r) * 31) + this.f1940s) * 31)) * 31) + this.f1942u) * 31)) * 31) + this.f1945x) * 31) + this.f1947z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.G) * 31) + this.H) * 31) + this.I;
        }
        return this.J;
    }

    public final String toString() {
        return "Format(" + this.f1923a + ", " + this.f1924b + ", " + this.f1934l + ", " + this.f1935m + ", " + this.f1932j + ", " + this.f1931i + ", " + this.f1926d + ", [" + this.f1939r + ", " + this.f1940s + ", " + this.f1941t + ", " + this.f1946y + "], [" + this.f1947z + ", " + this.A + "])";
    }
}
