package com.unity3d.services.core.network.core;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import defpackage.bx7;
import defpackage.jd4;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final jd4 client;
    private final ISDKDispatchers dispatchers;

    public OkHttp3Client(ISDKDispatchers iSDKDispatchers, jd4 jd4Var) {
        iSDKDispatchers.getClass();
        jd4Var.getClass();
        this.dispatchers = iSDKDispatchers;
        this.client = jd4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest r11, final boolean r12, defpackage.vz0 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.unity3d.services.core.network.core.OkHttp3Client$execute$1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.services.core.network.core.OkHttp3Client$execute$1 r0 = (com.unity3d.services.core.network.core.OkHttp3Client$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.network.core.OkHttp3Client$execute$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L32
            java.lang.Object r10 = r0.L$2
            jd4 r10 = (defpackage.jd4) r10
            java.lang.Object r10 = r0.L$1
            l35 r10 = (defpackage.l35) r10
            java.lang.Object r10 = r0.L$0
            r11 = r10
            com.unity3d.services.core.network.model.HttpRequest r11 = (com.unity3d.services.core.network.model.HttpRequest) r11
            defpackage.m37.N(r13)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            return r13
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            r10 = 0
            return r10
        L39:
            defpackage.m37.N(r13)
            l35 r13 = com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(r11)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            jd4 r10 = r10.client     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            id4 r10 = r10.a()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            int r1 = r11.getConnectTimeout()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            long r3 = (long) r1     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r1.getClass()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            int r3 = defpackage.dq6.b(r3, r1)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r10.v = r3     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            int r3 = r11.getReadTimeout()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            long r3 = (long) r3     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            int r3 = defpackage.dq6.b(r3, r1)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r10.w = r3     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            int r3 = r11.getWriteTimeout()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            long r3 = (long) r3     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            int r1 = defpackage.dq6.b(r3, r1)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r10.x = r1     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            jd4 r1 = new jd4     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r1.<init>(r10)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r0.L$0 = r11     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r0.L$1 = r13     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r0.L$2 = r1     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r0.Z$0 = r12     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r0.label = r2     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            qg0 r10 = new qg0     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            vz0 r0 = defpackage.wc7.z(r0)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r10.<init>(r2, r0)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r10.t()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r13.getClass()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            bz4 r0 = new bz4     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r0.<init>(r1, r13)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1 r13 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r13.<init>()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r10.v(r13)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2 r13 = new com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r13.<init>()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            r0.d(r13)     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            java.lang.Object r10 = r10.r()     // Catch: java.io.IOException -> La9 java.net.SocketTimeoutException -> Lbe
            w11 r11 = defpackage.w11.x
            if (r10 != r11) goto La8
            return r11
        La8:
            return r10
        La9:
            com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r0 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException
            java.lang.String r4 = r11.getBaseURL()
            r8 = 54
            r9 = 0
            java.lang.String r1 = "Network request failed"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        Lbe:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r0 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.String r4 = r11.getBaseURL()
            r8 = 54
            r9 = 0
            java.lang.String r1 = "Network request timeout"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client.execute(com.unity3d.services.core.network.model.HttpRequest, boolean, vz0):java.lang.Object");
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        httpRequest.getClass();
        return (HttpResponse) bx7.K(this.dispatchers.getIo(), new OkHttp3Client$executeBlocking$1(this, httpRequest, null));
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
}
