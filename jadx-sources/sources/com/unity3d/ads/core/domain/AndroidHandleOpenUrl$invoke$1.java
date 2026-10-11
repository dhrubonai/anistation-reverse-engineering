package com.unity3d.ads.core.domain;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl", f = "AndroidHandleOpenUrl.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE}, m = "invoke")
/* loaded from: classes.dex */
public final class AndroidHandleOpenUrl$invoke$1 extends xz0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleOpenUrl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleOpenUrl$invoke$1(AndroidHandleOpenUrl androidHandleOpenUrl, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = androidHandleOpenUrl;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, false, this);
    }
}
