package com.unity3d.ads.core.data.datasource;

import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.AndroidModuleInitParamsDataSource$invoke$2", f = "AndroidModuleInitParamsDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidModuleInitParamsDataSource$invoke$2 extends t36 implements ic2 {
    int label;
    final /* synthetic */ AndroidModuleInitParamsDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidModuleInitParamsDataSource$invoke$2(AndroidModuleInitParamsDataSource androidModuleInitParamsDataSource, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidModuleInitParamsDataSource;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidModuleInitParamsDataSource$invoke$2(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidModuleInitParamsDataSource$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        List collectInitParams;
        if (this.label == 0) {
            m37.N(obj);
            collectInitParams = this.this$0.collectInitParams();
            return collectInitParams;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
