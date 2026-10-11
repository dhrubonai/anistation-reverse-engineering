package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new p5.i(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f2853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2855c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2856d;

    public g(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f2854b = readInt;
        this.f2855c = readInt2;
        this.f2856d = readInt3;
        this.f2853a = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f2854b == gVar.f2854b && this.f2855c == gVar.f2855c && this.f2853a == gVar.f2853a && this.f2856d == gVar.f2856d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2853a), Integer.valueOf(this.f2854b), Integer.valueOf(this.f2855c), Integer.valueOf(this.f2856d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2854b);
        parcel.writeInt(this.f2855c);
        parcel.writeInt(this.f2856d);
        parcel.writeInt(this.f2853a);
    }
}
