package o7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import r6.h0;

/* loaded from: classes.dex */
public abstract class j extends h {
    /* JADX WARN: Multi-variable type inference failed */
    public static List A1(CharSequence charSequence, char[] cArr) {
        h0.u(charSequence, "<this>");
        int i10 = 0;
        Object[] objArr = 0;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            z1(0);
            int n12 = n1(0, charSequence, valueOf, false);
            if (n12 != -1) {
                ArrayList arrayList = new ArrayList(10);
                int i11 = 0;
                do {
                    arrayList.add(charSequence.subSequence(i11, n12).toString());
                    i11 = valueOf.length() + n12;
                    n12 = n1(i11, charSequence, valueOf, false);
                } while (n12 != -1);
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
                return arrayList;
            }
            return com.bumptech.glide.c.L(charSequence.toString());
        }
        z1(0);
        n7.g gVar = new n7.g(new c(charSequence, 0, 0, new i(i10, cArr, objArr == true ? 1 : 0)));
        ArrayList arrayList2 = new ArrayList(x6.j.o0(gVar));
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(D1(charSequence, (l7.f) it.next()));
        }
        return arrayList2;
    }

    public static final boolean B1(String str, String str2, int i10, boolean z9) {
        h0.u(str, "<this>");
        if (!z9) {
            return str.startsWith(str2, i10);
        }
        return v1(i10, 0, str2.length(), str, str2, z9);
    }

    public static final boolean C1(String str, String str2, boolean z9) {
        h0.u(str, "<this>");
        h0.u(str2, "prefix");
        if (!z9) {
            return str.startsWith(str2);
        }
        return v1(0, 0, str2.length(), str, str2, z9);
    }

    public static final String D1(CharSequence charSequence, l7.f fVar) {
        h0.u(charSequence, "<this>");
        h0.u(fVar, "range");
        return charSequence.subSequence(Integer.valueOf(fVar.f6882a).intValue(), Integer.valueOf(fVar.f6883b).intValue() + 1).toString();
    }

    public static String E1(String str, String str2) {
        h0.u(str2, "delimiter");
        int q12 = q1(str, str2, 0, false, 6);
        if (q12 != -1) {
            String substring = str.substring(str2.length() + q12, str.length());
            h0.s(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String F1(String str) {
        h0.u(str, "<this>");
        h0.u(str, "missingDelimiterValue");
        int t12 = t1(str, '.', 0, 6);
        if (t12 != -1) {
            String substring = str.substring(t12 + 1, str.length());
            h0.s(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final CharSequence G1(CharSequence charSequence) {
        int i10;
        h0.u(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z9 = false;
        while (i11 <= length) {
            if (!z9) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean J = com.bumptech.glide.c.J(charSequence.charAt(i10));
            if (!z9) {
                if (!J) {
                    z9 = true;
                } else {
                    i11++;
                }
            } else {
                if (!J) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static boolean j1(CharSequence charSequence, String str) {
        h0.u(charSequence, "<this>");
        if (q1(charSequence, str, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean k1(String str, String str2) {
        h0.u(str, "<this>");
        return str.endsWith(str2);
    }

    public static final boolean l1(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final int m1(CharSequence charSequence) {
        h0.u(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int n1(int i10, CharSequence charSequence, String str, boolean z9) {
        h0.u(charSequence, "<this>");
        h0.u(str, "string");
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return o1(charSequence, str, i10, charSequence.length(), z9, false);
    }

    public static final int o1(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10) {
        l7.d dVar;
        if (!z10) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            dVar = new l7.f(i10, i11);
        } else {
            int m12 = m1(charSequence);
            if (i10 > m12) {
                i10 = m12;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            dVar = new l7.d(i10, i11, -1);
        }
        boolean z11 = charSequence instanceof String;
        int i12 = dVar.f6882a;
        int i13 = dVar.f6884c;
        int i14 = dVar.f6883b;
        if (z11 && (charSequence2 instanceof String)) {
            if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
                while (!v1(0, i12, charSequence2.length(), (String) charSequence2, (String) charSequence, z9)) {
                    if (i12 != i14) {
                        i12 += i13;
                    }
                }
                return i12;
            }
        } else if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
            while (!w1(charSequence2, 0, charSequence, i12, charSequence2.length(), z9)) {
                if (i12 != i14) {
                    i12 += i13;
                }
            }
            return i12;
        }
        return -1;
    }

    public static int p1(CharSequence charSequence, char c6, int i10, boolean z9, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        h0.u(charSequence, "<this>");
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c6, i10);
        }
        return r1(i10, charSequence, z9, new char[]{c6});
    }

    public static /* synthetic */ int q1(CharSequence charSequence, String str, int i10, boolean z9, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return n1(i10, charSequence, str, z9);
    }

    public static final int r1(int i10, CharSequence charSequence, boolean z9, char[] cArr) {
        boolean z10;
        h0.u(charSequence, "<this>");
        h0.u(cArr, "chars");
        if (!z9 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(x6.i.m1(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        l7.e it = new l7.f(i10, m1(charSequence)).iterator();
        while (it.f6887c) {
            int b10 = it.b();
            char charAt = charSequence.charAt(b10);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (com.bumptech.glide.c.q(cArr[i11], charAt, z9)) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return b10;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean s1(String str) {
        boolean z9;
        h0.u(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        l7.f fVar = new l7.f(0, str.length() - 1);
        if (!(fVar instanceof Collection) || !((Collection) fVar).isEmpty()) {
            l7.e it = fVar.iterator();
            while (it.f6887c) {
                if (!com.bumptech.glide.c.J(str.charAt(it.b()))) {
                    z9 = false;
                    break;
                }
            }
        }
        z9 = true;
        if (z9) {
            return true;
        }
        return false;
    }

    public static int t1(CharSequence charSequence, char c6, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = m1(charSequence);
        }
        h0.u(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c6};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(x6.i.m1(cArr), i10);
            }
            int m12 = m1(charSequence);
            if (i10 > m12) {
                i10 = m12;
            }
            while (-1 < i10) {
                if (com.bumptech.glide.c.q(cArr[0], charSequence.charAt(i10), false)) {
                    return i10;
                }
                i10--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c6, i10);
    }

    public static String u1(String str, int i10) {
        CharSequence charSequence;
        h0.u(str, "<this>");
        if (i10 >= 0) {
            if (i10 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i10);
                sb.append((CharSequence) str);
                l7.e it = new l7.f(1, i10 - str.length()).iterator();
                while (it.f6887c) {
                    it.b();
                    sb.append(' ');
                }
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(a3.g.o("Desired length ", i10, " is less than zero."));
    }

    public static final boolean v1(int i10, int i11, int i12, String str, String str2, boolean z9) {
        h0.u(str, "<this>");
        h0.u(str2, "other");
        if (!z9) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z9, i10, str2, i11, i12);
    }

    public static final boolean w1(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z9) {
        h0.u(charSequence, "<this>");
        h0.u(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!com.bumptech.glide.c.q(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z9)) {
                return false;
            }
        }
        return true;
    }

    public static final String x1(String str, String str2) {
        if (C1(str2, str, false)) {
            String substring = str2.substring(str.length());
            h0.s(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    public static String y1(String str, String str2, String str3) {
        h0.u(str, "<this>");
        int n12 = n1(0, str, str2, false);
        if (n12 >= 0) {
            int length = str2.length();
            int i10 = 1;
            if (length >= 1) {
                i10 = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i11 = 0;
                do {
                    sb.append((CharSequence) str, i11, n12);
                    sb.append(str3);
                    i11 = n12 + length;
                    if (n12 >= str.length()) {
                        break;
                    }
                    n12 = n1(n12 + i10, str, str2, false);
                } while (n12 > 0);
                sb.append((CharSequence) str, i11, str.length());
                String sb2 = sb.toString();
                h0.s(sb2, "toString(...)");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static final void z1(int i10) {
        boolean z9;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
        } else {
            throw new IllegalArgumentException(a3.g.n("Limit must be non-negative, but was ", i10).toString());
        }
    }
}
