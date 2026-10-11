package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayRecovererFactory;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.datasource.CurrentActivityDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import defpackage.n11;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final AdRepository adRepository;
    private final Context context;
    private final CurrentActivityDataSource currentActivityDataSource;
    private final n11 defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final DisplayRecovererFactory displayRecovererFactory;
    private final LifecycleDataSource lifecycleDataSource;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final OrientationRepository orientationRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, n11 n11Var, OpenMeasurementRepository openMeasurementRepository, OfferwallManager offerwallManager, AdRepository adRepository, LifecycleDataSource lifecycleDataSource, OrientationRepository orientationRepository, Context context, DisplayRecovererFactory displayRecovererFactory, CurrentActivityDataSource currentActivityDataSource) {
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        sendDiagnosticEvent.getClass();
        n11Var.getClass();
        openMeasurementRepository.getClass();
        offerwallManager.getClass();
        adRepository.getClass();
        lifecycleDataSource.getClass();
        orientationRepository.getClass();
        context.getClass();
        displayRecovererFactory.getClass();
        currentActivityDataSource.getClass();
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = n11Var;
        this.openMeasurementRepository = openMeasurementRepository;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.displayRecovererFactory = displayRecovererFactory;
        this.currentActivityDataSource = currentActivityDataSource;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public AdPlayer invoke(WebViewBridge webViewBridge, WebViewContainer webViewContainer, AdObject adObject, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
        webViewBridge.getClass();
        webViewContainer.getClass();
        adObject.getClass();
        diagnosticAdType.getClass();
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webViewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, webViewContainer, adObject.getAdScope());
        if (diagnosticAdType == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN) {
            String uuid = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
            uuid.getClass();
            return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, uuid, webViewContainer, this.deviceInfoRepository, this.sessionRepository, this.openMeasurementRepository, this.offerwallManager, this.sendDiagnosticEvent, this.adRepository, this.orientationRepository, this.context, this.currentActivityDataSource, this.displayRecovererFactory);
        }
        String uuid2 = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
        uuid2.getClass();
        return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, uuid2, webViewContainer, this.openMeasurementRepository, this.lifecycleDataSource, this.context);
    }
}
