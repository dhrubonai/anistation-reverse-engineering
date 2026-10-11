package com.unity3d.ads.adplayer.webviewpool;

import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.yq0;
import defpackage.ze0;
import defpackage.zq0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$3", f = "AndroidWebViewPool.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewPool$resetEntry$3 extends t36 implements ic2 {
    final /* synthetic */ yq0 $blankLoaded;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewPool$resetEntry$3(yq0 yq0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$blankLoaded = yq0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidWebViewPool$resetEntry$3(this.$blankLoaded, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidWebViewPool$resetEntry$3) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
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
            yq0 yq0Var = this.$blankLoaded;
            this.label = 1;
            Object o = ((zq0) yq0Var).o(this);
            w11 w11Var = w11.x;
            if (o == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
