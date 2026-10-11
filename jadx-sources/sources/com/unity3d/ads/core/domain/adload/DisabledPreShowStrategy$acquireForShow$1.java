package com.unity3d.ads.core.domain.adload;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.adload.DisabledPreShowStrategy", f = "DisabledPreShowStrategy.kt", l = {18}, m = "acquireForShow")
/* loaded from: classes.dex */
public final class DisabledPreShowStrategy$acquireForShow$1 extends xz0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DisabledPreShowStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisabledPreShowStrategy$acquireForShow$1(DisabledPreShowStrategy disabledPreShowStrategy, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = disabledPreShowStrategy;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.acquireForShow(null, null, this);
    }
}
