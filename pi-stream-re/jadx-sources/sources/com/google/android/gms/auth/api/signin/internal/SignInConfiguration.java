package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p7.a0;
import v4.b;

/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new b(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f2344a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f2345b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        w7.b.o(str);
        this.f2344a = str;
        this.f2345b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f2344a.equals(signInConfiguration.f2344a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f2345b;
            GoogleSignInOptions googleSignInOptions2 = this.f2345b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 1 * 31;
        int i11 = 0;
        String str = this.f2344a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        GoogleSignInOptions googleSignInOptions = this.f2345b;
        if (googleSignInOptions != null) {
            i11 = googleSignInOptions.hashCode();
        }
        return i12 + i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 2, this.f2344a, false);
        a0.m0(parcel, 5, this.f2345b, i10, false);
        a0.u0(t02, parcel);
    }
}
