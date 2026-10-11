package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class to7 extends y2 {
    public static final Parcelable.Creator<to7> CREATOR = new an7(14);
    public final int x;
    public final String y;
    public final Intent z;

    public to7(int i, String str, Intent intent) {
        this.x = i;
        this.y = str;
        this.z = intent;
    }

    public static to7 c(Activity activity) {
        return new to7(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to7)) {
            return false;
        }
        to7 to7Var = (to7) obj;
        if (this.x == to7Var.x && Objects.equals(this.y, to7Var.y) && Objects.equals(this.z, to7Var.z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(this.x);
        z51.m0(parcel, 2, this.y);
        z51.l0(parcel, 3, this.z, i);
        z51.t0(parcel, s0);
    }
}
