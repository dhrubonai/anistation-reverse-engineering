package u4;

import android.os.Parcel;
import android.os.Parcelable;
import p7.a0;

/* loaded from: classes.dex */
public final class a extends c5.a {
    public static final Parcelable.Creator<a> CREATOR = new q2.b(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f10243a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10244b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10245c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10246d;

    public a(int i10, boolean z9, long j4, boolean z10) {
        this.f10243a = i10;
        this.f10244b = z9;
        this.f10245c = j4;
        this.f10246d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f10243a);
        a0.d0(parcel, 2, this.f10244b);
        a0.k0(parcel, 3, this.f10245c);
        a0.d0(parcel, 4, this.f10246d);
        a0.u0(t02, parcel);
    }
}
