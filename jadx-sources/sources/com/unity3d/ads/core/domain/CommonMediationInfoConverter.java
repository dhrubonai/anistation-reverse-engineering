package com.unity3d.ads.core.domain;

import com.unity3d.ads.MediationInfo;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class CommonMediationInfoConverter implements MediationInfoConverter {
    private final MediationProviderParser mediationProviderParser;

    public CommonMediationInfoConverter(MediationProviderParser mediationProviderParser) {
        mediationProviderParser.getClass();
        this.mediationProviderParser = mediationProviderParser;
    }

    @Override // com.unity3d.ads.core.domain.MediationInfoConverter
    public MediationInfoOuterClass.MediationInfo invoke(MediationInfo mediationInfo) {
        mediationInfo.getClass();
        ClientInfoOuterClass.MediationProvider invoke = this.mediationProviderParser.invoke(mediationInfo.getName());
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        MediationInfoOuterClass.MediationInfo.Builder newBuilder = MediationInfoOuterClass.MediationInfo.newBuilder();
        newBuilder.getClass();
        MediationInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setProvider(invoke);
        if (invoke == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
            _create.setCustomName(mediationInfo.getName());
        }
        _create.setVersion(mediationInfo.getVersion());
        _create.setAdapterVersion(mediationInfo.getAdapterVersion());
        return _create._build();
    }
}
