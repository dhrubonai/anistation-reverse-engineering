package com.unity3d.ads.core.data.repository;

import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sw0;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends t36 implements ic2 {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidSessionRepository;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        w42 w42Var;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        w42Var = this.this$0.persistedNativeConfiguration;
        this.label = 1;
        Object p = sw0.p(w42Var, this);
        w11 w11Var = w11.x;
        if (p == w11Var) {
            return w11Var;
        }
        return p;
    }
}
