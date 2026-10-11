package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetUniversalRequestCommonAttributes implements GetUniversalRequestCommonAttributes {
    private final CoherenceLibraryManager coherenceLibraryManager;
    private final SessionRepository sessionRepository;

    public AndroidGetUniversalRequestCommonAttributes(SessionRepository sessionRepository, CoherenceLibraryManager coherenceLibraryManager) {
        sessionRepository.getClass();
        coherenceLibraryManager.getClass();
        this.sessionRepository = sessionRepository;
        this.coherenceLibraryManager = coherenceLibraryManager;
    }

    @Override // com.unity3d.ads.core.domain.GetUniversalRequestCommonAttributes
    public ByteString invoke(boolean z) {
        if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getEnableDataLibraryRequestAttributes()) {
            return null;
        }
        byte[] commonAttributes = this.coherenceLibraryManager.getCommonAttributes(!z ? 1 : 0);
        if (commonAttributes == null) {
            return null;
        }
        return ByteString.copyFrom(commonAttributes);
    }
}
