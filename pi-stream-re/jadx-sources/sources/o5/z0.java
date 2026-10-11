package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class z0 extends c5.a {
    public static final Parcelable.Creator<z0> CREATOR = new t0(26);

    /* renamed from: a, reason: collision with root package name */
    public final List f8310a;

    public z0(ArrayList arrayList) {
        w7.b.s(arrayList);
        this.f8310a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        List list = z0Var.f8310a;
        List list2 = this.f8310a;
        if (!list2.containsAll(list) || !z0Var.f8310a.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f8310a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.s0(parcel, 1, this.f8310a, false);
        p7.a0.u0(t02, parcel);
    }
}
