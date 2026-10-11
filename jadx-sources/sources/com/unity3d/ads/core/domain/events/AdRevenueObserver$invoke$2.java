package com.unity3d.ads.core.domain.events;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2", f = "AdRevenueObserver.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AdRevenueObserver$invoke$2 extends t36 implements ic2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdRevenueObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdRevenueObserver$invoke$2(AdRevenueObserver adRevenueObserver, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = adRevenueObserver;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AdRevenueObserver$invoke$2 adRevenueObserver$invoke$2 = new AdRevenueObserver$invoke$2(this.this$0, vz0Var);
        adRevenueObserver$invoke$2.L$0 = obj;
        return adRevenueObserver$invoke$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, vz0 vz0Var) {
        return ((AdRevenueObserver$invoke$2) create(adRevenueEventRequest, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(1:2)|(2:25|(1:(3:28|16|17)(2:29|30))(1:31))(4:4|5|6|(2:8|9))|11|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, null, r6, r7, r8, r9, 1, null) == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        r0 = e;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 2
            r2 = 1
            w11 r3 = defpackage.w11.x
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L15
            defpackage.m37.N(r13)     // Catch: java.lang.Exception -> L11 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            goto L7f
        L11:
            r0 = move-exception
            r13 = r0
            r9 = r12
            goto L74
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            r12 = 0
            return r12
        L1c:
            defpackage.m37.N(r13)     // Catch: java.lang.Exception -> L11 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            goto L4c
        L20:
            defpackage.m37.N(r13)
            java.lang.Object r13 = r12.L$0
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueEventRequest r13 = (gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequest) r13
            gatewayprotocol.v1.UniversalRequestKt r0 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r4 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            r4.getClass()     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r0 = r0._create(r4)     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            r0.setAdRevenueEventRequest(r13)     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r0._build()     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            com.unity3d.ads.core.domain.events.AdRevenueObserver r0 = r12.this$0     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r0 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGetUniversalRequestForPayLoad$p(r0)     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            r12.label = r2     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            java.lang.Object r13 = r0.invoke(r13, r12)     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            if (r13 != r3) goto L4c
            goto L6d
        L4c:
            r6 = r13
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            com.unity3d.ads.core.domain.events.AdRevenueObserver r13 = r12.this$0     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGatewayClient$p(r13)     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            com.unity3d.ads.core.domain.events.AdRevenueObserver r13 = r12.this$0     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGetRequestPolicy$p(r13)     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.AD_REVENUE_EVENT     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            r12.label = r1     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            r5 = 0
            r10 = 1
            r11 = 0
            r9 = r12
            java.lang.Object r12 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L6e com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L7f
            if (r12 != r3) goto L7f
        L6d:
            return r3
        L6e:
            r0 = move-exception
        L6f:
            r13 = r0
            goto L74
        L71:
            r0 = move-exception
            r9 = r12
            goto L6f
        L74:
            com.unity3d.ads.core.domain.events.AdRevenueObserver r12 = r9.this$0
            com.unity3d.ads.core.log.Logger r12 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getLogger$p(r12)
            java.lang.String r0 = "Unexpected error processing ad revenue event"
            r12.trace(r0, r13)
        L7f:
            pn6 r12 = defpackage.pn6.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
