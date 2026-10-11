package com.unity3d.services.core.network.model;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.data.model.OperationType;
import defpackage.a34;
import defpackage.q71;
import defpackage.qx1;
import defpackage.zo5;
import java.io.File;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final String contentType;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ HttpRequest(java.lang.String r20, java.lang.String r21, com.unity3d.services.core.network.model.RequestType r22, java.lang.Object r23, java.util.Map r24, java.util.Map r25, com.unity3d.services.core.network.model.BodyType r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, int r30, int r31, int r32, int r33, boolean r34, com.unity3d.ads.core.data.model.OperationType r35, java.io.File r36, int r37, int r38, defpackage.q71 r39) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, q71):void");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, Object obj2) {
        int i7;
        File file2;
        String str5 = (i6 & 1) != 0 ? httpRequest.baseURL : str;
        String str6 = (i6 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType2 = (i6 & 4) != 0 ? httpRequest.method : requestType;
        Object obj3 = (i6 & 8) != 0 ? httpRequest.body : obj;
        Map map3 = (i6 & 16) != 0 ? httpRequest.headers : map;
        Map map4 = (i6 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType2 = (i6 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str7 = (i6 & 128) != 0 ? httpRequest.contentType : str3;
        String str8 = (i6 & 256) != 0 ? httpRequest.scheme : str4;
        Integer num2 = (i6 & 512) != 0 ? httpRequest.port : num;
        int i8 = (i6 & 1024) != 0 ? httpRequest.connectTimeout : i;
        int i9 = (i6 & 2048) != 0 ? httpRequest.readTimeout : i2;
        int i10 = (i6 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? httpRequest.writeTimeout : i3;
        int i11 = (i6 & 8192) != 0 ? httpRequest.callTimeout : i4;
        String str9 = str5;
        boolean z2 = (i6 & 16384) != 0 ? httpRequest.isProtobuf : z;
        OperationType operationType2 = (i6 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i6 & 65536) != 0 ? httpRequest.downloadDestination : file;
        if ((i6 & 131072) != 0) {
            file2 = file3;
            i7 = httpRequest.priority;
        } else {
            i7 = i5;
            file2 = file3;
        }
        return httpRequest.copy(str9, str6, requestType2, obj3, map3, map4, bodyType2, str7, str8, num2, i8, i9, i10, i11, z2, operationType2, file2, i7);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final Integer component10() {
        return this.port;
    }

    public final int component11() {
        return this.connectTimeout;
    }

    public final int component12() {
        return this.readTimeout;
    }

    public final int component13() {
        return this.writeTimeout;
    }

    public final int component14() {
        return this.callTimeout;
    }

    public final boolean component15() {
        return this.isProtobuf;
    }

    public final OperationType component16() {
        return this.operationType;
    }

    public final File component17() {
        return this.downloadDestination;
    }

    public final int component18() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.contentType;
    }

    public final String component9() {
        return this.scheme;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
        operationType.getClass();
        return new HttpRequest(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, z, operationType, file, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        if (a34.i(this.baseURL, httpRequest.baseURL) && a34.i(this.path, httpRequest.path) && this.method == httpRequest.method && a34.i(this.body, httpRequest.body) && a34.i(this.headers, httpRequest.headers) && a34.i(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && a34.i(this.contentType, httpRequest.contentType) && a34.i(this.scheme, httpRequest.scheme) && a34.i(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && a34.i(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority) {
            return true;
        }
        return false;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.method.hashCode() + zo5.i(this.path, this.baseURL.hashCode() * 31, 31)) * 31;
        Object obj = this.body;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int hashCode5 = (this.bodyType.hashCode() + ((this.parameters.hashCode() + ((this.headers.hashCode() + ((hashCode4 + hashCode) * 31)) * 31)) * 31)) * 31;
        String str = this.contentType;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = zo5.i(this.scheme, (hashCode5 + hashCode2) * 31, 31);
        Integer num = this.port;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int hashCode6 = (this.operationType.hashCode() + zo5.g(qx1.c(this.callTimeout, qx1.c(this.writeTimeout, qx1.c(this.readTimeout, qx1.c(this.connectTimeout, (i2 + hashCode3) * 31, 31), 31), 31), 31), 31, this.isProtobuf)) * 31;
        File file = this.downloadDestination;
        if (file != null) {
            i = file.hashCode();
        }
        return Integer.hashCode(this.priority) + ((hashCode6 + i) * 31);
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
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
        sb.append(", bodyType=");
        sb.append(this.bodyType);
        sb.append(", contentType=");
        sb.append(this.contentType);
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
        sb.append(this.callTimeout);
        sb.append(", isProtobuf=");
        sb.append(this.isProtobuf);
        sb.append(", operationType=");
        sb.append(this.operationType);
        sb.append(", downloadDestination=");
        sb.append(this.downloadDestination);
        sb.append(", priority=");
        return qx1.o(sb, this.priority, ')');
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
        this(str, str2, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262140, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262136, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj) {
        this(str, str2, requestType, obj, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262128, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, obj, map, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262112, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, obj, map, map2, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262080, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType) {
        this(str, str2, requestType, obj, map, map2, bodyType, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262016, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, null, null, 0, 0, 0, 0, false, null, null, 0, 261888, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, null, 0, 0, 0, 0, false, null, null, 0, 261632, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, 0, 0, 0, 0, false, null, null, 0, 261120, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, 0, 0, 0, false, null, null, 0, 260096, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, 0, 0, false, null, null, 0, 258048, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, 0, false, null, null, 0, 253952, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, false, null, null, 0, 245760, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4, boolean z) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, z, null, null, 0, 229376, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, z, operationType, null, 0, 196608, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
        operationType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, str4, num, i, i2, i3, i4, z, operationType, file, 0, 131072, null);
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
        operationType.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, String str4, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        str.getClass();
        str2.getClass();
        requestType.getClass();
        map.getClass();
        map2.getClass();
        bodyType.getClass();
        str4.getClass();
        operationType.getClass();
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = obj;
        this.headers = map;
        this.parameters = map2;
        this.bodyType = bodyType;
        this.contentType = str3;
        this.scheme = str4;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
        this.isProtobuf = z;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str) {
        this(str, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 262142, null);
        str.getClass();
    }
}
