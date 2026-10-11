package com.unity3d.ads;

import com.unity3d.ads.BannerAd$1$1;
import com.unity3d.ads.InterstitialAd$1$1;
import com.unity3d.ads.RewardedAd$1$1;
import com.unity3d.ads.RewardedOffersAd$1$1;
import defpackage.sb2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ a(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return BannerAd$1$1.AnonymousClass2.a((BannerAd) obj);
            case 1:
                return InterstitialAd$1$1.AnonymousClass2.a((InterstitialAd) obj);
            case 2:
                return RewardedAd$1$1.AnonymousClass2.a((RewardedAd) obj);
            default:
                return RewardedOffersAd$1$1.AnonymousClass2.a((RewardedOffersAd) obj);
        }
    }
}
