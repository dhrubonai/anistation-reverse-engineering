package f5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.y;
import p7.a0;

/* loaded from: classes.dex */
public final class c extends c5.a {
    public static final Parcelable.Creator<c> CREATOR = new y(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f3928a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3929b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3930c;

    public c(int i10, String str, int i11) {
        this.f3928a = i10;
        this.f3929b = str;
        this.f3930c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f3928a);
        a0.n0(parcel, 2, this.f3929b, false);
        a0.h0(parcel, 3, this.f3930c);
        a0.u0(t02, parcel);
    }

    public c(String str, int i10) {
        this.f3928a = 1;
        this.f3929b = str;
        this.f3930c = i10;
    }
}
