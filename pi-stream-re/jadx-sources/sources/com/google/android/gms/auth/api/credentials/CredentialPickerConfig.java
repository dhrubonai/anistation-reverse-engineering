package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p7.a0;
import v4.b;

@Deprecated
/* loaded from: classes.dex */
public final class CredentialPickerConfig extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2295a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2296b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2297c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2298d;

    public CredentialPickerConfig(int i10, int i11, boolean z9, boolean z10, boolean z11) {
        this.f2295a = i10;
        this.f2296b = z9;
        this.f2297c = z10;
        if (i10 < 2) {
            this.f2298d = true == z11 ? 3 : 1;
        } else {
            this.f2298d = i11;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        boolean z9 = true;
        a0.d0(parcel, 1, this.f2296b);
        a0.d0(parcel, 2, this.f2297c);
        int i11 = this.f2298d;
        if (i11 != 3) {
            z9 = false;
        }
        a0.d0(parcel, 3, z9);
        a0.h0(parcel, 4, i11);
        a0.h0(parcel, 1000, this.f2295a);
        a0.u0(t02, parcel);
    }
}
