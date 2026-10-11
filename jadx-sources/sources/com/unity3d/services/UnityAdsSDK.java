package com.unity3d.services;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.log.LogLevelKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.ai4;
import defpackage.an3;
import defpackage.bx5;
import defpackage.bx7;
import defpackage.h11;
import defpackage.h43;
import defpackage.h98;
import defpackage.it1;
import defpackage.j04;
import defpackage.jf3;
import defpackage.q71;
import defpackage.rb3;
import defpackage.sb2;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.z05;
import defpackage.zo5;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class UnityAdsSDK implements IServiceComponent {
    private h43 initializationJob;
    private final IServiceProvider serviceProvider;

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i, q71 q71Var) {
        this((i & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, vz0 vz0Var) {
        String str2;
        String str3;
        String str4;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType;
        final String str5 = "";
        sb2 sb2Var = new sb2() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // defpackage.sb2
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, z05.a(TokenNumberProvider.class));
            }
        };
        jf3 jf3Var = jf3.z;
        rb3 B = bx7.B(jf3Var, sb2Var);
        rb3 B2 = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.domain.GetHeaderBiddingToken] */
            @Override // defpackage.sb2
            public final GetHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, z05.a(GetHeaderBiddingToken.class));
            }
        });
        rb3 B3 = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.domain.GetInitializationState] */
            @Override // defpackage.sb2
            public final GetInitializationState invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, z05.a(GetInitializationState.class));
            }
        });
        rb3 B4 = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$4
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // defpackage.sb2
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, z05.a(SendDiagnosticEvent.class));
            }
        });
        rb3 B5 = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$fetchToken$$inlined$inject$default$5
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.log.Logger] */
            @Override // defpackage.sb2
            public final Logger invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str5, z05.a(Logger.class));
            }
        });
        long b = j04.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$16(B4), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED, (Double) null, vn3.T(new ai4("sync", str), new ai4("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$15(B3), false, 1, null).toString())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 250, (Object) null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$15(B3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) bx7.K(it1.x, new UnityAdsSDK$fetchToken$token$1(B2, B, null));
                str2 = null;
                str3 = null;
            } catch (Exception e) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent fetchToken$lambda$16 = fetchToken$lambda$16(B4);
        if (str4 == null) {
            diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME;
        } else {
            diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME;
        }
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = diagnosticEventType;
        Double d = new Double(h11.c(b));
        an3 an3Var = new an3();
        an3Var.put("sync", str);
        an3Var.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$15(B3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            an3Var.put("reason_debug", str3);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$16, diagnosticEventType2, d, an3Var.b(), (Map) null, (AdObject) null, new Integer(fetchToken$lambda$13(B).invoke()), (ByteString) null, (MediationInfo) null, 216, (Object) null);
        if (str4 == null) {
            Logger.DefaultImpls.error$default(fetchToken$lambda$17(B5), zo5.l("Returned nil token due to: ", str2), null, 2, null);
        } else {
            fetchToken$lambda$17(B5).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$13(rb3 rb3Var) {
        return (TokenNumberProvider) rb3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$14(rb3 rb3Var) {
        return (GetHeaderBiddingToken) rb3Var.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$15(rb3 rb3Var) {
        return (GetInitializationState) rb3Var.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$16(rb3 rb3Var) {
        return (SendDiagnosticEvent) rb3Var.getValue();
    }

    private static final Logger fetchToken$lambda$17(rb3 rb3Var) {
        return (Logger) rb3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$21(rb3 rb3Var) {
        return (GetAdObject) rb3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$22(rb3 rb3Var) {
        return (OmFinishSession) rb3Var.getValue();
    }

    private static final GetGameId getToken$lambda$10(rb3 rb3Var) {
        return (GetGameId) rb3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$11(rb3 rb3Var) {
        return (TokenNumberProvider) rb3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$12(rb3 rb3Var) {
        return (GetAsyncHeaderBiddingToken) rb3Var.getValue();
    }

    public static /* synthetic */ h43 initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, InitializationConfiguration initializationConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "api";
        }
        if ((i & 4) != 0) {
            initializationConfiguration = null;
        }
        return unityAdsSDK.initialize(str, str2, initializationConfiguration);
    }

    private static final ShouldAllowInitialization initialize$lambda$7$lambda$0(rb3 rb3Var) {
        return (ShouldAllowInitialization) rb3Var.getValue();
    }

    private static final SessionRepository initialize$lambda$7$lambda$4$lambda$1(rb3 rb3Var) {
        return (SessionRepository) rb3Var.getValue();
    }

    private static final ValidateExtrasSize initialize$lambda$7$lambda$4$lambda$2(rb3 rb3Var) {
        return (ValidateExtrasSize) rb3Var.getValue();
    }

    private static final Logger initialize$lambda$7$lambda$4$lambda$3(rb3 rb3Var) {
        return (Logger) rb3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$7$lambda$5(rb3 rb3Var) {
        return (InitializeBoldSDK) rb3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendDiagnosticEvent initialize$lambda$7$lambda$6(rb3 rb3Var) {
        return (SendDiagnosticEvent) rb3Var.getValue();
    }

    public static /* synthetic */ h43 load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, int i, Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, internalLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$8(rb3 rb3Var) {
        return (GetGameId) rb3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$9(rb3 rb3Var) {
        return (Context) rb3Var.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$23(rb3 rb3Var) {
        return (SendDiagnosticEvent) rb3Var.getValue();
    }

    public final h43 finishOMIDSession(String str) {
        str.getClass();
        final String str2 = "";
        sb2 sb2Var = new sb2() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.domain.GetAdObject] */
            @Override // defpackage.sb2
            public final GetAdObject invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, z05.a(GetAdObject.class));
            }
        };
        jf3 jf3Var = jf3.z;
        rb3 B = bx7.B(jf3Var, sb2Var);
        rb3 B2 = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.domain.om.OmFinishSession] */
            @Override // defpackage.sb2
            public final OmFinishSession invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, z05.a(OmFinishSession.class));
            }
        });
        v11 v11Var = (v11) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, z05.a(v11.class));
        return tl7.z(v11Var, null, null, new UnityAdsSDK$finishOMIDSession$1(str, v11Var, B, B2, null), 3);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final h43 getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        final String str = "";
        sb2 sb2Var = new sb2() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // defpackage.sb2
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(GetGameId.class));
            }
        };
        jf3 jf3Var = jf3.z;
        initialize$default(this, getToken$lambda$10(bx7.B(jf3Var, sb2Var)).invoke(), "get_token", null, 4, null);
        rb3 B = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.TokenNumberProvider, java.lang.Object] */
            @Override // defpackage.sb2
            public final TokenNumberProvider invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(TokenNumberProvider.class));
            }
        });
        rb3 B2 = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$getToken$$inlined$inject$default$3
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken, java.lang.Object] */
            @Override // defpackage.sb2
            public final GetAsyncHeaderBiddingToken invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(GetAsyncHeaderBiddingToken.class));
            }
        });
        v11 v11Var = (v11) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, z05.a(v11.class));
        return tl7.z(v11Var, null, null, new UnityAdsSDK$getToken$2(tokenConfiguration, iUnityAdsTokenListener, v11Var, B2, B, null), 3);
    }

    public final h43 initialize(String str, String str2, InitializationConfiguration initializationConfiguration) {
        str2.getClass();
        synchronized (this) {
            long b = j04.b();
            h43 h43Var = this.initializationJob;
            if (h43Var != null && h43Var.isActive()) {
                return h43Var;
            }
            final String str3 = "";
            jf3 jf3Var = jf3.z;
            if (!initialize$lambda$7$lambda$0(bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$7$$inlined$inject$default$1
                /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.ShouldAllowInitialization, java.lang.Object] */
                @Override // defpackage.sb2
                public final ShouldAllowInitialization invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str3, z05.a(ShouldAllowInitialization.class));
                }
            })).invoke(str)) {
                return h98.e();
            }
            if (initializationConfiguration != null) {
                final String str4 = "";
                rb3 B = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$7$lambda$4$$inlined$inject$default$1
                    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.data.repository.SessionRepository, java.lang.Object] */
                    @Override // defpackage.sb2
                    public final SessionRepository invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str4, z05.a(SessionRepository.class));
                    }
                });
                final String str5 = "";
                ValidateExtrasSize.invoke$default(initialize$lambda$7$lambda$4$lambda$2(bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$7$lambda$4$$inlined$inject$default$2
                    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.ValidateExtrasSize, java.lang.Object] */
                    @Override // defpackage.sb2
                    public final ValidateExtrasSize invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str5, z05.a(ValidateExtrasSize.class));
                    }
                })), initializationConfiguration.getExtras(), "init", null, 4, null);
                initialize$lambda$7$lambda$4$lambda$1(B).setInitializationConfiguration(new InitializationConfigurationInternal(initializationConfiguration.getGameId(), initializationConfiguration.isTestModeEnabled(), initializationConfiguration.getLogLevel(), initializationConfiguration.getExtras(), initializationConfiguration.getMediationInfo()));
                final String str6 = "";
                initialize$lambda$7$lambda$4$lambda$3(bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$7$lambda$4$$inlined$inject$default$3
                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.unity3d.ads.core.log.Logger] */
                    @Override // defpackage.sb2
                    public final Logger invoke() {
                        IServiceComponent iServiceComponent = IServiceComponent.this;
                        return iServiceComponent.getServiceProvider().getRegistry().getService(str6, z05.a(Logger.class));
                    }
                })).setLogLevel(LogLevelKt.toLogLevelInternal(initializationConfiguration.getLogLevel()));
            }
            final String str7 = "";
            rb3 B2 = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$7$$inlined$inject$default$2
                /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.InitializeBoldSDK, java.lang.Object] */
                @Override // defpackage.sb2
                public final InitializeBoldSDK invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str7, z05.a(InitializeBoldSDK.class));
                }
            });
            final String str8 = "";
            rb3 B3 = bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$initialize$lambda$7$$inlined$inject$default$3
                /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
                @Override // defpackage.sb2
                public final SendDiagnosticEvent invoke() {
                    IServiceComponent iServiceComponent = IServiceComponent.this;
                    return iServiceComponent.getServiceProvider().getRegistry().getService(str8, z05.a(SendDiagnosticEvent.class));
                }
            });
            v11 v11Var = (v11) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, z05.a(v11.class));
            bx5 z = tl7.z(v11Var, null, null, new UnityAdsSDK$initialize$1$newInitializationJob$1(str2, b, v11Var, B3, B2, null), 3);
            this.initializationJob = z;
            return z;
        }
    }

    public final h43 load(String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize) {
        unityAdsLoadOptions.getClass();
        final String str2 = "";
        sb2 sb2Var = new sb2() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.GetGameId, java.lang.Object] */
            @Override // defpackage.sb2
            public final GetGameId invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, z05.a(GetGameId.class));
            }
        };
        jf3 jf3Var = jf3.z;
        initialize$default(this, load$lambda$8(bx7.B(jf3Var, sb2Var)).invoke(), "load", null, 4, null);
        v11 v11Var = (v11) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, z05.a(v11.class));
        return tl7.z(v11Var, null, null, new UnityAdsSDK$load$1(this, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, v11Var, bx7.B(jf3Var, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$load$$inlined$inject$default$2
            /* JADX WARN: Type inference failed for: r2v2, types: [android.content.Context, java.lang.Object] */
            @Override // defpackage.sb2
            public final Context invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, z05.a(Context.class));
            }
        }), null), 3);
    }

    public final void sendBannerDestroyed() {
        final String str = "";
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$23(bx7.B(jf3.z, new sb2() { // from class: com.unity3d.services.UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
            @Override // defpackage.sb2
            public final SendDiagnosticEvent invoke() {
                IServiceComponent iServiceComponent = IServiceComponent.this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, z05.a(SendDiagnosticEvent.class));
            }
        })), "native_banner_destroyed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 254, (Object) null);
    }

    public final h43 show(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners) {
        listeners.getClass();
        v11 v11Var = (v11) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, z05.a(v11.class));
        return tl7.z(v11Var, null, null, new UnityAdsSDK$show$1((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", z05.a(LegacyShowUseCase.class)), str, unityAdsShowOptions, listeners, v11Var, null), 3);
    }

    public UnityAdsSDK(IServiceProvider iServiceProvider) {
        iServiceProvider.getClass();
        this.serviceProvider = iServiceProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final h43 getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        return getToken(null, iUnityAdsTokenListener);
    }

    public final String getToken() {
        return (String) bx7.K(it1.x, new UnityAdsSDK$getToken$1(this, null));
    }
}
