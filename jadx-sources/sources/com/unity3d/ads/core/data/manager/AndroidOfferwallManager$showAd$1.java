package com.unity3d.ads.core.data.manager;

import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import defpackage.x42;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOfferwallManager$showAd$1 extends t36 implements ic2 {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ AndroidOfferwallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOfferwallManager$showAd$1(AndroidOfferwallManager androidOfferwallManager, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidOfferwallManager;
        this.$placementName = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidOfferwallManager$showAd$1(this.this$0, this.$placementName, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(x42 x42Var, vz0 vz0Var) {
        return ((AndroidOfferwallManager$showAd$1) create(x42Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        OfferwallAdapterBridge offerwallAdapterBridge;
        if (this.label == 0) {
            m37.N(obj);
            offerwallAdapterBridge = this.this$0.offerwallBridge;
            offerwallAdapterBridge.showAd(this.$placementName);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
