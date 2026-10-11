package com.unity3d.ads;

import android.view.View;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.q71;
import defpackage.tl7;
import defpackage.v11;
import defpackage.z05;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class BannerAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<BannerAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final View view;

    public BannerAd(AdObject adObject, View view, SafeCallbackInvoke safeCallbackInvoke) {
        v11 scope;
        adObject.getClass();
        view.getClass();
        safeCallbackInvoke.getClass();
        this.adObject = adObject;
        this.view = view;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (scope = adPlayer.getScope()) != null) {
            tl7.z(scope, null, null, new BannerAd$1$1(this, null), 3);
        }
    }

    public static final void load(BannerConfiguration bannerConfiguration, LoadListener<BannerAd> loadListener) {
        Companion.load(bannerConfiguration, loadListener);
    }

    public final AdExpiredListener<BannerAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final View getView() {
        return this.view;
    }

    public final void setOnAdExpired(AdExpiredListener<BannerAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final void load(BannerConfiguration bannerConfiguration, LoadListener<BannerAd> loadListener) {
            bannerConfiguration.getClass();
            loadListener.getClass();
            tl7.z((v11) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, z05.a(v11.class))), null, null, new BannerAd$Companion$load$1(loadListener, bannerConfiguration, null), 3);
        }

        private Companion() {
        }
    }
}
