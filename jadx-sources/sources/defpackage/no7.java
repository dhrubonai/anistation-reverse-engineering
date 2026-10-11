package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class no7 extends ua7 {
    public r30 f;
    public final int g;

    public no7(r30 r30Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", (byte) 2);
        this.f = r30Var;
        this.g = i;
    }

    @Override // defpackage.ua7
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        j75 j75Var;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                jv7 jv7Var = (jv7) fn7.a(parcel, jv7.CREATOR);
                fn7.c(parcel);
                r30 r30Var = this.f;
                a34.y(r30Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                a34.x(jv7Var);
                r30Var.x = jv7Var;
                if (r30Var.v()) {
                    mw0 mw0Var = jv7Var.A;
                    i75 n = i75.n();
                    if (mw0Var == null) {
                        j75Var = null;
                    } else {
                        j75Var = mw0Var.x;
                    }
                    synchronized (n) {
                        if (j75Var == null) {
                            j75Var = i75.A;
                        } else {
                            j75 j75Var2 = (j75) n.y;
                            if (j75Var2 != null) {
                                if (j75Var2.x < j75Var.x) {
                                }
                            }
                        }
                        n.y = j75Var;
                    }
                }
                Bundle bundle = jv7Var.x;
                a34.y(this.f, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f.t(readInt, readStrongBinder, bundle, this.g);
                this.f = null;
            } else {
                parcel.readInt();
                fn7.c(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) fn7.a(parcel, Bundle.CREATOR);
            fn7.c(parcel);
            a34.y(this.f, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f.t(readInt2, readStrongBinder2, bundle2, this.g);
            this.f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
