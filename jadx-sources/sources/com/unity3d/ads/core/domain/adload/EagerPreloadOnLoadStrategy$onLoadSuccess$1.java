package com.unity3d.ads.core.domain.adload;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy", f = "EagerPreloadOnLoadStrategy.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MODULE_INIT_PARAMS_SUCCESS_TIME_VALUE, 79, 89}, m = "onLoadSuccess")
/* loaded from: classes.dex */
public final class EagerPreloadOnLoadStrategy$onLoadSuccess$1 extends xz0 {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EagerPreloadOnLoadStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EagerPreloadOnLoadStrategy$onLoadSuccess$1(EagerPreloadOnLoadStrategy eagerPreloadOnLoadStrategy, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = eagerPreloadOnLoadStrategy;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onLoadSuccess(null, null, null, null, null, this);
    }
}
