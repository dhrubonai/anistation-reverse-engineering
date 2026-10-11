package com.unity3d.ads.core.domain;

import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.ub2;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$4", f = "AndroidInitializeBoldSDK.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidInitializeBoldSDK$initializationSuccess$4 extends t36 implements ub2 {
    int label;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$initializationSuccess$4(AndroidInitializeBoldSDK androidInitializeBoldSDK, vz0 vz0Var) {
        super(1, vz0Var);
        this.this$0 = androidInitializeBoldSDK;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new AndroidInitializeBoldSDK$initializationSuccess$4(this.this$0, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(vz0 vz0Var) {
        return ((AndroidInitializeBoldSDK$initializationSuccess$4) create(vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        CleanAssets cleanAssets;
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
            cleanAssets = this.this$0.cleanAssets;
            this.label = 1;
            Object invoke = cleanAssets.invoke(this);
            w11 w11Var = w11.x;
            if (invoke == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
