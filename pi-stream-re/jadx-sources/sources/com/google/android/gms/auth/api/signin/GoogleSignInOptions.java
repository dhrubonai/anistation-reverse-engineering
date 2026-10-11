package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c5.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.a0;
import u.f;
import v4.b;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends a implements e, ReflectedParcelable {
    public static final GoogleSignInOptions B;
    public static final Scope C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final Scope D;
    public static final Scope E;
    public static final Scope F;
    public static final f G;
    public final String A;

    /* renamed from: a, reason: collision with root package name */
    public final int f2332a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2333b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f2334c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2335d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2336e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2337f;

    /* renamed from: x, reason: collision with root package name */
    public final String f2338x;

    /* renamed from: y, reason: collision with root package name */
    public final String f2339y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f2340z;

    static {
        Scope scope = new Scope(1, "profile");
        C = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        D = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        E = scope3;
        F = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(F)) {
            Scope scope4 = E;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        B = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(F)) {
            Scope scope5 = E;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new b(25);
        G = new f(2);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z9, boolean z10, boolean z11, String str, String str2, Map map, String str3) {
        this.f2332a = i10;
        this.f2333b = arrayList;
        this.f2334c = account;
        this.f2335d = z9;
        this.f2336e = z10;
        this.f2337f = z11;
        this.f2338x = str;
        this.f2339y = str2;
        this.f2340z = new ArrayList(map.values());
        this.A = str3;
    }

    public static GoogleSignInOptions d(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z9 = jSONObject.getBoolean("idTokenRequested");
        boolean z10 = jSONObject.getBoolean("serverAuthRequested");
        boolean z11 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z9, z10, z11, str3, str4, new HashMap(), null);
    }

    public static HashMap e(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList == null) {
            return hashMap;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a5.a aVar = (a5.a) it.next();
            hashMap.put(Integer.valueOf(aVar.f92b), aVar);
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.f2338x;
        ArrayList arrayList = this.f2333b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f2340z.size() <= 0) {
                ArrayList arrayList2 = googleSignInOptions.f2340z;
                ArrayList arrayList3 = googleSignInOptions.f2333b;
                if (arrayList2.size() <= 0 && arrayList.size() == new ArrayList(arrayList3).size() && arrayList.containsAll(new ArrayList(arrayList3))) {
                    Account account = this.f2334c;
                    Account account2 = googleSignInOptions.f2334c;
                    if (account != null ? account.equals(account2) : account2 == null) {
                        boolean isEmpty = TextUtils.isEmpty(str);
                        String str2 = googleSignInOptions.f2338x;
                        if (isEmpty) {
                            if (TextUtils.isEmpty(str2)) {
                            }
                        } else if (!str.equals(str2)) {
                        }
                        if (this.f2337f == googleSignInOptions.f2337f && this.f2335d == googleSignInOptions.f2335d && this.f2336e == googleSignInOptions.f2336e) {
                            if (TextUtils.equals(this.A, googleSignInOptions.A)) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f2333b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((Scope) arrayList2.get(i11)).f2355b);
        }
        Collections.sort(arrayList);
        int hashCode3 = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f2334c;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        int i12 = (hashCode3 + hashCode) * 31;
        String str = this.f2338x;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (((((((i12 + hashCode2) * 31) + (this.f2337f ? 1 : 0)) * 31) + (this.f2335d ? 1 : 0)) * 31) + (this.f2336e ? 1 : 0)) * 31;
        String str2 = this.A;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i13 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f2332a);
        a0.s0(parcel, 2, new ArrayList(this.f2333b), false);
        a0.m0(parcel, 3, this.f2334c, i10, false);
        a0.d0(parcel, 4, this.f2335d);
        a0.d0(parcel, 5, this.f2336e);
        a0.d0(parcel, 6, this.f2337f);
        a0.n0(parcel, 7, this.f2338x, false);
        a0.n0(parcel, 8, this.f2339y, false);
        a0.s0(parcel, 9, this.f2340z, false);
        a0.n0(parcel, 10, this.A, false);
        a0.u0(t02, parcel);
    }
}
