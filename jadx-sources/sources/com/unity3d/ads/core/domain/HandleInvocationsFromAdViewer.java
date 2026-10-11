package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.ai4;
import defpackage.ej2;
import defpackage.q71;
import defpackage.sb2;
import defpackage.sd;
import defpackage.vj1;
import defpackage.vn3;
import defpackage.z05;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ACTION = "action";
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_REFRESH_INVALIDATION_REASON = "invalidationReason";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PAYLOAD = "payload";
    public static final String KEY_PAYLOAD_VERSION = "payloadVersion";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    public static final ExposedFunction invoke$lambda$0(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.m60getAdContextyLuu4LI((AndroidGetAdPlayerContext) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(AndroidGetAdPlayerContext.class)), str, str2, str3, (IsOMActivated) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(IsOMActivated.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$1(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(DeviceInfoRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$10(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(GetOperativeEventApi.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$11() {
        return CommonAdViewerExposedFunctionsKt.writeStorage();
    }

    public static final ExposedFunction invoke$lambda$12() {
        return CommonAdViewerExposedFunctionsKt.readStorage();
    }

    public static final ExposedFunction invoke$lambda$13() {
        return CommonAdViewerExposedFunctionsKt.deleteStorage();
    }

    public static final ExposedFunction invoke$lambda$14() {
        return CommonAdViewerExposedFunctionsKt.clearStorage();
    }

    public static final ExposedFunction invoke$lambda$15() {
        return CommonAdViewerExposedFunctionsKt.getKeysStorage();
    }

    public static final ExposedFunction invoke$lambda$16() {
        return CommonAdViewerExposedFunctionsKt.getStorage();
    }

    public static final ExposedFunction invoke$lambda$17() {
        return CommonAdViewerExposedFunctionsKt.setStorage();
    }

    public static final ExposedFunction invoke$lambda$18(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$19(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$2(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(DeviceInfoRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$20(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$21(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$22(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(DeviceInfoRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$23(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(DeviceInfoRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$24(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$25(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(CampaignRepository.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$26(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(Refresh.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$27(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendAdViewerRequest((SendAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SendAdViewerRequest.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$28(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(CampaignRepository.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$3(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(DeviceInfoRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$30(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SendPrivacyUpdateRequest.class)));
    }

    public static final ExposedFunction invoke$lambda$31(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SendDiagnosticEvent.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$32(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$33(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.download((CacheFile) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(CacheFile.class)), adObject, (SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$34(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.downloadWithProgress((CacheFile) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(CacheFile.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$35(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(GetIsFileCache.class)));
    }

    public static final ExposedFunction invoke$lambda$36(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(AndroidOmInteraction.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$37(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(OmFinishSession.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$38(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(OmImpressionOccurred.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$39(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(GetOmData.class)));
    }

    public static final ExposedFunction invoke$lambda$4(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(DeviceInfoRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$40(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(AndroidAttribution.class)));
    }

    public static final ExposedFunction invoke$lambda$41(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(AndroidAttribution.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$42(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(AndroidAttribution.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$43(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$44(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$45(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$46(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(LoadOfferwallAd.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$47() {
        return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
    }

    public static final ExposedFunction invoke$lambda$48(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(GetIsOfferwallAdReady.class)));
    }

    public static final ExposedFunction invoke$lambda$49(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(ExecuteAdViewerRequest.class)));
    }

    public static final ExposedFunction invoke$lambda$5(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(DeviceInfoRepository.class)));
    }

    public static final ExposedFunction invoke$lambda$50(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(ExecuteAdViewerRequest.class)));
    }

    public static final ExposedFunction invoke$lambda$51(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(ExecuteAdViewerRequest.class)));
    }

    public static final ExposedFunction invoke$lambda$53(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.getExtra((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(SessionRepository.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$6(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.getBlackPixelPercentage((WebViewScreenCapture) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(WebViewScreenCapture.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$7(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.captureScreenshot((WebViewScreenCapture) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(WebViewScreenCapture.class)), adObject);
    }

    public static final ExposedFunction invoke$lambda$8(AdObject adObject, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.openUrl(adObject, (HandleOpenUrl) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", z05.a(HandleOpenUrl.class)));
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final Map<String, sb2> invoke(String str, String str2, String str3, final AdObject adObject) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        adObject.getClass();
        final byte b = 1;
        final byte b2 = 7;
        final byte b3 = 12;
        final byte b4 = 18;
        final byte b5 = 21;
        final byte b6 = 2;
        final byte b7 = 22;
        final byte b8 = 0;
        final byte b9 = 2;
        final byte b10 = 3;
        final byte b11 = 4;
        final byte b12 = 5;
        final byte b13 = 6;
        final byte b14 = 0;
        final byte b15 = 8;
        final byte b16 = 9;
        final byte b17 = 10;
        final byte b18 = 11;
        final byte b19 = 13;
        final byte b20 = 14;
        final byte b21 = 15;
        final byte b22 = 16;
        final byte b23 = 17;
        final byte b24 = 19;
        final byte b25 = 20;
        final byte b26 = 1;
        return vn3.T(new ai4(ExposedFunctionLocation.GET_AD_CONTEXT, new sd(this, AdData.m31constructorimpl(str), ImpressionConfig.m52constructorimpl(str3), AdDataRefreshToken.m38constructorimpl(str2), adObject)), new ai4(ExposedFunctionLocation.GET_CONNECTION_TYPE, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_DEVICE_VOLUME, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b2;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b3;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b4;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_SCREEN_WIDTH, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b5;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_BLACK_PIXEL_PERCENTAGE, new ej2(this, adObject, (byte) 16)), new ai4(ExposedFunctionLocation.CAPTURE_SCREENSHOT, new ej2(this, adObject, (byte) 17)), new ai4(ExposedFunctionLocation.OPEN_URL, new ej2(adObject, this)), new ai4(ExposedFunctionLocation.SET_ORIENTATION, new sb2() { // from class: fj2
            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction updateTrackingToken;
                ExposedFunction opportunityTTL;
                ExposedFunction orientation;
                byte b27 = b6;
                AdObject adObject2 = adObject;
                switch (b27) {
                    case 0:
                        updateTrackingToken = CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject2);
                        return updateTrackingToken;
                    case 1:
                        opportunityTTL = CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject2);
                        return opportunityTTL;
                    default:
                        orientation = CommonAdViewerExposedFunctionsKt.setOrientation(adObject2);
                        return orientation;
                }
            }
        }), new ai4(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new ej2(this, adObject, (byte) 3)), new ai4(ExposedFunctionLocation.STORAGE_WRITE, new vj1((byte) 18)), new ai4(ExposedFunctionLocation.STORAGE_READ, new vj1((byte) 19)), new ai4(ExposedFunctionLocation.STORAGE_DELETE, new vj1((byte) 21)), new ai4(ExposedFunctionLocation.STORAGE_CLEAR, new vj1((byte) 22)), new ai4(ExposedFunctionLocation.STORAGE_GET_KEYS, new vj1((byte) 23)), new ai4(ExposedFunctionLocation.STORAGE_GET, new vj1((byte) 24)), new ai4(ExposedFunctionLocation.STORAGE_SET, new vj1((byte) 25)), new ai4(ExposedFunctionLocation.GET_PRIVACY_FSM, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b7;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.SET_PRIVACY_FSM, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b8;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_PRIVACY, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b9;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.SET_PRIVACY, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b10;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_ALLOWED_PII, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b11;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.SET_ALLOWED_PII, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b12;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_SESSION_TOKEN, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b13;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new ej2(this, adObject, (byte) 0)), new ai4(ExposedFunctionLocation.REFRESH_AD_DATA, new ej2(this, adObject, (byte) 1)), new ai4(ExposedFunctionLocation.SEND_AD_VIEWER_REQUEST, new ej2(this, adObject, (byte) 2)), new ai4(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new ej2(this, adObject, (byte) 4)), new ai4(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new sb2() { // from class: fj2
            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction updateTrackingToken;
                ExposedFunction opportunityTTL;
                ExposedFunction orientation;
                byte b27 = b14;
                AdObject adObject2 = adObject;
                switch (b27) {
                    case 0:
                        updateTrackingToken = CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject2);
                        return updateTrackingToken;
                    case 1:
                        opportunityTTL = CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject2);
                        return opportunityTTL;
                    default:
                        orientation = CommonAdViewerExposedFunctionsKt.setOrientation(adObject2);
                        return orientation;
                }
            }
        }), new ai4(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b15;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new ej2(this, adObject, (byte) 5)), new ai4(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b16;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.DOWNLOAD, new ej2(this, adObject, (byte) 6)), new ai4(ExposedFunctionLocation.DOWNLOAD_WITH_PROGRESS, new ej2(this, adObject, (byte) 7)), new ai4(ExposedFunctionLocation.IS_FILE_CACHED, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b17;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.OM_START_SESSION, new ej2(this, adObject, (byte) 8)), new ai4(ExposedFunctionLocation.OM_FINISH_SESSION, new ej2(this, adObject, (byte) 9)), new ai4(ExposedFunctionLocation.OM_IMPRESSION, new ej2(this, adObject, (byte) 10)), new ai4(ExposedFunctionLocation.OM_GET_DATA, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b18;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b19;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new ej2(this, adObject, (byte) 11)), new ai4(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new ej2(this, adObject, (byte) 12)), new ai4(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new ej2(this, adObject, (byte) 13)), new ai4(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b20;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b21;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new ej2(this, adObject, (byte) 14)), new ai4(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new vj1((byte) 20)), new ai4(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b22;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.REQUEST_GET, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b23;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.REQUEST_POST, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b24;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.REQUEST_HEAD, new sb2(this) { // from class: dj2
            public final /* synthetic */ HandleInvocationsFromAdViewer y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$23;
                ExposedFunction invoke$lambda$24;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$30;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$35;
                ExposedFunction invoke$lambda$39;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$40;
                ExposedFunction invoke$lambda$44;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$49;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$50;
                ExposedFunction invoke$lambda$51;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$18;
                byte b27 = b25;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
                switch (b27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23(handleInvocationsFromAdViewer);
                        return invoke$lambda$23;
                    case 6:
                        invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24(handleInvocationsFromAdViewer);
                        return invoke$lambda$24;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$30 = HandleInvocationsFromAdViewer.invoke$lambda$30(handleInvocationsFromAdViewer);
                        return invoke$lambda$30;
                    case 9:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 10:
                        invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35(handleInvocationsFromAdViewer);
                        return invoke$lambda$35;
                    case 11:
                        invoke$lambda$39 = HandleInvocationsFromAdViewer.invoke$lambda$39(handleInvocationsFromAdViewer);
                        return invoke$lambda$39;
                    case 12:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 13:
                        invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40(handleInvocationsFromAdViewer);
                        return invoke$lambda$40;
                    case 14:
                        invoke$lambda$44 = HandleInvocationsFromAdViewer.invoke$lambda$44(handleInvocationsFromAdViewer);
                        return invoke$lambda$44;
                    case 15:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 16:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 17:
                        invoke$lambda$49 = HandleInvocationsFromAdViewer.invoke$lambda$49(handleInvocationsFromAdViewer);
                        return invoke$lambda$49;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$50 = HandleInvocationsFromAdViewer.invoke$lambda$50(handleInvocationsFromAdViewer);
                        return invoke$lambda$50;
                    case 20:
                        invoke$lambda$51 = HandleInvocationsFromAdViewer.invoke$lambda$51(handleInvocationsFromAdViewer);
                        return invoke$lambda$51;
                    case 21:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new ai4(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new sb2() { // from class: fj2
            @Override // defpackage.sb2
            public final Object invoke() {
                ExposedFunction updateTrackingToken;
                ExposedFunction opportunityTTL;
                ExposedFunction orientation;
                byte b27 = b26;
                AdObject adObject2 = adObject;
                switch (b27) {
                    case 0:
                        updateTrackingToken = CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject2);
                        return updateTrackingToken;
                    case 1:
                        opportunityTTL = CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject2);
                        return opportunityTTL;
                    default:
                        orientation = CommonAdViewerExposedFunctionsKt.setOrientation(adObject2);
                        return orientation;
                }
            }
        }), new ai4(ExposedFunctionLocation.GET_EXTRA, new ej2(this, adObject, (byte) 15)));
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
