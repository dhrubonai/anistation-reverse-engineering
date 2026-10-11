package com.unity3d.ads.adplayer;

import defpackage.h43;
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
@w51(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$onCreate$6", f = "FullScreenWebViewDisplay.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay$onCreate$6 extends t36 implements ic2 {
    final /* synthetic */ h43 $playerJob;
    int label;
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$onCreate$6(h43 h43Var, FullScreenWebViewDisplay fullScreenWebViewDisplay, vz0 vz0Var) {
        super(2, vz0Var);
        this.$playerJob = h43Var;
        this.this$0 = fullScreenWebViewDisplay;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new FullScreenWebViewDisplay$onCreate$6(this.$playerJob, this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((FullScreenWebViewDisplay$onCreate$6) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
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
            h43 h43Var = this.$playerJob;
            this.label = 1;
            Object G = h43Var.G(this);
            w11 w11Var = w11.x;
            if (G == w11Var) {
                return w11Var;
            }
        }
        this.this$0.finishBySdk();
        return pn6.a;
    }
}
