package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$2$pendingDynamicDeviceInfo$1", f = "AndroidBuildHeaderBiddingToken.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidBuildHeaderBiddingToken$invoke$2$pendingDynamicDeviceInfo$1 extends t36 implements ic2 {
    int label;
    final /* synthetic */ AndroidBuildHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBuildHeaderBiddingToken$invoke$2$pendingDynamicDeviceInfo$1(AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidBuildHeaderBiddingToken;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidBuildHeaderBiddingToken$invoke$2$pendingDynamicDeviceInfo$1(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidBuildHeaderBiddingToken$invoke$2$pendingDynamicDeviceInfo$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        DeviceInfoRepository deviceInfoRepository;
        if (this.label == 0) {
            m37.N(obj);
            deviceInfoRepository = this.this$0.deviceInfoRepository;
            return deviceInfoRepository.getDynamicDeviceInfo();
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
