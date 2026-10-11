package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class mi0 {
    public static final c15 a = new c15("(\\d+):(\\d{1,2}):(\\d{1,2})[.:,](\\d{1,3})");
    public static final c15 b = new c15("\\\\p([0-9]+)|\\\\q([0-3])");
    public static final Set c = ms.U0(new String[]{"b", "i", "u", "s", "strike", "font", "span", "br"});
    public static final c15 d = new c15("&(#(?:[0-9]{1,7}|[xX][0-9a-fA-F]{1,6})|amp|lt|gt|quot|apos|nbsp|lrm|rlm);");
    public static final Map e = vn3.T(new ai4("amp", "&"), new ai4("lt", "<"), new ai4("gt", ">"), new ai4("quot", "\""), new ai4("apos", "'"), new ai4("nbsp", " "), new ai4("lrm", "\u200e"), new ai4("rlm", "\u200f"));
    public static final ji0 f = new ji0(10, 1, 2, 9);

    public static String a(ni5 ni5Var) {
        Iterator it;
        ArrayList arrayList;
        Long g;
        int i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ni5Var.iterator();
        int i2 = 0;
        ji0 ji0Var = f;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        ji0 ji0Var2 = ji0Var;
        while (it2.hasNext()) {
            String c0 = uz5.c0(uz5.w0((String) it2.next()).toString(), "\ufeff");
            if (uz5.k0(c0, '[') && uz5.P(c0, ']')) {
                z2 = c0.equalsIgnoreCase("[Events]");
                z = c0.equalsIgnoreCase("[Script Info]");
                it = it2;
                ji0Var2 = ji0Var;
            } else {
                String obj = uz5.w0(uz5.p0(c0, ':')).toString();
                String l0 = uz5.l0(':', c0, "");
                int i4 = 4;
                if (z && b06.C(obj, "WrapStyle", true)) {
                    Integer K = b06.K(uz5.w0(l0).toString());
                    if (K != null) {
                        int intValue = K.intValue();
                        if (intValue < 0 || intValue >= 4) {
                            K = null;
                        }
                        if (K != null) {
                            i3 = K.intValue();
                        }
                    }
                    i3 = i2;
                }
                if (z2) {
                    if (b06.C(obj, "Format", true)) {
                        char[] cArr = new char[1];
                        cArr[i2] = ',';
                        List h0 = uz5.h0(l0, cArr, 2);
                        ArrayList arrayList3 = new ArrayList(zo0.V(h0, 10));
                        Iterator it3 = h0.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(uz5.w0((String) it3.next()).toString());
                        }
                        if (arrayList3.size() <= 32) {
                            int size = arrayList3.size();
                            int i5 = i2;
                            int i6 = i5;
                            while (true) {
                                if (i6 < size) {
                                    Object obj2 = arrayList3.get(i6);
                                    i6++;
                                    if (b06.C((String) obj2, "Start", true)) {
                                        break;
                                    }
                                    i5++;
                                } else {
                                    i5 = -1;
                                    break;
                                }
                            }
                            int size2 = arrayList3.size();
                            int i7 = i2;
                            int i8 = i7;
                            while (true) {
                                if (i8 < size2) {
                                    Object obj3 = arrayList3.get(i8);
                                    i8++;
                                    if (b06.C((String) obj3, "End", true)) {
                                        break;
                                    }
                                    i7++;
                                } else {
                                    i7 = -1;
                                    break;
                                }
                            }
                            int size3 = arrayList3.size();
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i10 < size3) {
                                    Object obj4 = arrayList3.get(i10);
                                    i10++;
                                    if (b06.C((String) obj4, "Text", true)) {
                                        i = i9;
                                        break;
                                    }
                                    i9++;
                                } else {
                                    i = -1;
                                    break;
                                }
                            }
                            if (i5 >= 0 && i7 >= 0 && i >= 0) {
                                ji0Var2 = new ji0(arrayList3.size(), i5, i7, i);
                            }
                        }
                        ji0Var2 = null;
                    } else if (b06.C(obj, "Dialogue", true) && ji0Var2 != null) {
                        int i11 = ji0Var2.d;
                        int i12 = ji0Var2.a;
                        ArrayList arrayList4 = new ArrayList(i12);
                        for (int i13 = 0; i13 < i12; i13++) {
                            arrayList4.add("");
                        }
                        int length = l0.length();
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i15 < i11) {
                                it = it2;
                                int S = uz5.S(l0, ',', i14, 4);
                                if (S < 0) {
                                    break;
                                }
                                arrayList4.set(i15, l0.substring(i14, S));
                                i14 = S + 1;
                                i15++;
                                it2 = it;
                            } else {
                                it = it2;
                                int i16 = i12 - 1;
                                int i17 = i11 + 1;
                                if (i17 <= i16) {
                                    while (true) {
                                        int Y = uz5.Y(l0, ',', length - 1, i4);
                                        if (Y < i14) {
                                            break;
                                        }
                                        arrayList4.set(i16, l0.substring(Y + 1, length));
                                        if (i16 != i17) {
                                            i16--;
                                            length = Y;
                                            i4 = 4;
                                        } else {
                                            length = Y;
                                            break;
                                        }
                                    }
                                }
                                arrayList4.set(i11, l0.substring(i14, length));
                                arrayList = arrayList4;
                            }
                        }
                        arrayList = null;
                        if (arrayList != null && (g = g((String) arrayList.get(ji0Var2.b))) != null) {
                            long longValue = g.longValue();
                            Long g2 = g((String) arrayList.get(ji0Var2.c));
                            if (g2 != null) {
                                long longValue2 = g2.longValue();
                                if (longValue2 > longValue) {
                                    String d2 = d(i3, (String) arrayList.get(i11));
                                    if (!uz5.V(d2)) {
                                        arrayList2.add(new ii0(longValue, d2, longValue2));
                                    }
                                }
                            }
                        }
                    }
                }
                it = it2;
            }
            it2 = it;
            i2 = 0;
        }
        return b(c(arrayList2));
    }

    public static String b(List list) {
        StringBuilder sb = new StringBuilder("WEBVTT\n\n");
        for (ii0 ii0Var : yo0.C0(list, new k82((byte) 8))) {
            sb.append(e(ii0Var.a));
            sb.append(" --> ");
            sb.append(e(ii0Var.b));
            sb.append('\n');
            sb.append(ii0Var.c);
            sb.append("\n\n");
        }
        return sb.toString();
    }

    public static List c(ArrayList arrayList) {
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(zo0.V(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i >= 0) {
                arrayList3.add(new ki0((ii0) obj, i));
                i = i3;
            } else {
                te4.R();
                throw null;
            }
        }
        byte b2 = 2;
        for (ki0 ki0Var : yo0.C0(arrayList3, jf7.r(new hi0((byte) 0), new hi0((byte) 1)))) {
            ki0 ki0Var2 = (ki0) yo0.s0(arrayList2);
            if (ki0Var2 != null) {
                ii0 ii0Var = ki0Var2.a;
                String str = ii0Var.c;
                long j = ii0Var.b;
                ii0 ii0Var2 = ki0Var.a;
                if (str.equals(ii0Var2.c) && ii0Var2.a <= 80 + j) {
                    arrayList2.set(arrayList2.size() - 1, new ki0(new ii0(ii0Var.a, ii0Var.c, Math.max(j, ii0Var2.b)), Math.min(ki0Var2.b, ki0Var.b)));
                }
            }
            arrayList2.add(ki0Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ii0 ii0Var3 = ((ki0) obj2).a;
            if (ii0Var3.b - ii0Var3.a >= 80) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = arrayList2;
        if (!arrayList4.isEmpty()) {
            arrayList5 = arrayList4;
        }
        int size3 = arrayList5.size();
        Collection collection = arrayList5;
        if (size3 > 4000) {
            collection = yo0.D0(yo0.C0(arrayList5, new n00(new k82((byte) 9), b2)), 4000);
        }
        List C0 = yo0.C0(collection, jf7.r(new hi0((byte) 2), new hi0((byte) 3)));
        ArrayList arrayList6 = new ArrayList(zo0.V(C0, 10));
        Iterator it = C0.iterator();
        while (it.hasNext()) {
            arrayList6.add(((ki0) it.next()).a);
        }
        return arrayList6;
    }

    public static String d(int i, String str) {
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        boolean z = false;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt == '{') {
                int i4 = i3 + 1;
                int S = uz5.S(str, '}', i4, 4);
                if (S < 0) {
                    break;
                }
                xd2 xd2Var = new xd2(c15.a(b, str.substring(i4, S)));
                while (xd2Var.hasNext()) {
                    do3 do3Var = (do3) xd2Var.next();
                    if (do3Var.c.c(1) != null) {
                        CharSequence charSequence = (CharSequence) ((bo3) do3Var.a()).get(1);
                        int i5 = 0;
                        while (true) {
                            if (i5 < charSequence.length()) {
                                if (charSequence.charAt(i5) != '0') {
                                    z = true;
                                    break;
                                }
                                i5++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        i = Integer.parseInt((String) ((bo3) do3Var.a()).get(2));
                    }
                }
                i3 = S + 1;
            } else {
                if (!z) {
                    Character ch = null;
                    if (charAt == '\\' && (i2 = i3 + 1) >= 0 && i2 < str.length()) {
                        ch = Character.valueOf(str.charAt(i2));
                    }
                    char c2 = '\n';
                    if (ch != null && ch.charValue() == 'N') {
                        sb.append('\n');
                    } else if (ch != null && ch.charValue() == 'n') {
                        if (i != 2) {
                            c2 = ' ';
                        }
                        sb.append(c2);
                    } else if (ch != null && ch.charValue() == 'h') {
                        sb.append((char) 160);
                    } else {
                        if (charAt == 0) {
                            charAt = 65533;
                        }
                        sb.append(charAt);
                    }
                    if ((ch != null && ch.charValue() == 'N') || ((ch != null && ch.charValue() == 'n') || (ch != null && ch.charValue() == 'h'))) {
                        i3++;
                    }
                }
                i3++;
            }
        }
        return wi5.r0(new d32(new u22(new os(sb.toString(), (byte) 4), new hi0((byte) 4), (byte) 4), true, li0.x), "\n", new hi0((byte) 5), 30);
    }

    public static String e(long j) {
        String a0 = uz5.a0(2, String.valueOf(j / 3600000));
        String a02 = uz5.a0(2, String.valueOf((j / 60000) % 60));
        String a03 = uz5.a0(2, String.valueOf((j / 1000) % 60));
        String a04 = uz5.a0(3, String.valueOf(j % 1000));
        StringBuilder sb = new StringBuilder();
        sb.append(a0);
        sb.append(":");
        sb.append(a02);
        sb.append(":");
        sb.append(a03);
        return h11.k(sb, ".", a04);
    }

    public static ii0 f(ArrayList arrayList) {
        int i;
        Long g;
        CharSequence charSequence;
        String str;
        String str2 = (String) yo0.m0(arrayList);
        if (str2 != null && uz5.M(str2, "-->", false)) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = i ^ 1;
        String str3 = (String) yo0.n0(i2, arrayList);
        if (str3 != null) {
            List i0 = uz5.i0(str3, new String[]{"-->"}, 2);
            if (i0.size() == 2 && (g = g((String) i0.get(0))) != null) {
                long longValue = g.longValue();
                String str4 = (String) i0.get(1);
                str4.getClass();
                int length = str4.length();
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (!t80.c0(str4.charAt(i3))) {
                            charSequence = str4.subSequence(i3, str4.length());
                            break;
                        }
                        i3++;
                    } else {
                        charSequence = "";
                        break;
                    }
                }
                String obj = charSequence.toString();
                int length2 = obj.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    if (t80.c0(obj.charAt(i4))) {
                        obj = obj.substring(0, i4);
                        break;
                    }
                    i4++;
                }
                Long g2 = g(obj);
                if (g2 != null) {
                    long longValue2 = g2.longValue();
                    if (longValue2 > longValue) {
                        String q0 = yo0.q0(yo0.g0(arrayList, i2 + 1), "\n", null, null, null, 62);
                        StringBuilder sb = new StringBuilder();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= q0.length()) {
                                break;
                            }
                            if (q0.charAt(i5) != '<') {
                                sb.append(q0.charAt(i5));
                                i5++;
                            } else {
                                int i6 = i5 + 1;
                                int S = uz5.S(q0, '>', i6, 4);
                                if (S < 0) {
                                    sb.append((CharSequence) q0, i5, q0.length());
                                    break;
                                }
                                String x0 = uz5.x0(uz5.p0(uz5.p0(uz5.w0(q0.substring(i6, S)).toString(), ' '), '\t'), '/');
                                Locale locale = Locale.ROOT;
                                locale.getClass();
                                String lowerCase = x0.toLowerCase(locale);
                                lowerCase.getClass();
                                if (lowerCase.equals("br")) {
                                    sb.append('\n');
                                } else if (!c.contains(lowerCase)) {
                                    sb.append((CharSequence) q0, i5, S + 1);
                                }
                                i5 = S + 1;
                            }
                        }
                        String d2 = d(0, d.c(sb.toString(), new hi0((byte) 6)));
                        if (!uz5.V(d2)) {
                            str = d2;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            return new ii0(longValue, str, longValue2);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Long g(String str) {
        do3 do3Var;
        CharSequence charSequence;
        String obj = uz5.w0(str).toString();
        c15 c15Var = a;
        c15Var.getClass();
        obj.getClass();
        Matcher matcher = c15Var.x.matcher(obj);
        matcher.getClass();
        if (!matcher.matches()) {
            do3Var = null;
        } else {
            do3Var = new do3(matcher, obj);
        }
        if (do3Var != null) {
            int i = 1;
            Integer K = b06.K((String) ((bo3) do3Var.a()).get(1));
            if (K != null) {
                int intValue = K.intValue();
                int parseInt = Integer.parseInt((String) ((bo3) do3Var.a()).get(2));
                int parseInt2 = Integer.parseInt((String) ((bo3) do3Var.a()).get(3));
                if (parseInt <= 59 && parseInt2 <= 59) {
                    String str2 = (String) ((bo3) do3Var.a()).get(4);
                    str2.getClass();
                    if (3 <= str2.length()) {
                        charSequence = str2.subSequence(0, str2.length());
                    } else {
                        StringBuilder sb = new StringBuilder(3);
                        sb.append((CharSequence) str2);
                        int length = 3 - str2.length();
                        if (1 <= length) {
                            while (true) {
                                sb.append('0');
                                if (i == length) {
                                    break;
                                }
                                i++;
                            }
                        }
                        charSequence = sb;
                    }
                    return Long.valueOf((parseInt2 * 1000) + (parseInt * 60000) + (intValue * 3600000) + Integer.parseInt(charSequence.toString()));
                }
            }
        }
        return null;
    }
}
