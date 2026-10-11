package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.domain.MediationProviderParser;
import defpackage.sb2;
import defpackage.y7;
import gatewayprotocol.v1.ClientInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;
    private final MediationProviderParser mediationProviderParser;

    public AndroidMediationRepository(MediationDataSource mediationDataSource, MediationProviderParser mediationProviderParser) {
        mediationDataSource.getClass();
        mediationProviderParser.getClass();
        this.mediationDataSource = mediationDataSource;
        this.mediationProviderParser = mediationProviderParser;
    }

    public static final ClientInfoOuterClass.MediationProvider _get_mediationProvider_$lambda$0(AndroidMediationRepository androidMediationRepository) {
        return androidMediationRepository.mediationProviderParser.invoke(androidMediationRepository.getName());
    }

    public static /* synthetic */ ClientInfoOuterClass.MediationProvider a(AndroidMediationRepository androidMediationRepository) {
        return _get_mediationProvider_$lambda$0(androidMediationRepository);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getAdapterVersion() {
        return this.mediationDataSource.getAdapterVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public sb2 getMediationProvider() {
        return new y7(this, (byte) 13);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
