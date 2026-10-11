package defpackage;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rn6 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ IUnityAdsTokenListener y;

    public /* synthetic */ rn6(IUnityAdsTokenListener iUnityAdsTokenListener, byte b) {
        this.x = b;
        this.y = iUnityAdsTokenListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        IUnityAdsTokenListener iUnityAdsTokenListener = this.y;
        switch (b) {
            case 0:
                UnityAds.b(iUnityAdsTokenListener);
                return;
            default:
                UnityAds.f(iUnityAdsTokenListener);
                return;
        }
    }
}
