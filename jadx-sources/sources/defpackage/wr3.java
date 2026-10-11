package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wr3 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ bs3 a;

    public wr3(bs3 bs3Var) {
        this.a = bs3Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.i(routingController);
    }
}
