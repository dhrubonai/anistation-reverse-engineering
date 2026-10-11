package com.unity3d.ads.core.domain;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.m37;
import defpackage.n11;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$2", f = "AndroidGetWebViewContainerUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidGetWebViewContainerUseCase$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ v11 $adPlayerScope;
    final /* synthetic */ AndroidWebViewClient $newWebViewClient;
    int label;
    final /* synthetic */ AndroidGetWebViewContainerUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetWebViewContainerUseCase$invoke$2(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, AndroidWebViewClient androidWebViewClient, v11 v11Var, AdObject adObject, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidGetWebViewContainerUseCase;
        this.$newWebViewClient = androidWebViewClient;
        this.$adPlayerScope = v11Var;
        this.$adObject = adObject;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidGetWebViewContainerUseCase$invoke$2(this.this$0, this.$newWebViewClient, this.$adPlayerScope, this.$adObject, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidGetWebViewContainerUseCase$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Context context;
        SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
        n11 n11Var;
        n11 n11Var2;
        Context context2;
        SendDiagnosticEvent sendDiagnosticEvent;
        if (this.label == 0) {
            m37.N(obj);
            context = this.this$0.context;
            WebView webView = new WebView(context);
            AndroidWebViewClient androidWebViewClient = this.$newWebViewClient;
            WebSettings settings = webView.getSettings();
            settings.setAllowFileAccess(false);
            settings.setBlockNetworkImage(false);
            settings.setBlockNetworkLoads(false);
            settings.setBuiltInZoomControls(false);
            settings.setCacheMode(-1);
            settings.setDatabaseEnabled(false);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(false);
            settings.setGeolocationEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setMixedContentMode(1);
            settings.setNeedInitialFocus(true);
            settings.setSupportMultipleWindows(false);
            settings.setSupportZoom(false);
            settings.setUseWideViewPort(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            webView.setWebViewClient(androidWebViewClient);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setVerticalScrollBarEnabled(false);
            webView.setInitialScale(0);
            webView.setBackgroundColor(0);
            webView.setBackgroundResource(0);
            AndroidWebViewClient androidWebViewClient2 = this.$newWebViewClient;
            sendWebViewClientErrorDiagnostics = this.this$0.sendWebViewClientErrorDiagnostics;
            n11Var = this.this$0.mainDispatcher;
            n11Var2 = this.this$0.defaultDispatcher;
            v11 v11Var = this.$adPlayerScope;
            context2 = this.this$0.context;
            AdObject adObject = this.$adObject;
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            return new AndroidWebViewContainer(webView, androidWebViewClient2, sendWebViewClientErrorDiagnostics, n11Var, n11Var2, v11Var, context2, adObject, sendDiagnosticEvent, false, 512, null);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
