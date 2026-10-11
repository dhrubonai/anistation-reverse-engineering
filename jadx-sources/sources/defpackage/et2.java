package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class et2 implements gt2 {
    public IBinder e;

    @Override // defpackage.gt2
    public final void B(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            this.e.transact(12, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.gt2
    public final void d(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            this.e.transact(9, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.gt2
    public final void f(wn4 wn4Var) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            wn4Var.writeToParcel(obtain, 0);
            this.e.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
