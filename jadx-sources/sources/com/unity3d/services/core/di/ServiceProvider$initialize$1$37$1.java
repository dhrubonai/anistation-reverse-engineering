package com.unity3d.services.core.di;

import com.unity3d.ads.core.domain.HttpClientProvider;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.z05;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$37$1", f = "ServiceProvider.kt", l = {542}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ServiceProvider$initialize$1$37$1 extends t36 implements ic2 {
    final /* synthetic */ ServicesRegistry $this_registry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceProvider$initialize$1$37$1(ServicesRegistry servicesRegistry, vz0 vz0Var) {
        super(2, vz0Var);
        this.$this_registry = servicesRegistry;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new ServiceProvider$initialize$1$37$1(this.$this_registry, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((ServiceProvider$initialize$1$37$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
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
        HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", z05.a(HttpClientProvider.class)));
        this.label = 1;
        Object invoke = httpClientProvider.invoke(this);
        w11 w11Var = w11.x;
        if (invoke == w11Var) {
            return w11Var;
        }
        return invoke;
    }
}
