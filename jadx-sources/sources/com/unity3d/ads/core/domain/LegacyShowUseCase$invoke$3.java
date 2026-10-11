package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jc2;
import defpackage.m37;
import defpackage.mc2;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.x42;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {215}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LegacyShowUseCase$invoke$3 extends t36 implements jc2 {
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ mc2 $reportShowError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$invoke$3(mc2 mc2Var, boolean z, vz0 vz0Var) {
        super(3, vz0Var);
        this.$reportShowError = mc2Var;
        this.$isBanner = z;
    }

    @Override // defpackage.jc2
    public final Object invoke(x42 x42Var, Throwable th, vz0 vz0Var) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3 = new LegacyShowUseCase$invoke$3(this.$reportShowError, this.$isBanner, vz0Var);
        legacyShowUseCase$invoke$3.L$0 = th;
        return legacyShowUseCase$invoke$3.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
                legacyShowUseCase$invoke$3 = this;
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            Throwable th = (Throwable) this.L$0;
            mc2 mc2Var = this.$reportShowError;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
            String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
            this.label = 1;
            legacyShowUseCase$invoke$3 = this;
            Object invoke = mc2Var.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$3);
            w11 w11Var = w11.x;
            if (invoke == w11Var) {
                return w11Var;
            }
        }
        if (!legacyShowUseCase$invoke$3.$isBanner) {
            LegacyShowUseCase.isFullscreenAdShowing = false;
        }
        return pn6.a;
    }
}
