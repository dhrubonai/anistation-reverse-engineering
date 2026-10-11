package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.misc.ViewUtilities;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$1 extends t36 implements ic2 {
    final /* synthetic */ BannerView $bannerView;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, BannerView bannerView, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$bannerView = bannerView;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1(this.this$0, this.$bannerView, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Context context;
        Context context2;
        if (this.label == 0) {
            m37.N(obj);
            WebView webView = this.this$0.getWebViewContainer().getWebView();
            context = this.this$0.context;
            int pxFromDp = (int) ViewUtilities.pxFromDp(context, this.$bannerView.getSize().getWidth());
            context2 = this.this$0.context;
            webView.setLayoutParams(new ViewGroup.LayoutParams(pxFromDp, (int) ViewUtilities.pxFromDp(context2, this.$bannerView.getSize().getHeight())));
            return pn6.a;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
