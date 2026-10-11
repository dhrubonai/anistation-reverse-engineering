package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mt2 implements nt2 {
    public IBinder e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.nt2
    public final void k(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(nt2.a);
            obtain.writeStringArray(strArr);
            this.e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
