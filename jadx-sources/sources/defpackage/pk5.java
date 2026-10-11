package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pk5 {
    public static final zk3 c = new zk3("SessionManager", null);
    public final el7 a;
    public final Context b;

    public pk5(el7 el7Var, Context context) {
        this.a = el7Var;
        this.b = context;
    }

    public final void a(qk5 qk5Var) {
        if (qk5Var != null) {
            a34.s();
            try {
                el7 el7Var = this.a;
                lm7 lm7Var = new lm7(qk5Var);
                Parcel K = el7Var.K();
                nn7.c(K, lm7Var);
                el7Var.M(K, 2);
                return;
            } catch (RemoteException e) {
                c.a(e, "Unable to call %s on %s.", "addSessionManagerListener", el7.class.getSimpleName());
                return;
            }
        }
        qi2.m("SessionManagerListener can't be null");
    }

    public final void b(boolean z) {
        zk3 zk3Var = c;
        a34.s();
        try {
            Log.i(zk3Var.a, zk3Var.c("End session for %s", this.b.getPackageName()));
            el7 el7Var = this.a;
            Parcel K = el7Var.K();
            int i = nn7.a;
            K.writeInt(1);
            K.writeInt(z ? 1 : 0);
            el7Var.M(K, 6);
        } catch (RemoteException e) {
            zk3Var.a(e, "Unable to call %s on %s.", "endCurrentSession", el7.class.getSimpleName());
        }
    }

    public final gi0 c() {
        a34.s();
        kk5 d = d();
        if (d != null && (d instanceof gi0)) {
            return (gi0) d;
        }
        return null;
    }

    public final kk5 d() {
        a34.s();
        try {
            el7 el7Var = this.a;
            Parcel L = el7Var.L(el7Var.K(), 1);
            tt2 L2 = ic4.L(L.readStrongBinder());
            L.recycle();
            return (kk5) ic4.M(L2);
        } catch (RemoteException e) {
            c.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", el7.class.getSimpleName());
            return null;
        }
    }
}
