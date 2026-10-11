package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import defpackage.fn5;
import defpackage.sb2;
import defpackage.vz0;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface WebViewBridge {
    Map<String, sb2> getExposedFunctions();

    fn5 getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, vz0 vz0Var);

    Object sendEvent(WebViewEvent webViewEvent, vz0 vz0Var);

    void setExposedFunctions(Map<String, ? extends sb2> map);
}
