package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ra7 extends y2 implements a55 {
    public static final Parcelable.Creator<ra7> CREATOR = new c55(3);
    public final int x;
    public final int y;
    public final Intent z;

    public ra7(int i, int i2, Intent intent) {
        this.x = i;
        this.y = i2;
        this.z = intent;
    }

    @Override // defpackage.a55
    public final Status b() {
        if (this.y == 0) {
            return Status.B;
        }
        return Status.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.y);
        z51.l0(parcel, 3, this.z, i);
        z51.t0(parcel, s0);
    }
}
