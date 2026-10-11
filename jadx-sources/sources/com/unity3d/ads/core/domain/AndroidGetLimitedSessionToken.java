package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    public AndroidGetLimitedSessionToken(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, MediationRepository mediationRepository) {
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        mediationRepository.getClass();
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.LimitedSessionTokenKt$Dsl r1 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) r1
            java.lang.Object r2 = r0.L$1
            gatewayprotocol.v1.LimitedSessionTokenKt$Dsl r2 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) r2
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.LimitedSessionTokenKt$Dsl r0 = (gatewayprotocol.v1.LimitedSessionTokenKt.Dsl) r0
            defpackage.m37.N(r5)
            goto L81
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L38:
            defpackage.m37.N(r5)
            gatewayprotocol.v1.LimitedSessionTokenKt$Dsl$Companion r5 = gatewayprotocol.v1.LimitedSessionTokenKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken$Builder r1 = gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.newBuilder()
            r1.getClass()
            gatewayprotocol.v1.LimitedSessionTokenKt$Dsl r1 = r5._create(r1)
            com.unity3d.ads.core.data.repository.SessionRepository r5 = r4.sessionRepository
            com.google.protobuf.ByteString r5 = r5.getSessionId()
            r1.setSessionId(r5)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r5 = r4.deviceInfoRepository
            java.lang.String r5 = r5.getManufacturer()
            r1.setDeviceMake(r5)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r5 = r4.deviceInfoRepository
            java.lang.String r5 = r5.getModel()
            r1.setDeviceModel(r5)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r5 = r4.deviceInfoRepository
            java.lang.String r5 = r5.getOsVersion()
            r1.setOsVersion(r5)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r5 = r4.deviceInfoRepository
            r0.L$0 = r1
            r0.L$1 = r1
            r0.L$2 = r1
            r0.label = r2
            java.lang.Object r5 = r5.getIdfi(r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L7f
            return r0
        L7f:
            r0 = r1
            r2 = r0
        L81:
            java.lang.String r5 = (java.lang.String) r5
            r1.setIdfi(r5)
            r5 = 42100(0xa474, float:5.8995E-41)
            r2.setSdkVersion(r5)
            java.lang.String r5 = "4.21.0"
            r2.setSdkVersionName(r5)
            com.unity3d.ads.core.data.repository.SessionRepository r5 = r4.sessionRepository
            java.lang.String r5 = r5.getGameId()
            if (r5 == 0) goto L9c
            r2.setGameId(r5)
        L9c:
            gatewayprotocol.v1.ClientInfoOuterClass$Platform r5 = gatewayprotocol.v1.ClientInfoOuterClass.Platform.PLATFORM_ANDROID
            r2.setPlatform(r5)
            com.unity3d.ads.core.data.repository.MediationRepository r5 = r4.mediationRepository
            sb2 r5 = r5.getMediationProvider()
            java.lang.Object r5 = r5.invoke()
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r5 = (gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider) r5
            r2.setMediationProvider(r5)
            com.unity3d.ads.core.data.repository.MediationRepository r5 = r4.mediationRepository
            java.lang.String r5 = r5.getName()
            if (r5 == 0) goto Lc3
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r1 = r2.getMediationProvider()
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r3 = gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM
            if (r1 != r3) goto Lc3
            r2.setCustomMediationName(r5)
        Lc3:
            com.unity3d.ads.core.data.repository.MediationRepository r4 = r4.mediationRepository
            java.lang.String r4 = r4.getVersion()
            if (r4 == 0) goto Lce
            r2.setMediationVersion(r4)
        Lce:
            gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken r4 = r0._build()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.invoke(vz0):java.lang.Object");
    }
}
