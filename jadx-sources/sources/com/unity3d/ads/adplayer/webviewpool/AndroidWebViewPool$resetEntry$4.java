package com.unity3d.ads.adplayer.webviewpool;

import com.unity3d.ads.adplayer.AndroidWebViewClient;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$4", f = "AndroidWebViewPool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewPool$resetEntry$4 extends t36 implements ic2 {
    final /* synthetic */ PoolEntry $entry;
    final /* synthetic */ AndroidWebViewClient $freshClient;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewPool$resetEntry$4(PoolEntry poolEntry, AndroidWebViewClient androidWebViewClient, vz0 vz0Var) {
        super(2, vz0Var);
        this.$entry = poolEntry;
        this.$freshClient = androidWebViewClient;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidWebViewPool$resetEntry$4(this.$entry, this.$freshClient, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidWebViewPool$resetEntry$4) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            m37.N(obj);
            this.$entry.getWebView().setWebViewClient(this.$freshClient);
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
