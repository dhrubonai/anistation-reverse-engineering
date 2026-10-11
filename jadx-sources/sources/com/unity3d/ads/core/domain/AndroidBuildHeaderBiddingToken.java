package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;
import defpackage.db;
import defpackage.v11;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private final CampaignRepository campaignRepository;
    private final CoherenceLibraryManager coherenceLibraryManager;
    private final DeviceInfoRepository deviceInfoRepository;
    private final v11 deviceInfoScope;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetInitializationState getInitializationState;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final MediationInfoConverter mediationInfoConverter;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final ShouldUseFastInit shouldUseFastInit;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;
    private final WarmNonInitSignals warmNonInitSignals;

    public AndroidBuildHeaderBiddingToken(GetByteStringId getByteStringId, GetClientInfo getClientInfo, GetSharedDataTimestamps getSharedDataTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo androidTestDataInfo, OfferwallManager offerwallManager, MediationInfoConverter mediationInfoConverter, MediationTraitsMetadataReader mediationTraitsMetadataReader, WarmNonInitSignals warmNonInitSignals, ShouldUseFastInit shouldUseFastInit, v11 v11Var, CoherenceLibraryManager coherenceLibraryManager) {
        getByteStringId.getClass();
        getClientInfo.getClass();
        getSharedDataTimestamps.getClass();
        getLimitedSessionToken.getClass();
        getInitializationData.getClass();
        getInitializationState.getClass();
        awaitInitialization.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        campaignRepository.getClass();
        tcfRepository.getClass();
        androidTestDataInfo.getClass();
        offerwallManager.getClass();
        mediationInfoConverter.getClass();
        mediationTraitsMetadataReader.getClass();
        warmNonInitSignals.getClass();
        shouldUseFastInit.getClass();
        v11Var.getClass();
        coherenceLibraryManager.getClass();
        this.generateId = getByteStringId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getSharedDataTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = androidTestDataInfo;
        this.offerwallManager = offerwallManager;
        this.mediationInfoConverter = mediationInfoConverter;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.warmNonInitSignals = warmNonInitSignals;
        this.shouldUseFastInit = shouldUseFastInit;
        this.deviceInfoScope = v11Var;
        this.coherenceLibraryManager = coherenceLibraryManager;
    }

    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    public Object invoke(int i, TokenConfiguration tokenConfiguration, vz0 vz0Var) {
        return db.K(new AndroidBuildHeaderBiddingToken$invoke$2(this, i, tokenConfiguration, null), vz0Var);
    }
}
