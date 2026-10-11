package com.unity3d.ads.adplayer;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.domain.ISDKDispatchers;
import defpackage.gg3;
import defpackage.ic2;
import defpackage.m37;
import defpackage.oi4;
import defpackage.pn6;
import defpackage.t36;
import defpackage.tl7;
import defpackage.vz0;
import defpackage.w51;
import defpackage.y45;
import defpackage.z45;
import defpackage.ze0;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3", f = "FullScreenWebViewDisplay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 extends t36 implements ic2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(FullScreenWebViewDisplay fullScreenWebViewDisplay, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3 = new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this.this$0, vz0Var);
        fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3.L$0 = obj;
        return fullScreenWebViewDisplay$listenToAdPlayerEvents$2$3;
    }

    @Override // defpackage.ic2
    public final Object invoke(DisplayMessage displayMessage, vz0 vz0Var) {
        return ((FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3) create(displayMessage, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object y45Var;
        ISDKDispatchers dispatchers;
        AdObject adObject;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        SendDiagnosticEvent sendDiagnosticEvent;
        pn6 pn6Var = pn6.a;
        if (this.label == 0) {
            m37.N(obj);
            DisplayMessage displayMessage = (DisplayMessage) this.L$0;
            FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
            try {
                if (displayMessage instanceof DisplayMessage.DisplayFinishRequest) {
                    fullScreenWebViewDisplay.finishBySdk();
                } else if (displayMessage instanceof DisplayMessage.WebViewInstanceResponse) {
                    fullScreenWebViewDisplay.loadWebView(((DisplayMessage.WebViewInstanceResponse) displayMessage).getWebView());
                } else if (displayMessage instanceof DisplayMessage.SetOrientation) {
                    fullScreenWebViewDisplay.setRequestedOrientation(((DisplayMessage.SetOrientation) displayMessage).getOrientation());
                } else if (displayMessage instanceof DisplayMessage.OpenUrl) {
                    fullScreenWebViewDisplay.openUrl(displayMessage.getOpportunityId(), ((DisplayMessage.OpenUrl) displayMessage).getIntent(), ((DisplayMessage.OpenUrl) displayMessage).getUseActivityForResult());
                } else if (displayMessage instanceof DisplayMessage.DisplayStarted) {
                    adObject = fullScreenWebViewDisplay.getAdObject();
                    if (adObject != null) {
                        webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
                    } else {
                        webViewLessLoadingRequiredData = null;
                    }
                    if (webViewLessLoadingRequiredData != null) {
                        sendDiagnosticEvent = fullScreenWebViewDisplay.getSendDiagnosticEvent();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_less_ad_display_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 254, (Object) null);
                    }
                }
                y45Var = pn6Var;
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            FullScreenWebViewDisplay fullScreenWebViewDisplay2 = this.this$0;
            Throwable b = z45.b(y45Var);
            if (b != null) {
                gg3 u = oi4.u(fullScreenWebViewDisplay2);
                dispatchers = fullScreenWebViewDisplay2.getDispatchers();
                tl7.z(u, dispatchers.getDefault(), null, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3$2$1(fullScreenWebViewDisplay2, b, null), 2);
            }
            return pn6Var;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
