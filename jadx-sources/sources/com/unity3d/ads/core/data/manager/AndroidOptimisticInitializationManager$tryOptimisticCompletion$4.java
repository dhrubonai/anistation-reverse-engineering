package com.unity3d.ads.core.data.manager;

import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.x97;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$tryOptimisticCompletion$4", f = "AndroidOptimisticInitializationManager.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOptimisticInitializationManager$tryOptimisticCompletion$4 extends t36 implements ic2 {
    final /* synthetic */ int $delayMs;
    int label;
    final /* synthetic */ AndroidOptimisticInitializationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOptimisticInitializationManager$tryOptimisticCompletion$4(int i, AndroidOptimisticInitializationManager androidOptimisticInitializationManager, vz0 vz0Var) {
        super(2, vz0Var);
        this.$delayMs = i;
        this.this$0 = androidOptimisticInitializationManager;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidOptimisticInitializationManager$tryOptimisticCompletion$4(this.$delayMs, this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidOptimisticInitializationManager$tryOptimisticCompletion$4) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            long j = this.$delayMs;
            this.label = 1;
            Object u = x97.u(j, this);
            w11 w11Var = w11.x;
            if (u == w11Var) {
                return w11Var;
            }
        }
        this.this$0.sendOptimistic();
        return pn6.a;
    }
}
