package com.unity3d.ads.adplayer.webviewpool;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireFreshEntry$2", f = "AndroidWebViewPool.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE, 50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewPool$acquireFreshEntry$2 extends t36 implements ic2 {
    Object L$0;
    int label;
    final /* synthetic */ AndroidWebViewPool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewPool$acquireFreshEntry$2(AndroidWebViewPool androidWebViewPool, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidWebViewPool;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidWebViewPool$acquireFreshEntry$2(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidWebViewPool$acquireFreshEntry$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r6 == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r6 == r4) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:6:0x0054). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.m37.N(r6)
            goto L54
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r1
        L17:
            java.lang.Object r0 = r5.L$0
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r0
            defpackage.m37.N(r6)
            goto L3e
        L1f:
            defpackage.m37.N(r6)
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = r5.this$0
            java.util.concurrent.ConcurrentLinkedQueue r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(r6)
            java.lang.Object r6 = r6.poll()
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r6 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r6
            r0 = r6
        L2f:
            if (r0 == 0) goto L62
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = r5.this$0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$isHealthy(r6, r0, r5)
            if (r6 != r4) goto L3e
            goto L53
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L47
            return r0
        L47:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = r5.this$0
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$destroyEntry(r6, r0, r5)
            if (r6 != r4) goto L54
        L53:
            return r4
        L54:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = r5.this$0
            java.util.concurrent.ConcurrentLinkedQueue r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(r6)
            java.lang.Object r6 = r6.poll()
            r0 = r6
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r0
            goto L2f
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireFreshEntry$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
