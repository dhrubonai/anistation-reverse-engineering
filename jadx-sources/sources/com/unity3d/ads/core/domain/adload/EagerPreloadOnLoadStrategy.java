package com.unity3d.ads.core.domain.adload;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.ai4;
import defpackage.pn6;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w11;
import defpackage.ye6;
import defpackage.yq0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class EagerPreloadOnLoadStrategy implements PreShowWebViewStrategy {
    private final ConcurrentHashMap<ByteString, yq0> deferreds;
    private final AndroidGetWebViewContainerUseCase getWebViewContainer;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public EagerPreloadOnLoadStrategy(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        androidGetWebViewContainerUseCase.getClass();
        sendDiagnosticEvent.getClass();
        logger.getClass();
        this.getWebViewContainer = androidGetWebViewContainerUseCase;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        this.deferreds = new ConcurrentHashMap<>();
    }

    private final void reportPreloadFailure(AdObject adObject, ye6 ye6Var, String str, String str2, Throwable th) {
        this.logger.error("Eager WebView preload failed (" + str + "): " + str2, th);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_eager_preshow_preload_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var)), vn3.T(new ai4("reason", str), new ai4("reason_debug", str2)), (Map) null, adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 232, (Object) null);
    }

    public static /* synthetic */ void reportPreloadFailure$default(EagerPreloadOnLoadStrategy eagerPreloadOnLoadStrategy, AdObject adObject, ye6 ye6Var, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 16) != 0) {
            th = null;
        }
        eagerPreloadOnLoadStrategy.reportPreloadFailure(adObject, ye6Var, str, str2, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r11 == r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r11 == r6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object acquireForShow(defpackage.v11 r9, com.unity3d.ads.core.data.model.AdObject r10, defpackage.vz0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$acquireForShow$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$acquireForShow$1 r0 = (com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$acquireForShow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$acquireForShow$1 r0 = new com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$acquireForShow$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L48
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            defpackage.m37.N(r11)
            goto La1
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r5
        L35:
            java.lang.Object r9 = r0.L$2
            yq0 r9 = (defpackage.yq0) r9
            java.lang.Object r10 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r10 = (com.unity3d.ads.core.data.model.AdObject) r10
            java.lang.Object r1 = r0.L$0
            v11 r1 = (defpackage.v11) r1
            defpackage.m37.N(r11)     // Catch: java.lang.Throwable -> L45
            goto L86
        L45:
            r8 = move-exception
            goto Lad
        L48:
            defpackage.m37.N(r11)
            goto L68
        L4c:
            defpackage.m37.N(r11)
            java.util.concurrent.ConcurrentHashMap<com.google.protobuf.ByteString, yq0> r11 = r8.deferreds
            com.google.protobuf.ByteString r1 = r10.getOpportunityId()
            java.lang.Object r11 = r11.remove(r1)
            yq0 r11 = (defpackage.yq0) r11
            if (r11 != 0) goto L70
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r8 = r8.getWebViewContainer
            r0.label = r4
            java.lang.Object r11 = r8.invoke(r9, r10, r0)
            if (r11 != r6) goto L68
            goto La0
        L68:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r11 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r11
            com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand r8 = new com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand
            r8.<init>(r11)
            return r8
        L70:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Lab
            r0.L$1 = r10     // Catch: java.lang.Throwable -> Lab
            r0.L$2 = r11     // Catch: java.lang.Throwable -> Lab
            r0.label = r3     // Catch: java.lang.Throwable -> Lab
            r1 = r11
            zq0 r1 = (defpackage.zq0) r1     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r1 = r1.o(r0)     // Catch: java.lang.Throwable -> Lab
            if (r1 != r6) goto L82
            goto La0
        L82:
            r7 = r1
            r1 = r9
            r9 = r11
            r11 = r7
        L86:
            com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded r11 = (com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded) r11     // Catch: java.lang.Throwable -> L45
            zq0 r9 = (defpackage.zq0) r9
            r9.Q(r5)
            if (r11 == 0) goto L90
            return r11
        L90:
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r8 = r8.getWebViewContainer
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r2
            java.lang.Object r11 = r8.invoke(r1, r10, r0)
            if (r11 != r6) goto La1
        La0:
            return r6
        La1:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r11 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r11
            com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand r8 = new com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand
            r8.<init>(r11)
            return r8
        La9:
            r9 = r11
            goto Lad
        Lab:
            r8 = move-exception
            goto La9
        Lad:
            zq0 r9 = (defpackage.zq0) r9
            r9.Q(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.acquireForShow(v11, com.unity3d.ads.core.data.model.AdObject, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public Object onAdExpired(AdObject adObject, vz0 vz0Var) {
        Object onShowComplete = onShowComplete(adObject, vz0Var);
        if (onShowComplete == w11.x) {
            return onShowComplete;
        }
        return pn6.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onLoadSuccess(com.unity3d.ads.core.data.model.AdObject r24, java.lang.String r25, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r26, defpackage.v11 r27, defpackage.ic2 r28, defpackage.vz0 r29) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onLoadSuccess(com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, v11, ic2, vz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r9 == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onShowComplete(com.unity3d.ads.core.data.model.AdObject r8, defpackage.vz0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$onShowComplete$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$onShowComplete$1 r0 = (com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$onShowComplete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$onShowComplete$1 r0 = new com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$onShowComplete$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            pn6 r5 = defpackage.pn6.a
            w11 r6 = defpackage.w11.x
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.m37.N(r9)
            goto L6d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L33:
            defpackage.m37.N(r9)
            goto L5a
        L37:
            defpackage.m37.N(r9)
            java.util.concurrent.ConcurrentHashMap<com.google.protobuf.ByteString, yq0> r7 = r7.deferreds
            com.google.protobuf.ByteString r8 = r8.getOpportunityId()
            java.lang.Object r7 = r7.remove(r8)
            yq0 r7 = (defpackage.yq0) r7
            if (r7 != 0) goto L49
            return r5
        L49:
            zq0 r7 = (defpackage.zq0) r7
            boolean r8 = r7.Q(r2)
            if (r8 != 0) goto L6d
            r0.label = r4
            java.lang.Object r9 = r7.o(r0)
            if (r9 != r6) goto L5a
            goto L6c
        L5a:
            com.unity3d.ads.core.domain.adload.WebViewContainerResult$FullyPreloaded r9 = (com.unity3d.ads.core.domain.adload.WebViewContainerResult.FullyPreloaded) r9
            if (r9 == 0) goto L6d
            com.unity3d.ads.adplayer.AndroidWebViewContainer r7 = r9.getContainer()
            if (r7 == 0) goto L6d
            r0.label = r3
            java.lang.Object r7 = r7.destroy(r0)
            if (r7 != r6) goto L6d
        L6c:
            return r6
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy.onShowComplete(com.unity3d.ads.core.data.model.AdObject, vz0):java.lang.Object");
    }
}
