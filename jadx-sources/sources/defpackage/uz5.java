package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class uz5 extends b06 {
    public static boolean M(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (T(charSequence, str, 0, z, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean N(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (S(charSequence, c, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean O(CharSequence charSequence, String str) {
        if (charSequence instanceof String) {
            return b06.A((String) charSequence, str, false);
        }
        return b0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean P(String str, char c) {
        if (str.length() <= 0 || !t80.E(str.charAt(str.length() - 1), c, false)) {
            return false;
        }
        return true;
    }

    public static int Q(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static final int R(CharSequence charSequence, String str, int i, boolean z) {
        int i2;
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        d13 d13Var = new d13(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = d13Var.z;
        int i4 = d13Var.y;
        int i5 = d13Var.x;
        if (z2 && (str instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (!b06.E(str, 0, (String) charSequence, i6, str.length(), z)) {
                    if (i6 != i4) {
                        i6 += i3;
                    }
                }
                return i6;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!b0(str, 0, charSequence, i5, str.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int S(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            return U(charSequence, new char[]{c}, i, false);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int T(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return R(charSequence, str, i, z);
    }

    public static final int U(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ms.R0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (t80.E(c, charAt, z)) {
                    return i;
                }
            }
            if (i != length) {
                i++;
            } else {
                return -1;
            }
        }
    }

    public static boolean V(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!t80.c0(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char W(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        p65.h("Char sequence is empty.");
        return (char) 0;
    }

    public static int X(int i, String str, String str2) {
        int i2;
        if ((i & 2) != 0) {
            i2 = Q(str);
        } else {
            i2 = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i2);
    }

    public static int Y(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = charSequence.length() - 1;
        }
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(ms.R0(cArr), i);
            }
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            while (-1 < i) {
                if (t80.E(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static List Z(CharSequence charSequence) {
        rh3 rh3Var = new rh3(charSequence);
        if (!rh3Var.hasNext()) {
            return nt1.x;
        }
        Object next = rh3Var.next();
        if (!rh3Var.hasNext()) {
            return te4.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (rh3Var.hasNext()) {
            arrayList.add(rh3Var.next());
        }
        return arrayList;
    }

    public static String a0(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append((CharSequence) str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        ze0.k(qx1.i(i, "Desired length ", " is less than zero."));
        return null;
    }

    public static final boolean b0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!t80.E(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String c0(String str, String str2) {
        str.getClass();
        if (j0(str, str2, false)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public static String d0(String str, String str2) {
        str.getClass();
        if (O(str, str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static StringBuilder e0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        ze0.g(qx1.l("End index (", i2, ") is less than start index (", i, ")."));
        return null;
    }

    public static final void f0(int i) {
        if (i >= 0) {
            return;
        }
        ze0.e(qx1.h(i, "Limit must be non-negative, but was "));
    }

    public static final List g0(String str, CharSequence charSequence, int i) {
        boolean z;
        f0(i);
        int R = R(charSequence, str, 0, false);
        if (R != -1 && i != 1) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = 10;
            if (z && i <= 10) {
                i2 = i;
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            do {
                arrayList.add(charSequence.subSequence(i3, R).toString());
                i3 = str.length() + R;
                if (z && arrayList.size() == i - 1) {
                    break;
                }
                R = R(charSequence, str, i3, false);
            } while (R != -1);
            arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            return arrayList;
        }
        return te4.H(charSequence.toString());
    }

    public static List h0(CharSequence charSequence, char[] cArr, int i) {
        int i2;
        if ((i & 4) != 0) {
            i2 = 0;
        } else {
            i2 = 33;
        }
        charSequence.getClass();
        if (cArr.length == 1) {
            return g0(String.valueOf(cArr[0]), charSequence, i2);
        }
        f0(i2);
        byte b = 2;
        ns nsVar = new ns(new sd1(charSequence, i2, new cu5(cArr, b)), b);
        ArrayList arrayList = new ArrayList(zo0.V(nsVar, 10));
        Iterator it = nsVar.iterator();
        while (true) {
            rd1 rd1Var = (rd1) it;
            if (rd1Var.hasNext()) {
                f13 f13Var = (f13) rd1Var.next();
                f13Var.getClass();
                arrayList.add(charSequence.subSequence(f13Var.x, f13Var.y + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static List i0(CharSequence charSequence, String[] strArr, int i) {
        int i2;
        byte b = 2;
        if ((i & 4) != 0) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        charSequence.getClass();
        byte b2 = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return g0(str, charSequence, i2);
            }
        }
        f0(i2);
        List asList = Arrays.asList(strArr);
        asList.getClass();
        ns nsVar = new ns(new sd1(charSequence, i2, new oa3(asList, b2)), b);
        ArrayList arrayList = new ArrayList(zo0.V(nsVar, 10));
        Iterator it = nsVar.iterator();
        while (true) {
            rd1 rd1Var = (rd1) it;
            if (rd1Var.hasNext()) {
                f13 f13Var = (f13) rd1Var.next();
                f13Var.getClass();
                arrayList.add(charSequence.subSequence(f13Var.x, f13Var.y + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static boolean j0(CharSequence charSequence, String str, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return b06.I((String) charSequence, str, false);
        }
        return b0(charSequence, 0, str, 0, str.length(), z);
    }

    public static boolean k0(String str, char c) {
        str.getClass();
        if (str.length() <= 0 || !t80.E(str.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static String l0(char c, String str, String str2) {
        int S = S(str, c, 0, 6);
        if (S == -1) {
            return str2;
        }
        return str.substring(S + 1, str.length());
    }

    public static String m0(String str, String str2, String str3) {
        int T = T(str, str2, 0, false, 6);
        if (T == -1) {
            return str3;
        }
        return str.substring(str2.length() + T, str.length());
    }

    public static String n0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int Y = Y(str, c, 0, 6);
        if (Y == -1) {
            return str2;
        }
        return str.substring(Y + 1, str.length());
    }

    public static String o0(String str) {
        str.getClass();
        str.getClass();
        int X = X(6, str, "/");
        if (X == -1) {
            return str;
        }
        return str.substring(1 + X, str.length());
    }

    public static String p0(String str, char c) {
        str.getClass();
        str.getClass();
        int S = S(str, c, 0, 6);
        if (S == -1) {
            return str;
        }
        return str.substring(0, S);
    }

    public static String q0(String str, String str2) {
        str.getClass();
        str.getClass();
        int T = T(str, str2, 0, false, 6);
        if (T == -1) {
            return str;
        }
        return str.substring(0, T);
    }

    public static String r0(String str) {
        str.getClass();
        str.getClass();
        int X = X(6, str, "?");
        if (X == -1) {
            return str;
        }
        return str.substring(0, X);
    }

    public static String s0(String str, char c) {
        int Y = Y(str, c, 0, 6);
        if (Y == -1) {
            return str;
        }
        return str.substring(0, Y);
    }

    public static CharSequence t0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i >= 0) {
            int length = charSequence.length();
            if (i > length) {
                i = length;
            }
            return charSequence.subSequence(0, i);
        }
        ze0.e(qx1.i(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static String u0(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        ze0.e(qx1.i(i, "Requested character count ", " is less than zero."));
        return null;
    }

    public static String v0(String str) {
        str.getClass();
        int length = str.length();
        int i = 2;
        if (2 > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static CharSequence w0(CharSequence charSequence) {
        int i;
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean c0 = t80.c0(charSequence.charAt(i));
            if (!z) {
                if (!c0) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!c0) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String x0(String str, char... cArr) {
        int i;
        boolean z;
        str.getClass();
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            char charAt = str.charAt(i);
            int length2 = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    if (charAt == cArr[i3]) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }
}
