package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.v11;
import defpackage.vz0;
import gatewayprotocol.v1.AdResponseOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class DisabledPreShowStrategy implements PreShowWebViewStrategy {
    private final AndroidGetWebViewContainerUseCase getWebViewContainer;

    public DisabledPreShowStrategy(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase) {
        androidGetWebViewContainerUseCase.getClass();
        this.getWebViewContainer = androidGetWebViewContainerUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object acquireForShow(defpackage.v11 r5, com.unity3d.ads.core.data.model.AdObject r6, defpackage.vz0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.adload.DisabledPreShowStrategy$acquireForShow$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.adload.DisabledPreShowStrategy$acquireForShow$1 r0 = (com.unity3d.ads.core.domain.adload.DisabledPreShowStrategy$acquireForShow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.adload.DisabledPreShowStrategy$acquireForShow$1 r0 = new com.unity3d.ads.core.domain.adload.DisabledPreShowStrategy$acquireForShow$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r7)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r7)
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r4 = r4.getWebViewContainer
            r0.label = r2
            java.lang.Object r7 = r4.invoke(r5, r6, r0)
            w11 r4 = defpackage.w11.x
            if (r7 != r4) goto L3c
            return r4
        L3c:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r7 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r7
            com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand r4 = new com.unity3d.ads.core.domain.adload.WebViewContainerResult$OnDemand
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.DisabledPreShowStrategy.acquireForShow(v11, com.unity3d.ads.core.data.model.AdObject, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public Object onAdExpired(AdObject adObject, vz0 vz0Var) {
        return pn6.a;
    }

    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public Object onLoadSuccess(AdObject adObject, String str, AdResponseOuterClass.AdResponse adResponse, v11 v11Var, ic2 ic2Var, vz0 vz0Var) {
        return pn6.a;
    }

    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public Object onShowComplete(AdObject adObject, vz0 vz0Var) {
        return pn6.a;
    }
}
