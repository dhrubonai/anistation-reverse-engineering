package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zb7 extends y2 {
    public static final Parcelable.Creator<zb7> CREATOR = new c55((byte) 10);
    public final boolean A;
    public final boolean B;
    public final int x;
    public final IBinder y;
    public final hw0 z;

    public zb7(int i, IBinder iBinder, hw0 hw0Var, boolean z, boolean z2) {
        this.x = i;
        this.y = iBinder;
        this.z = hw0Var;
        this.A = z;
        this.B = z2;
    }

    public final boolean equals(Object obj) {
        Object sa7Var;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof zb7) {
                    zb7 zb7Var = (zb7) obj;
                    if (this.z.equals(zb7Var.z)) {
                        Object obj2 = null;
                        IBinder iBinder = this.y;
                        if (iBinder == null) {
                            sa7Var = null;
                        } else {
                            int i = s4.f;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof at2) {
                                sa7Var = (at2) queryLocalInterface;
                            } else {
                                sa7Var = new sa7(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
                            }
                        }
                        IBinder iBinder2 = zb7Var.y;
                        if (iBinder2 != null) {
                            int i2 = s4.f;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof at2) {
                                obj2 = (at2) queryLocalInterface2;
                            } else {
                                obj2 = new sa7(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
                            }
                        }
                        if (bx7.q(sa7Var, obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.c0(parcel, 2, this.y);
        z51.l0(parcel, 3, this.z, i);
        z51.r0(parcel, 4, 4);
        parcel.writeInt(this.A ? 1 : 0);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.B ? 1 : 0);
        z51.t0(parcel, s0);
    }
}
