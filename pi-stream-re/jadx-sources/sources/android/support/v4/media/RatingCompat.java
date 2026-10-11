package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f222a;

    /* renamed from: b, reason: collision with root package name */
    public final float f223b;

    public RatingCompat(int i10, float f10) {
        this.f222a = i10;
        this.f223b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f222a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f222a);
        sb.append(" rating=");
        float f10 = this.f223b;
        if (f10 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f10);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f222a);
        parcel.writeFloat(this.f223b);
    }
}
