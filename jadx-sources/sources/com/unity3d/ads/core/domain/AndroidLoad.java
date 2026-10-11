package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import defpackage.n11;
import defpackage.tl7;
import defpackage.vz0;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final n11 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final ValidateExtrasSize validateExtrasSize;

    public AndroidLoad(n11 n11Var, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, ValidateExtrasSize validateExtrasSize) {
        n11Var.getClass();
        getAdRequest.getClass();
        getAdPlayerConfigRequest.getClass();
        getRequestPolicy.getClass();
        handleGatewayAdResponse.getClass();
        sessionRepository.getClass();
        gatewayClient.getClass();
        adRepository.getClass();
        sendDiagnosticEvent.getClass();
        validateExtrasSize.getClass();
        this.defaultDispatcher = n11Var;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString byteString, String str, boolean z, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending(byteString, str, z, unityAdsLoadOptions, diagnosticAdType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        ErrorOuterClass.PublicErrorCode publicErrorCode;
        String loadErrorMsg;
        String str;
        ByteString byteString;
        boolean z = unityAdsNetworkException instanceof NetworkTimeoutException;
        if (z) {
            publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
        } else if (unityAdsNetworkException instanceof GatewayException) {
            publicErrorCode = ((GatewayException) unityAdsNetworkException).getErrorCode();
            if (publicErrorCode == null) {
                publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK;
            }
        } else {
            publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        if (z) {
            loadErrorMsg = UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT;
        } else if (unityAdsNetworkException instanceof GatewayException) {
            ErrorOuterClass.PublicErrorCode errorCode = ((GatewayException) unityAdsNetworkException).getErrorCode();
            if (errorCode == null || (loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(errorCode)) == null) {
                loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK);
            }
        } else {
            loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK);
        }
        String str2 = loadErrorMsg;
        if (z) {
            str = "timeout";
        } else {
            str = "gateway";
        }
        String str3 = str;
        String message = unityAdsNetworkException.getMessage();
        if (unityAdsNetworkException instanceof GatewayException) {
            byteString = ((GatewayException) unityAdsNetworkException).getErrorToken();
        } else {
            byteString = null;
        }
        return new LoadResult.Failure(publicErrorCode2, str2, unityAdsNetworkException, str3, message, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z) {
        SessionRepository sessionRepository = this.sessionRepository;
        if (z) {
            sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z) {
        SessionRepository sessionRepository = this.sessionRepository;
        if (z) {
            sessionRepository.incrementBannerLoadRequestCount();
        } else {
            sessionRepository.incrementLoadRequestCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCachePhaseFailure(LoadResult.Failure failure) {
        String reason = failure.getReason();
        int hashCode = reason.hashCode();
        if (hashCode != -1131560769) {
            if (hashCode != -952823001) {
                if (hashCode != -711698443 || !reason.equals("adviewer")) {
                    return false;
                }
                return true;
            }
            if (!reason.equals("invalid_url")) {
                return false;
            }
            return true;
        }
        if (!reason.equals("no_webview_entry_point")) {
            return false;
        }
        return true;
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, vz0 vz0Var) {
        return tl7.V(this.defaultDispatcher, new AndroidLoad$invoke$2(bannerSize, unityAdsLoadOptions, this, headerBiddingAdMarkup, byteString, str, context, null), vz0Var);
    }
}
