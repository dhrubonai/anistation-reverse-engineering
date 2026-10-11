package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import defpackage.d21;
import defpackage.jc2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.x42;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UniversalRequestDataSource$get$2 extends t36 implements jc2 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UniversalRequestDataSource$get$2(vz0 vz0Var) {
        super(3, vz0Var);
    }

    @Override // defpackage.jc2
    public final Object invoke(x42 x42Var, Throwable th, vz0 vz0Var) {
        UniversalRequestDataSource$get$2 universalRequestDataSource$get$2 = new UniversalRequestDataSource$get$2(vz0Var);
        universalRequestDataSource$get$2.L$0 = x42Var;
        universalRequestDataSource$get$2.L$1 = th;
        return universalRequestDataSource$get$2.invokeSuspend(pn6.a);
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
            x42 x42Var = (x42) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof d21) {
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                defaultInstance.getClass();
                this.L$0 = null;
                this.label = 1;
                Object emit = x42Var.emit(defaultInstance, this);
                w11 w11Var = w11.x;
                if (emit == w11Var) {
                    return w11Var;
                }
            } else {
                throw th;
            }
        }
        return pn6.a;
    }
}
