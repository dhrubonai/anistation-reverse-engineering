package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w05;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.AllowedPiiOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {295}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleGatewayAdResponse$invoke$3 extends t36 implements ic2 {
    final /* synthetic */ w05 $adPlayer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$3(w05 w05Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$adPlayer = w05Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidHandleGatewayAdResponse$invoke$3 androidHandleGatewayAdResponse$invoke$3 = new AndroidHandleGatewayAdResponse$invoke$3(this.$adPlayer, vz0Var);
        androidHandleGatewayAdResponse$invoke$3.L$0 = obj;
        return androidHandleGatewayAdResponse$invoke$3;
    }

    @Override // defpackage.ic2
    public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, vz0 vz0Var) {
        return ((AndroidHandleGatewayAdResponse$invoke$3) create(allowedPii, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
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
            AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
            AdPlayer adPlayer = (AdPlayer) this.$adPlayer.x;
            byte[] byteArray = allowedPii.toByteArray();
            byteArray.getClass();
            this.label = 1;
            Object onAllowedPiiChange = adPlayer.onAllowedPiiChange(byteArray, this);
            w11 w11Var = w11.x;
            if (onAllowedPiiChange == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
