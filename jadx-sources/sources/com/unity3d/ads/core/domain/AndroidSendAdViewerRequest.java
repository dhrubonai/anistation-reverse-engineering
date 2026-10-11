package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import defpackage.n11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidSendAdViewerRequest implements SendAdViewerRequest {
    private final n11 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdViewerRequest getAdViewerRequest;
    private final GetRequestPolicy getRequestPolicy;

    public AndroidSendAdViewerRequest(n11 n11Var, GetAdViewerRequest getAdViewerRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        n11Var.getClass();
        getAdViewerRequest.getClass();
        getRequestPolicy.getClass();
        gatewayClient.getClass();
        this.defaultDispatcher = n11Var;
        this.getAdViewerRequest = getAdViewerRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // com.unity3d.ads.core.domain.SendAdViewerRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString r5, com.google.protobuf.ByteString r6, defpackage.vz0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r7)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r7)
            n11 r7 = r4.defaultDispatcher
            com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$2 r1 = new com.unity3d.ads.core.domain.AndroidSendAdViewerRequest$invoke$2
            r1.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r7 = defpackage.tl7.V(r7, r1, r0)
            w11 r4 = defpackage.w11.x
            if (r7 != r4) goto L41
            return r4
        L41:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidSendAdViewerRequest.invoke(com.google.protobuf.ByteString, com.google.protobuf.ByteString, vz0):java.lang.Object");
    }
}
