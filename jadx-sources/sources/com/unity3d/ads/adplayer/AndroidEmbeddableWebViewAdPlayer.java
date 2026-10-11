package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import defpackage.db;
import defpackage.p65;
import defpackage.pv6;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w42;
import defpackage.ze0;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final WebViewAdPlayer webViewAdPlayer;
    private final WebViewContainer webViewContainer;

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String str, WebViewContainer webViewContainer, OpenMeasurementRepository openMeasurementRepository, LifecycleDataSource lifecycleDataSource, Context context) {
        webViewAdPlayer.getClass();
        str.getClass();
        webViewContainer.getClass();
        openMeasurementRepository.getClass();
        lifecycleDataSource.getClass();
        context.getClass();
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = str;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r8, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r9.destroy(r0) != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (defpackage.x97.u(1000, r0) == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object destroy(defpackage.vz0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            defpackage.m37.N(r9)
            goto L73
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            r8 = 0
            return r8
        L34:
            defpackage.m37.N(r9)
            goto L6a
        L38:
            defpackage.m37.N(r9)
            goto L5d
        L3c:
            defpackage.m37.N(r9)
            com.unity3d.ads.adplayer.WebViewAdPlayer r9 = r8.webViewAdPlayer
            r9.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r8.openMeasurementRepository
            java.lang.String r1 = r8.opportunityId
            com.google.protobuf.ByteString r1 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r1)
            boolean r9 = r9.hasSessionFinished(r1)
            if (r9 == 0) goto L5d
            r0.label = r4
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = defpackage.x97.u(r6, r0)
            if (r9 != r5) goto L5d
            goto L72
        L5d:
            com.unity3d.ads.adplayer.WebViewContainer r9 = r8.getWebViewContainer()
            r0.label = r3
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r5) goto L6a
            goto L72
        L6a:
            r0.label = r2
            java.lang.Object r8 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r8, r0)
            if (r8 != r5) goto L73
        L72:
            return r5
        L73:
            pn6 r8 = defpackage.pn6.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public w42 getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public w42 getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public w42 getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public v11 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, vz0 vz0Var) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, vz0 vz0Var) {
        return this.webViewAdPlayer.onBroadcastEvent(str, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, vz0 vz0Var) {
        return this.webViewAdPlayer.requestShow(map, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(vz0 vz0Var) {
        return this.webViewAdPlayer.sendActivityDestroyed(vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, vz0 vz0Var) {
        return this.webViewAdPlayer.sendFocusChange(z, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, vz0 vz0Var) {
        return this.webViewAdPlayer.sendMuteChange(z, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, vz0 vz0Var) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, vz0 vz0Var) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, vz0 vz0Var) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, vz0 vz0Var) {
        return this.webViewAdPlayer.sendVisibilityChange(z, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, vz0 vz0Var) {
        return this.webViewAdPlayer.sendVolumeChange(d, vz0Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(final ShowOptions showOptions) {
        String str;
        showOptions.getClass();
        if (showOptions instanceof AndroidShowOptions) {
            BannerViewCache bannerViewCache = BannerViewCache.getInstance();
            BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
            if (bannerView == null) {
                if (bannerViewCache.isBannerViewDeleted(this.opportunityId)) {
                    str = "BannerView has been deleted";
                } else {
                    str = "BannerView not found";
                }
                p65.f(str);
                return;
            }
            tl7.z(db.j(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1(this, bannerView, null), 3);
            final WebView webView = getWebViewContainer().getWebView();
            int i = pv6.a;
            if (webView.isAttachedToWindow()) {
                tl7.z(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3);
                if (!webView.isAttachedToWindow()) {
                    tl7.z(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3);
                } else {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(webView, this));
                }
            } else {
                webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        view.getClass();
                        webView.removeOnAttachStateChangeListener(this);
                        tl7.z(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3);
                        int i2 = pv6.a;
                        boolean isAttachedToWindow = view.isAttachedToWindow();
                        AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this;
                        if (!isAttachedToWindow) {
                            tl7.z(androidEmbeddableWebViewAdPlayer.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3);
                        } else {
                            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(view, androidEmbeddableWebViewAdPlayer));
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        view.getClass();
                    }
                });
            }
            tl7.z(db.j(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3(bannerView, this, null), 3);
            return;
        }
        ze0.k("Failed requirement.");
    }
}
