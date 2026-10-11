package o5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum j0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<j0> CREATOR = new t0(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f8247a;

    j0(String str) {
        this.f8247a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8247a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8247a);
    }
}
