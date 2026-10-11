package com.anistation.navigation;

import com.anistation.navigation.Route;
import defpackage.a34;
import defpackage.ai4;
import defpackage.bi;
import defpackage.h41;
import defpackage.he1;
import defpackage.in5;
import defpackage.jn5;
import defpackage.ms;
import defpackage.ta0;
import defpackage.ti4;
import defpackage.ty4;
import defpackage.ut5;
import defpackage.vn3;
import defpackage.xt5;
import defpackage.yo0;
import defpackage.zt5;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a {
    public final in5 a;
    public final ty4 b;
    public final Set c;
    public final zt5 d;
    public final Map e;
    public final he1 f;
    public final ti4 g;
    public final ti4 h;

    public a(Route route) {
        route.getClass();
        in5 b = jn5.b(0, 1, ta0.y, 1);
        this.a = b;
        this.b = h41.c(b);
        Route.Home home = Route.Home.INSTANCE;
        Route.Schedule schedule = Route.Schedule.INSTANCE;
        Route.MyList myList = Route.MyList.INSTANCE;
        Route.Downloads downloads = Route.Downloads.INSTANCE;
        Route.Settings settings = Route.Settings.INSTANCE;
        this.c = ms.U0(new Route[]{home, schedule, myList, downloads, settings});
        this.d = xt5.f(route);
        this.e = vn3.T(new ai4(home, xt5.f(home)), new ai4(schedule, xt5.f(schedule)), new ai4(myList, xt5.f(myList)), new ai4(downloads, xt5.f(downloads)), new ai4(settings, xt5.f(settings)));
        this.f = ut5.b(new bi(this, (byte) 13));
        this.g = xt5.g(null);
        this.h = xt5.g(Boolean.TRUE);
    }

    public final Route a() {
        return (Route) yo0.r0((List) vn3.Q((Route) yo0.r0(this.d), this.e));
    }

    public final void b() {
        zt5 zt5Var = this.d;
        zt5 zt5Var2 = (zt5) vn3.Q((Route) yo0.r0(zt5Var), this.e);
        if (zt5Var2.size() > 1) {
            zt5Var2.remove(zt5Var2.size() - 1);
        } else if (zt5Var.size() > 1) {
            zt5Var.remove(zt5Var.size() - 1);
        }
    }

    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final void d(Route route) {
        route.getClass();
        if (this.c.contains(route)) {
            e(route);
        } else {
            ((zt5) vn3.Q((Route) yo0.r0(this.d), this.e)).add(route);
        }
    }

    public final void e(Route route) {
        route.getClass();
        if (this.c.contains(route)) {
            zt5 zt5Var = this.d;
            if (a34.i((Route) yo0.r0(zt5Var), route)) {
                zt5 zt5Var2 = (zt5) vn3.Q(route, this.e);
                if (zt5Var2.size() > 1) {
                    while (zt5Var2.size() > 1) {
                        zt5Var2.remove(zt5Var2.size() - 1);
                    }
                    return;
                } else {
                    this.a.d(route);
                    return;
                }
            }
            zt5Var.remove(route);
            zt5Var.add(route);
        }
    }
}
