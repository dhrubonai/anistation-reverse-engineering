package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fc7 extends y2 {
    public static final Parcelable.Creator<fc7> CREATOR = new c55(24);
    public final String x;

    public fc7(String str) {
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc7)) {
            return false;
        }
        return qi0.c(this.x, ((fc7) obj).x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.t0(parcel, s0);
    }
}
