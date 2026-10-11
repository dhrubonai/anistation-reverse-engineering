package g5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.y;
import p7.a0;

/* loaded from: classes.dex */
public final class h extends c5.a {
    public static final Parcelable.Creator<h> CREATOR = new y(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f4455a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4456b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4457c;

    public h(a aVar, String str, int i10) {
        this.f4455a = i10;
        this.f4456b = str;
        this.f4457c = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f4455a);
        a0.n0(parcel, 2, this.f4456b, false);
        a0.m0(parcel, 3, this.f4457c, i10, false);
        a0.u0(t02, parcel);
    }

    public h(a aVar, String str) {
        this.f4455a = 1;
        this.f4456b = str;
        this.f4457c = aVar;
    }
}
