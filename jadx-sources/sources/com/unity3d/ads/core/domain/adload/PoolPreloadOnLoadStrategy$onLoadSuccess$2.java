package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.webviewpool.PoolEntry;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$2", f = "PoolPreloadOnLoadStrategy.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PoolPreloadOnLoadStrategy$onLoadSuccess$2 extends t36 implements ic2 {
    final /* synthetic */ AndroidWebViewContainer $container;
    final /* synthetic */ PoolEntry $freshEntry;
    final /* synthetic */ ic2 $loadWebView;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PoolPreloadOnLoadStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolPreloadOnLoadStrategy$onLoadSuccess$2(PoolPreloadOnLoadStrategy poolPreloadOnLoadStrategy, PoolEntry poolEntry, ic2 ic2Var, AndroidWebViewContainer androidWebViewContainer, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = poolPreloadOnLoadStrategy;
        this.$freshEntry = poolEntry;
        this.$loadWebView = ic2Var;
        this.$container = androidWebViewContainer;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        PoolPreloadOnLoadStrategy$onLoadSuccess$2 poolPreloadOnLoadStrategy$onLoadSuccess$2 = new PoolPreloadOnLoadStrategy$onLoadSuccess$2(this.this$0, this.$freshEntry, this.$loadWebView, this.$container, vz0Var);
        poolPreloadOnLoadStrategy$onLoadSuccess$2.L$0 = obj;
        return poolPreloadOnLoadStrategy$onLoadSuccess$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((PoolPreloadOnLoadStrategy$onLoadSuccess$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r7.enqueueRecycled(r0, r6) != r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r7.destroy(r6) == r5) goto L35;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r0 == 0) goto L24
            if (r0 == r4) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L14
            defpackage.m37.N(r7)
            goto L6b
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r1
        L1a:
            defpackage.m37.N(r7)
            goto L5a
        L1e:
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L22
            goto L38
        L22:
            r7 = move-exception
            goto L3b
        L24:
            defpackage.m37.N(r7)
            java.lang.Object r7 = r6.L$0
            v11 r7 = (defpackage.v11) r7
            ic2 r7 = r6.$loadWebView
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = r6.$container
            r6.label = r4     // Catch: java.lang.Throwable -> L22
            java.lang.Object r7 = r7.invoke(r0, r6)     // Catch: java.lang.Throwable -> L22
            if (r7 != r5) goto L38
            goto L6a
        L38:
            com.unity3d.ads.core.domain.adload.PreloadedWebView r7 = (com.unity3d.ads.core.domain.adload.PreloadedWebView) r7     // Catch: java.lang.Throwable -> L22
            goto L41
        L3b:
            y45 r0 = new y45
            r0.<init>(r7)
            r7 = r0
        L41:
            boolean r0 = r7 instanceof defpackage.y45
            if (r0 == 0) goto L46
            goto L47
        L46:
            r1 = r7
        L47:
            com.unity3d.ads.core.domain.adload.PreloadedWebView r1 = (com.unity3d.ads.core.domain.adload.PreloadedWebView) r1
            if (r1 == 0) goto L5a
            com.unity3d.ads.adplayer.AdPlayer r7 = r1.getAdPlayer()
            if (r7 == 0) goto L5a
            r6.label = r3
            java.lang.Object r7 = r7.destroy(r6)
            if (r7 != r5) goto L5a
            goto L6a
        L5a:
            com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy r7 = r6.this$0
            com.unity3d.ads.adplayer.webviewpool.WebViewPool r7 = r7.getPool()
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = r6.$freshEntry
            r6.label = r2
            java.lang.Object r6 = r7.enqueueRecycled(r0, r6)
            if (r6 != r5) goto L6b
        L6a:
            return r5
        L6b:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy$onLoadSuccess$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
