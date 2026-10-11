package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c5.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p7.a0;
import v4.b;

@Deprecated
/* loaded from: classes.dex */
public final class IdToken extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f2307a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2308b;

    public IdToken(String str, String str2) {
        w7.b.i("account type string cannot be null or empty", !TextUtils.isEmpty(str));
        w7.b.i("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
        this.f2307a = str;
        this.f2308b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (a0.q(this.f2307a, idToken.f2307a) && a0.q(this.f2308b, idToken.f2308b)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.f2307a, false);
        a0.n0(parcel, 2, this.f2308b, false);
        a0.u0(t02, parcel);
    }
}
