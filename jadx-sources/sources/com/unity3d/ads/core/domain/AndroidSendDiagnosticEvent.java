package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import defpackage.uz5;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final LifecycleDataSource lifecycleDataSource;
    private final MediationRepository mediationRepository;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest, LifecycleDataSource lifecycleDataSource, MediationRepository mediationRepository) {
        diagnosticEventRepository.getClass();
        getDiagnosticEventRequest.getClass();
        lifecycleDataSource.getClass();
        mediationRepository.getClass();
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.lifecycleDataSource = lifecycleDataSource;
        this.mediationRepository = mediationRepository;
    }

    private final void sendEvent(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString, MediationInfo mediationInfo) {
        Boolean bool;
        ByteString byteString2;
        String str2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
        LinkedHashMap linkedHashMap;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        MediationInfo mediationInfo2;
        String name;
        String version;
        String adapterVersion;
        UnityAdsLoadOptions loadOptions;
        LoadConfigurationInternal loadConfigurationInternal;
        String str3 = null;
        if (adObject != null) {
            bool = Boolean.valueOf(adObject.isHeaderBidding());
        } else {
            bool = null;
        }
        if (adObject != null) {
            byteString2 = adObject.getOpportunityId();
        } else {
            byteString2 = null;
        }
        if (adObject != null) {
            str2 = adObject.getPlacementId();
        } else {
            str2 = null;
        }
        if (adObject != null) {
            diagnosticAdType = adObject.getAdType();
        } else {
            diagnosticAdType = null;
        }
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if (adObject != null && adObject.isOfferwallAd()) {
            linkedHashMap2.put("offerwall", AndroidGetIsModulesInitEnabled.ENABLE_MODULES_INIT_VALUE);
        }
        if (adObject != null) {
            webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
        } else {
            webViewLessLoadingRequiredData = null;
        }
        if (webViewLessLoadingRequiredData != null) {
            linkedHashMap2.put("webviewless", AndroidGetIsModulesInitEnabled.ENABLE_MODULES_INIT_VALUE);
        }
        linkedHashMap2.put("app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
        if (mediationInfo == null) {
            if (adObject != null && (loadOptions = adObject.getLoadOptions()) != null && (loadConfigurationInternal = loadOptions.loadConfiguration) != null) {
                mediationInfo2 = loadConfigurationInternal.getMediationInfo();
            } else {
                mediationInfo2 = null;
            }
        } else {
            mediationInfo2 = mediationInfo;
        }
        if (mediationInfo2 == null || (name = mediationInfo2.getName()) == null) {
            name = this.mediationRepository.getName();
        }
        if (name != null) {
            if (uz5.V(name)) {
                name = null;
            }
            if (name != null) {
            }
        }
        if (mediationInfo2 == null || (version = mediationInfo2.getVersion()) == null) {
            version = this.mediationRepository.getVersion();
        }
        if (version != null) {
            if (uz5.V(version)) {
                version = null;
            }
            if (version != null) {
            }
        }
        if (mediationInfo2 == null || (adapterVersion = mediationInfo2.getAdapterVersion()) == null) {
            adapterVersion = this.mediationRepository.getAdapterVersion();
        }
        if (adapterVersion != null) {
            if (!uz5.V(adapterVersion)) {
                str3 = adapterVersion;
            }
            if (str3 != null) {
                linkedHashMap2.put("mediation_adapter_version", str3);
            }
        }
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(diagnosticEventType, str, linkedHashMap2, map2, d, bool, byteString2, str2, diagnosticAdType, num, byteString));
    }

    public static /* synthetic */ void sendEvent$default(AndroidSendDiagnosticEvent androidSendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, String str, Double d, Map map, Map map2, AdObject adObject, Integer num, ByteString byteString, MediationInfo mediationInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 256) != 0) {
            mediationInfo = null;
        }
        androidSendDiagnosticEvent.sendEvent(diagnosticEventType, str, d, map, map2, adObject, num, byteString, mediationInfo);
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString, MediationInfo mediationInfo) {
        diagnosticEventType.getClass();
        sendEvent$default(this, diagnosticEventType, null, d, map, map2, adObject, num, byteString, mediationInfo, 2, null);
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(String str, Double d, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num, ByteString byteString, MediationInfo mediationInfo) {
        str.getClass();
        sendEvent(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM, str, d, map, map2, adObject, num, byteString, mediationInfo);
    }
}
