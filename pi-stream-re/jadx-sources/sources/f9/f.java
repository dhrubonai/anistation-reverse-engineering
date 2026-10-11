package f9;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import r6.h0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final c[] f4033a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f4034b;

    static {
        c cVar = new c(c.f4001i, "");
        k9.j jVar = c.f3998f;
        k9.j jVar2 = c.f3999g;
        k9.j jVar3 = c.f4000h;
        k9.j jVar4 = c.f3997e;
        c[] cVarArr = {cVar, new c(jVar, "GET"), new c(jVar, "POST"), new c(jVar2, "/"), new c(jVar2, "/index.html"), new c(jVar3, "http"), new c(jVar3, "https"), new c(jVar4, "200"), new c(jVar4, "204"), new c(jVar4, "206"), new c(jVar4, "304"), new c(jVar4, "400"), new c(jVar4, "404"), new c(jVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f4033a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(cVarArr[i10].f4002a)) {
                linkedHashMap.put(cVarArr[i10].f4002a, Integer.valueOf(i10));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        h0.s(unmodifiableMap, "unmodifiableMap(result)");
        f4034b = unmodifiableMap;
    }

    public static void a(k9.j jVar) {
        boolean z9;
        h0.u(jVar, "name");
        int c6 = jVar.c();
        for (int i10 = 0; i10 < c6; i10++) {
            byte f10 = jVar.f(i10);
            if (65 <= f10 && f10 < 91) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.j()));
            }
        }
    }
}
