package com.unity3d.ads.adplayer.webviewpool;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool", f = "AndroidWebViewPool.kt", l = {83, 95, 97}, m = "resetEntry$suspendImpl")
/* loaded from: classes.dex */
public final class AndroidWebViewPool$resetEntry$1 extends xz0 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewPool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewPool$resetEntry$1(AndroidWebViewPool androidWebViewPool, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = androidWebViewPool;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AndroidWebViewPool.resetEntry$suspendImpl(this.this$0, null, this);
    }
}
