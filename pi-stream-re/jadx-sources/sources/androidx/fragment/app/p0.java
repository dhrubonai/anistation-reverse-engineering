package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new android.support.v4.media.a(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f949b;

    public p0(String str, int i10) {
        this.f948a = str;
        this.f949b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f948a);
        parcel.writeInt(this.f949b);
    }

    public p0(Parcel parcel) {
        this.f948a = parcel.readString();
        this.f949b = parcel.readInt();
    }
}
