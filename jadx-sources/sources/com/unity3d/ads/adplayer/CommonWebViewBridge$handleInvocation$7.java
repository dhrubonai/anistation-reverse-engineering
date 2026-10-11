package com.unity3d.ads.adplayer;

import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {133, 134}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonWebViewBridge$handleInvocation$7 extends t36 implements ic2 {
    final /* synthetic */ String $callback;
    final /* synthetic */ String $location;
    final /* synthetic */ JSONArray $parameters;
    Object L$0;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocation$7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, vz0 vz0Var) {
        super(2, vz0Var);
        this.$location = str;
        this.$parameters = jSONArray;
        this.this$0 = commonWebViewBridge;
        this.$callback = str2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new CommonWebViewBridge$handleInvocation$7(this.$location, this.$parameters, this.this$0, this.$callback, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((CommonWebViewBridge$handleInvocation$7) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r6 == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r7.emit(r0, r6) == r4) goto L15;
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
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.m37.N(r7)
            goto L4f
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r1
        L17:
            java.lang.Object r0 = r6.L$0
            com.unity3d.ads.adplayer.Invocation r0 = (com.unity3d.ads.adplayer.Invocation) r0
            defpackage.m37.N(r7)
            goto L40
        L1f:
            defpackage.m37.N(r7)
            com.unity3d.ads.adplayer.Invocation r0 = new com.unity3d.ads.adplayer.Invocation
            java.lang.String r7 = r6.$location
            org.json.JSONArray r5 = r6.$parameters
            java.lang.Object[] r5 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r5)
            r0.<init>(r7, r5)
            com.unity3d.ads.adplayer.CommonWebViewBridge r7 = r6.this$0
            t44 r7 = com.unity3d.ads.adplayer.CommonWebViewBridge.access$get_onInvocation$p(r7)
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r7 = r7.emit(r0, r6)
            if (r7 != r4) goto L40
            goto L4e
        L40:
            com.unity3d.ads.adplayer.CommonWebViewBridge r7 = r6.this$0
            java.lang.String r3 = r6.$callback
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r6 = com.unity3d.ads.adplayer.CommonWebViewBridge.access$handleInvocationResult(r7, r0, r3, r6)
            if (r6 != r4) goto L4f
        L4e:
            return r4
        L4f:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
