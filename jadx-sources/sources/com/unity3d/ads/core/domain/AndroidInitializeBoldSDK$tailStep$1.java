package com.unity3d.ads.core.domain;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {213}, m = "tailStep")
/* loaded from: classes.dex */
public final class AndroidInitializeBoldSDK$tailStep$1 extends xz0 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$tailStep$1(AndroidInitializeBoldSDK androidInitializeBoldSDK, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = androidInitializeBoldSDK;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object tailStep;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tailStep = this.this$0.tailStep(null, null, this);
        return tailStep;
    }
}
