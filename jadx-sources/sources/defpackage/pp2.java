package defpackage;

import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pp2 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;

    public /* synthetic */ pp2(byte b, boolean z) {
        this.x = b;
        this.y = z;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        xx6 xx6Var;
        WebViewEvent sendFocusChange$lambda$18;
        WebViewEvent sendVisibilityChange$lambda$17;
        WebViewEvent sendMuteChange$lambda$16;
        byte b = this.x;
        boolean z = this.y;
        switch (b) {
            case 0:
                return Boolean.valueOf(z);
            case 1:
                if (z) {
                    xx6Var = xx6.z;
                } else {
                    xx6Var = xx6.y;
                }
                return new e9(xx6Var);
            case 2:
                sendFocusChange$lambda$18 = WebViewAdPlayer.sendFocusChange$lambda$18(z);
                return sendFocusChange$lambda$18;
            case 3:
                sendVisibilityChange$lambda$17 = WebViewAdPlayer.sendVisibilityChange$lambda$17(z);
                return sendVisibilityChange$lambda$17;
            default:
                sendMuteChange$lambda$16 = WebViewAdPlayer.sendMuteChange$lambda$16(z);
                return sendMuteChange$lambda$16;
        }
    }
}
