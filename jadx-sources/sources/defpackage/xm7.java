package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xm7 extends ls3 {
    public static final zk3 f = new zk3("MRDiscoveryCallback", null);
    public final fk7 e;
    public final Map c = Collections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = Collections.synchronizedSet(new LinkedHashSet());
    public final um7 a = new um7(this);

    public xm7(Context context) {
        this.e = new fk7(context);
    }

    @Override // defpackage.ls3
    public final void a(rs3 rs3Var, qs3 qs3Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        h(qs3Var, true);
    }

    @Override // defpackage.ls3
    public final void b(rs3 rs3Var, qs3 qs3Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        h(qs3Var, true);
    }

    @Override // defpackage.ls3
    public final void e(rs3 rs3Var, qs3 qs3Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        h(qs3Var, false);
    }

    public final void h(qs3 qs3Var, boolean z) {
        boolean z2;
        Set h;
        boolean remove;
        zk3 zk3Var = f;
        zk3Var.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), qs3Var);
        Map map = this.c;
        synchronized (map) {
            try {
                String valueOf = String.valueOf(map.keySet());
                StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                sb.append("appIdToRouteInfo has these appId route keys: ");
                sb.append(valueOf);
                zk3Var.b(sb.toString(), new Object[0]);
                z2 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    qm7 qm7Var = (qm7) entry.getValue();
                    if (qs3Var.e(qm7Var.b)) {
                        if (z) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
                            sb2.append("Adding/updating route for appId ");
                            sb2.append(str);
                            zk3Var.b(sb2.toString(), new Object[0]);
                            remove = qm7Var.a.add(qs3Var);
                            if (!remove) {
                                String valueOf2 = String.valueOf(qs3Var);
                                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 32 + String.valueOf(str).length());
                                sb3.append("Route ");
                                sb3.append(valueOf2);
                                sb3.append(" already exists for appId ");
                                sb3.append(str);
                                Log.w(zk3Var.a, zk3Var.c(sb3.toString(), new Object[0]));
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 25);
                            sb4.append("Removing route for appId ");
                            sb4.append(str);
                            zk3Var.b(sb4.toString(), new Object[0]);
                            remove = qm7Var.a.remove(qs3Var);
                            if (!remove) {
                                String valueOf3 = String.valueOf(qs3Var);
                                StringBuilder sb5 = new StringBuilder(valueOf3.length() + 34 + String.valueOf(str).length());
                                sb5.append("Route ");
                                sb5.append(valueOf3);
                                sb5.append(" already removed from appId ");
                                sb5.append(str);
                                Log.w(zk3Var.a, zk3Var.c(sb5.toString(), new Object[0]));
                            }
                        }
                        z2 = remove;
                    }
                }
            } finally {
            }
        }
        if (z2) {
            f.b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.b) {
                try {
                    HashMap hashMap = new HashMap();
                    Map map2 = this.c;
                    synchronized (map2) {
                        for (String str2 : map2.keySet()) {
                            qm7 qm7Var2 = (qm7) map2.get(gy5.s(str2));
                            if (qm7Var2 == null) {
                                int i = bu7.B;
                                h = uu7.I;
                            } else {
                                LinkedHashSet linkedHashSet = qm7Var2.a;
                                int i2 = bu7.B;
                                Object[] array = linkedHashSet.toArray();
                                h = bu7.h(array, array.length);
                            }
                            if (!h.isEmpty()) {
                                hashMap.put(str2, h);
                            }
                        }
                    }
                    su7.a(hashMap.entrySet());
                    Iterator it = this.b.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void i() {
        int size = this.d.size();
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 33);
        sb.append("Starting RouteDiscovery with ");
        sb.append(size);
        sb.append(" IDs");
        byte b = 0;
        zk3 zk3Var = f;
        zk3Var.b(sb.toString(), new Object[0]);
        zk3Var.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            j();
        } else {
            new h15(Looper.getMainLooper(), (byte) 4).post(new wm7(this, b));
        }
    }

    public final void j() {
        fk7 fk7Var = this.e;
        rs3 rs3Var = (rs3) fk7Var.y;
        if (rs3Var == null) {
            rs3Var = rs3.d((Context) fk7Var.x);
            fk7Var.y = rs3Var;
        }
        rs3Var.e(this);
        LinkedHashSet linkedHashSet = this.d;
        synchronized (linkedHashSet) {
            try {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String p = x97.p(str);
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(p)) {
                        arrayList.add(p);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    ks3 ks3Var = new ks3(bundle, arrayList);
                    Map map = this.c;
                    if (((qm7) map.get(str)) == null) {
                        map.put(str, new qm7(ks3Var));
                    }
                    zk3 zk3Var = f;
                    String p2 = x97.p(str);
                    StringBuilder sb = new StringBuilder(p2.length() + 49);
                    sb.append("Adding mediaRouter callback for control category ");
                    sb.append(p2);
                    zk3Var.b(sb.toString(), new Object[0]);
                    rs3 rs3Var2 = (rs3) fk7Var.y;
                    if (rs3Var2 == null) {
                        rs3Var2 = rs3.d((Context) fk7Var.x);
                        fk7Var.y = rs3Var2;
                    }
                    rs3Var2.a(ks3Var, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map2 = this.c;
        f.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
    }
}
