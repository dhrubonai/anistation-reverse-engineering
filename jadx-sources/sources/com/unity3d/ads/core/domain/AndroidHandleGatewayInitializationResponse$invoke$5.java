package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.InitializationResponseOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$5", f = "AndroidHandleGatewayInitializationResponse.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayInitializationResponse$invoke$5 extends t36 implements ic2 {
    final /* synthetic */ InitializationResponseOuterClass.InitializationResponse $initResponse;
    int label;
    final /* synthetic */ AndroidHandleGatewayInitializationResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayInitializationResponse$invoke$5(AndroidHandleGatewayInitializationResponse androidHandleGatewayInitializationResponse, InitializationResponseOuterClass.InitializationResponse initializationResponse, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidHandleGatewayInitializationResponse;
        this.$initResponse = initializationResponse;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidHandleGatewayInitializationResponse$invoke$5(this.this$0, this.$initResponse, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidHandleGatewayInitializationResponse$invoke$5) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        CoherenceLibraryManager coherenceLibraryManager;
        if (this.label == 0) {
            m37.N(obj);
            coherenceLibraryManager = this.this$0.coherenceLibraryManager;
            byte[] byteArray = this.$initResponse.getNativeConfiguration().getDataLibraryWasmModule().toByteArray();
            byteArray.getClass();
            coherenceLibraryManager.initialize(byteArray);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
