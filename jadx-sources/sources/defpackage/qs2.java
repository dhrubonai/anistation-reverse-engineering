package defpackage;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qs2 implements Comparable {
    public static final qs2 A;
    public static final qs2 B;
    public static final qs2 C;
    public static final qs2 D;
    public static final qs2 E;
    public static final qs2 F;
    public static final qs2 G;
    public static final qs2 H;
    public static final qs2 I;
    public static final List J;
    public static final qs2 z;
    public final int x;
    public final String y;

    static {
        qs2 qs2Var = new qs2(100, "Continue");
        z = qs2Var;
        qs2 qs2Var2 = new qs2(101, "Switching Protocols");
        A = qs2Var2;
        qs2 qs2Var3 = new qs2(102, "Processing");
        qs2 qs2Var4 = new qs2(200, "OK");
        qs2 qs2Var5 = new qs2(201, "Created");
        qs2 qs2Var6 = new qs2(202, "Accepted");
        qs2 qs2Var7 = new qs2(203, "Non-Authoritative Information");
        qs2 qs2Var8 = new qs2(204, "No Content");
        B = qs2Var8;
        qs2 qs2Var9 = new qs2(205, "Reset Content");
        qs2 qs2Var10 = new qs2(206, "Partial Content");
        qs2 qs2Var11 = new qs2(207, "Multi-Status");
        qs2 qs2Var12 = new qs2(300, "Multiple Choices");
        qs2 qs2Var13 = new qs2(301, "Moved Permanently");
        C = qs2Var13;
        qs2 qs2Var14 = new qs2(302, "Found");
        D = qs2Var14;
        qs2 qs2Var15 = new qs2(303, "See Other");
        E = qs2Var15;
        qs2 qs2Var16 = new qs2(304, "Not Modified");
        F = qs2Var16;
        qs2 qs2Var17 = new qs2(305, "Use Proxy");
        qs2 qs2Var18 = new qs2(306, "Switch Proxy");
        qs2 qs2Var19 = new qs2(307, "Temporary Redirect");
        G = qs2Var19;
        qs2 qs2Var20 = new qs2(308, "Permanent Redirect");
        H = qs2Var20;
        qs2 qs2Var21 = new qs2(CommonGatewayClient.CODE_400, "Bad Request");
        qs2 qs2Var22 = new qs2(401, "Unauthorized");
        qs2 qs2Var23 = new qs2(402, "Payment Required");
        qs2 qs2Var24 = new qs2(403, "Forbidden");
        qs2 qs2Var25 = new qs2(404, "Not Found");
        qs2 qs2Var26 = new qs2(405, "Method Not Allowed");
        qs2 qs2Var27 = new qs2(406, "Not Acceptable");
        qs2 qs2Var28 = new qs2(407, "Proxy Authentication Required");
        qs2 qs2Var29 = new qs2(408, "Request Timeout");
        qs2 qs2Var30 = new qs2(409, "Conflict");
        qs2 qs2Var31 = new qs2(410, "Gone");
        qs2 qs2Var32 = new qs2(411, "Length Required");
        qs2 qs2Var33 = new qs2(412, "Precondition Failed");
        qs2 qs2Var34 = new qs2(413, "Payload Too Large");
        qs2 qs2Var35 = new qs2(414, "Request-URI Too Long");
        qs2 qs2Var36 = new qs2(415, "Unsupported Media Type");
        qs2 qs2Var37 = new qs2(416, "Requested Range Not Satisfiable");
        qs2 qs2Var38 = new qs2(417, "Expectation Failed");
        I = qs2Var38;
        List I2 = te4.I(qs2Var, qs2Var2, qs2Var3, qs2Var4, qs2Var5, qs2Var6, qs2Var7, qs2Var8, qs2Var9, qs2Var10, qs2Var11, qs2Var12, qs2Var13, qs2Var14, qs2Var15, qs2Var16, qs2Var17, qs2Var18, qs2Var19, qs2Var20, qs2Var21, qs2Var22, qs2Var23, qs2Var24, qs2Var25, qs2Var26, qs2Var27, qs2Var28, qs2Var29, qs2Var30, qs2Var31, qs2Var32, qs2Var33, new qs2(428, "Precondition Required"), qs2Var34, qs2Var35, qs2Var36, qs2Var37, qs2Var38, new qs2(422, "Unprocessable Entity"), new qs2(423, "Locked"), new qs2(424, "Failed Dependency"), new qs2(425, "Too Early"), new qs2(426, "Upgrade Required"), new qs2(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, "Too Many Requests"), new qs2(431, "Request Header Fields Too Large"), new qs2(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, "Internal Server Error"), new qs2(501, "Not Implemented"), new qs2(502, "Bad Gateway"), new qs2(503, "Service Unavailable"), new qs2(504, "Gateway Timeout"), new qs2(505, "HTTP Version Not Supported"), new qs2(506, "Variant Also Negotiates"), new qs2(507, "Insufficient Storage"));
        J = I2;
        int S = vn3.S(zo0.V(I2, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        for (Object obj : I2) {
            linkedHashMap.put(Integer.valueOf(((qs2) obj).x), obj);
        }
    }

    public qs2(int i, String str) {
        str.getClass();
        this.x = i;
        this.y = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qs2 qs2Var = (qs2) obj;
        qs2Var.getClass();
        return this.x - qs2Var.x;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qs2) && ((qs2) obj).x == this.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.x);
    }

    public final String toString() {
        return this.x + ' ' + this.y;
    }
}
