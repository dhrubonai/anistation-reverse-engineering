package r4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p7.a0;

/* loaded from: classes.dex */
public final class c extends c5.a {
    public static final Parcelable.Creator<c> CREATOR = new v4.b(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f9411a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9412b;

    public c(int i10, ArrayList arrayList) {
        this.f9411a = i10;
        w7.b.s(arrayList);
        this.f9412b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f9411a);
        a0.s0(parcel, 2, this.f9412b, false);
        a0.u0(t02, parcel);
    }
}
