package com.unity3d.ads.adplayer.probe;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.probe.AndroidWebViewProbe", f = "AndroidWebViewProbe.kt", l = {88, 90, 98}, m = "runProbe")
/* loaded from: classes.dex */
public final class AndroidWebViewProbe$runProbe$1 extends xz0 {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewProbe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewProbe$runProbe$1(AndroidWebViewProbe androidWebViewProbe, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = androidWebViewProbe;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object runProbe;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runProbe = this.this$0.runProbe(this);
        return runProbe;
    }
}
