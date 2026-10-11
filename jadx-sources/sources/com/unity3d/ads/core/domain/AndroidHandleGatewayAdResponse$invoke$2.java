package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.AdResponseOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {218}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$2 extends t36 implements ic2 {
    final /* synthetic */ v11 $adScope;
    final /* synthetic */ AdObject $eagerAdObject;
    final /* synthetic */ ic2 $loadWebView;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ String $webViewUrl;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$2(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, AdObject adObject, String str, AdResponseOuterClass.AdResponse adResponse, v11 v11Var, ic2 ic2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$eagerAdObject = adObject;
        this.$webViewUrl = str;
        this.$response = adResponse;
        this.$adScope = v11Var;
        this.$loadWebView = ic2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidHandleGatewayAdResponse$invoke$2(this.this$0, this.$eagerAdObject, this.$webViewUrl, this.$response, this.$adScope, this.$loadWebView, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidHandleGatewayAdResponse$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        PreShowWebViewStrategy preShowWebViewStrategy;
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
            preShowWebViewStrategy = this.this$0.preShowStrategy;
            AdObject adObject = this.$eagerAdObject;
            String str = this.$webViewUrl;
            AdResponseOuterClass.AdResponse adResponse = this.$response;
            v11 v11Var = this.$adScope;
            ic2 ic2Var = this.$loadWebView;
            this.label = 1;
            Object onLoadSuccess = preShowWebViewStrategy.onLoadSuccess(adObject, str, adResponse, v11Var, ic2Var, this);
            w11 w11Var = w11.x;
            if (onLoadSuccess == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
