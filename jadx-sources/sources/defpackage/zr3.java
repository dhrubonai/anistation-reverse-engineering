package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zr3 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bs3 b;

    public /* synthetic */ zr3(bs3 bs3Var, byte b) {
        this.a = b;
        this.b = bs3Var;
    }

    public void onRoutesAdded(List list) {
        switch (this.a) {
            case 0:
                this.b.h();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.a) {
            case 0:
                this.b.h();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.a) {
            case 0:
                this.b.h();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.a) {
            case 1:
                this.b.h();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
