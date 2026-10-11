package com.unity3d.services;

import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.TokenNumberProvider;
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
@w51(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$fetchToken$token$1 extends t36 implements ic2 {
    final /* synthetic */ rb3 $getHeaderBiddingToken$delegate;
    final /* synthetic */ rb3 $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$fetchToken$token$1(rb3 rb3Var, rb3 rb3Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.$getHeaderBiddingToken$delegate = rb3Var;
        this.$tokenNumberProvider$delegate = rb3Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((UnityAdsSDK$fetchToken$token$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        GetHeaderBiddingToken fetchToken$lambda$14;
        TokenNumberProvider fetchToken$lambda$13;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        fetchToken$lambda$14 = UnityAdsSDK.fetchToken$lambda$14(this.$getHeaderBiddingToken$delegate);
        fetchToken$lambda$13 = UnityAdsSDK.fetchToken$lambda$13(this.$tokenNumberProvider$delegate);
        int invoke = fetchToken$lambda$13.invoke();
        this.label = 1;
        Object invoke$default = GetHeaderBiddingToken.DefaultImpls.invoke$default(fetchToken$lambda$14, invoke, null, this, 2, null);
        w11 w11Var = w11.x;
        if (invoke$default == w11Var) {
            return w11Var;
        }
        return invoke$default;
    }
}
