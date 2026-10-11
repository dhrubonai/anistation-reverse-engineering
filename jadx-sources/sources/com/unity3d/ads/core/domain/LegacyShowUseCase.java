package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.ai4;
import defpackage.an3;
import defpackage.mc2;
import defpackage.pn6;
import defpackage.q71;
import defpackage.sx5;
import defpackage.tf3;
import defpackage.tx5;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w11;
import defpackage.wb;
import defpackage.x44;
import defpackage.ye6;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    public static final int NATIVE_START_SIGNAL_COUNT = 2;
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final Logger logger;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final x44 startedCount;
    private final x44 timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    public LegacyShowUseCase(Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        show.getClass();
        adRepository.getClass();
        sendDiagnosticEvent.getClass();
        getOperativeEventApi.getClass();
        getInitializationState.getClass();
        sessionRepository.getClass();
        safeCallbackInvoke.getClass();
        logger.getClass();
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startedCount = tx5.a(0);
        this.timeoutCancellationRequested = tx5.a(Boolean.FALSE);
    }

    public final void bannerLeftApplication(ye6 ye6Var, String str, Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP, Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 236, (Object) null);
        this.safeCallbackInvoke.invoke(new tf3(listeners, str, (byte) 2));
    }

    public static final pn6 bannerLeftApplication$lambda$4(Listeners listeners, String str) {
        listeners.onLeftApplication(str);
        return pn6.a;
    }

    public final void cancelTimeout(ye6 ye6Var) {
        x44 x44Var = this.timeoutCancellationRequested;
        Boolean bool = Boolean.TRUE;
        sx5 sx5Var = (sx5) x44Var;
        sx5Var.getClass();
        sx5Var.l(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 236, (Object) null);
    }

    public final String getAdInfoString() {
        String str;
        ByteString opportunityId;
        StringBuilder sb = new StringBuilder("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        if (adObject != null) {
            str = adObject.getPlacementId();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb.append(uuid);
        return sb.toString();
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) {
        Object opt;
        String obj;
        JSONObject data = unityAdsShowOptions.getData();
        if (data != null && (opt = data.opt("objectId")) != null && (obj = opt.toString()) != null) {
            return UUID.fromString(obj).toString();
        }
        return null;
    }

    public final Map<String, String> getTags(String str, Integer num, String str2, UnityAdsShowOptions unityAdsShowOptions) {
        ShowConfigurationInternal showConfigurationInternal;
        boolean z;
        ai4 ai4Var = new ai4("operation", OperationType.SHOW.toString());
        ai4 ai4Var2 = new ai4("reason", str);
        if (unityAdsShowOptions != null) {
            showConfigurationInternal = unityAdsShowOptions.showConfiguration;
        } else {
            showConfigurationInternal = null;
        }
        if (showConfigurationInternal != null) {
            z = true;
        } else {
            z = false;
        }
        LinkedHashMap U = vn3.U(ai4Var, ai4Var2, new ai4("new_api", String.valueOf(z)));
        if (num != null) {
        }
        if (str2 != null) {
            U.put("reason_debug", str2);
        }
        return U;
    }

    public final AdObject getTmpAdObject(String str) {
        UUID fromString = UUID.fromString(str);
        fromString.getClass();
        AdObject ad = this.adRepository.getAd(ProtobufExtensionsKt.toByteString(fromString));
        if (ad != null) {
            return ad;
        }
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.Companion;
        UUID fromString2 = UUID.fromString(str);
        fromString2.getClass();
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString2);
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(companion, byteString, str2, false, null, null, 28, null);
    }

    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, vz0 vz0Var) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        newBuilder.getClass();
        OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        _create.setErrorType(operativeEventErrorType);
        _create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = _build.toByteString();
        byteString.getClass();
        Object invoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, vz0Var);
        if (invoke == w11.x) {
            return invoke;
        }
        return pn6.a;
    }

    public final void showClicked(ye6 ye6Var, String str, Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED, Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 236, (Object) null);
        this.safeCallbackInvoke.invoke(new tf3(listeners, str, (byte) 0));
    }

    public static final pn6 showClicked$lambda$7(Listeners listeners, String str) {
        listeners.onClick(str);
        return pn6.a;
    }

    public final void showCompleted(ye6 ye6Var, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, UnityAdsShowOptions unityAdsShowOptions) {
        ShowConfigurationInternal showConfigurationInternal;
        boolean z;
        this.logger.info("Finished showing ad " + getAdInfoString());
        an3 an3Var = new an3();
        if (str2 != null) {
        }
        if (str3 != null) {
        }
        if (unityAdsShowOptions != null) {
            showConfigurationInternal = unityAdsShowOptions.showConfiguration;
        } else {
            showConfigurationInternal = null;
        }
        if (showConfigurationInternal != null) {
            z = true;
        } else {
            z = false;
        }
        String.valueOf(z);
        an3 b = an3Var.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var)), b, (Map) null, this.adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 232, (Object) null);
        this.safeCallbackInvoke.invoke(new wb(listeners, str, showStatus, this, (byte) 5));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, ye6 ye6Var, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, UnityAdsShowOptions unityAdsShowOptions, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(ye6Var, str, showStatus, listeners, str2, str3, unityAdsShowOptions);
    }

    public static final pn6 showCompleted$lambda$12(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
        NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = legacyShowUseCase.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
        defaultShowCompletionState.getClass();
        listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
        return pn6.a;
    }

    private final mc2 showError(ye6 ye6Var, String str, String str2, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions) {
        return new LegacyShowUseCase$showError$1(this, str2, ye6Var, unityAdsShowOptions, listeners, str, null);
    }

    public static final pn6 showReceivedReward$lambda$3(Listeners listeners, String str) {
        listeners.onRewarded(str);
        return pn6.a;
    }

    private final void showStart(String str, UnityAdsShowOptions unityAdsShowOptions) {
        ShowConfigurationInternal showConfigurationInternal;
        boolean z;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED;
        AdObject tmpAdObject = getTmpAdObject(str);
        if (unityAdsShowOptions != null) {
            showConfigurationInternal = unityAdsShowOptions.showConfiguration;
        } else {
            showConfigurationInternal = null;
        }
        if (showConfigurationInternal != null) {
            z = true;
        } else {
            z = false;
        }
        Map singletonMap = Collections.singletonMap("new_api", String.valueOf(z));
        singletonMap.getClass();
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, (Double) null, singletonMap, (Map) null, tmpAdObject, (Integer) null, (ByteString) null, (MediationInfo) null, 234, (Object) null);
    }

    public final void showStarted(ye6 ye6Var, String str, Listeners listeners) {
        sx5 sx5Var = (sx5) this.startedCount;
        sx5Var.l(null, Integer.valueOf(((Number) sx5Var.getValue()).intValue() + 1));
        if (((Number) ((sx5) this.startedCount).getValue()).intValue() >= 2) {
            return;
        }
        this.logger.info("Started showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED, Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 236, (Object) null);
        this.safeCallbackInvoke.invoke(new tf3(listeners, str, (byte) 1));
    }

    public static final pn6 showStarted$lambda$6(Listeners listeners, String str) {
        listeners.onStart(str);
        return pn6.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cf, code lost:
    
        if (r3.invoke("placement_not_loaded", r5, r6, null, null, r9) == r13) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fa, code lost:
    
        if (r3.invoke("ad_object_not_found", r5, r6, null, null, r9) == r13) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021d, code lost:
    
        if (r3.invoke("ad_object_expired", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_OBJECT_EXPIRED, null, null, r9) == r13) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0248, code lost:
    
        if (r3.invoke("ad_player_scope_not_active", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r9) == r13) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0268, code lost:
    
        if (r3.invoke("already_showing", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_ALREADY_SHOWING, null, null, r9) == r13) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0296, code lost:
    
        if (r3.invoke("placement_validation", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r9) == r13) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
    
        if (r3.invoke("not_initialized", r5, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r9) == r13) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0184, code lost:
    
        if (r3.invoke("placement_null", r5, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r9) == r13) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ae, code lost:
    
        if (r3.invoke("no_opportunity_id", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_OPPORTUNITY_ID, null, r8, r9) == r13) goto L238;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.String r35, com.unity3d.ads.UnityAdsShowOptions r36, com.unity3d.ads.core.data.model.Listeners r37, defpackage.vz0 r38) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, vz0):java.lang.Object");
    }

    public final void showReceivedReward(ye6 ye6Var, String str, Listeners listeners) {
        ye6Var.getClass();
        str.getClass();
        listeners.getClass();
        this.logger.info("Rewarding ad " + getAdInfoString());
        sx5 sx5Var = (sx5) this.startedCount;
        Integer valueOf = Integer.valueOf(Math.max(((Number) sx5Var.getValue()).intValue(), 2));
        sx5Var.getClass();
        sx5Var.l(null, valueOf);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED, Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 236, (Object) null);
        this.safeCallbackInvoke.invoke(new tf3(listeners, str, (byte) 3));
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
