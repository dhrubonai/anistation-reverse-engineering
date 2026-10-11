package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ib4 {
    public final String a;
    public final Notification b;

    public ib4(String str, Notification notification) {
        this.a = str;
        this.b = notification;
    }

    public final void a(st2 st2Var) {
        String str = this.a;
        Notification notification = this.b;
        qt2 qt2Var = (qt2) st2Var;
        qt2Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(st2.c);
            obtain.writeString(str);
            obtain.writeInt(4201);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            if (qt2Var.e.transact(1, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method notify is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return h11.k(new StringBuilder("NotifyTask[packageName:"), this.a, ", id:4201, tag:null]");
    }
}
