package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;
import p7.a0;
import v4.b;

/* loaded from: classes.dex */
public class AuthorizationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final List f2309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2310b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2311c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2312d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f2313e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2314f;

    /* renamed from: x, reason: collision with root package name */
    public final String f2315x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2316y;

    public AuthorizationRequest(List list, String str, boolean z9, boolean z10, Account account, String str2, String str3, boolean z11) {
        boolean z12;
        if (list != null && !list.isEmpty()) {
            z12 = true;
        } else {
            z12 = false;
        }
        w7.b.i("requestedScopes cannot be null or empty", z12);
        this.f2309a = list;
        this.f2310b = str;
        this.f2311c = z9;
        this.f2312d = z10;
        this.f2313e = account;
        this.f2314f = str2;
        this.f2315x = str3;
        this.f2316y = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f2309a;
        if (list.size() != authorizationRequest.f2309a.size() || !list.containsAll(authorizationRequest.f2309a) || this.f2311c != authorizationRequest.f2311c || this.f2316y != authorizationRequest.f2316y || this.f2312d != authorizationRequest.f2312d || !a0.q(this.f2310b, authorizationRequest.f2310b) || !a0.q(this.f2313e, authorizationRequest.f2313e) || !a0.q(this.f2314f, authorizationRequest.f2314f) || !a0.q(this.f2315x, authorizationRequest.f2315x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2309a, this.f2310b, Boolean.valueOf(this.f2311c), Boolean.valueOf(this.f2316y), Boolean.valueOf(this.f2312d), this.f2313e, this.f2314f, this.f2315x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.s0(parcel, 1, this.f2309a, false);
        a0.n0(parcel, 2, this.f2310b, false);
        a0.d0(parcel, 3, this.f2311c);
        a0.d0(parcel, 4, this.f2312d);
        a0.m0(parcel, 5, this.f2313e, i10, false);
        a0.n0(parcel, 6, this.f2314f, false);
        a0.n0(parcel, 7, this.f2315x, false);
        a0.d0(parcel, 8, this.f2316y);
        a0.u0(t02, parcel);
    }
}
