package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
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
@w51(c = "com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy$onLoadSuccess$3$1", f = "EagerPreloadOnLoadStrategy.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class EagerPreloadOnLoadStrategy$onLoadSuccess$3$1 extends t36 implements ic2 {
    final /* synthetic */ AndroidWebViewContainer $container;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EagerPreloadOnLoadStrategy$onLoadSuccess$3$1(AndroidWebViewContainer androidWebViewContainer, vz0 vz0Var) {
        super(2, vz0Var);
        this.$container = androidWebViewContainer;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new EagerPreloadOnLoadStrategy$onLoadSuccess$3$1(this.$container, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((EagerPreloadOnLoadStrategy$onLoadSuccess$3$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
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
            AndroidWebViewContainer androidWebViewContainer = this.$container;
            this.label = 1;
            Object destroy = androidWebViewContainer.destroy(this);
            w11 w11Var = w11.x;
            if (destroy == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
