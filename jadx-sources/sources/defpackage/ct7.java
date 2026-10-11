package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ct7 implements ServiceConnection {
    public final String x;
    public final /* synthetic */ et7 y;

    public ct7(et7 et7Var, String str) {
        Objects.requireNonNull(et7Var);
        this.y = et7Var;
        this.x = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [bn7] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ?? r1;
        et7 et7Var = this.y;
        if (iBinder != null) {
            try {
                int i = zm7.e;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof bn7) {
                    r1 = (bn7) queryLocalInterface;
                } else {
                    r1 = new sa7(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", (byte) 3);
                }
                gu7 gu7Var = et7Var.x;
                es7 es7Var = gu7Var.C;
                gu7.l(es7Var);
                es7Var.K.a("Install Referrer Service connected");
                au7 au7Var = gu7Var.D;
                gu7.l(au7Var);
                au7Var.U(new yc2(this, (bn7) r1, this));
                return;
            } catch (RuntimeException e) {
                es7 es7Var2 = et7Var.x.C;
                gu7.l(es7Var2);
                es7Var2.F.b(e, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        es7 es7Var3 = et7Var.x.C;
        gu7.l(es7Var3);
        es7Var3.F.a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        es7 es7Var = this.y.x.C;
        gu7.l(es7Var);
        es7Var.K.a("Install Referrer Service disconnected");
    }
}
