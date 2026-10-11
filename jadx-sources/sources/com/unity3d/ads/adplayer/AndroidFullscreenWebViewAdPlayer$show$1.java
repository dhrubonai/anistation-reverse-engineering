package com.unity3d.ads.adplayer;

import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import defpackage.x42;
import defpackage.yq0;
import defpackage.ze0;
import defpackage.zq0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$1 extends t36 implements ic2 {
    final /* synthetic */ yq0 $listenerStarted;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$1(yq0 yq0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$listenerStarted = yq0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidFullscreenWebViewAdPlayer$show$1(this.$listenerStarted, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(x42 x42Var, vz0 vz0Var) {
        return ((AndroidFullscreenWebViewAdPlayer$show$1) create(x42Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            zq0 zq0Var = (zq0) this.$listenerStarted;
            pn6 pn6Var = pn6.a;
            zq0Var.Q(pn6Var);
            return pn6Var;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
