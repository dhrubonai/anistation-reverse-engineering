package p5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum f implements Parcelable {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    V1("U2F_V1"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("U2F_V2");

    public static final Parcelable.Creator<f> CREATOR = new i(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f8590a;

    f(String str) {
        this.f8590a = str;
    }

    public static f d(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (f fVar : values()) {
            if (str.equals(fVar.f8590a)) {
                return fVar;
            }
        }
        throw new e(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8590a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8590a);
    }
}
