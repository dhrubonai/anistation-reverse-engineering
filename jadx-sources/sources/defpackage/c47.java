package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c47 {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final zi4 a = new zi4();
    public final StringBuilder b = new StringBuilder();

    public static String a(zi4 zi4Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = zi4Var.b;
        int i2 = zi4Var.c;
        while (i < i2 && !z) {
            char c2 = (char) zi4Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        zi4Var.O(i - zi4Var.b);
        return sb.toString();
    }

    public static String b(zi4 zi4Var, StringBuilder sb) {
        c(zi4Var);
        if (zi4Var.a() == 0) {
            return null;
        }
        String a = a(zi4Var, sb);
        if (!a.isEmpty()) {
            return a;
        }
        return "" + ((char) zi4Var.A());
    }

    public static void c(zi4 zi4Var) {
        while (true) {
            for (boolean z = true; zi4Var.a() > 0 && z; z = false) {
                int i = zi4Var.b;
                byte[] bArr = zi4Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int i2 = zi4Var.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            zi4Var.O(i2 - zi4Var.b);
                        }
                    }
                } else {
                    zi4Var.O(1);
                }
            }
            return;
        }
    }
}
