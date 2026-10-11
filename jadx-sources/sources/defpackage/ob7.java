package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ob7 extends y2 implements a55 {
    public static final Parcelable.Creator<ob7> CREATOR = new c55(6);
    public final List x;
    public final String y;

    public ob7(String str, ArrayList arrayList) {
        this.x = arrayList;
        this.y = str;
    }

    @Override // defpackage.a55
    public final Status b() {
        if (this.y != null) {
            return Status.B;
        }
        return Status.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.n0(parcel, 1, this.x);
        z51.m0(parcel, 2, this.y);
        z51.t0(parcel, s0);
    }
}
