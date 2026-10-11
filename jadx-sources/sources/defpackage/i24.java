package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i24 extends Binder implements nt2 {
    public final /* synthetic */ l24 e;

    public i24(l24 l24Var) {
        this.e = l24Var;
        attachInterface(this, nt2.a);
    }

    @Override // defpackage.nt2
    public final void k(String[] strArr) {
        strArr.getClass();
        l24 l24Var = this.e;
        tl7.z(l24Var.d, null, null, new e0(strArr, l24Var, null, (byte) 25), 3);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = nt2.a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        k(parcel.createStringArray());
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
