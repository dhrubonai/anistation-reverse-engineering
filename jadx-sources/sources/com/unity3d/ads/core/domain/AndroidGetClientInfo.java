package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import defpackage.d46;
import defpackage.rb3;
import defpackage.y7;
import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetClientInfo implements GetClientInfo {
    private final AdQualityVersionDataSource adQualityVersionDataSource;
    private final rb3 baseClientInfo$delegate;
    private final FIdExistenceDataSource fIdExistenceDataSource;
    private final MediationRepository mediationRepository;
    private final OfferwallManager offerwallManager;
    private final OmidManager omidManager;
    private final SessionRepository sessionRepository;

    public AndroidGetClientInfo(SessionRepository sessionRepository, MediationRepository mediationRepository, OmidManager omidManager, OfferwallManager offerwallManager, FIdExistenceDataSource fIdExistenceDataSource, AdQualityVersionDataSource adQualityVersionDataSource) {
        sessionRepository.getClass();
        mediationRepository.getClass();
        omidManager.getClass();
        offerwallManager.getClass();
        fIdExistenceDataSource.getClass();
        adQualityVersionDataSource.getClass();
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
        this.baseClientInfo$delegate = new d46(new y7(this, (byte) 8));
    }

    public static /* synthetic */ ClientInfoOuterClass.ClientInfo a(AndroidGetClientInfo androidGetClientInfo) {
        return baseClientInfo_delegate$lambda$2(androidGetClientInfo);
    }

    public static final ClientInfoOuterClass.ClientInfo baseClientInfo_delegate$lambda$2(AndroidGetClientInfo androidGetClientInfo) {
        String str;
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder newBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        newBuilder.getClass();
        ClientInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setSdkVersion(42100);
        _create.setSdkVersionName("4.21.0");
        _create.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        _create.setOmidVersion(androidGetClientInfo.omidManager.getVersion());
        _create.setOmidPartnerVersion(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        if (MadeWithUnityDetector.isMadeWithUnity()) {
            str = "Unity";
        } else {
            str = "";
        }
        _create.setSdkDevelopmentPlatform(str);
        _create.setIsFidAvailable(androidGetClientInfo.fIdExistenceDataSource.invoke());
        String invoke = androidGetClientInfo.adQualityVersionDataSource.invoke();
        if (invoke != null) {
            _create.setAdQualitySdkVersion(invoke);
        }
        return _create._build();
    }

    private final ClientInfoOuterClass.ClientInfo getBaseClientInfo() {
        return (ClientInfoOuterClass.ClientInfo) this.baseClientInfo$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(defpackage.vz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.L$1
            gatewayprotocol.v1.ClientInfoKt$Dsl r5 = (gatewayprotocol.v1.ClientInfoKt.Dsl) r5
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.ClientInfoKt$Dsl r0 = (gatewayprotocol.v1.ClientInfoKt.Dsl) r0
            defpackage.m37.N(r6)
            goto Lb1
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L35:
            defpackage.m37.N(r6)
            gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo r6 = r5.getBaseClientInfo()
            gatewayprotocol.v1.ClientInfoKt$Dsl$Companion r1 = gatewayprotocol.v1.ClientInfoKt.Dsl.Companion
            com.google.protobuf.GeneratedMessageLite$Builder r6 = r6.toBuilder()
            r6.getClass()
            gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo$Builder r6 = (gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder) r6
            gatewayprotocol.v1.ClientInfoKt$Dsl r6 = r1._create(r6)
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r5.sessionRepository
            java.lang.String r1 = r1.getGameId()
            if (r1 == 0) goto L56
            r6.setGameId(r1)
        L56:
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r5.sessionRepository
            boolean r1 = r1.isTestModeEnabled()
            r6.setTest(r1)
            com.unity3d.ads.core.data.repository.MediationRepository r1 = r5.mediationRepository
            sb2 r1 = r1.getMediationProvider()
            java.lang.Object r1 = r1.invoke()
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r1 = (gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider) r1
            r6.setMediationProvider(r1)
            com.unity3d.ads.core.data.repository.MediationRepository r1 = r5.mediationRepository
            java.lang.String r1 = r1.getName()
            if (r1 == 0) goto L87
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r3 = r6.getMediationProvider()
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r4 = gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM
            if (r3 != r4) goto L87
            boolean r3 = defpackage.uz5.V(r1)
            if (r3 != 0) goto L87
            r6.setCustomMediationName(r1)
        L87:
            com.unity3d.ads.core.data.repository.MediationRepository r1 = r5.mediationRepository
            java.lang.String r1 = r1.getVersion()
            if (r1 == 0) goto L92
            r6.setMediationVersion(r1)
        L92:
            com.unity3d.ads.core.data.repository.MediationRepository r1 = r5.mediationRepository
            java.lang.String r1 = r1.getAdapterVersion()
            if (r1 == 0) goto L9d
            r6.setMediationAdapterVersion(r1)
        L9d:
            com.unity3d.ads.core.data.manager.OfferwallManager r5 = r5.offerwallManager
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r2
            java.lang.Object r5 = r5.getVersion(r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto Lae
            return r0
        Lae:
            r0 = r6
            r6 = r5
            r5 = r0
        Lb1:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Lb8
            r5.setOfferwallVersion(r6)
        Lb8:
            gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo r5 = r0._build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke(vz0):java.lang.Object");
    }
}
