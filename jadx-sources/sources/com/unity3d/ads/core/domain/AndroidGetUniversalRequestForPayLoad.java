package com.unity3d.ads.core.domain;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {
    private final GetUniversalRequestCommonAttributes getUniversalRequestCommonAttributes;
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetUniversalRequestForPayLoad(GetUniversalRequestSharedData getUniversalRequestSharedData, GetUniversalRequestCommonAttributes getUniversalRequestCommonAttributes) {
        getUniversalRequestSharedData.getClass();
        getUniversalRequestCommonAttributes.getClass();
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
        this.getUniversalRequestCommonAttributes = getUniversalRequestCommonAttributes;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload r5, defpackage.vz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L35
            java.lang.Object r5 = r0.L$3
            gatewayprotocol.v1.UniversalRequestKt$Dsl r5 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r5
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.UniversalRequestKt$Dsl r1 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r1
            java.lang.Object r2 = r0.L$1
            gatewayprotocol.v1.UniversalRequestKt$Dsl r2 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) r2
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r0 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) r0
            defpackage.m37.N(r6)
            goto L66
        L35:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L3c:
            defpackage.m37.N(r6)
            gatewayprotocol.v1.UniversalRequestKt$Dsl$Companion r6 = gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Builder r1 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.newBuilder()
            r1.getClass()
            gatewayprotocol.v1.UniversalRequestKt$Dsl r6 = r6._create(r1)
            com.unity3d.ads.core.domain.GetUniversalRequestSharedData r1 = r4.getUniversalRequestSharedData
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r2
            java.lang.Object r0 = r1.invoke(r0)
            w11 r1 = defpackage.w11.x
            if (r0 != r1) goto L61
            return r1
        L61:
            r1 = r6
            r2 = r1
            r6 = r0
            r0 = r5
            r5 = r2
        L66:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) r6
            r5.setSharedData(r6)
            r1.setPayload(r0)
            boolean r5 = r0.hasDiagnosticEventRequest()
            if (r5 != 0) goto L83
            com.unity3d.ads.core.domain.GetUniversalRequestCommonAttributes r4 = r4.getUniversalRequestCommonAttributes
            boolean r5 = r0.hasInitializationRequest()
            com.google.protobuf.ByteString r4 = r4.invoke(r5)
            if (r4 == 0) goto L83
            r1.setDataLibraryCommonAttributes(r4)
        L83:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r4 = r2._build()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.invoke(gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload, vz0):java.lang.Object");
    }
}
