package com.unity3d.ads.adplayer;

import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$result$1", f = "CommonWebViewBridge.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CommonWebViewBridge$handleInvocationResult$result$1 extends t36 implements ic2 {
    final /* synthetic */ ExposedFunction $handler;
    final /* synthetic */ Invocation $invocation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocationResult$result$1(ExposedFunction exposedFunction, Invocation invocation, vz0 vz0Var) {
        super(2, vz0Var);
        this.$handler = exposedFunction;
        this.$invocation = invocation;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new CommonWebViewBridge$handleInvocationResult$result$1(this.$handler, this.$invocation, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((CommonWebViewBridge$handleInvocationResult$result$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
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
        ExposedFunction exposedFunction = this.$handler;
        Object[] parameters = this.$invocation.getParameters();
        this.label = 1;
        Object invoke = exposedFunction.invoke(parameters, this);
        w11 w11Var = w11.x;
        if (invoke == w11Var) {
            return w11Var;
        }
        return invoke;
    }
}
