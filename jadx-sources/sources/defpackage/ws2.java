package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ws2 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;
    public final boolean i;

    public ws2(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
        this.i = str.equals(HttpRequest.DEFAULT_SCHEME);
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(uz5.S(str, ':', length, 4) + 1, uz5.S(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int S = uz5.S(str, '/', length, 4);
        return str.substring(S, dq6.g(str, "?#", S, str.length()));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int S = uz5.S(str, '/', length, 4);
        int g = dq6.g(str, "?#", S, str.length());
        ArrayList arrayList = new ArrayList();
        while (S < g) {
            int i = S + 1;
            int f = dq6.f(str, '/', i, g);
            arrayList.add(str.substring(i, f));
            S = f;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int S = uz5.S(str, '?', 0, 6) + 1;
        return str.substring(S, dq6.f(str, '#', S, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, dq6.g(str, ":@", length, str.length()));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ws2) && ((ws2) obj).h.equals(this.h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        ra2 ra2Var;
        try {
            ra2Var = new ra2((byte) 1);
            ra2Var.n(this, "/...");
        } catch (IllegalArgumentException unused) {
            ra2Var = null;
        }
        ra2Var.getClass();
        ra2Var.f = q18.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        ra2Var.g = q18.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return ra2Var.a().h;
    }

    public final URI g() {
        int i;
        ArrayList arrayList;
        String substring;
        String str;
        String str2;
        ra2 ra2Var = new ra2((byte) 1);
        String str3 = this.a;
        ra2Var.e = str3;
        ra2Var.f = e();
        ra2Var.g = a();
        ra2Var.h = this.d;
        str3.getClass();
        int i2 = -1;
        if (str3.equals("http")) {
            i = 80;
        } else if (str3.equals(HttpRequest.DEFAULT_SCHEME)) {
            i = 443;
        } else {
            i = -1;
        }
        int i3 = this.e;
        if (i3 != i) {
            i2 = i3;
        }
        ra2Var.b = i2;
        ArrayList arrayList2 = ra2Var.c;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d = d();
        String str4 = null;
        if (d != null) {
            arrayList = q18.m(q18.g(d, 0, 0, " \"'<>#", 211));
        } else {
            arrayList = null;
        }
        ra2Var.d = arrayList;
        if (this.g == null) {
            substring = null;
        } else {
            String str5 = this.h;
            substring = str5.substring(uz5.S(str5, '#', 0, 6) + 1);
        }
        ra2Var.i = substring;
        String str6 = (String) ra2Var.h;
        if (str6 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            compile.getClass();
            str = compile.matcher(str6).replaceAll("");
            str.getClass();
        } else {
            str = null;
        }
        ra2Var.h = str;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.set(i4, q18.g((String) arrayList2.get(i4), 0, 0, "[]", 227));
        }
        ArrayList arrayList3 = ra2Var.d;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String str7 = (String) arrayList3.get(i5);
                if (str7 != null) {
                    str2 = q18.g(str7, 0, 0, "\\^`{|}", 195);
                } else {
                    str2 = null;
                }
                arrayList3.set(i5, str2);
            }
        }
        String str8 = (String) ra2Var.i;
        if (str8 != null) {
            str4 = q18.g(str8, 0, 0, " \"#<>\\^`{|}", 163);
        }
        ra2Var.i = str4;
        String ra2Var2 = ra2Var.toString();
        try {
            return new URI(ra2Var2);
        } catch (URISyntaxException e) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                compile2.getClass();
                String replaceAll = compile2.matcher(ra2Var2).replaceAll("");
                replaceAll.getClass();
                URI create = URI.create(replaceAll);
                create.getClass();
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
