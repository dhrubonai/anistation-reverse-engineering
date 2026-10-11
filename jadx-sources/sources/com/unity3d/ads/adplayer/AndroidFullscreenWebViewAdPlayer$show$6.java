package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ShowEvent;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$6 extends t36 implements ic2 {
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$6(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidFullscreenWebViewAdPlayer$show$6(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(ShowEvent showEvent, vz0 vz0Var) {
        return ((AndroidFullscreenWebViewAdPlayer$show$6) create(showEvent, vz0Var)).invokeSuspend(pn6.a);
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
            AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
            this.label = 1;
            Object destroy = androidFullscreenWebViewAdPlayer.destroy(this);
            w11 w11Var = w11.x;
            if (destroy == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
