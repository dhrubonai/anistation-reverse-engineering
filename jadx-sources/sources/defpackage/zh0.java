package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zh0 extends y2 {
    public final ob4 A;
    public final boolean B;
    public final boolean C;
    public final String x;
    public final String y;
    public final pl7 z;
    public static final zk3 D = new zk3("CastMediaOptions", null);
    public static final Parcelable.Creator<zh0> CREATOR = new c55(12);

    /* JADX WARN: Multi-variable type inference failed */
    public zh0(String str, String str2, IBinder iBinder, ob4 ob4Var, boolean z, boolean z2) {
        pl7 sa7Var;
        this.x = str;
        this.y = str2;
        if (iBinder == null) {
            sa7Var = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof pl7) {
                sa7Var = (pl7) queryLocalInterface;
            } else {
                sa7Var = new sa7(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", (byte) 1);
            }
        }
        this.z = sa7Var;
        this.A = ob4Var;
        this.B = z;
        this.C = z2;
    }

    public final void c() {
        pl7 pl7Var = this.z;
        if (pl7Var != null) {
            try {
                Parcel L = pl7Var.L(pl7Var.K(), 2);
                tt2 L2 = ic4.L(L.readStrongBinder());
                L.recycle();
                if (ic4.M(L2) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                D.a(e, "Unable to call %s on %s.", "getWrappedClientObject", pl7.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.y);
        pl7 pl7Var = this.z;
        if (pl7Var == null) {
            iBinder = null;
        } else {
            iBinder = pl7Var.f;
        }
        z51.c0(parcel, 4, iBinder);
        z51.l0(parcel, 5, this.A, i);
        z51.r0(parcel, 6, 4);
        parcel.writeInt(this.B ? 1 : 0);
        z51.r0(parcel, 7, 4);
        parcel.writeInt(this.C ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
