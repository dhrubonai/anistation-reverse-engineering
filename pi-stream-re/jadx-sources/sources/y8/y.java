package y8;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public q f11847a;

    /* renamed from: b, reason: collision with root package name */
    public String f11848b;

    /* renamed from: c, reason: collision with root package name */
    public h4.c f11849c;

    /* renamed from: d, reason: collision with root package name */
    public b0 f11850d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f11851e;

    public y() {
        this.f11851e = new LinkedHashMap();
        this.f11848b = "GET";
        this.f11849c = new h4.c();
    }

    public final androidx.appcompat.widget.w a() {
        Map unmodifiableMap;
        q qVar = this.f11847a;
        if (qVar != null) {
            String str = this.f11848b;
            o b10 = this.f11849c.b();
            b0 b0Var = this.f11850d;
            byte[] bArr = z8.b.f12133a;
            LinkedHashMap linkedHashMap = this.f11851e;
            r6.h0.u(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = x6.p.f11319a;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                r6.h0.s(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new androidx.appcompat.widget.w(qVar, str, b10, b0Var, unmodifiableMap);
        }
        throw new IllegalStateException("url == null".toString());
    }

    public final void b(String str, String str2) {
        r6.h0.u(str, "name");
        r6.h0.u(str2, "value");
        h4.c cVar = this.f11849c;
        cVar.getClass();
        j.d(str);
        j.e(str2, str);
        cVar.f(str);
        cVar.a(str, str2);
    }

    public final void c(String str, b0 b0Var) {
        boolean z9;
        boolean z10 = false;
        if (str.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (b0Var == null) {
                if (r6.h0.g(str, "POST") || r6.h0.g(str, "PUT") || r6.h0.g(str, "PATCH") || r6.h0.g(str, "PROPPATCH") || r6.h0.g(str, "REPORT")) {
                    z10 = true;
                }
                if (!(!z10)) {
                    throw new IllegalArgumentException(r.f.e("method ", str, " must have a request body.").toString());
                }
            } else if (!q6.g.K(str)) {
                throw new IllegalArgumentException(r.f.e("method ", str, " must not have a request body.").toString());
            }
            this.f11848b = str;
            this.f11850d = b0Var;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public final void d(String str) {
        r6.h0.u(str, "url");
        if (o7.j.C1(str, "ws:", true)) {
            String substring = str.substring(3);
            r6.h0.s(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (o7.j.C1(str, "wss:", true)) {
            String substring2 = str.substring(4);
            r6.h0.s(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        char[] cArr = q.f11779k;
        r6.h0.u(str, "<this>");
        p pVar = new p();
        pVar.c(null, str);
        this.f11847a = pVar.a();
    }

    public y(androidx.appcompat.widget.w wVar) {
        LinkedHashMap linkedHashMap;
        this.f11851e = new LinkedHashMap();
        this.f11847a = (q) wVar.f681b;
        this.f11848b = (String) wVar.f682c;
        this.f11850d = (b0) wVar.f684e;
        if (((Map) wVar.f685f).isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            Map map = (Map) wVar.f685f;
            r6.h0.u(map, "<this>");
            linkedHashMap = new LinkedHashMap(map);
        }
        this.f11851e = linkedHashMap;
        this.f11849c = ((o) wVar.f683d).d();
    }
}
