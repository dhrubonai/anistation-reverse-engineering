package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class b0 extends c5.a {
    public static final Parcelable.Creator<b0> CREATOR = new com.google.android.gms.common.api.y(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f2498a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f2499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2500c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f2501d;

    public b0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f2498a = i10;
        this.f2499b = account;
        this.f2500c = i11;
        this.f2501d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = p7.a0.t0(20293, parcel);
        p7.a0.h0(parcel, 1, this.f2498a);
        p7.a0.m0(parcel, 2, this.f2499b, i10, false);
        p7.a0.h0(parcel, 3, this.f2500c);
        p7.a0.m0(parcel, 4, this.f2501d, i10, false);
        p7.a0.u0(t02, parcel);
    }
}
