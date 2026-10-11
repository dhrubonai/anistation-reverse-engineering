package defpackage;

import android.media.MediaRouter;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qm4 extends hs3 {
    public final MediaRouter.RouteInfo a;

    public qm4(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // defpackage.hs3
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // defpackage.hs3
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
