package com.unity3d.ads.core.domain;

import android.view.View;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.WebViewScreenCapture$resolveTargetView$2", f = "WebViewScreenCapture.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebViewScreenCapture$resolveTargetView$2 extends t36 implements ic2 {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewScreenCapture$resolveTargetView$2(AdObject adObject, vz0 vz0Var) {
        super(2, vz0Var);
        this.$adObject = adObject;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new WebViewScreenCapture$resolveTargetView$2(this.$adObject, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((WebViewScreenCapture$resolveTargetView$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        WebViewContainer webViewContainer;
        AndroidWebViewContainer androidWebViewContainer;
        WebView webView;
        View view = null;
        if (this.label == 0) {
            m37.N(obj);
            AdPlayer adPlayer = this.$adObject.getAdPlayer();
            if (adPlayer != null) {
                webViewContainer = adPlayer.getWebViewContainer();
            } else {
                webViewContainer = null;
            }
            if (webViewContainer instanceof AndroidWebViewContainer) {
                androidWebViewContainer = (AndroidWebViewContainer) webViewContainer;
            } else {
                androidWebViewContainer = null;
            }
            if (androidWebViewContainer != null && (webView = androidWebViewContainer.getWebView()) != null) {
                if (this.$adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER) {
                    Object parent = webView.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    if (view == null) {
                        return webView;
                    }
                    return view;
                }
                return webView.getRootView();
            }
            ze0.m("No web view container available to capture");
            return null;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
