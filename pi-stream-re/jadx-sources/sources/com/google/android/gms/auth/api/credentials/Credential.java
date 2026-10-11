package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c5.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p7.a0;
import q2.b;

@Deprecated
/* loaded from: classes.dex */
public class Credential extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new b(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f2287a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2288b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f2289c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2290d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2291e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2292f;

    /* renamed from: x, reason: collision with root package name */
    public final String f2293x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2294y;

    public Credential(String str, String str2, Uri uri, ArrayList arrayList, String str3, String str4, String str5, String str6) {
        List unmodifiableList;
        Boolean bool;
        boolean z9;
        if (str != null) {
            String trim = str.trim();
            w7.b.n("credential identifier cannot be empty", trim);
            if (str3 != null && TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("Password must not be empty if set");
            }
            if (str4 != null) {
                if (TextUtils.isEmpty(str4)) {
                    bool = Boolean.FALSE;
                } else {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority())) {
                        if (!"http".equalsIgnoreCase(parse.getScheme()) && !"https".equalsIgnoreCase(parse.getScheme())) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        bool = Boolean.valueOf(z9);
                    } else {
                        bool = Boolean.FALSE;
                    }
                }
                if (!bool.booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
            }
            if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                str2 = null;
            }
            this.f2288b = str2;
            this.f2289c = uri;
            if (arrayList == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            this.f2290d = unmodifiableList;
            this.f2287a = trim;
            this.f2291e = str3;
            this.f2292f = str4;
            this.f2293x = str5;
            this.f2294y = str6;
            return;
        }
        throw new NullPointerException("credential identifier cannot be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (TextUtils.equals(this.f2287a, credential.f2287a) && TextUtils.equals(this.f2288b, credential.f2288b) && a0.q(this.f2289c, credential.f2289c) && TextUtils.equals(this.f2291e, credential.f2291e) && TextUtils.equals(this.f2292f, credential.f2292f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2287a, this.f2288b, this.f2289c, this.f2291e, this.f2292f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.n0(parcel, 1, this.f2287a, false);
        a0.n0(parcel, 2, this.f2288b, false);
        a0.m0(parcel, 3, this.f2289c, i10, false);
        a0.s0(parcel, 4, this.f2290d, false);
        a0.n0(parcel, 5, this.f2291e, false);
        a0.n0(parcel, 6, this.f2292f, false);
        a0.n0(parcel, 9, this.f2293x, false);
        a0.n0(parcel, 10, this.f2294y, false);
        a0.u0(t02, parcel);
    }
}
