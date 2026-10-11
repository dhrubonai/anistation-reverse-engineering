package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class GetOperativeEventRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateByteStringId;
    private final SessionRepository sessionRepository;

    public GetOperativeEventRequest(GetByteStringId getByteStringId, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository) {
        getByteStringId.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        campaignRepository.getClass();
        this.generateByteStringId = getByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType r5, com.google.protobuf.ByteString r6, com.google.protobuf.ByteString r7, com.google.protobuf.ByteString r8, java.lang.String r9, gatewayprotocol.v1.AdFormatOuterClass.AdFormat r10, defpackage.vz0 r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1
            r0.<init>(r4, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L36
            java.lang.Object r5 = r0.L$3
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r5 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r5
            java.lang.Object r6 = r0.L$2
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r6 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r6
            java.lang.Object r7 = r0.L$1
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r7 = (gatewayprotocol.v1.OperativeEventRequestKt.Dsl) r7
            java.lang.Object r8 = r0.L$0
            r10 = r8
            gatewayprotocol.v1.AdFormatOuterClass$AdFormat r10 = (gatewayprotocol.v1.AdFormatOuterClass.AdFormat) r10
            defpackage.m37.N(r11)
            goto L89
        L36:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L3d:
            defpackage.m37.N(r11)
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl$Companion r11 = gatewayprotocol.v1.OperativeEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest$Builder r1 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder()
            r1.getClass()
            gatewayprotocol.v1.OperativeEventRequestKt$Dsl r11 = r11._create(r1)
            com.unity3d.ads.core.domain.GetByteStringId r1 = r4.generateByteStringId
            com.google.protobuf.ByteString r1 = r1.invoke()
            r11.setEventId(r1)
            r11.setEventType(r5)
            r11.setImpressionOpportunityId(r7)
            r11.setTrackingToken(r6)
            r11.setAdditionalData(r8)
            if (r9 == 0) goto L67
            r11.setSid(r9)
        L67:
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r5 = r4.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r5 = r5.dynamicDeviceInfoWithAccelerometer()
            r11.setDynamicDeviceInfo(r5)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r5 = r4.deviceInfoRepository
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r11
            r0.L$3 = r11
            r0.label = r2
            java.lang.Object r5 = r5.staticDeviceInfo(r0)
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L85
            return r6
        L85:
            r6 = r11
            r7 = r6
            r11 = r5
            r5 = r7
        L89:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r11 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r11
            r5.setStaticDeviceInfo(r11)
            com.unity3d.ads.core.data.repository.SessionRepository r5 = r4.sessionRepository
            gatewayprotocol.v1.SessionCountersOuterClass$SessionCounters r5 = r5.getSessionCounters()
            r6.setSessionCounters(r5)
            com.unity3d.ads.core.data.repository.CampaignRepository r4 = r4.campaignRepository
            gatewayprotocol.v1.CampaignStateOuterClass$CampaignState r4 = r4.getCampaignState()
            r6.setCampaignState(r4)
            if (r10 == 0) goto La5
            r6.setAdFormat(r10)
        La5:
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventRequest r4 = r7._build()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType, com.google.protobuf.ByteString, com.google.protobuf.ByteString, com.google.protobuf.ByteString, java.lang.String, gatewayprotocol.v1.AdFormatOuterClass$AdFormat, vz0):java.lang.Object");
    }
}
