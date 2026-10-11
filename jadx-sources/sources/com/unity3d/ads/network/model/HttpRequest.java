package com.unity3d.ads.network.model;

import defpackage.a34;
import defpackage.q71;
import defpackage.qx1;
import defpackage.zo5;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HttpRequest(java.lang.String r13, java.lang.String r14, com.unity3d.ads.network.model.RequestType r15, com.unity3d.ads.network.model.HttpBody r16, java.util.Map r17, java.util.Map r18, java.lang.String r19, java.lang.Integer r20, int r21, int r22, int r23, int r24, int r25, defpackage.q71 r26) {
        /*
            r12 = this;
            r0 = r25
            r1 = r0 & 2
            if (r1 == 0) goto L9
            java.lang.String r1 = ""
            goto La
        L9:
            r1 = r14
        La:
            r2 = r0 & 4
            if (r2 == 0) goto L11
            com.unity3d.ads.network.model.RequestType r2 = com.unity3d.ads.network.model.RequestType.GET
            goto L12
        L11:
            r2 = r15
        L12:
            r3 = r0 & 8
            if (r3 == 0) goto L19
            com.unity3d.ads.network.model.HttpBody$EmptyBody r3 = com.unity3d.ads.network.model.HttpBody.EmptyBody.INSTANCE
            goto L1b
        L19:
            r3 = r16
        L1b:
            r4 = r0 & 16
            ot1 r5 = defpackage.ot1.x
            if (r4 == 0) goto L23
            r4 = r5
            goto L25
        L23:
            r4 = r17
        L25:
            r6 = r0 & 32
            if (r6 == 0) goto L2a
            goto L2c
        L2a:
            r5 = r18
        L2c:
            r6 = r0 & 64
            if (r6 == 0) goto L33
            java.lang.String r6 = "https"
            goto L35
        L33:
            r6 = r19
        L35:
            r7 = r0 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L3b
            r7 = 0
            goto L3d
        L3b:
            r7 = r20
        L3d:
            r8 = r0 & 256(0x100, float:3.59E-43)
            r9 = 30000(0x7530, float:4.2039E-41)
            if (r8 == 0) goto L45
            r8 = r9
            goto L47
        L45:
            r8 = r21
        L47:
            r10 = r0 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto L4d
            r10 = r9
            goto L4f
        L4d:
            r10 = r22
        L4f:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L55
            r11 = r9
            goto L57
        L55:
            r11 = r23
        L57:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L74
            r26 = r9
        L5d:
            r14 = r12
            r15 = r13
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r10
            r25 = r11
            goto L77
        L74:
            r26 = r24
            goto L5d
        L77:
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map, java.lang.String, java.lang.Integer, int, int, int, int, int, q71):void");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i5 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i5 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i5 & 8) != 0) {
            httpBody = httpRequest.body;
        }
        if ((i5 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i5 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i5 & 64) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i5 & 128) != 0) {
            num = httpRequest.port;
        }
        if ((i5 & 256) != 0) {
            i = httpRequest.connectTimeout;
        }
        if ((i5 & 512) != 0) {
            i2 = httpRequest.readTimeout;
        }
        if ((i5 & 1024) != 0) {
            i3 = httpRequest.writeTimeout;
        }
        if ((i5 & 2048) != 0) {
            i4 = httpRequest.callTimeout;
        }
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        int i9 = i2;
        String str4 = str3;
        Integer num2 = num;
        Map map3 = map;
        Map map4 = map2;
        return httpRequest.copy(str, str2, requestType, httpBody, map3, map4, str4, num2, i8, i9, i6, i7);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3, int i4) {
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
        map2.getClass();
        str3.getClass();
        return new HttpRequest(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (a34.i(this.baseURL, httpRequest.baseURL) && a34.i(this.path, httpRequest.path) && this.method == httpRequest.method && a34.i(this.body, httpRequest.body) && a34.i(this.headers, httpRequest.headers) && a34.i(this.parameters, httpRequest.parameters) && a34.i(this.scheme, httpRequest.scheme) && a34.i(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout) {
            return true;
        }
        return false;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int hashCode;
        int i = zo5.i(this.scheme, (this.parameters.hashCode() + ((this.headers.hashCode() + ((this.body.hashCode() + ((this.method.hashCode() + zo5.i(this.path, this.baseURL.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31, 31);
        Integer num = this.port;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Integer.hashCode(this.callTimeout) + qx1.c(this.writeTimeout, qx1.c(this.readTimeout, qx1.c(this.connectTimeout, (i + hashCode) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest(baseURL=");
        sb.append(this.baseURL);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", parameters=");
        sb.append(this.parameters);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", port=");
        sb.append(this.port);
        sb.append(", connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", readTimeout=");
        sb.append(this.readTimeout);
        sb.append(", writeTimeout=");
        sb.append(this.writeTimeout);
        sb.append(", callTimeout=");
        return qx1.o(sb, this.callTimeout, ')');
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody) {
        this(str, str2, requestType, httpBody, null, null, null, null, 0, 0, 0, 0, 4080, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, httpBody, map, null, null, null, 0, 0, 0, 0, 4064, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, httpBody, map, map2, null, null, 0, 0, 0, 0, 4032, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
        map2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3) {
        this(str, str2, requestType, httpBody, map, map2, str3, null, 0, 0, 0, 0, 3968, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
        map2.getClass();
        str3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, 0, 0, 0, 0, 3840, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
        map2.getClass();
        str3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, 0, 0, 0, 3584, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
        map2.getClass();
        str3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, 0, 0, 3072, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
        map2.getClass();
        str3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3) {
        this(str, str2, requestType, httpBody, map, map2, str3, num, i, i2, i3, 0, 2048, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
        map2.getClass();
        str3.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i, int i2, int i3, int i4) {
        str.getClass();
        str2.getClass();
        requestType.getClass();
        httpBody.getClass();
        map.getClass();
        map2.getClass();
        str3.getClass();
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = httpBody;
        this.headers = map;
        this.parameters = map2;
        this.scheme = str3;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str) {
        this(str, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        str.getClass();
    }
}
