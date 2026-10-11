package com.unity3d.ads.core.domain;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetInitializationData implements GetInitializationData {
    private final GetInitializationRequestPayload getInitializeRequestPayload;
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    public AndroidGetInitializationData(GetInitializationRequestPayload getInitializationRequestPayload, GetUniversalRequestSharedData getUniversalRequestSharedData) {
        getInitializationRequestPayload.getClass();
        getUniversalRequestSharedData.getClass();
        this.getInitializeRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.vz0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            java.lang.Object r8 = r0.L$1
            gatewayprotocol.v1.InitializationDataKt$Dsl r8 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r8
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.InitializationDataKt$Dsl r0 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r0
            defpackage.m37.N(r9)
            goto L87
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r2
        L39:
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.InitializationDataKt$Dsl r1 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r1
            java.lang.Object r4 = r0.L$1
            gatewayprotocol.v1.InitializationDataKt$Dsl r4 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r4
            java.lang.Object r6 = r0.L$0
            gatewayprotocol.v1.InitializationDataKt$Dsl r6 = (gatewayprotocol.v1.InitializationDataKt.Dsl) r6
            defpackage.m37.N(r9)
            r7 = r4
            r4 = r1
            r1 = r7
            goto L6f
        L4c:
            defpackage.m37.N(r9)
            gatewayprotocol.v1.InitializationDataKt$Dsl$Companion r9 = gatewayprotocol.v1.InitializationDataKt.Dsl.Companion
            gatewayprotocol.v1.InitializationDataOuterClass$InitializationData$Builder r1 = gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.newBuilder()
            r1.getClass()
            gatewayprotocol.v1.InitializationDataKt$Dsl r1 = r9._create(r1)
            com.unity3d.ads.core.domain.GetInitializationRequestPayload r9 = r8.getInitializeRequestPayload
            r0.L$0 = r1
            r0.L$1 = r1
            r0.L$2 = r1
            r0.label = r4
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r5) goto L6d
            goto L84
        L6d:
            r4 = r1
            r6 = r4
        L6f:
            gatewayprotocol.v1.InitializationRequestOuterClass$InitializationRequest r9 = (gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) r9
            r4.setInitializationRequest(r9)
            com.unity3d.ads.core.domain.GetUniversalRequestSharedData r8 = r8.getUniversalRequestSharedData
            r0.L$0 = r6
            r0.L$1 = r1
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r9 = r8.invoke(r0)
            if (r9 != r5) goto L85
        L84:
            return r5
        L85:
            r8 = r1
            r0 = r6
        L87:
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r9 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) r9
            r8.setSharedData(r9)
            gatewayprotocol.v1.InitializationDataOuterClass$InitializationData r8 = r0._build()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationData.invoke(vz0):java.lang.Object");
    }
}
