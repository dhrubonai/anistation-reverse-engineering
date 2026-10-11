package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j94 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ LinkedHashSet a;
    public final /* synthetic */ w44 b;

    public j94(LinkedHashSet linkedHashSet, w44 w44Var) {
        this.a = linkedHashSet;
        this.b = w44Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        boolean hasCapability = networkCapabilities.hasCapability(12);
        boolean hasCapability2 = networkCapabilities.hasCapability(16);
        LinkedHashSet linkedHashSet = this.a;
        if (hasCapability && hasCapability2) {
            linkedHashSet.add(network);
        } else {
            linkedHashSet.remove(network);
        }
        x97.L(linkedHashSet, this.b);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        LinkedHashSet linkedHashSet = this.a;
        linkedHashSet.remove(network);
        x97.L(linkedHashSet, this.b);
    }
}
