package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.log.Logger;
import defpackage.n11;
import defpackage.q71;
import defpackage.rh1;
import defpackage.v11;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final n11 dispatcher;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(n11 n11Var, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        n11Var.getClass();
        sendDiagnosticEvent.getClass();
        logger.getClass();
        this.dispatcher = n11Var;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(WebViewContainer webViewContainer, v11 v11Var) {
        webViewContainer.getClass();
        v11Var.getClass();
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, v11Var, this.sendDiagnosticEvent, this.logger);
    }

    public CommonGetWebViewBridgeUseCase(n11 n11Var, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, int i, q71 q71Var) {
        this((i & 1) != 0 ? rh1.a : n11Var, sendDiagnosticEvent, logger);
    }
}
