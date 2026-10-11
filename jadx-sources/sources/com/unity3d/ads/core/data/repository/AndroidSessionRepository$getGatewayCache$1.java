package com.unity3d.ads.core.data.repository;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {266}, m = "getGatewayCache")
/* loaded from: classes.dex */
public final class AndroidSessionRepository$getGatewayCache$1 extends xz0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$getGatewayCache$1(AndroidSessionRepository androidSessionRepository, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = androidSessionRepository;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getGatewayCache(this);
    }
}
