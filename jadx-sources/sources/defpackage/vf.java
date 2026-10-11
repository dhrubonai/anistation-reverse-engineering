package defpackage;

import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.adquality.AndroidUpdateAdQualitySessionToken;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vf implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;

    public /* synthetic */ vf(String str, byte b) {
        this.x = b;
        this.y = str;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        WebViewEvent onBroadcastEvent$lambda$23;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        String str = this.y;
        switch (b) {
            case 0:
                return AndroidUpdateAdQualitySessionToken.a(str);
            case 1:
                si siVar = si.a;
                si.a(str);
                return pn6Var;
            case 2:
                return new li4(2, new ArrayList(new xr(new Object[]{str}, false)));
            case 3:
                return bl3.b(str);
            case 4:
                si siVar2 = si.a;
                si.a(str);
                return pn6Var;
            default:
                onBroadcastEvent$lambda$23 = WebViewAdPlayer.onBroadcastEvent$lambda$23(str);
                return onBroadcastEvent$lambda$23;
        }
    }
}
