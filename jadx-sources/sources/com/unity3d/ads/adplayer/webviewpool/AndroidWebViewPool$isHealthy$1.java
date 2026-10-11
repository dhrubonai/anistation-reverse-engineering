package com.unity3d.ads.adplayer.webviewpool;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool", f = "AndroidWebViewPool.kt", l = {117}, m = "isHealthy")
/* loaded from: classes.dex */
public final class AndroidWebViewPool$isHealthy$1 extends xz0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewPool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewPool$isHealthy$1(AndroidWebViewPool androidWebViewPool, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = androidWebViewPool;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object isHealthy;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        isHealthy = this.this$0.isHealthy(null, this);
        return isHealthy;
    }
}
