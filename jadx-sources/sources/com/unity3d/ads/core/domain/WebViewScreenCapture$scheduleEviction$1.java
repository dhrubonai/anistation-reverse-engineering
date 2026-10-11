package com.unity3d.ads.core.domain;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.WebViewScreenCapture$scheduleEviction$1", f = "WebViewScreenCapture.kt", l = {137, 172}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WebViewScreenCapture$scheduleEviction$1 extends t36 implements ic2 {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WebViewScreenCapture this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewScreenCapture$scheduleEviction$1(WebViewScreenCapture webViewScreenCapture, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = webViewScreenCapture;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new WebViewScreenCapture$scheduleEviction$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((WebViewScreenCapture$scheduleEviction$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (defpackage.x97.u(r5, r7) == r4) goto L15;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 2
            r2 = 1
            r3 = 0
            w11 r4 = defpackage.w11.x
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L19
            java.lang.Object r0 = r7.L$1
            com.unity3d.ads.core.domain.WebViewScreenCapture r0 = (com.unity3d.ads.core.domain.WebViewScreenCapture) r0
            java.lang.Object r7 = r7.L$0
            k54 r7 = (defpackage.k54) r7
            defpackage.m37.N(r8)
            goto L4b
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r3
        L1f:
            defpackage.m37.N(r8)
            goto L35
        L23:
            defpackage.m37.N(r8)
            com.unity3d.ads.core.domain.WebViewScreenCapture r8 = r7.this$0
            long r5 = com.unity3d.ads.core.domain.WebViewScreenCapture.access$getCacheTtlMs$p(r8)
            r7.label = r2
            java.lang.Object r8 = defpackage.x97.u(r5, r7)
            if (r8 != r4) goto L35
            goto L49
        L35:
            com.unity3d.ads.core.domain.WebViewScreenCapture r8 = r7.this$0
            k54 r8 = com.unity3d.ads.core.domain.WebViewScreenCapture.access$getMutex$p(r8)
            com.unity3d.ads.core.domain.WebViewScreenCapture r0 = r7.this$0
            r7.L$0 = r8
            r7.L$1 = r0
            r7.label = r1
            java.lang.Object r7 = r8.a(r7)
            if (r7 != r4) goto L4a
        L49:
            return r4
        L4a:
            r7 = r8
        L4b:
            com.unity3d.ads.core.domain.WebViewScreenCapture.access$setCachedBitmap$p(r0, r3)     // Catch: java.lang.Throwable -> L57
            com.unity3d.ads.core.domain.WebViewScreenCapture.access$setCachedViewRef$p(r0, r3)     // Catch: java.lang.Throwable -> L57
            r7.l(r3)
            pn6 r7 = defpackage.pn6.a
            return r7
        L57:
            r8 = move-exception
            r7.l(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.WebViewScreenCapture$scheduleEviction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
