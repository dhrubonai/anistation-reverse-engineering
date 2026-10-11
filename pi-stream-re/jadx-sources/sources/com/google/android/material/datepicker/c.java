package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new p5.i(13);

    /* renamed from: a, reason: collision with root package name */
    public final p f2709a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2710b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2711c;

    /* renamed from: d, reason: collision with root package name */
    public final p f2712d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2713e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2714f;

    /* renamed from: x, reason: collision with root package name */
    public final int f2715x;

    public c(p pVar, p pVar2, b bVar, p pVar3, int i10) {
        Objects.requireNonNull(pVar, "start cannot be null");
        Objects.requireNonNull(pVar2, "end cannot be null");
        Objects.requireNonNull(bVar, "validator cannot be null");
        this.f2709a = pVar;
        this.f2710b = pVar2;
        this.f2712d = pVar3;
        this.f2713e = i10;
        this.f2711c = bVar;
        Calendar calendar = pVar.f2746a;
        if (pVar3 != null && calendar.compareTo(pVar3.f2746a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (pVar3 != null && pVar3.f2746a.compareTo(pVar2.f2746a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 >= 0 && i10 <= w.d(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i11 = pVar2.f2748c;
                int i12 = pVar.f2748c;
                this.f2715x = (pVar2.f2747b - pVar.f2747b) + ((i11 - i12) * 12) + 1;
                this.f2714f = (i11 - i12) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2709a.equals(cVar.f2709a) && this.f2710b.equals(cVar.f2710b) && f0.b.a(this.f2712d, cVar.f2712d) && this.f2713e == cVar.f2713e && this.f2711c.equals(cVar.f2711c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2709a, this.f2710b, this.f2712d, Integer.valueOf(this.f2713e), this.f2711c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f2709a, 0);
        parcel.writeParcelable(this.f2710b, 0);
        parcel.writeParcelable(this.f2712d, 0);
        parcel.writeParcelable(this.f2711c, 0);
        parcel.writeInt(this.f2713e);
    }
}
