package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import defpackage.pn6;
import defpackage.tl7;
import defpackage.uz5;
import defpackage.v11;
import defpackage.vz0;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final AdRevenueObserver adRevenueObserver;
    private final CoherenceLibraryManager coherenceLibraryManager;
    private final v11 coherenceScope;
    private final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;
    private final DeliverModuleConfigs deliverModuleConfigs;
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;
    private final HandleDebugSettings handleDebugSettings;
    private final InitializeAdQuality initializeAdQuality;
    private final LifecycleEventObserver lifecycleEventObserver;
    private final MaxAdRevenueObserver maxAdRevenueObserver;
    private final v11 sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, AdRevenueObserver adRevenueObserver, MaxAdRevenueObserver maxAdRevenueObserver, LifecycleEventObserver lifecycleEventObserver, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, v11 v11Var, HandleDebugSettings handleDebugSettings, GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, InitializeAdQuality initializeAdQuality, DeliverModuleConfigs deliverModuleConfigs, CoherenceLibraryManager coherenceLibraryManager, v11 v11Var2) {
        transactionEventManager.getClass();
        adRevenueObserver.getClass();
        maxAdRevenueObserver.getClass();
        lifecycleEventObserver.getClass();
        triggerInitializationCompletedRequest.getClass();
        sessionRepository.getClass();
        v11Var.getClass();
        handleDebugSettings.getClass();
        getSafeguardedInitializationPolicy.getClass();
        nativeConfiguration.getClass();
        initializeAdQuality.getClass();
        deliverModuleConfigs.getClass();
        coherenceLibraryManager.getClass();
        v11Var2.getClass();
        this.transactionEventManager = transactionEventManager;
        this.adRevenueObserver = adRevenueObserver;
        this.maxAdRevenueObserver = maxAdRevenueObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = v11Var;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
        this.defaultNativeConfiguration = nativeConfiguration;
        this.initializeAdQuality = initializeAdQuality;
        this.deliverModuleConfigs = deliverModuleConfigs;
        this.coherenceLibraryManager = coherenceLibraryManager;
        this.coherenceScope = v11Var2;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, vz0 vz0Var) {
        int maxExtrasSizeKb;
        String universalRequestUrl;
        if (universalResponse.hasPayload() && universalResponse.getPayload().hasInitializationResponse() && universalResponse.getPayload().getInitializationResponse().hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getPayload().getInitializationResponse().getError().getErrorCode();
            errorCode.getClass();
            String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
            if (initErrorMsg == null) {
                initErrorMsg = universalResponse.getPayload().getInitializationResponse().getError().getErrorText();
            }
            String str = initErrorMsg;
            str.getClass();
            IllegalStateException illegalStateException = new IllegalStateException(universalResponse.getPayload().getInitializationResponse().getError().getErrorText());
            String errorText = universalResponse.getPayload().getInitializationResponse().getError().getErrorText();
            ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getPayload().getInitializationResponse().getError().getErrorCode();
            ErrorOuterClass.Error error = universalResponse.getPayload().getInitializationResponse().getError();
            error.getClass();
            throw new GatewayException(str, illegalStateException, "gateway_initialization", errorText, errorCode2, ErrorExtensionsKt.getErrorTokenOrNull(error));
        }
        if (universalResponse.hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode3 = universalResponse.getError().getErrorCode();
            errorCode3.getClass();
            String initErrorMsg2 = UnityAdsErrorKt.getInitErrorMsg(errorCode3, this.sessionRepository.getGameId());
            if (initErrorMsg2 == null) {
                initErrorMsg2 = universalResponse.getError().getErrorText();
            }
            String str2 = initErrorMsg2;
            str2.getClass();
            IllegalStateException illegalStateException2 = new IllegalStateException(universalResponse.getError().getErrorText());
            String errorText2 = universalResponse.getError().getErrorText();
            ErrorOuterClass.PublicErrorCode errorCode4 = universalResponse.getError().getErrorCode();
            ErrorOuterClass.Error error2 = universalResponse.getError();
            error2.getClass();
            throw new InitializationException(str2, illegalStateException2, "gateway_initialization", errorText2, errorCode4, ErrorExtensionsKt.getErrorTokenOrNull(error2));
        }
        if (universalResponse.hasPayload() && universalResponse.getPayload().hasInitializationResponse()) {
            InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
            SessionRepository sessionRepository = this.sessionRepository;
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
            nativeConfiguration.getClass();
            NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
            NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
            builder.getClass();
            NativeConfigurationKt.Dsl _create = companion._create(builder);
            _create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(_create.getInitPolicy()));
            if (_create.getMaxExtrasSizeKb() == 0) {
                maxExtrasSizeKb = this.defaultNativeConfiguration.getMaxExtrasSizeKb();
            } else {
                maxExtrasSizeKb = _create.getMaxExtrasSizeKb();
            }
            _create.setMaxExtrasSizeKb(maxExtrasSizeKb);
            sessionRepository.setNativeConfiguration(_create._build());
            if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
                SessionRepository sessionRepository2 = this.sessionRepository;
                String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
                universalRequestUrl2.getClass();
                sessionRepository2.setGatewayUrl(universalRequestUrl2);
            }
            List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = initializationResponse.getRequestUrlOverridesList();
            if (requestUrlOverridesList != null) {
                this.sessionRepository.setRequestUrlOverrides(requestUrlOverridesList);
            }
            if (initializationResponse.getTriggerInitializationCompletedRequest()) {
                tl7.z(this.sdkScope, null, null, new AndroidHandleGatewayInitializationResponse$invoke$4(this, null), 3);
            }
            if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
                this.transactionEventManager.invoke();
            }
            if (initializationResponse.getNativeConfiguration().getFeatureFlags().getCollectIlrData()) {
                this.adRevenueObserver.invoke();
            }
            this.maxAdRevenueObserver.invoke();
            if (initializationResponse.getNativeConfiguration().getFeatureFlags().getCollectLifecycleEvents()) {
                this.lifecycleEventObserver.invoke();
            }
            if (initializationResponse.getNativeConfiguration().getFeatureFlags().getEnableCoherenceLibrary()) {
                tl7.z(this.coherenceScope, null, null, new AndroidHandleGatewayInitializationResponse$invoke$5(this, initializationResponse, null), 3);
            }
            if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
                HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
                NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
                debugSettings.getClass();
                handleDebugSettings.invoke(debugSettings);
            }
            String levelPlayAppKey = initializationResponse.getNativeConfiguration().getLevelPlayAppKey();
            if (initializationResponse.getNativeConfiguration().hasLevelPlayAppKey()) {
                levelPlayAppKey.getClass();
                if (!uz5.V(levelPlayAppKey)) {
                    this.initializeAdQuality.invoke(levelPlayAppKey, this.sessionRepository.getSessionToken());
                    this.deliverModuleConfigs.invoke(initializationResponse);
                    return pn6.a;
                }
            }
            if (initializationResponse.getNativeConfiguration().getFeatureFlags().getShouldInitAdqWithGameId()) {
                this.initializeAdQuality.invokeWithGameId(this.sessionRepository.getSessionToken());
            }
            this.deliverModuleConfigs.invoke(initializationResponse);
            return pn6.a;
        }
        throw new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_PARSING_ERROR, null, "gateway", "No payload", ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_PROTO, null, 34, null);
    }
}
