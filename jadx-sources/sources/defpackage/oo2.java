package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class oo2 {
    public static final ak2[] a;
    public static final Map b;

    static {
        ak2 ak2Var = new ak2(ak2.i, "");
        zd0 zd0Var = ak2.f;
        ak2 ak2Var2 = new ak2(zd0Var, "GET");
        ak2 ak2Var3 = new ak2(zd0Var, "POST");
        zd0 zd0Var2 = ak2.g;
        ak2 ak2Var4 = new ak2(zd0Var2, "/");
        ak2 ak2Var5 = new ak2(zd0Var2, "/index.html");
        zd0 zd0Var3 = ak2.h;
        ak2 ak2Var6 = new ak2(zd0Var3, "http");
        ak2 ak2Var7 = new ak2(zd0Var3, HttpRequest.DEFAULT_SCHEME);
        zd0 zd0Var4 = ak2.e;
        ak2[] ak2VarArr = {ak2Var, ak2Var2, ak2Var3, ak2Var4, ak2Var5, ak2Var6, ak2Var7, new ak2(zd0Var4, "200"), new ak2(zd0Var4, "204"), new ak2(zd0Var4, "206"), new ak2(zd0Var4, "304"), new ak2(zd0Var4, "400"), new ak2(zd0Var4, "404"), new ak2(zd0Var4, "500"), new ak2("accept-charset", ""), new ak2("accept-encoding", "gzip, deflate"), new ak2("accept-language", ""), new ak2("accept-ranges", ""), new ak2("accept", ""), new ak2("access-control-allow-origin", ""), new ak2("age", ""), new ak2("allow", ""), new ak2("authorization", ""), new ak2("cache-control", ""), new ak2("content-disposition", ""), new ak2("content-encoding", ""), new ak2("content-language", ""), new ak2("content-length", ""), new ak2("content-location", ""), new ak2("content-range", ""), new ak2("content-type", ""), new ak2("cookie", ""), new ak2("date", ""), new ak2("etag", ""), new ak2("expect", ""), new ak2("expires", ""), new ak2("from", ""), new ak2("host", ""), new ak2("if-match", ""), new ak2("if-modified-since", ""), new ak2("if-none-match", ""), new ak2("if-range", ""), new ak2("if-unmodified-since", ""), new ak2("last-modified", ""), new ak2("link", ""), new ak2("location", ""), new ak2("max-forwards", ""), new ak2("proxy-authenticate", ""), new ak2("proxy-authorization", ""), new ak2("range", ""), new ak2("referer", ""), new ak2("refresh", ""), new ak2("retry-after", ""), new ak2("server", ""), new ak2("set-cookie", ""), new ak2("strict-transport-security", ""), new ak2("transfer-encoding", ""), new ak2("user-agent", ""), new ak2("vary", ""), new ak2("via", ""), new ak2("www-authenticate", "")};
        a = ak2VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(ak2VarArr[i].a)) {
                linkedHashMap.put(ak2VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(zd0 zd0Var) {
        zd0Var.getClass();
        int d = zd0Var.d();
        for (int i = 0; i < d; i++) {
            byte i2 = zd0Var.i(i);
            if (65 <= i2 && i2 < 91) {
                qi2.k("PROTOCOL_ERROR response malformed: mixed case name: ".concat(zd0Var.q()));
                return;
            }
        }
    }
}
