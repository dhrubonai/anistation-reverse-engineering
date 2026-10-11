package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonGatewayClient$request$2 extends t36 implements ic2 {
    final /* synthetic */ OperationType $operationType;
    final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
    final /* synthetic */ RequestPolicy $requestPolicy;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$request$2(CommonGatewayClient commonGatewayClient, OperationType operationType, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = commonGatewayClient;
        this.$operationType = operationType;
        this.$url = str;
        this.$request = universalRequest;
        this.$requestPolicy = requestPolicy;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new CommonGatewayClient$request$2(this.this$0, this.$operationType, this.$url, this.$request, this.$requestPolicy, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((CommonGatewayClient$request$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        RequestUrlFactory requestUrlFactory;
        Object executeWithRetry;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        CommonGatewayClient commonGatewayClient = this.this$0;
        requestUrlFactory = commonGatewayClient.requestUrlFactory;
        String requestUrl = requestUrlFactory.getRequestUrl(this.$operationType, this.$url);
        UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
        RequestPolicy requestPolicy = this.$requestPolicy;
        OperationType operationType = this.$operationType;
        this.label = 1;
        executeWithRetry = commonGatewayClient.executeWithRetry(requestUrl, universalRequest, requestPolicy, operationType, this);
        w11 w11Var = w11.x;
        if (executeWithRetry == w11Var) {
            return w11Var;
        }
        return executeWithRetry;
    }
}
