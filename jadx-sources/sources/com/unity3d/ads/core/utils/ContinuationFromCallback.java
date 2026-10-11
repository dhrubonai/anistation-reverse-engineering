package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import defpackage.vz0;
import defpackage.y45;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final vz0 continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(vz0 vz0Var) {
        super("", 0);
        vz0Var.getClass();
        this.continuation = vz0Var;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r4, Object... objArr) {
        objArr.getClass();
        this.continuation.resumeWith(new y45(new ExposureException("Invocation failed with: " + r4, objArr)));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... objArr) {
        objArr.getClass();
        this.continuation.resumeWith(objArr);
    }
}
