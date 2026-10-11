package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vs3 extends MediaRouter.Callback {
    public final pm4 a;

    public vs3(pm4 pm4Var) {
        this.a = pm4Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        pm4 pm4Var = this.a;
        if (pm4Var.h(routeInfo)) {
            pm4Var.q();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        pm4 pm4Var;
        int i;
        if (pm4.m(routeInfo) == null && (i = (pm4Var = this.a).i(routeInfo)) >= 0) {
            pm4Var.r((rm4) pm4Var.N.get(i));
            pm4Var.q();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        pm4 pm4Var = this.a;
        int i2 = pm4Var.i(routeInfo);
        if (i2 >= 0) {
            rm4 rm4Var = (rm4) pm4Var.N.get(i2);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i = presentationDisplay.getDisplayId();
            } else {
                i = -1;
            }
            if (i != rm4Var.c.a.getInt("presentationDisplayId", -1)) {
                cs3 cs3Var = rm4Var.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (cs3Var != null) {
                    Bundle bundle = new Bundle(cs3Var.a);
                    ArrayList c = cs3Var.c();
                    ArrayList b = cs3Var.b();
                    HashSet a = cs3Var.a();
                    bundle.putInt("presentationDisplayId", i);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                    rm4Var.c = new cs3(bundle);
                    pm4Var.q();
                    return;
                }
                ze0.k("descriptor must not be null");
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        pm4 pm4Var;
        int i;
        if (pm4.m(routeInfo) == null && (i = (pm4Var = this.a).i(routeInfo)) >= 0) {
            pm4Var.N.remove(i);
            pm4Var.q();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        qs3 a;
        pm4 pm4Var = this.a;
        if (routeInfo == pm4Var.G.getSelectedRoute(8388611)) {
            sm4 m = pm4.m(routeInfo);
            if (m != null) {
                m.a.g(false);
                return;
            }
            int i2 = pm4Var.i(routeInfo);
            if (i2 >= 0) {
                rm4 rm4Var = (rm4) pm4Var.N.get(i2);
                ff2 ff2Var = pm4Var.F;
                String str = rm4Var.b;
                ff2Var.a.removeMessages(262);
                ps3 d = ff2Var.d(ff2Var.s);
                if (d != null && (a = d.a(str)) != null) {
                    a.g(false);
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        pm4 pm4Var;
        int i;
        if (pm4.m(routeInfo) == null && (i = (pm4Var = this.a).i(routeInfo)) >= 0) {
            rm4 rm4Var = (rm4) pm4Var.N.get(i);
            int volume = routeInfo.getVolume();
            if (volume != rm4Var.c.a.getInt("volume")) {
                cs3 cs3Var = rm4Var.c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (cs3Var != null) {
                    Bundle bundle = new Bundle(cs3Var.a);
                    ArrayList c = cs3Var.c();
                    ArrayList b = cs3Var.b();
                    HashSet a = cs3Var.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                    rm4Var.c = new cs3(bundle);
                    pm4Var.q();
                    return;
                }
                ze0.k("descriptor must not be null");
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
    }
}
