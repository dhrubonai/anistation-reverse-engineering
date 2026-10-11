package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.GatewayUrl;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.SessionIdReader;
import defpackage.bx7;
import defpackage.db;
import defpackage.fn5;
import defpackage.h41;
import defpackage.ic2;
import defpackage.in5;
import defpackage.it1;
import defpackage.jn5;
import defpackage.l62;
import defpackage.m37;
import defpackage.n11;
import defpackage.nt1;
import defpackage.pn6;
import defpackage.q71;
import defpackage.sx5;
import defpackage.t36;
import defpackage.t44;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.x44;
import defpackage.xz0;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidSessionRepository implements SessionRepository {
    private final x44 _currentState;
    private x44 _gameId;
    private final x44 _gatewayUrl;
    private final x44 _headerBiddingTokenCounter;
    private final x44 _initializationError;
    private final x44 _initializationState;
    private final x44 _isFirstInitAttempt;
    private final x44 _isTestModeEnabled;
    private t44 _onChange;
    private final x44 _requestUrlOverride;
    private final x44 _sdkConfiguration;
    private final x44 _sessionCounters;
    private final x44 _sessionId;
    private final x44 _sessionToken;
    private final x44 _shouldInitialize;
    private final x44 _tokenCounters;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    private InitializationConfigurationInternal initializationConfiguration;
    private final x44 isInit;
    private final ByteStringDataSource nativeConfigDataSource;
    private final fn5 onChange;
    private final w42 persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, vz0 vz0Var) {
            super(2, vz0Var);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass1(this.$sendDiagnosticEvent, vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    w11 w11Var = w11.x;
                    if (obj == w11Var) {
                        return w11Var;
                    }
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    x44 x44Var = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration parseFrom = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    parseFrom.getClass();
                    sx5 sx5Var = (sx5) x44Var;
                    sx5Var.getClass();
                    sx5Var.l(null, parseFrom);
                }
            } catch (Exception e) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                Map singletonMap = Collections.singletonMap("debugReason", message);
                singletonMap.getClass();
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", (Double) null, singletonMap, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
            }
            x44 x44Var2 = AndroidSessionRepository.this.isInit;
            Boolean bool = Boolean.TRUE;
            sx5 sx5Var2 = (sx5) x44Var2;
            sx5Var2.getClass();
            sx5Var2.l(null, bool);
            return pn6.a;
        }
    }

    private AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, n11 n11Var, SendDiagnosticEvent sendDiagnosticEvent, String str) {
        byteStringDataSource.getClass();
        byteStringDataSource2.getClass();
        byteStringDataSource3.getClass();
        byteStringDataSource4.getClass();
        androidUnityInfoDataSource.getClass();
        nativeConfiguration.getClass();
        n11Var.getClass();
        sendDiagnosticEvent.getClass();
        str.getClass();
        this.gatewayCacheDataSource = byteStringDataSource;
        this.privacyDataSource = byteStringDataSource2;
        this.fsmDataSource = byteStringDataSource3;
        this.nativeConfigDataSource = byteStringDataSource4;
        this.unityInfoDataSource = androidUnityInfoDataSource;
        sx5 a = tx5.a(nativeConfiguration);
        this._sdkConfiguration = a;
        sx5 a2 = tx5.a(Boolean.FALSE);
        this.isInit = a2;
        tl7.z(db.b(n11Var), null, null, new AnonymousClass1(sendDiagnosticEvent, null), 3);
        final l62 l62Var = new l62(a, a2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final w42 w42Var = new w42() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var) {
                    this.$this_unsafeFlow = x42Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L49
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        r6 = r5
                        ai4 r6 = (defpackage.ai4) r6
                        java.lang.Object r6 = r6.y
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        if (r6 == 0) goto L49
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L49
                        return r5
                    L49:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var), vz0Var);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        };
        this.persistedNativeConfiguration = new w42() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var) {
                    this.$this_unsafeFlow = x42Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L40
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        ai4 r5 = (defpackage.ai4) r5
                        java.lang.Object r5 = r5.x
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L40
                        return r5
                    L40:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var), vz0Var);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        };
        in5 b = jn5.b(0, 0, null, 7);
        this._onChange = b;
        this.onChange = h41.c(b);
        String gameId = ClientProperties.getGameId();
        this._gameId = tx5.a(gameId == null ? null : gameId);
        UUID fromString = UUID.fromString(SessionIdReader.INSTANCE.getSessionId());
        fromString.getClass();
        this._sessionId = tx5.a(ProtobufExtensionsKt.toByteString(fromString));
        this._isTestModeEnabled = tx5.a(Boolean.valueOf(SdkProperties.isTestMode()));
        this._sessionCounters = tx5.a(SessionCountersOuterClass.SessionCounters.newBuilder().build());
        this._tokenCounters = tx5.a(new TokenCounters(0, 0, 0));
        this._initializationError = tx5.a(null);
        ByteString byteString = ByteString.EMPTY;
        this._sessionToken = tx5.a(byteString);
        this._currentState = tx5.a(byteString);
        this._gatewayUrl = tx5.a(str);
        this._initializationState = tx5.a(InitializationState.NOT_INITIALIZED);
        this._requestUrlOverride = tx5.a(nt1.x);
        this._headerBiddingTokenCounter = tx5.a(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = tx5.a(bool);
        this._isFirstInitAttempt = tx5.a(bool);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int i) {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setGlobalAdsFocusTime(_create.getGlobalAdsFocusTime() + i);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        featureFlags.getClass();
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGameId() {
        sx5 sx5Var;
        Object value;
        String gameId;
        x44 x44Var = this._gameId;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!sx5Var.j(value, gameId));
        return gameId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getGatewayCache(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r5)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r4 = r4.gatewayCacheDataSource
            r0.label = r2
            java.lang.Object r5 = r4.get(r0)
            w11 r4 = defpackage.w11.x
            if (r5 != r4) goto L3c
            return r4
        L3c:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r4 = r5.getData()
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getGatewayState() {
        return (ByteString) ((sx5) this._currentState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGatewayUrl() {
        return (String) ((sx5) this._gatewayUrl).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        sx5 sx5Var;
        Object value;
        Number number;
        x44 x44Var = this._headerBiddingTokenCounter;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            number = (Number) value;
        } while (!sx5Var.j(value, Integer.valueOf(number.intValue() + 1)));
        return number.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationConfigurationInternal getInitializationConfiguration() {
        return this.initializationConfiguration;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationException getInitializationError() {
        return (InitializationException) ((sx5) this._initializationError).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationState getInitializationState() {
        return (InitializationState) ((sx5) this._initializationState).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        if (!((Boolean) ((sx5) this.isInit).getValue()).booleanValue()) {
            return (NativeConfigurationOuterClass.NativeConfiguration) bx7.K(it1.x, new AndroidSessionRepository$nativeConfiguration$1(this, null));
        }
        return (NativeConfigurationOuterClass.NativeConfiguration) ((sx5) this._sdkConfiguration).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public w42 getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public fn5 getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getPrivacy(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r5)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r4 = r4.privacyDataSource
            r0.label = r2
            java.lang.Object r5 = r4.get(r0)
            w11 r4 = defpackage.w11.x
            if (r5 != r4) goto L3c
            return r4
        L3c:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r4 = r5.getData()
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy(vz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getPrivacyFsm(defpackage.vz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.m37.N(r5)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.m37.N(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r4 = r4.fsmDataSource
            r0.label = r2
            java.lang.Object r5 = r4.get(r0)
            w11 r4 = defpackage.w11.x
            if (r5 != r4) goto L3c
            return r4
        L3c:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r4 = r5.getData()
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm(vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides() {
        return (List) ((sx5) this._requestUrlOverride).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return (SessionCountersOuterClass.SessionCounters) ((sx5) this._sessionCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionId() {
        return (ByteString) ((sx5) this._sessionId).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionToken() {
        return (ByteString) ((sx5) this._sessionToken).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return ((Boolean) ((sx5) this._shouldInitialize).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public TokenCounters getTokenCounters() {
        return (TokenCounters) ((sx5) this._tokenCounters).getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementAllErrorsCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setAllErrorsCount(_create.getAllErrorsCount() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setBannerImpressions(_create.getBannerImpressions() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setBannerRequestsAdm(_create.getBannerRequestsAdm() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setBannerLoadRequests(_create.getBannerLoadRequests() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementCacheTimeoutErrorsCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setCacheTimeoutErrorsCount(_create.getCacheTimeoutErrorsCount() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setFocusChangeCount(_create.getFocusChangeCount() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setGlobalAdsFocusChangeCount(_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setLoadRequestsAdm(_create.getLoadRequestsAdm() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setLoadRequests(_create.getLoadRequests() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementSuccessCount() {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setSuccessCount(_create.getSuccessCount() + 1);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        sx5 sx5Var;
        Object value;
        TokenCounters tokenCounters;
        x44 x44Var = this._tokenCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!sx5Var.j(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        sx5 sx5Var;
        Object value;
        TokenCounters tokenCounters;
        x44 x44Var = this._tokenCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!sx5Var.j(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        sx5 sx5Var;
        Object value;
        TokenCounters tokenCounters;
        x44 x44Var = this._tokenCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            tokenCounters = (TokenCounters) value;
        } while (!sx5Var.j(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        sx5 sx5Var;
        Object value;
        Boolean bool;
        x44 x44Var = this._isFirstInitAttempt;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!sx5Var.j(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isNativeConfigReady() {
        return ((Boolean) ((sx5) this.isInit).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        if (getInitializationState() == InitializationState.INITIALIZED) {
            return true;
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        sx5 sx5Var;
        Object value;
        boolean isTestMode;
        x44 x44Var = this._isTestModeEnabled;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            ((Boolean) value).getClass();
            isTestMode = SdkProperties.isTestMode();
        } while (!sx5Var.j(value, Boolean.valueOf(isTestMode)));
        return isTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object persistNativeConfiguration(vz0 vz0Var) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        byteString.getClass();
        Object obj = byteStringDataSource.set(byteString, vz0Var);
        if (obj == w11.x) {
            return obj;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        sx5 sx5Var;
        Object value;
        x44 x44Var = this._tokenCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, new TokenCounters(0, 0, 0)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(String str) {
        sx5 sx5Var;
        Object value;
        x44 x44Var = this._gameId;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            ClientProperties.setGameId(str);
        } while (!sx5Var.j(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setGatewayCache(ByteString byteString, vz0 vz0Var) {
        Object obj = this.gatewayCacheDataSource.set(byteString, vz0Var);
        if (obj == w11.x) {
            return obj;
        }
        return pn6.a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(ByteString byteString) {
        sx5 sx5Var;
        Object value;
        byteString.getClass();
        x44 x44Var = this._currentState;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(String str) {
        sx5 sx5Var;
        Object value;
        str.getClass();
        x44 x44Var = this._gatewayUrl;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationConfiguration(InitializationConfigurationInternal initializationConfigurationInternal) {
        this.initializationConfiguration = initializationConfigurationInternal;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationError(InitializationException initializationException) {
        sx5 sx5Var;
        Object value;
        x44 x44Var = this._initializationError;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, initializationException));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationLatency(int i) {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setInitializationLatency(i);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(InitializationState initializationState) {
        sx5 sx5Var;
        Object value;
        initializationState.getClass();
        x44 x44Var = this._initializationState;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, initializationState));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setLastLoadLatency(int i) {
        sx5 sx5Var;
        Object value;
        SessionCountersKt.Dsl _create;
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = ((SessionCountersOuterClass.SessionCounters) value).toBuilder();
            builder.getClass();
            _create = companion._create(builder);
            _create.setLastLoadLatency(i);
        } while (!sx5Var.j(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
        sx5 sx5Var;
        Object value;
        nativeConfiguration.getClass();
        x44 x44Var = this._sdkConfiguration;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, nativeConfiguration));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r6.emit(r8, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8.set(r7, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setPrivacy(com.google.protobuf.ByteString r7, defpackage.vz0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m37.N(r8)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L31:
            java.lang.Object r7 = r0.L$0
            com.google.protobuf.ByteString r7 = (com.google.protobuf.ByteString) r7
            defpackage.m37.N(r8)
            goto L49
        L39:
            defpackage.m37.N(r8)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r8 = r6.privacyDataSource
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.set(r7, r0)
            if (r8 != r5) goto L49
            goto L5a
        L49:
            t44 r6 = r6._onChange
            com.unity3d.ads.core.data.model.SessionChange$UserConsentChange r8 = new com.unity3d.ads.core.data.model.SessionChange$UserConsentChange
            r8.<init>(r7)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.emit(r8, r0)
            if (r6 != r5) goto L5b
        L5a:
            return r5
        L5b:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy(com.google.protobuf.ByteString, vz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r6.emit(r8, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8.set(r7, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setPrivacyFsm(com.google.protobuf.ByteString r7, defpackage.vz0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.m37.N(r8)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L31:
            java.lang.Object r7 = r0.L$0
            com.google.protobuf.ByteString r7 = (com.google.protobuf.ByteString) r7
            defpackage.m37.N(r8)
            goto L49
        L39:
            defpackage.m37.N(r8)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r8 = r6.fsmDataSource
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.set(r7, r0)
            if (r8 != r5) goto L49
            goto L5a
        L49:
            t44 r6 = r6._onChange
            com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange r8 = new com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange
            r8.<init>(r7)
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.emit(r8, r0)
            if (r6 != r5) goto L5b
        L5a:
            return r5
        L5b:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm(com.google.protobuf.ByteString, vz0):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setRequestUrlOverrides(List<InitializationResponseOuterClass.RequestUrlOverride> list) {
        sx5 sx5Var;
        Object value;
        list.getClass();
        x44 x44Var = this._requestUrlOverride;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, list));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
        sx5 sx5Var;
        Object value;
        sessionCounters.getClass();
        x44 x44Var = this._sessionCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, sessionCounters));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(ByteString byteString) {
        sx5 sx5Var;
        Object value;
        byteString.getClass();
        x44 x44Var = this._sessionToken;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        sx5 sx5Var;
        Object value;
        x44 x44Var = this._shouldInitialize;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            ((Boolean) value).getClass();
        } while (!sx5Var.j(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(TokenCounters tokenCounters) {
        sx5 sx5Var;
        Object value;
        tokenCounters.getClass();
        x44 x44Var = this._tokenCounters;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
        } while (!sx5Var.j(value, tokenCounters));
    }

    public /* synthetic */ AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, n11 n11Var, SendDiagnosticEvent sendDiagnosticEvent, String str, q71 q71Var) {
        this(byteStringDataSource, byteStringDataSource2, byteStringDataSource3, byteStringDataSource4, androidUnityInfoDataSource, nativeConfiguration, n11Var, sendDiagnosticEvent, str);
    }

    public /* synthetic */ AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, n11 n11Var, SendDiagnosticEvent sendDiagnosticEvent, String str, int i, q71 q71Var) {
        this(byteStringDataSource, byteStringDataSource2, byteStringDataSource3, byteStringDataSource4, androidUnityInfoDataSource, nativeConfiguration, n11Var, sendDiagnosticEvent, (i & 256) != 0 ? GatewayUrl.m45constructorimpl(UnityAdsConstants.DefaultUrls.GATEWAY_URL) : str, null);
    }
}
