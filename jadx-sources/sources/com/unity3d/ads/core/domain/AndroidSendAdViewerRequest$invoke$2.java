package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import defpackage.ic2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$2", f = "AndroidSendAdViewerRequest.kt", l = {21, 23}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidSendAdViewerRequest$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ ByteString $payload;
    int label;
    final /* synthetic */ AndroidSendAdViewerRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSendAdViewerRequest$invoke$2(AndroidSendAdViewerRequest androidSendAdViewerRequest, ByteString byteString, ByteString byteString2, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidSendAdViewerRequest;
        this.$opportunityId = byteString;
        this.$payload = byteString2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidSendAdViewerRequest$invoke$2(this.this$0, this.$opportunityId, this.$payload, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidSendAdViewerRequest$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r13 == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r13 == r3) goto L15;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 2
            r2 = 1
            w11 r3 = defpackage.w11.x
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.m37.N(r13)
            goto L53
        L10:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r12)
            r12 = 0
            return r12
        L17:
            defpackage.m37.N(r13)
            goto L31
        L1b:
            defpackage.m37.N(r13)
            com.unity3d.ads.core.domain.AndroidSendAdViewerRequest r13 = r12.this$0
            com.unity3d.ads.core.domain.GetAdViewerRequest r13 = com.unity3d.ads.core.domain.AndroidSendAdViewerRequest.access$getGetAdViewerRequest$p(r13)
            com.google.protobuf.ByteString r0 = r12.$opportunityId
            com.google.protobuf.ByteString r4 = r12.$payload
            r12.label = r2
            java.lang.Object r13 = r13.invoke(r0, r4, r12)
            if (r13 != r3) goto L31
            goto L52
        L31:
            r6 = r13
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
            com.unity3d.ads.core.domain.AndroidSendAdViewerRequest r13 = r12.this$0
            com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidSendAdViewerRequest.access$getGetRequestPolicy$p(r13)
            com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
            com.unity3d.ads.core.domain.AndroidSendAdViewerRequest r13 = r12.this$0
            com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidSendAdViewerRequest.access$getGatewayClient$p(r13)
            com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.AD_VIEWER_REQUEST
            r12.label = r1
            r5 = 0
            r10 = 1
            r11 = 0
            r9 = r12
            java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r3) goto L53
        L52:
            return r3
        L53:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload r12 = r13.getPayload()
            gatewayprotocol.v1.AdViewerResponseOuterClass$AdViewerResponse r12 = r12.getAdViewerResponse()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
