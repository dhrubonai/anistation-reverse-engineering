package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class as3 extends MediaRouter2$TransferCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ as3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bs3 bs3Var = (bs3) obj;
                bs3Var.P = null;
                hs3 hs3Var = (hs3) bs3Var.H.remove(routingController);
                if (hs3Var != null) {
                    ff2 ff2Var = (ff2) ((bs3) obj).G.x;
                    if (hs3Var == ff2Var.e) {
                        qs3 c = ff2Var.c();
                        if (ff2Var.g() != c) {
                            ff2Var.k(c, 2, true);
                            return;
                        }
                        return;
                    }
                    int i = ff2.E;
                    return;
                }
                Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
                return;
            default:
                l25 l25Var = (l25) obj;
                p25 p25Var = l25Var.e;
                rf1 rf1Var = p25Var.K;
                rf1 a = l25Var.a();
                p25Var.K = a;
                if (!a.equals(rf1Var)) {
                    p25Var.n.g(29, new xv3(a, (byte) 8));
                    return;
                }
                return;
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        MediaRouter2.RoutingController systemController;
        List selectedRoutes;
        String id;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bs3 bs3Var = (bs3) obj;
                qs3 qs3Var = null;
                bs3Var.P = null;
                bs3Var.H.remove(routingController);
                systemController = ((bs3) obj).F.getSystemController();
                if (routingController2 != systemController) {
                    selectedRoutes = routingController2.getSelectedRoutes();
                    if (selectedRoutes.isEmpty()) {
                        Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                        return;
                    }
                    int i = 0;
                    id = y3.g(selectedRoutes.get(0)).getId();
                    ((bs3) obj).H.put(routingController2, new xr3(routingController2, id));
                    ff2 ff2Var = (ff2) ((bs3) obj).G.x;
                    ArrayList arrayList = ff2Var.i;
                    int size = arrayList.size();
                    while (true) {
                        if (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            qs3 qs3Var2 = (qs3) obj2;
                            if (qs3Var2.a() == ff2Var.r && TextUtils.equals(id, qs3Var2.b)) {
                                qs3Var = qs3Var2;
                            }
                        }
                    }
                    if (qs3Var == null) {
                        Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
                    } else {
                        ff2Var.k(qs3Var, 3, true);
                    }
                    ((bs3) obj).i(routingController2);
                    return;
                }
                ff2 ff2Var2 = (ff2) ((bs3) obj).G.x;
                qs3 c = ff2Var2.c();
                if (ff2Var2.g() != c) {
                    ff2Var2.k(c, 3, true);
                    return;
                }
                return;
            default:
                l25 l25Var = (l25) obj;
                p25 p25Var = l25Var.e;
                rf1 rf1Var = p25Var.K;
                rf1 a = l25Var.a();
                p25Var.K = a;
                if (!a.equals(rf1Var)) {
                    p25Var.n.g(29, new xv3(a, (byte) 8));
                    return;
                }
                return;
        }
    }

    public void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        switch (this.a) {
            case 0:
                ((bs3) this.b).P = null;
                Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
                return;
            default:
                super.onTransferFailure(mediaRoute2Info);
                return;
        }
    }
}
