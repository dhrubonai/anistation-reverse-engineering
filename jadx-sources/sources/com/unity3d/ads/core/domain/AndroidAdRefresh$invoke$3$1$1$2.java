package com.unity3d.ads.core.domain;

import defpackage.ic2;
import defpackage.m37;
import defpackage.nc1;
import defpackage.pn6;
import defpackage.t36;
import defpackage.t43;
import defpackage.vz0;
import defpackage.w51;
import defpackage.z45;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$2", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidAdRefresh$invoke$3$1$1$2 extends t36 implements ic2 {
    final /* synthetic */ nc1 $showing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$invoke$3$1$1$2(nc1 nc1Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$showing = nc1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidAdRefresh$invoke$3$1$1$2(this.$showing, vz0Var);
    }

    public final Object invoke(Object obj, vz0 vz0Var) {
        return ((AndroidAdRefresh$invoke$3$1$1$2) create(new z45(obj), vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            ((t43) this.$showing).l(null);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.ic2
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((z45) obj).x, (vz0) obj2);
    }
}
