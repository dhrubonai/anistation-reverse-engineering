package o5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<c> CREATOR = new com.google.android.gms.common.api.y(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f8207a;

    c(String str) {
        this.f8207a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8207a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8207a);
    }
}
