package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidShouldUseFastInit implements ShouldUseFastInit {
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;

    public AndroidShouldUseFastInit(MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        mediationTraitsMetadataReader.getClass();
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
    }

    @Override // com.unity3d.ads.core.domain.ShouldUseFastInit
    public boolean invoke() {
        Boolean booleanTrait = this.mediationTraitsMetadataReader.getBooleanTrait(MediationTraitsMetadataReader.USE_FAST_INIT);
        if (booleanTrait != null) {
            return booleanTrait.booleanValue();
        }
        return false;
    }
}
