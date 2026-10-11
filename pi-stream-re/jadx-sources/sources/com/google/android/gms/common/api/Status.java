package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class Status extends c5.a implements s, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2361b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2362c;

    /* renamed from: d, reason: collision with root package name */
    public final PendingIntent f2363d;

    /* renamed from: e, reason: collision with root package name */
    public final b5.a f2364e;

    /* renamed from: f, reason: collision with root package name */
    public static final Status f2356f = new Status(0, null);

    /* renamed from: x, reason: collision with root package name */
    public static final Status f2357x = new Status(14, null);

    /* renamed from: y, reason: collision with root package name */
    public static final Status f2358y = new Status(8, null);

    /* renamed from: z, reason: collision with root package name */
    public static final Status f2359z = new Status(15, null);
    public static final Status A = new Status(16, null);
    public static final Parcelable.Creator<Status> CREATOR = new y(1);

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, b5.a aVar) {
        this.f2360a = i10;
        this.f2361b = i11;
        this.f2362c = str;
        this.f2363d = pendingIntent;
        this.f2364e = aVar;
    }

    public final boolean d() {
        return this.f2361b <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f2360a != status.f2360a || this.f2361b != status.f2361b || !a0.q(this.f2362c, status.f2362c) || !a0.q(this.f2363d, status.f2363d) || !a0.q(this.f2364e, status.f2364e)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2360a), Integer.valueOf(this.f2361b), this.f2362c, this.f2363d, this.f2364e});
    }

    public final String toString() {
        z3.e eVar = new z3.e(this);
        String str = this.f2362c;
        if (str == null) {
            str = a0.D(this.f2361b);
        }
        eVar.f(str, "statusCode");
        eVar.f(this.f2363d, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int t02 = a0.t0(20293, parcel);
        a0.h0(parcel, 1, this.f2361b);
        a0.n0(parcel, 2, this.f2362c, false);
        a0.m0(parcel, 3, this.f2363d, i10, false);
        a0.m0(parcel, 4, this.f2364e, i10, false);
        a0.h0(parcel, 1000, this.f2360a);
        a0.u0(t02, parcel);
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }
}
