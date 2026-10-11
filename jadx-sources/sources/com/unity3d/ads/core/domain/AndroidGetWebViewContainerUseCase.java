package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.n11;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final Context context;
    private final n11 defaultDispatcher;
    private final GetCachedAsset getCachedAsset;
    private final n11 mainDispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    public AndroidGetWebViewContainerUseCase(Context context, GetCachedAsset getCachedAsset, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, n11 n11Var, n11 n11Var2, SendDiagnosticEvent sendDiagnosticEvent) {
        context.getClass();
        getCachedAsset.getClass();
        sendWebViewClientErrorDiagnostics.getClass();
        n11Var.getClass();
        n11Var2.getClass();
        sendDiagnosticEvent.getClass();
        this.context = context;
        this.getCachedAsset = getCachedAsset;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = n11Var;
        this.defaultDispatcher = n11Var2;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    public Object invoke(v11 v11Var, AdObject adObject, vz0 vz0Var) {
        return tl7.V(this.mainDispatcher, new AndroidGetWebViewContainerUseCase$invoke$2(this, new AndroidWebViewClient(this.getCachedAsset, this.sendDiagnosticEvent), v11Var, adObject, null), vz0Var);
    }
}
