package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w35 extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ x35 c;

    public w35(x35 x35Var) {
        this.c = x35Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.c.d.post(new v35(this, (byte) 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (!z) {
            this.c.d.post(new v35(this, (byte) 1));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        byte b = 1;
        x35 x35Var = this.c;
        if (z && this.b == hasCapability) {
            if (hasCapability) {
                x35Var.d.post(new v35(this, b));
            }
        } else {
            this.a = true;
            this.b = hasCapability;
            x35Var.d.post(new v35(this, (byte) 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.c.d.post(new v35(this, (byte) 0));
    }
}
