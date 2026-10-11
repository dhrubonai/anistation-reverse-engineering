package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lk1 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public final Object b;

    public lk1(r82 r82Var) {
        this.a = (byte) 1;
        this.b = r82Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                network.getClass();
                st3 st3Var = (st3) this.b;
                sx5 sx5Var = (sx5) st3Var.y;
                mk1 C = st3Var.C();
                sx5Var.getClass();
                sx5Var.l(null, C);
                return;
            case 1:
            default:
                super.onAvailable(network);
                return;
            case 2:
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                st3 st3Var = (st3) obj;
                sx5 sx5Var = (sx5) st3Var.y;
                mk1 C = st3Var.C();
                sx5Var.getClass();
                sx5Var.l(null, C);
                return;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                xk3.d().a(b77.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((r82) obj).invoke(vx0.a);
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.a) {
            case 2:
                ((jp7) this.b).a(network, linkProperties);
                return;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                network.getClass();
                st3 st3Var = (st3) this.b;
                sx5 sx5Var = (sx5) st3Var.y;
                mk1 C = st3Var.C();
                sx5Var.getClass();
                sx5Var.l(null, C);
                return;
            case 1:
                network.getClass();
                xk3.d().a(b77.a, "NetworkRequestConstraintController onLost callback");
                ((r82) this.b).invoke(new wx0(7));
                return;
            default:
                jp7 jp7Var = (jp7) this.b;
                synchronized (jp7Var.h) {
                    try {
                        jp7.l.b("the network is lost", new Object[0]);
                        if (jp7Var.e.remove(network)) {
                            jp7Var.d.remove(network);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                jp7Var.b();
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 2:
                jp7 jp7Var = (jp7) this.b;
                synchronized (jp7Var.h) {
                    jp7.l.b("all networks are unavailable.", new Object[0]);
                    jp7Var.d.clear();
                    jp7Var.e.clear();
                }
                jp7Var.b();
                return;
            default:
                super.onUnavailable();
                return;
        }
    }

    public /* synthetic */ lk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(Network network) {
    }
}
