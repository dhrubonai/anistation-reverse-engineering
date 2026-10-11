package f5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.y;
import p7.a0;

/* loaded from: classes.dex */
public final class b extends c5.a {
    public static final Parcelable.Creator<b> CREATOR = new y(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f3926a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3927b;

    public b(int i10, a aVar) {
        this.f3926a = i10;
        this.f3927b = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f3926a);
        a0.m0(parcel, 2, this.f3927b, i10, false);
        a0.u0(t02, parcel);
    }

    public b(a aVar) {
        this.f3926a = 1;
        this.f3927b = aVar;
    }
}
