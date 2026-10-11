package com.unity3d.ads.core.domain.adload;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.adload.EagerPreloadOnLoadStrategy", f = "EagerPreloadOnLoadStrategy.kt", l = {124, 124}, m = "onShowComplete")
/* loaded from: classes.dex */
public final class EagerPreloadOnLoadStrategy$onShowComplete$1 extends xz0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EagerPreloadOnLoadStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EagerPreloadOnLoadStrategy$onShowComplete$1(EagerPreloadOnLoadStrategy eagerPreloadOnLoadStrategy, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = eagerPreloadOnLoadStrategy;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onShowComplete(null, this);
    }
}
