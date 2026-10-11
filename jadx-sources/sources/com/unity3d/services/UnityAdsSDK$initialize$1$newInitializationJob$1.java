package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.bf6;
import defpackage.db;
import defpackage.h11;
import defpackage.ic2;
import defpackage.j04;
import defpackage.m37;
import defpackage.pn6;
import defpackage.rb3;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", f = "UnityAdsSDK.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends t36 implements ic2 {
    final /* synthetic */ v11 $initScope;
    final /* synthetic */ rb3 $initializeBoldSDK$delegate;
    final /* synthetic */ long $publicApiEntry;
    final /* synthetic */ rb3 $sendDiagnosticEvent$delegate;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$initialize$1$newInitializationJob$1(String str, long j, v11 v11Var, rb3 rb3Var, rb3 rb3Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.$source = str;
        this.$publicApiEntry = j;
        this.$initScope = v11Var;
        this.$sendDiagnosticEvent$delegate = rb3Var;
        this.$initializeBoldSDK$delegate = rb3Var2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$publicApiEntry, this.$initScope, this.$sendDiagnosticEvent$delegate, this.$initializeBoldSDK$delegate, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((UnityAdsSDK$initialize$1$newInitializationJob$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        SendDiagnosticEvent initialize$lambda$7$lambda$6;
        InitializeBoldSDK initialize$lambda$7$lambda$5;
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
            initialize$lambda$7$lambda$6 = UnityAdsSDK.initialize$lambda$7$lambda$6(this.$sendDiagnosticEvent$delegate);
            long b = j04.b();
            initialize$lambda$7$lambda$5 = UnityAdsSDK.initialize$lambda$7$lambda$5(this.$initializeBoldSDK$delegate);
            SendDiagnosticEvent.DefaultImpls.invoke$default(initialize$lambda$7$lambda$6, "native_init_di_resolution_time", new Double(h11.c(b)), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 252, (Object) null);
            String str = this.$source;
            bf6 bf6Var = new bf6(this.$publicApiEntry);
            this.label = 1;
            Object invoke = initialize$lambda$7$lambda$5.invoke(str, bf6Var, this);
            w11 w11Var = w11.x;
            if (invoke == w11Var) {
                return w11Var;
            }
        }
        db.t(this.$initScope, null);
        return pn6.a;
    }
}
