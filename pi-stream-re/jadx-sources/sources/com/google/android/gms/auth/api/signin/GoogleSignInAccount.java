package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c5.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import msr.pistream.app.download.PiStreamDownloadService;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.a0;
import v4.b;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b(24);
    public final List A;
    public final String B;
    public final String C;
    public final HashSet D = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final int f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2324b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2325c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2326d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2327e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f2328f;

    /* renamed from: x, reason: collision with root package name */
    public String f2329x;

    /* renamed from: y, reason: collision with root package name */
    public final long f2330y;

    /* renamed from: z, reason: collision with root package name */
    public final String f2331z;

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2323a = i10;
        this.f2324b = str;
        this.f2325c = str2;
        this.f2326d = str3;
        this.f2327e = str4;
        this.f2328f = uri;
        this.f2329x = str5;
        this.f2330y = j4;
        this.f2331z = str6;
        this.A = arrayList;
        this.B = str7;
        this.C = str8;
    }

    public static GoogleSignInAccount d(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString(PiStreamDownloadService.EXTRA_ID);
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        w7.b.o(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, longValue, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        } else {
            str7 = null;
        }
        googleSignInAccount.f2329x = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f2331z.equals(this.f2331z)) {
            HashSet hashSet = new HashSet(googleSignInAccount.A);
            hashSet.addAll(googleSignInAccount.D);
            HashSet hashSet2 = new HashSet(this.A);
            hashSet2.addAll(this.D);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2331z.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.A);
        hashSet.addAll(this.D);
        return hashSet.hashCode() + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f2323a);
        a0.n0(parcel, 2, this.f2324b, false);
        a0.n0(parcel, 3, this.f2325c, false);
        a0.n0(parcel, 4, this.f2326d, false);
        a0.n0(parcel, 5, this.f2327e, false);
        a0.m0(parcel, 6, this.f2328f, i10, false);
        a0.n0(parcel, 7, this.f2329x, false);
        a0.k0(parcel, 8, this.f2330y);
        a0.n0(parcel, 9, this.f2331z, false);
        a0.s0(parcel, 10, this.A, false);
        a0.n0(parcel, 11, this.B, false);
        a0.n0(parcel, 12, this.C, false);
        a0.u0(t02, parcel);
    }
}
