package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.jc2;
import defpackage.m37;
import defpackage.ms;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.x42;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOfferwallManager$showAd$2 extends t36 implements jc2 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public AndroidOfferwallManager$showAd$2(vz0 vz0Var) {
        super(3, vz0Var);
    }

    @Override // defpackage.jc2
    public final Object invoke(x42 x42Var, OfferwallEventData offerwallEventData, vz0 vz0Var) {
        AndroidOfferwallManager$showAd$2 androidOfferwallManager$showAd$2 = new AndroidOfferwallManager$showAd$2(vz0Var);
        androidOfferwallManager$showAd$2.L$0 = x42Var;
        androidOfferwallManager$showAd$2.L$1 = offerwallEventData;
        return androidOfferwallManager$showAd$2.invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        OfferwallEventData offerwallEventData;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                offerwallEventData = (OfferwallEventData) this.L$0;
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            x42 x42Var = (x42) this.L$0;
            OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
            this.L$0 = offerwallEventData2;
            this.label = 1;
            Object emit = x42Var.emit(offerwallEventData2, this);
            w11 w11Var = w11.x;
            if (emit == w11Var) {
                return w11Var;
            }
            offerwallEventData = offerwallEventData2;
        }
        return Boolean.valueOf(!ms.t0(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
    }
}
