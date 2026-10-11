package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.anistation.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bs3 extends js3 {
    public static final /* synthetic */ int Q = 0;
    public final MediaRouter2 F;
    public final cn7 G;
    public final ArrayMap H;
    public final MediaRouter2$RouteCallback I;
    public final as3 J;
    public final wr3 K;
    public final uw L;
    public boolean M;
    public ArrayList N;
    public final ArrayMap O;
    public String P;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public bs3(Context context, cn7 cn7Var) {
        super(context, null);
        MediaRouter2 mediaRouter2;
        this.H = new ArrayMap();
        this.J = new as3(this, (byte) 0);
        this.K = new wr3(this);
        this.N = new ArrayList();
        this.O = new ArrayMap();
        mediaRouter2 = MediaRouter2.getInstance(context);
        this.F = mediaRouter2;
        this.G = cn7Var;
        this.L = new uw(new Handler(Looper.getMainLooper()), (byte) 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.I = new zr3(this, (byte) 1);
        } else {
            this.I = new zr3(this, (byte) 0);
        }
    }

    @Override // defpackage.js3
    public final gs3 a(String str, is3 is3Var) {
        Iterator it = this.H.entrySet().iterator();
        while (it.hasNext()) {
            xr3 xr3Var = (xr3) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, xr3Var.f)) {
                return xr3Var;
            }
        }
        return null;
    }

    @Override // defpackage.js3
    public final hs3 b(String str) {
        return new yr3((String) this.O.get(str), null);
    }

    @Override // defpackage.js3
    public final hs3 d(String str, String str2) {
        String id;
        String str3 = (String) this.O.get(str);
        for (xr3 xr3Var : this.H.values()) {
            cs3 cs3Var = xr3Var.o;
            if (cs3Var == null) {
                id = xr3Var.g.getId();
            } else {
                id = cs3Var.d();
            }
            if (TextUtils.equals(str2, id)) {
                return new yr3(str3, xr3Var);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new yr3(str3, null);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, gk2] */
    @Override // defpackage.js3
    public final void e(ds3 ds3Var) {
        int i;
        boolean z;
        if (rs3.c == null) {
            i = 0;
        } else {
            i = rs3.c().B;
        }
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.I;
        wr3 wr3Var = this.K;
        as3 as3Var = this.J;
        if (i <= 0) {
            this.F.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.F.unregisterTransferCallback(as3Var);
            this.F.unregisterControllerCallback(wr3Var);
            return;
        }
        us3 us3Var = rs3.c().u;
        if (us3Var == null) {
            z = false;
        } else {
            z = us3Var.c;
        }
        if (ds3Var == null) {
            ds3Var = new ds3(ks3.c, false);
        }
        ds3Var.a();
        ArrayList c = ds3Var.b.c();
        if (z) {
            if (!c.contains("android.media.intent.category.LIVE_AUDIO")) {
                c.add("android.media.intent.category.LIVE_AUDIO");
            }
        } else {
            c.remove("android.media.intent.category.LIVE_AUDIO");
        }
        ?? obj = new Object();
        obj.g(c);
        ds3 ds3Var2 = new ds3(obj.j(), ds3Var.b());
        MediaRouter2 mediaRouter2 = this.F;
        RouteDiscoveryPreference l = c4.l(ds3Var2);
        uw uwVar = this.L;
        mediaRouter2.registerRouteCallback(uwVar, mediaRouter2$RouteCallback, l);
        this.F.registerTransferCallback(uwVar, as3Var);
        this.F.registerControllerCallback(uwVar, wr3Var);
    }

    public final void h() {
        List routes;
        Bundle extras;
        String id;
        boolean isSystemRoute;
        String id2;
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        routes = this.F.getRoutes();
        Iterator it = routes.iterator();
        while (it.hasNext()) {
            MediaRoute2Info g = y3.g(it.next());
            if (g != null && !arraySet.contains(g)) {
                isSystemRoute = g.isSystemRoute();
                if (!isSystemRoute) {
                    if (this.M) {
                        id2 = g.getId();
                        if (!id2.startsWith(this.x.getPackageName() + "/")) {
                        }
                    }
                    arraySet.add(g);
                    arrayList.add(g);
                }
            }
        }
        if (arrayList.equals(this.N)) {
            return;
        }
        this.N = arrayList;
        ArrayMap arrayMap = this.O;
        arrayMap.clear();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            MediaRoute2Info g2 = y3.g(obj);
            extras = g2.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                id = g2.getId();
                arrayMap.put(id, extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + g2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.N;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            cs3 m = c4.m(y3.g(obj2));
            if (m != null) {
                arrayList3.add(m);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                cs3 cs3Var = (cs3) obj3;
                if (cs3Var != null) {
                    if (!arrayList5.contains(cs3Var)) {
                        arrayList5.add(cs3Var);
                    } else {
                        ze0.k("route descriptor already added");
                        return;
                    }
                } else {
                    ze0.k("route must not be null");
                    return;
                }
            }
        }
        f(new u92(arrayList5, true));
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, zp2] */
    public final void i(MediaRouter2.RoutingController routingController) {
        List selectedRoutes;
        Bundle controlHints;
        zp2 zp2Var;
        int volume;
        int volumeMax;
        int volumeHandling;
        List selectableRoutes;
        List deselectableRoutes;
        int i;
        String id;
        xr3 xr3Var = (xr3) this.H.get(routingController);
        if (xr3Var != null) {
            selectedRoutes = routingController.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
                return;
            }
            ArrayList d = c4.d(selectedRoutes);
            cs3 m = c4.m(y3.g(selectedRoutes.get(0)));
            controlHints = routingController.getControlHints();
            String string = this.x.getString(R.string.mr_dialog_default_group_name);
            cs3 cs3Var = null;
            if (controlHints != null) {
                try {
                    String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                    if (!TextUtils.isEmpty(string2)) {
                        string = string2;
                    }
                    Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                    if (bundle != null) {
                        cs3Var = new cs3(bundle);
                    }
                } catch (Exception e) {
                    Log.w("MR2Provider", "Exception while unparceling control hints.", e);
                }
            }
            if (cs3Var == null) {
                id = routingController.getId();
                zp2Var = new zp2(id, string);
                Bundle bundle2 = (Bundle) zp2Var.x;
                bundle2.putInt("connectionState", 2);
                bundle2.putInt("playbackType", 1);
            } else {
                ?? obj = new Object();
                obj.y = new ArrayList();
                obj.z = new ArrayList();
                obj.A = new HashSet();
                obj.x = new Bundle(cs3Var.a);
                obj.y = cs3Var.c();
                obj.z = cs3Var.b();
                obj.A = cs3Var.a();
                zp2Var = obj;
            }
            Bundle bundle3 = (Bundle) zp2Var.x;
            volume = routingController.getVolume();
            bundle3.putInt("volume", volume);
            volumeMax = routingController.getVolumeMax();
            bundle3.putInt("volumeMax", volumeMax);
            volumeHandling = routingController.getVolumeHandling();
            bundle3.putInt("volumeHandling", volumeHandling);
            ((ArrayList) zp2Var.z).clear();
            zp2Var.l(m.b());
            ((ArrayList) zp2Var.y).clear();
            zp2Var.m(d);
            cs3 q = zp2Var.q();
            selectableRoutes = routingController.getSelectableRoutes();
            ArrayList d2 = c4.d(selectableRoutes);
            deselectableRoutes = routingController.getDeselectableRoutes();
            ArrayList d3 = c4.d(deselectableRoutes);
            u92 u92Var = this.D;
            if (u92Var == null) {
                Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<cs3> list = u92Var.b;
            if (!list.isEmpty()) {
                for (cs3 cs3Var2 : list) {
                    String d4 = cs3Var2.d();
                    if (d.contains(d4)) {
                        i = 3;
                    } else {
                        i = 1;
                    }
                    d2.contains(d4);
                    d3.contains(d4);
                    arrayList.add(new fs3(cs3Var2, i));
                }
            }
            xr3Var.o = q;
            xr3Var.j(q, arrayList);
            return;
        }
        Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
    }
}
