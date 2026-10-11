package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsInitModuleListener;
import defpackage.ic2;
import defpackage.k54;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidDeliverModuleConfigs$invoke$1$1", f = "AndroidDeliverModuleConfigs.kt", l = {196}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidDeliverModuleConfigs$invoke$1$1 extends t36 implements ic2 {
    final /* synthetic */ Map<String, Object> $extraData;
    final /* synthetic */ InitializationResponseOuterClass.InitializationResponse $initResponse;
    final /* synthetic */ UnityAdsInitModuleListener $listener;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AndroidDeliverModuleConfigs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDeliverModuleConfigs$invoke$1$1(AndroidDeliverModuleConfigs androidDeliverModuleConfigs, UnityAdsInitModuleListener unityAdsInitModuleListener, InitializationResponseOuterClass.InitializationResponse initializationResponse, Map<String, ? extends Object> map, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidDeliverModuleConfigs;
        this.$listener = unityAdsInitModuleListener;
        this.$initResponse = initializationResponse;
        this.$extraData = map;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidDeliverModuleConfigs$invoke$1$1(this.this$0, this.$listener, this.$initResponse, this.$extraData, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidDeliverModuleConfigs$invoke$1$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        k54 lockFor;
        AndroidDeliverModuleConfigs androidDeliverModuleConfigs;
        UnityAdsInitModuleListener unityAdsInitModuleListener;
        k54 k54Var;
        InitializationResponseOuterClass.InitializationResponse initializationResponse;
        Map<String, Object> map;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                map = (Map) this.L$4;
                initializationResponse = (InitializationResponseOuterClass.InitializationResponse) this.L$3;
                unityAdsInitModuleListener = (UnityAdsInitModuleListener) this.L$2;
                androidDeliverModuleConfigs = (AndroidDeliverModuleConfigs) this.L$1;
                k54Var = (k54) this.L$0;
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            lockFor = this.this$0.lockFor(this.$listener);
            androidDeliverModuleConfigs = this.this$0;
            unityAdsInitModuleListener = this.$listener;
            InitializationResponseOuterClass.InitializationResponse initializationResponse2 = this.$initResponse;
            Map<String, Object> map2 = this.$extraData;
            this.L$0 = lockFor;
            this.L$1 = androidDeliverModuleConfigs;
            this.L$2 = unityAdsInitModuleListener;
            this.L$3 = initializationResponse2;
            this.L$4 = map2;
            this.label = 1;
            Object a = lockFor.a(this);
            w11 w11Var = w11.x;
            if (a == w11Var) {
                return w11Var;
            }
            k54Var = lockFor;
            initializationResponse = initializationResponse2;
            map = map2;
        }
        try {
            androidDeliverModuleConfigs.deliver(unityAdsInitModuleListener, initializationResponse, map);
            k54Var.l(null);
            return pn6.a;
        } catch (Throwable th) {
            k54Var.l(null);
            throw th;
        }
    }
}
