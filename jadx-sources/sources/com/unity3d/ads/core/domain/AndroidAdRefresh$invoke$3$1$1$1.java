package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import defpackage.ic2;
import defpackage.m37;
import defpackage.nc1;
import defpackage.pn6;
import defpackage.t36;
import defpackage.t43;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$1", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidAdRefresh$invoke$3$1$1$1 extends t36 implements ic2 {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ nc1 $refreshTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$1(nc1 nc1Var, AdObject adObject, vz0 vz0Var) {
        super(2, vz0Var);
        this.$refreshTask = nc1Var;
        this.$adObject = adObject;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidAdRefresh$invoke$3$1$1$1(this.$refreshTask, this.$adObject, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(AdObjectState adObjectState, vz0 vz0Var) {
        return ((AndroidAdRefresh$invoke$3$1$1$1) create(adObjectState, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            ((t43) this.$refreshTask).l(null);
            AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.$adObject.getWebViewLessLoadingRequiredData();
            if (webViewLessLoadingRequiredData != null) {
                webViewLessLoadingRequiredData.setAdRefreshState(AdRefreshState.REUSE_DURING_RELOAD);
            }
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
