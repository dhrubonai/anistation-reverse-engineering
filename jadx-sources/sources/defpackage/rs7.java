package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rs7 extends BroadcastReceiver {
    public final z18 a;
    public boolean b;
    public boolean c;

    public rs7(z18 z18Var) {
        this.a = z18Var;
    }

    public final void a() {
        z18 z18Var = this.a;
        z18Var.l0();
        z18Var.f().L();
        z18Var.f().L();
        if (!this.b) {
            return;
        }
        z18Var.c().K.a("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        try {
            z18Var.I.x.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            z18Var.c().C.b(e, "Failed to unregister the network broadcast receiver");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z18 z18Var = this.a;
        z18Var.l0();
        String action = intent.getAction();
        z18Var.c().K.b(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            ls7 ls7Var = z18Var.y;
            z18.T(ls7Var);
            boolean P = ls7Var.P();
            if (this.c != P) {
                this.c = P;
                z18Var.f().U(new la(this, P));
                return;
            }
            return;
        }
        z18Var.c().F.b(action, "NetworkBroadcastReceiver received unknown action");
    }
}
