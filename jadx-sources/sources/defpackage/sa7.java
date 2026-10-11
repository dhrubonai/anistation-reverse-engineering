package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class sa7 implements IInterface {
    public final /* synthetic */ byte e;
    public final IBinder f;
    public final String g;

    public /* synthetic */ sa7(IBinder iBinder, String str, byte b) {
        this.e = b;
        this.f = iBinder;
        this.g = str;
    }

    public Parcel K() {
        byte b = this.e;
        String str = this.g;
        switch (b) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            case 2:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
            default:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(str);
                return obtain3;
        }
    }

    public Parcel L(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void M(Parcel parcel, int i) {
        Parcel obtain;
        byte b = this.e;
        IBinder iBinder = this.f;
        switch (b) {
            case 1:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void N(Parcel parcel) {
        try {
            this.f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public void O(Parcel parcel, int i) {
        try {
            this.f.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.e) {
            case 0:
                return this.f;
            case 1:
                return this.f;
            case 2:
                return this.f;
            default:
                return this.f;
        }
    }

    public Parcel b(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
