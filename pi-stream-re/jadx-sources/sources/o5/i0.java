package o5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum i0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<i0> CREATOR = new t0(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f8241a;

    i0(String str) {
        this.f8241a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8241a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8241a);
    }
}
