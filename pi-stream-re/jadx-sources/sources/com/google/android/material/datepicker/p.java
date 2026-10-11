package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p implements Comparable, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new p5.i(15);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f2746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2747b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2748c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2749d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2750e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2751f;

    /* renamed from: x, reason: collision with root package name */
    public String f2752x;

    public p(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = w.b(calendar);
        this.f2746a = b10;
        this.f2747b = b10.get(2);
        this.f2748c = b10.get(1);
        this.f2749d = b10.getMaximum(7);
        this.f2750e = b10.getActualMaximum(5);
        this.f2751f = b10.getTimeInMillis();
    }

    public static p d(int i10, int i11) {
        Calendar d10 = w.d(null);
        d10.set(1, i10);
        d10.set(2, i11);
        return new p(d10);
    }

    public static p e(long j4) {
        Calendar d10 = w.d(null);
        d10.setTimeInMillis(j4);
        return new p(d10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2746a.compareTo(((p) obj).f2746a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f2747b == pVar.f2747b && this.f2748c == pVar.f2748c) {
            return true;
        }
        return false;
    }

    public final String f() {
        String formatDateTime;
        if (this.f2752x == null) {
            long timeInMillis = this.f2746a.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                formatDateTime = w.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
            } else {
                formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f2752x = formatDateTime;
        }
        return this.f2752x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2747b), Integer.valueOf(this.f2748c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2748c);
        parcel.writeInt(this.f2747b);
    }
}
