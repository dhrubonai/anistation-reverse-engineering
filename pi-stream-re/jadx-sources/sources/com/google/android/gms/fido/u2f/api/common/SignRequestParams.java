package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p5.c;
import p5.h;
import p5.i;
import p7.a0;
import w7.b;

@Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new i(7);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2621a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f2622b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f2623c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2624d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2625e;

    /* renamed from: f, reason: collision with root package name */
    public final c f2626f;

    /* renamed from: x, reason: collision with root package name */
    public final String f2627x;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, ArrayList arrayList, c cVar, String str) {
        boolean z9;
        boolean z10;
        this.f2621a = num;
        this.f2622b = d10;
        this.f2623c = uri;
        this.f2624d = bArr;
        if (arrayList != null && !arrayList.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        b.i("registeredKeys must not be null or empty", z9);
        this.f2625e = arrayList;
        this.f2626f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.f8596b == null && uri == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            b.i("registered key has null appId and no request appId is provided", z10);
            String str2 = hVar.f8596b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        b.i("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f2627x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (a0.q(this.f2621a, signRequestParams.f2621a) && a0.q(this.f2622b, signRequestParams.f2622b) && a0.q(this.f2623c, signRequestParams.f2623c) && Arrays.equals(this.f2624d, signRequestParams.f2624d)) {
            List list = this.f2625e;
            List list2 = signRequestParams.f2625e;
            if (list.containsAll(list2) && list2.containsAll(list) && a0.q(this.f2626f, signRequestParams.f2626f) && a0.q(this.f2627x, signRequestParams.f2627x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2621a, this.f2623c, this.f2622b, this.f2625e, this.f2626f, this.f2627x, Integer.valueOf(Arrays.hashCode(this.f2624d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.j0(parcel, 2, this.f2621a);
        a0.g0(parcel, 3, this.f2622b);
        a0.m0(parcel, 4, this.f2623c, i10, false);
        a0.f0(parcel, 5, this.f2624d, false);
        a0.s0(parcel, 6, this.f2625e, false);
        a0.m0(parcel, 7, this.f2626f, i10, false);
        a0.n0(parcel, 8, this.f2627x, false);
        a0.u0(t02, parcel);
    }
}
