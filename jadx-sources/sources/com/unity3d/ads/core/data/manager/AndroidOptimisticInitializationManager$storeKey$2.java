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
@w51(c = "com.unity3d.ads.core.data.manager.AndroidOptimisticInitializationManager$storeKey$2", f = "AndroidOptimisticInitializationManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOptimisticInitializationManager$storeKey$2 extends t36 implements ic2 {
    final /* synthetic */ String $key;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOptimisticInitializationManager$storeKey$2(String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.$key = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidOptimisticInitializationManager$storeKey$2(this.$key, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidOptimisticInitializationManager$storeKey$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            AndroidPreferences.setString("unityads-optimistic-init", "last_init_success", this.$key);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
