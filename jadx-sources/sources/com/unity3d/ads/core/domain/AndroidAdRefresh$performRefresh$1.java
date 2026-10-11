package com.unity3d.ads.core.domain;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidAdRefresh", f = "AndroidAdRefresh.kt", l = {75, 79, 95}, m = "performRefresh")
/* loaded from: classes.dex */
public final class AndroidAdRefresh$performRefresh$1 extends xz0 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidAdRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdRefresh$performRefresh$1(AndroidAdRefresh androidAdRefresh, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = androidAdRefresh;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object performRefresh;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        performRefresh = this.this$0.performRefresh(null, this);
        return performRefresh;
    }
}
