package com.unity3d.ads.adplayer;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.ai4;
import defpackage.jc2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w51;
import defpackage.x42;
import defpackage.ze0;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$3", f = "CommonWebViewBridge.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonWebViewBridge$handleInvocationResult$3 extends t36 implements jc2 {
    final /* synthetic */ Invocation $invocation;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocationResult$3(CommonWebViewBridge commonWebViewBridge, Invocation invocation, vz0 vz0Var) {
        super(3, vz0Var);
        this.this$0 = commonWebViewBridge;
        this.$invocation = invocation;
    }

    @Override // defpackage.jc2
    public final Object invoke(x42 x42Var, Throwable th, vz0 vz0Var) {
        CommonWebViewBridge$handleInvocationResult$3 commonWebViewBridge$handleInvocationResult$3 = new CommonWebViewBridge$handleInvocationResult$3(this.this$0, this.$invocation, vz0Var);
        commonWebViewBridge$handleInvocationResult$3.L$0 = th;
        return commonWebViewBridge$handleInvocationResult$3.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        SendDiagnosticEvent sendDiagnosticEvent;
        if (this.label == 0) {
            m37.N(obj);
            Throwable th = (Throwable) this.L$0;
            logger = this.this$0.logger;
            logger.error("Error delivering flow event", th);
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, vn3.T(new ai4("reason_debug", message), new ai4("webview_invocation", this.$invocation.getLocation())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
