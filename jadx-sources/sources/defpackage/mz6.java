package defpackage;

import com.anistation.model.animelist.WatchStatus;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.WebViewScreenCapture;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class mz6 implements sb2 {
    public final /* synthetic */ byte x;

    @Override // defpackage.sb2
    public final Object invoke() {
        x73 _init_$_anonymous_;
        WebViewEvent sendActivityDestroyed$lambda$19;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return xt5.g(n17.E);
            case 1:
            case 2:
                return pn6Var;
            case 3:
                _init_$_anonymous_ = WatchStatus._init_$_anonymous_();
                return _init_$_anonymous_;
            case 4:
                sendActivityDestroyed$lambda$19 = WebViewAdPlayer.sendActivityDestroyed$lambda$19();
                return sendActivityDestroyed$lambda$19;
            case 5:
                return Long.valueOf(WebViewScreenCapture.a());
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }

    public /* synthetic */ mz6(byte b) {
        this.x = b;
    }
}
