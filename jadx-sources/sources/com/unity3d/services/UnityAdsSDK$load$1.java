package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.banners.UnityBannerSize;
import defpackage.db;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.rb3;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.z05;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {146}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$load$1 extends t36 implements ic2 {
    final /* synthetic */ UnityBannerSize $bannerSize;
    final /* synthetic */ rb3 $context$delegate;
    final /* synthetic */ InternalLoadListener $listener;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ v11 $loadScope;
    final /* synthetic */ String $placementId;
    int label;
    final /* synthetic */ UnityAdsSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$load$1(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, v11 v11Var, rb3 rb3Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = unityAdsSDK;
        this.$placementId = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$listener = internalLoadListener;
        this.$bannerSize = unityBannerSize;
        this.$loadScope = v11Var;
        this.$context$delegate = rb3Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new UnityAdsSDK$load$1(this.this$0, this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((UnityAdsSDK$load$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Context load$lambda$9;
        UnityAdsSDK$load$1 unityAdsSDK$load$1;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
                unityAdsSDK$load$1 = this;
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) this.this$0.getServiceProvider().getRegistry().getService("", z05.a(LegacyLoadUseCase.class));
            load$lambda$9 = UnityAdsSDK.load$lambda$9(this.$context$delegate);
            String str = this.$placementId;
            UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
            InternalLoadListener internalLoadListener = this.$listener;
            UnityBannerSize unityBannerSize = this.$bannerSize;
            this.label = 1;
            unityAdsSDK$load$1 = this;
            Object invoke = legacyLoadUseCase.invoke(load$lambda$9, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, unityAdsSDK$load$1);
            w11 w11Var = w11.x;
            if (invoke == w11Var) {
                return w11Var;
            }
        }
        db.t(unityAdsSDK$load$1.$loadScope, null);
        return pn6.a;
    }
}
