package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ya8 {
    public final /* synthetic */ gi0 a;

    public ya8(gi0 gi0Var) {
        this.a = gi0Var;
    }

    public final void a() {
        gi0 gi0Var = this.a;
        xj7 xj7Var = gi0Var.e;
        if (xj7Var != null) {
            try {
                s25 s25Var = gi0Var.j;
                if (s25Var != null) {
                    s25Var.t();
                }
                oj7 oj7Var = (oj7) xj7Var;
                Parcel K = oj7Var.K();
                int i = nn7.a;
                K.writeInt(0);
                oj7Var.M(K, 1);
            } catch (RemoteException e) {
                gi0.m.a(e, "Unable to call %s on %s.", "onConnected", xj7.class.getSimpleName());
            }
            uw7 uw7Var = gi0Var.l;
            if (uw7Var != null) {
                ((kz) uw7Var.x).F(new co7(new ao7(3)));
            }
        }
    }
}
