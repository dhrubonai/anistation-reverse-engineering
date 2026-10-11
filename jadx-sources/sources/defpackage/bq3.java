package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bq3 extends Binder implements gt2 {
    public final WeakReference e;

    public bq3() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.e = new WeakReference(null);
    }

    @Override // defpackage.gt2
    public final void B(int i) {
        if (this.e.get() == null) {
            return;
        }
        ov3.d();
    }

    @Override // defpackage.gt2
    public final void d(int i) {
        if (this.e.get() == null) {
            return;
        }
        ov3.d();
    }

    @Override // defpackage.gt2
    public final void f(wn4 wn4Var) {
        if (this.e.get() == null) {
            return;
        }
        ov3.d();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        wn4 wn4Var;
        if (i != 3) {
            if (i != 9) {
                if (i != 1598968902) {
                    WeakReference weakReference = this.e;
                    switch (i) {
                        case 11:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            parcel.readInt();
                            if (weakReference.get() != null) {
                                ov3.d();
                                return false;
                            }
                            return true;
                        case 12:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            B(parcel.readInt());
                            return true;
                        case 13:
                            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (weakReference.get() != null) {
                                ov3.d();
                                return false;
                            }
                            return true;
                        default:
                            return super.onTransact(i, parcel, parcel2, i2);
                    }
                }
                parcel2.getClass();
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            d(parcel.readInt());
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (parcel.readInt() != 0) {
            wn4Var = wn4.CREATOR.createFromParcel(parcel);
        } else {
            wn4Var = null;
        }
        f(wn4Var);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
