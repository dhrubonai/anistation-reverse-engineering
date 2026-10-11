package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdRefreshState;
import com.unity3d.ads.core.data.model.AdRefreshStateKt;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendAdViewerRequest;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.WebViewScreenCapture;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.a34;
import defpackage.ai4;
import defpackage.an3;
import defpackage.fq1;
import defpackage.fx0;
import defpackage.it1;
import defpackage.jq1;
import defpackage.l44;
import defpackage.m18;
import defpackage.ms;
import defpackage.ni5;
import defpackage.pj0;
import defpackage.pn6;
import defpackage.qx1;
import defpackage.sx5;
import defpackage.t85;
import defpackage.ta0;
import defpackage.vn3;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w65;
import defpackage.wc7;
import defpackage.wi5;
import defpackage.x44;
import defpackage.ze0;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt {
    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        androidAttribution.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterClick$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                AndroidAttribution androidAttribution2 = AndroidAttribution.this;
                Object obj = objArr[0];
                obj.getClass();
                return androidAttribution2.registerClick((String) obj, adObject, vz0Var);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        androidAttribution.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$attributionRegisterView$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                AndroidAttribution androidAttribution2 = AndroidAttribution.this;
                Object obj = objArr[0];
                obj.getClass();
                return androidAttribution2.registerView((String) obj, adObject, vz0Var);
            }
        };
    }

    public static final ExposedFunction captureScreenshot(final WebViewScreenCapture webViewScreenCapture, final AdObject adObject) {
        webViewScreenCapture.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$captureScreenshot$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                Integer intArg;
                int i;
                Number numberArg;
                double d;
                intArg = CommonAdViewerExposedFunctionsKt.intArg(objArr, 0, "quality");
                if (intArg != null) {
                    i = intArg.intValue();
                } else {
                    i = 50;
                }
                int i2 = i;
                numberArg = CommonAdViewerExposedFunctionsKt.numberArg(objArr, 1, "samplingRate");
                if (numberArg != null) {
                    d = numberArg.doubleValue();
                } else {
                    d = 1.0d;
                }
                if (i2 >= 0 && i2 < 101) {
                    if (d > 0.0d && d <= 1.0d) {
                        return WebViewScreenCapture.this.captureScreenshot(adObject, i2, d, vz0Var);
                    }
                    throw new IllegalArgumentException(("samplingRate must be in (0, 1], was " + d).toString());
                }
                ze0.e(qx1.h(i2, "quality must be in 0..100, was "));
                return null;
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$clearStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
                Object obj = objArr[0];
                obj.getClass();
                Storage.clear((String) obj, new ContinuationFromCallback(t85Var));
                return t85Var.b();
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$deleteStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
                Object obj = objArr[0];
                obj.getClass();
                Object obj2 = objArr[1];
                obj2.getClass();
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(t85Var));
                return t85Var.b();
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject, SessionRepository sessionRepository) {
        cacheFile.getClass();
        adObject.getClass();
        sessionRepository.getClass();
        return new CommonAdViewerExposedFunctionsKt$download$1(sessionRepository, cacheFile, adObject);
    }

    public static final ExposedFunction downloadWithProgress(final CacheFile cacheFile, final AdObject adObject) {
        cacheFile.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                Number number;
                Object obj = objArr[0];
                obj.getClass();
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("url");
                JSONArray jSONArray = (JSONArray) ms.M0(objArr, 2);
                int optInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                Object M0 = ms.M0(objArr, 1);
                if (M0 instanceof Number) {
                    number = (Number) M0;
                } else {
                    number = null;
                }
                if (number != null) {
                    int intValue = number.intValue();
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    return new ai4(vn3.T(new ai4("url", string), new ai4("downloadId", uuid)), new pj0(new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(CacheFile.this, string, adObject, jSONArray, optInt, intValue, uuid, null), it1.x, -2, ta0.x, (byte) 0));
                }
                ze0.m("intervalMs is required");
                return null;
            }
        };
    }

    /* renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m60getAdContextyLuu4LI(final AndroidGetAdPlayerContext androidGetAdPlayerContext, final String str, final String str2, final String str3, final IsOMActivated isOMActivated, final AdObject adObject) {
        androidGetAdPlayerContext.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        isOMActivated.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAdContext$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                AdRefreshState adRefreshState;
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                AndroidGetAdPlayerContext androidGetAdPlayerContext2 = androidGetAdPlayerContext;
                AdObject adObject2 = adObject;
                IsOMActivated isOMActivated2 = isOMActivated;
                an3 an3Var = new an3();
                an3Var.put(HandleInvocationsFromAdViewer.KEY_AD_DATA, str4);
                an3Var.put(HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, str5);
                an3Var.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, str6);
                an3Var.put(HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT, androidGetAdPlayerContext2.invoke());
                an3Var.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject2.getTrackingToken(), false, 1, null));
                JSONObject data = adObject2.getLoadOptions().getData();
                if (data != null && data.length() != 0) {
                    Iterator<String> keys = data.keys();
                    keys.getClass();
                    ni5 o0 = wi5.o0(keys);
                    JSONObject jSONObject = new JSONObject();
                    Iterator it = ((fx0) o0).iterator();
                    while (it.hasNext()) {
                        String str7 = (String) it.next();
                        if (!a34.i(str7, LegacyLoadUseCase.KEY_AD_MARKUP) && !a34.i(str7, "objectId")) {
                            jSONObject = jSONObject.put(str7, data.get(str7));
                            jSONObject.getClass();
                        }
                    }
                    an3Var.put(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject);
                }
                if (isOMActivated2.invoke()) {
                    an3Var.put(HandleInvocationsFromAdViewer.KEY_OMID, vn3.T(new ai4(HandleInvocationsFromAdViewer.KEY_OMJS_SESSION, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SESSION), new ai4(HandleInvocationsFromAdViewer.KEY_OMJS_SERVICE, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SERVICE)));
                }
                an3Var.put(HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, Boolean.valueOf(adObject2.isHeaderBidding()));
                String uuid = ProtobufExtensionsKt.toUUID(adObject2.getOpportunityId()).toString();
                uuid.getClass();
                an3Var.put("impressionOpportunityId", uuid);
                AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = adObject2.getWebViewLessLoadingRequiredData();
                if (webViewLessLoadingRequiredData != null && (adRefreshState = webViewLessLoadingRequiredData.getAdRefreshState()) != null) {
                    an3Var.put(HandleInvocationsFromAdViewer.KEY_AD_REFRESH_INVALIDATION_REASON, AdRefreshStateKt.getInvalidationReason(adRefreshState));
                }
                return an3Var.b();
            }
        };
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        deviceInfoRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getAllowedPii$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return Base64.encodeToString(((AllowedPiiOuterClass.AllowedPii) ((sx5) DeviceInfoRepository.this.getAllowedPii()).getValue()).toByteArray(), 2);
            }
        };
    }

    public static final ExposedFunction getBlackPixelPercentage(final WebViewScreenCapture webViewScreenCapture, final AdObject adObject) {
        webViewScreenCapture.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getBlackPixelPercentage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                Integer intArg;
                int i;
                intArg = CommonAdViewerExposedFunctionsKt.intArg(objArr, 0, "threshold");
                if (intArg != null) {
                    i = intArg.intValue();
                } else {
                    i = 10;
                }
                if (i >= 0 && i < 256) {
                    return WebViewScreenCapture.this.getBlackPixelPercentage(adObject, i, vz0Var);
                }
                ze0.e(qx1.h(i, "threshold must be in 0..255, was "));
                return null;
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        deviceInfoRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getConnectionType$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return DeviceInfoRepository.this.getConnectionType();
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        deviceInfoRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceMaxVolume$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return new Double(DeviceInfoRepository.this.getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        deviceInfoRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getDeviceVolume$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return new Double(DeviceInfoRepository.this.getVolume());
            }
        };
    }

    public static final ExposedFunction getExtra(final SessionRepository sessionRepository, final AdObject adObject) {
        sessionRepository.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getExtra$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                InitializationConfigurationInternal initializationConfiguration;
                Map<String, String> extras;
                LoadConfiguration loadConfiguration;
                Map<String, String> extras2;
                ShowConfiguration showConfiguration;
                Map<String, String> extras3;
                Object obj = objArr[0];
                obj.getClass();
                String str = (String) obj;
                Object obj2 = objArr[1];
                obj2.getClass();
                String str2 = (String) obj2;
                int hashCode = str.hashCode();
                if (hashCode != 3237136) {
                    if (hashCode != 3327206) {
                        if (hashCode != 3529469 || !str.equals("show") || (showConfiguration = adObject.getShowConfiguration()) == null || (extras3 = showConfiguration.getExtras()) == null) {
                            return null;
                        }
                        return extras3.get(str2);
                    }
                    if (!str.equals("load") || (loadConfiguration = adObject.getLoadConfiguration()) == null || (extras2 = loadConfiguration.getExtras()) == null) {
                        return null;
                    }
                    return extras2.get(str2);
                }
                if (!str.equals("init") || (initializationConfiguration = SessionRepository.this.getInitializationConfiguration()) == null || (extras = initializationConfiguration.getExtras()) == null) {
                    return null;
                }
                return extras.get(str2);
                return null;
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getKeysStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
                Object obj = objArr[0];
                obj.getClass();
                Object obj2 = objArr[1];
                obj2.getClass();
                Object obj3 = objArr[2];
                obj3.getClass();
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(t85Var));
                return t85Var.b();
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        return new CommonAdViewerExposedFunctionsKt$getPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        return new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        deviceInfoRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenHeight$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return new Integer(DeviceInfoRepository.this.getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        deviceInfoRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getScreenWidth$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return new Integer(DeviceInfoRepository.this.getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        sessionRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getSessionToken$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return ProtobufExtensionsKt.toBase64$default(SessionRepository.this.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
                Object obj = objArr[0];
                obj.getClass();
                Object obj2 = objArr[1];
                obj2.getClass();
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(t85Var));
                return t85Var.b();
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        sessionRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementStarts$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                SessionRepository.this.incrementTokenStartsCount();
                return pn6.a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository, final AdObject adObject) {
        sessionRepository.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenIncrementWins$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                if (AdObject.this.getWebViewLessLoadingRequiredData() == null) {
                    sessionRepository.incrementTokenWinsCount();
                }
                return pn6.a;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        sessionRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$hbTokenReset$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                SessionRepository.this.resetTokenCounters();
                return pn6.a;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        sessionRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$incrementBannerImpressionCount$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                SessionRepository.this.incrementBannerImpressionCount();
                return pn6.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer intArg(Object[] objArr, int i, String str) {
        Number numberArg = numberArg(objArr, i, str);
        if (numberArg == null) {
            return null;
        }
        double doubleValue = numberArg.doubleValue();
        if (doubleValue % 1.0d == 0.0d && -2.147483648E9d <= doubleValue && doubleValue <= 2.147483647E9d) {
            return Integer.valueOf((int) doubleValue);
        }
        throw new IllegalArgumentException((str + " must be an integer, was " + numberArg).toString());
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        androidAttribution.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isAttributionAvailable$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return AndroidAttribution.this.isAvailable(vz0Var);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIsFileCache) {
        getIsFileCache.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isFileCached$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                Object obj = objArr[0];
                obj.getClass();
                return GetIsFileCache.this.invoke((String) obj, vz0Var);
            }
        };
    }

    public static final ExposedFunction isOfferwallAdReady(final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        getIsOfferwallAdReady.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$isOfferwallAdReady$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                Object obj = objArr[0];
                obj.getClass();
                String optString = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_PLACEMENT_NAME);
                GetIsOfferwallAdReady getIsOfferwallAdReady2 = GetIsOfferwallAdReady.this;
                optString.getClass();
                return getIsOfferwallAdReady2.invoke(optString, vz0Var);
            }
        };
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        loadOfferwallAd.getClass();
        adObject.getClass();
        return new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        campaignRepository.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$markCampaignStateShown$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                CampaignRepository.this.setShowTimestamp(adObject.getOpportunityId());
                return pn6.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Number numberArg(Object[] objArr, int i, String str) {
        Object M0 = ms.M0(objArr, i);
        Number number = null;
        if (M0 == null) {
            return null;
        }
        if (M0 instanceof Number) {
            number = (Number) M0;
        }
        if (number != null) {
            return number;
        }
        throw new IllegalArgumentException(str + " must be a number, was " + M0);
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        omFinishSession.getClass();
        adObject.getClass();
        return new CommonAdViewerExposedFunctionsKt$omFinishSession$1(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        getOmData.getClass();
        return new CommonAdViewerExposedFunctionsKt$omGetData$1(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        omImpressionOccurred.getClass();
        adObject.getClass();
        return new CommonAdViewerExposedFunctionsKt$omImpression$1(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmInteraction androidOmInteraction, AdObject adObject) {
        androidOmInteraction.getClass();
        adObject.getClass();
        return new CommonAdViewerExposedFunctionsKt$omStartSession$1(androidOmInteraction, adObject);
    }

    public static final ExposedFunction openUrl(final AdObject adObject, final HandleOpenUrl handleOpenUrl) {
        adObject.getClass();
        handleOpenUrl.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$openUrl$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                JSONObject jSONObject;
                String str;
                String str2;
                JSONObject jSONObject2;
                Map<String, ? extends Object> map;
                boolean z = false;
                Object obj = objArr[0];
                obj.getClass();
                String str3 = (String) obj;
                Object M0 = ms.M0(objArr, 1);
                if (M0 instanceof JSONObject) {
                    jSONObject = (JSONObject) M0;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    str = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                } else {
                    str = null;
                }
                if (jSONObject != null) {
                    str2 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_ACTION, "android.intent.action.VIEW");
                } else {
                    str2 = null;
                }
                if (jSONObject != null) {
                    jSONObject2 = jSONObject.optJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS);
                } else {
                    jSONObject2 = null;
                }
                if (jSONObject != null) {
                    z = jSONObject.optBoolean(HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT);
                }
                boolean z2 = z;
                HandleOpenUrl handleOpenUrl2 = HandleOpenUrl.this;
                AdObject adObject2 = adObject;
                if (jSONObject2 != null) {
                    map = JSONObjectExtensionsKt.toBuiltInMap(jSONObject2);
                } else {
                    map = null;
                }
                return handleOpenUrl2.invoke(adObject2, str3, str, str2, map, z2, vz0Var);
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$readStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
                Object obj = objArr[0];
                obj.getClass();
                Storage.read((String) obj, new ContinuationFromCallback(t85Var));
                return t85Var.b();
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        refresh.getClass();
        adObject.getClass();
        return new CommonAdViewerExposedFunctionsKt$refreshAdData$1(refresh, adObject);
    }

    public static final ExposedFunction request(RequestType requestType, ExecuteAdViewerRequest executeAdViewerRequest) {
        requestType.getClass();
        executeAdViewerRequest.getClass();
        return new CommonAdViewerExposedFunctionsKt$request$1(executeAdViewerRequest, requestType);
    }

    public static final ExposedFunction sendAdViewerRequest(SendAdViewerRequest sendAdViewerRequest, AdObject adObject) {
        sendAdViewerRequest.getClass();
        adObject.getClass();
        return new CommonAdViewerExposedFunctionsKt$sendAdViewerRequest$1(sendAdViewerRequest, adObject);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        sendDiagnosticEvent.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendDiagnosticEvent$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                Double d;
                String obj;
                Object obj2 = objArr[0];
                obj2.getClass();
                String str = (String) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                JSONObject jSONObject = (JSONObject) obj3;
                an3 an3Var = new an3();
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                while (keys.hasNext()) {
                    String next = keys.next();
                    an3Var.put(next, jSONObject.getString(next));
                }
                an3 b = an3Var.b();
                Object M0 = ms.M0(objArr, 2);
                if (M0 != null && (obj = M0.toString()) != null) {
                    d = new Double(Double.parseDouble(obj));
                } else {
                    d = null;
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(SendDiagnosticEvent.this, str, d, b, (Map) null, adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 232, (Object) null);
                return pn6.a;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        getOperativeEventApi.getClass();
        adObject.getClass();
        return new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        sendPrivacyUpdateRequest.getClass();
        return new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        deviceInfoRepository.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                sx5 sx5Var;
                Object value;
                final AllowedPiiKt.Dsl _create;
                Boolean bool;
                Boolean bool2;
                Object obj = objArr[0];
                obj.getClass();
                JSONObject jSONObject = (JSONObject) obj;
                x44 allowedPii = DeviceInfoRepository.this.getAllowedPii();
                do {
                    sx5Var = (sx5) allowedPii;
                    value = sx5Var.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = ((AllowedPiiOuterClass.AllowedPii) value).toBuilder();
                    builder.getClass();
                    _create = companion._create(builder);
                    Object opt = jSONObject.opt("idfa");
                    Boolean bool3 = null;
                    if (opt instanceof Boolean) {
                        bool = (Boolean) opt;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        new l44(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // defpackage.t73
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // defpackage.k44
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool);
                    }
                    Object opt2 = jSONObject.opt("idfv");
                    if (opt2 instanceof Boolean) {
                        bool2 = (Boolean) opt2;
                    } else {
                        bool2 = null;
                    }
                    if (bool2 != null) {
                        new l44(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // defpackage.t73
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // defpackage.k44
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool2);
                    }
                    Object opt3 = jSONObject.opt("appset_id");
                    if (opt3 instanceof Boolean) {
                        bool3 = (Boolean) opt3;
                    }
                    if (bool3 != null) {
                        new l44(_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // defpackage.t73
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // defpackage.k44
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setAppsetId(((Boolean) obj2).booleanValue());
                            }
                        }.set(bool3);
                    }
                } while (!sx5Var.j(value, _create._build()));
                return pn6.a;
            }
        };
    }

    public static final ExposedFunction setOpportunityTTL(final AdObject adObject) {
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOpportunityTTL$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                Object obj = objArr[0];
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                x44 ttl = AdObject.this.getTtl();
                m18 m18Var = fq1.y;
                fq1 fq1Var = new fq1(w65.V(intValue, jq1.SECONDS));
                sx5 sx5Var = (sx5) ttl;
                sx5Var.getClass();
                sx5Var.l(null, fq1Var);
                return pn6.a;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        adObject.getClass();
        return new CommonAdViewerExposedFunctionsKt$setOrientation$1(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        return new CommonAdViewerExposedFunctionsKt$setPrivacy$1(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        return new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
                Object obj = objArr[0];
                obj.getClass();
                Object obj2 = objArr[1];
                obj2.getClass();
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(t85Var));
                return t85Var.b();
            }
        };
    }

    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$showOfferwallAd$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                return pn6.a;
            }
        };
    }

    public static final ExposedFunction updateCampaignState(final CampaignRepository campaignRepository, final AdObject adObject) {
        campaignRepository.getClass();
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateCampaignState$1
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
            
                if (r0 != null) goto L25;
             */
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object[] r6, defpackage.vz0 r7) {
                /*
                    r5 = this;
                    java.lang.Object r6 = defpackage.ms.J0(r6)
                    boolean r7 = r6 instanceof org.json.JSONObject
                    r0 = 0
                    if (r7 == 0) goto Lc
                    org.json.JSONObject r6 = (org.json.JSONObject) r6
                    goto Ld
                Lc:
                    r6 = r0
                Ld:
                    if (r6 == 0) goto L9e
                    java.lang.String r7 = "data"
                    java.lang.String r7 = r6.optString(r7)
                    r1 = 1
                    r2 = 0
                    if (r7 == 0) goto L22
                    boolean r3 = defpackage.uz5.V(r7)
                    if (r3 == 0) goto L20
                    goto L22
                L20:
                    r3 = r2
                    goto L23
                L22:
                    r3 = r1
                L23:
                    if (r3 != 0) goto L98
                    java.lang.String r3 = "dataVersion"
                    int r6 = r6.optInt(r3)
                    if (r6 == 0) goto L92
                    com.unity3d.ads.core.data.model.AdObject r3 = com.unity3d.ads.core.data.model.AdObject.this
                    com.google.protobuf.ByteString r3 = r3.getOpportunityId()
                    com.unity3d.ads.core.data.model.AdObject r4 = com.unity3d.ads.core.data.model.AdObject.this
                    java.lang.String r4 = r4.getPlacementId()
                    com.google.protobuf.ByteString r7 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r7, r2, r1, r0)
                    boolean r1 = r7.isEmpty()
                    if (r1 != 0) goto L8c
                    com.unity3d.ads.core.data.repository.CampaignRepository r0 = r2
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0.getCampaign(r3)
                    if (r0 == 0) goto L67
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r1 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                    com.google.protobuf.GeneratedMessageLite$Builder r0 = r0.toBuilder()
                    r0.getClass()
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r0 = (gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder) r0
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r1._create(r0)
                    r0.setData(r7)
                    r0.setDataVersion(r6)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                    if (r0 == 0) goto L67
                    goto L84
                L67:
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r0 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r1 = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder()
                    r1.getClass()
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r0._create(r1)
                    r0.setData(r7)
                    r0.setDataVersion(r6)
                    r0.setPlacementId(r4)
                    r0.setImpressionOpportunityId(r3)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                L84:
                    com.unity3d.ads.core.data.repository.CampaignRepository r5 = r2
                    r5.setCampaign(r3, r0)
                    pn6 r5 = defpackage.pn6.a
                    return r5
                L8c:
                    java.lang.String r5 = "Update campaign state requires a non-empty data byte string"
                    defpackage.ze0.k(r5)
                    return r0
                L92:
                    java.lang.String r5 = "Update campaign state requires a dataVersion integer"
                    defpackage.ze0.k(r5)
                    return r0
                L98:
                    java.lang.String r5 = "Update campaign state requires a data string"
                    defpackage.ze0.k(r5)
                    return r0
                L9e:
                    java.lang.String r5 = "Update campaign state requires a JSONObject"
                    defpackage.ze0.k(r5)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateCampaignState$1.invoke(java.lang.Object[], vz0):java.lang.Object");
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        adObject.getClass();
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$updateTrackingToken$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                Object obj = objArr[0];
                obj.getClass();
                String optString = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (optString != null && optString.length() != 0) {
                    AdObject.this.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(optString, false, 1, null));
                }
                return pn6.a;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$writeStorage$1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, defpackage.ic2
            public final Object invoke(Object[] objArr, vz0 vz0Var) {
                t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
                Object obj = objArr[0];
                obj.getClass();
                Storage.write((String) obj, new ContinuationFromCallback(t85Var));
                return t85Var.b();
            }
        };
    }
}
