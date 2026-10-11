package y8;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f11779k;

    /* renamed from: a, reason: collision with root package name */
    public final String f11780a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11781b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11782c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11783d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11784e;

    /* renamed from: f, reason: collision with root package name */
    public final List f11785f;

    /* renamed from: g, reason: collision with root package name */
    public final List f11786g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11787h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11788i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11789j;

    static {
        new j(5, 0);
        f11779k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public q(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f11780a = str;
        this.f11781b = str2;
        this.f11782c = str3;
        this.f11783d = str4;
        this.f11784e = i10;
        this.f11785f = arrayList;
        this.f11786g = arrayList2;
        this.f11787h = str5;
        this.f11788i = str6;
        this.f11789j = r6.h0.g(str, "https");
    }

    public final String a() {
        boolean z9;
        if (this.f11782c.length() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return "";
        }
        int length = this.f11780a.length() + 3;
        String str = this.f11788i;
        String substring = str.substring(o7.j.p1(str, ':', length, false, 4) + 1, o7.j.p1(str, '@', 0, false, 6));
        r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f11780a.length() + 3;
        String str = this.f11788i;
        int p12 = o7.j.p1(str, '/', length, false, 4);
        String substring = str.substring(p12, z8.b.f(str, p12, str.length(), "?#"));
        r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f11780a.length() + 3;
        String str = this.f11788i;
        int p12 = o7.j.p1(str, '/', length, false, 4);
        int f10 = z8.b.f(str, p12, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (p12 < f10) {
            int i10 = p12 + 1;
            int e10 = z8.b.e(str, '/', i10, f10);
            String substring = str.substring(i10, e10);
            r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            p12 = e10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f11786g == null) {
            return null;
        }
        String str = this.f11788i;
        int p12 = o7.j.p1(str, '?', 0, false, 6) + 1;
        String substring = str.substring(p12, z8.b.e(str, '#', p12, str.length()));
        r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        boolean z9;
        if (this.f11781b.length() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return "";
        }
        int length = this.f11780a.length() + 3;
        String str = this.f11788i;
        String substring = str.substring(length, z8.b.f(str, length, str.length(), ":@"));
        r6.h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof q) && r6.h0.g(((q) obj).f11788i, this.f11788i)) {
            return true;
        }
        return false;
    }

    public final URI f() {
        String substring;
        String str;
        String str2;
        p pVar = new p();
        String str3 = this.f11780a;
        pVar.f11771a = str3;
        pVar.f11772b = e();
        pVar.f11773c = a();
        pVar.f11774d = this.f11783d;
        int h10 = j.h(str3);
        int i10 = this.f11784e;
        if (i10 == h10) {
            i10 = -1;
        }
        pVar.f11775e = i10;
        ArrayList arrayList = pVar.f11776f;
        arrayList.clear();
        arrayList.addAll(c());
        pVar.b(d());
        String str4 = null;
        if (this.f11787h == null) {
            substring = null;
        } else {
            String str5 = this.f11788i;
            substring = str5.substring(o7.j.p1(str5, '#', 0, false, 6) + 1);
            r6.h0.s(substring, "this as java.lang.String).substring(startIndex)");
        }
        pVar.f11778h = substring;
        String str6 = pVar.f11774d;
        if (str6 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            r6.h0.s(compile, "compile(...)");
            str = compile.matcher(str6).replaceAll("");
            r6.h0.s(str, "replaceAll(...)");
        } else {
            str = null;
        }
        pVar.f11774d = str;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, j.c((String) arrayList.get(i11), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = pVar.f11777g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str7 = (String) arrayList2.get(i12);
                if (str7 != null) {
                    str2 = j.c(str7, 0, 0, "\\^`{|}", true, true, true, false, 195);
                } else {
                    str2 = null;
                }
                arrayList2.set(i12, str2);
            }
        }
        String str8 = pVar.f11778h;
        if (str8 != null) {
            str4 = j.c(str8, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        pVar.f11778h = str4;
        String pVar2 = pVar.toString();
        try {
            return new URI(pVar2);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                r6.h0.s(compile2, "compile(...)");
                String replaceAll = compile2.matcher(pVar2).replaceAll("");
                r6.h0.s(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                r6.h0.s(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f11788i.hashCode();
    }

    public final String toString() {
        return this.f11788i;
    }
}
