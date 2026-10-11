package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.ep;
import defpackage.fq3;
import defpackage.h37;
import defpackage.hp;
import defpackage.i37;
import defpackage.ip;
import defpackage.o85;
import defpackage.ov3;
import defpackage.p85;
import defpackage.t80;
import defpackage.u37;
import defpackage.v37;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, h37 h37Var) {
        if (u37.a("WEB_RESOURCE_ERROR_GET_CODE") && u37.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && ep.b(webResourceRequest)) {
            i37 i37Var = (i37) h37Var;
            i37Var.getClass();
            u37.b.getClass();
            WebResourceError webResourceError = i37Var.a;
            if (webResourceError == null) {
                fq3 fq3Var = v37.a;
                webResourceError = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) fq3Var.y).convertWebResourceError(Proxy.getInvocationHandler(i37Var.b));
                i37Var.a = webResourceError;
            }
            int f = hp.f(webResourceError);
            i37 i37Var2 = (i37) h37Var;
            u37.a.getClass();
            WebResourceError webResourceError2 = i37Var2.a;
            if (webResourceError2 == null) {
                fq3 fq3Var2 = v37.a;
                webResourceError2 = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) fq3Var2.y).convertWebResourceError(Proxy.getInvocationHandler(i37Var2.b));
                i37Var2.a = webResourceError2;
            }
            onReceivedError(webView, f, hp.e(webResourceError2).toString(), ep.a(webResourceRequest).toString());
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, o85 o85Var) {
        if (u37.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            p85 p85Var = (p85) o85Var;
            p85Var.getClass();
            u37.c.getClass();
            SafeBrowsingResponse safeBrowsingResponse = p85Var.a;
            if (safeBrowsingResponse == null) {
                fq3 fq3Var = v37.a;
                safeBrowsingResponse = (SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) fq3Var.y).convertSafeBrowsingResponse(Proxy.getInvocationHandler(p85Var.b));
                p85Var.a = safeBrowsingResponse;
            }
            ip.e(safeBrowsingResponse, true);
            return;
        }
        ov3.g("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, ep.a(webResourceRequest).toString());
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p85, o85] */
    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        ?? obj = new Object();
        obj.a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i, (o85) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p85, o85] */
    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        ?? obj = new Object();
        obj.b = (SafeBrowsingResponseBoundaryInterface) t80.t(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i, (o85) obj);
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i37, h37] */
    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ?? obj = new Object();
        obj.a = webResourceError;
        onReceivedError(webView, webResourceRequest, (h37) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i37, h37] */
    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        ?? obj = new Object();
        obj.b = (WebResourceErrorBoundaryInterface) t80.t(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, (h37) obj);
    }
}
