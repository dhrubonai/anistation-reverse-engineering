package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kk5 {
    public static final zk3 b = new zk3("Session", null);
    public final dl7 a;

    public kk5(Context context, String str, String str2) {
        dl7 dl7Var;
        try {
            dl7Var = il7.b(context).P(str, str2, new jm7(this));
        } catch (RemoteException | h04 e) {
            il7.a.a(e, "Unable to call %s on %s.", "newSessionImpl", yl7.class.getSimpleName());
            dl7Var = null;
        }
        this.a = dl7Var;
    }

    public final boolean a() {
        boolean z;
        a34.s();
        dl7 dl7Var = this.a;
        if (dl7Var != null) {
            try {
                uk7 uk7Var = (uk7) dl7Var;
                Parcel L = uk7Var.L(uk7Var.K(), 5);
                int i = nn7.a;
                if (L.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                L.recycle();
                return z;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "isConnected", dl7.class.getSimpleName());
            }
        }
        return false;
    }

    public final void b(int i) {
        dl7 dl7Var = this.a;
        if (dl7Var == null) {
            return;
        }
        try {
            uk7 uk7Var = (uk7) dl7Var;
            Parcel K = uk7Var.K();
            K.writeInt(i);
            uk7Var.M(K, 13);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "notifySessionEnded", dl7.class.getSimpleName());
        }
    }

    public final int c() {
        a34.s();
        dl7 dl7Var = this.a;
        if (dl7Var != null) {
            try {
                uk7 uk7Var = (uk7) dl7Var;
                Parcel L = uk7Var.L(uk7Var.K(), 17);
                int readInt = L.readInt();
                L.recycle();
                if (readInt >= 211100000) {
                    uk7 uk7Var2 = (uk7) dl7Var;
                    Parcel L2 = uk7Var2.L(uk7Var2.K(), 18);
                    int readInt2 = L2.readInt();
                    L2.recycle();
                    return readInt2;
                }
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getSessionStartType", dl7.class.getSimpleName());
            }
        }
        return 0;
    }

    public final tt2 d() {
        dl7 dl7Var = this.a;
        if (dl7Var != null) {
            try {
                uk7 uk7Var = (uk7) dl7Var;
                Parcel L = uk7Var.L(uk7Var.K(), 1);
                tt2 L2 = ic4.L(L.readStrongBinder());
                L.recycle();
                return L2;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "getWrappedObject", dl7.class.getSimpleName());
            }
        }
        return null;
    }
}
