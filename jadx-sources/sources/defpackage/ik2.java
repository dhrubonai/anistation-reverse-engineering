package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ik2 implements Iterable, j73 {
    public final String[] x;

    public ik2(String[] strArr) {
        this.x = strArr;
    }

    public final String b(String str) {
        str.getClass();
        String[] strArr = this.x;
        int length = strArr.length - 2;
        int E = x97.E(length, 0, -2);
        if (E <= length) {
            while (!b06.C(str, strArr[length], true)) {
                if (length != E) {
                    length -= 2;
                } else {
                    return null;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i) {
        return this.x[i * 2];
    }

    public final gk2 d() {
        gk2 gk2Var = new gk2((byte) 0);
        dp0.Z(gk2Var.a, this.x);
        return gk2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ik2) {
            if (Arrays.equals(this.x, ((ik2) obj).x)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final TreeMap f() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String c = c(i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = c.toLowerCase(locale);
            lowerCase.getClass();
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(g(i));
        }
        return treeMap;
    }

    public final String g(int i) {
        return this.x[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.x);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        ai4[] ai4VarArr = new ai4[size];
        for (int i = 0; i < size; i++) {
            ai4VarArr[i] = new ai4(c(i), g(i));
        }
        return new o1(ai4VarArr);
    }

    public final int size() {
        return this.x.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String c = c(i);
            String g = g(i);
            sb.append(c);
            sb.append(": ");
            if (dq6.p(c)) {
                g = "██";
            }
            sb.append(g);
            sb.append("\n");
        }
        return sb.toString();
    }
}
