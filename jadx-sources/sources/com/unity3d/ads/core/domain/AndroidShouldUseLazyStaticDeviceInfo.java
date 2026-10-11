package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidShouldUseLazyStaticDeviceInfo implements ShouldUseLazyStaticDeviceInfo {
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;

    public AndroidShouldUseLazyStaticDeviceInfo(MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        mediationTraitsMetadataReader.getClass();
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
    }

    @Override // com.unity3d.ads.core.domain.ShouldUseLazyStaticDeviceInfo
    public boolean invoke() {
        Boolean booleanTrait = this.mediationTraitsMetadataReader.getBooleanTrait(MediationTraitsMetadataReader.LAZY_STATIC_DEVICE_INFO);
        if (booleanTrait != null) {
            return booleanTrait.booleanValue();
        }
        return false;
    }
}
