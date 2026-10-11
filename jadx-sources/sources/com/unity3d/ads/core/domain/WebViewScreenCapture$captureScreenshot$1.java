package com.unity3d.ads.core.domain;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.WebViewScreenCapture", f = "WebViewScreenCapture.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_STARTED_VALUE}, m = "captureScreenshot")
/* loaded from: classes.dex */
public final class WebViewScreenCapture$captureScreenshot$1 extends xz0 {
    double D$0;
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewScreenCapture this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewScreenCapture$captureScreenshot$1(WebViewScreenCapture webViewScreenCapture, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = webViewScreenCapture;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.captureScreenshot(null, 0, 0.0d, this);
    }
}
