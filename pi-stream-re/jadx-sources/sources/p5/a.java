package p5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum a implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    ABSENT(0),
    STRING(1),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(2);

    public static final Parcelable.Creator<a> CREATOR = new i(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f8580a;

    a(int i10) {
        this.f8580a = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8580a);
    }
}
