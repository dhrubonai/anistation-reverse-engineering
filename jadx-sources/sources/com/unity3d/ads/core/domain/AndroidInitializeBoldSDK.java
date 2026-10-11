package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.probe.WebViewProbe;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.manager.OptimisticInitializationManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import defpackage.an3;
import defpackage.e93;
import defpackage.n11;
import defpackage.pn6;
import defpackage.q71;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w11;
import defpackage.ye6;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final n11 defaultDispatcher;
    private final DeliverModuleConfigs deliverModuleConfigs;
    private final v11 deviceInfoScope;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetIsModulesInitEnabled getIsModulesInitEnabled;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final Logger logger;
    private final OptimisticInitializationManager optimisticInitializationManager;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final ShouldUseFastInit shouldUseFastInit;
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;
    private final WarmNonInitSignals warmNonInitSignals;
    private final AtomicBoolean warmStarted;
    private final WebViewProbe webViewProbe;

    public AndroidInitializeBoldSDK(n11 n11Var, InitializeOMSDK initializeOMSDK, GetInitializationRequest getInitializationRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, DeliverModuleConfigs deliverModuleConfigs, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, SDKPropertiesManager sDKPropertiesManager, GetGameId getGameId, Logger logger, AndroidHandleFocusCounters androidHandleFocusCounters, OptimisticInitializationManager optimisticInitializationManager, GetIsModulesInitEnabled getIsModulesInitEnabled, WebViewProbe webViewProbe, StaticDeviceInfoDataSource staticDeviceInfoDataSource, v11 v11Var, WarmNonInitSignals warmNonInitSignals, ShouldUseFastInit shouldUseFastInit) {
        n11Var.getClass();
        initializeOMSDK.getClass();
        getInitializationRequest.getClass();
        getRequestPolicy.getClass();
        cleanAssets.getClass();
        handleGatewayInitializationResponse.getClass();
        deliverModuleConfigs.getClass();
        gatewayClient.getClass();
        sessionRepository.getClass();
        eventObservers.getClass();
        triggerInitializeListener.getClass();
        sendDiagnosticEvent.getClass();
        diagnosticEventRepository.getClass();
        storageManager.getClass();
        sDKPropertiesManager.getClass();
        getGameId.getClass();
        logger.getClass();
        androidHandleFocusCounters.getClass();
        optimisticInitializationManager.getClass();
        getIsModulesInitEnabled.getClass();
        webViewProbe.getClass();
        staticDeviceInfoDataSource.getClass();
        v11Var.getClass();
        warmNonInitSignals.getClass();
        shouldUseFastInit.getClass();
        this.defaultDispatcher = n11Var;
        this.initializeOM = initializeOMSDK;
        this.getInitializeRequest = getInitializationRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.deliverModuleConfigs = deliverModuleConfigs;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.sdkPropertiesManager = sDKPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = androidHandleFocusCounters;
        this.optimisticInitializationManager = optimisticInitializationManager;
        this.getIsModulesInitEnabled = getIsModulesInitEnabled;
        this.webViewProbe = webViewProbe;
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource;
        this.deviceInfoScope = v11Var;
        this.warmNonInitSignals = warmNonInitSignals;
        this.shouldUseFastInit = shouldUseFastInit;
        this.warmStarted = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() {
        if (!this.sessionRepository.getShouldInitialize()) {
            InitializationException initializationError = this.sessionRepository.getInitializationError();
            if (initializationError == null) {
                throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", null, null, 50, null);
            }
            throw initializationError;
        }
        if (this.getGameId.invoke() != null) {
            return;
        }
        throw new InitializationException("gameId is null.", null, "invalid_game_id", "null", null, null, 50, null);
    }

    private final String getInitLog() {
        String str;
        StringBuilder sb = new StringBuilder("Initializing SDK 4.21.0 42100 with game id ");
        sb.append(this.getGameId.invoke());
        sb.append(" in ");
        if (this.sessionRepository.isTestModeEnabled()) {
            str = "test";
        } else {
            str = "production";
        }
        sb.append(str);
        sb.append(" mode, session ");
        sb.append(ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb.toString();
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z) {
        boolean z2;
        an3 an3Var = new an3();
        an3Var.put("operation", OperationType.INITIALIZATION.toString());
        if (initializationException != null) {
        }
        an3Var.put("source", str);
        an3Var.put("is_retry", String.valueOf(z));
        if (this.sessionRepository.getInitializationConfiguration() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        an3Var.put("new_api", String.valueOf(z2));
        an3Var.put("modules_init_enabled", String.valueOf(this.getIsModulesInitEnabled.invoke()));
        if (initializationException != null && initializationException.getReasonDebug() != null) {
            an3Var.put("reason_debug", initializationException.getReasonDebug());
        }
        return an3Var.b();
    }

    public static /* synthetic */ Map getTags$default(AndroidInitializeBoldSDK androidInitializeBoldSDK, InitializationException initializationException, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            initializationException = null;
        }
        return androidInitializeBoldSDK.getTags(initializationException, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(ye6 ye6Var, InitializationException initializationException, String str, boolean z) {
        this.logger.error("Initialization failed: " + initializationException.getMessage(), initializationException);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sessionRepository.setInitializationError(initializationException);
        this.optimisticInitializationManager.onInitializationFinished(false);
        double elapsedMillis = TimeExtensionsKt.elapsedMillis(ye6Var);
        this.triggerInitializeListener.error(initializationException);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_FAILURE_TIME, Double.valueOf(elapsedMillis), getTags(initializationException, str, z), (Map) null, (AdObject) null, (Integer) null, initializationException.getErrorToken(), (MediationInfo) null, 184, (Object) null);
        this.deliverModuleConfigs.notifyFailure(initializationException.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z, vz0 vz0Var) {
        this.logger.info(getInitLog());
        logNewPrivacyWasNotUsedIfNeeded();
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_STARTED;
        Map tags$default = getTags$default(this, null, str, z, 1, null);
        e93.y.getClass();
        Map singletonMap = Collections.singletonMap("kotlin_version", "2.4.20");
        singletonMap.getClass();
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, (Double) null, vn3.V(tags$default, singletonMap), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object invoke = this.eventObservers.invoke(vz0Var);
        if (invoke == w11.x) {
            return invoke;
        }
        return pn6.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013a, code lost:
    
        if (tailStep("clean_assets", r6, r0) != r12) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091  */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.unity3d.ads.core.domain.AndroidInitializeBoldSDK] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initializationSuccess(defpackage.ye6 r26, defpackage.ye6 r27, java.lang.String r28, boolean r29, defpackage.vz0 r30) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(ye6, ye6, java.lang.String, boolean, vz0):java.lang.Object");
    }

    private final void logNewPrivacyWasNotUsedIfNeeded() {
        if (this.sessionRepository.getInitializationConfiguration() != null && UnityAds.getUserConsent() == null && UnityAds.getUserOptOut() == null && UnityAds.getNonBehavioral() == null) {
            this.logger.info("The new UnityAds SDK initialization was used without the new privacy APIs. Use the new privacy APIs to update privacy consent handling.");
        }
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        diagnosticEvents.getClass();
        diagnosticEventRepository.configure(diagnosticEvents);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(4:21|22|23|(1:25))|12|13|(1:15)|16))|30|6|7|(0)(0)|12|13|(0)|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        r7 = new defpackage.y45(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tailStep(java.lang.String r5, defpackage.ub2 r6, defpackage.vz0 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$tailStep$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$tailStep$1 r0 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$tailStep$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$tailStep$1 r0 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$tailStep$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            pn6 r2 = defpackage.pn6.a
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L6a
            goto L44
        L2b:
            r6 = move-exception
            goto L46
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L34:
            defpackage.m37.N(r7)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L6a
            r0.label = r3     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L6a
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L6a
            w11 r7 = defpackage.w11.x
            if (r6 != r7) goto L44
            return r7
        L44:
            r7 = r2
            goto L4b
        L46:
            y45 r7 = new y45
            r7.<init>(r6)
        L4b:
            java.lang.Throwable r6 = defpackage.z45.b(r7)
            if (r6 == 0) goto L69
            com.unity3d.ads.core.log.Logger r4 = r4.logger
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Initialization tail step "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " failed"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.error(r5, r6)
        L69:
            return r2
        L6a:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.tailStep(java.lang.String, ub2, vz0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void warmStaticDeviceInfo() {
        if (!this.warmStarted.compareAndSet(false, true)) {
            return;
        }
        tl7.z(this.deviceInfoScope, null, null, new AndroidInitializeBoldSDK$warmStaticDeviceInfo$1(this, null), 3);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, ye6 ye6Var, vz0 vz0Var) {
        Object V = tl7.V(this.defaultDispatcher, new AndroidInitializeBoldSDK$invoke$2(ye6Var, this, str, null), vz0Var);
        if (V == w11.x) {
            return V;
        }
        return pn6.a;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }
}
