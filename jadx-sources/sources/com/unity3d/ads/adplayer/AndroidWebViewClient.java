package com.unity3d.ads.adplayer;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import defpackage.a34;
import defpackage.h41;
import defpackage.nc1;
import defpackage.nt1;
import defpackage.ot1;
import defpackage.q71;
import defpackage.qx5;
import defpackage.sx5;
import defpackage.t43;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.uz5;
import defpackage.x44;
import defpackage.y45;
import defpackage.yo0;
import defpackage.yq0;
import defpackage.zq0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    public static final Companion Companion = new Companion(null);
    private final x44 _isRenderProcessGone;
    private final yq0 _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final qx5 isRenderProcessGone;
    private final x44 loadErrors;
    private final nc1 onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final x44 webviewType;

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        getCachedAsset.getClass();
        sendDiagnosticEvent.getClass();
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = tx5.a(nt1.x);
        zq0 c = tl7.c();
        this._onLoadFinished = c;
        this.onLoadFinished = c;
        sx5 a = tx5.a(Boolean.FALSE);
        this._isRenderProcessGone = a;
        this.isRenderProcessGone = h41.d(a);
        this.webviewType = tx5.a("");
    }

    public final nc1 getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final qx5 isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        String str2;
        webView.getClass();
        str.getClass();
        if (str.equals(BLANK_PAGE)) {
            x44 x44Var = this.loadErrors;
            while (true) {
                sx5 sx5Var = (sx5) x44Var;
                Object value = sx5Var.getValue();
                str2 = str;
                if (sx5Var.j(value, yo0.v0((List) value, new WebViewClientError(str2, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    str = str2;
                }
            }
        } else {
            str2 = str;
        }
        super.onPageFinished(webView, str2);
        ((zq0) this._onLoadFinished).Q(((sx5) this.loadErrors).getValue());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        sx5 sx5Var;
        Object value;
        webView.getClass();
        renderProcessGoneDetail.getClass();
        ViewExtensionsKt.removeViewFromParent(webView);
        webView.destroy();
        x44 x44Var = this._isRenderProcessGone;
        Boolean bool = Boolean.TRUE;
        sx5 sx5Var2 = (sx5) x44Var;
        sx5Var2.getClass();
        sx5Var2.l(null, bool);
        if (!((t43) this._onLoadFinished).k0()) {
            x44 x44Var2 = this.loadErrors;
            do {
                sx5Var = (sx5) x44Var2;
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, yo0.v0((List) value, new WebViewClientError(String.valueOf(webView.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
            ((zq0) this._onLoadFinished).Q(((sx5) this.loadErrors).getValue());
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Map map;
        Object y45Var;
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        try {
            if (url == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            try {
                y45Var = url.getQueryParameter("webviewType");
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            if (y45Var instanceof y45) {
                y45Var = null;
            }
            String str = (String) y45Var;
            if (str != null && !uz5.V(str)) {
                ((sx5) this.webviewType).k(str);
            }
            if (a34.i(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = webResourceRequest.getUrl();
            url2.getClass();
            return getCachedAsset.invoke(url2, (String) ((sx5) this.webviewType).getValue());
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message != null) {
                map = Collections.singletonMap("reason", message);
                map.getClass();
            } else {
                map = ot1.x;
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", (Double) null, map, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
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
