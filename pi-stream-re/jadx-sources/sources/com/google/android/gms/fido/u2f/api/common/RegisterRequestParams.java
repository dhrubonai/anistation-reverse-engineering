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
import p5.g;
import p5.h;
import p5.i;
import p7.a0;
import w7.b;

@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new i(5);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2614a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f2615b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f2616c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2617d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2618e;

    /* renamed from: f, reason: collision with root package name */
    public final c f2619f;

    /* renamed from: x, reason: collision with root package name */
    public final String f2620x;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, ArrayList arrayList, ArrayList arrayList2, c cVar, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        this.f2614a = num;
        this.f2615b = d10;
        this.f2616c = uri;
        if (arrayList != null && !arrayList.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        b.i("empty list of register requests is provided", z9);
        this.f2617d = arrayList;
        this.f2618e = arrayList2;
        this.f2619f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (uri == null && gVar.f8594d == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            b.i("register request has null appId and no request appId is provided", z11);
            String str2 = gVar.f8594d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            h hVar = (h) it2.next();
            if (uri == null && hVar.f8596b == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            b.i("registered key has null appId and no request appId is provided", z10);
            String str3 = hVar.f8596b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        b.i("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f2620x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (a0.q(this.f2614a, registerRequestParams.f2614a) && a0.q(this.f2615b, registerRequestParams.f2615b) && a0.q(this.f2616c, registerRequestParams.f2616c) && a0.q(this.f2617d, registerRequestParams.f2617d)) {
            List list = this.f2618e;
            List list2 = registerRequestParams.f2618e;
            if (((list == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && a0.q(this.f2619f, registerRequestParams.f2619f) && a0.q(this.f2620x, registerRequestParams.f2620x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2614a, this.f2616c, this.f2615b, this.f2617d, this.f2618e, this.f2619f, this.f2620x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.j0(parcel, 2, this.f2614a);
        a0.g0(parcel, 3, this.f2615b);
        a0.m0(parcel, 4, this.f2616c, i10, false);
        a0.s0(parcel, 5, this.f2617d, false);
        a0.s0(parcel, 6, this.f2618e, false);
        a0.m0(parcel, 7, this.f2619f, i10, false);
        a0.n0(parcel, 8, this.f2620x, false);
        a0.u0(t02, parcel);
    }
}
