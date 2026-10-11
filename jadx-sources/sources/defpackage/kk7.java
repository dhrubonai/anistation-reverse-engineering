package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kk7 extends y2 {
    public static final Parcelable.Creator<kk7> CREATOR = new c55(22);
    public final dk7 x;
    public final dk7 y;

    public kk7(dk7 dk7Var, dk7 dk7Var2) {
        this.x = dk7Var;
        this.y = dk7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk7)) {
            return false;
        }
        kk7 kk7Var = (kk7) obj;
        if (qi0.c(this.x, kk7Var.x) && qi0.c(this.y, kk7Var.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.l0(parcel, 2, this.x, i);
        z51.l0(parcel, 3, this.y, i);
        z51.t0(parcel, s0);
    }
}
