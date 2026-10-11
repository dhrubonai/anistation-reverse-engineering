package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class i94 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Context y;
    public final /* synthetic */ w44 z;

    public /* synthetic */ i94(Context context, w44 w44Var, byte b) {
        this.x = b;
        this.y = context;
        this.z = w44Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.x;
        w44 w44Var = this.z;
        Context context = this.y;
        ci1 ci1Var = (ci1) obj;
        switch (b) {
            case 0:
                ci1Var.getClass();
                Object systemService = context.getSystemService("connectivity");
                systemService.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Network activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                boolean z2 = false;
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z = true;
                } else {
                    z = false;
                }
                if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                    z2 = true;
                }
                if (z && z2 && activeNetwork != null) {
                    linkedHashSet.add(activeNetwork);
                }
                x97.L(linkedHashSet, w44Var);
                j94 j94Var = new j94(linkedHashSet, w44Var);
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), j94Var);
                return new qj(connectivityManager, j94Var, (byte) 8);
            default:
                ci1Var.getClass();
                return new qj(context, w44Var, (byte) 9);
        }
    }
}
