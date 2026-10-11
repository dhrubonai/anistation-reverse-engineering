package com.unity3d.ads.core.domain;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.WebViewScreenCapture", f = "WebViewScreenCapture.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE, 50}, m = "getBlackPixelPercentage")
/* loaded from: classes.dex */
public final class WebViewScreenCapture$getBlackPixelPercentage$1 extends xz0 {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewScreenCapture this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewScreenCapture$getBlackPixelPercentage$1(WebViewScreenCapture webViewScreenCapture, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = webViewScreenCapture;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getBlackPixelPercentage(null, 0, this);
    }
}
