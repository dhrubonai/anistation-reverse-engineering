package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.anistation.android.R;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pm4 extends js3 {
    public static final ArrayList P;
    public static final ArrayList Q;
    public final ff2 F;
    public final MediaRouter G;
    public final vs3 H;
    public final ws3 I;
    public final MediaRouter.RouteCategory J;
    public int K;
    public boolean L;
    public boolean M;
    public final ArrayList N;
    public final ArrayList O;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        P = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        Q = arrayList2;
        arrayList2.add(intentFilter2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ws3, android.media.MediaRouter$VolumeCallback] */
    public pm4(Context context, ff2 ff2Var) {
        super(context, new sn3((Object) new ComponentName(AndroidStaticDeviceInfoDataSource.PLATFORM_ANDROID, pm4.class.getName()), (byte) 4));
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.F = ff2Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.G = mediaRouter;
        this.H = new vs3(this);
        this.I = new MediaRouter.VolumeCallback();
        this.J = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        s();
    }

    public static sm4 m(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof sm4) {
            return (sm4) tag;
        }
        return null;
    }

    public static void t(sm4 sm4Var) {
        MediaRouter.UserRouteInfo userRouteInfo = sm4Var.b;
        qs3 qs3Var = sm4Var.a;
        userRouteInfo.setName(qs3Var.d);
        userRouteInfo.setPlaybackType(qs3Var.l);
        userRouteInfo.setPlaybackStream(qs3Var.m);
        userRouteInfo.setVolume(qs3Var.p);
        userRouteInfo.setVolumeMax(qs3Var.q);
        userRouteInfo.setVolumeHandling(qs3Var.b());
        userRouteInfo.setDescription(qs3Var.e);
    }

    @Override // defpackage.js3
    public final hs3 b(String str) {
        int j = j(str);
        if (j >= 0) {
            return new qm4(((rm4) this.N.get(j)).a);
        }
        return null;
    }

    @Override // defpackage.js3
    public final void e(ds3 ds3Var) {
        boolean z;
        int i = 0;
        if (ds3Var != null) {
            ds3Var.a();
            ArrayList c = ds3Var.b.c();
            int size = c.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) c.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i2 |= 2;
                } else {
                    i2 |= 8388608;
                }
                i++;
            }
            z = ds3Var.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.K == i && this.L == z) {
            return;
        }
        this.K = i;
        this.L = z;
        s();
    }

    public final boolean h(MediaRouter.RouteInfo routeInfo) {
        String format;
        String str;
        if (m(routeInfo) == null && i(routeInfo) < 0) {
            if (this.G.getDefaultRoute() == routeInfo) {
                format = "DEFAULT_ROUTE";
            } else {
                format = String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(l(routeInfo).hashCode()));
            }
            if (j(format) >= 0) {
                int i = 2;
                while (true) {
                    Locale locale = Locale.US;
                    str = format + "_" + i;
                    if (j(str) < 0) {
                        break;
                    }
                    i++;
                }
                format = str;
            }
            rm4 rm4Var = new rm4(routeInfo, format);
            r(rm4Var);
            this.N.add(rm4Var);
            return true;
        }
        return false;
    }

    public final int i(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((rm4) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int j(String str) {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((rm4) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int k(qs3 qs3Var) {
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((sm4) arrayList.get(i)).a == qs3Var) {
                return i;
            }
        }
        return -1;
    }

    public final String l(MediaRouter.RouteInfo routeInfo) {
        int i;
        Context context = this.x;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
            int deviceType = routeInfo.getDeviceType();
            if (deviceType != 1) {
                if (deviceType != 2) {
                    if (deviceType != 3) {
                        i = R.string.mr_route_name_unknown;
                    } else {
                        i = R.string.mr_route_name_bluetooth;
                    }
                } else {
                    i = R.string.mr_route_name_speaker;
                }
            } else {
                i = R.string.mr_route_name_tv;
            }
            return context.getString(i);
        }
        return "";
    }

    public final void n(qs3 qs3Var) {
        js3 a = qs3Var.a();
        MediaRouter mediaRouter = this.G;
        if (a != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.J);
            sm4 sm4Var = new sm4(qs3Var, createUserRoute);
            createUserRoute.setTag(sm4Var);
            createUserRoute.setVolumeCallback(this.I);
            t(sm4Var);
            this.O.add(sm4Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int i = i(mediaRouter.getSelectedRoute(8388611));
        if (i >= 0 && ((rm4) this.N.get(i)).b.equals(qs3Var.b)) {
            qs3Var.g(false);
        }
    }

    public final void o(qs3 qs3Var) {
        int k;
        if (qs3Var.a() != this && (k = k(qs3Var)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((sm4) this.O.remove(k)).b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.G.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
            }
        }
    }

    public final void p(qs3 qs3Var) {
        qs3Var.getClass();
        rs3.b();
        if (rs3.c().g() == qs3Var) {
            js3 a = qs3Var.a();
            MediaRouter mediaRouter = this.G;
            if (a != this) {
                int k = k(qs3Var);
                if (k >= 0) {
                    mediaRouter.selectRoute(8388611, ((sm4) this.O.get(k)).b);
                    return;
                }
                return;
            }
            int j = j(qs3Var.b);
            if (j >= 0) {
                mediaRouter.selectRoute(8388611, ((rm4) this.N.get(j)).a);
            }
        }
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            cs3 cs3Var = ((rm4) arrayList2.get(i)).c;
            if (cs3Var != null) {
                if (!arrayList.contains(cs3Var)) {
                    arrayList.add(cs3Var);
                } else {
                    ze0.k("route descriptor already added");
                    return;
                }
            } else {
                ze0.k("route must not be null");
                return;
            }
        }
        f(new u92(arrayList, false));
    }

    public final void r(rm4 rm4Var) {
        boolean z;
        String str = rm4Var.b;
        MediaRouter.RouteInfo routeInfo = rm4Var.a;
        zp2 zp2Var = new zp2(str, l(routeInfo));
        Bundle bundle = (Bundle) zp2Var.x;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            zp2Var.l(P);
        }
        if ((supportedTypes & 2) != 0) {
            zp2Var.l(Q);
        }
        bundle.putInt("playbackType", routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        if ((supportedTypes & 8388608) == 0) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("isSystemRoute", z);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (routeInfo.isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        bundle.putInt("deviceType", routeInfo.getDeviceType());
        rm4Var.c = zp2Var.q();
    }

    public final void s() {
        boolean z = this.M;
        vs3 vs3Var = this.H;
        MediaRouter mediaRouter = this.G;
        if (z) {
            mediaRouter.removeCallback(vs3Var);
        }
        this.M = true;
        mediaRouter.addCallback(this.K, vs3Var, (this.L ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z2 = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            z2 |= h((MediaRouter.RouteInfo) obj);
        }
        if (z2) {
            q();
        }
    }
}
