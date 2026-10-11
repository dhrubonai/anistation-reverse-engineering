package com.unity3d.ads;

import android.content.Context;
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
public final class RewardedAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<RewardedAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;

    public RewardedAd(AdObject adObject, SafeCallbackInvoke safeCallbackInvoke) {
        v11 scope;
        adObject.getClass();
        safeCallbackInvoke.getClass();
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (scope = adPlayer.getScope()) != null) {
            tl7.z(scope, null, null, new RewardedAd$1$1(this, null), 3);
        }
    }

    public static final void load(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener) {
        Companion.load(loadConfiguration, loadListener);
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Context context, ShowConfiguration showConfiguration, RewardedShowListener rewardedShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showConfiguration = null;
        }
        if ((i & 4) != 0) {
            rewardedShowListener = null;
        }
        rewardedAd.show(context, showConfiguration, rewardedShowListener);
    }

    public final AdExpiredListener<RewardedAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(AdExpiredListener<RewardedAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public final void show(Context context, ShowConfiguration showConfiguration, RewardedShowListener rewardedShowListener) {
        tl7.z((v11) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, z05.a(v11.class))), null, null, new RewardedAd$show$1(showConfiguration, this, context, rewardedShowListener, null), 3);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final void load(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener) {
            loadConfiguration.getClass();
            loadListener.getClass();
            tl7.z((v11) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, z05.a(v11.class))), null, null, new RewardedAd$Companion$load$1(loadConfiguration, loadListener, null), 3);
        }

        private Companion() {
        }
    }
}
