package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationCompletedRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, DeviceInfoRepository deviceInfoRepository) {
        getUniversalRequestForPayLoad.getClass();
        deviceInfoRepository.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.vz0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L41
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.m37.N(r8)
            return r8
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r4
        L31:
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r1 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r1
            java.lang.Object r3 = r0.L$1
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r3 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r3
            java.lang.Object r6 = r0.L$0
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r6 = (gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl) r6
            defpackage.m37.N(r8)
            goto L64
        L41:
            defpackage.m37.N(r8)
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl$Companion r8 = gatewayprotocol.v1.InitializationCompletedEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest$Builder r1 = gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder()
            r1.getClass()
            gatewayprotocol.v1.InitializationCompletedEventRequestKt$Dsl r1 = r8._create(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r8 = r7.deviceInfoRepository
            r0.L$0 = r1
            r0.L$1 = r1
            r0.L$2 = r1
            r0.label = r3
            java.lang.Object r8 = r8.staticDeviceInfo(r0)
            if (r8 != r5) goto L62
            goto L9c
        L62:
            r3 = r1
            r6 = r3
        L64:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r8 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r8
            r1.setStaticDeviceInfo(r8)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r8 = r7.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r8 = r8.getDynamicDeviceInfo()
            r3.setDynamicDeviceInfo(r8)
            gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest r8 = r6._build()
            gatewayprotocol.v1.UniversalRequestKt r1 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r1 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r3 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            r3.getClass()
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r1 = r1._create(r3)
            r1.setInitializationCompletedEventRequest(r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r8 = r1._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r7 = r7.getUniversalRequestForPayLoad
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r2
            java.lang.Object r7 = r7.invoke(r8, r0)
            if (r7 != r5) goto L9d
        L9c:
            return r5
        L9d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest.invoke(vz0):java.lang.Object");
    }
}
