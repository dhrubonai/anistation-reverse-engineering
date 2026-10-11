package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import defpackage.ic2;
import defpackage.uc2;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public /* synthetic */ class CommonWebViewBridge$handleInvocationResult$2 extends uc2 implements ic2 {
    public CommonWebViewBridge$handleInvocationResult$2(Object obj) {
        super(2, obj, CommonWebViewBridge.class, "sendEvent", "sendEvent(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ic2
    public final Object invoke(WebViewEvent webViewEvent, vz0 vz0Var) {
        return ((CommonWebViewBridge) this.receiver).sendEvent(webViewEvent, vz0Var);
    }
}
