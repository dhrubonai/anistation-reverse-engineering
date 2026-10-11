package defpackage;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sn6 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ IUnityAdsInitializationListener y;
    public final /* synthetic */ Throwable z;

    public /* synthetic */ sn6(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th, byte b) {
        this.x = b;
        this.y = iUnityAdsInitializationListener;
        this.z = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Throwable th = this.z;
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.y;
        switch (b) {
            case 0:
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(iUnityAdsInitializationListener, th);
                return;
            default:
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(iUnityAdsInitializationListener, th);
                return;
        }
    }
}
