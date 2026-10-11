package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.ai4;
import defpackage.vn3;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(SendDiagnosticEvent sendDiagnosticEvent) {
        sendDiagnosticEvent.getClass();
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics
    public void invoke(List<WebViewClientError> list, AdObject adObject) {
        Map map;
        list.getClass();
        adObject.getClass();
        for (WebViewClientError webViewClientError : list) {
            String url = webViewClientError.getUrl();
            if (url != null && url.length() != 0) {
                map = Collections.singletonMap("webview_url", webViewClientError.getUrl());
                map.getClass();
            } else {
                map = null;
            }
            Map map2 = map;
            LinkedHashMap U = vn3.U(new ai4("reason", Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                U.put("webview_error_code", webViewClientError.getStatusCode());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", (Double) null, map2, U, adObject, (Integer) null, (ByteString) null, (MediationInfo) null, 226, (Object) null);
        }
    }
}
