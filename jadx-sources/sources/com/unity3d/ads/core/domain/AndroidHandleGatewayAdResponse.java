package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final PreShowWebViewStrategy preShowStrategy;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewLessLoadStrategy webViewLessLoadStrategy;

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridgeUseCase, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets, WebViewLessLoadStrategy webViewLessLoadStrategy, SessionRepository sessionRepository, PreShowWebViewStrategy preShowWebViewStrategy) {
        adRepository.getClass();
        androidGetWebViewContainerUseCase.getClass();
        getWebViewBridgeUseCase.getClass();
        deviceInfoRepository.getClass();
        handleInvocationsFromAdViewer.getClass();
        campaignRepository.getClass();
        sendDiagnosticEvent.getClass();
        getOperativeEventApi.getClass();
        getLatestWebViewConfiguration.getClass();
        adPlayerScope.getClass();
        getAdPlayer.getClass();
        cacheWebViewAssets.getClass();
        webViewLessLoadStrategy.getClass();
        sessionRepository.getClass();
        preShowWebViewStrategy.getClass();
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = androidGetWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridgeUseCase;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = handleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.webViewLessLoadStrategy = webViewLessLoadStrategy;
        this.sessionRepository = sessionRepository;
        this.preShowStrategy = preShowWebViewStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cleanup(java.lang.Throwable r17, com.google.protobuf.ByteString r18, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r19, com.unity3d.ads.adplayer.AdPlayer r20, defpackage.vz0 r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            if (r2 == 0) goto L18
            r2 = r1
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.label = r3
        L16:
            r10 = r2
            goto L1e
        L18:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r10.result
            int r2 = r10.label
            r13 = 0
            pn6 r14 = defpackage.pn6.a
            r15 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r2 == 0) goto L43
            if (r2 == r3) goto L3a
            if (r2 != r15) goto L34
            defpackage.m37.N(r1)
            goto La9
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r13
        L3a:
            java.lang.Object r0 = r10.L$0
            com.unity3d.ads.adplayer.AdPlayer r0 = (com.unity3d.ads.adplayer.AdPlayer) r0
            defpackage.m37.N(r1)
            r2 = r4
            goto L9c
        L43:
            defpackage.m37.N(r1)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl$Companion r1 = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder()
            r2.getClass()
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl r1 = r1._create(r2)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r1.setErrorType(r2)
            java.lang.Throwable r2 = r17.getCause()
            if (r2 == 0) goto L64
            java.lang.String r2 = r2.getMessage()
            if (r2 != 0) goto L6c
        L64:
            java.lang.String r2 = r17.getMessage()
            if (r2 != 0) goto L6c
            java.lang.String r2 = ""
        L6c:
            r1.setMessage(r2)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData r1 = r1._build()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r0 = r0.getOperativeEventApi
            r2 = r4
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r4 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.ByteString r6 = r19.getTrackingToken()
            r6.getClass()
            com.google.protobuf.ByteString r7 = r1.toByteString()
            r7.getClass()
            r1 = r20
            r10.L$0 = r1
            r10.label = r3
            r8 = 0
            r9 = 0
            r11 = 48
            r12 = 0
            r5 = r18
            r3 = r0
            java.lang.Object r0 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L9b
            goto La8
        L9b:
            r0 = r1
        L9c:
            if (r0 == 0) goto La9
            r10.L$0 = r13
            r10.label = r15
            java.lang.Object r0 = r0.destroy(r10)
            if (r0 != r2) goto La9
        La8:
            return r2
        La9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, vz0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadUrl(com.unity3d.ads.core.data.model.AdObject r17, java.lang.String r18, com.unity3d.ads.adplayer.WebViewContainer r19, defpackage.vz0 r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            boolean r2 = r0 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$loadUrl$1
            if (r2 == 0) goto L17
            r2 = r0
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$loadUrl$1 r2 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$loadUrl$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$loadUrl$1 r2 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$loadUrl$1
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.result
            int r3 = r2.label
            pn6 r4 = defpackage.pn6.a
            r5 = 1
            if (r3 == 0) goto L3b
            if (r3 != r5) goto L34
            long r5 = r2.J$0
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.data.model.AdObject r2 = (com.unity3d.ads.core.data.model.AdObject) r2
            defpackage.m37.N(r0)     // Catch: java.lang.Throwable -> L31
            goto L59
        L31:
            r0 = move-exception
            r3 = r2
            goto L5e
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            r0 = 0
            return r0
        L3b:
            defpackage.m37.N(r0)
            long r6 = defpackage.j04.b()
            r3 = r17
            r2.L$0 = r3     // Catch: java.lang.Throwable -> L5c
            r2.J$0 = r6     // Catch: java.lang.Throwable -> L5c
            r2.label = r5     // Catch: java.lang.Throwable -> L5c
            r0 = r18
            r5 = r19
            java.lang.Object r0 = r5.loadUrl(r0, r2)     // Catch: java.lang.Throwable -> L5c
            w11 r2 = defpackage.w11.x
            if (r0 != r2) goto L57
            return r2
        L57:
            r2 = r3
            r5 = r6
        L59:
            r10 = r2
            r2 = r4
            goto L64
        L5c:
            r0 = move-exception
            r5 = r6
        L5e:
            y45 r2 = new y45
            r2.<init>(r0)
            r10 = r3
        L64:
            long r5 = defpackage.bf6.b(r5)
            com.unity3d.ads.core.domain.SendDiagnosticEvent r0 = r1.sendDiagnosticEvent
            boolean r1 = r2 instanceof defpackage.y45
            if (r1 != 0) goto L71
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r1 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME
            goto L73
        L71:
            gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventType r1 = gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME
        L73:
            double r5 = defpackage.fq1.h(r5)
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r5)
            r14 = 236(0xec, float:3.31E-43)
            r15 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r5 = r0
            r6 = r1
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            defpackage.m37.N(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.loadUrl(com.unity3d.ads.core.data.model.AdObject, java.lang.String, com.unity3d.ads.adplayer.WebViewContainer, vz0):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r48, com.google.protobuf.ByteString r49, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r50, android.content.Context r51, java.lang.String r52, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r53, boolean r54, boolean r55, defpackage.vz0 r56) {
        /*
            Method dump skipped, instructions count: 3482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, boolean, vz0):java.lang.Object");
    }
}
