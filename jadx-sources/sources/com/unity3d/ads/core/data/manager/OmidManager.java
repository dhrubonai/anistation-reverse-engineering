package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import defpackage.g6;
import defpackage.h6;
import defpackage.hj4;
import defpackage.i6;
import defpackage.jh4;
import defpackage.k21;
import defpackage.kx2;
import defpackage.v5;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface OmidManager {
    void activate(Context context);

    v5 createAdEvents(g6 g6Var);

    g6 createAdSession(h6 h6Var, i6 i6Var);

    h6 createAdSessionConfiguration(k21 k21Var, kx2 kx2Var, jh4 jh4Var, jh4 jh4Var2, boolean z);

    i6 createHtmlAdSessionContext(hj4 hj4Var, WebView webView, String str, String str2);

    i6 createJavaScriptAdSessionContext(hj4 hj4Var, WebView webView, String str, String str2);

    String getVersion();

    boolean isActive();
}
