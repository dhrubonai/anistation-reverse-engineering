package com.unity3d.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityServices;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.UnityAds$initialize$7", f = "UnityAds.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAds$initialize$7 extends t36 implements ic2 {
    final /* synthetic */ InitializationConfiguration $configuration;
    final /* synthetic */ InitializationListener $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAds$initialize$7(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener, vz0 vz0Var) {
        super(2, vz0Var);
        this.$configuration = initializationConfiguration;
        this.$listener = initializationListener;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new UnityAds$initialize$7(this.$configuration, this.$listener, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((UnityAds$initialize$7) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            if (this.$configuration.getMediationInfo() != null) {
                MediationMetaData mediationMetaData = new MediationMetaData(ClientProperties.getApplicationContext());
                InitializationConfiguration initializationConfiguration = this.$configuration;
                mediationMetaData.setName(initializationConfiguration.getMediationInfo().getName());
                mediationMetaData.setVersion(initializationConfiguration.getMediationInfo().getVersion());
                mediationMetaData.set("adapter_version", initializationConfiguration.getMediationInfo().getAdapterVersion());
                mediationMetaData.commit();
            }
            UnityServices.initialize(ClientProperties.getApplicationContext(), this.$configuration.getGameId(), this.$configuration.isTestModeEnabled(), this.$configuration, this.$listener);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
