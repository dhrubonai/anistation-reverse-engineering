package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.preferences.AndroidPreferences;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$tryOptimisticCompletion$2", f = "AndroidOptimisticInitializationManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOptimisticInitializationManager$tryOptimisticCompletion$2 extends t36 implements ic2 {
    int label;

    public AndroidOptimisticInitializationManager$tryOptimisticCompletion$2(vz0 vz0Var) {
        super(2, vz0Var);
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidOptimisticInitializationManager$tryOptimisticCompletion$2(vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidOptimisticInitializationManager$tryOptimisticCompletion$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            return AndroidPreferences.getString("unityads-optimistic-init", "last_init_success");
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
