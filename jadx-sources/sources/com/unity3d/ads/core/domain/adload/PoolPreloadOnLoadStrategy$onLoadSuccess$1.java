package com.unity3d.ads.core.domain.adload;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.adload.PoolPreloadOnLoadStrategy", f = "PoolPreloadOnLoadStrategy.kt", l = {29, 31}, m = "onLoadSuccess")
/* loaded from: classes.dex */
public final class PoolPreloadOnLoadStrategy$onLoadSuccess$1 extends xz0 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PoolPreloadOnLoadStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolPreloadOnLoadStrategy$onLoadSuccess$1(PoolPreloadOnLoadStrategy poolPreloadOnLoadStrategy, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = poolPreloadOnLoadStrategy;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onLoadSuccess(null, null, null, null, null, this);
    }
}
