package e9;

import k9.i;
import o7.j;
import r6.h0;
import y8.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i f3597a;

    /* renamed from: b, reason: collision with root package name */
    public long f3598b = 262144;

    public a(i iVar) {
        this.f3597a = iVar;
    }

    public final o a() {
        boolean z9;
        h4.c cVar = new h4.c();
        while (true) {
            String u9 = this.f3597a.u(this.f3598b);
            this.f3598b -= u9.length();
            if (u9.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                int p12 = j.p1(u9, ':', 1, false, 4);
                if (p12 != -1) {
                    String substring = u9.substring(0, p12);
                    h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String substring2 = u9.substring(p12 + 1);
                    h0.s(substring2, "this as java.lang.String).substring(startIndex)");
                    cVar.a(substring, substring2);
                } else if (u9.charAt(0) == ':') {
                    String substring3 = u9.substring(1);
                    h0.s(substring3, "this as java.lang.String).substring(startIndex)");
                    cVar.a("", substring3);
                } else {
                    cVar.a("", u9);
                }
            } else {
                return cVar.b();
            }
        }
    }
}
