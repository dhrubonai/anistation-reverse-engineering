package com.unity3d.services;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.om.OmFinishSession;
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
@w51(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$1", f = "UnityAdsSDK.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$finishOMIDSession$1 extends t36 implements ic2 {
    final /* synthetic */ rb3 $getAdObject$delegate;
    final /* synthetic */ rb3 $omFinishSession$delegate;
    final /* synthetic */ v11 $omidScope;
    final /* synthetic */ String $opportunityId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$finishOMIDSession$1(String str, v11 v11Var, rb3 rb3Var, rb3 rb3Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.$opportunityId = str;
        this.$omidScope = v11Var;
        this.$getAdObject$delegate = rb3Var;
        this.$omFinishSession$delegate = rb3Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new UnityAdsSDK$finishOMIDSession$1(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((UnityAdsSDK$finishOMIDSession$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        GetAdObject finishOMIDSession$lambda$21;
        OmFinishSession finishOMIDSession$lambda$22;
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
            finishOMIDSession$lambda$21 = UnityAdsSDK.finishOMIDSession$lambda$21(this.$getAdObject$delegate);
            AdObject invoke = finishOMIDSession$lambda$21.invoke(this.$opportunityId);
            if (invoke != null) {
                finishOMIDSession$lambda$22 = UnityAdsSDK.finishOMIDSession$lambda$22(this.$omFinishSession$delegate);
                this.label = 1;
                Object invoke2 = finishOMIDSession$lambda$22.invoke(invoke, this);
                w11 w11Var = w11.x;
                if (invoke2 == w11Var) {
                    return w11Var;
                }
            }
        }
        db.t(this.$omidScope, null);
        return pn6.a;
    }
}
