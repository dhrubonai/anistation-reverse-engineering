package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.b06;
import defpackage.bx7;
import defpackage.kl0;
import defpackage.pg0;
import defpackage.pn6;
import defpackage.q23;
import defpackage.q71;
import defpackage.qg0;
import defpackage.ub2;
import defpackage.uz5;
import defpackage.vz0;
import defpackage.wc7;
import defpackage.y45;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    public CronetClient(CronetEngine cronetEngine, ISDKDispatchers iSDKDispatchers) {
        cronetEngine.getClass();
        iSDKDispatchers.getClass();
        this.engine = cronetEngine;
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest httpRequest) {
        return uz5.d0(uz5.x0(httpRequest.getBaseURL(), '/') + '/' + uz5.x0(httpRequest.getPath(), '/'), "/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long L;
        List<String> list = urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list != null && (str = list.get(0)) != null && (L = b06.L(str)) != null) {
            return L.longValue();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return 1;
                }
                return 2;
            }
            return 3;
        }
        return 4;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, final boolean z, vz0 vz0Var) {
        PipedOutputStream pipedOutputStream;
        byte[] bArr;
        if (z) {
            pipedOutputStream = new PipedOutputStream();
        } else {
            pipedOutputStream = null;
        }
        final PipedOutputStream pipedOutputStream2 = pipedOutputStream;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        UrlRequest.Builder newUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new UnityAdsUrlRequestCallback() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                String str;
                super.onCanceled(urlRequest, urlResponseInfo);
                PipedOutputStream pipedOutputStream3 = pipedOutputStream2;
                if (pipedOutputStream3 != null) {
                    pipedOutputStream3.close();
                }
                String str2 = null;
                if (urlResponseInfo != null) {
                    str = urlResponseInfo.getUrl();
                } else {
                    str = null;
                }
                if (urlResponseInfo != null) {
                    str2 = urlResponseInfo.getNegotiatedProtocol();
                }
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, str, str2, null, "cronet", 38, null);
                if (!atomicBoolean.getAndSet(true)) {
                    qg0Var.resumeWith(new y45(networkTimeoutException));
                }
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                NetworkException networkException;
                Integer num;
                Integer num2;
                String str;
                PipedOutputStream pipedOutputStream3 = pipedOutputStream2;
                if (pipedOutputStream3 != null) {
                    pipedOutputStream3.close();
                }
                String str2 = null;
                if (cronetException instanceof NetworkException) {
                    networkException = (NetworkException) cronetException;
                } else {
                    networkException = null;
                }
                if (networkException != null) {
                    num = Integer.valueOf(networkException.getCronetInternalErrorCode());
                } else {
                    num = null;
                }
                if (urlResponseInfo != null) {
                    num2 = Integer.valueOf(urlResponseInfo.getHttpStatusCode());
                } else {
                    num2 = null;
                }
                if (urlResponseInfo != null) {
                    str = urlResponseInfo.getUrl();
                } else {
                    str = null;
                }
                if (urlResponseInfo != null) {
                    str2 = urlResponseInfo.getNegotiatedProtocol();
                }
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, num2, str, str2, num, "cronet", 2, null);
                if (!atomicBoolean.getAndSet(true)) {
                    qg0Var.resumeWith(new y45(unityAdsNetworkException));
                }
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
                long contentSize;
                urlRequest.getClass();
                urlResponseInfo.getClass();
                byteBuffer.getClass();
                if (pipedOutputStream2 != null) {
                    if (!atomicBoolean.getAndSet(true)) {
                        pg0 pg0Var = qg0Var;
                        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                        allHeaders.getClass();
                        String url = urlResponseInfo.getUrl();
                        url.getClass();
                        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream2);
                        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                        negotiatedProtocol.getClass();
                        contentSize = this.getContentSize(urlResponseInfo);
                        pg0Var.resumeWith(new HttpResponse(pipedInputStream, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize));
                    }
                    byteBuffer.flip();
                    try {
                        byte[] bArr2 = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr2);
                        pipedOutputStream2.write(bArr2);
                    } catch (IOException e) {
                        DeviceLog.info("IOException during ByteBuffer read. Details: ", e);
                    }
                    byteBuffer.clear();
                    urlRequest.read(byteBuffer);
                    return;
                }
                super.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr2) {
                long contentSize;
                PipedOutputStream pipedOutputStream3;
                urlRequest.getClass();
                urlResponseInfo.getClass();
                bArr2.getClass();
                if (z && (pipedOutputStream3 = pipedOutputStream2) != null) {
                    pipedOutputStream3.close();
                }
                if (!atomicBoolean.getAndSet(true)) {
                    pg0 pg0Var = qg0Var;
                    int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                    Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                    allHeaders.getClass();
                    String url = urlResponseInfo.getUrl();
                    url.getClass();
                    String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                    negotiatedProtocol.getClass();
                    contentSize = this.getContentSize(urlResponseInfo);
                    pg0Var.resumeWith(new HttpResponse(bArr2, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize));
                }
            }
        }, q23.e(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                newUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bArr = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bArr = ((String) httpRequest.getBody()).getBytes(kl0.a);
                bArr.getClass();
            } else {
                bArr = new byte[0];
            }
            newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), q23.e(this.dispatchers.getIo()));
        }
        final UrlRequest build = newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        qg0Var.v(new ub2() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
            @Override // defpackage.ub2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return pn6.a;
            }

            public final void invoke(Throwable th) {
                UrlRequest.this.cancel();
            }
        });
        build.start();
        return qg0Var.r();
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        httpRequest.getClass();
        return (HttpResponse) bx7.K(this.dispatchers.getIo(), new CronetClient$executeBlocking$1(this, httpRequest, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
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
