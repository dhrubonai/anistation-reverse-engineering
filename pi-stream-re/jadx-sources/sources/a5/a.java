package a5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a {
    public static final Parcelable.Creator<a> CREATOR = new v4.b(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f91a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f93c;

    public a(int i10, int i11, Bundle bundle) {
        this.f91a = i10;
        this.f92b = i11;
        this.f93c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f91a);
        a0.h0(parcel, 2, this.f92b);
        a0.e0(parcel, 3, this.f93c, false);
        a0.u0(t02, parcel);
    }
}
