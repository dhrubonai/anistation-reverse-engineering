package y4;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p7.a0;

/* loaded from: classes.dex */
public final class b extends c5.a {
    public static final Parcelable.Creator<b> CREATOR = new v4.b(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f11625a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f11626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11627c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11628d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11629e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f11630f;

    public b(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f11629e = i10;
        this.f11625a = i11;
        this.f11627c = i12;
        this.f11630f = bundle;
        this.f11628d = bArr;
        this.f11626b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f11625a);
        a0.m0(parcel, 2, this.f11626b, i10, false);
        a0.h0(parcel, 3, this.f11627c);
        a0.e0(parcel, 4, this.f11630f, false);
        a0.f0(parcel, 5, this.f11628d, false);
        a0.h0(parcel, 1000, this.f11629e);
        a0.u0(t02, parcel);
    }
}
