package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p7.a0;
import v4.b;

/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new b(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f2341a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f2342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2343c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f2342b = googleSignInAccount;
        w7.b.n("8.3 and 8.4 SDKs require non-null email", str);
        this.f2341a = str;
        w7.b.n("8.3 and 8.4 SDKs require non-null userId", str2);
        this.f2343c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 4, this.f2341a, false);
        a0.m0(parcel, 7, this.f2342b, i10, false);
        a0.n0(parcel, 8, this.f2343c, false);
        a0.u0(t02, parcel);
    }
}
