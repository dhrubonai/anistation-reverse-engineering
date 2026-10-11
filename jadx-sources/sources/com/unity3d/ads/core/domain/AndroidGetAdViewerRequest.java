package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetAdViewerRequest implements GetAdViewerRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;

    public AndroidGetAdViewerRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository) {
        getUniversalRequestForPayLoad.getClass();
        sessionRepository.getClass();
        deviceInfoRepository.getClass();
        campaignRepository.getClass();
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetAdViewerRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.google.protobuf.ByteString r8, com.google.protobuf.ByteString r9, defpackage.vz0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.AndroidGetAdViewerRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.AndroidGetAdViewerRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetAdViewerRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetAdViewerRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetAdViewerRequest$invoke$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L49
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.m37.N(r10)
            return r10
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r4
        L31:
            java.lang.Object r8 = r0.L$4
            gatewayprotocol.v1.AdViewerRequestKt$Dsl r8 = (gatewayprotocol.v1.AdViewerRequestKt.Dsl) r8
            java.lang.Object r9 = r0.L$3
            gatewayprotocol.v1.AdViewerRequestKt$Dsl r9 = (gatewayprotocol.v1.AdViewerRequestKt.Dsl) r9
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.AdViewerRequestKt$Dsl r1 = (gatewayprotocol.v1.AdViewerRequestKt.Dsl) r1
            java.lang.Object r3 = r0.L$1
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            java.lang.Object r6 = r0.L$0
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            defpackage.m37.N(r10)
            goto L7d
        L49:
            defpackage.m37.N(r10)
            gatewayprotocol.v1.AdViewerRequestKt$Dsl$Companion r10 = gatewayprotocol.v1.AdViewerRequestKt.Dsl.Companion
            gatewayprotocol.v1.AdViewerRequestOuterClass$AdViewerRequest$Builder r1 = gatewayprotocol.v1.AdViewerRequestOuterClass.AdViewerRequest.newBuilder()
            r1.getClass()
            gatewayprotocol.v1.AdViewerRequestKt$Dsl r10 = r10._create(r1)
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r7.sessionRepository
            gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters r1 = r1.getSessionCounters()
            r10.setSessionCounters(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r7.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r10
            r0.L$4 = r10
            r0.label = r3
            java.lang.Object r1 = r1.staticDeviceInfo(r0)
            if (r1 != r5) goto L77
            goto Lce
        L77:
            r6 = r8
            r3 = r9
            r8 = r10
            r9 = r8
            r10 = r1
            r1 = r9
        L7d:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r10 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r10
            r8.setStaticDeviceInfo(r10)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r8 = r7.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r8 = r8.getDynamicDeviceInfo()
            r9.setDynamicDeviceInfo(r8)
            r9.setImpressionOpportunityId(r6)
            com.unity3d.ads.core.data.repository.CampaignRepository r8 = r7.campaignRepository
            gatewayprotocol.v1.CampaignStateOuterClass$CampaignState r8 = r8.getCampaignState()
            r9.setCampaignState(r8)
            boolean r8 = r3.isEmpty()
            if (r8 != 0) goto La0
            r9.setPayload(r3)
        La0:
            gatewayprotocol.v1.AdViewerRequestOuterClass$AdViewerRequest r8 = r1._build()
            gatewayprotocol.v1.UniversalRequestKt r9 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r9 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r10 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()
            r10.getClass()
            gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r9 = r9._create(r10)
            r9.setAdViewerRequest(r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r8 = r9._build()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r7 = r7.getUniversalRequestForPayLoad
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.L$3 = r4
            r0.L$4 = r4
            r0.label = r2
            java.lang.Object r7 = r7.invoke(r8, r0)
            if (r7 != r5) goto Lcf
        Lce:
            return r5
        Lcf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetAdViewerRequest.invoke(com.google.protobuf.ByteString, com.google.protobuf.ByteString, vz0):java.lang.Object");
    }
}
