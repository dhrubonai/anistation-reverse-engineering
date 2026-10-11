package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.a34;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.te4;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOfferwallManager$loadAd$3 extends t36 implements ic2 {
    final /* synthetic */ String $placementName;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOfferwallManager$loadAd$3(String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.$placementName = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidOfferwallManager$loadAd$3 androidOfferwallManager$loadAd$3 = new AndroidOfferwallManager$loadAd$3(this.$placementName, vz0Var);
        androidOfferwallManager$loadAd$3.L$0 = obj;
        return androidOfferwallManager$loadAd$3;
    }

    @Override // defpackage.ic2
    public final Object invoke(OfferwallEventData offerwallEventData, vz0 vz0Var) {
        return ((AndroidOfferwallManager$loadAd$3) create(offerwallEventData, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.label == 0) {
            m37.N(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            if (te4.I(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && a34.i(offerwallEventData.getPlacementName(), this.$placementName)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
