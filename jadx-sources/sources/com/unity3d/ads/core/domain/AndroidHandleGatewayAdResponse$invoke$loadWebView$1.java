package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1", f = "AndroidHandleGatewayAdResponse.kt", l = {214, 215}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$loadWebView$1 extends t36 implements ic2 {
    final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticAdType $adType;
    final /* synthetic */ AdObject $eagerAdObject;
    final /* synthetic */ String $eagerBase64ImpressionConfig;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ String $webViewUrl;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$loadWebView$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, AdObject adObject, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, AdResponseOuterClass.AdResponse adResponse, String str, String str2, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$eagerAdObject = adObject;
        this.$adType = diagnosticAdType;
        this.$response = adResponse;
        this.$eagerBase64ImpressionConfig = str;
        this.$webViewUrl = str2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidHandleGatewayAdResponse$invoke$loadWebView$1 androidHandleGatewayAdResponse$invoke$loadWebView$1 = new AndroidHandleGatewayAdResponse$invoke$loadWebView$1(this.this$0, this.$eagerAdObject, this.$adType, this.$response, this.$eagerBase64ImpressionConfig, this.$webViewUrl, vz0Var);
        androidHandleGatewayAdResponse$invoke$loadWebView$1.L$0 = obj;
        return androidHandleGatewayAdResponse$invoke$loadWebView$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(WebViewContainer webViewContainer, vz0 vz0Var) {
        return ((AndroidHandleGatewayAdResponse$invoke$loadWebView$1) create(webViewContainer, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d8, code lost:
    
        if (r0 == r5) goto L16;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L32
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1f
            java.lang.Object r1 = r0.L$1
            com.unity3d.ads.adplayer.AdPlayer r1 = (com.unity3d.ads.adplayer.AdPlayer) r1
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.WebViewBridge r0 = (com.unity3d.ads.adplayer.WebViewBridge) r0
            defpackage.m37.N(r31)
            r2 = r0
            r0 = r31
            goto Ldb
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r2
        L25:
            java.lang.Object r1 = r0.L$1
            com.unity3d.ads.adplayer.AdPlayer r1 = (com.unity3d.ads.adplayer.AdPlayer) r1
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.WebViewBridge r2 = (com.unity3d.ads.adplayer.WebViewBridge) r2
            defpackage.m37.N(r31)
            goto Lca
        L32:
            defpackage.m37.N(r31)
            java.lang.Object r1 = r0.L$0
            com.unity3d.ads.adplayer.WebViewContainer r1 = (com.unity3d.ads.adplayer.WebViewContainer) r1
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r6 = r0.this$0
            com.unity3d.ads.core.domain.GetWebViewBridgeUseCase r6 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetWebViewBridge$p(r6)
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r7 = r0.this$0
            com.unity3d.ads.adplayer.AdPlayerScope r7 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getAdPlayerScope$p(r7)
            com.unity3d.ads.adplayer.WebViewBridge r6 = r6.invoke(r1, r7)
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r7 = r0.this$0
            com.unity3d.ads.core.domain.GetAdPlayer r7 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetAdPlayer$p(r7)
            com.unity3d.ads.core.data.model.AdObject r8 = r0.$eagerAdObject
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType r9 = r0.$adType
            com.unity3d.ads.adplayer.AdPlayer r17 = r7.invoke(r6, r1, r8, r9)
            com.unity3d.ads.core.data.model.AdObject r7 = r0.$eagerAdObject
            v11 r11 = r7.getAdScope()
            com.unity3d.ads.core.data.model.AdObject r7 = r0.$eagerAdObject
            com.unity3d.ads.core.data.model.AdObject$WebViewLessLoadingRequiredData r27 = r7.getWebViewLessLoadingRequiredData()
            com.unity3d.ads.core.data.model.AdObject r10 = r0.$eagerAdObject
            r28 = 65470(0xffbe, float:9.1743E-41)
            r29 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            com.unity3d.ads.core.data.model.AdObject r7 = com.unity3d.ads.core.data.model.AdObject.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r8 = r17
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r9 = r0.this$0
            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r9 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getGetHandleInvocationsFromAdViewer$p(r9)
            gatewayprotocol.v1.AdResponseOuterClass$AdResponse r10 = r0.$response
            com.google.protobuf.ByteString r10 = r10.getAdData()
            r10.getClass()
            r11 = 0
            java.lang.String r10 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r10, r11, r4, r2)
            java.lang.String r12 = r0.$eagerBase64ImpressionConfig
            r12.getClass()
            gatewayprotocol.v1.AdResponseOuterClass$AdResponse r13 = r0.$response
            com.google.protobuf.ByteString r13 = r13.getAdDataRefreshToken()
            r13.getClass()
            java.lang.String r2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r13, r11, r4, r2)
            java.util.Map r2 = r9.invoke(r10, r2, r12, r7)
            r6.setExposedFunctions(r2)
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r2 = r0.this$0
            com.unity3d.ads.core.data.model.AdObject r7 = r0.$eagerAdObject
            java.lang.String r9 = r0.$webViewUrl
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r1 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$loadUrl(r2, r7, r9, r1, r0)
            if (r1 != r5) goto Lc8
            goto Lda
        Lc8:
            r2 = r6
            r1 = r8
        Lca:
            w42 r4 = r1.getOnLoadEvent()
            r0.L$0 = r2
            r0.L$1 = r1
            r0.label = r3
            java.lang.Object r0 = defpackage.sw0.H(r4, r0)
            if (r0 != r5) goto Ldb
        Lda:
            return r5
        Ldb:
            com.unity3d.ads.adplayer.model.LoadEvent r0 = (com.unity3d.ads.adplayer.model.LoadEvent) r0
            com.unity3d.ads.core.domain.adload.PreloadedWebView r3 = new com.unity3d.ads.core.domain.adload.PreloadedWebView
            r3.<init>(r1, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadWebView$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
