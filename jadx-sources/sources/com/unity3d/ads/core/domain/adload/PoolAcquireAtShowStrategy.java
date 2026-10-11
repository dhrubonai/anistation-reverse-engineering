package com.unity3d.ads.core.domain.adload;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.webviewpool.PoolEntry;
import com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory;
import com.unity3d.ads.adplayer.webviewpool.WebViewPool;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import gatewayprotocol.v1.AdResponseOuterClass;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class PoolAcquireAtShowStrategy implements PreShowWebViewStrategy {
    private final ConcurrentHashMap<ByteString, PoolEntry> claimedEntries;
    private final PooledWebViewContainerFactory containerFactory;
    private final WebViewPool pool;
    private final int poolSize;

    public PoolAcquireAtShowStrategy(WebViewPool webViewPool, int i, PooledWebViewContainerFactory pooledWebViewContainerFactory) {
        webViewPool.getClass();
        pooledWebViewContainerFactory.getClass();
        this.pool = webViewPool;
        this.poolSize = i;
        this.containerFactory = pooledWebViewContainerFactory;
        this.claimedEntries = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object acquireForShow$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy r4, defpackage.v11 r5, com.unity3d.ads.core.data.model.AdObject r6, defpackage.vz0 r7) {
        /*
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy$acquireForShow$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy$acquireForShow$1 r0 = (com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy$acquireForShow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy$acquireForShow$1 r0 = new com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy$acquireForShow$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r4 = r0.L$2
            r6 = r4
            com.unity3d.ads.core.data.model.AdObject r6 = (com.unity3d.ads.core.data.model.AdObject) r6
            java.lang.Object r4 = r0.L$1
            r5 = r4
            v11 r5 = (defpackage.v11) r5
            java.lang.Object r4 = r0.L$0
            com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy r4 = (com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy) r4
            defpackage.m37.N(r7)
            goto L50
        L33:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L3a:
            defpackage.m37.N(r7)
            com.unity3d.ads.adplayer.webviewpool.WebViewPool r7 = r4.pool
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r2
            java.lang.Object r7 = r7.acquireForShow(r0)
            w11 r0 = defpackage.w11.x
            if (r7 != r0) goto L50
            return r0
        L50:
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r7 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r7
            java.util.concurrent.ConcurrentHashMap<com.google.protobuf.ByteString, com.unity3d.ads.adplayer.webviewpool.PoolEntry> r0 = r4.claimedEntries
            com.google.protobuf.ByteString r1 = r6.getOpportunityId()
            r0.put(r1, r7)
            com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool r0 = new com.unity3d.ads.core.domain.adload.WebViewContainerResult$FromPool
            com.unity3d.ads.adplayer.webviewpool.PooledWebViewContainerFactory r4 = r4.containerFactory
            com.unity3d.ads.adplayer.AndroidWebViewContainer r4 = r4.create(r7, r5, r6)
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy.acquireForShow$suspendImpl(com.unity3d.ads.core.domain.adload.PoolAcquireAtShowStrategy, v11, com.unity3d.ads.core.data.model.AdObject, vz0):java.lang.Object");
    }

    public static Object onAdExpired$suspendImpl(PoolAcquireAtShowStrategy poolAcquireAtShowStrategy, AdObject adObject, vz0 vz0Var) {
        Object onShowComplete = poolAcquireAtShowStrategy.onShowComplete(adObject, vz0Var);
        if (onShowComplete == w11.x) {
            return onShowComplete;
        }
        return pn6.a;
    }

    public static Object onLoadSuccess$suspendImpl(PoolAcquireAtShowStrategy poolAcquireAtShowStrategy, AdObject adObject, String str, AdResponseOuterClass.AdResponse adResponse, v11 v11Var, ic2 ic2Var, vz0 vz0Var) {
        Object initialize = poolAcquireAtShowStrategy.pool.initialize(poolAcquireAtShowStrategy.poolSize, vz0Var);
        if (initialize == w11.x) {
            return initialize;
        }
        return pn6.a;
    }

    public static Object onShowComplete$suspendImpl(PoolAcquireAtShowStrategy poolAcquireAtShowStrategy, AdObject adObject, vz0 vz0Var) {
        Object release;
        PoolEntry remove = poolAcquireAtShowStrategy.claimedEntries.remove(adObject.getOpportunityId());
        if (remove != null && (release = poolAcquireAtShowStrategy.pool.release(remove, vz0Var)) == w11.x) {
            return release;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public Object acquireForShow(v11 v11Var, AdObject adObject, vz0 vz0Var) {
        return acquireForShow$suspendImpl(this, v11Var, adObject, vz0Var);
    }

    public final ConcurrentHashMap<ByteString, PoolEntry> getClaimedEntries() {
        return this.claimedEntries;
    }

    public final PooledWebViewContainerFactory getContainerFactory() {
        return this.containerFactory;
    }

    public final WebViewPool getPool() {
        return this.pool;
    }

    public final int getPoolSize() {
        return this.poolSize;
    }

    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public Object onAdExpired(AdObject adObject, vz0 vz0Var) {
        return onAdExpired$suspendImpl(this, adObject, vz0Var);
    }

    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public Object onLoadSuccess(AdObject adObject, String str, AdResponseOuterClass.AdResponse adResponse, v11 v11Var, ic2 ic2Var, vz0 vz0Var) {
        return onLoadSuccess$suspendImpl(this, adObject, str, adResponse, v11Var, ic2Var, vz0Var);
    }

    @Override // com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy
    public Object onShowComplete(AdObject adObject, vz0 vz0Var) {
        return onShowComplete$suspendImpl(this, adObject, vz0Var);
    }
}
