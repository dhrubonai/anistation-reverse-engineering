package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p7.a0;
import v4.b;

@Deprecated
/* loaded from: classes.dex */
public final class HintRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f2299a;

    /* renamed from: b, reason: collision with root package name */
    public final CredentialPickerConfig f2300b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2301c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2302d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f2303e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2304f;

    /* renamed from: x, reason: collision with root package name */
    public final String f2305x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2306y;

    public HintRequest(int i10, CredentialPickerConfig credentialPickerConfig, boolean z9, boolean z10, String[] strArr, boolean z11, String str, String str2) {
        this.f2299a = i10;
        w7.b.s(credentialPickerConfig);
        this.f2300b = credentialPickerConfig;
        this.f2301c = z9;
        this.f2302d = z10;
        w7.b.s(strArr);
        this.f2303e = strArr;
        if (i10 < 2) {
            this.f2304f = true;
            this.f2305x = null;
            this.f2306y = null;
        } else {
            this.f2304f = z11;
            this.f2305x = str;
            this.f2306y = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 1, this.f2300b, i10, false);
        a0.d0(parcel, 2, this.f2301c);
        a0.d0(parcel, 3, this.f2302d);
        a0.o0(parcel, 4, this.f2303e, false);
        a0.d0(parcel, 5, this.f2304f);
        a0.n0(parcel, 6, this.f2305x, false);
        a0.n0(parcel, 7, this.f2306y, false);
        a0.h0(parcel, 1000, this.f2299a);
        a0.u0(t02, parcel);
    }
}
