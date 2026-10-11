package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import defpackage.qx5;
import defpackage.vz0;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, vz0 vz0Var);

    Object destroy(vz0 vz0Var);

    Object evaluateJavascript(HandlerType handlerType, JSONArray jSONArray, vz0 vz0Var);

    qx5 getLastInputEvent();

    WebView getWebView();

    qx5 isRenderProcessGone();

    Object loadUrl(String str, vz0 vz0Var);
}
