package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c15 implements Serializable {
    public final Pattern x;

    public c15() {
        Pattern compile = Pattern.compile("^Episode\\s+\\d+$", 66);
        compile.getClass();
        this.x = compile;
    }

    public static u22 a(c15 c15Var, String str) {
        c15Var.getClass();
        if (str.length() >= 0) {
            return new u22(new va1(c15Var, str, (byte) 27), b15.x, (byte) 2);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    public final boolean b(CharSequence charSequence) {
        charSequence.getClass();
        return this.x.matcher(charSequence).matches();
    }

    public final String c(String str, ub2 ub2Var) {
        do3 do3Var;
        str.getClass();
        Matcher matcher = this.x.matcher(str);
        matcher.getClass();
        int i = 0;
        if (!matcher.find(0)) {
            do3Var = null;
        } else {
            do3Var = new do3(matcher, str);
        }
        if (do3Var == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, do3Var.b().x);
            sb.append((CharSequence) ub2Var.invoke(do3Var));
            i = do3Var.b().y + 1;
            do3Var = do3Var.c();
            if (i >= length) {
                break;
            }
        } while (do3Var != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String toString() {
        String pattern = this.x.toString();
        pattern.getClass();
        return pattern;
    }

    public c15(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.x = compile;
    }
}
