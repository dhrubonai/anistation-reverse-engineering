package a8;

import android.os.Parcel;
import android.os.Parcelable;
import p5.i;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new i(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f183a;

    /* renamed from: b, reason: collision with root package name */
    public final String f184b;

    /* renamed from: c, reason: collision with root package name */
    public final String f185c;

    /* renamed from: d, reason: collision with root package name */
    public final float f186d;

    /* renamed from: e, reason: collision with root package name */
    public String f187e;

    /* renamed from: f, reason: collision with root package name */
    public String f188f;

    /* renamed from: x, reason: collision with root package name */
    public final String f189x;

    /* renamed from: y, reason: collision with root package name */
    public final String f190y;

    public e(String str, String str2, String str3, float f10) {
        this.f183a = str;
        this.f184b = str2;
        this.f185c = str3;
        this.f186d = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f183a);
        parcel.writeString(this.f184b);
        parcel.writeString(this.f185c);
        parcel.writeFloat(this.f186d);
        parcel.writeString(this.f187e);
        parcel.writeString(this.f188f);
        parcel.writeString(this.f189x);
        parcel.writeString(this.f190y);
    }

    public e(Parcel parcel) {
        this.f183a = parcel.readString();
        this.f184b = parcel.readString();
        this.f185c = parcel.readString();
        this.f186d = parcel.readFloat();
        this.f187e = parcel.readString();
        this.f188f = parcel.readString();
        this.f189x = parcel.readString();
        this.f190y = parcel.readString();
    }
}
