package com.unity3d.services.core.network.model;

import defpackage.a34;
import defpackage.qx1;
import defpackage.zo5;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map<String, List<String>> headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HttpResponse(java.lang.Object r8, int r9, java.util.Map r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14, int r16, defpackage.q71 r17) {
        /*
            r7 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L7
            r0 = 200(0xc8, float:2.8E-43)
            goto L8
        L7:
            r0 = r9
        L8:
            r1 = r16 & 4
            if (r1 == 0) goto Lf
            ot1 r1 = defpackage.ot1.x
            goto L10
        Lf:
            r1 = r10
        L10:
            r2 = r16 & 8
            java.lang.String r3 = ""
            if (r2 == 0) goto L18
            r2 = r3
            goto L19
        L18:
            r2 = r11
        L19:
            r4 = r16 & 16
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r3 = r12
        L1f:
            r4 = r16 & 32
            if (r4 == 0) goto L26
            java.lang.String r4 = "unknown"
            goto L27
        L26:
            r4 = r13
        L27:
            r5 = r16 & 64
            if (r5 == 0) goto L37
            r5 = -1
            r16 = r5
        L2f:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            goto L3a
        L37:
            r16 = r14
            goto L2f
        L3a:
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpResponse.<init>(java.lang.Object, int, java.util.Map, java.lang.String, java.lang.String, java.lang.String, long, int, q71):void");
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = httpResponse.urlString;
        }
        if ((i2 & 16) != 0) {
            str2 = httpResponse.protocol;
        }
        if ((i2 & 32) != 0) {
            str3 = httpResponse.client;
        }
        if ((i2 & 64) != 0) {
            j = httpResponse.contentSize;
        }
        long j2 = j;
        String str4 = str2;
        String str5 = str3;
        return httpResponse.copy(obj, i, map, str, str4, str5, j2);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j) {
        obj.getClass();
        map.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new HttpResponse(obj, i, map, str, str2, str3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        if (a34.i(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && a34.i(this.headers, httpResponse.headers) && a34.i(this.urlString, httpResponse.urlString) && a34.i(this.protocol, httpResponse.protocol) && a34.i(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize) {
            return true;
        }
        return false;
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return Long.hashCode(this.contentSize) + zo5.i(this.client, zo5.i(this.protocol, zo5.i(this.urlString, (this.headers.hashCode() + qx1.c(this.statusCode, this.body.hashCode() * 31, 31)) * 31, 31), 31), 31);
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i) {
        this(obj, i, null, null, null, null, 0L, 124, null);
        obj.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map) {
        this(obj, i, map, null, null, null, 0L, 120, null);
        obj.getClass();
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str) {
        this(obj, i, map, str, null, null, 0L, 112, null);
        obj.getClass();
        map.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2) {
        this(obj, i, map, str, str2, null, 0L, 96, null);
        obj.getClass();
        map.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3) {
        this(obj, i, map, str, str2, str3, 0L, 64, null);
        obj.getClass();
        map.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(Object obj, int i, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j) {
        obj.getClass();
        map.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.body = obj;
        this.statusCode = i;
        this.headers = map;
        this.urlString = str;
        this.protocol = str2;
        this.client = str3;
        this.contentSize = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj) {
        this(obj, 0, null, null, null, null, 0L, 126, null);
        obj.getClass();
    }
}
