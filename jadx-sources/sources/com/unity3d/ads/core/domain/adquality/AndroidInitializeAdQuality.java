package com.unity3d.ads.core.domain.adquality;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import defpackage.ai4;
import defpackage.bf6;
import defpackage.fq1;
import defpackage.j04;
import defpackage.sb2;
import defpackage.uz5;
import defpackage.vn3;
import defpackage.y7;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidInitializeAdQuality implements InitializeAdQuality {
    private final Context context;
    private final GetGameId getGameId;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevelInternal.values().length];
            try {
                iArr[LogLevelInternal.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevelInternal.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevelInternal.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevelInternal.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevelInternal.TRACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidInitializeAdQuality(Context context, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, GetGameId getGameId) {
        context.getClass();
        sendDiagnosticEvent.getClass();
        logger.getClass();
        getGameId.getClass();
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        this.getGameId = getGameId;
    }

    /* renamed from: buildConfig-LaDbsBc */
    private final ISAdQualityConfig m59buildConfigLaDbsBc(final long j, ByteString byteString) {
        ISAdQualityConfig.Builder addAdQualityInitListener = new ISAdQualityConfig.Builder().setInitializationSource("UnityAds").setLogLevel(mapLogLevel(this.logger.getLogLevel())).setMetaData("uads_session_token", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null)).addAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality$buildConfig$configBuilder$1
            public void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                SendDiagnosticEvent sendDiagnosticEvent;
                Logger logger;
                iSAdQualityInitError.getClass();
                str.getClass();
                double d = fq1.d(bf6.b(j));
                sendDiagnosticEvent = this.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME, Double.valueOf(d), vn3.T(new ai4("reason", iSAdQualityInitError.name()), new ai4("reason_debug", str)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 248, (Object) null);
                logger = this.logger;
                Logger.DefaultImpls.error$default(logger, "Ad Quality failed to initialize: ".concat(str), null, 2, null);
            }

            public void adQualitySdkInitSuccess() {
                SendDiagnosticEvent sendDiagnosticEvent;
                double d = fq1.d(bf6.b(j));
                sendDiagnosticEvent = this.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME, Double.valueOf(d), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 252, (Object) null);
            }
        });
        String userIdentifier = UnityAds.getUserIdentifier();
        if (userIdentifier != null) {
            addAdQualityInitListener.setUserId(userIdentifier);
        }
        ISAdQualityConfig build = addAdQualityInitListener.build();
        build.getClass();
        return build;
    }

    private final ISAdQualityLogLevel mapLogLevel(LogLevelInternal logLevelInternal) {
        int i = WhenMappings.$EnumSwitchMapping$0[logLevelInternal.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return ISAdQualityLogLevel.VERBOSE;
                        }
                        ze0.l();
                        return null;
                    }
                    return ISAdQualityLogLevel.DEBUG;
                }
                return ISAdQualityLogLevel.INFO;
            }
            return ISAdQualityLogLevel.ERROR;
        }
        return ISAdQualityLogLevel.NONE;
    }

    private final void reportLoadFailure(Throwable th, String str) {
        this.logger.debug(new y7(th, (byte) 12));
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
        Double valueOf = Double.valueOf(0.0d);
        String message = th.getMessage();
        if (message == null) {
            message = str;
        }
        Map singletonMap = Collections.singletonMap("reason_debug", message);
        singletonMap.getClass();
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, singletonMap, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 248, (Object) null);
    }

    public static final String reportLoadFailure$lambda$3(Throwable th) {
        return "Ad Quality SDK not available: " + th.getMessage();
    }

    private final void safeRun(sb2 sb2Var) {
        try {
            sb2Var.invoke();
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(0.0d);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            Map singletonMap = Collections.singletonMap("reason_debug", message);
            singletonMap.getClass();
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, singletonMap, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 248, (Object) null);
        }
    }

    private final ISAdQualityConfig startInitialization(ByteString byteString) {
        long b = j04.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 254, (Object) null);
        return m59buildConfigLaDbsBc(b, byteString);
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invoke(String str, ByteString byteString) {
        str.getClass();
        byteString.getClass();
        try {
            IronSourceAdQuality.getInstance().initialize(this.context, str, startInitialization(byteString));
        } catch (ClassNotFoundException e) {
            reportLoadFailure(e, "ClassNotFoundException");
        } catch (NoClassDefFoundError e2) {
            reportLoadFailure(e2, "NoClassDefFoundError");
        } catch (NoSuchMethodError e3) {
            reportLoadFailure(e3, "NoSuchMethodError");
        } catch (Throwable th) {
            this.logger.error("Ad Quality SDK initialization failed", th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
            Double valueOf = Double.valueOf(0.0d);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            Map singletonMap = Collections.singletonMap("reason_debug", message);
            singletonMap.getClass();
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, singletonMap, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 248, (Object) null);
        }
    }

    @Override // com.unity3d.ads.core.domain.adquality.InitializeAdQuality
    public void invokeWithGameId(ByteString byteString) {
        byteString.getClass();
        String invoke = this.getGameId.invoke();
        if (invoke != null && !uz5.V(invoke)) {
            try {
                IronSourceAdQuality.getInstance().initializeWithGameId(this.context, invoke, startInitialization(byteString));
            } catch (ClassNotFoundException e) {
                reportLoadFailure(e, "ClassNotFoundException");
            } catch (NoClassDefFoundError e2) {
                reportLoadFailure(e2, "NoClassDefFoundError");
            } catch (NoSuchMethodError e3) {
                reportLoadFailure(e3, "NoSuchMethodError");
            } catch (Throwable th) {
                this.logger.error("Ad Quality SDK initialization failed", th);
                SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_FAILURE_TIME;
                Double valueOf = Double.valueOf(0.0d);
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                Map singletonMap = Collections.singletonMap("reason_debug", message);
                singletonMap.getClass();
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, valueOf, singletonMap, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 248, (Object) null);
            }
        }
    }
}
