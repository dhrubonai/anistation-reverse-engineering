package o5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum e implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<e> CREATOR = new t0(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f8212a;

    e(String str) {
        this.f8212a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8212a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8212a);
    }
}
