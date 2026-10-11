package com.unity3d.ads.core.data.manager;

import defpackage.vz0;
import defpackage.w51;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager", f = "AndroidOptimisticInitializationManager.kt", l = {108}, m = "storeKey")
/* loaded from: classes.dex */
public final class AndroidOptimisticInitializationManager$storeKey$1 extends xz0 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidOptimisticInitializationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOptimisticInitializationManager$storeKey$1(AndroidOptimisticInitializationManager androidOptimisticInitializationManager, vz0 vz0Var) {
        super(vz0Var);
        this.this$0 = androidOptimisticInitializationManager;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object storeKey;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        storeKey = this.this$0.storeKey(this);
        return storeKey;
    }
}
