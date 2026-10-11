package com.unity3d.ads.core.domain;

import defpackage.b06;
import gatewayprotocol.v1.ClientInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class CommonMediationProviderParser implements MediationProviderParser {
    @Override // com.unity3d.ads.core.domain.MediationProviderParser
    public ClientInfoOuterClass.MediationProvider invoke(String str) {
        ClientInfoOuterClass.MediationProvider mediationProvider;
        if (str != null) {
            if (b06.I(str, "AppLovinSdk_", true)) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else if (str.equalsIgnoreCase("AdMob")) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
            } else if (str.equalsIgnoreCase("MAX")) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else if (str.equalsIgnoreCase("ironSource")) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY;
            } else {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            }
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
