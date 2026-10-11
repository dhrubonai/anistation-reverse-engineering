package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ew7 extends y2 {
    public static final Parcelable.Creator<ew7> CREATOR = new aw7((byte) 2);
    public final List x;

    public ew7(ArrayList arrayList) {
        this.x = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew7)) {
            return false;
        }
        return this.x.equals(((ew7) obj).x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (bw7 bw7Var : this.x) {
            if (!z) {
                sb.append(", ");
            }
            bw7Var.c(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.p0(parcel, 2, this.x);
        z51.t0(parcel, s0);
    }
}
