package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
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
@w51(c = "com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1", f = "LegacyHttpClient.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LegacyHttpClient$executeBlocking$1 extends t36 implements ic2 {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ LegacyHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyHttpClient$executeBlocking$1(LegacyHttpClient legacyHttpClient, HttpRequest httpRequest, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = legacyHttpClient;
        this.$request = httpRequest;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new LegacyHttpClient$executeBlocking$1(this.this$0, this.$request, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((LegacyHttpClient$executeBlocking$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
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
        LegacyHttpClient legacyHttpClient = this.this$0;
        HttpRequest httpRequest = this.$request;
        this.label = 1;
        Object execute$default = HttpClient.DefaultImpls.execute$default(legacyHttpClient, httpRequest, false, this, 2, null);
        w11 w11Var = w11.x;
        if (execute$default == w11Var) {
            return w11Var;
        }
        return execute$default;
    }
}
