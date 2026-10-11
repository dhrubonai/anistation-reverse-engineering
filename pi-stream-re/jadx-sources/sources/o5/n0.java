package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 extends c5.a {
    public static final Parcelable.Creator<n0> CREATOR = new t0(10);

    /* renamed from: a, reason: collision with root package name */
    public final List f8261a;

    public n0(ArrayList arrayList) {
        this.f8261a = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        List list2 = this.f8261a;
        if ((list2 != null || n0Var.f8261a != null) && (list2 == null || (list = n0Var.f8261a) == null || !list2.containsAll(list) || !n0Var.f8261a.containsAll(list2))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f8261a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.s0(parcel, 1, this.f8261a, false);
        p7.a0.u0(t02, parcel);
    }
}
