package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory;
import com.unity3d.ads.adplayer.webviewpool.WebViewPool;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class PoolPreloadOnLoadStrategy extends PoolAcquireAtShowStrategy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolPreloadOnLoadStrategy(WebViewPool webViewPool, int i, PooledWebViewContainerFactory pooledWebViewContainerFactory) {
        super(webViewPool, i, pooledWebViewContainerFactory);
        webViewPool.getClass();
        pooledWebViewContainerFactory.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r9 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object acquireForShow(defpackage.v11 r7, com.unity3d.ads.core.data.model.AdObject r8, defpackage.vz0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$acquireForShow$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$acquireForShow$1 r0 = (com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$acquireForShow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$acquireForShow$1 r0 = new com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$acquireForShow$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r1 == 0) goto L46
            if (r1 == r3) goto L39
            if (r1 != r2) goto L32
            java.lang.Object r7 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r7 = (com.unity3d.ads.core.data.model.AdObject) r7
            java.lang.Object r8 = r0.L$0
            v11 r8 = (defpackage.v11) r8
            defpackage.m37.N(r9)
            goto L70
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L39:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            com.unity3d.ads.core.data.model.AdObject r8 = (com.unity3d.ads.core.data.model.AdObject) r8
            java.lang.Object r7 = r0.L$0
            v11 r7 = (defpackage.v11) r7
            defpackage.m37.N(r9)
            goto L5a
        L46:
            defpackage.m37.N(r9)
            com.unity3d.ads.adplayer.webviewpool.WebViewPool r9 = r6.getPool()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r9.acquireForShow(r0)
            if (r9 != r4) goto L5a
            goto L6c
        L5a:
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r9 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r9
            com.unity3d.ads.adplayer.webviewpool.WebViewPool r1 = r6.getPool()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r2
            java.lang.Object r9 = r1.resetEntry(r9, r0)
            if (r9 != r4) goto L6d
        L6c:
            return r4
        L6d:
            r5 = r8
            r8 = r7
            r7 = r5
        L70:
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r9 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r9
            java.util.concurrent.ConcurrentHashMap r0 = r6.getClaimedEntries()
            com.google.protobuf.ByteString r1 = r7.getOpportunityId()
            r0.put(r1, r9)
            com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool r0 = new com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool
            com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory r6 = r6.getContainerFactory()
            com.unity3d.ads.adplayer.AndroidWebViewContainer r6 = r6.create(r9, r8, r7)
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy.acquireForShow(v11, com.unity3d.ads.core.data.model.AdObject, vz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onLoadSuccess(com.unity3d.ads.core.data.model.AdObject r12, java.lang.String r13, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r14, defpackage.v11 r15, defpackage.ic2 r16, defpackage.vz0 r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$1
            if (r1 == 0) goto L15
            r1 = r0
            com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$1 r1 = (com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$1 r1 = new com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$1
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.result
            int r3 = r1.label
            r4 = 0
            r5 = 2
            r6 = 1
            w11 r7 = defpackage.w11.x
            if (r3 == 0) goto L51
            if (r3 == r6) goto L3f
            if (r3 != r5) goto L39
            java.lang.Object r3 = r1.L$2
            ic2 r3 = (defpackage.ic2) r3
            java.lang.Object r5 = r1.L$1
            v11 r5 = (defpackage.v11) r5
            java.lang.Object r1 = r1.L$0
            com.unity3d.ads.core.data.model.AdObject r1 = (com.unity3d.ads.core.data.model.AdObject) r1
            defpackage.m37.N(r0)
            goto L85
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            return r4
        L3f:
            java.lang.Object r3 = r1.L$2
            ic2 r3 = (defpackage.ic2) r3
            java.lang.Object r6 = r1.L$1
            v11 r6 = (defpackage.v11) r6
            java.lang.Object r8 = r1.L$0
            com.unity3d.ads.core.data.model.AdObject r8 = (com.unity3d.ads.core.data.model.AdObject) r8
            defpackage.m37.N(r0)
            r10 = r3
            r9 = r6
            goto L6f
        L51:
            defpackage.m37.N(r0)
            com.unity3d.ads.adplayer.webviewpool.WebViewPool r0 = r11.getPool()
            int r3 = r11.getPoolSize()
            r1.L$0 = r12
            r1.L$1 = r15
            r10 = r16
            r1.L$2 = r10
            r1.label = r6
            java.lang.Object r0 = r0.initialize(r3, r1)
            if (r0 != r7) goto L6d
            goto L81
        L6d:
            r8 = r12
            r9 = r15
        L6f:
            com.unity3d.ads.adplayer.webviewpool.WebViewPool r0 = r11.getPool()
            r1.L$0 = r8
            r1.L$1 = r9
            r1.L$2 = r10
            r1.label = r5
            java.lang.Object r0 = r0.acquireFreshEntry(r1)
            if (r0 != r7) goto L82
        L81:
            return r7
        L82:
            r1 = r8
            r5 = r9
            r3 = r10
        L85:
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r0
            pn6 r6 = defpackage.pn6.a
            if (r0 != 0) goto L8c
            return r6
        L8c:
            com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory r7 = r11.getContainerFactory()
            com.unity3d.ads.adplayer.AndroidWebViewContainer r1 = r7.create(r0, r5, r1)
            com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$2 r7 = new com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$2
            r8 = 0
            r13 = r11
            r14 = r0
            r16 = r1
            r15 = r3
            r12 = r7
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r0 = r12
            r1 = 3
            defpackage.tl7.z(r5, r4, r4, r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy.onLoadSuccess(com.unity3d.ads.core.data.model.AdObject, java.lang.String, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, v11, ic2, vz0):java.lang.Object");
    }
}
