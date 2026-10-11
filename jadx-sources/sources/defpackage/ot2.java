package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ot2 implements pt2 {
    public IBinder e;

    @Override // defpackage.pt2
    public final void D(nt2 nt2Var, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(pt2.b);
            obtain.writeStrongInterface(nt2Var);
            obtain.writeInt(i);
            this.e.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.pt2
    public final void H(int i, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(pt2.b);
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.e.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }

    @Override // defpackage.pt2
    public final int o(nt2 nt2Var, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(pt2.b);
            obtain.writeStrongInterface(nt2Var);
            obtain.writeString(str);
            this.e.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
