package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.SessionChange;
import defpackage.ic2;
import defpackage.uc2;
import defpackage.vz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public /* synthetic */ class AndroidFullscreenWebViewAdPlayer$show$9 extends uc2 implements ic2 {
    public AndroidFullscreenWebViewAdPlayer$show$9(Object obj) {
        super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.ic2
    public final Object invoke(SessionChange sessionChange, vz0 vz0Var) {
        Object handleSessionChange;
        handleSessionChange = ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, vz0Var);
        return handleSessionChange;
    }
}
