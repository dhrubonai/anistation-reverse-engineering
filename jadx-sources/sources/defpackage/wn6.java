package defpackage;

import com.unity3d.ads.AdExpiredListener;
import com.unity3d.ads.LoadListener;
import com.unity3d.ads.RewardedAd;
import com.unity3d.ads.UnityAdsError;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wn6 implements LoadListener, AdExpiredListener {
    public final /* synthetic */ zn6 a;

    public /* synthetic */ wn6(zn6 zn6Var) {
        this.a = zn6Var;
    }

    @Override // com.unity3d.ads.AdExpiredListener
    public void onAdExpired(Object obj) {
        RewardedAd rewardedAd = (RewardedAd) obj;
        rewardedAd.getClass();
        zn6 zn6Var = this.a;
        zn6Var.e(new lb5((Object) zn6Var, (Object) rewardedAd, (byte) 16));
    }

    @Override // com.unity3d.ads.LoadListener
    public void onAdLoaded(Object obj, UnityAdsError unityAdsError) {
        zn6 zn6Var = this.a;
        zn6Var.e(new mi((Object) zn6Var, obj, (Object) unityAdsError, (byte) 15));
    }
}
