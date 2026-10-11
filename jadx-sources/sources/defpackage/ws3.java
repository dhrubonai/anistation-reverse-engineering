package defpackage;

import android.media.MediaRouter;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ws3 extends MediaRouter.VolumeCallback {
    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        sm4 m = pm4.m(routeInfo);
        if (m != null) {
            qs3 qs3Var = m.a;
            qs3Var.getClass();
            rs3.b();
            ff2 c = rs3.c();
            int min = Math.min(qs3Var.q, Math.max(0, i));
            hs3 f = c.f(qs3Var);
            if (f != null) {
                f.f(min);
            }
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        hs3 f;
        sm4 m = pm4.m(routeInfo);
        if (m != null) {
            qs3 qs3Var = m.a;
            qs3Var.getClass();
            rs3.b();
            if (i != 0 && (f = rs3.c().f(qs3Var)) != null) {
                f.i(i);
            }
        }
    }
}
