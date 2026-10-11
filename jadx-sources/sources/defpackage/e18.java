package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e18 extends y2 {
    public static final Parcelable.Creator<e18> CREATOR = new aw7((byte) 12);
    public final List x;

    public e18(ArrayList arrayList) {
        this.x = arrayList;
    }

    public static e18 c(cy7... cy7VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(cy7VarArr[0].x));
        return new e18(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.e0(parcel, 1, this.x);
        z51.t0(parcel, s0);
    }
}
