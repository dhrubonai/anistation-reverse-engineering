package com.unity3d.ads.adplayer;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {150, 158, 160, 164, 166, 181, 186}, m = "handleInvocationResult")
/* loaded from: classes.dex */
public final class CommonWebViewBridge$handleInvocationResult$1 extends xz0 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocationResult$1(CommonWebViewBridge commonWebViewBridge, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = commonWebViewBridge;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object handleInvocationResult;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleInvocationResult = this.this$0.handleInvocationResult(null, null, this);
        return handleInvocationResult;
    }
}
