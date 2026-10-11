package com.unity3d.services;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
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
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$getToken$2 extends t36 implements ic2 {
    final /* synthetic */ rb3 $getAsyncHeaderBiddingToken$delegate;
    final /* synthetic */ v11 $getTokenScope;
    final /* synthetic */ IUnityAdsTokenListener $listener;
    final /* synthetic */ TokenConfiguration $tokenConfiguration;
    final /* synthetic */ rb3 $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$getToken$2(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, v11 v11Var, rb3 rb3Var, rb3 rb3Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.$tokenConfiguration = tokenConfiguration;
        this.$listener = iUnityAdsTokenListener;
        this.$getTokenScope = v11Var;
        this.$getAsyncHeaderBiddingToken$delegate = rb3Var;
        this.$tokenNumberProvider$delegate = rb3Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new UnityAdsSDK$getToken$2(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((UnityAdsSDK$getToken$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        GetAsyncHeaderBiddingToken token$lambda$12;
        TokenNumberProvider token$lambda$11;
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
            token$lambda$12 = UnityAdsSDK.getToken$lambda$12(this.$getAsyncHeaderBiddingToken$delegate);
            token$lambda$11 = UnityAdsSDK.getToken$lambda$11(this.$tokenNumberProvider$delegate);
            int invoke = token$lambda$11.invoke();
            TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
            IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
            this.label = 1;
            Object invoke2 = token$lambda$12.invoke(invoke, tokenConfiguration, iUnityAdsTokenListener, this);
            w11 w11Var = w11.x;
            if (invoke2 == w11Var) {
                return w11Var;
            }
        }
        db.t(this.$getTokenScope, null);
        return pn6.a;
    }
}
