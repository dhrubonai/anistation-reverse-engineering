package com.unity3d.ads.adplayer;

import defpackage.ic2;
import defpackage.n6;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public /* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$3 extends n6 implements ic2 {
    public AndroidFullscreenWebViewAdPlayer$show$3(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
    }

    @Override // defpackage.ic2
    public final Object invoke(DisplayMessage displayMessage, vz0 vz0Var) {
        Object show$displayEventsRouter;
        show$displayEventsRouter = AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, vz0Var);
        return show$displayEventsRouter;
    }
}
