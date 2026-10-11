package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HandleAdRevenueEvent {
    private final AdRevenueRepository adRevenueRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdRevenueEventData getAdRevenueEventData;

    public HandleAdRevenueEvent(AdRevenueRepository adRevenueRepository, DeviceInfoRepository deviceInfoRepository, GetAdRevenueEventData getAdRevenueEventData) {
        adRevenueRepository.getClass();
        deviceInfoRepository.getClass();
        getAdRevenueEventData.getClass();
        this.adRevenueRepository = adRevenueRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getAdRevenueEventData = getAdRevenueEventData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        if (r8.emit(r9, r0) != r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(com.unity3d.ads.core.data.model.AdRevenueData r9, gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider r10, com.unity3d.ads.core.data.model.AdRevenueOrigin r11, defpackage.vz0 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1 r0 = (com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1 r0 = new com.unity3d.ads.core.domain.events.HandleAdRevenueEvent$invoke$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L52
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.m37.N(r12)
            goto Lbd
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            return r4
        L32:
            java.lang.Object r9 = r0.L$5
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl r9 = (gatewayprotocol.v1.AdRevenueEventRequestKt.Dsl) r9
            java.lang.Object r10 = r0.L$4
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl r10 = (gatewayprotocol.v1.AdRevenueEventRequestKt.Dsl) r10
            java.lang.Object r11 = r0.L$3
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl r11 = (gatewayprotocol.v1.AdRevenueEventRequestKt.Dsl) r11
            java.lang.Object r1 = r0.L$2
            com.unity3d.ads.core.data.model.AdRevenueOrigin r1 = (com.unity3d.ads.core.data.model.AdRevenueOrigin) r1
            java.lang.Object r3 = r0.L$1
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r3 = (gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider) r3
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.data.model.AdRevenueData r6 = (com.unity3d.ads.core.data.model.AdRevenueData) r6
            defpackage.m37.N(r12)
            r7 = r12
            r12 = r11
            r11 = r1
            r1 = r7
            goto L7d
        L52:
            defpackage.m37.N(r12)
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl$Companion r12 = gatewayprotocol.v1.AdRevenueEventRequestKt.Dsl.Companion
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder r1 = gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequest.newBuilder()
            r1.getClass()
            gatewayprotocol.v1.AdRevenueEventRequestKt$Dsl r12 = r12._create(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r8.deviceInfoRepository
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            r0.L$4 = r12
            r0.L$5 = r12
            r0.label = r3
            java.lang.Object r1 = r1.staticDeviceInfo(r0)
            if (r1 != r5) goto L79
            goto Lbc
        L79:
            r6 = r9
            r3 = r10
            r9 = r12
            r10 = r9
        L7d:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r1 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo) r1
            r9.setStaticDeviceInfo(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r8.deviceInfoRepository
            gatewayprotocol.v1.DynamicDeviceInfoOuterClass$DynamicDeviceInfo r9 = r9.getDynamicDeviceInfo()
            r10.setDynamicDeviceInfo(r9)
            r10.setMediationProvider(r3)
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueOrigin r9 = com.unity3d.ads.core.domain.events.HandleAdRevenueEventKt.access$toProto(r11)
            r10.setAdRevenueOrigin(r9)
            com.unity3d.ads.core.domain.events.GetAdRevenueEventData r9 = r8.getAdRevenueEventData
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueData r9 = r9.invoke(r6)
            r10.setAdRevenueData(r9)
            gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueEventRequest r9 = r12._build()
            com.unity3d.ads.core.data.repository.AdRevenueRepository r8 = r8.adRevenueRepository
            t44 r8 = r8.getAdRevenueEvents()
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.L$3 = r4
            r0.L$4 = r4
            r0.L$5 = r4
            r0.label = r2
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r5) goto Lbd
        Lbc:
            return r5
        Lbd:
            pn6 r8 = defpackage.pn6.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.HandleAdRevenueEvent.invoke(com.unity3d.ads.core.data.model.AdRevenueData, gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider, com.unity3d.ads.core.data.model.AdRevenueOrigin, vz0):java.lang.Object");
    }
}
