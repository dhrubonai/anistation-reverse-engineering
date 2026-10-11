package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c5.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;
import p7.a0;
import v4.b;

/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new b(14);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f2317a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2318b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2319c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2320d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2321e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2322f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f2317a = pendingIntent;
        this.f2318b = str;
        this.f2319c = str2;
        this.f2320d = list;
        this.f2321e = str3;
        this.f2322f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.f2320d;
        if (list.size() != saveAccountLinkingTokenRequest.f2320d.size() || !list.containsAll(saveAccountLinkingTokenRequest.f2320d) || !a0.q(this.f2317a, saveAccountLinkingTokenRequest.f2317a) || !a0.q(this.f2318b, saveAccountLinkingTokenRequest.f2318b) || !a0.q(this.f2319c, saveAccountLinkingTokenRequest.f2319c) || !a0.q(this.f2321e, saveAccountLinkingTokenRequest.f2321e) || this.f2322f != saveAccountLinkingTokenRequest.f2322f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2317a, this.f2318b, this.f2319c, this.f2320d, this.f2321e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.m0(parcel, 1, this.f2317a, i10, false);
        a0.n0(parcel, 2, this.f2318b, false);
        a0.n0(parcel, 3, this.f2319c, false);
        a0.p0(parcel, 4, this.f2320d);
        a0.n0(parcel, 5, this.f2321e, false);
        a0.h0(parcel, 6, this.f2322f);
        a0.u0(t02, parcel);
    }
}
