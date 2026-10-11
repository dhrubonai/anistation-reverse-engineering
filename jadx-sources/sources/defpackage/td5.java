package defpackage;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.ads.UnityAdsImplementation;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class td5 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ IUnityAdsInitializationListener y;

    public /* synthetic */ td5(IUnityAdsInitializationListener iUnityAdsInitializationListener, byte b) {
        this.x = b;
        this.y = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.y;
        switch (b) {
            case 0:
                iUnityAdsInitializationListener.onInitializationComplete();
                return;
            default:
                UnityAdsImplementation.c(iUnityAdsInitializationListener);
                return;
        }
    }
}
