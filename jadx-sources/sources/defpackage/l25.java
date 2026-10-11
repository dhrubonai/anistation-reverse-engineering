package defpackage;

import android.content.Context;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l25 {
    public final MediaRouter2 a;
    public final as3 b = new as3(this, 1);
    public final k25 c = new MediaRouter2$RouteCallback();
    public final Handler d = new Handler(Looper.getMainLooper());
    public final /* synthetic */ p25 e;

    /* JADX WARN: Type inference failed for: r1v3, types: [android.media.MediaRouter2$RouteCallback, k25] */
    public l25(p25 p25Var, Context context) {
        this.e = p25Var;
        this.a = MediaRouter2.getInstance(context);
    }

    public final rf1 a() {
        List<MediaRouter2.RoutingController> controllers = this.a.getControllers();
        if (controllers.size() != 2) {
            return p25.L;
        }
        MediaRouter2.RoutingController routingController = controllers.get(1);
        yq6 yq6Var = new yq6(1);
        yq6Var.b = 20;
        yq6Var.c = routingController.getId();
        return yq6Var.b();
    }

    public final void b() {
        MediaRouter2 mediaRouter2 = this.a;
        Handler handler = this.d;
        Objects.requireNonNull(handler);
        mediaRouter2.registerTransferCallback(new uw(handler, (byte) 1), this.b);
        MediaRouter2 mediaRouter22 = this.a;
        uw uwVar = new uw(handler, (byte) 1);
        z62 z62Var = nw2.y;
        mediaRouter22.registerRouteCallback(uwVar, this.c, new RouteDiscoveryPreference.Builder(o15.B, false).build());
    }

    public final void c() {
        this.a.unregisterTransferCallback(this.b);
        this.a.unregisterRouteCallback(this.c);
        this.d.removeCallbacksAndMessages(null);
    }
}
