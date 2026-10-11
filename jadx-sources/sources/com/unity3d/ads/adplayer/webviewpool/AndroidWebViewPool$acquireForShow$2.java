package com.unity3d.ads.adplayer.webviewpool;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$2", f = "AndroidWebViewPool.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_SHOW_CALL_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewPool$acquireForShow$2 extends t36 implements ic2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AndroidWebViewPool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewPool$acquireForShow$2(AndroidWebViewPool androidWebViewPool, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidWebViewPool;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidWebViewPool$acquireForShow$2(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidWebViewPool$acquireForShow$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0091 -> B:6:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0051 -> B:6:0x0057). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 0
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r0 == 0) goto L30
            if (r0 == r3) goto L20
            if (r0 != r2) goto L1a
            java.lang.Object r0 = r8.L$1
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.lang.Object r5 = r8.L$0
            java.util.Iterator r5 = (java.util.Iterator) r5
            defpackage.m37.N(r9)
            r9 = r5
            goto L57
        L1a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r1
        L20:
            java.lang.Object r0 = r8.L$2
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r0
            java.lang.Object r5 = r8.L$1
            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
            java.lang.Object r6 = r8.L$0
            java.util.Iterator r6 = (java.util.Iterator) r6
            defpackage.m37.N(r9)
            goto L77
        L30:
            defpackage.m37.N(r9)
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r9 = r8.this$0
            java.util.concurrent.ConcurrentLinkedQueue r9 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(r9)
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0 = r8.this$0
            java.util.concurrent.ConcurrentLinkedQueue r0 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getRecycledViews$p(r0)
            java.util.concurrent.ConcurrentLinkedQueue[] r9 = new java.util.concurrent.ConcurrentLinkedQueue[]{r9, r0}
            java.util.List r9 = defpackage.te4.I(r9)
            java.util.Iterator r9 = r9.iterator()
        L4b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r9.next()
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
        L57:
            java.lang.Object r5 = r0.poll()
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r5 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r5
            if (r5 != 0) goto L60
            goto L4b
        L60:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = r8.this$0
            r8.L$0 = r9
            r8.L$1 = r0
            r8.L$2 = r5
            r8.label = r3
            java.lang.Object r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$isHealthy(r6, r5, r8)
            if (r6 != r4) goto L71
            goto L90
        L71:
            r7 = r6
            r6 = r9
            r9 = r7
            r7 = r5
            r5 = r0
            r0 = r7
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L80
            return r0
        L80:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r9 = r8.this$0
            r8.L$0 = r6
            r8.L$1 = r5
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r9 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$destroyEntry(r9, r0, r8)
            if (r9 != r4) goto L91
        L90:
            return r4
        L91:
            r0 = r5
            r9 = r6
            goto L57
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
