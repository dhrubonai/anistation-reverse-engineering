package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.banners.UnityBannerSize;
import defpackage.a34;
import defpackage.ai4;
import defpackage.bf6;
import defpackage.j04;
import defpackage.pn6;
import defpackage.q71;
import defpackage.qx1;
import defpackage.sx5;
import defpackage.uz5;
import defpackage.va1;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.ye6;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private InternalLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private final Logger logger;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private ye6 startTime;

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, Logger logger) {
        load.getClass();
        sendDiagnosticEvent.getClass();
        getInitializationState.getClass();
        awaitInitialization.getClass();
        sessionRepository.getClass();
        adRepository.getClass();
        safeCallbackInvoke.getClass();
        cleanUpWhenOpportunityExpires.getClass();
        logger.getClass();
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
        this.logger = logger;
    }

    public static /* synthetic */ pn6 a(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
        return loadFailure$lambda$3(legacyLoadUseCase, failure);
    }

    public static /* synthetic */ pn6 b(LegacyLoadUseCase legacyLoadUseCase, AdObject adObject) {
        return loadSuccess$lambda$2(legacyLoadUseCase, adObject);
    }

    private final String getAdInfoString(String str) {
        return qx1.q(new StringBuilder("for placement "), this.placement, " with instance id ", str);
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data != null && (opt = data.opt(KEY_AD_MARKUP)) != null) {
            return opt.toString();
        }
        return null;
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        if (this.isBanner) {
            return DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER;
        }
        return DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize != null) {
            BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
            AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
            newBuilder.getClass();
            BannerSizeKt.Dsl _create = companion._create(newBuilder);
            _create.setWidth(unityBannerSize.getWidth());
            _create.setHeight(unityBannerSize.getHeight());
            return _create._build();
        }
        return null;
    }

    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String str) {
        if (str != null && !uz5.V(str)) {
            try {
                return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(str, false, 1, null).toByteArray());
            } catch (Exception unused) {
                return null;
            }
        }
        return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object opt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data != null && (opt = data.opt("objectId")) != null) {
            return opt.toString();
        }
        return null;
    }

    private final Map<String, String> getTags(String str, String str2) {
        boolean z = false;
        ai4 ai4Var = new ai4("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        ai4 ai4Var2 = new ai4("operation", OperationType.LOAD.toString());
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions != null) {
            if (unityAdsLoadOptions.loadConfiguration != null) {
                z = true;
            }
            LinkedHashMap U = vn3.U(ai4Var, ai4Var2, new ai4("new_api", String.valueOf(z)));
            if (str != null && str.length() != 0) {
                U.put("reason", str);
            }
            if (str2 != null && str2.length() != 0) {
                U.put("reason_debug", str2);
            }
            return U;
        }
        a34.s0(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        throw null;
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(String str) {
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.Companion;
        UUID fromString = UUID.fromString(str);
        fromString.getClass();
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString);
        String str2 = this.placement;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions != null) {
            return companion.getTmpAdObjectForEventSending(byteString, str2, this.isHeaderBidding, unityAdsLoadOptions, getAdType());
        }
        a34.s0(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        throw null;
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, vz0 vz0Var, int i, Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, vz0Var);
    }

    private final void loadFailure(String str, LoadResult.Failure failure) {
        Double d = null;
        Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(str) + ", error: " + failure.getError() + " :: " + failure.getMessage(), null, 2, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FAILURE_TIME;
        ye6 ye6Var = this.startTime;
        if (ye6Var != null) {
            d = Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var));
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d, getTags(failure.getReason(), failure.getReasonDebug()), (Map) null, getTmpAdObject(str), (Integer) null, failure.getErrorToken(), (MediationInfo) null, 168, (Object) null);
        this.safeCallbackInvoke.invoke(new va1(this, failure, (byte) 18));
    }

    public static final pn6 loadFailure$lambda$3(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
        InternalLoadListener internalLoadListener = legacyLoadUseCase.listener;
        if (internalLoadListener != null) {
            int number = failure.getError().getNumber();
            String message = failure.getMessage();
            if (message == null) {
                message = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
            }
            internalLoadListener.onAdLoadFail(new UnityAdsError(number, message));
        }
        return pn6.a;
    }

    private final ye6 loadStart(String str) {
        long b = j04.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED, (Double) null, getTags$default(this, null, null, 3, null), (Map) null, getTmpAdObject(str), (Integer) null, (ByteString) null, (MediationInfo) null, 234, (Object) null);
        return new bf6(b);
    }

    private final void loadSuccess(AdObject adObject) {
        Double d;
        this.logger.info("Successfully loaded ad " + getAdInfoString(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        ((sx5) adObject.getState()).k(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_SUCCESS_TIME;
        ye6 ye6Var = this.startTime;
        if (ye6Var != null) {
            d = Double.valueOf(TimeExtensionsKt.elapsedMillis(ye6Var));
        } else {
            d = null;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d, getTags$default(this, null, null, 3, null), (Map) null, adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 232, (Object) null);
        this.safeCallbackInvoke.invoke(new va1(this, adObject, (byte) 17));
    }

    public static final pn6 loadSuccess$lambda$2(LegacyLoadUseCase legacyLoadUseCase, AdObject adObject) {
        InternalLoadListener internalLoadListener = legacyLoadUseCase.listener;
        if (internalLoadListener != null) {
            internalLoadListener.onAdLoaded(adObject);
        }
        return pn6.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x00c6, B:15:0x00ca, B:16:0x00df, B:18:0x00e3, B:22:0x00ed, B:24:0x00f1, B:25:0x00f7, B:26:0x00fd), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x00c6, B:15:0x00ca, B:16:0x00df, B:18:0x00e3, B:22:0x00ed, B:24:0x00f1, B:25:0x00f7, B:26:0x00fd), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x00c6, B:15:0x00ca, B:16:0x00df, B:18:0x00e3, B:22:0x00ed, B:24:0x00f1, B:25:0x00f7, B:26:0x00fd), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(android.content.Context r22, java.lang.String r23, com.unity3d.ads.UnityAdsLoadOptions r24, com.unity3d.ads.core.domain.InternalLoadListener r25, com.unity3d.services.banners.UnityBannerSize r26, defpackage.vz0 r27) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke(android.content.Context, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.unity3d.ads.core.domain.InternalLoadListener, com.unity3d.services.banners.UnityBannerSize, vz0):java.lang.Object");
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
