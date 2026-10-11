package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mn5 extends ConnectivityManager.NetworkCallback {
    public static final mn5 a = new ConnectivityManager.NetworkCallback();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static void a() {
        int i;
        Object wx0Var;
        boolean canBeSatisfiedBy;
        ArrayList arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    Iterator it = c.entrySet().iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        ub2 ub2Var = (ub2) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        mn5 mn5Var = a;
                        NetworkCapabilities networkCapabilities = d;
                        mn5Var.getClass();
                        Boolean bool = f;
                        bool.getClass();
                        if (!bool.booleanValue()) {
                            canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(networkCapabilities);
                            if (canBeSatisfiedBy) {
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            wx0Var = vx0.a;
                        } else {
                            wx0Var = new wx0(7);
                        }
                        arrayList.add(new ai4(ub2Var, wx0Var));
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ai4 ai4Var = (ai4) obj;
                        ((ub2) ai4Var.x).invoke((xx0) ai4Var.y);
                    }
                    return;
                }
                xk3.d().a(b77.a, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        xk3.d().a(b77.a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (a34.i(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        xk3.d().a(b77.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        xk3.d().a(b77.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((ub2) it.next()).invoke(new wx0(7));
            }
        }
    }
}
