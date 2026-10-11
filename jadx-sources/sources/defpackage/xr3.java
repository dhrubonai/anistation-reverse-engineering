package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xr3 extends gs3 {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public cs3 o;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final a92 m = new a92(this, 6);
    public int n = -1;

    public xr3(MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        Messenger messenger;
        this.g = routingController;
        this.f = str;
        int i = bs3.Q;
        controlHints = routingController.getControlHints();
        if (controlHints == null) {
            messenger = null;
        } else {
            messenger = (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        }
        this.h = messenger;
        this.i = messenger != null ? new Messenger(new fu(this)) : null;
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.hs3
    public final void d() {
        this.g.release();
    }

    @Override // defpackage.hs3
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController != null) {
            routingController.setVolume(i);
            this.n = i;
            Handler handler = this.k;
            a92 a92Var = this.m;
            handler.removeCallbacks(a92Var);
            handler.postDelayed(a92Var, 1000L);
        }
    }

    @Override // defpackage.hs3
    public final void i(int i) {
        int volumeMax;
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int i2 = this.n;
        if (i2 < 0) {
            i2 = routingController.getVolume();
        }
        int i3 = i2 + i;
        volumeMax = this.g.getVolumeMax();
        int max = Math.max(0, Math.min(i3, volumeMax));
        this.n = max;
        this.g.setVolume(max);
        Handler handler = this.k;
        a92 a92Var = this.m;
        handler.removeCallbacks(a92Var);
        handler.postDelayed(a92Var, 1000L);
    }
}
