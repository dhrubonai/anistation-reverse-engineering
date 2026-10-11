package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ua7 extends Binder implements IInterface {
    public final /* synthetic */ byte e;

    public ua7(String str, byte b) {
        this.e = b;
        switch (b) {
            case 2:
                attachInterface(this, str);
                return;
            default:
                attachInterface(this, str);
                return;
        }
    }

    public boolean K(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.e;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.e) {
            case 0:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                ib7 ib7Var = (ib7) this;
                boolean z = false;
                switch (i) {
                    case 3:
                        db7.b(parcel);
                        break;
                    case 4:
                        db7.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        db7.b(parcel);
                        break;
                    case 7:
                        db7.b(parcel);
                        break;
                    case 8:
                        sb7 sb7Var = (sb7) db7.a(parcel, sb7.CREATOR);
                        db7.b(parcel);
                        ib7Var.g.post(new yc2((byte) 12, ib7Var, sb7Var, z));
                        break;
                    case 9:
                        db7.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            case 1:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return K(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    if (super.onTransact(i, parcel, parcel2, i2)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return K(i, parcel, parcel2);
        }
    }
}
