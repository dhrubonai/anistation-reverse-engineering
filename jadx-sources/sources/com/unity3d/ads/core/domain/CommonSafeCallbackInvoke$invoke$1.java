package com.unity3d.ads.core.domain;

import com.unity3d.services.core.misc.Utilities;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.sb2;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1", f = "CommonSafeCallbackInvoke.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonSafeCallbackInvoke$invoke$1 extends t36 implements ic2 {
    final /* synthetic */ sb2 $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonSafeCallbackInvoke$invoke$1(sb2 sb2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$block = sb2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new CommonSafeCallbackInvoke$invoke$1(this.$block, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((CommonSafeCallbackInvoke$invoke$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            final sb2 sb2Var = this.$block;
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.b
                @Override // java.lang.Runnable
                public final void run() {
                    sb2.this.invoke();
                }
            });
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
