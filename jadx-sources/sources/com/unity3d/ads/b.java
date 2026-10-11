package com.unity3d.ads;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ LoadListener y;
    public final /* synthetic */ Throwable z;

    public /* synthetic */ b(LoadListener loadListener, Throwable th, byte b) {
        this.x = b;
        this.y = loadListener;
        this.z = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Throwable th = this.z;
        LoadListener loadListener = this.y;
        switch (b) {
            case 0:
                InterstitialAd$Companion$load$1.i(loadListener, th);
                return;
            case 1:
                RewardedAd$Companion$load$1.i(loadListener, th);
                return;
            default:
                RewardedOffersAd$Companion$load$1.i(loadListener, th);
                return;
        }
    }
}
