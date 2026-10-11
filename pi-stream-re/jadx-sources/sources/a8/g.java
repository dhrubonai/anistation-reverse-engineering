package a8;

import android.os.Parcel;
import android.os.Parcelable;
import p5.i;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new i(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f195a;

    /* renamed from: b, reason: collision with root package name */
    public final String f196b;

    /* renamed from: c, reason: collision with root package name */
    public final String f197c;

    public g(String str, String str2, String str3) {
        this.f195a = str;
        this.f196b = str2;
        this.f197c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f195a);
        parcel.writeString(this.f196b);
        parcel.writeString(this.f197c);
    }

    public g(Parcel parcel) {
        this.f195a = parcel.readString();
        this.f196b = parcel.readString();
        this.f197c = parcel.readString();
    }
}
