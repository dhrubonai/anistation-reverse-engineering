package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class om7 extends ls3 {
    public static final zk3 d = new zk3("MediaRouterCallback", null);
    public final hm7 a;
    public final dn7 b;
    public final qn7 c;

    public om7(hm7 hm7Var, dn7 dn7Var, qn7 qn7Var) {
        a34.x(hm7Var);
        this.a = hm7Var;
        this.b = dn7Var;
        this.c = qn7Var;
    }

    @Override // defpackage.ls3
    public final void a(rs3 rs3Var, qs3 qs3Var) {
        try {
            hm7 hm7Var = this.a;
            String str = qs3Var.c;
            Bundle bundle = qs3Var.s;
            Parcel K = hm7Var.K();
            K.writeString(str);
            nn7.b(K, bundle);
            hm7Var.M(K, 1);
        } catch (RemoteException e) {
            d.a(e, "Unable to call %s on %s.", "onRouteAdded", hm7.class.getSimpleName());
        }
        h(rs3Var);
    }

    @Override // defpackage.ls3
    public final void b(rs3 rs3Var, qs3 qs3Var) {
        rs3.b();
        if (rs3.c().g() == qs3Var) {
            try {
                hm7 hm7Var = this.a;
                String str = qs3Var.c;
                Bundle bundle = qs3Var.s;
                Parcel K = hm7Var.K();
                K.writeString(str);
                nn7.b(K, bundle);
                hm7Var.M(K, 2);
            } catch (RemoteException e) {
                d.a(e, "Unable to call %s on %s.", "onRouteChanged", hm7.class.getSimpleName());
            }
            h(rs3Var);
        }
    }

    @Override // defpackage.ls3
    public final void c(qs3 qs3Var, qs3 qs3Var2) {
        int i = qs3Var.l;
        String str = qs3Var.c;
        zk3 zk3Var = d;
        if (i != 1) {
            Log.i(zk3Var.a, zk3Var.c("ignore onRouteConnected for non-remote connected routeId: %s", str));
            return;
        }
        Log.i(zk3Var.a, zk3Var.c("onRouteConnected with connectedRouteId = %s", str));
        this.b.m = true;
        try {
            hm7 hm7Var = this.a;
            Parcel L = hm7Var.L(hm7Var.K(), 7);
            int readInt = L.readInt();
            L.recycle();
            String str2 = qs3Var2.c;
            if (readInt >= 251600000) {
                Bundle bundle = qs3Var.s;
                Parcel K = hm7Var.K();
                K.writeString(str2);
                K.writeString(str);
                nn7.b(K, bundle);
                hm7Var.M(K, 9);
                return;
            }
            Bundle bundle2 = qs3Var.s;
            Parcel K2 = hm7Var.K();
            K2.writeString(str2);
            K2.writeString(str);
            nn7.b(K2, bundle2);
            hm7Var.M(K2, 8);
        } catch (RemoteException e) {
            zk3Var.a(e, "Unable to call %s on %s.", "onRouteConnected", hm7.class.getSimpleName());
        }
    }

    @Override // defpackage.ls3
    public final void d(qs3 qs3Var, qs3 qs3Var2, int i) {
        String str = qs3Var2.c;
        zk3 zk3Var = d;
        if (qs3Var != null) {
            String str2 = qs3Var.c;
            if (qs3Var.l == 1) {
                Log.i(zk3Var.a, zk3Var.c("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str2, str, Integer.valueOf(i)));
                this.b.m = false;
                try {
                    hm7 hm7Var = this.a;
                    Parcel L = hm7Var.L(hm7Var.K(), 7);
                    int readInt = L.readInt();
                    L.recycle();
                    if (readInt >= 251600000) {
                        Bundle bundle = qs3Var.s;
                        Parcel K = hm7Var.K();
                        K.writeString(str);
                        K.writeString(str2);
                        nn7.b(K, bundle);
                        K.writeInt(i);
                        hm7Var.M(K, 10);
                        return;
                    }
                    Bundle bundle2 = qs3Var.s;
                    Parcel K2 = hm7Var.K();
                    K2.writeString(str2);
                    nn7.b(K2, bundle2);
                    K2.writeInt(i);
                    hm7Var.M(K2, 6);
                    return;
                } catch (RemoteException e) {
                    zk3Var.a(e, "Unable to call %s on %s.", "onRouteDisconnected", hm7.class.getSimpleName());
                    return;
                }
            }
        }
        Log.i(zk3Var.a, zk3Var.c("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]));
    }

    @Override // defpackage.ls3
    public final void e(rs3 rs3Var, qs3 qs3Var) {
        try {
            hm7 hm7Var = this.a;
            String str = qs3Var.c;
            Bundle bundle = qs3Var.s;
            Parcel K = hm7Var.K();
            K.writeString(str);
            nn7.b(K, bundle);
            hm7Var.M(K, 3);
        } catch (RemoteException e) {
            d.a(e, "Unable to call %s on %s.", "onRouteRemoved", hm7.class.getSimpleName());
        }
        h(rs3Var);
    }

    @Override // defpackage.ls3
    public final void f(rs3 rs3Var, qs3 qs3Var, int i, qs3 qs3Var2) {
        int i2 = qs3Var.l;
        String str = qs3Var.c;
        zk3 zk3Var = d;
        if (i2 != 1) {
            Log.i(zk3Var.a, zk3Var.c("ignore onRouteSelected for non-remote selected routeId: %s", str));
            return;
        }
        Log.i(zk3Var.a, zk3Var.c("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), str));
        try {
            hm7 hm7Var = this.a;
            Parcel L = hm7Var.L(hm7Var.K(), 7);
            int readInt = L.readInt();
            L.recycle();
            if (readInt >= 220400000) {
                String str2 = qs3Var2.c;
                Bundle bundle = qs3Var.s;
                Parcel K = hm7Var.K();
                K.writeString(str2);
                K.writeString(str);
                nn7.b(K, bundle);
                hm7Var.M(K, 8);
            } else {
                String str3 = qs3Var2.c;
                Bundle bundle2 = qs3Var.s;
                Parcel K2 = hm7Var.K();
                K2.writeString(str3);
                nn7.b(K2, bundle2);
                hm7Var.M(K2, 4);
            }
        } catch (RemoteException e) {
            zk3Var.a(e, "Unable to call %s on %s.", "onRouteSelected", hm7.class.getSimpleName());
        }
        h(rs3Var);
    }

    @Override // defpackage.ls3
    public final void g(rs3 rs3Var, qs3 qs3Var, int i) {
        int i2 = qs3Var.l;
        String str = qs3Var.c;
        zk3 zk3Var = d;
        if (i2 != 1) {
            Log.i(zk3Var.a, zk3Var.c("ignore onRouteUnselected for non-remote routeId: %s", str));
            return;
        }
        Log.i(zk3Var.a, zk3Var.c("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), str));
        try {
            hm7 hm7Var = this.a;
            Bundle bundle = qs3Var.s;
            Parcel K = hm7Var.K();
            K.writeString(str);
            nn7.b(K, bundle);
            K.writeInt(i);
            hm7Var.M(K, 6);
        } catch (RemoteException e) {
            zk3Var.a(e, "Unable to call %s on %s.", "onRouteUnselected", hm7.class.getSimpleName());
        }
        h(rs3Var);
    }

    public final void h(rs3 rs3Var) {
        gi0 gi0Var;
        qn7 qn7Var = this.c;
        if (qn7Var != null && qn7Var.e && qn7Var.a.N) {
            pk5 pk5Var = qn7Var.f;
            if (pk5Var != null) {
                gi0Var = pk5Var.c();
            } else {
                gi0Var = null;
            }
            if (gi0Var == null) {
                rs3Var.getClass();
                rs3.f(null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            rs3Var.getClass();
            rs3.b();
            ArrayList arrayList2 = rs3.c().i;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                qs3 qs3Var = (qs3) obj;
                if (CastDevice.c(qs3Var.s) != null) {
                    arrayList.add(new u75(new tv(qs3Var.c, (byte) 3)));
                }
            }
            qn7.g.b("updateRouteListingPreference with %d available routes", Integer.valueOf(arrayList.size()));
            u92 u92Var = new u92((byte) 2);
            u92Var.b = Collections.EMPTY_LIST;
            u92Var.c = true;
            u92Var.b = Collections.unmodifiableList(new ArrayList(arrayList));
            rs3.f(new v75(u92Var));
        }
    }
}
