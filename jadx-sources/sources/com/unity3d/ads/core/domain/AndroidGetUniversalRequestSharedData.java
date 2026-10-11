package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    public AndroidGetUniversalRequestSharedData(GetSharedDataTimestamps getSharedDataTimestamps, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, GetLimitedSessionToken getLimitedSessionToken, DeveloperConsentRepository developerConsentRepository) {
        getSharedDataTimestamps.getClass();
        sessionRepository.getClass();
        deviceInfoRepository.getClass();
        getLimitedSessionToken.getClass();
        developerConsentRepository.getClass();
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r1 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r1
            java.lang.Object r2 = r0.L$1
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r2 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r2
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r0 = (gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl) r0
            defpackage.m37.N(r5)
            goto L70
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L38:
            defpackage.m37.N(r5)
            gatewayprotocol.v1.UniversalRequestKt r5 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl$Companion r5 = gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl.Companion
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData$Builder r1 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder()
            r1.getClass()
            gatewayprotocol.v1.UniversalRequestKt$SharedDataKt$Dsl r1 = r5._create(r1)
            com.unity3d.ads.core.data.repository.SessionRepository r5 = r4.sessionRepository
            com.google.protobuf.ByteString r5 = r5.getSessionToken()
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L5b
            r1.setSessionToken(r5)
            r0 = r1
            goto L76
        L5b:
            com.unity3d.ads.core.domain.GetLimitedSessionToken r5 = r4.getLimitedSessionToken
            r0.L$0 = r1
            r0.L$1 = r1
            r0.L$2 = r1
            r0.label = r2
            java.lang.Object r5 = r5.invoke(r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L6e
            return r0
        L6e:
            r0 = r1
            r2 = r0
        L70:
            gatewayprotocol.v1.UniversalRequestOuterClass$LimitedSessionToken r5 = (gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken) r5
            r1.setLimitedSessionToken(r5)
            r1 = r2
        L76:
            com.unity3d.ads.core.domain.GetSharedDataTimestamps r5 = r4.getSharedDataTimestamps
            gatewayprotocol.v1.TimestampsOuterClass$Timestamps r5 = r5.invoke()
            r1.setTimestamps(r5)
            long r2 = com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()
            com.google.protobuf.Timestamp r5 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r2)
            r1.setSdkStartTime(r5)
            long r2 = com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()
            com.google.protobuf.Timestamp r5 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r2)
            r1.setAppStartTime(r5)
            com.unity3d.ads.core.data.repository.DeveloperConsentRepository r5 = r4.developerConsentRepository
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsent r5 = r5.getDeveloperConsent()
            r1.setDeveloperConsent(r5)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r4 = r4.deviceInfoRepository
            gatewayprotocol.v1.PiiOuterClass$Pii r4 = r4.getPiiData()
            r1.setPii(r4)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$SharedData r4 = r0._build()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke(vz0):java.lang.Object");
    }
}
