package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class vz5 extends ct5 {
    public static String t(String str) {
        byte b = 4;
        return wi5.r0(new u22(new os(str, b), new zg("    ", (byte) 24), b), "\n", null, 62);
    }

    public static String u(String str) {
        Comparable comparable;
        int i;
        String str2;
        List Z = uz5.Z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : Z) {
            if (!uz5.V((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zo0.V(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (!t80.c0(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 == -1) {
                i4 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i4));
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length2 = str.length();
        Z.size();
        int size2 = Z.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : Z) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                String str4 = (String) obj3;
                if ((i2 == 0 || i2 == size2) && uz5.V(str4)) {
                    str2 = null;
                } else {
                    str4.getClass();
                    if (i >= 0) {
                        int length3 = str4.length();
                        if (i <= length3) {
                            length3 = i;
                        }
                        str2 = str4.substring(length3);
                    } else {
                        ze0.e(qx1.i(i, "Requested character count ", " is less than zero."));
                        return null;
                    }
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i2 = i5;
            } else {
                te4.R();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        yo0.p0(arrayList3, sb, "\n", null, 124);
        return sb.toString();
    }

    public static String v(String str) {
        String substring;
        if (!uz5.V("|")) {
            List Z = uz5.Z(str);
            int length = str.length();
            Z.size();
            int size = Z.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : Z) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) obj;
                    if ((i == 0 || i == size) && uz5.V(str2)) {
                        str2 = null;
                    } else {
                        int length2 = str2.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                if (!t80.c0(str2.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 == -1 || !b06.H(i3, str2, "|", false)) {
                            substring = null;
                        } else {
                            substring = str2.substring("|".length() + i3);
                        }
                        if (substring != null) {
                            str2 = substring;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i = i2;
                } else {
                    te4.R();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            yo0.p0(arrayList, sb, "\n", null, 124);
            return sb.toString();
        }
        ze0.k("marginPrefix must be non-blank string.");
        return null;
    }
}
