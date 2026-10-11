package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$loadEvent$1", f = "AndroidHandleGatewayAdResponse.kt", l = {283}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$loadEvent$1 extends t36 implements ic2 {
    final /* synthetic */ AdObject $tmpAdObject;
    final /* synthetic */ String $webViewUrl;
    final /* synthetic */ AndroidWebViewContainer $webviewContainer;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$loadEvent$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, AdObject adObject, String str, AndroidWebViewContainer androidWebViewContainer, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$tmpAdObject = adObject;
        this.$webViewUrl = str;
        this.$webviewContainer = androidWebViewContainer;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidHandleGatewayAdResponse$invoke$loadEvent$1(this.this$0, this.$tmpAdObject, this.$webViewUrl, this.$webviewContainer, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidHandleGatewayAdResponse$invoke$loadEvent$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object loadUrl;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this.this$0;
            AdObject adObject = this.$tmpAdObject;
            String str = this.$webViewUrl;
            AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
            this.label = 1;
            loadUrl = androidHandleGatewayAdResponse.loadUrl(adObject, str, androidWebViewContainer, this);
            w11 w11Var = w11.x;
            if (loadUrl == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
